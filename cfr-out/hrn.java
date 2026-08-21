/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hrn
implements hri<elg, hso> {
    private final ihk a;

    public hrn(hrj.a $$0) {
        this.a = $$0.c();
    }

    public hso a() {
        return new hso();
    }

    @Override
    public void a(elg $$0, hso $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.c = $$0.c();
        $$1.b = $$0.o().c(eox.bA);
        if ($$0.j() != null && $$0.c() != null) {
            $$1.i = hoh.a(hoh.a.a, $$0.j(), $$0.o(), $$0.aD_().a($$0.c()));
        }
        this.a.a($$1.a, $$0.d(), dlr.i, $$0.j(), null, 0);
    }

    @Override
    public void a(hso $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.b <= 0 || $$0.c == null || $$0.a.e()) {
            return;
        }
        $$1.a();
        $$1.a(0.0f, 0.5f, 0.0f);
        float[] $$4 = this.a($$0.c, $$0.b);
        $$1.a($$4[0], $$4[1], $$4[2]);
        $$1.a((Quaternionfc)a.d.rotationDegrees(75.0f));
        boolean $$5 = $$0.c == iz.f || $$0.c == iz.e;
        $$1.a((Quaternionfc)a.d.rotationDegrees(($$5 ? 90 : 0) + 11));
        $$1.b(0.5f, 0.5f, 0.5f);
        $$0.a.a($$1, $$2, $$0.i, ilg.d, 0);
        $$1.b();
    }

    private float[] a(iz $$0, int $$1) {
        float[] $$2 = new float[]{0.5f, 0.0f, 0.5f};
        float $$3 = (float)$$1 / 10.0f * 0.75f;
        switch ($$0) {
            case f: {
                $$2[0] = 0.73f + $$3;
                break;
            }
            case e: {
                $$2[0] = 0.25f - $$3;
                break;
            }
            case b: {
                $$2[1] = 0.25f + $$3;
                break;
            }
            case a: {
                $$2[1] = -0.23f - $$3;
                break;
            }
            case c: {
                $$2[2] = 0.25f - $$3;
                break;
            }
            case d: {
                $$2[2] = 0.73f + $$3;
            }
        }
        return $$2;
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

