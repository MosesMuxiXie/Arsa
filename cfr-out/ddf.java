/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ddf
implements dwb {
    private static final int b = 1200;
    public static final int a = 24000;
    private static final int c = 25;
    private static final int d = 75;
    private static final int e = 25;
    private static final int f = 10;
    private static final int g = 10;
    private final bgr h = bgr.a();
    private final fnn i;
    private int j;
    private int k;
    private int l;

    public ddf(fnn $$0) {
        this.i = $$0;
        this.j = 1200;
        this.k = $$0.s();
        this.l = $$0.t();
        if (this.k == 0 && this.l == 0) {
            this.k = 24000;
            $$0.d(this.k);
            this.l = 25;
            $$0.e(this.l);
        }
    }

    @Override
    public void a(axf $$0, boolean $$1) {
        if (!$$0.U().a(eua.Z).booleanValue()) {
            return;
        }
        if (--this.j > 0) {
            return;
        }
        this.j = 1200;
        this.k -= 1200;
        this.i.d(this.k);
        if (this.k > 0) {
            return;
        }
        this.k = 24000;
        int $$2 = this.l;
        this.l = bgj.a(this.l + 25, 25, 75);
        this.i.e(this.l);
        if (this.h.a(100) > $$2) {
            return;
        }
        if (this.a($$0)) {
            this.l = 25;
        }
    }

    private boolean a(axf $$02) {
        axg $$1 = $$02.n();
        if ($$1 == null) {
            return true;
        }
        if (this.h.a(10) != 0) {
            return false;
        }
        is $$2 = $$1.dK();
        int $$3 = 48;
        csx $$4 = $$02.F();
        Optional<is> $$5 = $$4.d($$0 -> $$0.a(ctb.o), $$0 -> true, $$2, 48, csx.b.c);
        is $$6 = $$5.orElse($$2);
        is $$7 = this.a((dwr)$$02, $$6, 48);
        if ($$7 != null && this.a((dvt)$$02, $$7)) {
            if ($$02.z($$7).a(bdo.ac)) {
                return false;
            }
            dde $$8 = cgu.bN.a($$02, $$7, cgt.h);
            if ($$8 != null) {
                for (int $$9 = 0; $$9 < 2; ++$$9) {
                    this.a($$02, $$8, 4);
                }
                this.i.a($$8.cY());
                $$8.s(48000);
                $$8.h($$6);
                $$8.a($$6, 16);
                return true;
            }
        }
        return false;
    }

    private void a(axf $$0, dde $$1, int $$2) {
        is $$3 = this.a((dwr)$$0, $$1.dK(), $$2);
        if ($$3 == null) {
            return;
        }
        cux $$4 = cgu.bG.a($$0, $$3, cgt.h);
        if ($$4 == null) {
            return;
        }
        $$4.a_($$1, true);
    }

    private @Nullable is a(dwr $$0, is $$1, int $$2) {
        is $$3 = null;
        cif $$4 = cih.a(cgu.bN);
        for (int $$5 = 0; $$5 < 10; ++$$5) {
            int $$7;
            int $$8;
            int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
            is $$9 = new is($$6, $$8 = $$0.a(euq.a.b, $$6, $$7 = $$1.w() + this.h.a($$2 * 2) - $$2), $$7);
            if (!$$4.isSpawnPositionOk($$0, $$9, cgu.bN)) continue;
            $$3 = $$9;
            break;
        }
        return $$3;
    }

    private boolean a(dvt $$0, is $$1) {
        for (is $$2 : is.c($$1, $$1.b(1, 2, 1))) {
            if ($$0.a_($$2).g($$0, $$2).c()) continue;
            return false;
        }
        return true;
    }
}

