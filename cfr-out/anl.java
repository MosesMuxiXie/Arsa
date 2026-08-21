/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public final class anl
extends Record {
    private final List<a> d;
    public static final anl a = new anl(List.of());
    public static final aao<ByteBuf, Either<b, yh>> b = aam.a(anl$b.k, yj.f);
    public static final aao<ByteBuf, List<c>> c = anl$c.a.a(aam.a());

    public anl(List<a> $$0) {
        this.d = $$0;
    }

    public boolean a() {
        return this.d.isEmpty();
    }

    public Optional<a> a(b $$0) {
        return this.d.stream().filter($$12 -> (Boolean)$$12.a.map($$1 -> $$1 == $$0, $$0 -> false)).findFirst();
    }

    public List<c> b() {
        return this.d.stream().map($$0 -> new c($$0.a, $$0.b.toString())).toList();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{anl.class, "entries", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{anl.class, "entries", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{anl.class, "entries", "d"}, this, $$0);
    }

    public List<a> c() {
        return this.d;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(0, "report_bug");
        public static final /* enum */ b b = new b(1, "community_guidelines");
        public static final /* enum */ b c = new b(2, "support");
        public static final /* enum */ b d = new b(3, "status");
        public static final /* enum */ b e = new b(4, "feedback");
        public static final /* enum */ b f = new b(5, "community");
        public static final /* enum */ b g = new b(6, "website");
        public static final /* enum */ b h = new b(7, "forums");
        public static final /* enum */ b i = new b(8, "news");
        public static final /* enum */ b j = new b(9, "announcements");
        private static final IntFunction<b> l;
        public static final aao<ByteBuf, b> k;
        private final int m;
        private final String n;
        private static final /* synthetic */ b[] o;

        public static b[] values() {
            return (b[])o.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, String $$1) {
            this.m = $$0;
            this.n = $$1;
        }

        private yh a() {
            return yh.c("known_server_link." + this.n);
        }

        public a a(URI $$0) {
            return anl$a.a(this, $$0);
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e, f, g, h, i, j};
        }

        static {
            o = anl$b.b();
            l = beu.a($$0 -> $$0.m, anl$b.values(), beu.a.a);
            k = aam.a(l, $$0 -> $$0.m);
        }
    }

    public static final class c
    extends Record {
        private final Either<b, yh> b;
        private final String c;
        public static final aao<ByteBuf, c> a = aao.a(b, c::a, aam.p, c::b, c::new);

        public c(Either<b, yh> $$0, String $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "type;link", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "type;link", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "type;link", "b", "c"}, this, $$0);
        }

        public Either<b, yh> a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }
    }

    public static final class a
    extends Record {
        final Either<b, yh> a;
        final URI b;

        public a(Either<b, yh> $$0, URI $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static a a(b $$0, URI $$1) {
            return new a((Either<b, yh>)Either.left((Object)((Object)$$0)), $$1);
        }

        public static a a(yh $$0, URI $$1) {
            return new a((Either<b, yh>)Either.right((Object)$$0), $$1);
        }

        public yh a() {
            return (yh)this.a.map(b::a, $$0 -> $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;link", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;link", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;link", "a", "b"}, this, $$0);
        }

        public Either<b, yh> b() {
            return this.a;
        }

        public URI c() {
            return this.b;
        }
    }
}

