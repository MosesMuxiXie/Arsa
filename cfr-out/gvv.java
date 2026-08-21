/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class gvv
extends gwc {
    public static final yh a = yh.c("options.accessibility.title");

    private static gfn<?>[] a(gfo $$0) {
        return new gfn[]{$$0.aK(), $$0.ak(), $$0.A(), $$0.w(), $$0.y(), $$0.am(), $$0.u(), $$0.v(), $$0.I(), $$0.J(), $$0.ap(), $$0.aB(), $$0.aC(), $$0.aD(), $$0.aG(), $$0.aE(), $$0.aF(), $$0.b(), $$0.a(), $$0.z(), $$0.c(), $$0.C(), $$0.U(), $$0.B()};
    }

    public gvv(gsb $$0, gfo $$1) {
        super($$0, $$1, a);
    }

    @Override
    protected void bg_() {
        gjc $$1;
        super.bg_();
        gjc $$0 = this.d.b(this.c.A());
        if ($$0 != null && !this.n.ai().c().contains("high_contrast")) {
            $$0.k = false;
            $$0.a(gks.a(yh.c("options.accessibility.high_contrast.error.tooltip")));
        }
        if (($$1 = this.d.b(this.c.U())) != null) {
            $$1.k = this.J();
        }
    }

    @Override
    protected void o() {
        gfn<?>[] $$02 = gvv.a(this.c);
        gje $$12 = gje.a(gwb.a, (gje $$0) -> this.n.a(new gwh(this, this.c))).a();
        gfn<?> $$2 = $$02[0];
        this.d.a($$2.a(this.c), this.c.aK(), $$12);
        this.d.a((gfn[])Arrays.stream($$02).filter($$1 -> $$1 != $$2).toArray(gfn[]::new));
    }

    @Override
    protected void p() {
        goy $$02 = this.e.b(goy.e().a(8));
        $$02.a(gje.a(yh.c("options.accessibility.link"), gqz.b((gsb)this, bez.l)).a());
        $$02.a(gje.a(yg.d, (gje $$0) -> this.n.a(this.b)).a());
    }

    @Override
    protected boolean aL_() {
        return !(this.b instanceof gqu);
    }

    private boolean J() {
        return this.n.r != null && this.n.r.Q().b(dhb.d);
    }
}

