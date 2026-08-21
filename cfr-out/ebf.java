/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ebf
extends dzq {
    public static final MapCodec<ebf> a = ebf.b(ebf::new);
    public static final eoy b = eox.A;
    public static final eoy c = eox.u;

    protected MapCodec<? extends ebf> a() {
        return a;
    }

    public ebf(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.m().b(c, false)).b(b, false));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.b() != $$0.b() && $$1 instanceof axf) {
            axf $$5 = (axf)$$1;
            this.a($$0, $$5, $$2);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1 instanceof axf) {
            axf $$6 = (axf)$$1;
            this.a($$0, $$6, $$2);
        }
    }

    public void a(eoh $$0, axf $$1, is $$2) {
        boolean $$3 = $$1.I($$2);
        if ($$3 == $$0.c(b)) {
            return;
        }
        eoh $$4 = $$0;
        if (!$$0.c(b).booleanValue()) {
            $$1.a(null, $$2, ($$4 = (eoh)$$4.a(c)).c(c) != false ? bda.gh : bda.gi, bdb.e);
        }
        $$1.a($$2, (eoh)$$4.b(b, $$3), 3);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, b);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return $$1.a_($$2).c(c) != false ? 15 : 0;
    }
}

