/*
 * Decompiled with CFR 0.152.
 */
public class ene
extends elb
implements dxj,
enh.c {
    private final enh a = this.h();

    public ene(is $$0, eoh $$1) {
        super(eld.S, $$0, $$1);
    }

    private enh h() {
        eng $$0 = w.ah ? eng.c : eng.a;
        eng.a $$1 = eng.a.a;
        return new enh(enh.b.b, this, $$0, $$1);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a.a($$0);
        if (this.n != null) {
            this.f();
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.a.a($$0);
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.a.h().a(this.o().c(eiy.b));
    }

    @Override
    public void a(cgu<?> $$0, bgr $$1) {
        if (this.n == null) {
            bhs.b("Expected non-null level");
            return;
        }
        this.a.a($$0, this.n);
        this.e();
    }

    public enh c() {
        return this.a;
    }

    @Override
    public enk d() {
        if (!this.o().b(eox.bD)) {
            return enk.a;
        }
        return this.o().c(eox.bD);
    }

    @Override
    public void a(dwo $$0, enk $$1) {
        this.e();
        $$0.c(this.o, (eoh)this.o().b(eox.bD, $$1));
    }

    @Override
    public void f() {
        this.e();
        if (this.n != null) {
            this.n.a(this.o, this.o(), this.o(), 3);
        }
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }
}

