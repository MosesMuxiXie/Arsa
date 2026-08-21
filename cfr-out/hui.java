/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hui
implements hug.a {
    final gfj a;

    public hui(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        if (this.a.r == null) {
            return;
        }
        for (cgk $$6 : this.a.r.f()) {
            if ($$6.cG() || !$$4.a($$6.dj()) || $$6 == this.a.au() && this.a.k.aV() == ges.a) continue;
            this.a($$6, $$5, false);
            if (!w.B) continue;
            cgk $$7 = this.a($$6);
            if ($$7 != null) {
                this.a($$6, $$5, true);
                continue;
            }
            um.a("Missing Server Entity", $$6.p($$5).b(0.0, $$6.dj().c() + 1.5, 0.0), ur.a.a(-65536));
        }
    }

    private @Nullable cgk a(cgk $$0) {
        axf $$2;
        iqa $$1 = this.a.aa();
        if ($$1 != null && ($$2 = $$1.a($$0.ao().aq())) != null) {
            return $$2.a($$0.aA());
        }
        return null;
    }

    private void a(cgk $$0, float $$1, boolean $$2) {
        ftm $$3 = $$0.dI();
        ftm $$4 = $$0.p($$1);
        ftm $$5 = $$4.d($$3);
        int $$6 = $$2 ? -16711936 : -1;
        um.a($$0.dj().c($$5), ul.a($$6));
        um.a($$4, $$6, 2.0f);
        cgk $$7 = $$0.dz();
        if ($$7 != null) {
            float $$8 = Math.min($$7.dF(), $$0.dF()) / 2.0f;
            float $$9 = 0.0625f;
            ftm $$10 = $$7.n($$0).e($$5);
            um.a(new fth($$10.g - (double)$$8, $$10.h, $$10.i - (double)$$8, $$10.g + (double)$$8, $$10.h + 0.0625, $$10.i + (double)$$8), ul.a(-256));
        }
        if ($$0 instanceof chl) {
            fth $$11 = $$0.dj().c($$5);
            float $$12 = 0.01f;
            um.a(new fth($$11.a, $$11.b + (double)$$0.dk() - (double)0.01f, $$11.c, $$11.d, $$11.b + (double)$$0.dk() + (double)0.01f, $$11.f), ul.a(-65536));
        }
        if ($$0 instanceof cyc) {
            cyc $$13 = (cyc)$$0;
            for (cyd $$14 : $$13.gM()) {
                ftm $$15 = $$14.dI();
                ftm $$16 = $$14.p($$1);
                ftm $$17 = $$16.d($$15);
                um.a($$14.dj().c($$17), ul.a(bel.a(1.0f, 0.25f, 1.0f, 0.0f)));
            }
        }
        ftm $$18 = $$4.b(0.0, $$0.dk(), 0.0);
        ftm $$19 = $$0.h($$1);
        um.b($$18, $$18.e($$19.c(2.0)), -16776961);
        if ($$2) {
            ftm $$20 = $$0.dN();
            um.b($$4, $$4.e($$20), -256);
        }
    }
}

