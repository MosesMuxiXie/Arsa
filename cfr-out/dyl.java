/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class dyl
extends dzc {
    public static final epf<iz> a = edt.f;
    public static final eoy b = eox.u;

    protected dyl(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(a, iz.c)).b(b, false));
    }

    protected abstract MapCodec<? extends dyl> a();

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            this.a($$1, $$2, $$3);
        }
        return cdc.a;
    }

    protected abstract void a(dwo var1, is var2, ddm var3);

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(a, $$0.g().g());
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return dhi.a($$1.c_($$2));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(a, $$1.a($$0.c(a)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, b);
    }

    protected static <T extends elb> @Nullable elc<T> a(dwo $$0, eld<T> $$12, eld<? extends eko> $$22) {
        elc<T> elc2;
        if ($$0 instanceof axf) {
            axf $$32 = (axf)$$0;
            elc2 = dyl.a($$12, $$22, (dwo $$1, is $$2, eoh $$3, ? super E $$4) -> eko.a($$32, $$2, $$3, $$4));
        } else {
            elc2 = null;
        }
        return elc2;
    }
}

