/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class crr
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.y, cqw.z);
    }

    @Override
    protected void a(axf $$0, chl $$1) {
        cim<?> $$22 = $$1.ev();
        cex $$3 = $$1.fb();
        if ($$3 != null) {
            $$22.a(cqw.y, $$1.fb());
            cgk $$4 = $$3.d();
            if ($$4 instanceof chl) {
                $$22.a(cqw.z, (chl)$$4);
            }
        } else {
            $$22.b(cqw.y);
        }
        $$22.c(cqw.z).ifPresent($$2 -> {
            if (!$$2.cb() || $$2.ao() != $$0) {
                $$22.b(cqw.z);
            }
        });
    }
}

