/*
 * Decompiled with CFR 0.152.
 */
public class gqv
extends gsb {
    private static final int a = 90;
    private final yh b;
    private gjy c = gjy.a;
    private final Runnable d;
    private final yh e;
    private final boolean f;

    public gqv(Runnable $$0, yh $$1, yh $$2) {
        this($$0, $$1, $$2, yg.k, true);
    }

    public gqv(Runnable $$0, yh $$1, yh $$2, yh $$3, boolean $$4) {
        super($$1);
        this.d = $$0;
        this.b = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), this.b});
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.c = gjy.a(this.q, this.b, this.o - 50);
        int $$02 = this.c.a() * this.q.b;
        int $$1 = bgj.a(90 + $$02 + 12, this.p / 6 + 96, this.p - 24);
        int $$2 = 150;
        this.c(gje.a(this.e, (gje $$0) -> this.d.run()).a((this.o - 150) / 2, $$1, 150, 20).a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        gil $$4 = $$0.h();
        $$0.a(this.q, this.m, this.o / 2, 70, -1);
        this.c.a(git.b, this.o / 2, 90, this.q.b, $$4);
    }

    @Override
    public boolean aY_() {
        return this.f;
    }
}

