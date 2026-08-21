/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hrt
implements hri<elz, hsu> {
    public static final ins a = hpj.o.a("enchanting_table_book");
    private final inu b;
    private final hgr c;

    public hrt(hrj.a $$0) {
        this.b = $$0.h();
        this.c = new hgr($$0.a(hdf.G));
    }

    public hsu a() {
        return new hsu();
    }

    @Override
    public void a(elz $$0, hsu $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        float $$5;
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.c = bgj.h($$2, $$0.c, $$0.b);
        $$1.d = bgj.h($$2, $$0.g, $$0.f);
        $$1.a = (float)$$0.a + $$2;
        for ($$5 = $$0.h - $$0.i; $$5 >= (float)Math.PI; $$5 -= (float)Math.PI * 2) {
        }
        while ($$5 < (float)(-Math.PI)) {
            $$5 += (float)Math.PI * 2;
        }
        $$1.b = $$0.i + $$5 * $$2;
    }

    @Override
    public void a(hsu $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a(0.5f, 0.75f, 0.5f);
        $$1.a(0.0f, 0.1f + bgj.a((double)($$0.a * 0.1f)) * 0.01f, 0.0f);
        float $$4 = $$0.b;
        $$1.a((Quaternionfc)a.d.rotation(-$$4));
        $$1.a((Quaternionfc)a.f.rotationDegrees(80.0f));
        float $$5 = bgj.g($$0.c + 0.25f) * 1.6f - 0.3f;
        float $$6 = bgj.g($$0.c + 0.75f) * 1.6f - 0.3f;
        hgr.a $$7 = new hgr.a($$0.a, bgj.a($$5, 0.0f, 1.0f), bgj.a($$6, 0.0f, 1.0f), $$0.d);
        $$2.a(this.c, $$7, $$1, a.a(ijt::d), $$0.i, ilg.d, -1, this.b.a(a), 0, $$0.j);
        $$1.b();
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

