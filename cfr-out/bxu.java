/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bxu {
    static final Logger a = LogUtils.getLogger();
    private static final int b = 4096;
    private static final String c = ".gz";
    private final Path d;
    private final String e;

    private bxu(Path $$0, String $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static bxu a(Path $$0, String $$1) throws IOException {
        Files.createDirectories($$0, new FileAttribute[0]);
        return new bxu($$0, $$1);
    }

    public d a() throws IOException {
        try (Stream<Path> $$02 = Files.list(this.d);){
            d d2 = new d($$02.filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])).map(this::a).filter(Objects::nonNull).toList());
            return d2;
        }
    }

    private @Nullable b a(Path $$0) {
        String $$1 = $$0.getFileName().toString();
        int $$2 = $$1.indexOf(46);
        if ($$2 == -1) {
            return null;
        }
        c $$3 = bxu$c.a($$1.substring(0, $$2));
        if ($$3 != null) {
            String $$4 = $$1.substring($$2);
            if ($$4.equals(this.e)) {
                return new e($$0, $$3);
            }
            if ($$4.equals(this.e + c)) {
                return new a($$0, $$3);
            }
        }
        return null;
    }

    static void a(Path $$0, Path $$1) throws IOException {
        if (Files.exists($$1, new LinkOption[0])) {
            throw new IOException("Compressed target file already exists: " + String.valueOf($$1));
        }
        try (FileChannel $$2 = FileChannel.open($$0, StandardOpenOption.WRITE, StandardOpenOption.READ);){
            FileLock $$3 = $$2.tryLock();
            if ($$3 == null) {
                throw new IOException("Raw log file is already locked, cannot compress: " + String.valueOf($$0));
            }
            bxu.a($$2, $$1);
            $$2.truncate(0L);
        }
        Files.delete($$0);
    }

    private static void a(ReadableByteChannel $$0, Path $$1) throws IOException {
        try (GZIPOutputStream $$2 = new GZIPOutputStream(Files.newOutputStream($$1, new OpenOption[0]));){
            byte[] $$3 = new byte[4096];
            ByteBuffer $$4 = ByteBuffer.wrap($$3);
            while ($$0.read($$4) >= 0) {
                $$4.flip();
                ((OutputStream)$$2).write($$3, 0, $$4.limit());
                $$4.clear();
            }
        }
    }

    public e a(LocalDate $$0) throws IOException {
        c $$3;
        int $$1 = 1;
        Set<c> $$2 = this.a().c();
        while ($$2.contains($$3 = new c($$0, $$1++))) {
        }
        e $$4 = new e(this.d.resolve($$3.b(this.e)), $$3);
        Files.createFile($$4.c(), new FileAttribute[0]);
        return $$4;
    }

    public static class d
    implements Iterable<b> {
        private final List<b> a;

        d(List<b> $$0) {
            this.a = new ArrayList<b>($$0);
        }

        public d a(LocalDate $$0, int $$1) {
            this.a.removeIf($$2 -> {
                c $$3 = $$2.d();
                LocalDate $$4 = $$3.a().plusDays($$1);
                if (!$$0.isBefore($$4)) {
                    try {
                        Files.delete($$2.c());
                        return true;
                    }
                    catch (IOException $$5) {
                        a.warn("Failed to delete expired event log file: {}", (Object)$$2.c(), (Object)$$5);
                    }
                }
                return false;
            });
            return this;
        }

        public d a() {
            ListIterator<b> $$0 = this.a.listIterator();
            while ($$0.hasNext()) {
                b $$1 = $$0.next();
                try {
                    $$0.set($$1.b());
                }
                catch (IOException $$2) {
                    a.warn("Failed to compress event log file: {}", (Object)$$1.c(), (Object)$$2);
                }
            }
            return this;
        }

        @Override
        public Iterator<b> iterator() {
            return this.a.iterator();
        }

        public Stream<b> b() {
            return this.a.stream();
        }

        public Set<c> c() {
            return this.a.stream().map(b::d).collect(Collectors.toSet());
        }
    }

    public record c(LocalDate a, int b) {
        private static final DateTimeFormatter c = DateTimeFormatter.BASIC_ISO_DATE;

        public static @Nullable c a(String $$0) {
            int $$1 = $$0.indexOf("-");
            if ($$1 == -1) {
                return null;
            }
            String $$2 = $$0.substring(0, $$1);
            String $$3 = $$0.substring($$1 + 1);
            try {
                return new c(LocalDate.parse($$2, c), Integer.parseInt($$3));
            }
            catch (NumberFormatException | DateTimeParseException $$4) {
                return null;
            }
        }

        @Override
        public String toString() {
            return c.format(this.a) + "-" + this.b;
        }

        public String b(String $$0) {
            return String.valueOf(this) + $$0;
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "date;index", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "date;index", "a", "b"}, this, $$0);
        }
    }

    public record e(Path a, c b) implements b
    {
        private final Path a;
        private final c b;

        public FileChannel e() throws IOException {
            return FileChannel.open(this.a, StandardOpenOption.WRITE, StandardOpenOption.READ);
        }

        @Override
        public @Nullable Reader a() throws IOException {
            return Files.exists(this.a, new LinkOption[0]) ? Files.newBufferedReader(this.a) : null;
        }

        @Override
        public a b() throws IOException {
            Path $$0 = this.a.resolveSibling(this.a.getFileName().toString() + bxu.c);
            bxu.a(this.a, $$0);
            return new a($$0, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "path;id", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "path;id", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "path;id", "a", "b"}, this, $$0);
        }

        @Override
        public Path c() {
            return this.a;
        }

        @Override
        public c d() {
            return this.b;
        }
    }

    public record a(Path a, c b) implements b
    {
        private final Path a;
        private final c b;

        @Override
        public @Nullable Reader a() throws IOException {
            if (!Files.exists(this.a, new LinkOption[0])) {
                return null;
            }
            return new BufferedReader(new InputStreamReader((InputStream)new GZIPInputStream(Files.newInputStream(this.a, new OpenOption[0])), StandardCharsets.UTF_8));
        }

        @Override
        public a b() {
            return this;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "path;id", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "path;id", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "path;id", "a", "b"}, this, $$0);
        }

        @Override
        public Path c() {
            return this.a;
        }

        @Override
        public c d() {
            return this.b;
        }
    }

    public static interface b {
        public Path c();

        public c d();

        public @Nullable Reader a() throws IOException;

        public a b() throws IOException;
    }
}

