/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class eej
extends dzc {
    public static final MapCodec<eej> a = eej.b(eej::new);
    public static final epf<iz> b = edt.f;
    public static final eoy c = eox.A;
    public static final eoy d = eox.r;
    private static final fug e = fud.a(dzq.b(16.0, 0.0, 2.0), dzq.b(8.0, 2.0, 14.0));
    private static final Map<iz, fug> f = fud.c(fud.a(dzq.a(16.0, 10.0, 14.0, 1.0, 5.333333), dzq.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dzq.a(16.0, 14.0, 18.0, 9.666667, 14.0), e));
    private static final int g = 2;

    public MapCodec<eej> a() {
        return a;
    }

    protected eej(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false)).b(d, false));
    }

    @Override
    protected fug d_(eoh $$0) {
        return e;
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    public eoh a(dpu $$0) {
        dpf<eld<?>> $$5;
        dwo $$1 = $$0.q();
        dlt $$2 = $$0.n();
        ddm $$3 = $$0.o();
        boolean $$4 = false;
        if (!$$1.B_() && $$3 != null && $$3.hi() && ($$5 = $$2.a(ki.ah)) != null && $$5.a("Book")) {
            $$4 = true;
        }
        return (eoh)((eoh)this.m().b(b, $$0.g().g())).b(d, $$4);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f.get($$0.c(b));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emi($$0, $$1);
    }

    public static boolean a(@Nullable chl $$0, dwo $$1, is $$2, eoh $$3, dlt $$4) {
        if (!$$3.c(d).booleanValue()) {
            if (!$$1.B_()) {
                eej.b($$0, $$1, $$2, $$3, $$4);
            }
            return true;
        }
        return false;
    }

    private static void b(@Nullable chl $$0, dwo $$1, is $$2, eoh $$3, dlt $$4) {
        elb $$5 = $$1.c_($$2);
        if ($$5 instanceof emi) {
            emi $$6 = (emi)$$5;
            $$6.b($$4.b(1, $$0));
            eej.a((cgk)$$0, $$1, $$2, $$3, true);
            $$1.a(null, $$2, bda.cL, bdb.e, 1.0f, 1.0f);
        }
    }

    public static void a(@Nullable cgk $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        eoh $$5 = (eoh)((eoh)$$3.b(c, false)).b(d, $$4);
        $$1.a($$2, $$5, 3);
        $$1.a(etk.c, $$2, etk.a.a($$0, $$5));
        eej.b($$1, $$2, $$3);
    }

    public static void a(dwo $$0, is $$1, eoh $$2) {
        eej.a($$0, $$1, $$2, true);
        $$0.a($$1, $$2.b(), 2);
        $$0.c(1043, $$1, 0);
    }

    private static void a(dwo $$0, is $$1, eoh $$2, boolean $$3) {
        $$0.a($$1, (eoh)$$2.b(c, $$3), 3);
        eej.b($$0, $$1, $$2);
    }

    private static void b(dwo $$0, is $$1, eoh $$2) {
        fmj $$3 = fmf.a($$0, $$2.c(b).g(), iz.b);
        $$0.a($$1.e(), $$2.b(), $$3);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        eej.a((dwo)$$1, $$2, $$0, false);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if ($$0.c(c).booleanValue()) {
            eej.b($$1, $$2, $$0);
        }
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(c) != false ? 15 : 0;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$3 == iz.b && $$0.c(c) != false ? 15 : 0;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        elb $$4;
        if ($$0.c(d).booleanValue() && ($$4 = $$1.c_($$2)) instanceof emi) {
            return ((emi)$$4).k();
        }
        return 0;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$1.c(d).booleanValue()) {
            return cdc.f;
        }
        if ($$0.a(bdy.bs)) {
            return eej.a($$4, $$2, $$3, $$1, $$0) ? cdc.a : cdc.e;
        }
        if ($$0.f() && $$5 == cdb.a) {
            return cdc.e;
        }
        return cdc.f;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$0.c(d).booleanValue()) {
            if (!$$1.B_()) {
                this.a($$1, $$2, $$3);
            }
            return cdc.a;
        }
        return cdc.c;
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$2) {
        if (!$$0.c(d).booleanValue()) {
            return null;
        }
        return super.a($$0, $$1, $$2);
    }

    private void a(dwo $$0, is $$1, ddm $$2) {
        elb $$3 = $$0.c_($$1);
        if ($$3 instanceof emi) {
            $$2.a((emi)$$3);
            $$2.a(bdk.aw);
        }
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

