/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cko
extends cjd<chn> {
    private static final int c = 40;
    private int d;
    private @Nullable flp e;
    private @Nullable is f;
    private float g;

    public cko() {
        this(150, 250);
    }

    public cko(int $$0, int $$1) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.F, (Object)((Object)cqx.c), cqw.u, (Object)((Object)cqx.b), cqw.n, (Object)((Object)cqx.a)), $$0, $$1);
    }

    @Override
    protected boolean a(axf $$0, chn $$1) {
        if (this.d > 0) {
            --this.d;
            return false;
        }
        cim<?> $$2 = $$1.ev();
        cqz $$3 = $$2.c(cqw.n).get();
        boolean $$4 = this.a($$1, $$3);
        if (!$$4 && this.a($$1, $$3, $$0.au())) {
            this.f = $$3.a().b();
            return true;
        }
        $$2.b(cqw.n);
        if ($$4) {
            $$2.b(cqw.F);
        }
        return false;
    }

    @Override
    protected boolean a(axf $$0, chn $$1, long $$2) {
        if (this.e == null || this.f == null) {
            return false;
        }
        Optional<cqz> $$3 = $$1.ev().c(cqw.n);
        boolean $$4 = $$3.map(cko::a).orElse(false);
        cre $$5 = $$1.N();
        return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
    }

    @Override
    protected void b(axf $$0, chn $$1, long $$2) {
        if ($$1.ev().a(cqw.n) && !this.a($$1, $$1.ev().c(cqw.n).get()) && $$1.N().r()) {
            this.d = $$0.G_().a(40);
        }
        $$1.N().n();
        $$1.ev().b(cqw.n);
        $$1.ev().b(cqw.u);
        this.e = null;
    }

    @Override
    protected void c(axf $$0, chn $$1, long $$2) {
        $$1.ev().a(cqw.u, this.e);
        $$1.N().a(this.e, (double)this.g);
    }

    @Override
    protected void d(axf $$0, chn $$1, long $$2) {
        flp $$3 = $$1.N().j();
        cim<?> $$4 = $$1.ev();
        if (this.e != $$3) {
            this.e = $$3;
            $$4.a(cqw.u, $$3);
        }
        if ($$3 == null || this.f == null) {
            return;
        }
        cqz $$5 = $$4.c(cqw.n).get();
        if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.au())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
        }
    }

    private boolean a(chn $$0, cqz $$1, long $$2) {
        is $$3 = $$1.a().b();
        this.e = $$0.N().a($$3, 0);
        this.g = $$1.b();
        cim<Long> $$4 = $$0.ev();
        if (this.a($$0, $$1)) {
            $$4.b(cqw.F);
        } else {
            boolean $$5;
            boolean bl2 = $$5 = this.e != null && this.e.j();
            if ($$5) {
                $$4.b(cqw.F);
            } else if (!$$4.a(cqw.F)) {
                $$4.a(cqw.F, $$2);
            }
            if (this.e != null) {
                return true;
            }
            ftm $$6 = cso.a((cht)$$0, 10, 7, ftm.c($$3), 1.5707963705062866);
            if ($$6 != null) {
                this.e = $$0.N().a($$6.g, $$6.h, $$6.i, 0);
                return this.e != null;
            }
        }
        return false;
    }

    private boolean a(chn $$0, cqz $$1) {
        return $$1.a().b().k($$0.dK()) <= $$1.c();
    }

    private static boolean a(cqz $$0) {
        cks $$1 = $$0.a();
        if ($$1 instanceof cjp) {
            cjp $$2 = (cjp)$$1;
            return $$2.c().au();
        }
        return false;
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (chn)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.c(axf2, (chn)chl2, l2);
    }
}

