/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cmk
extends cjd<dcx> {
    private static final int c = 80;
    private long d;
    private long e;
    private int f;
    private Optional<is> g = Optional.empty();

    public cmk() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.b), cqw.n, (Object)((Object)cqx.b)));
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        if ($$1.at % 10 != 0 || this.e != 0L && this.e + 160L > (long)$$1.at) {
            return false;
        }
        if ($$1.gP().a_(dlx.tC) <= 0) {
            return false;
        }
        this.g = this.b($$0, $$1);
        return this.g.isPresent();
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return this.f < 80 && this.g.isPresent();
    }

    private Optional<is> b(axf $$0, dcx $$1) {
        is.a $$2 = new is.a();
        Optional<is> $$3 = Optional.empty();
        int $$4 = 0;
        for (int $$5 = -1; $$5 <= 1; ++$$5) {
            for (int $$6 = -1; $$6 <= 1; ++$$6) {
                for (int $$7 = -1; $$7 <= 1; ++$$7) {
                    $$2.a($$1.dK(), $$5, $$6, $$7);
                    if (!this.a($$2, $$0) || $$0.y.a(++$$4) != 0) continue;
                    $$3 = Optional.of($$2.j());
                }
            }
        }
        return $$3;
    }

    private boolean a(is $$0, axf $$1) {
        eoh $$2 = $$1.a_($$0);
        dzq $$3 = $$2.b();
        return $$3 instanceof ebp && !((ebp)$$3).i($$2);
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        this.a($$1);
        $$1.a(cgv.a, new dlt(dlx.tC));
        this.d = $$2;
        this.f = 0;
    }

    private void a(dcx $$0) {
        this.g.ifPresent($$1 -> {
            cjg $$2 = new cjg((is)$$1);
            $$0.ev().a(cqw.o, $$2);
            $$0.ev().a(cqw.n, new cqz($$2, 0.5f, 1));
        });
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        $$1.a(cgv.a, dlt.l);
        this.e = $$1.at;
    }

    @Override
    protected void d(axf $$0, dcx $$1, long $$2) {
        is $$3 = this.g.get();
        if ($$2 < this.d || !$$3.a($$1.dI(), 1.0)) {
            return;
        }
        dlt $$4 = dlt.l;
        cdk $$5 = $$1.gP();
        int $$6 = $$5.b();
        for (int $$7 = 0; $$7 < $$6; ++$$7) {
            dlt $$8 = $$5.a($$7);
            if (!$$8.a(dlx.tC)) continue;
            $$4 = $$8;
            break;
        }
        if (!$$4.f() && dkd.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
        }
        ++this.f;
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

