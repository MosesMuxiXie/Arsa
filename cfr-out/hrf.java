/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.function.Consumer;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hrf
implements hri<ekx, hsk> {
    private final inu a;
    private final gzp.a b;
    private final gzp.a c;

    public hrf(hrj.a $$0) {
        this($$0.h(), $$0.f());
    }

    public hrf(iki.a $$0) {
        this($$0.c(), $$0.b());
    }

    public hrf(inu $$0, hdc $$1) {
        this.a = $$0;
        this.b = new gzp.a($$1.a(hdf.u), ijt::d);
        this.c = new gzp.a($$1.a(hdf.t), ijt::d);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("main", hdl.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f), hdi.a);
        $$1.a("left_leg", hdl.c().a(50, 6).a(0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f), hdi.b(1.5707964f, 0.0f, 1.5707964f));
        $$1.a("right_leg", hdl.c().a(50, 18).a(-16.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f), hdi.b(1.5707964f, 0.0f, (float)Math.PI));
        return hdm.a($$0, 64, 64);
    }

    public static hdm d() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("main", hdl.c().a(0, 22).a(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f), hdi.a);
        $$1.a("left_leg", hdl.c().a(50, 0).a(0.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f), hdi.b(1.5707964f, 0.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(50, 12).a(-16.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f), hdi.b(1.5707964f, 0.0f, 4.712389f));
        return hdm.a($$0, 64, 64);
    }

    public hsk f() {
        return new hsk();
    }

    @Override
    public void a(ekx $$02, hsk $$12, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$02, $$12, $$2, $$3, $$4);
        $$12.a = $$02.c();
        $$12.b = (iz)$$02.o().c(dzj.f);
        boolean bl2 = $$12.c = $$02.o().c(dzj.b) == eou.a;
        if ($$02.j() != null) {
            eca.c<ekx> $$5 = eca.a(eld.z, dzj::i, dzj::h, eau.c, $$02.o(), $$02.j(), $$02.aD_(), ($$0, $$1) -> false);
            $$12.i = ((Int2IntFunction)$$5.apply(new hrm())).get($$12.i);
        }
    }

    @Override
    public void a(hsk $$0, fzm $$1, hpo $$2, ikp $$3) {
        ins $$4 = hpj.a($$0.a);
        this.a($$1, $$2, $$0.c ? this.b : this.c, $$0.b, $$4, $$0.i, ilg.d, false, $$0.j, 0);
    }

    public void a(fzm $$0, hpo $$1, int $$2, int $$3, ins $$4, int $$5) {
        this.a($$0, $$1, this.b, iz.d, $$4, $$2, $$3, false, null, $$5);
        this.a($$0, $$1, this.c, iz.d, $$4, $$2, $$3, true, null, $$5);
    }

    private void a(fzm $$0, hpo $$1, gzp.a $$2, iz $$3, ins $$4, int $$5, int $$6, boolean $$7, @Nullable igi.a $$8, int $$9) {
        $$0.a();
        hrf.a($$0, $$7, $$3);
        $$1.a($$2, bhr.a, $$0, $$4.a(ijt::d), $$5, $$6, -1, this.a.a($$4), $$9, $$8);
        $$0.b();
    }

    private static void a(fzm $$0, boolean $$1, iz $$2) {
        $$0.a(0.0f, 0.5625f, $$1 ? -1.0f : 0.0f);
        $$0.a((Quaternionfc)a.b.rotationDegrees(90.0f));
        $$0.a(0.5f, 0.5f, 0.5f);
        $$0.a((Quaternionfc)a.f.rotationDegrees(180.0f + $$2.p()));
        $$0.a(-0.5f, -0.5f, -0.5f);
    }

    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        hrf.a($$1, false, iz.d);
        this.b.b().a($$1, $$0);
        $$1.e();
        hrf.a($$1, true, iz.d);
        this.c.b().a($$1, $$0);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.f();
    }
}

