/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class dym
extends dzc {
    public static final eoy a = eox.A;
    private final ehh.a b;

    public dym(ehh.a $$0, eog.d $$1) {
        super($$1);
        this.b = $$0;
        this.l((eoh)((eoh)this.C.b()).b(a, false));
    }

    protected abstract MapCodec<? extends dym> a();

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emu($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        if ($$0.B_()) {
            boolean $$3;
            boolean bl2 = $$3 = $$1.a(dzs.hF) || $$1.a(dzs.hG) || $$1.a(dzs.hH) || $$1.a(dzs.hI);
            if ($$3) {
                return dym.a($$2, eld.q, emu::a);
            }
        }
        return null;
    }

    public ehh.a b() {
        return this.b;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{a});
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(a, $$0.q().I($$0.a()));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        boolean $$6 = $$1.I($$2);
        if ($$6 != $$0.c(a)) {
            $$1.a($$2, (eoh)$$0.b(a, $$6), 2);
        }
    }
}

