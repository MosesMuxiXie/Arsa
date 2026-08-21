/*
 * Decompiled with CFR 0.152.
 */
public class hwv
extends hwp<czk, idk> {
    public hwv(hwq.a $$0) {
        super($$0);
        this.d = 0.5f;
    }

    @Override
    public boolean a(czk $$0, htx $$1, double $$2, double $$3, double $$4) {
        if (!super.a($$0, $$1, $$2, $$3, $$4)) {
            return false;
        }
        return $$0.i() != $$0.ao().a_($$0.dK());
    }

    @Override
    public void a(idk $$0, fzm $$1, hpo $$2, ikp $$3) {
        eoh $$4 = $$0.a.c;
        if ($$4.o() != egf.b) {
            return;
        }
        $$1.a();
        $$1.a(-0.5, 0.0, -0.5);
        $$2.a($$1, $$0.a);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public idk a() {
        return new idk();
    }

    @Override
    public void a(czk $$0, idk $$1, float $$2) {
        super.a($$0, $$1, $$2);
        is $$3 = is.a($$0.dP(), $$0.dj().e, $$0.dV());
        $$1.a.a = $$0.e();
        $$1.a.b = $$3;
        $$1.a.c = $$0.i();
        $$1.a.d = $$0.ao().z($$3);
        $$1.a.e = $$0.ao();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

