/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class eav
extends dzc
implements eha {
    public static final MapCodec<eav> a = eav.b(eav::new);
    public static final epf<iz> b = edt.f;
    public static final eoy c = eox.bu;
    public static final eoy d = eox.bv;
    public static final eoy e = eox.bw;
    public static final eoy f = eox.bx;
    public static final eoy g = eox.by;
    public static final eoy h = eox.bz;
    private static final int D = 6;
    private static final int R = 3;
    public static final List<eoy> i = List.of(c, d, e, f, g, h);

    public MapCodec<eav> a() {
        return a;
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public int c() {
        return 3;
    }

    public eav(eog.d $$0) {
        super($$0);
        eoh $$1 = (eoh)((eoh)this.C.b()).b(b, iz.c);
        for (eoy $$2 : i) {
            $$1 = (eoh)$$1.b($$2, false);
        }
        this.l($$1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        void $$8;
        elb elb2 = $$2.c_($$3);
        if (!(elb2 instanceof ell)) {
            return cdc.e;
        }
        ell $$7 = (ell)elb2;
        if (!$$0.a(bdy.bt)) {
            return cdc.f;
        }
        OptionalInt $$9 = this.a($$6, $$1.c(b));
        if ($$9.isEmpty()) {
            return cdc.e;
        }
        if (((Boolean)$$1.c(i.get($$9.getAsInt()))).booleanValue()) {
            return cdc.f;
        }
        eav.a($$2, $$3, $$4, (ell)$$8, $$0, $$9.getAsInt());
        return cdc.a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        void $$6;
        elb elb2 = $$1.c_($$2);
        if (!(elb2 instanceof ell)) {
            return cdc.e;
        }
        ell $$5 = (ell)elb2;
        OptionalInt $$7 = this.a($$4, $$0.c(b));
        if ($$7.isEmpty()) {
            return cdc.e;
        }
        if (!((Boolean)$$0.c(i.get($$7.getAsInt()))).booleanValue()) {
            return cdc.c;
        }
        eav.a($$1, $$2, $$3, (ell)$$6, $$7.getAsInt());
        return cdc.a;
    }

    private static void a(dwo $$0, is $$1, ddm $$2, ell $$3, dlt $$4, int $$5) {
        if ($$0.B_()) {
            return;
        }
        $$2.b(bdk.c.b($$4.h()));
        bcz $$6 = $$4.a(dlx.wI) ? bda.fB : bda.fA;
        $$3.a($$5, $$4.b(1, (chl)$$2));
        $$0.a(null, $$1, $$6, bdb.e, 1.0f, 1.0f);
    }

    private static void a(dwo $$0, is $$1, ddm $$2, ell $$3, int $$4) {
        if ($$0.B_()) {
            return;
        }
        dlt $$5 = $$3.a($$4, 1);
        bcz $$6 = $$5.a(dlx.wI) ? bda.fE : bda.fD;
        $$0.a(null, $$1, $$6, bdb.e, 1.0f, 1.0f);
        if (!$$2.gK().g($$5)) {
            $$2.a($$5, false);
        }
        $$0.a((cgk)$$2, etk.c, $$1);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new ell($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
        i.forEach($$1 -> $$0.a(new epk[]{$$1}));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.g().g());
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        if ($$1.B_()) {
            return 0;
        }
        elb elb2 = $$1.c_($$2);
        if (elb2 instanceof ell) {
            ell $$4 = (ell)elb2;
            return $$4.k() + 1;
        }
        return 0;
    }
}

