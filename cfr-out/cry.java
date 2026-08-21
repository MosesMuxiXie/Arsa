/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cry
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.h, cqw.N, cqw.ay);
    }

    @Override
    protected void a(axf $$02, chl $$1) {
        cim<?> $$2 = $$1.ev();
        ArrayList $$3 = Lists.newArrayList();
        cqy $$4 = $$2.c(cqw.h).orElse(cqy.a());
        Optional<chn> $$5 = $$4.a($$0 -> $$0 instanceof dca || $$0 instanceof cyw).map(chn.class::cast);
        List<chl> $$6 = $$2.c(cqw.g).orElse((List<chl>)ImmutableList.of());
        for (chl $$7 : $$6) {
            if (!($$7 instanceof dbi) || !((dbi)$$7).gR()) continue;
            $$3.add((dbi)$$7);
        }
        $$2.a(cqw.N, $$5);
        $$2.a(cqw.ay, $$3);
    }
}

