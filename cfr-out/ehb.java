/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class ehb
extends dzc
implements eha,
ehe,
ehg {
    public static final MapCodec<ehb> a = ehb.b(ehb::new);
    public static final eoy b = eox.A;
    public static final epf<iz> c = eox.T;
    public static final epf<epp> d = eox.aj;
    public static final eoy e = eox.I;
    private static final Map<iz, fug> f = fud.c(fud.a(dzq.a(0.0, 12.0, 11.0, 16.0, 16.0, 13.0), dzq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0), dzq.a(0.0, 0.0, 11.0, 16.0, 4.0, 13.0)));

    public MapCodec<ehb> a() {
        return a;
    }

    public ehb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(c, iz.c)).b(b, false)).b(d, epp.a)).b(e, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f.get($$0.c(c));
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return $$1 == flq.b && $$0.y().a(bdv.a);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new emq($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, b, d, e);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
        this.a_($$1, $$2, $$0);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        boolean $$6 = $$1.I($$2);
        if ($$0.c(b) != $$6) {
            eoh $$7 = (eoh)$$0.b(b, $$6);
            if (!$$6) {
                $$7 = (eoh)$$7.b(d, epp.a);
            }
            $$1.a($$2, $$7, 3);
            this.a((dwp)$$1, $$2, $$6 ? bda.zz : bda.zB);
            $$1.a($$6 ? etk.a : etk.e, $$2, etk.a.a($$7));
        }
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)((eoh)((eoh)this.m().b(c, $$0.g().g())).b(b, $$0.q().I($$0.a()))).b(e, $$1.a() == flc.c);
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(c, $$1.a($$0.c(c)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public int c() {
        return 3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        block13: {
            block12: {
                elb elb2 = $$2.c_($$3);
                if (!(elb2 instanceof emq)) break block12;
                emq $$7 = (emq)elb2;
                if (!$$5.equals((Object)cdb.b)) break block13;
            }
            return cdc.e;
        }
        OptionalInt $$9 = this.a($$6, $$1.c(c));
        if ($$9.isEmpty()) {
            return cdc.e;
        }
        ddl $$10 = $$4.gK();
        if ($$2.B_()) {
            return $$10.h().f() ? cdc.e : cdc.a;
        }
        if (!$$1.c(b).booleanValue()) {
            void $$8;
            boolean $$11 = ehb.a($$0, $$4, (emq)$$8, $$9.getAsInt(), $$10);
            if ($$11) {
                this.a((dwp)$$2, $$3, $$0.f() ? bda.zJ : bda.zH);
            } else if (!$$0.f()) {
                this.a((dwp)$$2, $$3, bda.zG);
            } else {
                return cdc.e;
            }
            return cdc.a.a($$0);
        }
        dlt $$12 = $$10.h();
        boolean $$13 = this.a($$2, $$3, $$10);
        if (!$$13) {
            return cdc.c;
        }
        this.a((dwp)$$2, $$3, bda.zE);
        if ($$12 == $$10.h()) {
            return cdc.a;
        }
        return cdc.a.a($$10.h());
    }

    private static boolean a(dlt $$0, ddm $$1, emq $$2, int $$3, ddl $$4) {
        dlt $$5 = $$2.d($$3, $$0);
        dlt $$6 = $$1.gv() && $$5.f() ? $$0.v() : $$5;
        $$4.a($$4.g(), $$6);
        $$4.e();
        $$2.a((jd.c<etk>)($$6.c(ki.g) && !$$6.a(ki.g).b() ? null : etk.C));
        return !$$5.f();
    }

    private boolean a(dwo $$0, is $$1, ddl $$2) {
        List<is> $$3 = this.a($$0, $$1);
        if ($$3.isEmpty()) {
            return false;
        }
        boolean $$4 = false;
        for (int $$5 = 0; $$5 < $$3.size(); ++$$5) {
            emq $$6 = (emq)$$0.c_($$3.get($$5));
            if ($$6 == null) continue;
            for (int $$7 = 0; $$7 < $$6.b(); ++$$7) {
                int $$8 = 9 - ($$3.size() - $$5) * $$6.b() + $$7;
                if ($$8 < 0 || $$8 > $$2.b()) continue;
                dlt $$9 = $$2.b($$8);
                dlt $$10 = $$6.d($$7, $$9);
                if ($$9.f() && $$10.f()) continue;
                $$2.a($$8, $$10);
                $$4 = true;
            }
            $$2.e();
            $$6.a(etk.r);
        }
        return $$4;
    }

    @Override
    public epp p(eoh $$0) {
        return $$0.c(d);
    }

    @Override
    public eoh a(eoh $$0, epp $$1) {
        return (eoh)$$0.b(d, $$1);
    }

    @Override
    public iz r(eoh $$0) {
        return $$0.c(c);
    }

    @Override
    public boolean s(eoh $$0) {
        return $$0.a(bdp.n) && $$0.b(b) && $$0.c(b) != false;
    }

    @Override
    public int d() {
        return 3;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$0.c(b).booleanValue()) {
            this.a((dwp)$$1, $$2, $$0, $$3);
        } else {
            this.a_($$1, $$2, $$0);
        }
    }

    private void a(dwp $$0, is $$1, bcz $$2) {
        $$0.a(null, $$1, $$2, bdb.e, 1.0f, 1.0f);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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
        if ($$3 != $$0.c(c).g()) {
            return 0;
        }
        elb elb2 = $$1.c_($$2);
        if (elb2 instanceof emq) {
            emq $$4 = (emq)elb2;
            int $$5 = $$4.a(0).f() ? 0 : 1;
            int $$6 = $$4.a(1).f() ? 0 : 1;
            int $$7 = $$4.a(2).f() ? 0 : 1;
            return $$5 | $$6 << 1 | $$7 << 2;
        }
        return 0;
    }
}

