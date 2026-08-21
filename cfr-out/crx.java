/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class crx
extends csd<chl> {
    protected abstract boolean a(axf var1, chl var2, chl var3);

    protected abstract cqw<chl> b();

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(this.b());
    }

    @Override
    protected void a(axf $$0, chl $$1) {
        $$1.ev().a(this.b(), this.c($$0, $$1));
    }

    private Optional<chl> c(axf $$0, chl $$1) {
        return this.a($$1).flatMap($$22 -> $$22.a((chl $$2) -> this.a($$0, $$1, (chl)$$2)));
    }

    protected Optional<cqy> a(chl $$0) {
        return $$0.ev().c(cqw.h);
    }
}

