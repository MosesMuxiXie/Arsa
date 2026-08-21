/*
 * Decompiled with CFR 0.152.
 */
public class gtv
extends gth {
    private final elm f;
    private gjl<elm.a> t;
    private gjl<Boolean> u;
    private gjl<Boolean> v;
    private elm.a w = elm.a.c;
    private boolean x;
    private boolean y;

    public gtv(elm $$0) {
        this.f = $$0;
    }

    @Override
    dvo o() {
        return this.f.a();
    }

    @Override
    int p() {
        return 135;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.f(false);
    }

    @Override
    protected void F() {
        this.t = this.c(gjl.a((T $$0) -> switch ($$0) {
            default -> throw new MatchException(null, null);
            case elm.a.a -> yh.c("advMode.mode.sequence");
            case elm.a.b -> yh.c("advMode.mode.auto");
            case elm.a.c -> yh.c("advMode.mode.redstone");
        }, this.w).a((elm.a[])elm.a.values()).a().a(this.o / 2 - 50 - 100 - 4, 165, 100, 20, yh.c("advMode.mode"), ($$0, $$1) -> {
            this.w = $$1;
        }));
        this.u = this.c(gjl.a((yh)yh.c("advMode.mode.conditional"), (yh)yh.c("advMode.mode.unconditional"), this.x).a().a(this.o / 2 - 50, 165, 100, 20, yh.c("advMode.type"), ($$0, $$1) -> {
            this.x = $$1;
        }));
        this.v = this.c(gjl.a((yh)yh.c("advMode.mode.autoexec.bat"), (yh)yh.c("advMode.mode.redstoneTriggered"), this.y).a().a(this.o / 2 + 50 + 4, 165, 100, 20, yh.c("advMode.triggering"), ($$0, $$1) -> {
            this.y = $$1;
        }));
    }

    private void f(boolean $$0) {
        this.c.k = $$0;
        this.e.k = $$0;
        this.t.k = $$0;
        this.u.k = $$0;
        this.v.k = $$0;
    }

    public void K() {
        dvo $$0 = this.f.a();
        this.a.a($$0.d());
        boolean $$1 = $$0.g();
        this.w = this.f.l();
        this.x = this.f.m();
        this.y = this.f.d();
        this.e.a($$1);
        this.t.a(this.w);
        this.u.a(this.x);
        this.v.a(this.y);
        this.c($$1);
        this.f(true);
    }

    @Override
    public void a(int $$0, int $$1) {
        super.a($$0, $$1);
        this.f(true);
    }

    @Override
    protected void J() {
        this.n.R().b(new aju(this.f.aD_(), this.a.a(), this.w, this.f.a().g(), this.x, this.y));
    }
}

