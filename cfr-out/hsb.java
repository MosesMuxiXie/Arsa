/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hsb
implements hri<emw, htd> {
    private final hwo a;

    public hsb(hrj.a $$0) {
        this.a = $$0.e();
    }

    public htd a() {
        return new htd();
    }

    @Override
    public void a(emw $$0, htd $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        if ($$0.j() == null) {
            return;
        }
        dvp $$5 = $$0.c();
        cgk $$6 = $$5.b($$0.j(), $$0.aD_());
        hsf.a($$1, $$2, $$6, this.a, $$5.b(), $$5.a());
    }

    @Override
    public void a(htd $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a != null) {
            hsb.a($$1, $$2, $$0.a, this.a, $$0.b, $$0.c, $$3);
        }
    }

    public static void a(fzm $$0, hpo $$1, idf $$2, hwo $$3, float $$4, float $$5, ikp $$6) {
        $$0.a();
        $$0.a(0.5f, 0.4f, 0.5f);
        $$0.a((Quaternionfc)a.d.rotationDegrees($$4));
        $$0.a(0.0f, -0.2f, 0.0f);
        $$0.a((Quaternionfc)a.b.rotationDegrees(-30.0f));
        $$0.b($$5, $$5, $$5);
        $$3.a($$2, $$6, 0.0, 0.0, 0.0, $$0, $$1);
        $$0.b();
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

