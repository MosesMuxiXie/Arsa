/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class dyu
extends dzq
implements dzt {
    public static final MapCodec<dyu> a = dyu.b(dyu::new);
    private static final fug D = dzq.b(6.0, 0.0, 16.0);
    private static final fug R = dzq.b(10.0, 0.0, 16.0);
    private static final fug S = dzq.b(3.0, 0.0, 16.0);
    public static final eph b = eox.au;
    public static final epf<eot> c = eox.bp;
    public static final eph d = eox.aY;
    public static final int e = 16;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 0;
    public static final int i = 1;

    public MapCodec<dyu> a() {
        return a;
    }

    public dyu(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, 0)).b(c, eot.a)).b(d, 0));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        fug $$4 = $$0.c(c) == eot.c ? R : D;
        return $$4.a($$0.a($$2));
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return S.a($$0.a($$2));
    }

    @Override
    protected boolean a_(eoh $$0, dvt $$1, is $$2) {
        return false;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        if (!$$1.c()) {
            return null;
        }
        eoh $$2 = $$0.q().a_($$0.a().e());
        if ($$2.a(bdp.aK)) {
            if ($$2.a(dzs.nV)) {
                return (eoh)this.m().b(b, 0);
            }
            if ($$2.a(dzs.nW)) {
                int $$3 = $$2.c(b) > 0 ? 1 : 0;
                return (eoh)this.m().b(b, $$3);
            }
            eoh $$4 = $$0.q().a_($$0.a().d());
            if ($$4.a(dzs.nW)) {
                return (eoh)this.m().b(b, $$4.c(b));
            }
            return dzs.nV.m();
        }
        return null;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(d) == 0;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4;
        if ($$0.c(d) != 0) {
            return;
        }
        if ($$3.a(3) == 0 && $$1.A($$2.d()) && $$1.b($$2.d(), 0) >= 9 && ($$4 = this.b($$1, $$2) + 1) < 16) {
            this.a($$0, (dwo)$$1, $$2, $$3, $$4);
        }
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.e()).a(bdp.aK);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        if ($$4 == iz.b && $$6.a(dzs.nW) && $$6.c(b) > $$0.c(b)) {
            return (eoh)$$0.a(b);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        int $$4;
        int $$3 = this.a((dvt)$$0, $$1);
        return $$3 + ($$4 = this.b($$0, $$1)) + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        int $$4 = this.a((dvt)$$0, $$2);
        int $$5 = this.b($$0, $$2);
        int $$6 = $$4 + $$5 + 1;
        int $$7 = 1 + $$1.a(2);
        for (int $$8 = 0; $$8 < $$7; ++$$8) {
            is $$9 = $$2.b($$4);
            eoh $$10 = $$0.a_($$9);
            if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.A($$9.d())) {
                return;
            }
            this.a($$10, (dwo)$$0, $$9, $$1, $$6);
            ++$$4;
            ++$$6;
        }
    }

    protected void a(eoh $$0, dwo $$1, is $$2, bgr $$3, int $$4) {
        eoh $$5 = $$1.a_($$2.e());
        is $$6 = $$2.c(2);
        eoh $$7 = $$1.a_($$6);
        eot $$8 = eot.a;
        if ($$4 >= 1) {
            if (!$$5.a(dzs.nW) || $$5.c(c) == eot.a) {
                $$8 = eot.b;
            } else if ($$5.a(dzs.nW) && $$5.c(c) != eot.a) {
                $$8 = eot.c;
                if ($$7.a(dzs.nW)) {
                    $$1.a($$2.e(), (eoh)$$5.b(c, eot.b), 3);
                    $$1.a($$6, (eoh)$$7.b(c, eot.a), 3);
                }
            }
        }
        int $$9 = $$0.c(b) == 1 || $$7.a(dzs.nW) ? 1 : 0;
        int $$10 = $$4 >= 11 && $$3.i() < 0.25f || $$4 == 15 ? 1 : 0;
        $$1.a($$2.d(), (eoh)((eoh)((eoh)this.m().b(b, $$9)).b(c, $$8)).b(d, $$10), 3);
    }

    protected int a(dvt $$0, is $$1) {
        int $$2;
        for ($$2 = 0; $$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dzs.nW); ++$$2) {
        }
        return $$2;
    }

    protected int b(dvt $$0, is $$1) {
        int $$2;
        for ($$2 = 0; $$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dzs.nW); ++$$2) {
        }
        return $$2;
    }
}

