/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface ecn {
    public @Nullable elb a(is var1, eoh var2);

    default public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return null;
    }

    default public <T extends elb> @Nullable etm a(axf $$0, T $$1) {
        if ($$1 instanceof etm.b) {
            etm.b $$2 = (etm.b)((Object)$$1);
            return $$2.c();
        }
        return null;
    }
}

