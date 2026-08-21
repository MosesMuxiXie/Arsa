/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hsd
extends hrb<ena, hsv> {
    private static final amo c = amo.b("textures/entity/end_gateway_beam.png");

    public hsv d() {
        return new hsv();
    }

    @Override
    public void a(ena $$0, hsv $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        dwo $$5 = $$0.j();
        if ($$0.a() || $$0.c() && $$5 != null) {
            $$1.b = $$0.a() ? $$0.a($$2) : $$0.b($$2);
            double $$6 = $$0.a() ? (double)$$0.j().aw() : 50.0;
            $$1.b = bgj.a((double)($$1.b * (float)Math.PI));
            $$1.a = bgj.c((double)$$1.b * $$6);
            $$1.c = $$0.a() ? dkr.c.d() : dkr.k.d();
            $$1.d = $$0.j() != null ? (float)Math.floorMod($$0.j().au(), 40) + $$2 : 0.0f;
        } else {
            $$1.a = 0;
        }
    }

    @Override
    public void a(hsv $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a > 0) {
            hre.a($$1, $$2, c, $$0.b, $$0.d, -$$0.a, $$0.a * 2, $$0.c, 0.15f, 0.175f);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected float a() {
        return 1.0f;
    }

    @Override
    protected float b() {
        return 0.0f;
    }

    @Override
    protected ijs c() {
        return ijt.q();
    }

    @Override
    public int bl_() {
        return 256;
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.d();
    }
}

