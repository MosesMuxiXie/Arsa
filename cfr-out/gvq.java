/*
 * Decompiled with CFR 0.152.
 */
public class gvq
extends gvt {
    private static final yh b = yh.c("multiplayerWarning.header").a(l.r);
    private static final yh c = yh.c("multiplayerWarning.message");
    private static final yh d = yh.c("multiplayerWarning.check").b(-2039584);
    private static final yh e = b.f().f("\n").b(c);
    private final gsb f;

    public gvq(gsb $$0) {
        super(b, c, d, e);
        this.f = $$0;
    }

    @Override
    protected gov o() {
        goy $$02 = goy.e().a(8);
        $$02.a(gje.a(yg.i, (gje $$0) -> {
            if (this.a.a()) {
                this.n.k.r = true;
                this.n.k.aQ();
            }
            this.n.a(new gvp(this.f));
        }).a());
        $$02.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        return $$02;
    }

    @Override
    public void aX_() {
        this.n.a(this.f);
    }
}

