/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hyu
extends hxx<dae, ifb, hfb> {
    private static final amo a = hpj.x.b().a($$0 -> "textures/" + $$0 + ".png");
    private static final amo[] i = (amo[])hpj.y.stream().map($$02 -> $$02.b().a($$0 -> "textures/" + $$0 + ".png")).toArray(amo[]::new);

    public hyu(hwq.a $$0) {
        super($$0, new hfb($$0.a(hdf.de)), 0.0f);
    }

    @Override
    public ftm a(ifb $$0) {
        return $$0.a;
    }

    @Override
    public boolean a(dae $$0, htx $$1, double $$2, double $$3, double $$4) {
        if (super.a($$0, $$1, $$2, $$3, $$4)) {
            return true;
        }
        ftm $$5 = $$0.M(0.0f);
        if ($$5 == null) {
            return false;
        }
        cgu<?> $$6 = $$0.ay();
        float $$7 = $$6.m() / 2.0f;
        float $$8 = $$6.l() / 2.0f;
        ftm $$9 = ftm.c($$0.dK());
        return $$1.a(new fth($$5.g, $$5.h + (double)$$7, $$5.i, $$9.g, $$9.h + (double)$$7, $$9.i).c($$8, $$7, $$8));
    }

    @Override
    public amo b(ifb $$0) {
        return hyu.a($$0.b);
    }

    public ifb b() {
        return new ifb();
    }

    @Override
    public void a(dae $$0, ifb $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = Objects.requireNonNullElse($$0.M($$2), ftm.c);
        $$1.b = $$0.gR();
        $$1.c = $$0.L($$2);
        $$1.d = $$0.bE;
        $$1.e = $$0.bC;
        $$1.f = $$0.gP();
    }

    public static amo a(@Nullable dkr $$0) {
        if ($$0 == null) {
            return a;
        }
        return i[$$0.a()];
    }

    @Override
    protected void a(ifb $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2 + 180.0f, $$3);
        $$1.a((Quaternionfc)$$0.f.g().b(), 0.0f, 0.5f, 0.0f);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

