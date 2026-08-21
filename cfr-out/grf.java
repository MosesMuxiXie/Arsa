/*
 * Decompiled with CFR 0.152.
 */
public class grf
extends gsb {
    private gjy a = gjy.a;
    private final Runnable b;
    private final Runnable c;

    public grf(Runnable $$0, Runnable $$1) {
        super(yh.c("datapackFailure.title"));
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.a = gjy.a(this.q, this.q(), this.o - 50);
        this.c(gje.a(yh.c("datapackFailure.safeMode"), (gje $$0) -> this.c.run()).a(this.o / 2 - 155, this.p / 6 + 96, 150, 20).a());
        this.c(gje.a(yg.k, (gje $$0) -> this.b.run()).a(this.o / 2 - 155 + 160, this.p / 6 + 96, 150, 20).a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        gil $$4 = $$0.h();
        this.a.a(git.b, this.o / 2, 70, this.q.b, $$4);
    }

    @Override
    public boolean aY_() {
        return false;
    }
}

