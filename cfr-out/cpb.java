/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public class cpb
extends cop {
    protected final cht a;
    private final double b;
    private @Nullable flp c;
    private is d;
    private final boolean e;
    private final List<is> f = Lists.newArrayList();
    private final int g;
    private final BooleanSupplier h;

    public cpb(cht $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
        this.a = $$0;
        this.b = $$1;
        this.e = $$2;
        this.g = $$3;
        this.h = $$4;
        this.a(EnumSet.of(cop.a.a));
        if (!csp.a($$0)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    @Override
    public boolean b() {
        is $$1;
        if (!csp.a(this.a)) {
            return false;
        }
        this.h();
        if (this.e && this.a.ao().ag()) {
            return false;
        }
        axf $$02 = (axf)this.a.ao();
        if (!$$02.a($$1 = this.a.dK(), 6)) {
            return false;
        }
        ftm $$22 = csr.a(this.a, 15, 7, $$2 -> {
            if (!$$02.e((is)$$2)) {
                return Double.NEGATIVE_INFINITY;
            }
            Optional<is> $$3 = $$02.F().d($$0 -> $$0.a(bea.b), this::a, (is)$$2, 10, csx.b.b);
            return $$3.map($$1 -> -$$1.j($$1)).orElse(Double.NEGATIVE_INFINITY);
        });
        if ($$22 == null) {
            return false;
        }
        Optional<is> $$3 = $$02.F().d($$0 -> $$0.a(bea.b), this::a, is.a($$22), 10, csx.b.b);
        if ($$3.isEmpty()) {
            return false;
        }
        this.d = $$3.get().j();
        cre $$4 = this.a.N();
        $$4.e(this.h.getAsBoolean());
        this.c = $$4.a(this.d, 0);
        $$4.e(true);
        if (this.c == null) {
            ftm $$5 = cso.a(this.a, 10, 7, ftm.c(this.d), 1.5707963705062866);
            if ($$5 == null) {
                return false;
            }
            $$4.e(this.h.getAsBoolean());
            this.c = this.a.N().a($$5.g, $$5.h, $$5.i, 0);
            $$4.e(true);
            if (this.c == null) {
                return false;
            }
        }
        for (int $$6 = 0; $$6 < this.c.e(); ++$$6) {
            fln $$7 = this.c.a($$6);
            is $$8 = new is($$7.a, $$7.b + 1, $$7.c);
            if (!ebz.a(this.a.ao(), $$8)) continue;
            this.c = this.a.N().a((double)$$7.a, (double)$$7.b, (double)$$7.c, 0);
            break;
        }
        return this.c != null;
    }

    @Override
    public boolean c() {
        if (this.a.N().l()) {
            return false;
        }
        return !this.d.a(this.a.dI(), (double)(this.a.dF() + (float)this.g));
    }

    @Override
    public void d() {
        this.a.N().a(this.c, this.b);
    }

    @Override
    public void e() {
        if (this.a.N().l() || this.d.a(this.a.dI(), (double)this.g)) {
            this.f.add(this.d);
        }
    }

    private boolean a(is $$0) {
        for (is $$1 : this.f) {
            if (!Objects.equals($$0, $$1)) continue;
            return false;
        }
        return true;
    }

    private void h() {
        if (this.f.size() > 15) {
            this.f.remove(0);
        }
    }
}

