/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hrs
implements hri<elu, hst> {
    private final inu a;
    private static final String b = "neck";
    private static final String c = "front";
    private static final String d = "back";
    private static final String e = "left";
    private static final String f = "right";
    private static final String g = "top";
    private static final String h = "bottom";
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg o;
    private static final float p = 0.125f;

    public hrs(hrj.a $$0) {
        this($$0.f(), $$0.h());
    }

    public hrs(iki.a $$0) {
        this($$0.b(), $$0.c());
    }

    public hrs(hdc $$0, inu $$1) {
        this.a = $$1;
        hdg $$2 = $$0.a(hdf.aC);
        this.i = $$2.b(b);
        this.n = $$2.b(g);
        this.o = $$2.b(h);
        hdg $$3 = $$0.a(hdf.aD);
        this.j = $$3.b(c);
        this.k = $$3.b(d);
        this.l = $$3.b(e);
        this.m = $$3.b(f);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdk $$2 = new hdk(0.2f);
        hdk $$3 = new hdk(-0.1f);
        $$1.a(b, hdl.c().a(0, 0).a(4.0f, 17.0f, 4.0f, 8.0f, 3.0f, 8.0f, $$3).a(0, 5).a(5.0f, 20.0f, 5.0f, 6.0f, 1.0f, 6.0f, $$2), hdi.a(0.0f, 37.0f, 16.0f, (float)Math.PI, 0.0f, 0.0f));
        hdl $$4 = hdl.c().a(-14, 13).a(0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 14.0f);
        $$1.a(g, $$4, hdi.a(1.0f, 16.0f, 1.0f, 0.0f, 0.0f, 0.0f));
        $$1.a(h, $$4, hdi.a(1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f));
        return hdm.a($$0, 32, 32);
    }

    public static hdm d() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdl $$2 = hdl.c().a(1, 0).a(0.0f, 0.0f, 0.0f, 14.0f, 16.0f, 0.0f, EnumSet.of(iz.c));
        $$1.a(d, $$2, hdi.a(15.0f, 16.0f, 1.0f, 0.0f, 0.0f, (float)Math.PI));
        $$1.a(e, $$2, hdi.a(1.0f, 16.0f, 1.0f, 0.0f, -1.5707964f, (float)Math.PI));
        $$1.a(f, $$2, hdi.a(15.0f, 16.0f, 15.0f, 0.0f, 1.5707964f, (float)Math.PI));
        $$1.a(c, $$2, hdi.a(1.0f, 16.0f, 15.0f, (float)Math.PI, 0.0f, 0.0f));
        return hdm.a($$0, 16, 16);
    }

    private static ins a(Optional<dlp> $$0) {
        ins $$1;
        if ($$0.isPresent() && ($$1 = hpj.a(elw.a($$0.get()))) != null) {
            return $$1;
        }
        return hpj.F;
    }

    public hst f() {
        return new hst();
    }

    @Override
    public void a(elu $$0, hst $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.d = $$0.m();
        $$1.e = $$0.l();
        elu.a $$5 = $$0.h;
        $$1.c = $$5 != null && $$0.j() != null ? ((float)($$0.j().au() - $$0.g) + $$2) / (float)$$5.c : 0.0f;
    }

    @Override
    public void a(hst $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        iz $$4 = $$0.e;
        $$1.a(0.5, 0.0, 0.5);
        $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$4.p()));
        $$1.a(-0.5, 0.0, -0.5);
        if ($$0.c >= 0.0f && $$0.c <= 1.0f) {
            if ($$0.b == elu.a.a) {
                float $$5 = 0.015625f;
                float $$6 = $$0.c * ((float)Math.PI * 2);
                float $$7 = -1.5f * (bgj.b((double)$$6) + 0.5f) * bgj.a((double)($$6 / 2.0f));
                $$1.a((Quaternionfc)a.b.rotation($$7 * 0.015625f), 0.5f, 0.0f, 0.5f);
                float $$8 = bgj.a((double)$$6);
                $$1.a((Quaternionfc)a.f.rotation($$8 * 0.015625f), 0.5f, 0.0f, 0.5f);
            } else {
                float $$9 = bgj.a((double)(-$$0.c * 3.0f * (float)Math.PI)) * 0.125f;
                float $$10 = 1.0f - $$0.c;
                $$1.a((Quaternionfc)a.d.rotation($$9 * $$10), 0.5f, 0.0f, 0.5f);
            }
        }
        this.a($$1, $$2, $$0.i, ilg.d, $$0.d, 0);
        $$1.b();
    }

    public void a(fzm $$0, hpo $$1, int $$2, int $$3, eml $$4, int $$5) {
        ijs $$6 = hpj.E.a(ijt::d);
        ilp $$7 = this.a.a(hpj.E);
        $$1.a(this.i, $$0, $$6, $$2, $$3, $$7, false, false, -1, null, $$5);
        $$1.a(this.n, $$0, $$6, $$2, $$3, $$7, false, false, -1, null, $$5);
        $$1.a(this.o, $$0, $$6, $$2, $$3, $$7, false, false, -1, null, $$5);
        ins $$8 = hrs.a($$4.e());
        $$1.a(this.j, $$0, $$8.a(ijt::d), $$2, $$3, this.a.a($$8), false, false, -1, null, $$5);
        ins $$9 = hrs.a($$4.b());
        $$1.a(this.k, $$0, $$9.a(ijt::d), $$2, $$3, this.a.a($$9), false, false, -1, null, $$5);
        ins $$10 = hrs.a($$4.c());
        $$1.a(this.l, $$0, $$10.a(ijt::d), $$2, $$3, this.a.a($$10), false, false, -1, null, $$5);
        ins $$11 = hrs.a($$4.d());
        $$1.a(this.m, $$0, $$11.a(ijt::d), $$2, $$3, this.a.a($$11), false, false, -1, null, $$5);
    }

    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        this.i.a($$1, $$0);
        this.n.a($$1, $$0);
        this.o.a($$1, $$0);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.f();
    }
}

