/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public abstract class hrc
implements hri<ems, htb> {
    private static final int a = -988212;
    private static final int b = bgj.i(16);
    private final gio c;
    private final inu d;

    public hrc(hrj.a $$0) {
        this.c = $$0.g();
        this.d = $$0.h();
    }

    protected abstract gzp.a a(eoh var1, epw var2);

    protected abstract ins a(epw var1);

    protected abstract float a();

    protected abstract float b();

    protected abstract ftm c();

    protected abstract void a(fzm var1, float var2, eoh var3);

    @Override
    public void a(htb $$0, fzm $$1, hpo $$2, ikp $$3) {
        eoh $$4 = $$0.g;
        ehf $$5 = (ehf)$$4.b();
        gzp.a $$6 = this.a($$4, $$5.d());
        this.a($$0, $$1, $$4, $$5, $$5.d(), $$6, $$0.j, $$2);
    }

    private void a(htb $$0, fzm $$1, eoh $$2, ehf $$3, epw $$4, gzp.a $$5, @Nullable igi.a $$6, hpo $$7) {
        $$1.a();
        this.a($$1, -$$3.h($$2), $$2);
        this.a($$1, $$0.i, $$4, $$5, $$6, $$7);
        this.a($$0, $$1, $$7, true);
        this.a($$0, $$1, $$7, false);
        $$1.b();
    }

    protected void a(fzm $$0, int $$1, epw $$2, gzp.a $$3, @Nullable igi.a $$4, hpo $$5) {
        $$0.a();
        float $$6 = this.a();
        $$0.b($$6, -$$6, -$$6);
        ins $$7 = this.a($$2);
        ijs $$8 = $$7.a($$3::a);
        $$5.a($$3, bhr.a, $$0, $$8, $$1, ilg.d, -1, this.d.a($$7), 0, $$4);
        $$0.b();
    }

    private void a(htb $$0, fzm $$12, hpo $$2, boolean $$3) {
        int $$13;
        boolean $$122;
        int $$11;
        emt $$4;
        emt emt2 = $$4 = $$3 ? $$0.a : $$0.b;
        if ($$4 == null) {
            return;
        }
        $$12.a();
        this.a($$12, $$3, this.c());
        int $$5 = hrc.a($$4);
        int $$6 = 4 * $$0.c / 2;
        bfr[] $$7 = $$4.a($$0.e, (yh $$1) -> {
            List<bfr> $$2 = this.c.c((yn)$$1, $$0.d);
            return $$2.isEmpty() ? bfr.a : $$2.get(0);
        });
        if ($$4.a()) {
            int $$8 = $$4.b().g();
            boolean $$9 = $$8 == dkr.p.g() || $$0.k;
            int $$10 = 0xF000F0;
        } else {
            $$11 = $$5;
            $$122 = false;
            $$13 = $$0.i;
        }
        for (int $$14 = 0; $$14 < 4; ++$$14) {
            bfr $$15 = $$7[$$14];
            float $$16 = -this.c.a($$15) / 2;
            $$2.a($$12, $$16, $$14 * $$0.c - $$6, $$15, false, gio.a.c, $$13, $$11, 0, $$122 ? $$5 : 0);
        }
        $$12.b();
    }

    private void a(fzm $$0, boolean $$1, ftm $$2) {
        if (!$$1) {
            $$0.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        }
        float $$3 = 0.015625f * this.b();
        $$0.a($$2);
        $$0.b($$3, -$$3, $$3);
    }

    private static boolean a(is $$0) {
        gfj $$1 = gfj.V();
        hnh $$2 = $$1.s;
        if ($$2 != null && $$1.k.aV().a() && $$2.hj()) {
            return true;
        }
        cgk $$3 = $$1.au();
        return $$3 != null && $$3.g(ftm.b($$0)) < (double)b;
    }

    public static int a(emt $$0) {
        int $$1 = $$0.b().g();
        if ($$1 == dkr.p.g() && $$0.a()) {
            return -988212;
        }
        return bel.b($$1, 0.4f);
    }

    public htb d() {
        return new htb();
    }

    @Override
    public void a(ems $$0, htb $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.d = $$0.c();
        $$1.c = $$0.a();
        $$1.a = $$0.h();
        $$1.b = $$0.k();
        $$1.e = gfj.V().aW();
        $$1.k = hrc.a($$0.aD_());
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.d();
    }
}

