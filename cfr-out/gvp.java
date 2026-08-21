/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gvp
extends gsb {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 100;
    private static final int d = 74;
    private final gou e = new gou(this, 33, 60);
    private final hiv f = new hiv();
    private final gsb t;
    protected gvs a;
    private hiu u;
    private gje v;
    private gje w;
    private gje x;
    private hit y;
    private iqc.b z;
    private @Nullable iqc.a A;

    public gvp(gsb $$0) {
        super(yh.c("multiplayer.title"));
        this.t = $$0;
    }

    @Override
    protected void bg_() {
        this.e.a(this.m, this.q);
        this.u = new hiu(this.n);
        this.u.a();
        this.z = new iqc.b();
        try {
            this.A = new iqc.a(this.z);
            this.A.start();
        }
        catch (Exception $$02) {
            b.warn("Unable to start LAN server detection: {}", (Object)$$02.getMessage());
        }
        this.a = this.e.c(new gvs(this, this.n, this.o, this.e.d(), this.e.c(), 36));
        this.a.a(this.u);
        goy $$12 = this.e.b(goy.d().a(4));
        $$12.c().b();
        goy $$2 = $$12.a(goy.e().a(4));
        goy $$3 = $$12.a(goy.e().a(4));
        this.w = $$2.a(gje.a(yh.c("selectServer.select"), (gje $$0) -> {
            gvs.a $$1 = (gvs.a)this.a.q();
            if ($$1 != null) {
                $$1.b();
            }
        }).a(100).a());
        $$2.a(gje.a(yh.c("selectServer.direct"), (gje $$0) -> {
            this.y = new hit(imu.a("selectServer.defaultName", new Object[0]), "", hit.c.c);
            this.n.a(new gri(this, this::h, this.y));
        }).a(100).a());
        $$2.a(gje.a(yh.c("selectServer.add"), (gje $$0) -> {
            this.y = new hit("", "", hit.c.c);
            this.n.a(new grs(this, yh.c("manageServer.add.title"), this::g, this.y));
        }).a(100).a());
        this.v = $$3.a(gje.a(yh.c("selectServer.edit"), (gje $$0) -> {
            gvs.a $$1 = (gvs.a)this.a.q();
            if ($$1 instanceof gvs.d) {
                hit $$2 = ((gvs.d)$$1).e();
                this.y = new hit($$2.a, $$2.b, hit.c.c);
                this.y.b($$2);
                this.n.a(new grs(this, yh.c("manageServer.edit.title"), this::f, this.y));
            }
        }).a(74).a());
        this.x = $$3.a(gje.a(yh.c("selectServer.delete"), (gje $$0) -> {
            String $$2;
            gvs.a $$1 = (gvs.a)this.a.q();
            if ($$1 instanceof gvs.d && ($$2 = ((gvs.d)$$1).e().a) != null) {
                yw $$3 = yh.c("selectServer.deleteQuestion");
                yw $$4 = yh.a("selectServer.deleteWarning", new Object[]{$$2});
                yw $$5 = yh.c("selectServer.deleteButton");
                yh $$6 = yg.e;
                this.n.a(new gra(this::c, $$3, $$4, $$5, $$6));
            }
        }).a(74).a());
        $$3.a(gje.a(yh.c("selectServer.refresh"), (gje $$0) -> this.I()).a(74).a());
        $$3.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a(74).a());
        this.e.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
        this.o();
    }

    @Override
    protected void c() {
        this.e.a();
        if (this.a != null) {
            this.a.a(this.o, this.e);
        }
    }

    @Override
    public void aX_() {
        this.n.a(this.t);
    }

    @Override
    public void e() {
        super.e();
        List<iqb> $$0 = this.z.a();
        if ($$0 != null) {
            this.a.b($$0);
        }
        this.f.a();
    }

    @Override
    public void aZ_() {
        if (this.A != null) {
            this.A.interrupt();
            this.A = null;
        }
        this.f.b();
        this.a.d();
    }

    private void I() {
        this.n.a(new gvp(this.t));
    }

    private void c(boolean $$0) {
        gvs.a $$1 = (gvs.a)this.a.q();
        if ($$0 && $$1 instanceof gvs.d) {
            this.u.a(((gvs.d)$$1).e());
            this.u.b();
            this.a.a((gvs.a)null);
            this.a.a(this.u);
        }
        this.n.a(this);
    }

    private void f(boolean $$0) {
        gvs.a $$1 = (gvs.a)this.a.q();
        if ($$0 && $$1 instanceof gvs.d) {
            hit $$2 = ((gvs.d)$$1).e();
            $$2.a = this.y.a;
            $$2.b = this.y.b;
            $$2.b(this.y);
            this.u.b();
            this.a.a(this.u);
        }
        this.n.a(this);
    }

    private void g(boolean $$0) {
        if ($$0) {
            hit $$1 = this.u.b(this.y.b);
            if ($$1 != null) {
                $$1.a(this.y);
                this.u.b();
            } else {
                this.u.a(this.y, false);
                this.u.b();
            }
            this.a.a((gvs.a)null);
            this.a.a(this.u);
        }
        this.n.a(this);
    }

    private void h(boolean $$0) {
        if ($$0) {
            hit $$1 = this.u.a(this.y.b);
            if ($$1 == null) {
                this.u.a(this.y, true);
                this.u.b();
                this.a(this.y);
            } else {
                this.a($$1);
            }
        } else {
            this.n.a(this);
        }
    }

    @Override
    public boolean a(gzb $$0) {
        if (super.a($$0)) {
            return true;
        }
        if ($$0.t() == 294) {
            this.I();
            return true;
        }
        return false;
    }

    public void a(hit $$0) {
        grb.a(this, this.n, hjw.a($$0.b), $$0, false, null);
    }

    protected void o() {
        this.w.k = false;
        this.v.k = false;
        this.x.k = false;
        gvs.a $$0 = (gvs.a)this.a.q();
        if ($$0 != null && !($$0 instanceof gvs.b)) {
            this.w.k = true;
            if ($$0 instanceof gvs.d) {
                this.v.k = true;
                this.x.k = true;
            }
        }
    }

    public hiv p() {
        return this.f;
    }

    public hiu F() {
        return this.u;
    }
}

