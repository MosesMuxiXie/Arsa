/*
 * Decompiled with CFR 0.152.
 */
public class gre
extends gsb {
    private static final int a = 8;
    private static final int b = 210;
    private static final yh c = yh.c("credits_and_attribution.screen.title");
    private static final yh d = yh.c("credits_and_attribution.button.credits");
    private static final yh e = yh.c("credits_and_attribution.button.attribution");
    private static final yh f = yh.c("credits_and_attribution.button.licenses");
    private final gsb t;
    private final gou u = new gou(this);

    public gre(gsb $$0) {
        super(c);
        this.t = $$0;
    }

    @Override
    protected void bg_() {
        this.u.a(c, this.q);
        goy $$02 = this.u.c(goy.d()).a(8);
        $$02.c().b();
        $$02.a(gje.a(d, (gje $$0) -> this.o()).a(210).a());
        $$02.a(gje.a(e, gqz.b((gsb)this, bez.d)).a(210).a());
        $$02.a(gje.a(f, gqz.b((gsb)this, bez.e)).a(210).a());
        this.u.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
        this.u.a();
        this.u.a(this::c);
    }

    @Override
    protected void c() {
        this.u.a();
    }

    private void o() {
        this.n.a(new gse(false, () -> this.n.a(this)));
    }

    @Override
    public void aX_() {
        this.n.a(this.t);
    }
}

