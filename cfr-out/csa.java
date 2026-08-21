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
import java.util.stream.Collectors;

public class csa
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.j, cqw.k, cqw.l, cqw.m);
    }

    @Override
    protected void a(axf $$0, chl $$12) {
        List $$22 = $$0.E().stream().filter(cgs.f).filter($$1 -> $$12.a((cgk)$$1, this.a($$12))).sorted(Comparator.comparingDouble($$12::g)).collect(Collectors.toList());
        cim<?> $$3 = $$12.ev();
        $$3.a(cqw.j, $$22);
        List $$4 = $$22.stream().filter($$2 -> csa.b($$0, $$12, $$2)).collect(Collectors.toList());
        $$3.a(cqw.k, $$4.isEmpty() ? null : (ddm)$$4.get(0));
        List<ddm> $$5 = $$4.stream().filter($$2 -> csa.c($$0, $$12, $$2)).toList();
        $$3.a(cqw.m, $$5);
        $$3.a(cqw.l, $$5.isEmpty() ? null : $$5.get(0));
    }

    protected double a(chl $$0) {
        return $$0.i(cis.o);
    }
}

