/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class pg
implements mq {
    private static final Logger d = LogUtils.getLogger();
    private final ms e;
    private final Iterable<Path> f;
    private final List<a> g = Lists.newArrayList();

    public pg(ms $$0, Iterable<Path> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public pg a(a $$0) {
        this.g.add($$0);
        return this;
    }

    private uz a(String $$0, uz $$1) {
        uz $$2 = $$1;
        for (a $$3 : this.g) {
            $$2 = $$3.apply($$0, $$2);
        }
        return $$2;
    }

    @Override
    public CompletableFuture<?> a(mo $$02) {
        Path $$1 = this.e.a();
        ArrayList $$2 = Lists.newArrayList();
        for (Path $$3 : this.f) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
                CompletableFuture<Void> completableFuture;
                block8: {
                    Stream<Path> $$32 = Files.walk($$3, new FileVisitOption[0]);
                    try {
                        completableFuture = CompletableFuture.allOf((CompletableFuture[])$$32.filter($$0 -> $$0.toString().endsWith(".snbt")).map($$3 -> CompletableFuture.runAsync(() -> {
                            c $$4 = this.a((Path)$$3, this.a($$3, (Path)$$3));
                            this.a($$02, $$4, $$1);
                        }, bhs.h().a("SnbtToNbt"))).toArray(CompletableFuture[]::new));
                        if ($$32 == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if ($$32 != null) {
                                try {
                                    $$32.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (Exception $$4) {
                            throw new RuntimeException("Failed to read structure input directory, aborting", $$4);
                        }
                    }
                    $$32.close();
                }
                return completableFuture;
            }, bhs.h().a("SnbtToNbt")).thenCompose($$0 -> $$0));
        }
        return bhs.d($$2);
    }

    @Override
    public final String a() {
        return "SNBT -> NBT";
    }

    private String a(Path $$0, Path $$1) {
        String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
        return $$2.substring(0, $$2.length() - ".snbt".length());
    }

    private c a(Path $$0, String $$1) {
        c c2;
        block8: {
            BufferedReader $$2 = Files.newBufferedReader($$0);
            try {
                String $$3 = IOUtils.toString((Reader)$$2);
                uz $$4 = this.a($$1, vo.a($$3));
                ByteArrayOutputStream $$5 = new ByteArrayOutputStream();
                HashingOutputStream $$6 = new HashingOutputStream(Hashing.sha1(), (OutputStream)$$5);
                vm.a($$4, (OutputStream)$$6);
                byte[] $$7 = $$5.toByteArray();
                HashCode $$8 = $$6.hash();
                c2 = new c($$1, $$7, $$8);
                if ($$2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            $$2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable $$9) {
                    throw new b($$0, $$9);
                }
            }
            $$2.close();
        }
        return c2;
    }

    private void a(mo $$0, c $$1, Path $$2) {
        Path $$3 = $$2.resolve($$1.a + ".nbt");
        try {
            $$0.writeIfNeeded($$3, $$1.b, $$1.c);
        }
        catch (IOException $$4) {
            d.error("Couldn't write structure {} at {}", new Object[]{$$1.a, $$3, $$4});
        }
    }

    @FunctionalInterface
    public static interface a {
        public uz apply(String var1, uz var2);
    }

    static final class c
    extends Record {
        final String a;
        final byte[] b;
        final HashCode c;

        c(String $$0, byte[] $$1, HashCode $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name;payload;hash", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name;payload;hash", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name;payload;hash", "a", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public byte[] b() {
            return this.b;
        }

        public HashCode c() {
            return this.c;
        }
    }

    static class b
    extends RuntimeException {
        public b(Path $$0, Throwable $$1) {
            super($$0.toAbsolutePath().toString(), $$1);
        }
    }
}

