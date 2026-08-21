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
import java.util.Set;

public class csb
extends csd<dcx> {
    private static final int a = 40;

    public csb() {
        super(40);
    }

    @Override
    protected void a(axf $$0, dcx $$1) {
        amt<dwo> $$2 = $$0.aq();
        is $$3 = $$1.dK();
        ArrayList $$4 = Lists.newArrayList();
        int $$5 = 4;
        for (int $$6 = -4; $$6 <= 4; ++$$6) {
            for (int $$7 = -2; $$7 <= 2; ++$$7) {
                for (int $$8 = -4; $$8 <= 4; ++$$8) {
                    is $$9 = $$3.b($$6, $$7, $$8);
                    if (!$$1.gZ().b().a().e().contains((Object)$$0.a_($$9).b())) continue;
                    $$4.add(jc.a($$2, $$9));
                }
            }
        }
        cim<dcx> $$10 = $$1.ev();
        if (!$$4.isEmpty()) {
            $$10.a(cqw.f, $$4);
        } else {
            $$10.b(cqw.f);
        }
    }

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.f);
    }
}

