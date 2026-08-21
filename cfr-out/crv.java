/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class crv
extends csd<chn> {
    private static final long b = 32L;
    private static final long c = 16L;
    public static final int a = 32;

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.M);
    }

    @Override
    protected void a(axf $$02, chn $$12) {
        cim<?> $$22 = $$12.ev();
        List<czl> $$3 = $$02.a(czl.class, $$12.dj().c(32.0, 16.0, 32.0), $$0 -> true);
        $$3.sort(Comparator.comparingDouble($$12::g));
        Optional<czl> $$4 = $$3.stream().filter($$2 -> $$12.c($$02, $$2.e())).filter($$1 -> $$1.a((cgk)$$12, 32.0)).filter($$12::G).findFirst();
        $$22.a(cqw.M, $$4);
    }
}

