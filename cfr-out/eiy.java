/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eiy
extends dzc {
    public static final MapCodec<eiy> a = eiy.b(eiy::new);
    public static final epf<enk> b = eox.bD;
    public static final eoy c = eox.bG;

    public MapCodec<eiy> a() {
        return a;
    }

    public eiy(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, enk.a)).b(c, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new ene($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$02, eoh $$12, eld<T> $$22) {
        elc<T> elc2;
        if ($$02 instanceof axf) {
            axf $$32 = (axf)$$02;
            elc2 = eiy.a($$22, eld.S, (dwo $$1, is $$2, eoh $$3, ? super E $$4) -> $$4.c().a($$32, $$2, (boolean)$$3.d(eox.bG).orElse(false)));
        } else {
            elc2 = eiy.a($$22, eld.S, (dwo $$0, is $$1, eoh $$2, ? super E $$3) -> $$3.c().a($$0, $$1, (boolean)$$2.d(eox.bG).orElse(false)));
        }
        return elc2;
    }
}

