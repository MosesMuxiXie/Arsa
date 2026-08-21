/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class ecp
extends edt {
    public static final epf<eos> c = eox.X;

    protected ecp(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends ecp> a();

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return ecp.b($$1, $$2, ecp.n($$0).g());
    }

    public static boolean b(dwr $$0, is $$1, iz $$2) {
        is $$3 = $$1.a($$2);
        return $$0.a_($$3).c((dvt)$$0, $$3, $$2.g());
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        for (iz $$1 : $$0.f()) {
            eoh $$3;
            if ($$1.o() == iz.a.b) {
                eoh $$2 = (eoh)((eoh)this.m().b(c, $$1 == iz.b ? eos.c : eos.a)).b(f, $$0.g());
            } else {
                $$3 = (eoh)((eoh)this.m().b(c, eos.b)).b(f, $$1.g());
            }
            if (!$$3.a((dwr)$$0.q(), $$0.a())) continue;
            return $$3;
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (ecp.n($$0).g() == $$4 && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    protected static iz n(eoh $$0) {
        switch ($$0.c(c)) {
            case c: {
                return iz.a;
            }
            case a: {
                return iz.b;
            }
        }
        return (iz)$$0.c(f);
    }
}

