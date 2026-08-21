/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hrq
implements hri<elo, hsr> {
    public static final hom a = new hom(ilo.d, "entity/conduit");
    public static final ins b = a.a("base");
    public static final ins c = a.a("cage");
    public static final ins d = a.a("wind");
    public static final ins e = a.a("wind_vertical");
    public static final ins f = a.a("open_eye");
    public static final ins g = a.a("closed_eye");
    private final inu h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;

    public hrq(hrj.a $$0) {
        this.h = $$0.h();
        this.i = $$0.a(hdf.ak);
        this.j = $$0.a(hdf.am);
        this.k = $$0.a(hdf.al);
        this.l = $$0.a(hdf.aj);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("eye", hdl.c().a(0, 0).a(-4.0f, -4.0f, 0.0f, 8.0f, 8.0f, 0.0f, new hdk(0.01f)), hdi.a);
        return hdm.a($$0, 16, 16);
    }

    public static hdm d() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("wind", hdl.c().a(0, 0).a(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f), hdi.a);
        return hdm.a($$0, 64, 32);
    }

    public static hdm f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("shell", hdl.c().a(0, 0).a(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), hdi.a);
        return hdm.a($$0, 32, 16);
    }

    public static hdm g() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("shell", hdl.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), hdi.a);
        return hdm.a($$0, 32, 16);
    }

    public hsr h() {
        return new hsr();
    }

    @Override
    public void a(elo $$0, hsr $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.b = $$0.c();
        $$1.c = $$0.a($$0.c() ? $$2 : 0.0f);
        $$1.a = (float)$$0.a + $$2;
        $$1.d = $$0.a / 66 % 3;
        $$1.e = $$0.d();
    }

    @Override
    public void a(hsr $$0, fzm $$1, hpo $$2, ikp $$3) {
        if (!$$0.b) {
            $$1.a();
            $$1.a(0.5f, 0.5f, 0.5f);
            $$1.a((Quaternionfc)new Quaternionf().rotationY($$0.c * ((float)Math.PI / 180)));
            $$2.a(this.k, $$1, b.a(ijt::d), $$0.i, ilg.d, this.h.a(b), -1, $$0.j);
            $$1.b();
            return;
        }
        float $$4 = $$0.c * 57.295776f;
        float $$5 = bgj.a((double)($$0.a * 0.1f)) / 2.0f + 0.5f;
        $$5 = $$5 * $$5 + $$5;
        $$1.a();
        $$1.a(0.5f, 0.3f + $$5 * 0.2f, 0.5f);
        Vector3f $$6 = new Vector3f(0.5f, 1.0f, 0.5f).normalize();
        $$1.a((Quaternionfc)new Quaternionf().rotationAxis($$4 * ((float)Math.PI / 180), (Vector3fc)$$6));
        $$2.a(this.l, $$1, c.a(ijt::g), $$0.i, ilg.d, this.h.a(c), -1, $$0.j);
        $$1.b();
        $$1.a();
        $$1.a(0.5f, 0.5f, 0.5f);
        if ($$0.d == 1) {
            $$1.a((Quaternionfc)new Quaternionf().rotationX(1.5707964f));
        } else if ($$0.d == 2) {
            $$1.a((Quaternionfc)new Quaternionf().rotationZ(1.5707964f));
        }
        ins $$7 = $$0.d == 1 ? e : d;
        ijs $$8 = $$7.a(ijt::g);
        ilp $$9 = this.h.a($$7);
        $$2.a(this.j, $$1, $$8, $$0.i, ilg.d, $$9);
        $$1.b();
        $$1.a();
        $$1.a(0.5f, 0.5f, 0.5f);
        $$1.b(0.875f, 0.875f, 0.875f);
        $$1.a((Quaternionfc)new Quaternionf().rotationXYZ((float)Math.PI, 0.0f, (float)Math.PI));
        $$2.a(this.j, $$1, $$8, $$0.i, ilg.d, $$9);
        $$1.b();
        $$1.a();
        $$1.a(0.5f, 0.3f + $$5 * 0.2f, 0.5f);
        $$1.b(0.5f, 0.5f, 0.5f);
        $$1.a((Quaternionfc)$$3.e);
        $$1.a((Quaternionfc)new Quaternionf().rotationZ((float)Math.PI).rotateY((float)Math.PI));
        float $$10 = 1.3333334f;
        $$1.b(1.3333334f, 1.3333334f, 1.3333334f);
        ins $$11 = $$0.e ? f : g;
        $$2.a(this.i, $$1, $$11.a(ijt::g), $$0.i, ilg.d, this.h.a($$11));
        $$1.b();
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.h();
    }
}

