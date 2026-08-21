/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public interface dwh {
    public List<cgk> a(@Nullable cgk var1, fth var2, Predicate<? super cgk> var3);

    public <T extends cgk> List<T> a(esw<cgk, T> var1, fth var2, Predicate<? super T> var3);

    default public <T extends cgk> List<T> a(Class<T> $$0, fth $$1, Predicate<? super T> $$2) {
        return this.a((esw<cgk, T>)esw.a($$0), $$1, $$2);
    }

    public List<? extends ddm> E();

    default public List<cgk> a_(@Nullable cgk $$0, fth $$1) {
        return this.a($$0, $$1, cgs.f);
    }

    default public boolean a(@Nullable cgk $$0, fug $$1) {
        if ($$1.c()) {
            return true;
        }
        for (cgk $$2 : this.a_($$0, $$1.a())) {
            if ($$2.eh() || !$$2.W || $$0 != null && $$2.A($$0) || !fud.c($$1, fud.a($$2.dj()), ftq.i)) continue;
            return false;
        }
        return true;
    }

    default public <T extends cgk> List<T> a(Class<T> $$0, fth $$1) {
        return this.a($$0, $$1, cgs.f);
    }

    default public List<fug> e(@Nullable cgk $$0, fth $$1) {
        if ($$1.a() < 1.0E-7) {
            return List.of();
        }
        Predicate<cgk> $$2 = $$0 == null ? cgs.g : cgs.f.and($$0::i);
        List<cgk> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
        if ($$3.isEmpty()) {
            return List.of();
        }
        ImmutableList.Builder $$4 = ImmutableList.builderWithExpectedSize((int)$$3.size());
        for (cgk $$5 : $$3) {
            $$4.add((Object)fud.a($$5.dj()));
        }
        return $$4.build();
    }

    default public @Nullable ddm a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<cgk> $$4) {
        double $$5 = -1.0;
        ddm $$6 = null;
        for (ddm ddm2 : this.E()) {
            if ($$4 != null && !$$4.test(ddm2)) continue;
            double $$8 = ddm2.h($$0, $$1, $$2);
            if (!($$3 < 0.0) && !($$8 < $$3 * $$3) || $$5 != -1.0 && !($$8 < $$5)) continue;
            $$5 = $$8;
            $$6 = ddm2;
        }
        return $$6;
    }

    default public @Nullable ddm a(cgk $$0, double $$1) {
        return this.a($$0.dP(), $$0.dR(), $$0.dV(), $$1, false);
    }

    default public @Nullable ddm a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
        Predicate<cgk> $$5 = $$4 ? cgs.e : cgs.f;
        return this.a($$0, $$1, $$2, $$3, $$5);
    }

    default public boolean a(double $$0, double $$1, double $$2, double $$3) {
        for (ddm ddm2 : this.E()) {
            if (!cgs.f.test(ddm2) || !cgs.b.test(ddm2)) continue;
            double $$5 = ddm2.h($$0, $$1, $$2);
            if (!($$3 < 0.0) && !($$5 < $$3 * $$3)) continue;
            return true;
        }
        return false;
    }

    default public @Nullable ddm c(UUID $$0) {
        for (int $$1 = 0; $$1 < this.E().size(); ++$$1) {
            ddm $$2 = this.E().get($$1);
            if (!$$0.equals($$2.cY())) continue;
            return $$2;
        }
        return null;
    }
}

