/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class clr
extends cjd<cht> {
    public static final int c = 6;
    public static final int d = 7;
    double e;
    double f;
    float g;
    float h;

    public clr(double $$0, double $$1, float $$2, float $$3) {
        super(Map.of(cqw.al, cqx.a));
        this.e = $$0;
        this.f = $$1;
        this.g = $$2 * $$2;
        this.h = $$3 * $$3;
    }

    private @Nullable chl a(cht $$0) {
        return $$0.ev().c(cqw.p).orElse(null);
    }

    private boolean b(cht $$0) {
        return this.a($$0) != null && $$0.fx().c(ki.O);
    }

    private int c(cht $$0) {
        return Optional.ofNullable($$0.fx().a(ki.O)).map(doq::a).orElse(0);
    }

    @Override
    protected boolean a(axf $$0, cht $$1) {
        return $$1.ev().c(cqw.al).orElse(clr$a.a) == clr$a.b && this.b($$1) && !$$1.fZ();
    }

    protected void a(axf $$0, cht $$1, long $$2) {
        $$1.w(true);
        $$1.ev().a(cqw.ak, this.c($$1));
        $$1.ev().b(cqw.aj);
        $$1.c(cdb.a);
        super.d($$0, $$1, $$2);
    }

    protected boolean b(axf $$0, cht $$1, long $$2) {
        return $$1.ev().c(cqw.ak).orElse(0) > 0 && this.b($$1);
    }

    @Override
    protected void c(axf $$0, cht $$1, long $$2) {
        chl $$3 = this.a($$1);
        double $$4 = $$1.h($$3.dP(), $$3.dR(), $$3.dV());
        cgk $$5 = $$1.du();
        float $$6 = 1.0f;
        if ($$5 instanceof chn) {
            chn $$7 = (chn)$$5;
            $$6 = $$7.gK();
        }
        int $$8 = $$1.cq() ? 2 : 0;
        $$1.ev().a(cqw.o, new cjp($$3, true));
        $$1.ev().a(cqw.ak, $$1.ev().c(cqw.ak).orElse(0) - 1);
        ftm $$9 = $$1.ev().c(cqw.aj).orElse(null);
        if ($$9 != null) {
            $$1.N().a($$9.g, $$9.h, $$9.i, (double)$$6 * this.f);
            if ($$1.N().l()) {
                $$1.ev().b(cqw.aj);
            }
        } else {
            $$1.N().a((cgk)$$3, (double)$$6 * this.e);
            if ($$4 < (double)this.h || $$1.N().l()) {
                double $$10 = Math.sqrt($$4);
                ftm $$11 = csr.a($$1, (double)(6 + $$8) - $$10, (double)(7 + $$8) - $$10, 7, $$3.dI());
                $$1.ev().a(cqw.aj, $$11);
            }
        }
    }

    @Override
    protected void d(axf $$0, cht $$1, long $$2) {
        $$1.N().n();
        $$1.gf();
        $$1.ev().b(cqw.aj);
        $$1.ev().b(cqw.ak);
        $$1.ev().a(cqw.al, clr$a.c);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (cht)chl2, l2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = clr$a.a();
        }
    }
}

