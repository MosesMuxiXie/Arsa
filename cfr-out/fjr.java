/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class fjr {
    private static final Logger b = LogUtils.getLogger();
    public static final String a = "structure";
    private static final String c = "structures";
    private static final String d = ".nbt";
    private static final String e = ".snbt";
    private final Map<amo, Optional<fjq>> f = Maps.newConcurrentMap();
    private final DataFixer g;
    private baz h;
    private final Path i;
    private final List<b> j;
    private final je<dzq> k;
    private static final amm l = new amm("structure", ".nbt");

    public fjr(baz $$0, fni.c $$1, DataFixer $$2, je<dzq> $$3) {
        this.h = $$0;
        this.g = $$2;
        this.i = $$1.a(fng.i).normalize();
        this.k = $$3;
        ImmutableList.Builder $$4 = ImmutableList.builder();
        $$4.add((Object)new b(this::h, this::d));
        if (w.aX) {
            $$4.add((Object)new b(this::g, this::c));
        }
        $$4.add((Object)new b(this::f, this::b));
        this.j = $$4.build();
    }

    public fjq a(amo $$0) {
        Optional<fjq> $$1 = this.b($$0);
        if ($$1.isPresent()) {
            return $$1.get();
        }
        fjq $$2 = new fjq();
        this.f.put($$0, Optional.of($$2));
        return $$2;
    }

    public Optional<fjq> b(amo $$0) {
        return this.f.computeIfAbsent($$0, this::e);
    }

    public Stream<amo> a() {
        return this.j.stream().flatMap($$0 -> $$0.b().get()).distinct();
    }

    private Optional<fjq> e(amo $$0) {
        for (b $$1 : this.j) {
            try {
                Optional<fjq> $$2 = $$1.a().apply($$0);
                if (!$$2.isPresent()) continue;
                return $$2;
            }
            catch (Exception exception) {
            }
        }
        return Optional.empty();
    }

    public void a(baz $$0) {
        this.h = $$0;
        this.f.clear();
    }

    private Optional<fjq> f(amo $$0) {
        amo $$12 = l.a($$0);
        return this.a(() -> this.h.open($$12), (Throwable $$1) -> b.error("Couldn't load structure {}", (Object)$$0, $$1));
    }

    private Stream<amo> b() {
        return l.a(this.h).keySet().stream().map(l::b);
    }

    private Optional<fjq> g(amo $$0) {
        return this.a($$0, ts.c);
    }

    private Stream<amo> c() {
        if (!Files.isDirectory(ts.c, new LinkOption[0])) {
            return Stream.empty();
        }
        ArrayList $$0 = new ArrayList();
        this.a(ts.c, "minecraft", e, $$0::add);
        return $$0.stream();
    }

    private Optional<fjq> h(amo $$0) {
        if (!Files.isDirectory(this.i, new LinkOption[0])) {
            return Optional.empty();
        }
        Path $$12 = this.a($$0, d);
        return this.a(() -> new FileInputStream($$12.toFile()), (Throwable $$1) -> b.error("Couldn't load structure from {}", (Object)$$12, $$1));
    }

    private Stream<amo> d() {
        if (!Files.isDirectory(this.i, new LinkOption[0])) {
            return Stream.empty();
        }
        try {
            ArrayList $$02 = new ArrayList();
            try (DirectoryStream<Path> $$1 = Files.newDirectoryStream(this.i, $$0 -> Files.isDirectory($$0, new LinkOption[0]));){
                for (Path $$2 : $$1) {
                    String $$3 = $$2.getFileName().toString();
                    Path $$4 = $$2.resolve(c);
                    this.a($$4, $$3, d, $$02::add);
                }
            }
            return $$02.stream();
        }
        catch (IOException $$5) {
            return Stream.empty();
        }
    }

    private void a(Path $$0, String $$12, String $$22, Consumer<amo> $$3) {
        int $$42 = $$22.length();
        Function<String, String> $$5 = $$1 -> $$1.substring(0, $$1.length() - $$42);
        try (Stream<Path> $$6 = Files.find($$0, Integer.MAX_VALUE, ($$1, $$2) -> $$2.isRegularFile() && $$1.toString().endsWith($$22), new FileVisitOption[0]);){
            $$6.forEach($$4 -> {
                try {
                    $$3.accept(amo.a($$12, (String)$$5.apply(this.a($$0, (Path)$$4))));
                }
                catch (s $$5) {
                    b.error("Invalid location while listing folder {} contents", (Object)$$0, (Object)$$5);
                }
            });
        }
        catch (IOException $$7) {
            b.error("Failed to list folder {} contents", (Object)$$0, (Object)$$7);
        }
    }

    private String a(Path $$0, Path $$1) {
        return $$0.relativize($$1).toString().replace(File.separator, "/");
    }

    private Optional<fjq> a(amo $$0, Path $$1) {
        Optional<fjq> optional;
        block10: {
            if (!Files.isDirectory($$1, new LinkOption[0])) {
                return Optional.empty();
            }
            Path $$2 = bfp.b($$1, $$0.a(), e);
            BufferedReader $$3 = Files.newBufferedReader($$2);
            try {
                String $$4 = IOUtils.toString((Reader)$$3);
                optional = Optional.of(this.a(vo.a($$4)));
                if ($$3 == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if ($$3 != null) {
                        try {
                            $$3.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (NoSuchFileException $$5) {
                    return Optional.empty();
                }
                catch (CommandSyntaxException | IOException $$6) {
                    b.error("Couldn't load structure from {}", (Object)$$2, (Object)$$6);
                    return Optional.empty();
                }
            }
            $$3.close();
        }
        return optional;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private Optional<fjq> a(a $$0, Consumer<Throwable> $$1) {
        try (InputStream $$2 = $$0.open();){
            Optional<fjq> optional;
            try (bfn $$3 = new bfn($$2);){
                optional = Optional.of(this.a($$3));
            }
            return optional;
        }
        catch (FileNotFoundException $$4) {
            return Optional.empty();
        }
        catch (Throwable $$5) {
            $$1.accept($$5);
            return Optional.empty();
        }
    }

    private fjq a(InputStream $$0) throws IOException {
        uz $$1 = vm.a($$0, vi.c());
        return this.a($$1);
    }

    public fjq a(uz $$0) {
        fjq $$1 = new fjq();
        int $$2 = vo.b($$0, 500);
        $$1.a(this.k, bhz.g.a(this.g, $$0, $$2));
        return $$1;
    }

    public boolean c(amo $$0) {
        Optional<fjq> $$1 = this.f.get($$0);
        if ($$1.isEmpty()) {
            return false;
        }
        fjq $$2 = $$1.get();
        Path $$3 = this.a($$0, w.K ? e : d);
        Path $$4 = $$3.getParent();
        if ($$4 == null) {
            return false;
        }
        try {
            Files.createDirectories(Files.exists($$4, new LinkOption[0]) ? $$4.toRealPath(new LinkOption[0]) : $$4, new FileAttribute[0]);
        }
        catch (IOException $$5) {
            b.error("Failed to create parent directory: {}", (Object)$$4);
            return false;
        }
        uz $$6 = $$2.a(new uz());
        if (w.K) {
            try {
                pe.a(mo.a, $$3, vo.a($$6));
            }
            catch (Throwable $$7) {
                return false;
            }
        }
        try (FileOutputStream $$8 = new FileOutputStream($$3.toFile());){
            vm.a($$6, $$8);
        }
        catch (Throwable $$9) {
            return false;
        }
        return true;
    }

    public Path a(amo $$0, String $$1) {
        if ($$0.a().contains("//")) {
            throw new s("Invalid resource path: " + String.valueOf($$0));
        }
        try {
            Path $$2 = this.i.resolve($$0.b());
            Path $$3 = $$2.resolve(c);
            Path $$4 = bfp.b($$3, $$0.a(), $$1);
            if (!($$4.startsWith(this.i) && bfp.a($$4) && bfp.b($$4))) {
                throw new s("Invalid resource path: " + String.valueOf($$4));
            }
            return $$4;
        }
        catch (InvalidPathException $$5) {
            throw new s("Invalid resource path: " + String.valueOf($$0), $$5);
        }
    }

    public void d(amo $$0) {
        this.f.remove($$0);
    }

    record b(Function<amo, Optional<fjq>> a, Supplier<Stream<amo>> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "loader;lister", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "loader;lister", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "loader;lister", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    static interface a {
        public InputStream open() throws IOException;
    }
}

