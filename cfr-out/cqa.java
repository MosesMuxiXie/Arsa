/*
 * Decompiled with CFR 0.152.
 */
public class cqa
extends cop {
    private final cht a;

    public cqa(cht $$0) {
        this.a = $$0;
    }

    @Override
    public boolean b() {
        return this.a.aV() && !this.a.ao().b_(this.a.dK()).a(bdv.a);
    }

    @Override
    public void d() {
        jy $$0 = null;
        Iterable<is> $$1 = is.b(bgj.c(this.a.dP() - 2.0), bgj.c(this.a.dR() - 2.0), bgj.c(this.a.dV() - 2.0), bgj.c(this.a.dP() + 2.0), this.a.dQ(), bgj.c(this.a.dV() + 2.0));
        for (is $$2 : $$1) {
            if (!this.a.ao().b_($$2).a(bdv.a)) continue;
            $$0 = $$2;
            break;
        }
        if ($$0 != null) {
            this.a.K().a($$0.u(), $$0.v(), $$0.w(), 1.0);
        }
    }
}

