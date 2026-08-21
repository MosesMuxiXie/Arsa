/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Iterator;

public class egp
extends dzq
implements ehg {
    public static final MapCodec<egp> a = egp.b(egp::new);
    private static final int f = 1;
    private static final fug g = fud.a(dzq.b(16.0, 14.0, 16.0), fud.c(dzq.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fud.a(), fud::a));
    private static final fug h = dzq.b(16.0, 0.0, 2.0);
    private static final fug i = fud.a(g, h, fud.c(dzq.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fud.a(), fud::a));
    private static final fug D = fud.b().a(0.0, -1.0, 0.0).d();
    public static final int b = 7;
    public static final eph c = eox.ba;
    public static final eoy d = eox.I;
    public static final eoy e = eox.d;

    public MapCodec<egp> a() {
        return a;
    }

    protected egp(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(c, 7)).b(d, false)).b(e, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d, e);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        if (!$$3.a($$0.b().h())) {
            return $$0.c(e) != false ? i : g;
        }
        return fud.b();
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2) {
        return fud.b();
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        return $$1.n().a(this.h());
    }

    @Override
    public eoh a(dpu $$0) {
        is $$1 = $$0.a();
        dwo $$2 = $$0.q();
        int $$3 = egp.a($$2, $$1);
        return (eoh)((eoh)((eoh)this.m().b(d, $$2.b_($$1).a() == flc.c)).b(c, $$3)).b(e, this.a((dvt)$$2, $$1, $$3));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if (!$$1.B_()) {
            $$1.a($$2, (dzq)this, 1);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if (!$$1.B_()) {
            $$2.a($$3, this, 1);
        }
        return $$0;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4 = egp.a($$1, $$2);
        eoh $$5 = (eoh)((eoh)$$0.b(c, $$4)).b(e, this.a((dvt)$$1, $$2, $$4));
        if ($$5.c(c) == 7) {
            if ($$0.c(c) == 7) {
                czk.a($$1, $$2, $$5);
            } else {
                $$1.b($$2, true);
            }
        } else if ($$0 != $$5) {
            $$1.a($$2, $$5, 3);
        }
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return egp.a($$1, $$2) < 7;
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        if ($$3.e()) {
            return fud.a();
        }
        if (!$$3.a(fud.b(), $$2, true) || $$3.c()) {
            if ($$0.c(c) != 0 && $$0.c(e).booleanValue() && $$3.a(D, $$2, true)) {
                return h;
            }
            return fud.a();
        }
        return g;
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    private boolean a(dvt $$0, is $$1, int $$2) {
        return $$2 > 0 && !$$0.a_($$1.e()).a(this);
    }

    public static int a(dvt $$0, is $$1) {
        iz $$5;
        eoh $$6;
        is.a $$2 = $$1.k().c(iz.a);
        eoh $$3 = $$0.a_($$2);
        int $$4 = 7;
        if ($$3.a(dzs.oP)) {
            $$4 = $$3.c(c);
        } else if ($$3.c($$0, (is)$$2, iz.b)) {
            return 0;
        }
        Iterator<iz> iterator = iz.c.a.iterator();
        while (iterator.hasNext() && (!($$6 = $$0.a_($$2.a((jy)$$1, $$5 = iterator.next()))).a(dzs.oP) || ($$4 = Math.min($$4, $$6.c(c) + 1)) != 1)) {
        }
        return $$4;
    }
}

