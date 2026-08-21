/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.function.Function;

public class gzo<T extends idy>
extends gzm<T>
implements gzk<T>,
gzn {
    public static final hdp b = new gzl(true, 16.0f, 0.0f, 2.0f, 2.0f, 24.0f, Set.of("head"));
    public static final float c = 0.25f;
    public static final float d = 0.5f;
    public static final float e = -0.1f;
    private static final float q = 0.005f;
    private static final float r = 0.2617994f;
    private static final float s = 1.9198622f;
    private static final float t = 0.2617994f;
    private static final float u = -1.3962634f;
    private static final float v = 0.43633232f;
    private static final float w = 0.5235988f;
    public static final float f = 1.4835298f;
    public static final float g = 0.5235988f;
    public final hdg h;
    public final hdg i;
    public final hdg j;
    public final hdg k;
    public final hdg l;
    public final hdg m;
    public final hdg n;

    public gzo(hdg $$0) {
        this($$0, ijt::g);
    }

    public gzo(hdg $$0, Function<amo, ijs> $$1) {
        super($$0, $$1);
        this.h = $$0.b("head");
        this.i = this.h.b("hat");
        this.j = $$0.b("body");
        this.k = $$0.b("right_arm");
        this.l = $$0.b("left_arm");
        this.m = $$0.b("right_leg");
        this.n = $$0.b("left_leg");
    }

    public static hdo a(hdk $$0, float $$1) {
        hdo $$2 = new hdo();
        hdq $$3 = $$2.a();
        hdq $$4 = $$3.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), hdi.a(0.0f, 0.0f + $$1, 0.0f));
        $$4.a("hat", hdl.c().a(32, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0.a(0.5f)), hdi.a);
        $$3.a("body", hdl.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0), hdi.a(0.0f, 0.0f + $$1, 0.0f));
        $$3.a("right_arm", hdl.c().a(40, 16).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(-5.0f, 2.0f + $$1, 0.0f));
        $$3.a("left_arm", hdl.c().a(40, 16).a().a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(5.0f, 2.0f + $$1, 0.0f));
        $$3.a("right_leg", hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(-1.9f, 12.0f + $$1, 0.0f));
        $$3.a("left_leg", hdl.c().a(0, 16).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(1.9f, 12.0f + $$1, 0.0f));
        return $$2;
    }

    public static hvk<hdo> a(hdk $$0, hdk $$1) {
        return gzo.a(gzo::a, $$0, $$1);
    }

    protected static hvk<hdo> a(Function<hdk, hdo> $$0, hdk $$1, hdk $$2) {
        hdo $$3 = $$0.apply($$2);
        $$3.a().a(Set.of("head"));
        hdo $$4 = $$0.apply($$2);
        $$4.a().b(Set.of("body", "left_arm", "right_arm"));
        hdo $$5 = $$0.apply($$1);
        $$5.a().b(Set.of("left_leg", "right_leg", "body"));
        hdo $$6 = $$0.apply($$2);
        $$6.a().b(Set.of("left_leg", "right_leg"));
        return new hvk<hdo>($$3, $$4, $$5, $$6);
    }

    private static hdo a(hdk $$0) {
        hdo $$1 = gzo.a($$0, 0.0f);
        hdq $$2 = $$1.a();
        $$2.a("right_leg", hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(-0.1f)), hdi.a(-1.9f, 12.0f, 0.0f));
        $$2.a("left_leg", hdl.c().a(0, 16).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(-0.1f)), hdi.a(1.9f, 12.0f, 0.0f));
        return $$1;
    }

    @Override
    public void a(T $$0) {
        boolean $$7;
        super.a($$0);
        a $$1 = ((idy)$$0).i;
        a $$2 = ((idy)$$0).f;
        float $$3 = ((idy)$$0).ab;
        boolean $$4 = ((idy)$$0).ai;
        this.h.e = ((idy)$$0).av * ((float)Math.PI / 180);
        this.h.f = ((idy)$$0).au * ((float)Math.PI / 180);
        if ($$4) {
            this.h.e = -0.7853982f;
        } else if ($$3 > 0.0f) {
            this.h.e = bgj.j($$3, this.h.e, -0.7853982f);
        }
        float $$5 = ((idy)$$0).ax;
        float $$6 = ((idy)$$0).ay;
        this.k.e = bgj.b((double)($$5 * 0.6662f + (float)Math.PI)) * 2.0f * $$6 * 0.5f / ((idy)$$0).ac;
        this.l.e = bgj.b((double)($$5 * 0.6662f)) * 2.0f * $$6 * 0.5f / ((idy)$$0).ac;
        this.m.e = bgj.b((double)($$5 * 0.6662f)) * 1.4f * $$6 / ((idy)$$0).ac;
        this.n.e = bgj.b((double)($$5 * 0.6662f + (float)Math.PI)) * 1.4f * $$6 / ((idy)$$0).ac;
        this.m.f = 0.005f;
        this.n.f = -0.005f;
        this.m.g = 0.005f;
        this.n.g = -0.005f;
        if (((idy)$$0).ak) {
            this.k.e += -0.62831855f;
            this.l.e += -0.62831855f;
            this.m.e = -1.4137167f;
            this.m.f = 0.31415927f;
            this.m.g = 0.07853982f;
            this.n.e = -1.4137167f;
            this.n.f = -0.31415927f;
            this.n.g = -0.07853982f;
        }
        boolean bl2 = $$7 = ((idy)$$0).e == chb.b;
        if (((idy)$$0).al) {
            boolean $$8;
            boolean bl3 = $$8 = ((idy)$$0).ag == cdb.a;
            if ($$8 == $$7) {
                this.c($$0);
                if (!((idy)$$0).f.b()) {
                    this.d($$0);
                }
            } else {
                this.d($$0);
                if (!((idy)$$0).i.b()) {
                    this.c($$0);
                }
            }
        } else {
            boolean $$9;
            boolean bl4 = $$9 = $$7 ? $$1.a() : $$2.a();
            if ($$7 != $$9) {
                this.d($$0);
                if (!((idy)$$0).i.b()) {
                    this.c($$0);
                }
            } else {
                this.c($$0);
                if (!((idy)$$0).f.b()) {
                    this.d($$0);
                }
            }
        }
        this.b($$0);
        if (((idy)$$0).ah) {
            this.j.e = 0.5f;
            this.k.e += 0.4f;
            this.l.e += 0.4f;
            this.m.d += 4.0f;
            this.n.d += 4.0f;
            this.h.c += 4.2f;
            this.j.c += 3.2f;
            this.l.c += 3.2f;
            this.k.c += 3.2f;
        }
        if ($$2 != gzo$a.h) {
            gzj.a(this.k, ((idy)$$0).L, 1.0f);
        }
        if ($$1 != gzo$a.h) {
            gzj.a(this.l, ((idy)$$0).L, -1.0f);
        }
        if ($$3 > 0.0f) {
            float $$13;
            float $$10 = $$5 % 26.0f;
            chb $$11 = ((idy)$$0).af;
            float $$12 = ((idy)$$0).f == gzo$a.k || $$11 == chb.b && ((idy)$$0).m > 0.0f ? 0.0f : $$3;
            float f2 = $$13 = ((idy)$$0).i == gzo$a.k || $$11 == chb.a && ((idy)$$0).m > 0.0f ? 0.0f : $$3;
            if (!((idy)$$0).al) {
                if ($$10 < 14.0f) {
                    this.l.e = bgj.j($$13, this.l.e, 0.0f);
                    this.k.e = bgj.h($$12, this.k.e, 0.0f);
                    this.l.f = bgj.j($$13, this.l.f, (float)Math.PI);
                    this.k.f = bgj.h($$12, this.k.f, (float)Math.PI);
                    this.l.g = bgj.j($$13, this.l.g, (float)Math.PI + 1.8707964f * this.a($$10) / this.a(14.0f));
                    this.k.g = bgj.h($$12, this.k.g, (float)Math.PI - 1.8707964f * this.a($$10) / this.a(14.0f));
                } else if ($$10 >= 14.0f && $$10 < 22.0f) {
                    float $$14 = ($$10 - 14.0f) / 8.0f;
                    this.l.e = bgj.j($$13, this.l.e, 1.5707964f * $$14);
                    this.k.e = bgj.h($$12, this.k.e, 1.5707964f * $$14);
                    this.l.f = bgj.j($$13, this.l.f, (float)Math.PI);
                    this.k.f = bgj.h($$12, this.k.f, (float)Math.PI);
                    this.l.g = bgj.j($$13, this.l.g, 5.012389f - 1.8707964f * $$14);
                    this.k.g = bgj.h($$12, this.k.g, 1.2707963f + 1.8707964f * $$14);
                } else if ($$10 >= 22.0f && $$10 < 26.0f) {
                    float $$15 = ($$10 - 22.0f) / 4.0f;
                    this.l.e = bgj.j($$13, this.l.e, 1.5707964f - 1.5707964f * $$15);
                    this.k.e = bgj.h($$12, this.k.e, 1.5707964f - 1.5707964f * $$15);
                    this.l.f = bgj.j($$13, this.l.f, (float)Math.PI);
                    this.k.f = bgj.h($$12, this.k.f, (float)Math.PI);
                    this.l.g = bgj.j($$13, this.l.g, (float)Math.PI);
                    this.k.g = bgj.h($$12, this.k.g, (float)Math.PI);
                }
            }
            float $$16 = 0.3f;
            float $$17 = 0.33333334f;
            this.n.e = bgj.h($$3, this.n.e, 0.3f * bgj.b((double)($$5 * 0.33333334f + (float)Math.PI)));
            this.m.e = bgj.h($$3, this.m.e, 0.3f * bgj.b((double)($$5 * 0.33333334f)));
        }
    }

    private void c(T $$0) {
        switch (((idy)$$0).f.ordinal()) {
            case 0: {
                this.k.f = 0.0f;
                break;
            }
            case 2: {
                this.a(this.k, true);
                break;
            }
            case 1: {
                this.k.e = this.k.e * 0.5f - 0.31415927f;
                this.k.f = 0.0f;
                break;
            }
            case 4: {
                this.k.e = this.k.e * 0.5f - (float)Math.PI;
                this.k.f = 0.0f;
                break;
            }
            case 10: {
                hcz.a(this.k, this.h, true, ((ich)$$0).a(chb.b), $$0);
                break;
            }
            case 3: {
                this.k.f = -0.1f + this.h.f;
                this.l.f = 0.1f + this.h.f + 0.4f;
                this.k.e = -1.5707964f + this.h.e;
                this.l.e = -1.5707964f + this.h.e;
                break;
            }
            case 5: {
                gzj.a(this.k, this.l, ((idy)$$0).ad, ((idy)$$0).ae, true);
                break;
            }
            case 6: {
                gzj.a(this.k, this.l, this.h, true);
                break;
            }
            case 9: {
                this.k.e = this.k.e * 0.5f - 0.62831855f;
                this.k.f = 0.0f;
                break;
            }
            case 7: {
                this.k.e = bgj.a(this.h.e - 1.9198622f - (((idy)$$0).ah ? 0.2617994f : 0.0f), -2.4f, 3.3f);
                this.k.f = this.h.f - 0.2617994f;
                break;
            }
            case 8: {
                this.k.e = bgj.a(this.h.e, -1.2f, 1.2f) - 1.4835298f;
                this.k.f = this.h.f - 0.5235988f;
            }
        }
    }

    private void d(T $$0) {
        switch (((idy)$$0).i.ordinal()) {
            case 0: {
                this.l.f = 0.0f;
                break;
            }
            case 2: {
                this.a(this.l, false);
                break;
            }
            case 1: {
                this.l.e = this.l.e * 0.5f - 0.31415927f;
                this.l.f = 0.0f;
                break;
            }
            case 4: {
                this.l.e = this.l.e * 0.5f - (float)Math.PI;
                this.l.f = 0.0f;
                break;
            }
            case 10: {
                hcz.a(this.l, this.h, false, ((ich)$$0).a(chb.a), $$0);
                break;
            }
            case 3: {
                this.k.f = -0.1f + this.h.f - 0.4f;
                this.l.f = 0.1f + this.h.f;
                this.k.e = -1.5707964f + this.h.e;
                this.l.e = -1.5707964f + this.h.e;
                break;
            }
            case 5: {
                gzj.a(this.k, this.l, ((idy)$$0).ad, ((idy)$$0).ae, false);
                break;
            }
            case 6: {
                gzj.a(this.k, this.l, this.h, false);
                break;
            }
            case 9: {
                this.l.e = this.l.e * 0.5f - 0.62831855f;
                this.l.f = 0.0f;
                break;
            }
            case 7: {
                this.l.e = bgj.a(this.h.e - 1.9198622f - (((idy)$$0).ah ? 0.2617994f : 0.0f), -2.4f, 3.3f);
                this.l.f = this.h.f + 0.2617994f;
                break;
            }
            case 8: {
                this.l.e = bgj.a(this.h.e, -1.2f, 1.2f) - 1.4835298f;
                this.l.f = this.h.f + 0.5235988f;
            }
        }
    }

    private void a(hdg $$0, boolean $$1) {
        $$0.e = $$0.e * 0.5f - 0.9424779f + bgj.a(this.h.e, -1.3962634f, 0.43633232f);
        $$0.f = ($$1 ? -30.0f : 30.0f) * ((float)Math.PI / 180) + bgj.a(this.h.f, -0.5235988f, 0.5235988f);
    }

    protected void b(T $$0) {
        float $$1 = ((idy)$$0).m;
        if ($$1 <= 0.0f) {
            return;
        }
        this.j.f = bgj.a((double)(bgj.a($$1) * ((float)Math.PI * 2))) * 0.2f;
        if (((idy)$$0).af == chb.a) {
            this.j.f *= -1.0f;
        }
        float $$2 = ((idy)$$0).aA;
        this.k.d = bgj.a((double)this.j.f) * 5.0f * $$2;
        this.k.b = -bgj.b((double)this.j.f) * 5.0f * $$2;
        this.l.d = -bgj.a((double)this.j.f) * 5.0f * $$2;
        this.l.b = bgj.b((double)this.j.f) * 5.0f * $$2;
        this.k.f += this.j.f;
        this.l.f += this.j.f;
        this.l.e += this.j.f;
        switch (((idy)$$0).l) {
            case b: {
                float $$3 = bfi.w($$1);
                float $$4 = bgj.a((double)($$3 * (float)Math.PI));
                float $$5 = bgj.a((double)($$1 * (float)Math.PI)) * -(this.h.e - 0.7f) * 0.75f;
                hdg $$6 = this.a(((idy)$$0).af);
                $$6.e -= $$4 * 1.2f + $$5;
                $$6.f += this.j.f * 2.0f;
                $$6.g += bgj.a((double)($$1 * (float)Math.PI)) * -0.4f;
                break;
            }
            case a: {
                break;
            }
            case c: {
                hcz.a(this, $$0);
            }
        }
    }

    private float a(float $$0) {
        return -65.0f * $$0 + $$0 * $$0;
    }

    @Override
    public void a(boolean $$0) {
        this.h.k = $$0;
        this.i.k = $$0;
        this.j.k = $$0;
        this.k.k = $$0;
        this.l.k = $$0;
        this.m.k = $$0;
        this.n.k = $$0;
    }

    @Override
    public void a(idy $$0, chb $$1, fzm $$2) {
        this.o.a($$2);
        this.a($$1).a($$2);
    }

    public hdg a(chb $$0) {
        if ($$0 == chb.a) {
            return this.l;
        }
        return this.k;
    }

    @Override
    public hdg a() {
        return this.h;
    }

    public static sealed class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false, false);
        public static final /* enum */ a b = new a(false, false);
        public static final /* enum */ a c = new a(false, false);
        public static final /* enum */ a d = new a(true, true);
        public static final /* enum */ a e = new a(false, true);
        public static final /* enum */ a f = new a(true, true);
        public static final /* enum */ a g = new a(true, true);
        public static final /* enum */ a h = new a(false, false);
        public static final /* enum */ a i = new a(false, false);
        public static final /* enum */ a j = new a(false, false);
        public static final /* enum */ a k = new a(false, true){

            @Override
            public <S extends ich> void a(S $$0, fzm $$1, float $$2, chb $$3, dlt $$4) {
                hcz.a($$0, $$1, $$2, $$3, $$4);
            }
        };
        private final boolean l;
        private final boolean m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(boolean $$0, boolean $$1) {
            this.l = $$0;
            this.m = $$1;
        }

        public boolean a() {
            return this.l;
        }

        public boolean b() {
            return this.m;
        }

        public <S extends ich> void a(S $$0, fzm $$1, float $$2, chb $$3, dlt $$4) {
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e, f, g, h, i, j, k};
        }

        static {
            n = gzo$a.c();
        }
    }
}

