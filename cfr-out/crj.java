/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class crj
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.L, cqw.h);
    }

    @Override
    protected void a(axf $$0, chl $$12) {
        $$12.ev().c(cqw.h).ifPresent($$1 -> this.a($$12, (cqy)$$1));
    }

    protected void a(chl $$0, cqy $$12) {
        Optional<chl> $$2 = $$12.a($$1 -> $$1.ay() == $$0.ay() && !$$1.e_());
        $$0.ev().a(cqw.L, $$2);
    }
}

