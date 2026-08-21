/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fni {
    static final Logger c = LogUtils.getLogger();
    public static final String a = "Data";
    private static final PathMatcher d = $$0 -> false;
    public static final String b = "allowed_symlinks.txt";
    private static final int e = 0x4000000;
    private final Path f;
    private final Path g;
    final DataFixer h;
    private final ftc i;

    public fni(Path $$0, Path $$1, ftc $$2, DataFixer $$3) {
        this.h = $$3;
        try {
            bfp.c($$0);
        }
        catch (IOException $$4) {
            throw new UncheckedIOException($$4);
        }
        this.f = $$0;
        this.g = $$1;
        this.i = $$2;
    }

    public static ftc a(Path $$0) {
        if (Files.exists($$0, new LinkOption[0])) {
            ftc ftc2;
            block9: {
                BufferedReader $$1 = Files.newBufferedReader($$0);
                try {
                    ftc2 = new ftc(fte.a($$1));
                    if ($$1 == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if ($$1 != null) {
                            try {
                                $$1.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (Exception $$2) {
                        c.error("Failed to parse {}, disallowing all symbolic links", (Object)b, (Object)$$2);
                    }
                }
                $$1.close();
            }
            return ftc2;
        }
        return new ftc(d);
    }

    public static fni b(Path $$0) {
        ftc $$1 = fni.a($$0.resolve(b));
        return new fni($$0, $$0.resolve("../backups"), $$1, bia.a());
    }

    public static dxm a(Dynamic<?> $$0) {
        return dxm.c.parse($$0).resultOrPartial(arg_0 -> ((Logger)c).error(arg_0)).orElse(dxm.d);
    }

    public static anr.d a(Dynamic<?> $$0, bak $$1, boolean $$2) {
        return new anr.d($$1, fni.a($$0), $$2, false);
    }

    public static fnf a(Dynamic<?> $$0, dxm $$1, jq<esi> $$2, jf.a $$3) {
        Dynamic<?> $$4 = ams.a($$0, $$3);
        Dynamic $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
        evm $$6 = (evm)evm.a.parse($$5).getOrThrow();
        dws $$7 = dws.a($$4, $$1);
        evl.b $$8 = $$6.b().a($$2);
        Lifecycle $$9 = $$8.a().add($$3.d());
        fnm $$10 = fnm.a($$4, $$7, $$8.d(), $$6.a(), $$9);
        return new fnf($$10, $$8);
    }

    public String a() {
        return "Anvil";
    }

    public a b() throws fnh {
        a a2;
        block9: {
            if (!Files.isDirectory(this.f, new LinkOption[0])) {
                throw new fnh(yh.c("selectWorld.load_folder_access"));
            }
            Stream<Path> $$02 = Files.list(this.f);
            try {
                List<b> $$1 = $$02.filter($$0 -> Files.isDirectory($$0, new LinkOption[0])).map(b::new).filter($$0 -> Files.isRegularFile($$0.b(), new LinkOption[0]) || Files.isRegularFile($$0.c(), new LinkOption[0])).toList();
                a2 = new a($$1);
                if ($$02 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$02 != null) {
                        try {
                            $$02.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$2) {
                    throw new fnh(yh.c("selectWorld.load_folder_access"));
                }
            }
            $$02.close();
        }
        return a2;
    }

    public CompletableFuture<List<fnj>> a(a $$02) {
        ArrayList<CompletableFuture<@Nullable fnj>> $$1 = new ArrayList<CompletableFuture<fnj>>($$02.a.size());
        for (b $$2 : $$02.a) {
            $$1.add(CompletableFuture.supplyAsync(() -> {
                try {
                    boolean $$1 = bfh.b($$2.f());
                }
                catch (Exception $$2) {
                    c.warn("Failed to read {} lock", (Object)$$2.f(), (Object)$$2);
                    return null;
                }
                try {
                    void $$3;
                    return this.a($$2, (boolean)$$3);
                }
                catch (OutOfMemoryError $$4) {
                    bgh.b();
                    String $$5 = "Ran out of memory trying to read summary of world folder \"" + $$2.a() + "\"";
                    c.error(LogUtils.FATAL_MARKER, $$5);
                    OutOfMemoryError $$6 = new OutOfMemoryError("Ran out of memory reading level data");
                    $$6.initCause($$4);
                    m $$7 = m.a($$6, $$5);
                    n $$8 = $$7.a("World details");
                    $$8.a("Folder Name", $$2.a());
                    try {
                        long $$9 = Files.size($$2.b());
                        $$8.a("level.dat size", $$9);
                    }
                    catch (IOException $$10) {
                        $$8.a("level.dat size", $$10);
                    }
                    throw new v($$7);
                }
            }, bhs.h().a("loadLevelSummaries")));
        }
        return bhs.e($$1).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).sorted().toList());
    }

    private int f() {
        return 19133;
    }

    static uz c(Path $$0) throws IOException {
        return vm.a($$0, vi.b());
    }

    static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
        uz $$22 = fni.c($$0);
        uz $$3 = $$22.n(a);
        int $$4 = vo.f($$3);
        Dynamic $$5 = bhz.a.a($$1, new Dynamic((DynamicOps)vn.a, (Object)$$3), $$4);
        $$5 = $$5.update("Player", $$2 -> bhz.c.a($$1, $$2, $$4));
        $$5 = $$5.update("WorldGenSettings", $$2 -> bhz.u.a($$1, $$2, $$4));
        return $$5;
    }

    private fnj a(b $$0, boolean $$1) {
        Path $$2 = $$0.b();
        if (Files.exists($$2, new LinkOption[0])) {
            try {
                List<ftd> $$3;
                if (Files.isSymbolicLink($$2) && !($$3 = this.i.a($$2)).isEmpty()) {
                    c.warn("{}", (Object)ftb.a($$2, $$3));
                    return new fnj.c($$0.a(), $$0.d());
                }
                vz $$4 = fni.e($$2);
                if ($$4 instanceof uz) {
                    uz $$5 = (uz)$$4;
                    uz $$6 = $$5.n(a);
                    int $$7 = vo.f($$6);
                    Dynamic $$8 = bhz.b.a(this.h, new Dynamic((DynamicOps)vn.a, (Object)$$6), $$7);
                    return this.a($$8, $$0, $$1);
                }
                c.warn("Invalid root tag in {}", (Object)$$2);
            }
            catch (Exception $$9) {
                c.error("Exception reading {}", (Object)$$2, (Object)$$9);
            }
        }
        return new fnj.b($$0.a(), $$0.d(), fni.a($$0));
    }

    private static long a(b $$0) {
        Instant $$1 = fni.d($$0.b());
        if ($$1 == null) {
            $$1 = fni.d($$0.c());
        }
        return $$1 == null ? -1L : $$1.toEpochMilli();
    }

    static @Nullable Instant d(Path $$0) {
        try {
            return Files.getLastModifiedTime($$0, new LinkOption[0]).toInstant();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    fnj a(Dynamic<?> $$0, b $$1, boolean $$2) {
        fnk $$3 = fnk.a($$0);
        int $$4 = $$3.a();
        if ($$4 == 19132 || $$4 == 19133) {
            boolean $$5 = $$4 != this.f();
            Path $$6 = $$1.d();
            dxm $$7 = fni.a($$0);
            dws $$8 = dws.a($$0, $$7);
            dgz $$9 = fni.b($$0);
            boolean $$10 = dhb.a($$9);
            return new fnj($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
        }
        throw new vl("Unknown data version: " + Integer.toHexString($$4));
    }

    private static dgz b(Dynamic<?> $$02) {
        Set<amo> $$1 = $$02.get("enabled_features").asStream().flatMap($$0 -> $$0.asString().result().map(amo::c).stream()).collect(Collectors.toSet());
        return dhb.e.a($$1, $$0 -> {});
    }

    private static @Nullable vz e(Path $$0) throws IOException {
        wl $$1 = new wl(new wi(a, uz.b, "Player"), new wi(a, uz.b, "WorldGenSettings"));
        vm.a($$0, (vw)$$1, vi.b());
        return $$1.d();
    }

    public boolean a(String $$0) {
        try {
            Path $$1 = this.c($$0);
            Files.createDirectory($$1, new FileAttribute[0]);
            Files.deleteIfExists($$1);
            return true;
        }
        catch (IOException $$2) {
            return false;
        }
    }

    public boolean b(String $$0) {
        try {
            return Files.isDirectory(this.c($$0), new LinkOption[0]);
        }
        catch (InvalidPathException $$1) {
            return false;
        }
    }

    public Path c(String $$0) {
        return this.f.resolve($$0);
    }

    public Path c() {
        return this.f;
    }

    public Path d() {
        return this.g;
    }

    public c d(String $$0) throws IOException, ftb {
        Path $$1 = this.c($$0);
        List<ftd> $$2 = this.i.a($$1, true);
        if (!$$2.isEmpty()) {
            throw new ftb($$1, $$2);
        }
        return new c($$0, $$1);
    }

    public c e(String $$0) throws IOException {
        Path $$1 = this.c($$0);
        return new c($$0, $$1);
    }

    public ftc e() {
        return this.i;
    }

    public static final class a
    extends Record
    implements Iterable<b> {
        final List<b> a;

        public a(List<b> $$0) {
            this.a = $$0;
        }

        public boolean a() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator<b> iterator() {
            return this.a.iterator();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "levels", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "levels", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "levels", "a"}, this, $$0);
        }

        public List<b> b() {
            return this.a;
        }
    }

    public static final class b
    extends Record {
        final Path a;

        public b(Path $$0) {
            this.a = $$0;
        }

        public String a() {
            return this.a.getFileName().toString();
        }

        public Path b() {
            return this.a(fng.e);
        }

        public Path c() {
            return this.a(fng.f);
        }

        public Path a(ZonedDateTime $$0) {
            return this.a.resolve(fng.e.a() + "_corrupted_" + $$0.format(fnd.a));
        }

        public Path b(ZonedDateTime $$0) {
            return this.a.resolve(fng.e.a() + "_raw_" + $$0.format(fnd.a));
        }

        public Path d() {
            return this.a(fng.g);
        }

        public Path e() {
            return this.a(fng.h);
        }

        public Path a(fng $$0) {
            return this.a.resolve($$0.a());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "path", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "path", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "path", "a"}, this, $$0);
        }

        public Path f() {
            return this.a;
        }
    }

    public class c
    implements AutoCloseable {
        final bfh b;
        final b c;
        private final String d;
        private final Map<fng, Path> e = Maps.newHashMap();

        c(String $$1, Path $$2) throws IOException {
            this.d = $$1;
            this.c = new b($$2);
            this.b = bfh.a($$2);
        }

        public long a() {
            try {
                return Files.getFileStore(this.c.a).getUsableSpace();
            }
            catch (Exception $$0) {
                return Long.MAX_VALUE;
            }
        }

        public boolean b() {
            return this.a() < 0x4000000L;
        }

        public void c() {
            try {
                this.close();
            }
            catch (IOException $$0) {
                c.warn("Failed to unlock access to level {}", (Object)this.f(), (Object)$$0);
            }
        }

        public fni d() {
            return fni.this;
        }

        public b e() {
            return this.c;
        }

        public String f() {
            return this.d;
        }

        public Path a(fng $$0) {
            return this.e.computeIfAbsent($$0, this.c::a);
        }

        public Path a(amt<dwo> $$0) {
            return esh.a($$0, this.c.f());
        }

        private void o() {
            if (!this.b.a()) {
                throw new IllegalStateException("Lock is no longer valid");
            }
        }

        public fnl g() {
            this.o();
            return new fnl(this, fni.this.h);
        }

        public fnj a(Dynamic<?> $$0) {
            this.o();
            return fni.this.a($$0, this.c, false);
        }

        public Dynamic<?> h() throws IOException {
            return this.b(false);
        }

        public Dynamic<?> i() throws IOException {
            return this.b(true);
        }

        private Dynamic<?> b(boolean $$0) throws IOException {
            this.o();
            return fni.a($$0 ? this.c.c() : this.c.b(), fni.this.h);
        }

        public void a(jr $$0, fnt $$1) {
            this.a($$0, $$1, null);
        }

        public void a(jr $$0, fnt $$1, @Nullable uz $$2) {
            uz $$3 = $$1.a($$0, $$2);
            uz $$4 = new uz();
            $$4.a(fni.a, $$3);
            this.a($$4);
        }

        private void a(uz $$0) {
            Path $$1 = this.c.f();
            try {
                Path $$2 = Files.createTempFile($$1, "level", ".dat", new FileAttribute[0]);
                vm.a($$0, $$2);
                Path $$3 = this.c.c();
                Path $$4 = this.c.b();
                bhs.a($$4, $$2, $$3);
            }
            catch (Exception $$5) {
                c.error("Failed to save level {}", (Object)$$1, (Object)$$5);
            }
        }

        public Optional<Path> j() {
            if (!this.b.a()) {
                return Optional.empty();
            }
            return Optional.of(this.c.d());
        }

        public void k() throws IOException {
            this.o();
            final Path $$0 = this.c.e();
            c.info("Deleting level {}", (Object)this.d);
            for (int $$1 = 1; $$1 <= 5; ++$$1) {
                c.info("Attempt {}...", (Object)$$1);
                try {
                    Files.walkFileTree(this.c.f(), (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

                        public FileVisitResult a(Path $$02, BasicFileAttributes $$1) throws IOException {
                            if (!$$02.equals($$0)) {
                                fni.c.debug("Deleting {}", (Object)$$02);
                                Files.delete($$02);
                            }
                            return FileVisitResult.CONTINUE;
                        }

                        public FileVisitResult a(Path $$02, @Nullable IOException $$1) throws IOException {
                            if ($$1 != null) {
                                throw $$1;
                            }
                            if ($$02.equals(c.this.c.f())) {
                                c.this.b.close();
                                Files.deleteIfExists($$0);
                            }
                            Files.delete($$02);
                            return FileVisitResult.CONTINUE;
                        }

                        @Override
                        public /* synthetic */ FileVisitResult postVisitDirectory(Object object, @Nullable IOException iOException) throws IOException {
                            return this.a((Path)object, iOException);
                        }

                        @Override
                        public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                            return this.a((Path)object, basicFileAttributes);
                        }
                    });
                    break;
                }
                catch (IOException $$2) {
                    if ($$1 < 5) {
                        c.warn("Failed to delete {}", (Object)this.c.f(), (Object)$$2);
                        try {
                            Thread.sleep(500L);
                        }
                        catch (InterruptedException interruptedException) {}
                        continue;
                    }
                    throw $$2;
                }
            }
        }

        public void a(String $$0) throws IOException {
            this.a((uz $$1) -> $$1.a("LevelName", $$0.trim()));
        }

        public void b(String $$0) throws IOException {
            this.a((uz $$1) -> {
                $$1.a("LevelName", $$0.trim());
                $$1.r("Player");
            });
        }

        private void a(Consumer<uz> $$0) throws IOException {
            this.o();
            uz $$1 = fni.c(this.c.b());
            $$0.accept($$1.n(fni.a));
            this.a($$1);
        }

        public long l() throws IOException {
            this.o();
            String $$0 = fnd.a.format(ZonedDateTime.now()) + "_" + this.d;
            Path $$1 = fni.this.d();
            try {
                bfp.c($$1);
            }
            catch (IOException $$2) {
                throw new RuntimeException($$2);
            }
            Path $$3 = $$1.resolve(bfp.a($$1, $$0, ".zip"));
            try (final ZipOutputStream $$4 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream($$3, new OpenOption[0])));){
                final Path $$5 = Paths.get(this.d, new String[0]);
                Files.walkFileTree(this.c.f(), (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

                    public FileVisitResult a(Path $$0, BasicFileAttributes $$1) throws IOException {
                        if ($$0.endsWith("session.lock")) {
                            return FileVisitResult.CONTINUE;
                        }
                        String $$2 = $$5.resolve(c.this.c.f().relativize($$0)).toString().replace('\\', '/');
                        ZipEntry $$3 = new ZipEntry($$2);
                        $$4.putNextEntry($$3);
                        com.google.common.io.Files.asByteSource((File)$$0.toFile()).copyTo((OutputStream)$$4);
                        $$4.closeEntry();
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                        return this.a((Path)object, basicFileAttributes);
                    }
                });
            }
            return Files.size($$3);
        }

        public boolean m() {
            return Files.exists(this.c.b(), new LinkOption[0]) || Files.exists(this.c.c(), new LinkOption[0]);
        }

        @Override
        public void close() throws IOException {
            this.b.close();
        }

        public boolean n() {
            return bhs.a(this.c.b(), this.c.c(), this.c.a(ZonedDateTime.now()), true);
        }

        public @Nullable Instant a(boolean $$0) {
            return fni.d($$0 ? this.c.c() : this.c.b());
        }
    }
}

