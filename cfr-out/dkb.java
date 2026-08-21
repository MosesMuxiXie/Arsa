/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class dkb
extends dlp {
    @Deprecated
    private final dzq a;

    public dkb(dzq $$0, dlp.a $$1) {
        super($$1);
        this.a = $$0;
    }

    @Override
    public cdc a(dpw $$0) {
        cdc $$1 = this.a(new dpu($$0));
        if (!$$1.a() && $$0.n().c(ki.z)) {
            return super.a($$0.q(), $$0.o(), $$0.p());
        }
        return $$1;
    }

    public cdc a(dpu $$0) {
        if (!this.c().a($$0.q().Q())) {
            return cdc.d;
        }
        if (!$$0.b()) {
            return cdc.d;
        }
        dpu $$1 = this.b($$0);
        if ($$1 == null) {
            return cdc.d;
        }
        eoh $$2 = this.c($$1);
        if ($$2 == null) {
            return cdc.d;
        }
        if (!this.a($$1, $$2)) {
            return cdc.d;
        }
        is $$3 = $$1.a();
        dwo $$4 = $$1.q();
        ddm $$5 = $$1.o();
        dlt $$6 = $$1.n();
        eoh $$7 = $$4.a_($$3);
        if ($$7.a($$2.b())) {
            $$7 = this.a($$3, $$4, $$6, $$7);
            this.a($$3, $$4, $$5, $$6, $$7);
            dkb.a($$4, $$3, $$6);
            $$7.b().a($$4, $$3, $$7, (chl)$$5, $$6);
            if ($$5 instanceof axg) {
                aj.z.a((axg)$$5, $$3, $$6);
            }
        }
        ehs $$8 = $$7.A();
        $$4.a((cgk)$$5, $$3, this.a($$7), bdb.e, ($$8.a() + 1.0f) / 2.0f, $$8.b() * 0.8f);
        $$4.a(etk.i, $$3, etk.a.a($$5, $$7));
        $$6.a(1, (chl)$$5);
        return cdc.a;
    }

    protected bcz a(eoh $$0) {
        return $$0.A().e();
    }

    public @Nullable dpu b(dpu $$0) {
        return $$0;
    }

    private static void a(dwo $$0, is $$1, dlt $$2) {
        elb $$3 = $$0.c_($$1);
        if ($$3 != null) {
            $$3.a($$2);
            $$3.e();
        }
    }

    protected boolean a(is $$0, dwo $$1, @Nullable ddm $$2, dlt $$3, eoh $$4) {
        return dkb.a($$1, $$2, $$0, $$3);
    }

    protected @Nullable eoh c(dpu $$0) {
        eoh $$1 = this.c().a($$0);
        return $$1 != null && this.b($$0, $$1) ? $$1 : null;
    }

    private eoh a(is $$0, dwo $$1, dlt $$2, eoh $$3) {
        dnw $$4 = $$2.a(ki.ax, dnw.a);
        if ($$4.a()) {
            return $$3;
        }
        eoh $$5 = $$4.a($$3);
        if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
        }
        return $$5;
    }

    protected boolean b(dpu $$0, eoh $$1) {
        ddm $$2 = $$0.o();
        return (!this.b() || $$1.a((dwr)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), ftr.a($$2));
    }

    protected boolean b() {
        return true;
    }

    protected boolean a(dpu $$0, eoh $$1) {
        return $$0.q().a($$0.a(), $$1, 11);
    }

    public static boolean a(dwo $$0, @Nullable ddm $$1, is $$2, dlt $$3) {
        elb $$5;
        if ($$0.B_()) {
            return false;
        }
        dpf<eld<?>> $$4 = $$3.a(ki.ah);
        if ($$4 != null && ($$5 = $$0.c_($$2)) != null) {
            eld<?> $$6 = $$5.s();
            if ($$6 != $$4.a()) {
                return false;
            }
            if ($$6.b() && ($$1 == null || !$$1.hi())) {
                return false;
            }
            return $$4.a($$5, $$0.J_());
        }
        return false;
    }

    @Override
    public boolean a(dlt $$0, @Nullable ddm $$1) {
        dpf<eld<?>> $$2;
        if ($$1 != null && $$1.I().hasPermission(bbr.b) && ($$2 = $$0.a(ki.ah)) != null) {
            return $$2.a().b();
        }
        return false;
    }

    public dzq c() {
        return this.a;
    }

    public void a(Map<dzq, dlp> $$0, dlp $$1) {
        $$0.put(this.c(), $$1);
    }

    @Override
    public boolean d() {
        return !(this.c() instanceof ehd);
    }

    @Override
    public void a(czl $$0) {
        doo $$1 = $$0.e().b(ki.aw, doo.a);
        if ($$1 != null) {
            dlw.a($$0, $$1.e());
        }
    }

    public static void a(dlt $$0, eld<?> $$1, fnp $$2) {
        $$2.c("id");
        if ($$2.a()) {
            $$0.e(ki.ah);
        } else {
            elb.a($$2, $$1);
            $$0.b(ki.ah, dpf.a($$1, $$2.b()));
        }
    }

    @Override
    public dgz k() {
        return this.c().k();
    }
}

