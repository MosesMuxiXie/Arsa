/*
 * Decompiled with CFR 0.152.
 */
public class gro
extends gqy {
    private gje f;

    public gro(String $$0, boolean $$1) {
        super($$0, $$1);
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.f = gje.a(yh.c("multiplayer.stopSleeping"), (gje $$0) -> this.p()).a(this.o / 2 - 100, this.p - 40, 200, 20).a();
        this.c(this.f);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        if (!this.n.O().a(this.n.Y())) {
            this.f.a($$0, $$1, $$2, $$3);
            return;
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void aX_() {
        this.p();
    }

    @Override
    public boolean a(gyy $$0) {
        if (!this.n.O().a(this.n.Y())) {
            return true;
        }
        return (boolean)super.a($$0);
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.e()) {
            this.p();
        }
        if (!this.n.O().a(this.n.Y())) {
            return true;
        }
        if ($$0.d()) {
            this.b(this.b.a(), true);
            this.b.a("");
            this.n.j.e().d();
            return true;
        }
        return super.a($$0);
    }

    private void p() {
        hig $$0 = this.n.s.b;
        $$0.b(new ajj(this.n.s, ajj.a.a));
    }

    public void o() {
        String $$0 = this.b.a();
        if (this.d || $$0.isEmpty()) {
            this.e = gqy.b.b;
            this.n.a((gsb)null);
        } else {
            this.e = gqy.b.c;
            this.n.a(new gqy($$0, false));
        }
    }
}

