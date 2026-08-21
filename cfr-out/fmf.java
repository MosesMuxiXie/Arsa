/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class fmf {
    public static @Nullable fmj a(dwo $$0, @Nullable iz $$1, @Nullable iz $$2) {
        if ($$0.Q().b(dhb.c)) {
            fmj $$3 = fmj.a($$0.y).a(fmj.a.a);
            if ($$2 != null) {
                $$3 = $$3.a($$2);
            }
            if ($$1 != null) {
                $$3 = $$3.b($$1);
            }
            return $$3;
        }
        return null;
    }

    public static @Nullable fmj a(@Nullable fmj $$0, iz $$1) {
        return $$0 == null ? null : $$0.b($$1);
    }
}

