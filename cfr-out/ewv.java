/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ewv
extends ewt {
    public ewv(Codec<ews> $$0) {
        super($$0);
        this.h = ImmutableSet.of((Object)flc.e, (Object)flc.c);
    }

    @Override
    protected int a() {
        return 10;
    }

    @Override
    protected float a(bgr $$0) {
        return ($$0.i() * 2.0f + $$0.i()) * 2.0f;
    }

    @Override
    protected double b() {
        return 5.0;
    }

    @Override
    protected boolean a(ewr $$0, ews $$1, eqf $$2, Function<is, jd<dxo>> $$3, eqe $$4, is.a $$5, is.a $$6, euc $$7, MutableBoolean $$8) {
        if (this.a($$1, $$2.a_($$5))) {
            eoh $$10;
            if ($$5.v() <= $$0.a() + 31) {
                eoh $$9 = g.g();
            } else {
                $$10 = e;
            }
            $$2.a((is)$$5, $$10);
            return true;
        }
        return false;
    }
}

