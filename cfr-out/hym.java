/*
 * Decompiled with CFR 0.152.
 */
public class hym
extends hxx<cvj, iev, gzm<idf>> {
    private static final amo a = amo.b("textures/entity/fish/pufferfish.png");
    private final gzm<idf> i;
    private final gzm<idf> j;
    private final gzm<idf> k = this.c();

    public hym(hwq.a $$0) {
        super($$0, new haz($$0.a(hdf.cO)), 0.2f);
        this.j = new hba($$0.a(hdf.cP));
        this.i = new hbb($$0.a(hdf.cQ));
    }

    public amo a(iev $$0) {
        return a;
    }

    public iev b() {
        return new iev();
    }

    @Override
    protected float b(iev $$0) {
        return 0.1f + 0.1f * (float)$$0.a;
    }

    @Override
    public void a(iev $$0, fzm $$1, hpo $$2, ikp $$3) {
        this.f = switch ($$0.a) {
            case 0 -> this.i;
            case 1 -> this.j;
            default -> this.k;
        };
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(cvj $$0, iev $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gQ();
    }

    @Override
    protected void a(iev $$0, fzm $$1, float $$2, float $$3) {
        $$1.a(0.0f, bgj.b((double)($$0.L * 0.05f)) * 0.08f, 0.0f);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected /* synthetic */ float g(ieh ieh2) {
        return this.b((iev)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iev)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.b((iev)idf2);
    }
}

