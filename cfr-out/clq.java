/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class clq
extends cjd<cht> {
    double c;
    float d;

    public clq(double $$0, float $$1) {
        super(Map.of(cqw.al, cqx.b));
        this.c = $$0;
        this.d = $$1 * $$1;
    }

    @Override
    private boolean a(cht $$0) {
        return this.b($$0) != null && $$0.fx().c(ki.O);
    }

    @Override
    protected boolean a(axf $$0, cht $$1) {
        return this.a($$1) && !$$1.fZ();
    }

    protected void a(axf $$0, cht $$1, long $$2) {
        $$1.w(true);
        $$1.ev().a(cqw.al, clr.a.a);
        super.d($$0, $$1, $$2);
    }

    private @Nullable chl b(cht $$0) {
        return $$0.ev().c(cqw.p).orElse(null);
    }

    protected boolean b(axf $$0, cht $$1, long $$2) {
        return this.a($$1) && this.c($$1);
    }

    private boolean c(cht $$0) {
        chl $$1 = this.b($$0);
        double $$2 = $$0.h($$1.dP(), $$1.dR(), $$1.dV());
        return $$2 > (double)this.d;
    }

    @Override
    protected void c(axf $$0, cht $$1, long $$2) {
        chl $$3 = this.b($$1);
        cgk $$4 = $$1.du();
        float $$5 = 1.0f;
        if ($$4 instanceof chn) {
            chn $$6 = (chn)$$4;
            $$5 = $$6.gK();
        }
        $$1.ev().a(cqw.o, new cjp($$3, true));
        $$1.N().a((cgk)$$3, (double)$$5 * this.c);
    }

    @Override
    protected void d(axf $$0, cht $$1, long $$2) {
        $$1.N().n();
        $$1.ev().a(cqw.al, clr.a.b);
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
}

