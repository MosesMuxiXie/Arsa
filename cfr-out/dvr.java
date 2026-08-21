/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

public class dvr<T>
extends AbstractIterator<T> {
    private final fth a;
    private final ftr b;
    private final iw c;
    private final is.a d;
    private final fug e;
    private final dvx f;
    private final boolean g;
    private @Nullable dvt h;
    private long i;
    private final BiFunction<is.a, fug, T> j;

    public dvr(dvx $$0, @Nullable cgk $$1, fth $$2, boolean $$3, BiFunction<is.a, fug, T> $$4) {
        this($$0, $$1 == null ? ftr.a() : ftr.a($$1), $$2, $$3, $$4);
    }

    public dvr(dvx $$0, ftr $$1, fth $$2, boolean $$3, BiFunction<is.a, fug, T> $$4) {
        this.b = $$1;
        this.d = new is.a();
        this.e = fud.a($$2);
        this.f = $$0;
        this.a = $$2;
        this.g = $$3;
        this.j = $$4;
        int $$5 = bgj.c($$2.a - 1.0E-7) - 1;
        int $$6 = bgj.c($$2.d + 1.0E-7) + 1;
        int $$7 = bgj.c($$2.b - 1.0E-7) - 1;
        int $$8 = bgj.c($$2.e + 1.0E-7) + 1;
        int $$9 = bgj.c($$2.c - 1.0E-7) - 1;
        int $$10 = bgj.c($$2.f + 1.0E-7) + 1;
        this.c = new iw($$5, $$7, $$9, $$6, $$8, $$10);
    }

    private @Nullable dvt a(int $$0, int $$1) {
        dvt $$5;
        int $$2 = jw.a($$0);
        int $$3 = jw.a($$1);
        long $$4 = dvu.d($$2, $$3);
        if (this.h != null && this.i == $$4) {
            return this.h;
        }
        this.h = $$5 = this.f.c($$2, $$3);
        this.i = $$4;
        return $$5;
    }

    protected T computeNext() {
        while (this.c.a()) {
            dvt $$4;
            int $$0 = this.c.b();
            int $$1 = this.c.c();
            int $$2 = this.c.d();
            int $$3 = this.c.e();
            if ($$3 == 3 || ($$4 = this.a($$0, $$2)) == null) continue;
            this.d.d($$0, $$1, $$2);
            eoh $$5 = $$4.a_(this.d);
            if (this.g && !$$5.j($$4, this.d) || $$3 == 1 && !$$5.i() || $$3 == 2 && !$$5.a(dzs.ca)) continue;
            fug $$6 = this.b.a($$5, this.f, this.d);
            if ($$6 == fud.b()) {
                if (!this.a.a($$0, $$1, $$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) continue;
                return this.j.apply(this.d, $$6.a(this.d));
            }
            fug $$7 = $$6.a(this.d);
            if ($$7.c() || !fud.c($$7, this.e, ftq.i)) continue;
            return this.j.apply(this.d, $$7);
        }
        return (T)this.endOfData();
    }
}

