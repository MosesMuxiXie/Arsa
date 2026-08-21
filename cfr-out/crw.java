/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class crw<T extends chl>
extends csd<T> {
    @Override
    protected void a(axf $$0, T $$12) {
        double $$2 = ((chl)$$12).i(cis.o);
        fth $$3 = ((cgk)$$12).dj().c($$2, $$2, $$2);
        List<chl> $$4 = $$0.a(chl.class, $$3, $$1 -> $$1 != $$12 && $$1.cb());
        $$4.sort(Comparator.comparingDouble(arg_0 -> $$12.g(arg_0)));
        cim<?> $$5 = ((chl)$$12).ev();
        $$5.a(cqw.g, $$4);
        $$5.a(cqw.h, new cqy($$0, (chl)$$12, $$4));
    }

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.g, cqw.h);
    }
}

