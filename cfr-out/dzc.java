/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class dzc
extends dzq
implements ecn {
    protected dzc(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends dzc> a();

    @Override
    protected boolean a(eoh $$0, dwo $$1, is $$2, int $$3, int $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        elb $$5 = $$1.c_($$2);
        if ($$5 == null) {
            return false;
        }
        return $$5.a_($$3, $$4);
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$2) {
        elb $$3 = $$1.c_($$2);
        return $$3 instanceof cdf ? (cdf)((Object)$$3) : null;
    }

    protected static <E extends elb, A extends elb> @Nullable elc<A> a(eld<A> $$0, eld<E> $$1, elc<? super E> $$2) {
        return $$1 == $$0 ? $$2 : null;
    }
}

