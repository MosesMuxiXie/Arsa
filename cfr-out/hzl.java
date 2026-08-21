/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hzl
extends hxx<cvl, ifn, gzm<ifn>> {
    private final gzm<ifn> a = this.c();
    private final gzm<ifn> i;
    private static final amo j = amo.b("textures/entity/fish/tropical_a.png");
    private static final amo k = amo.b("textures/entity/fish/tropical_b.png");

    public hzl(hwq.a $$0) {
        super($$0, new hbe($$0.a(hdf.dO)), 0.15f);
        this.i = new hbd($$0.a(hdf.dM));
        this.a(new ibu(this, $$0.f()));
    }

    public amo a(ifn $$0) {
        return switch ($$0.a.a()) {
            default -> throw new MatchException(null, null);
            case cvl.a.a -> j;
            case cvl.a.b -> k;
        };
    }

    public ifn b() {
        return new ifn();
    }

    @Override
    public void a(cvl $$0, ifn $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gZ();
        $$1.b = $$0.gX().d();
        $$1.c = $$0.gY().d();
    }

    @Override
    public void a(ifn $$0, fzm $$1, hpo $$2, ikp $$3) {
        this.f = switch ($$0.a.a()) {
            default -> throw new MatchException(null, null);
            case cvl.a.a -> this.a;
            case cvl.a.b -> this.i;
        };
        super.a($$0, $$1, $$2, $$3);
    }

    protected int b(ifn $$0) {
        return $$0.b;
    }

    @Override
    protected void a(ifn $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        float $$4 = 4.3f * bgj.a((double)(0.6f * $$0.L));
        $$1.a((Quaternionfc)a.d.rotationDegrees($$4));
        if (!$$0.aF) {
            $$1.a(0.2f, 0.1f, 0.0f);
            $$1.a((Quaternionfc)a.f.rotationDegrees(90.0f));
        }
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifn)ieh2);
    }

    @Override
    protected /* synthetic */ int f(ieh ieh2) {
        return this.b((ifn)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

