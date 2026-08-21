/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class gdc
extends isc {
    private static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("mco.terms.title");
    private static final yh c = yh.c("mco.terms.sentence.1");
    private static final yh F = yg.a().b(yh.c("mco.terms.sentence.2").c(zf.a.c(true)));
    private final gsb G;
    private final gbg H;
    private boolean I;

    public gdc(gsb $$0, gbg $$1) {
        super(b);
        this.G = $$0;
        this.H = $$1;
    }

    @Override
    public void bg_() {
        int $$02 = this.o / 4 - 2;
        this.c(gje.a(yh.c("mco.terms.buttons.agree"), (gje $$0) -> this.o()).a(this.o / 4, gdc.a(12), $$02, 20).a());
        this.c(gje.a(yh.c("mco.terms.buttons.disagree"), (gje $$0) -> this.n.a(this.G)).a(this.o / 2 + 4, gdc.a(12), $$02, 20).a());
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.t() == 256) {
            this.n.a(this.G);
            return true;
        }
        return super.a($$0);
    }

    private void o() {
        fzz $$0 = fzz.a();
        try {
            $$0.l();
            this.n.a(new gcu(this.G, new geg(this.G, this.H)));
        }
        catch (gce $$1) {
            a.error("Couldn't agree to TOS", (Throwable)$$1);
        }
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.I) {
            this.n.o.a(bez.s.toString());
            bhs.n().a(bez.s);
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), c}).b(yg.x).b(F);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 17, -1);
        $$0.b(this.q, c, this.o / 2 - 120, gdc.a(5), -1);
        int $$4 = this.q.a(c);
        int $$5 = this.o / 2 - 121 + $$4;
        int $$6 = gdc.a(5);
        int $$7 = $$5 + this.q.a(F) + 1;
        int $$8 = $$6 + 1 + this.q.b;
        this.I = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
        $$0.b(this.q, F, this.o / 2 - 120 + $$4, gdc.a(5), this.I ? -9670204 : -13408581);
    }
}

