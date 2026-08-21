/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cny
extends cop {
    private final cht a;

    public cny(cht $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        return this.a.cK() < 140;
    }

    @Override
    public boolean c() {
        return this.b();
    }

    @Override
    public boolean W_() {
        return false;
    }

    @Override
    public void d() {
        this.h();
    }

    private void h() {
        Iterable<is> $$0 = is.b(bgj.c(this.a.dP() - 1.0), this.a.dQ(), bgj.c(this.a.dV() - 1.0), bgj.c(this.a.dP() + 1.0), bgj.c(this.a.dR() + 8.0), bgj.c(this.a.dV() + 1.0));
        jy $$1 = null;
        for (is $$2 : $$0) {
            if (!this.a(this.a.ao(), $$2)) continue;
            $$1 = $$2;
            break;
        }
        if ($$1 == null) {
            $$1 = is.a(this.a.dP(), this.a.dR() + 8.0, this.a.dV());
        }
        this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
    }

    @Override
    public void a() {
        this.h();
        this.a.a(0.02f, new ftm(this.a.bN, this.a.bO, this.a.bP));
        this.a.a(chp.a, this.a.dN());
    }

    private boolean a(dwr $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        return ($$0.b_($$1).c() || $$2.a(dzs.oa)) && $$2.a(flq.a);
    }
}

