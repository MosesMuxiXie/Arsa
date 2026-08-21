/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hsf
implements hri<ene, htd> {
    private final hwo a;

    public hsf(hrj.a $$0) {
        this.a = $$0.e();
    }

    public htd a() {
        return new htd();
    }

    @Override
    public void a(ene $$0, htd $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        if ($$0.j() == null) {
            return;
        }
        enh $$5 = $$0.c();
        enl $$6 = $$5.h();
        cgk $$7 = $$6.a($$5, $$0.j(), $$5.g());
        hsf.a($$1, $$2, $$7, this.a, $$6.f(), $$6.e());
    }

    static void a(htd $$0, float $$1, @Nullable cgk $$2, hwo $$3, double $$4, double $$5) {
        if ($$2 == null) {
            return;
        }
        $$0.a = $$3.b($$2, $$1);
        $$0.a.T = $$0.i;
        $$0.b = (float)bgj.d((double)$$1, $$4, $$5) * 10.0f;
        $$0.c = 0.53125f;
        float $$6 = Math.max($$2.dF(), $$2.dG());
        if ((double)$$6 > 1.0) {
            $$0.c /= $$6;
        }
    }

    @Override
    public void a(htd $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a != null) {
            hsb.a($$1, $$2, $$0.a, this.a, $$0.b, $$0.c, $$3);
        }
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

