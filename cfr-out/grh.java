/*
 * Decompiled with CFR 0.152.
 */
public class grh
extends gsb {
    private static final amo a = amo.b("textures/gui/demo_background.png");
    private static final int b = 256;
    private static final int c = 256;
    private static final int d = -14737633;
    private gjy e = gjy.a;
    private gjy f = gjy.a;

    public grh() {
        super(yh.c("demo.help.title"));
    }

    @Override
    protected void bg_() {
        int $$02 = -16;
        this.c(gje.a(yh.c("demo.help.buy"), (gje $$0) -> {
            $$0.k = false;
            bhs.n().a(bez.f);
        }).a(this.o / 2 - 116, this.p / 2 + 62 + -16, 114, 20).a());
        this.c(gje.a(yh.c("demo.help.later"), (gje $$0) -> {
            this.n.a((gsb)null);
            this.n.n.i();
        }).a(this.o / 2 + 2, this.p / 2 + 62 + -16, 114, 20).a());
        gfo $$1 = this.n.k;
        this.e = gjy.a(this.q, this.a(yh.a("demo.help.movementShort", $$1.s.n(), $$1.t.n(), $$1.u.n(), $$1.v.n())), this.a(yh.c("demo.help.movementMouse")), this.a(yh.a("demo.help.jump", $$1.w.n())), this.a(yh.a("demo.help.inventory", $$1.z.n())));
        this.f = gjy.a(this.q, (yh)yh.c("demo.help.fullWrapped").j().b(-14737633), 218);
    }

    private yh a(yw $$0) {
        return $$0.j().b(-11579569);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        super.b($$0, $$1, $$2, $$3);
        int $$4 = (this.o - 248) / 2;
        int $$5 = (this.p - 166) / 2;
        $$0.a(hpa.at, a, $$4, $$5, 0.0f, 0.0f, 248, 166, 256, 256);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        int $$4 = (this.o - 248) / 2 + 10;
        int $$5 = (this.p - 166) / 2 + 8;
        gil $$6 = $$0.h();
        $$0.a(this.q, this.m, $$4, $$5, -14737633, false);
        $$5 = this.e.a(git.a, $$4, $$5 + 12, 12, $$6);
        this.f.a(git.a, $$4, $$5 + 20, this.q.b, $$6);
    }
}

