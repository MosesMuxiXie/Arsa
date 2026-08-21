/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.Proxy;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;

public class gzf {
    public final i a;
    public final fxz b;
    public final a c;
    public final b d;
    public final c e;

    public gzf(i $$0, fxz $$1, a $$2, b $$3, c $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public static class i {
        public final gfx a;
        public final Proxy b;

        public i(gfx $$0, Proxy $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }

    public static class a {
        public final File a;
        public final File b;
        public final File c;
        public final @Nullable String d;

        public a(File $$0, File $$1, File $$2, @Nullable String $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public Path a() {
            return this.d == null ? this.c.toPath() : iml.a(this.c.toPath(), this.d);
        }
    }

    public static class b {
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public b(boolean $$0, String $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
        }
    }

    public record c(@Nullable String a, h b) {
        private final @Nullable String a;
        private final h b;

        public boolean a() {
            return this.b.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "logPath;variant", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "logPath;variant", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "logPath;variant", "a", "b"}, this, $$0);
        }

        public @Nullable String b() {
            return this.a;
        }

        public h c() {
            return this.b;
        }
    }

    public record d() implements h
    {
        @Override
        public boolean a() {
            return false;
        }
    }

    public record f(String b) implements h
    {
        @Override
        public boolean a() {
            return !bhi.h(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "realmId", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "realmId", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "realmId", "b"}, this, $$0);
        }
    }

    public record e(String b) implements h
    {
        @Override
        public boolean a() {
            return !bhi.h(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "serverAddress", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "serverAddress", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "serverAddress", "b"}, this, $$0);
        }
    }

    public record g(@Nullable String b) implements h
    {
        @Override
        public boolean a() {
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "worldId", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "worldId", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "worldId", "b"}, this, $$0);
        }
    }

    public static sealed interface h
    permits g, e, f, d {
        public static final h a = new d();

        public boolean a();
    }
}

