/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class crm
extends crw<dal> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.copyOf((Iterable)Iterables.concat(super.a(), List.of(cqw.C)));
    }

    @Override
    protected void a(axf $$0, dal $$12) {
        super.a($$0, $$12);
        $$12.ev().c(cqw.g).stream().flatMap(Collection::stream).filter(cgs.e).filter($$2 -> csd.c($$0, $$12, $$2)).findFirst().ifPresentOrElse($$1 -> $$12.ev().a(cqw.C, $$1), () -> $$12.ev().b(cqw.C));
    }
}

