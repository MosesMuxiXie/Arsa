/*
 * Decompiled with CFR 0.152.
 */
public class gng
implements gnf {
    private static final amo e = amo.b("hud/experience_bar_background");
    private static final amo f = amo.b("hud/experience_bar_progress");
    private final gfj g;

    public gng(gfj $$0) {
        this.g = $$0;
    }

    @Override
    public void a(gir $$0, gez $$1) {
        hnh $$2 = this.g.s;
        int $$3 = this.a(this.g.aR());
        int $$4 = this.b(this.g.aR());
        int $$5 = $$2.gU();
        if ($$5 > 0) {
            int $$6 = (int)($$2.cu * 183.0f);
            $$0.a(hpa.at, e, $$3, $$4, 182, 5);
            if ($$6 > 0) {
                $$0.a(hpa.at, f, 182, 5, 0, 0, $$3, $$4, $$6, 5);
            }
        }
    }

    @Override
    public void b(gir $$0, gez $$1) {
    }
}

