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
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class csf
extends csd<cht> {
    private static final csk a = csk.b().d();
    private final BiPredicate<cht, dlt> b;

    public csf(Predicate<dlt> $$0) {
        this((cht $$1, dlt $$2) -> $$0.test((dlt)$$2));
    }

    public static csf b() {
        return new csf(($$0, $$1) -> {
            if ($$0 instanceof cth) {
                cth $$2 = (cth)$$0;
                return $$2.j((dlt)$$1);
            }
            return false;
        });
    }

    private csf(BiPredicate<cht, dlt> $$0) {
        this.b = $$0;
    }

    @Override
    protected void a(axf $$0, cht $$12) {
        cim<?> $$2 = $$12.ev();
        csk $$32 = a.c().a((float)$$12.i(cis.G));
        List $$4 = $$0.E().stream().filter(cgs.f).filter($$3 -> $$32.a($$0, $$12, (chl)$$3)).filter($$1 -> this.a($$12, (ddm)$$1)).filter($$1 -> !$$12.z((cgk)$$1)).sorted(Comparator.comparingDouble($$12::g)).collect(Collectors.toList());
        if (!$$4.isEmpty()) {
            ddm $$5 = (ddm)$$4.get(0);
            $$2.a(cqw.P, $$5);
        } else {
            $$2.b(cqw.P);
        }
    }

    private boolean a(cht $$0, ddm $$1) {
        return this.a($$0, $$1.fx()) || this.a($$0, $$1.fy());
    }

    private boolean a(cht $$0, dlt $$1) {
        return this.b.test($$0, $$1);
    }

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.P);
    }
}

