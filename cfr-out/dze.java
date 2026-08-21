/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class dze
extends dzq {
    private static final fug c = dzq.b(14.0, 0.0, 0.5);
    private static final fug d = dzq.b(14.0, 0.0, 1.0);
    protected static final fth a = dzq.b(14.0, 0.0, 4.0).e().getFirst();
    protected final eow b;

    protected dze(eog.d $$0, eow $$1) {
        super($$0.a($$1.g()));
        this.b = $$1;
    }

    protected abstract MapCodec<? extends dze> a();

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.h($$0) > 0 ? c : d;
    }

    protected int b() {
        return 20;
    }

    @Override
    public boolean a(eoh $$0) {
        return true;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return dze.c($$1, $$3) || dze.a($$1, $$3, iz.b);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4 = this.h($$0);
        if ($$4 > 0) {
            this.a(null, (dwo)$$1, $$2, $$0, $$4);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        int $$6 = this.h($$0);
        if ($$6 == 0) {
            this.a($$3, $$1, $$2, $$0, $$6);
        }
    }

    private void a(@Nullable cgk $$0, dwo $$1, is $$2, eoh $$3, int $$4) {
        boolean $$7;
        int $$5 = this.b($$1, $$2);
        boolean $$6 = $$4 > 0;
        boolean bl2 = $$7 = $$5 > 0;
        if ($$4 != $$5) {
            eoh $$8 = this.a($$3, $$5);
            $$1.a($$2, $$8, 2);
            this.a($$1, $$2);
            $$1.b($$2, $$3, $$8);
        }
        if (!$$7 && $$6) {
            $$1.a(null, $$2, this.b.l(), bdb.e);
            $$1.a($$0, etk.e, $$2);
        } else if ($$7 && !$$6) {
            $$1.a(null, $$2, this.b.m(), bdb.e);
            $$1.a($$0, etk.a, $$2);
        }
        if ($$7) {
            $$1.a(new is($$2), (dzq)this, this.b());
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3 && this.h($$0) > 0) {
            this.a($$1, $$2);
        }
    }

    protected void a(dwo $$0, is $$1) {
        $$0.a($$1, this);
        $$0.a($$1.e(), this);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return this.h($$0);
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$3 == iz.b) {
            return this.h($$0);
        }
        return 0;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    protected static int a(dwo $$02, fth $$1, Class<? extends cgk> $$2) {
        return $$02.a($$2, $$1, cgs.f.and($$0 -> !$$0.m_())).size();
    }

    protected abstract int b(dwo var1, is var2);

    protected abstract int h(eoh var1);

    protected abstract eoh a(eoh var1, int var2);
}

