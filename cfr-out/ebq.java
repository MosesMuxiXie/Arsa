/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public abstract class ebq
extends dzq
implements ehg {
    public static final eoy a = efm.b;
    public static final eoy b = efm.c;
    public static final eoy c = efm.d;
    public static final eoy d = efm.e;
    public static final eoy e = eox.I;
    public static final Map<iz, eoy> f = efm.h.entrySet().stream().filter($$0 -> ((iz)$$0.getKey()).o().d()).collect(bhs.a());
    private final Function<eoh, fug> g;
    private final Function<eoh, fug> h;

    protected ebq(float $$0, float $$1, float $$2, float $$3, float $$4, eog.d $$5) {
        super($$5);
        this.g = this.a($$0, $$4, $$2, 0.0f, $$4);
        this.h = this.a($$0, $$1, $$2, 0.0f, $$3);
    }

    protected abstract MapCodec<? extends ebq> a();

    protected Function<eoh, fug> a(float $$0, float $$1, float $$22, float $$3, float $$4) {
        fug $$5 = dzq.b($$0, 0.0, $$1);
        Map<iz, fug> $$6 = fud.c(dzq.a($$22, (double)$$3, (double)$$4, 0.0, 8.0));
        return this.a((eoh $$2) -> {
            fug $$3 = $$5;
            for (Map.Entry<iz, eoy> $$4 : f.entrySet()) {
                if (!((Boolean)$$2.c($$4.getValue())).booleanValue()) continue;
                $$3 = fud.a($$3, (fug)$$6.get($$4.getKey()));
            }
            return $$3;
        }, e);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return $$0.c(e) == false;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.h.apply($$0);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.g.apply($$0);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        switch ($$1) {
            case c: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(a, $$0.c(c))).b(b, $$0.c(d))).b(c, $$0.c(a))).b(d, $$0.c(b));
            }
            case d: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(a, $$0.c(b))).b(b, $$0.c(c))).b(c, $$0.c(d))).b(d, $$0.c(a));
            }
            case b: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(a, $$0.c(d))).b(b, $$0.c(a))).b(c, $$0.c(b))).b(d, $$0.c(c));
            }
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        switch ($$1) {
            case b: {
                return (eoh)((eoh)$$0.b(a, $$0.c(c))).b(c, $$0.c(a));
            }
            case c: {
                return (eoh)((eoh)$$0.b(b, $$0.c(d))).b(d, $$0.c(b));
            }
        }
        return super.a($$0, $$1);
    }
}

