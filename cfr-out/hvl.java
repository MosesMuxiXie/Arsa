/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hvl
extends hxs<cyy, ici, hgf> {
    public static final amo a = amo.b("textures/entity/armorstand/wood.png");
    private final hgf i = (hgf)this.c();
    private final hgf j;

    public hvl(hwq.a $$0) {
        super($$0, new hgg($$0.a(hdf.f)), 0.0f);
        this.j = new hgg($$0.a(hdf.h));
        this.a(new iay<ici, hgf, hgf>(this, hvk.a(hdf.g, $$0.f(), hgf::new), hvk.a(hdf.i, $$0.f(), hgf::new), $$0.h()));
        this.a(new ibb<ici, hgf>(this));
        this.a(new ibw<ici, hgf>(this, $$0.f(), $$0.h()));
        this.a(new iao<ici, hgf>(this, $$0.f(), $$0.k()));
    }

    public amo a(ici $$0) {
        return a;
    }

    public ici a() {
        return new ici();
    }

    @Override
    public void a(cyy $$0, ici $$1, float $$2) {
        super.a($$0, $$1, $$2);
        hxi.a($$0, $$1, $$2, this.g);
        $$1.a = bgj.i($$2, $$0.ab, $$0.ec());
        $$1.c = $$0.r();
        $$1.d = $$0.m();
        $$1.n = $$0.n();
        $$1.o = $$0.p();
        $$1.q = $$0.v();
        $$1.p = $$0.s();
        $$1.r = $$0.w();
        $$1.s = $$0.x();
        $$1.t = $$0.z();
        $$1.u = $$0.A();
        $$1.b = (float)($$0.ao().au() - $$0.cc) + $$2;
    }

    @Override
    public void a(ici $$0, fzm $$1, hpo $$2, ikp $$3) {
        this.f = $$0.d ? this.j : this.i;
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(ici $$0, fzm $$1, float $$2, float $$3) {
        $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$2));
        if ($$0.b < 5.0f) {
            $$1.a((Quaternionfc)a.d.rotationDegrees(bgj.a((double)($$0.b / 1.5f * (float)Math.PI)) * 3.0f));
        }
    }

    @Override
    protected boolean a(cyy $$0, double $$1) {
        return $$0.dd();
    }

    @Override
    protected @Nullable ijs a(ici $$0, boolean $$1, boolean $$2, boolean $$3) {
        if (!$$0.c) {
            return super.a($$0, $$1, $$2, $$3);
        }
        amo $$4 = this.a($$0);
        if ($$2) {
            return ijt.c($$4, false);
        }
        if ($$1) {
            return ijt.a($$4, false);
        }
        return null;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ici)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

