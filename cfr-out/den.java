/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class den
extends dem {
    public static final float e = 4.0f;

    public den(cgu<? extends den> $$0, dwo $$1) {
        super((cgu<? extends dem>)$$0, $$1);
    }

    public den(dwo $$0, chl $$1, ftm $$2) {
        super(cgu.N, $$1, $$2, $$0);
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        if ($$0.d() == ftk.a.c && this.e(((ftj)$$0).a())) {
            return;
        }
        if (!this.ao().B_()) {
            List<chl> $$1 = this.ao().a(chl.class, this.dj().c(4.0, 2.0, 4.0));
            cga $$2 = new cga(this.ao(), this.dP(), this.dR(), this.dV());
            cgk $$3 = this.p();
            if ($$3 instanceof chl) {
                $$2.a((chl)$$3);
            }
            $$2.a(lz.a(ly.i, 1.0f));
            $$2.a(3.0f);
            $$2.a(600);
            $$2.d((7.0f - $$2.c()) / (float)$$2.h());
            $$2.b(0.25f);
            $$2.a(new cfm(cfo.g, 1, 1));
            if (!$$1.isEmpty()) {
                for (chl $$4 : $$1) {
                    double $$5 = this.g($$4);
                    if (!($$5 < 16.0)) continue;
                    $$2.a_($$4.dP(), $$4.dR(), $$4.dV());
                    break;
                }
            }
            this.ao().c(2006, this.dK(), this.bq() ? -1 : 1);
            this.ao().b($$2);
            this.aC();
        }
    }

    @Override
    protected lw k() {
        return lz.a(ly.i, 1.0f);
    }

    @Override
    protected boolean i() {
        return false;
    }
}

