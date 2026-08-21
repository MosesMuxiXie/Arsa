/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;

public interface dvx
extends dvt {
    public eqa w();

    public @Nullable dvt c(int var1, int var2);

    default public boolean a(@Nullable cgk $$0, fug $$1) {
        return true;
    }

    default public boolean a(eoh $$0, is $$1, ftr $$2) {
        fug $$3 = $$0.b((dvt)this, $$1, $$2);
        return $$3.c() || this.a(null, $$3.a($$1));
    }

    default public boolean f(cgk $$0) {
        return this.a($$0, fud.a($$0.dj()));
    }

    default public boolean b(fth $$0) {
        return this.a((cgk)null, $$0);
    }

    default public boolean g(cgk $$0) {
        return this.a($$0, $$0.dj());
    }

    default public boolean a(@Nullable cgk $$0, fth $$1) {
        return this.a($$0, $$1, false);
    }

    default public boolean a(@Nullable cgk $$0, fth $$1, boolean $$2) {
        return this.b($$0, $$1, $$2) && this.c($$0, $$1) && this.d($$0, $$1);
    }

    default public boolean b(@Nullable cgk $$0, fth $$1) {
        return this.b($$0, $$1, false);
    }

    default public boolean b(@Nullable cgk $$0, fth $$1, boolean $$2) {
        Iterable<fug> $$3 = $$2 ? this.h($$0, $$1) : this.g($$0, $$1);
        for (fug $$4 : $$3) {
            if ($$4.c()) continue;
            return false;
        }
        return true;
    }

    default public boolean c(@Nullable cgk $$0, fth $$1) {
        return this.e($$0, $$1).isEmpty();
    }

    default public boolean d(@Nullable cgk $$0, fth $$1) {
        if ($$0 != null) {
            fug $$2 = this.k($$0, $$1);
            return $$2 == null || !fud.c($$2, fud.a($$1), ftq.i);
        }
        return true;
    }

    public List<fug> e(@Nullable cgk var1, fth var2);

    default public Iterable<fug> f(@Nullable cgk $$0, fth $$1) {
        List<fug> $$2 = this.e($$0, $$1);
        Iterable $$3 = this.g($$0, $$1);
        return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
    }

    default public Iterable<fug> a(@Nullable cgk $$0, fth $$1, ftm $$2) {
        List<fug> $$3 = this.e($$0, $$1);
        Iterable $$4 = this.a(ftr.a($$0, $$2.h), $$1);
        return $$3.isEmpty() ? $$4 : Iterables.concat($$3, $$4);
    }

    default public Iterable<fug> g(@Nullable cgk $$0, fth $$1) {
        return this.a($$0 == null ? ftr.a() : ftr.a($$0), $$1);
    }

    default public Iterable<fug> h(@Nullable cgk $$0, fth $$1) {
        return this.a($$0 == null ? ftr.b() : ftr.a($$0, true), $$1);
    }

    private Iterable<fug> a(ftr $$0, fth $$1) {
        return () -> new dvr<fug>(this, $$0, $$1, false, ($$0, $$1) -> $$1);
    }

    private @Nullable fug k(cgk $$0, fth $$1) {
        eqa $$2 = this.w();
        return $$2.a($$0, $$1) ? $$2.b() : null;
    }

    default public fti b(dvw $$0) {
        fti $$1 = this.a($$0);
        eqa $$2 = this.w();
        if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
            ftm $$3 = $$1.g().d($$0.b());
            iz $$4 = iz.a($$3.g, $$3.h, $$3.i);
            ftm $$5 = $$2.c($$1.g());
            return new fti($$5, $$4, is.a($$5), false, true);
        }
        return $$1;
    }

    default public boolean i(@Nullable cgk $$02, fth $$12) {
        dvr<fug> $$2 = new dvr<fug>(this, $$02, $$12, true, ($$0, $$1) -> $$1);
        while ($$2.hasNext()) {
            if (((fug)$$2.next()).c()) continue;
            return true;
        }
        return false;
    }

    default public Optional<is> j(cgk $$02, fth $$12) {
        is $$2 = null;
        double $$3 = Double.MAX_VALUE;
        dvr<is> $$4 = new dvr<is>(this, $$02, $$12, false, ($$0, $$1) -> $$0);
        while ($$4.hasNext()) {
            is $$5 = (is)$$4.next();
            double $$6 = $$5.b($$02.dI());
            if (!($$6 < $$3) && ($$6 != $$3 || $$2 != null && $$2.i($$5) >= 0)) continue;
            $$2 = $$5.j();
            $$3 = $$6;
        }
        return Optional.ofNullable($$2);
    }

    default public Optional<ftm> a(@Nullable cgk $$02, fug $$1, ftm $$2, double $$32, double $$4, double $$5) {
        if ($$1.c()) {
            return Optional.empty();
        }
        fth $$6 = $$1.a().c($$32, $$4, $$5);
        fug $$7 = StreamSupport.stream(this.g($$02, $$6).spliterator(), false).filter($$0 -> this.w() == null || this.w().a($$0.a())).flatMap($$0 -> $$0.e().stream()).map($$3 -> $$3.c($$32 / 2.0, $$4 / 2.0, $$5 / 2.0)).map(fud::a).reduce(fud.a(), fud::a);
        fug $$8 = fud.a($$1, $$7, ftq.e);
        return $$8.b($$2);
    }
}

