/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class emh
extends elb
implements fuy.a {
    public static final String b = "RecordItem";
    public static final String c = "ticks_since_song_started";
    private dlt d = dlt.l;
    private final dma e = new dma(this::k, this.aD_());

    public emh(is $$0, eoh $$1) {
        super(eld.e, $$0, $$1);
    }

    public dma h() {
        return this.e;
    }

    public void k() {
        this.n.a(this.aD_(), this.o().b());
        this.e();
    }

    private void a(boolean $$0) {
        if (this.n == null || this.n.a_(this.aD_()) != this.o()) {
            return;
        }
        this.n.a(this.aD_(), (eoh)this.o().b(eea.b, $$0), 2);
        this.n.a(etk.c, this.aD_(), etk.a.a(this.o()));
    }

    public void l() {
        if (this.n == null || this.n.B_()) {
            return;
        }
        is $$0 = this.aD_();
        dlt $$1 = this.g();
        if ($$1.f()) {
            return;
        }
        this.i();
        ftm $$2 = ftm.a($$0, 0.5, 1.01, 0.5).b(this.n.y, 0.7f);
        dlt $$3 = $$1.v();
        czl $$4 = new czl(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
        $$4.i();
        this.n.b($$4);
        this.k();
    }

    public static void a(dwo $$0, is $$1, eoh $$2, emh $$3) {
        $$3.e.b($$0, $$2);
    }

    public int m() {
        return dlz.a(this.n.J_(), this.d).map(jd::a).map(dlz::e).orElse(0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dlt $$1 = $$0.a(b, dlt.b).orElse(dlt.l);
        if (!this.d.f() && !dlt.c($$1, this.d)) {
            this.e.a((dwp)this.n, this.o());
        }
        this.d = $$1;
        $$0.f(c).ifPresent($$12 -> dlz.a($$0.a(), this.d).ifPresent($$1 -> this.e.a((jd<dlz>)$$1, (long)$$12)));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.g().f()) {
            $$0.a(b, dlt.b, this.g());
        }
        if (this.e.b() != null) {
            $$0.a(c, this.e.c());
        }
    }

    @Override
    public dlt g() {
        return this.d;
    }

    @Override
    public dlt d(int $$0) {
        dlt $$1 = this.d;
        this.b(dlt.l);
        return $$1;
    }

    @Override
    public void b(dlt $$0) {
        this.d = $$0;
        boolean $$1 = !this.d.f();
        Optional<jd<dlz>> $$2 = dlz.a(this.n.J_(), this.d);
        this.a($$1);
        if ($$1 && $$2.isPresent()) {
            this.e.a((dwp)this.n, $$2.get());
        } else {
            this.e.a((dwp)this.n, this.o());
        }
    }

    @Override
    public void ay_() {
        super.ay_();
        this.n.a(etk.F, this.aD_(), etk.a.a(this.o()));
        this.n.c(1011, this.aD_(), 0);
    }

    @Override
    public int ap_() {
        return 1;
    }

    @Override
    public elb w() {
        return this;
    }

    @Override
    public boolean b(int $$0, dlt $$1) {
        return $$1.c(ki.al) && this.a($$0).f();
    }

    @Override
    public boolean a(ccv $$0, int $$1, dlt $$2) {
        return $$0.a_(dlt::f);
    }

    @Override
    public void a(is $$0, eoh $$1) {
        this.l();
    }

    @VisibleForTesting
    public void c(dlt $$02) {
        this.d = $$02;
        dlz.a(this.n.J_(), $$02).ifPresent($$0 -> this.e.a((jd<dlz>)$$0, 0L));
        this.n.a(this.aD_(), this.o().b());
        this.e();
    }

    @VisibleForTesting
    public void x() {
        dlz.a(this.n.J_(), this.g()).ifPresent($$0 -> this.e.a((dwp)this.n, (jd<dlz>)$$0));
    }
}

