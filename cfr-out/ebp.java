/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ebp
extends ejg
implements dzt {
    public static final MapCodec<ebp> d = ebp.b(ebp::new);
    public static final int e = 7;
    public static final eph f = eox.az;
    private static final fug[] a = dzq.a(7, (int $$0) -> dzq.b(16.0, 0.0, 2 + $$0 * 2));

    public MapCodec<? extends ebp> a() {
        return d;
    }

    protected ebp(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(this.b(), 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a[this.h($$0)];
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(dzs.cZ);
    }

    protected eph b() {
        return f;
    }

    public int c() {
        return 7;
    }

    public int h(eoh $$0) {
        return $$0.c(this.b());
    }

    public eoh b(int $$0) {
        return (eoh)this.m().b(this.b(), $$0);
    }

    public final boolean i(eoh $$0) {
        return this.h($$0) >= this.c();
    }

    @Override
    protected boolean f(eoh $$0) {
        return !this.i($$0);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        float $$5;
        int $$4;
        if ($$1.b($$2, 0) >= 9 && ($$4 = this.h($$0)) < this.c() && $$3.a((int)(25.0f / ($$5 = ebp.a(this, $$1, $$2))) + 1) == 0) {
            $$1.a($$2, this.b($$4 + 1), 2);
        }
    }

    public void b(dwo $$0, is $$1, eoh $$2) {
        int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
        $$0.a($$1, this.b($$3), 2);
    }

    protected int a(dwo $$0) {
        return bgj.a($$0.y, 2, 5);
    }

    protected static float a(dzq $$0, dvt $$1, is $$2) {
        boolean $$14;
        float $$3 = 1.0f;
        is $$4 = $$2.e();
        for (int $$5 = -1; $$5 <= 1; ++$$5) {
            for (int $$6 = -1; $$6 <= 1; ++$$6) {
                float $$7 = 0.0f;
                eoh $$8 = $$1.a_($$4.b($$5, 0, $$6));
                if ($$8.a(dzs.cZ)) {
                    $$7 = 1.0f;
                    if ($$8.c(ecs.b) > 0) {
                        $$7 = 3.0f;
                    }
                }
                if ($$5 != 0 || $$6 != 0) {
                    $$7 /= 4.0f;
                }
                $$3 += $$7;
            }
        }
        is $$9 = $$2.f();
        is $$10 = $$2.g();
        is $$11 = $$2.h();
        is $$12 = $$2.i();
        boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
        boolean bl2 = $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
        if ($$13 && $$14) {
            $$3 /= 2.0f;
        } else {
            boolean $$15;
            boolean bl3 = $$15 = $$1.a_($$11.f()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$12.g()).a($$0) || $$1.a_($$11.g()).a($$0);
            if ($$15) {
                $$3 /= 2.0f;
            }
        }
        return $$3;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return ebp.a($$1, $$2) && super.a($$0, $$1, $$2);
    }

    protected static boolean a(dwr $$0, is $$1) {
        return $$0.b($$1, 0) >= 8;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1 instanceof axf) {
            axf $$6 = (axf)$$1;
            if ($$3 instanceof dad && $$6.U().a(eua.F).booleanValue()) {
                $$6.a($$2, true, $$3);
            }
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    protected dwn d() {
        return dlx.rb;
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(this.d());
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return !this.i($$2);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        this.b($$0, $$2, $$3);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{f});
    }
}

