/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eip
extends dzc
implements ede {
    public static final MapCodec<eip> a = eip.b(eip::new);

    public eip(eog.d $$0) {
        super($$0);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new emz($$0, $$1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb $$5 = $$1.c_($$2);
        if (!($$5 instanceof emz)) {
            return cdc.e;
        }
        emz $$6 = (emz)$$5;
        if (!$$3.hi()) {
            return cdc.e;
        }
        if ($$3.ao().B_()) {
            void $$7;
            $$3.a((emz)$$7);
        }
        return cdc.a;
    }

    protected MapCodec<eip> a() {
        return a;
    }
}

