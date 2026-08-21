/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hyr
extends hxx<cvk, iey, hbc> {
    private static final amo a = amo.b("textures/entity/fish/salmon.png");
    private final hbc i;
    private final hbc j;
    private final hbc k;

    public hyr(hwq.a $$0) {
        super($$0, new hbc($$0.a(hdf.cU)), 0.4f);
        this.i = new hbc($$0.a(hdf.cW));
        this.j = new hbc($$0.a(hdf.cU));
        this.k = new hbc($$0.a(hdf.cV));
    }

    @Override
    public void a(cvk $$0, iey $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gX();
    }

    public amo a(iey $$0) {
        return a;
    }

    public iey b() {
        return new iey();
    }

    @Override
    protected void a(iey $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        float $$4 = 1.0f;
        float $$5 = 1.0f;
        if (!$$0.aF) {
            $$4 = 1.3f;
            $$5 = 1.7f;
        }
        float $$6 = $$4 * 4.3f * bgj.a((double)($$5 * 0.6f * $$0.L));
        $$1.a((Quaternionfc)a.d.rotationDegrees($$6));
        if (!$$0.aF) {
            $$1.a(0.2f, 0.1f, 0.0f);
            $$1.a((Quaternionfc)a.f.rotationDegrees(90.0f));
        }
    }

    @Override
    public void a(iey $$0, fzm $$1, hpo $$2, ikp $$3) {
        this.f = switch ($$0.a) {
            default -> throw new MatchException(null, null);
            case cvk.a.a -> this.i;
            case cvk.a.b -> this.j;
            case cvk.a.c -> this.k;
        };
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iey)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

