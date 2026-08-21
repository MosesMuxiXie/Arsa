/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cyb
extends cgk {
    private static final alw<Optional<is>> b = ama.a(cyb.class, aly.p);
    private static final alw<Boolean> c = ama.a(cyb.class, aly.k);
    private static final boolean d = true;
    public int a;

    public cyb(cgu<? extends cyb> $$0, dwo $$1) {
        super($$0, $$1);
        this.W = true;
        this.a = this.as.a(100000);
    }

    public cyb(dwo $$0, double $$1, double $$2, double $$3) {
        this((cgu<? extends cyb>)cgu.V, $$0);
        this.a_($$1, $$2, $$3);
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(b, Optional.empty());
        $$0.a(c, true);
    }

    @Override
    public void g() {
        ++this.a;
        this.aW();
        this.cn();
        if (this.ao() instanceof axf) {
            is $$0 = this.dK();
            if (((axf)this.ao()).K() != null && this.ao().a_($$0).l()) {
                this.ao().c($$0, dzd.a(this.ao(), $$0));
            }
        }
    }

    @Override
    protected void a(fns $$0) {
        $$0.b("beam_target", is.a, this.e());
        $$0.a("ShowBottom", this.f());
    }

    @Override
    protected void a(fnq $$0) {
        this.a((is)$$0.a("beam_target", is.a).orElse(null));
        this.a($$0.a("ShowBottom", true));
    }

    @Override
    public boolean bX() {
        return true;
    }

    @Override
    public final boolean b(cex $$0) {
        if (this.d($$0)) {
            return false;
        }
        return !($$0.d() instanceof cyc);
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        if (this.d($$1)) {
            return false;
        }
        if ($$1.d() instanceof cyc) {
            return false;
        }
        if (!this.eh()) {
            this.a(cgk.e.a);
            if (!$$1.a(bdq.l)) {
                cex $$3 = $$1.d() != null ? this.en().d(this, $$1.d()) : null;
                $$0.a((cgk)this, $$3, null, this.dP(), this.dR(), this.dV(), 6.0f, false, dwo.a.b);
            }
            this.a($$0, $$1);
        }
        return true;
    }

    @Override
    public void c(axf $$0) {
        this.a($$0, this.en().p());
        super.c($$0);
    }

    private void a(axf $$0, cex $$1) {
        esk $$2 = $$0.K();
        if ($$2 != null) {
            $$2.a(this, $$1);
        }
    }

    public void a(@Nullable is $$0) {
        this.aD().a(b, Optional.ofNullable($$0));
    }

    public @Nullable is e() {
        return this.aD().a(b).orElse(null);
    }

    public void a(boolean $$0) {
        this.aD().a(c, $$0);
    }

    public boolean f() {
        return this.aD().a(c);
    }

    @Override
    public boolean a(double $$0) {
        return super.a($$0) || this.e() != null;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.xu);
    }
}

