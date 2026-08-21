/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class eqa
extends fmn {
    public static final double a = 5.9999968E7;
    public static final double b = 2.9999984E7;
    public static final Codec<eqa> c = eqa$c.b.xmap(eqa::new, c::new);
    public static final fmo<eqa> d = new fmo<eqa>("world_border", eqa::new, c, bhz.r);
    private final c e;
    private boolean f;
    private final List<epy> g = Lists.newArrayList();
    double h = 0.2;
    double i = 5.0;
    int j = 15;
    int k = 5;
    double l;
    double m;
    int n = 29999984;
    a o = new d(5.9999968E7);

    public eqa() {
        this(eqa$c.a);
    }

    public eqa(c $$0) {
        this.e = $$0;
    }

    public boolean a(is $$0) {
        return this.a($$0.u(), $$0.w());
    }

    public boolean a(ftm $$0) {
        return this.a($$0.g, $$0.i);
    }

    public boolean a(dvu $$0) {
        return this.a($$0.e(), $$0.f()) && this.a($$0.g(), $$0.h());
    }

    public boolean a(fth $$0) {
        return this.a($$0.a, $$0.c, $$0.d - (double)1.0E-5f, $$0.f - (double)1.0E-5f);
    }

    private boolean a(double $$0, double $$1, double $$2, double $$3) {
        return this.a($$0, $$1) && this.a($$2, $$3);
    }

    public boolean a(double $$0, double $$1) {
        return this.a($$0, $$1, 0.0);
    }

    public boolean a(double $$0, double $$1, double $$2) {
        return $$0 >= this.d() - $$2 && $$0 < this.f() + $$2 && $$1 >= this.e() - $$2 && $$1 < this.g() + $$2;
    }

    public is b(is $$0) {
        return this.b($$0.u(), $$0.v(), $$0.w());
    }

    public is b(ftm $$0) {
        return this.b($$0.a(), $$0.b(), $$0.c());
    }

    public is b(double $$0, double $$1, double $$2) {
        return is.a(this.c($$0, $$1, $$2));
    }

    public ftm c(ftm $$0) {
        return this.c($$0.g, $$0.h, $$0.i);
    }

    public ftm c(double $$0, double $$1, double $$2) {
        return new ftm(bgj.a($$0, this.d(), this.f() - (double)1.0E-5f), $$1, bgj.a($$2, this.e(), this.g() - (double)1.0E-5f));
    }

    public double a(cgk $$0) {
        return this.b($$0.dP(), $$0.dV());
    }

    public fug b() {
        return this.o.i();
    }

    public double b(double $$0, double $$1) {
        double $$2 = $$1 - this.e();
        double $$3 = this.g() - $$1;
        double $$4 = $$0 - this.d();
        double $$5 = this.f() - $$0;
        double $$6 = Math.min($$4, $$5);
        $$6 = Math.min($$6, $$2);
        return Math.min($$6, $$3);
    }

    public boolean a(cgk $$0, fth $$1) {
        double $$2 = Math.max(bgj.a($$1.b(), $$1.d()), 1.0);
        return this.a($$0) < $$2 * 2.0 && this.a($$0.dP(), $$0.dV(), $$2);
    }

    public epz c() {
        return this.o.e();
    }

    public double d() {
        return this.a(0.0f);
    }

    public double a(float $$0) {
        return this.o.a($$0);
    }

    public double e() {
        return this.b(0.0f);
    }

    public double b(float $$0) {
        return this.o.c($$0);
    }

    public double f() {
        return this.c(0.0f);
    }

    public double c(float $$0) {
        return this.o.b($$0);
    }

    public double g() {
        return this.d(0.0f);
    }

    public double d(float $$0) {
        return this.o.d($$0);
    }

    public double h() {
        return this.l;
    }

    public double i() {
        return this.m;
    }

    public void c(double $$0, double $$1) {
        this.l = $$0;
        this.m = $$1;
        this.o.g();
        this.u();
        for (epy $$2 : this.m()) {
            $$2.a(this, $$0, $$1);
        }
    }

    public double j() {
        return this.o.a();
    }

    public long k() {
        return this.o.c();
    }

    public double l() {
        return this.o.d();
    }

    public void a(double $$0) {
        this.o = new d($$0);
        this.u();
        for (epy $$1 : this.m()) {
            $$1.a(this, $$0);
        }
    }

    public void a(double $$0, double $$1, long $$2, long $$3) {
        this.o = $$0 == $$1 ? new d($$1) : new b($$0, $$1, $$2, $$3);
        this.u();
        for (epy $$4 : this.m()) {
            $$4.a(this, $$0, $$1, $$2, $$3);
        }
    }

    protected List<epy> m() {
        return Lists.newArrayList(this.g);
    }

    public void a(epy $$0) {
        this.g.add($$0);
    }

    public void b(epy $$0) {
        this.g.remove($$0);
    }

    public void a(int $$0) {
        this.n = $$0;
        this.o.f();
    }

    public int n() {
        return this.n;
    }

    public double o() {
        return this.i;
    }

    public void b(double $$0) {
        this.i = $$0;
        this.u();
        for (epy $$1 : this.m()) {
            $$1.c(this, $$0);
        }
    }

    public double p() {
        return this.h;
    }

    public void c(double $$0) {
        this.h = $$0;
        this.u();
        for (epy $$1 : this.m()) {
            $$1.b(this, $$0);
        }
    }

    public double q() {
        return this.o.b();
    }

    public int r() {
        return this.j;
    }

    public void b(int $$0) {
        this.j = $$0;
        this.u();
        for (epy $$1 : this.m()) {
            $$1.a(this, $$0);
        }
    }

    public int s() {
        return this.k;
    }

    public void c(int $$0) {
        this.k = $$0;
        this.u();
        for (epy $$1 : this.m()) {
            $$1.b(this, $$0);
        }
    }

    public void t() {
        this.o = this.o.h();
    }

    public void a(long $$0) {
        if (!this.f) {
            this.c(this.e.a(), this.e.b());
            this.c(this.e.c());
            this.b(this.e.d());
            this.c(this.e.e());
            this.b(this.e.f());
            if (this.e.h() > 0L) {
                this.a(this.e.g(), this.e.i(), this.e.h(), $$0);
            } else {
                this.a(this.e.g());
            }
            this.f = true;
        }
    }

    public static final class c
    extends Record {
        private final double c;
        private final double d;
        private final double e;
        private final double f;
        private final int g;
        private final int h;
        private final double i;
        private final long j;
        private final double k;
        public static final c a = new c(0.0, 0.0, 0.2, 5.0, 5, 300, 5.9999968E7, 0L, 0.0);
        public static final Codec<c> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.doubleRange((double)-2.9999984E7, (double)2.9999984E7).fieldOf("center_x").forGetter(c::a), (App)Codec.doubleRange((double)-2.9999984E7, (double)2.9999984E7).fieldOf("center_z").forGetter(c::b), (App)Codec.DOUBLE.fieldOf("damage_per_block").forGetter(c::c), (App)Codec.DOUBLE.fieldOf("safe_zone").forGetter(c::d), (App)Codec.INT.fieldOf("warning_blocks").forGetter(c::e), (App)Codec.INT.fieldOf("warning_time").forGetter(c::f), (App)Codec.DOUBLE.fieldOf("size").forGetter(c::g), (App)Codec.LONG.fieldOf("lerp_time").forGetter(c::h), (App)Codec.DOUBLE.fieldOf("lerp_target").forGetter(c::i)).apply((Applicative)$$0, c::new));

        public c(eqa $$0) {
            this($$0.l, $$0.m, $$0.h, $$0.i, $$0.k, $$0.j, $$0.o.a(), $$0.o.c(), $$0.o.d());
        }

        public c(double $$0, double $$1, double $$2, double $$3, int $$4, int $$5, double $$6, long $$7, double $$8) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
            this.i = $$6;
            this.j = $$7;
            this.k = $$8;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "centerX;centerZ;damagePerBlock;safeZone;warningBlocks;warningTime;size;lerpTime;lerpTarget", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "centerX;centerZ;damagePerBlock;safeZone;warningBlocks;warningTime;size;lerpTime;lerpTarget", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "centerX;centerZ;damagePerBlock;safeZone;warningBlocks;warningTime;size;lerpTime;lerpTarget", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this, $$0);
        }

        public double a() {
            return this.c;
        }

        public double b() {
            return this.d;
        }

        public double c() {
            return this.e;
        }

        public double d() {
            return this.f;
        }

        public int e() {
            return this.g;
        }

        public int f() {
            return this.h;
        }

        public double g() {
            return this.i;
        }

        public long h() {
            return this.j;
        }

        public double i() {
            return this.k;
        }
    }

    class d
    implements a {
        private final double b;
        private double c;
        private double d;
        private double e;
        private double f;
        private fug g;

        public d(double $$0) {
            this.b = $$0;
            this.j();
        }

        @Override
        public double a(float $$0) {
            return this.c;
        }

        @Override
        public double b(float $$0) {
            return this.e;
        }

        @Override
        public double c(float $$0) {
            return this.d;
        }

        @Override
        public double d(float $$0) {
            return this.f;
        }

        @Override
        public double a() {
            return this.b;
        }

        @Override
        public epz e() {
            return epz.c;
        }

        @Override
        public double b() {
            return 0.0;
        }

        @Override
        public long c() {
            return 0L;
        }

        @Override
        public double d() {
            return this.b;
        }

        private void j() {
            this.c = bgj.a(eqa.this.h() - this.b / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
            this.d = bgj.a(eqa.this.i() - this.b / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
            this.e = bgj.a(eqa.this.h() + this.b / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
            this.f = bgj.a(eqa.this.i() + this.b / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
            this.g = fud.a(fud.c, fud.a(Math.floor(this.a(0.0f)), Double.NEGATIVE_INFINITY, Math.floor(this.c(0.0f)), Math.ceil(this.b(0.0f)), Double.POSITIVE_INFINITY, Math.ceil(this.d(0.0f))), ftq.e);
        }

        @Override
        public void f() {
            this.j();
        }

        @Override
        public void g() {
            this.j();
        }

        @Override
        public a h() {
            return this;
        }

        @Override
        public fug i() {
            return this.g;
        }
    }

    static interface a {
        public double a(float var1);

        public double b(float var1);

        public double c(float var1);

        public double d(float var1);

        public double a();

        public double b();

        public long c();

        public double d();

        public epz e();

        public void f();

        public void g();

        public a h();

        public fug i();
    }

    class b
    implements a {
        private final double b;
        private final double c;
        private final long d;
        private final long e;
        private final double f;
        private long g;
        private double h;
        private double i;

        b(double $$0, double $$1, long $$2, long $$3) {
            double $$4;
            this.b = $$0;
            this.c = $$1;
            this.f = $$2;
            this.g = $$2;
            this.e = $$3;
            this.d = this.e + $$2;
            this.h = $$4 = this.k();
            this.i = $$4;
        }

        @Override
        public double a(float $$0) {
            return bgj.a(eqa.this.h() - bgj.d((double)$$0, this.j(), this.a()) / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
        }

        @Override
        public double c(float $$0) {
            return bgj.a(eqa.this.i() - bgj.d((double)$$0, this.j(), this.a()) / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
        }

        @Override
        public double b(float $$0) {
            return bgj.a(eqa.this.h() + bgj.d((double)$$0, this.j(), this.a()) / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
        }

        @Override
        public double d(float $$0) {
            return bgj.a(eqa.this.i() + bgj.d((double)$$0, this.j(), this.a()) / 2.0, (double)(-eqa.this.n), (double)eqa.this.n);
        }

        @Override
        public double a() {
            return this.h;
        }

        public double j() {
            return this.i;
        }

        private double k() {
            double $$0 = (this.f - (double)this.g) / this.f;
            return $$0 < 1.0 ? bgj.d($$0, this.b, this.c) : this.c;
        }

        @Override
        public double b() {
            return Math.abs(this.b - this.c) / (double)(this.d - this.e);
        }

        @Override
        public long c() {
            return this.g;
        }

        @Override
        public double d() {
            return this.c;
        }

        @Override
        public epz e() {
            return this.c < this.b ? epz.b : epz.a;
        }

        @Override
        public void g() {
        }

        @Override
        public void f() {
        }

        @Override
        public a h() {
            --this.g;
            this.i = this.h;
            this.h = this.k();
            if (this.g <= 0L) {
                eqa.this.u();
                return new d(this.c);
            }
            return this;
        }

        @Override
        public fug i() {
            return fud.a(fud.c, fud.a(Math.floor(this.a(0.0f)), Double.NEGATIVE_INFINITY, Math.floor(this.c(0.0f)), Math.ceil(this.b(0.0f)), Double.POSITIVE_INFINITY, Math.ceil(this.d(0.0f))), ftq.e);
        }
    }
}

