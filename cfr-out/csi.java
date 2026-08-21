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
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class csi
extends crw<dch> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.copyOf((Iterable)Iterables.concat(super.a(), List.of(cqw.C)));
    }

    @Override
    protected void a(axf $$02, dch $$12) {
        super.a($$02, $$12);
        csi.a($$12, (chl $$0) -> $$0.ay() == cgu.cb).or(() -> csi.a($$12, (chl $$0) -> $$0.ay() != cgu.cb)).ifPresentOrElse($$1 -> $$12.ev().a(cqw.C, $$1), () -> $$12.ev().b(cqw.C));
    }

    private static Optional<chl> a(dch $$0, Predicate<chl> $$1) {
        return $$0.ev().c(cqw.g).stream().flatMap(Collection::stream).filter($$0::H).filter($$1).findFirst();
    }
}

