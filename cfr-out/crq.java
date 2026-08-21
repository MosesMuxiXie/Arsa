/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class crq
extends csd<daw> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.h, cqw.aH, cqw.aB, cqw.aA, cqw.aD, cqw.aE, (Object[])new cqw[0]);
    }

    @Override
    protected void a(axf $$02, daw $$1) {
        cim<daw> $$2 = $$1.ev();
        $$2.a(cqw.aH, this.b($$02, $$1));
        Optional<Object> $$3 = Optional.empty();
        int $$4 = 0;
        ArrayList $$5 = Lists.newArrayList();
        cqy $$6 = $$2.c(cqw.h).orElse(cqy.a());
        for (chl $$7 : $$6.b($$0 -> !$$0.e_() && ($$0 instanceof dbj || $$0 instanceof daw))) {
            if ($$7 instanceof dbj) {
                dbj $$8 = (dbj)$$7;
                ++$$4;
                if ($$3.isEmpty()) {
                    $$3 = Optional.of($$8);
                }
            }
            if (!($$7 instanceof daw)) continue;
            daw $$9 = (daw)$$7;
            $$5.add($$9);
        }
        $$2.a(cqw.aB, $$3);
        $$2.a(cqw.aA, $$5);
        $$2.a(cqw.aD, $$4);
        $$2.a(cqw.aE, $$5.size());
    }

    private Optional<is> b(axf $$0, daw $$12) {
        return is.a($$12.dK(), 8, 4, $$1 -> $$0.a_((is)$$1).a(bdp.bf));
    }
}

