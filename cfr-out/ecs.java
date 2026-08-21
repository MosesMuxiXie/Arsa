/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ecs
extends dzq {
    public static final MapCodec<ecs> a = ecs.b(ecs::new);
    public static final eph b = eox.aU;
    private static final fug d = dzq.b(16.0, 0.0, 15.0);
    public static final int c = 7;

    public MapCodec<ecs> a() {
        return a;
    }

    protected ecs(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, 0));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && !$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.d());
        return !$$3.e() || $$3.b() instanceof ecu || $$3.b() instanceof enx;
    }

    @Override
    public eoh a(dpu $$0) {
        if (!this.m().a((dwr)$$0.q(), $$0.a())) {
            return dzs.j.m();
        }
        return super.a($$0);
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            ecs.a(null, $$0, $$1, $$2);
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4 = $$0.c(b);
        if (ecs.a($$1, $$2) || $$1.v($$2.d())) {
            if ($$4 < 7) {
                $$1.a($$2, (eoh)$$0.b(b, 7), 2);
            }
        } else if ($$4 > 0) {
            $$1.a($$2, (eoh)$$0.b(b, $$4 - 1), 2);
        } else if (!ecs.a((dvt)$$1, $$2)) {
            ecs.a(null, $$0, $$1, $$2);
        }
    }

    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        if ($$0 instanceof axf) {
            axf $$5 = (axf)$$0;
            if ((double)$$0.y.i() < $$4 - 0.5 && $$3 instanceof chl && ($$3 instanceof ddm || $$5.U().a(eua.F).booleanValue()) && $$3.dF() * $$3.dF() * $$3.dG() > 0.512f) {
                ecs.a($$3, $$1, $$0, $$2);
            }
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    public static void a(@Nullable cgk $$0, eoh $$1, dwo $$2, is $$3) {
        eoh $$4 = ecs.a($$1, dzs.j.m(), $$2, $$3);
        $$2.c($$3, $$4);
        $$2.a(etk.c, $$3, etk.a.a($$0, $$4));
    }

    private static boolean a(dvt $$0, is $$1) {
        return $$0.a_($$1.d()).a(bdp.cP);
    }

    private static boolean a(dwr $$0, is $$1) {
        for (is $$2 : is.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
            if (!$$0.b_($$2).a(bdv.a)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

