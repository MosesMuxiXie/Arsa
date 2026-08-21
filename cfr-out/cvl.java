/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cvl
extends cvh {
    public static final d a = new d(cvl$b.a, dkr.a, dkr.a);
    private static final alw<Integer> c = ama.a(cvl.class, aly.b);
    public static final List<d> b = List.of(new d(cvl$b.h, dkr.b, dkr.h), new d(cvl$b.g, dkr.h, dkr.h), new d(cvl$b.g, dkr.h, dkr.l), new d(cvl$b.l, dkr.a, dkr.h), new d(cvl$b.b, dkr.l, dkr.h), new d(cvl$b.a, dkr.b, dkr.a), new d(cvl$b.f, dkr.g, dkr.d), new d(cvl$b.j, dkr.k, dkr.e), new d(cvl$b.l, dkr.a, dkr.o), new d(cvl$b.f, dkr.a, dkr.e), new d(cvl$b.i, dkr.a, dkr.h), new d(cvl$b.l, dkr.a, dkr.b), new d(cvl$b.d, dkr.j, dkr.g), new d(cvl$b.e, dkr.f, dkr.d), new d(cvl$b.k, dkr.o, dkr.a), new d(cvl$b.c, dkr.h, dkr.o), new d(cvl$b.j, dkr.o, dkr.a), new d(cvl$b.g, dkr.a, dkr.e), new d(cvl$b.a, dkr.o, dkr.a), new d(cvl$b.b, dkr.h, dkr.a), new d(cvl$b.d, dkr.j, dkr.e), new d(cvl$b.g, dkr.e, dkr.e));
    private boolean e = true;

    public cvl(cgu<? extends cvl> $$0, dwo $$1) {
        super((cgu<? extends cvh>)$$0, $$1);
    }

    public static String a(int $$0) {
        return "entity.minecraft.tropical_fish.predefined." + $$0;
    }

    static int a(b $$0, dkr $$1, dkr $$2) {
        return $$0.b() & 0xFFFF | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
    }

    public static dkr b(int $$0) {
        return dkr.a($$0 >> 16 & 0xFF);
    }

    public static dkr d(int $$0) {
        return dkr.a($$0 >> 24 & 0xFF);
    }

    public static b r(int $$0) {
        return cvl$b.a($$0 & 0xFFFF);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, a.a());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Variant", cvl$d.a, new d(this.ha()));
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        d $$1 = $$0.a("Variant", cvl$d.a).orElse(a);
        this.s($$1.a());
    }

    private void s(int $$0) {
        this.az.a(c, $$0);
    }

    @Override
    public boolean q(int $$0) {
        return !this.e;
    }

    private int ha() {
        return this.az.a(c);
    }

    public dkr gX() {
        return cvl.b(this.ha());
    }

    public dkr gY() {
        return cvl.d(this.ha());
    }

    public b gZ() {
        return cvl.r(this.ha());
    }

    private void a(b $$0) {
        int $$1 = this.ha();
        dkr $$2 = cvl.b($$1);
        dkr $$3 = cvl.d($$1);
        this.s(cvl.a($$0, $$2, $$3));
    }

    private void a(dkr $$0) {
        int $$1 = this.ha();
        b $$2 = cvl.r($$1);
        dkr $$3 = cvl.d($$1);
        this.s(cvl.a($$2, $$0, $$3));
    }

    private void b(dkr $$0) {
        int $$1 = this.ha();
        b $$2 = cvl.r($$1);
        dkr $$3 = cvl.b($$1);
        this.s(cvl.a($$2, $$3, $$0));
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aJ) {
            return cvl.c($$0, this.gZ());
        }
        if ($$0 == ki.aK) {
            return cvl.c($$0, this.gX());
        }
        if ($$0 == ki.aL) {
            return cvl.c($$0, this.gY());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aJ);
        this.a($$0, ki.aK);
        this.a($$0, ki.aL);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aJ) {
            this.a(cvl.c(ki.aJ, $$1));
            return true;
        }
        if ($$0 == ki.aK) {
            this.a(cvl.c(ki.aK, $$1));
            return true;
        }
        if ($$0 == ki.aL) {
            this.b(cvl.c(ki.aL, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public void a(dlt $$0) {
        super.a($$0);
        $$0.a(ki.aJ, (kd)this);
        $$0.a(ki.aK, (kd)this);
        $$0.a(ki.aL, (kd)this);
    }

    @Override
    public dlt b() {
        return new dlt(dlx.su);
    }

    @Override
    protected bcz W() {
        return bda.De;
    }

    @Override
    protected bcz fd() {
        return bda.Df;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Dh;
    }

    @Override
    protected bcz gP() {
        return bda.Dg;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        d $$13;
        $$3 = super.a($$0, $$1, $$2, $$3);
        bgr $$4 = $$0.G_();
        if ($$3 instanceof c) {
            c $$5 = (c)$$3;
            d $$6 = $$5.b;
        } else if ((double)$$4.i() < 0.9) {
            d $$7 = bhs.a(b, $$4);
            $$3 = new c(this, $$7);
        } else {
            this.e = false;
            b[] $$8 = cvl$b.values();
            dkr[] $$9 = dkr.values();
            b $$10 = bhs.a($$8, $$4);
            dkr $$11 = bhs.a($$9, $$4);
            dkr $$12 = bhs.a($$9, $$4);
            $$13 = new d($$10, $$11, $$12);
        }
        this.s($$13.a());
        return $$3;
    }

    public static boolean b(cgu<cvl> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.b_($$3.e()).a(bdv.a) && $$1.a_($$3.d()).a(dzs.J) && ($$1.z($$3).a(bdo.ak) || cvm.c($$0, $$1, $$2, $$3, $$4));
    }

    public static final class b
    extends Enum<b>
    implements bhh,
    dpe {
        public static final /* enum */ b a = new b("kob", cvl$a.a, 0);
        public static final /* enum */ b b = new b("sunstreak", cvl$a.a, 1);
        public static final /* enum */ b c = new b("snooper", cvl$a.a, 2);
        public static final /* enum */ b d = new b("dasher", cvl$a.a, 3);
        public static final /* enum */ b e = new b("brinely", cvl$a.a, 4);
        public static final /* enum */ b f = new b("spotty", cvl$a.a, 5);
        public static final /* enum */ b g = new b("flopper", cvl$a.b, 0);
        public static final /* enum */ b h = new b("stripey", cvl$a.b, 1);
        public static final /* enum */ b i = new b("glitter", cvl$a.b, 2);
        public static final /* enum */ b j = new b("blockfish", cvl$a.b, 3);
        public static final /* enum */ b k = new b("betty", cvl$a.b, 4);
        public static final /* enum */ b l = new b("clayfish", cvl$a.b, 5);
        public static final Codec<b> m;
        private static final IntFunction<b> o;
        public static final aao<ByteBuf, b> n;
        private final String p;
        private final yh q;
        private final a r;
        private final int s;
        private static final /* synthetic */ b[] t;

        public static b[] values() {
            return (b[])t.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, a $$1, int $$2) {
            this.p = $$0;
            this.r = $$1;
            this.s = $$1.c | $$2 << 8;
            this.q = yh.c("entity.minecraft.tropical_fish.type." + this.p);
        }

        public static b a(int $$0) {
            return o.apply($$0);
        }

        public a a() {
            return this.r;
        }

        public int b() {
            return this.s;
        }

        @Override
        public String c() {
            return this.p;
        }

        public yh d() {
            return this.q;
        }

        @Override
        public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
            dkr $$4 = $$3.a(ki.aK, a.c());
            dkr $$5 = $$3.a(ki.aL, a.d());
            l[] $$6 = new l[]{l.u, l.h};
            int $$7 = b.indexOf(new d(this, $$4, $$5));
            if ($$7 != -1) {
                $$1.accept(yh.c(cvl.a($$7)).a($$6));
                return;
            }
            $$1.accept(this.q.e().a($$6));
            yw $$8 = yh.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
                $$8.f(", ").b(yh.c("color.minecraft." + $$5.b()));
            }
            $$8.a($$6);
            $$1.accept($$8);
        }

        private static /* synthetic */ b[] e() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l};
        }

        static {
            t = cvl$b.e();
            m = bhh.a(b::values);
            o = beu.a(b::b, cvl$b.values(), a);
            n = aam.a(o, b::b);
        }
    }

    public record d(b b, dkr c, dkr d) {
        public static final Codec<d> a = Codec.INT.xmap(d::new, d::a);

        public d(int $$0) {
            this(cvl.r($$0), cvl.b($$0), cvl.d($$0));
        }

        public int a() {
            return cvl.a(this.b, this.c, this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "pattern;baseColor;patternColor", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "pattern;baseColor;patternColor", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "pattern;baseColor;patternColor", "b", "c", "d"}, this, $$0);
        }
    }

    static class c
    extends cvh.a {
        final d b;

        c(cvl $$0, d $$1) {
            super($$0);
            this.b = $$1;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0);
        public static final /* enum */ a b = new a(1);
        final int c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.c = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = cvl$a.a();
        }
    }
}

