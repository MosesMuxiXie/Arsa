/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class ebu
extends dzf {
    public static final MapCodec<ebu> b = ebu.b(ebu::new);
    public static final epf<epl> c = eox.al;
    public static final eoy d = eox.A;
    private static final int e = 20;

    public MapCodec<ebu> a() {
        return b;
    }

    public ebu(eog.d $$0) {
        super(true, $$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(d, false)).b(c, epl.a)).b(a, false));
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        if ($$0.c(d).booleanValue()) {
            return;
        }
        this.a($$1, $$2, $$0);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.c(d).booleanValue()) {
            return;
        }
        this.a((dwo)$$1, $$2, $$0);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(d) != false ? 15 : 0;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if (!$$0.c(d).booleanValue()) {
            return 0;
        }
        return $$3 == iz.b ? 15 : 0;
    }

    private void a(dwo $$02, is $$1, eoh $$2) {
        if (!this.a($$2, (dwr)$$02, $$1)) {
            return;
        }
        boolean $$3 = $$2.c(d);
        boolean $$4 = false;
        List<dgi> $$5 = this.a($$02, $$1, dgi.class, (cgk $$0) -> true);
        if (!$$5.isEmpty()) {
            $$4 = true;
        }
        if ($$4 && !$$3) {
            eoh $$6 = (eoh)$$2.b(d, true);
            $$02.a($$1, $$6, 3);
            this.b($$02, $$1, $$6, true);
            $$02.a($$1, this);
            $$02.a($$1.e(), this);
            $$02.b($$1, $$2, $$6);
        }
        if (!$$4 && $$3) {
            eoh $$7 = (eoh)$$2.b(d, false);
            $$02.a($$1, $$7, 3);
            this.b($$02, $$1, $$7, false);
            $$02.a($$1, this);
            $$02.a($$1.e(), this);
            $$02.b($$1, $$2, $$7);
        }
        if ($$4) {
            $$02.a($$1, (dzq)this, 20);
        }
        $$02.b($$1, this);
    }

    protected void b(dwo $$0, is $$1, eoh $$2, boolean $$3) {
        efz $$4 = new efz($$0, $$1, $$2);
        List<is> $$5 = $$4.a();
        for (is $$6 : $$5) {
            eoh $$7 = $$0.a_($$6);
            $$0.a($$7, $$6, $$7.b(), null, false);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        eoh $$5 = this.a($$0, $$1, $$2, $$4);
        this.a($$1, $$2, $$5);
    }

    @Override
    public epk<epl> c() {
        return c;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$02, dwo $$1, is $$2, iz $$3) {
        if ($$02.c(d).booleanValue()) {
            List<dgn> $$4 = this.a($$1, $$2, dgn.class, (cgk $$0) -> true);
            if (!$$4.isEmpty()) {
                return $$4.get(0).e().b();
            }
            List<dgi> $$5 = this.a($$1, $$2, dgi.class, cgs.d);
            if (!$$5.isEmpty()) {
                return dhi.b((ccv)((Object)$$5.get(0)));
            }
        }
        return 0;
    }

    private <T extends dgi> List<T> a(dwo $$0, is $$1, Class<T> $$2, Predicate<cgk> $$3) {
        return $$0.a($$2, this.a($$1), $$3);
    }

    private fth a(is $$0) {
        double $$1 = 0.2;
        return new fth((double)$$0.u() + 0.2, $$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        epl $$2 = $$0.c(c);
        epl $$3 = this.a($$2, $$1);
        return (eoh)$$0.b(c, $$3);
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        epl $$2 = $$0.c(c);
        epl $$3 = this.a($$2, $$1);
        return (eoh)$$0.b(c, $$3);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d, a);
    }
}

