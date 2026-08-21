/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class cls
extends cjd<cht> {
    public static final int c = 9;
    public static final int d = 11;
    public static final int e = 100;
    double f;

    public cls(double $$0) {
        super(Map.of(cqw.al, cqx.a), 100);
        this.f = $$0;
    }

    private @Nullable chl a(cht $$0) {
        return $$0.ev().c(cqw.p).orElse(null);
    }

    private boolean b(cht $$0) {
        return this.a($$0) != null && $$0.fx().c(ki.O);
    }

    @Override
    protected boolean a(axf $$0, cht $$1) {
        double $$5;
        if (!this.b($$1) || $$1.fZ()) {
            return false;
        }
        if ($$1.ev().c(cqw.al).orElse(clr.a.a) != clr.a.c) {
            return false;
        }
        chl $$2 = this.a($$1);
        double $$3 = $$1.h($$2.dP(), $$2.dR(), $$2.dV());
        int $$4 = $$1.cq() ? 2 : 0;
        ftm $$6 = csr.a($$1, Math.max(0.0, (double)(9 + $$4) - ($$5 = Math.sqrt($$3))), Math.max(1.0, (double)(11 + $$4) - $$5), 7, $$2.dI());
        if ($$6 == null) {
            return false;
        }
        $$1.ev().a(cqw.ai, $$6);
        return true;
    }

    protected void a(axf $$0, cht $$1, long $$2) {
        $$1.w(true);
        $$1.ev().a(cqw.ah, 0);
        super.d($$0, $$1, $$2);
    }

    protected boolean b(axf $$0, cht $$1, long $$2) {
        return $$1.ev().c(cqw.ah).orElse(100) < 100 && $$1.ev().c(cqw.ai).isPresent() && !$$1.N().l() && this.b($$1);
    }

    @Override
    protected void c(axf $$0, cht $$1, long $$22) {
        float f2;
        chl $$3 = this.a($$1);
        cgk $$4 = $$1.du();
        if ($$4 instanceof chn) {
            chn $$5 = (chn)$$4;
            f2 = $$5.gK();
        } else {
            f2 = 1.0f;
        }
        float $$6 = f2;
        $$1.ev().a(cqw.o, new cjp($$3, true));
        $$1.ev().a(cqw.ah, $$1.ev().c(cqw.ah).orElse(0) + 1);
        $$1.ev().c(cqw.ai).ifPresent($$2 -> $$1.N().a($$2.g, $$2.h, $$2.i, (double)$$6 * this.f));
    }

    @Override
    protected void d(axf $$0, cht $$1, long $$2) {
        $$1.N().n();
        $$1.w(false);
        $$1.gf();
        $$1.ev().b(cqw.ah);
        $$1.ev().b(cqw.ai);
        $$1.ev().b(cqw.al);
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
}

