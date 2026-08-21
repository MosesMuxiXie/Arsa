/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hrd
implements hri<ekp, hsi> {
    private static final int a = 16;
    private static final float b = 0.6666667f;
    private final inu c;
    private final hgj d;
    private final hgj e;
    private final hgi f;
    private final hgi g;

    public hrd(hrj.a $$0) {
        this($$0.f(), $$0.h());
    }

    public hrd(iki.a $$0) {
        this($$0.b(), $$0.c());
    }

    public hrd(hdc $$0, inu $$1) {
        this.c = $$1;
        this.d = new hgj($$0.a(hdf.o));
        this.e = new hgj($$0.a(hdf.q));
        this.f = new hgi($$0.a(hdf.p));
        this.g = new hgi($$0.a(hdf.r));
    }

    public hsi a() {
        return new hsi();
    }

    @Override
    public void a(ekp $$0, hsi $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a = $$0.f();
        $$1.b = $$0.b();
        eoh $$5 = $$0.o();
        if ($$5.b() instanceof dyv) {
            $$1.d = -epn.b($$5.c(dyv.b));
            $$1.e = true;
        } else {
            $$1.d = -$$5.c(eji.b).p();
            $$1.e = false;
        }
        long $$6 = $$0.j() != null ? $$0.j().au() : 0L;
        is $$7 = $$0.aD_();
        $$1.c = ((float)Math.floorMod((long)($$7.u() * 7 + $$7.v() * 9 + $$7.w() * 13) + $$6, 100L) + $$2) / 100.0f;
    }

    @Override
    public void a(hsi $$0, fzm $$1, hpo $$2, ikp $$3) {
        hgi $$7;
        hgj $$6;
        if ($$0.e) {
            hgj $$4 = this.d;
            hgi $$5 = this.f;
        } else {
            $$6 = this.e;
            $$7 = this.g;
        }
        hrd.a(this.c, $$1, $$2, $$0.i, ilg.d, $$0.d, $$6, $$7, $$0.c, $$0.a, $$0.b, $$0.j, 0);
    }

    public void a(fzm $$0, hpo $$1, int $$2, int $$3, dkr $$4, ekr $$5, int $$6) {
        hrd.a(this.c, $$0, $$1, $$2, $$3, 0.0f, this.d, this.f, 0.0f, $$4, $$5, null, $$6);
    }

    private static void a(inu $$0, fzm $$1, hpo $$2, int $$3, int $$4, float $$5, hgj $$6, hgi $$7, float $$8, dkr $$9, ekr $$10, @Nullable igi.a $$11, int $$12) {
        $$1.a();
        $$1.a(0.5f, 0.0f, 0.5f);
        $$1.a((Quaternionfc)a.d.rotationDegrees($$5));
        $$1.b(0.6666667f, -0.6666667f, -0.6666667f);
        ins $$13 = inx.h;
        $$2.a($$6, bhr.a, $$1, $$13.a(ijt::d), $$3, $$4, -1, $$0.a($$13), $$12, $$11);
        hrd.a($$0, $$1, $$2, $$3, $$4, $$7, Float.valueOf($$8), $$13, true, $$9, $$10, false, $$11, $$12);
        $$1.b();
    }

    public static <S> void a(inu $$0, fzm $$1, hpo $$2, int $$3, int $$4, gzp<S> $$5, S $$6, ins $$7, boolean $$8, dkr $$9, ekr $$10, boolean $$11, @Nullable igi.a $$12, int $$13) {
        $$2.a($$5, $$6, $$1, $$7.a(ijt::d), $$3, $$4, -1, $$0.a($$7), $$13, $$12);
        if ($$11) {
            $$2.a($$5, $$6, $$1, ijt.i(), $$3, $$4, -1, $$0.a($$7), 0, $$12);
        }
        hrd.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8 ? hpj.B : hpj.C, $$9, $$12);
        for (int $$14 = 0; $$14 < 16 && $$14 < $$10.b().size(); ++$$14) {
            ekr.b $$15 = $$10.b().get($$14);
            ins $$16 = $$8 ? hpj.a($$15.b()) : hpj.b($$15.b());
            hrd.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$15.c(), null);
        }
    }

    private static <S> void a(inu $$0, fzm $$1, hpo $$2, int $$3, int $$4, gzp<S> $$5, S $$6, ins $$7, dkr $$8, @Nullable igi.a $$9) {
        int $$10 = $$8.d();
        $$2.a($$5, $$6, $$1, $$7.a(ijt::n), $$3, $$4, $$10, $$0.a($$7), 0, $$9);
    }

    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        $$1.a(0.5f, 0.0f, 0.5f);
        $$1.b(0.6666667f, -0.6666667f, -0.6666667f);
        this.d.b().a($$1, $$0);
        this.f.a(Float.valueOf(0.0f));
        this.f.b().a($$1, $$0);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

