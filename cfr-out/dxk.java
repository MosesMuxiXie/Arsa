/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dxk {
    private final dwp a;
    private final evo b;
    private final ffp c;

    public dxk(dwp $$0, evo $$1, ffp $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public dxk a(axn $$0) {
        if ($$0.a() != this.a) {
            throw new IllegalStateException("Using invalid structure manager (source level: " + String.valueOf($$0.a()) + ", region: " + String.valueOf($$0));
        }
        return new dxk($$0, this.b, this.c);
    }

    public List<ffw> a(dvu $$0, Predicate<ffo> $$1) {
        Map<ffo, LongSet> $$2 = this.a.a($$0.h, $$0.i, erj.e).h();
        ImmutableList.Builder $$3 = ImmutableList.builder();
        for (Map.Entry<ffo, LongSet> $$4 : $$2.entrySet()) {
            ffo $$5 = $$4.getKey();
            if (!$$1.test($$5)) continue;
            this.a($$5, $$4.getValue(), arg_0 -> ((ImmutableList.Builder)$$3).add(arg_0));
        }
        return $$3.build();
    }

    public List<ffw> a(jw $$0, ffo $$1) {
        LongSet $$2 = this.a.a($$0.a(), $$0.c(), erj.e).b($$1);
        ImmutableList.Builder $$3 = ImmutableList.builder();
        this.a($$1, $$2, arg_0 -> ((ImmutableList.Builder)$$3).add(arg_0));
        return $$3.build();
    }

    public void a(ffo $$0, LongSet $$1, Consumer<ffw> $$2) {
        LongIterator longIterator = $$1.iterator();
        while (longIterator.hasNext()) {
            long $$3 = (Long)longIterator.next();
            jw $$4 = jw.a(new dvu($$3), this.a.ay());
            ffw $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), erj.d));
            if ($$5 == null || !$$5.b()) continue;
            $$2.accept($$5);
        }
    }

    public @Nullable ffw a(jw $$0, ffo $$1, ere $$2) {
        return $$2.a($$1);
    }

    public void a(jw $$0, ffo $$1, ffw $$2, ere $$3) {
        $$3.a($$1, $$2);
    }

    public void a(jw $$0, ffo $$1, long $$2, ere $$3) {
        $$3.a($$1, $$2);
    }

    public boolean a() {
        return this.b.d();
    }

    public ffw a(is $$0, ffo $$1) {
        for (ffw $$2 : this.a(jw.a($$0), $$1)) {
            if (!$$2.a().b($$0)) continue;
            return $$2;
        }
        return ffw.b;
    }

    public ffw a(is $$0, bef<ffo> $$12) {
        return this.a($$0, (jd<ffo> $$1) -> $$1.a($$12));
    }

    public ffw a(is $$0, jh<ffo> $$1) {
        return this.a($$0, $$1::a);
    }

    public ffw a(is $$0, Predicate<jd<ffo>> $$1) {
        jq<ffo> $$22 = this.b().f(mj.bs);
        for (ffw $$3 : this.a(new dvu($$0), (ffo $$2) -> $$22.c($$22.a((ffo)$$2)).map($$1::test).orElse(false))) {
            if (!this.a($$0, $$3)) continue;
            return $$3;
        }
        return ffw.b;
    }

    public ffw b(is $$0, ffo $$1) {
        for (ffw $$2 : this.a(jw.a($$0), $$1)) {
            if (!this.a($$0, $$2)) continue;
            return $$2;
        }
        return ffw.b;
    }

    public boolean a(is $$0, ffw $$1) {
        for (ffs $$2 : $$1.i()) {
            if (!$$2.f().b($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean a(is $$0) {
        jw $$1 = jw.a($$0);
        return this.a.a($$1.a(), $$1.c(), erj.e).y();
    }

    public Map<ffo, LongSet> b(is $$0) {
        jw $$1 = jw.a($$0);
        return this.a.a($$1.a(), $$1.c(), erj.e).h();
    }

    public ffq a(dvu $$0, ffo $$1, fgl $$2, boolean $$3) {
        return this.c.a($$0, $$1, $$2, $$3);
    }

    public void a(ffw $$0) {
        $$0.e();
        this.c.a($$0.c(), $$0.h());
    }

    public jr b() {
        return this.a.J_();
    }
}

