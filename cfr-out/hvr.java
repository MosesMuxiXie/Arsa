/*
 * Decompiled with CFR 0.152.
 */
public class hvr
extends hvb {
    private final gzp.a a;
    private final amo f;
    private final gzm<icp> g;

    public hvr(hwq.a $$02, hde $$1) {
        super($$02);
        this.f = $$1.a().a($$0 -> "textures/entity/" + $$0 + ".png");
        this.a = new gzp.a($$02.a(hdf.C), $$0 -> ijt.e());
        this.g = new hgo($$02.a($$1));
    }

    @Override
    protected gzm<icp> a() {
        return this.g;
    }

    @Override
    protected ijs b() {
        return this.g.a(this.f);
    }

    @Override
    protected void a(icp $$0, fzm $$1, hpo $$2, int $$3) {
        if (!$$0.f) {
            $$2.a(this.a, bhr.a, $$1, this.a.a(this.f), $$3, ilg.d, $$0.U, null);
        }
    }
}

