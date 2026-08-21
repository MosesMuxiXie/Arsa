/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eht
extends dzc {
    public static final MapCodec<eht> a = eht.b(eht::new);

    public MapCodec<eht> a() {
        return a;
    }

    protected eht(eog.d $$0) {
        super($$0);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emw($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return eht.a($$2, eld.j, $$0.B_() ? emw::a : emw::b);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            int $$5 = 15 + $$1.y.a(15) + $$1.y.a(15);
            this.a($$1, $$2, $$5);
        }
    }
}

