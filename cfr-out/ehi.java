/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ehi
extends dzq
implements ehg {
    public static final MapCodec<ehi> a = ehi.b(ehi::new);
    public static final epf<epq> b = eox.bm;
    public static final eoy c = eox.I;
    private static final fug d = dzq.b(16.0, 0.0, 8.0);
    private static final fug e = dzq.b(16.0, 8.0, 16.0);

    public MapCodec<? extends ehi> a() {
        return a;
    }

    public ehi(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.m().b(b, epq.b)).b(c, false));
    }

    @Override
    protected boolean g_(eoh $$0) {
        return $$0.c(b) != epq.c;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return switch ($$0.c(b)) {
            default -> throw new MatchException(null, null);
            case epq.a -> e;
            case epq.b -> d;
            case epq.c -> fud.b();
        };
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        is $$1 = $$0.a();
        eoh $$2 = $$0.q().a_($$1);
        if ($$2.a(this)) {
            return (eoh)((eoh)$$2.b(b, epq.c)).b(c, false);
        }
        flb $$3 = $$0.q().b_($$1);
        eoh $$4 = (eoh)((eoh)this.m().b(b, epq.b)).b(c, $$3.a() == flc.c);
        iz $$5 = $$0.k();
        if ($$5 == iz.a || $$5 != iz.b && $$0.l().h - (double)$$1.v() > 0.5) {
            return (eoh)$$4.b(b, epq.a);
        }
        return $$4;
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        dlt $$2 = $$1.n();
        epq $$3 = $$0.c(b);
        if ($$3 == epq.c || !$$2.a(this.h())) {
            return false;
        }
        if ($$1.c()) {
            boolean $$4 = $$1.l().h - (double)$$1.a().v() > 0.5;
            iz $$5 = $$1.k();
            if ($$3 == epq.b) {
                return $$5 == iz.b || $$4 && $$5.o().d();
            }
            return $$5 == iz.a || !$$4 && $$5.o().d();
        }
        return true;
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        if ($$2.c(b) != epq.c) {
            return ehg.super.a($$0, $$1, $$2, $$3);
        }
        return false;
    }

    @Override
    public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        if ($$3.c(b) != epq.c) {
            return ehg.super.a($$0, $$1, $$2, $$3, $$4);
        }
        return false;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        switch ($$1) {
            case a: {
                return false;
            }
            case b: {
                return $$0.y().a(bdv.a);
            }
            case c: {
                return false;
            }
        }
        return false;
    }
}

