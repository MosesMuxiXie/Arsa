/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class dzk
extends dzc {
    public static final MapCodec<dzk> a = dzk.b(dzk::new);
    public static final epf<iz> b = edt.f;
    public static final eph c = eox.aR;
    public static final int d = 5;

    public MapCodec<dzk> a() {
        return a;
    }

    public dzk(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(c, 0)).b(b, iz.c));
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return $$0.c(c);
    }

    @Override
    public void a(dwo $$0, ddm $$1, is $$2, eoh $$3, @Nullable elb $$4, dlt $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if (!$$0.B_() && $$4 instanceof eky) {
            eky $$6 = (eky)$$4;
            if (!dsq.a($$5, bds.q)) {
                $$6.a($$1, $$3, eky.b.c);
                ccy.a($$3, $$0, $$2);
                this.a($$0, $$2);
            }
            aj.M.a((axg)$$1, $$3, $$5, $$6.f());
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        this.a((dwo)$$1, $$2);
    }

    private void a(dwo $$0, is $$1) {
        fth $$2 = new fth($$1).c(8.0, 6.0, 8.0);
        List<ctw> $$3 = $$0.a(ctw.class, $$2);
        if (!$$3.isEmpty()) {
            List<ddm> $$4 = $$0.a(ddm.class, $$2);
            if ($$4.isEmpty()) {
                return;
            }
            for (ctw $$5 : $$3) {
                if ($$5.ag_() != null) continue;
                ddm $$6 = bhs.a($$4, $$0.y);
                $$5.g($$6);
            }
        }
    }

    public static void a(axf $$0, dlt $$12, eoh $$22, @Nullable elb $$3, @Nullable cgk $$4, is $$5) {
        dzk.a($$0, fnv.aN, $$22, $$3, $$12, $$4, ($$1, $$2) -> dzk.a((dwo)$$1, $$5, $$2));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        block11: {
            $$7 = $$1.c(dzk.c);
            $$8 = false;
            if ($$7 < 5) break block11;
            $$9 = $$0.h();
            if (!($$2 instanceof axf)) ** GOTO lbl-1000
            $$10 = (axf)$$2;
            if ($$0.a(dlx.tZ)) {
                dzk.a($$10, $$0, $$1, $$2.c_($$3), (cgk)$$4, $$3);
                $$2.a(null, $$4.dP(), $$4.dR(), $$4.dV(), bda.cj, bdb.e, 1.0f, 1.0f);
                $$0.a(1, (chl)$$4, $$5.a());
                $$8 = true;
                $$2.a((cgk)$$4, etk.M, $$3);
            } else if ($$0.a(dlx.uo)) {
                $$0.h(1);
                $$2.a((cgk)$$4, $$4.dP(), $$4.dR(), $$4.dV(), bda.cO, bdb.e, 1.0f, 1.0f);
                if ($$0.f()) {
                    $$4.a($$5, new dlt(dlx.zi));
                } else if (!$$4.gK().g(new dlt(dlx.zi))) {
                    $$4.a(new dlt(dlx.zi), false);
                }
                $$8 = true;
                $$2.a((cgk)$$4, etk.y, $$3);
            }
            if (!$$2.B_() && $$8) {
                $$4.b(bdk.c.b($$9));
            }
        }
        if ($$8) {
            if (!eag.a($$2, $$3)) {
                if (this.b($$2, $$3)) {
                    this.a($$2, $$3);
                }
                this.a($$2, $$1, $$3, $$4, eky.b.c);
            } else {
                this.a($$2, $$1, $$3);
            }
            return cdc.a;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    private boolean b(dwo $$0, is $$1) {
        elb $$2 = $$0.c_($$1);
        if ($$2 instanceof eky) {
            eky $$3 = (eky)$$2;
            return !$$3.c();
        }
        return false;
    }

    public void a(dwo $$0, eoh $$1, is $$2, @Nullable ddm $$3, eky.b $$4) {
        this.a($$0, $$1, $$2);
        elb $$5 = $$0.c_($$2);
        if ($$5 instanceof eky) {
            eky $$6 = (eky)$$5;
            $$6.a($$3, $$1, $$4);
        }
    }

    public void a(dwo $$0, eoh $$1, is $$2) {
        $$0.a($$2, (eoh)$$1.b(c, 0), 3);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$0.c(c) >= 5) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; ++$$4) {
                this.a($$1, $$2, $$0);
            }
        }
    }

    private void a(dwo $$0, is $$1, eoh $$2) {
        if (!$$2.y().c() || $$0.y.i() < 0.3f) {
            return;
        }
        fug $$3 = $$2.g($$0, $$1);
        double $$4 = $$3.c(iz.a.b);
        if ($$4 >= 1.0 && !$$2.a(bdp.aE)) {
            double $$5 = $$3.b(iz.a.b);
            if ($$5 > 0.0) {
                this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
                is $$6 = $$1.e();
                eoh $$7 = $$0.a_($$6);
                fug $$8 = $$7.g($$0, $$6);
                double $$9 = $$8.c(iz.a.b);
                if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                    this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
                }
            }
        }
    }

    private void a(dwo $$0, is $$1, fug $$2, double $$3) {
        this.a($$0, (double)$$1.u() + $$2.b(iz.a.a), (double)$$1.u() + $$2.c(iz.a.a), (double)$$1.w() + $$2.b(iz.a.c), (double)$$1.w() + $$2.c(iz.a.c), $$3);
    }

    private void a(dwo $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        $$0.a(ly.az, bgj.d($$0.y.j(), $$1, $$2), $$5, bgj.d($$0.y.j(), $$3, $$4), 0.0, 0.0, 0.0);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.g().g());
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, b);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new eky($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? null : dzk.a($$2, eld.I, eky::a);
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        if ($$0 instanceof axf) {
            elb $$5;
            axf $$4 = (axf)$$0;
            if ($$3.gM() && $$4.U().a(eua.d).booleanValue() && ($$5 = $$0.c_($$1)) instanceof eky) {
                boolean $$8;
                eky $$6 = (eky)$$5;
                int $$7 = $$2.c(c);
                boolean bl2 = $$8 = !$$6.c();
                if ($$8 || $$7 > 0) {
                    dlt $$9 = new dlt(this);
                    $$9.b($$6.t());
                    $$9.b(ki.ax, dnw.a.a(c, $$7));
                    czl $$10 = new czl($$0, $$1.u(), $$1.v(), $$1.w(), $$9);
                    $$10.i();
                    $$0.b($$10);
                }
            }
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected List<dlt> a(eoh $$0, fod.a $$1) {
        elb $$3;
        cgk $$2 = $$1.b(fqx.a);
        if (($$2 instanceof czm || $$2 instanceof czp || $$2 instanceof der || $$2 instanceof cyw || $$2 instanceof dgr) && ($$3 = $$1.b(fqx.j)) instanceof eky) {
            eky $$4 = (eky)$$3;
            $$4.a(null, $$0, eky.b.c);
        }
        return super.a($$0, $$1);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        dlt $$4 = super.a($$0, $$1, $$2, $$3);
        if ($$3) {
            $$4.b(ki.ax, dnw.a.a(c, $$2.c(c)));
        }
        return $$4;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        elb $$8;
        if ($$1.a_($$5).b() instanceof ecv && ($$8 = $$1.c_($$3)) instanceof eky) {
            eky $$9 = (eky)$$8;
            $$9.a(null, $$0, eky.b.c);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }
}

