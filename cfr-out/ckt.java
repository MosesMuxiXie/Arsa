/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ckt<E extends cht>
extends cjd<E> {
    public static final int c = 160;
    private final ToIntFunction<E> d;
    private final int e;
    private final int f;
    private final float g;
    private final csk h;
    private final int i;
    private final Function<E, bcz> j;
    private Optional<Long> k = Optional.empty();
    private Optional<a> l = Optional.empty();

    public ckt(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, csk $$4, int $$5, Function<E, bcz> $$6) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.c), cqw.W, (Object)((Object)cqx.b), cqw.h, (Object)((Object)cqx.a), cqw.X, (Object)((Object)cqx.b)), 160);
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
    }

    protected void a(axf $$0, cht $$12, long $$2) {
        cim<?> $$3 = $$12.ev();
        $$3.c(cqw.h).flatMap($$22 -> $$22.a($$2 -> this.h.a($$0, $$12, (chl)$$2))).ifPresent($$1 -> this.b($$12, (chl)$$1));
    }

    @Override
    protected void b(axf $$0, E $$1, long $$2) {
        cim<ftm> $$3 = ((chl)$$1).ev();
        if (!$$3.a(cqw.X)) {
            $$0.a((cgk)$$1, (byte)59);
            $$3.a(cqw.W, this.d.applyAsInt($$1));
        }
    }

    protected boolean c(axf $$0, cht $$1, long $$2) {
        return this.l.isPresent() && this.l.get().c().cb();
    }

    @Override
    protected void d(axf $$0, E $$1, long $$2) {
        boolean $$3;
        if (this.l.isEmpty()) {
            return;
        }
        ((chl)$$1).ev().a(cqw.n, new cqz(this.l.get().a(), this.g, 0));
        ((chl)$$1).ev().a(cqw.o, new cjp(this.l.get().c(), true));
        boolean bl2 = $$3 = !this.l.get().c().dK().equals(this.l.get().b());
        if ($$3) {
            $$0.a((cgk)$$1, (byte)59);
            ((chn)$$1).N().n();
            this.b((cht)$$1, this.l.get().c);
        } else {
            is $$4 = ((cgk)$$1).dK();
            if ($$4.equals(this.l.get().a())) {
                $$0.a((cgk)$$1, (byte)58);
                if (this.k.isEmpty()) {
                    this.k = Optional.of($$2);
                }
                if ($$2 - this.k.get() >= (long)this.i) {
                    ((chl)$$1).ev().a(cqw.X, this.a($$4, this.l.get().b()));
                    $$0.a(null, (cgk)$$1, this.j.apply($$1), bdb.g, 1.0f, ((chl)$$1).fD());
                    this.l = Optional.empty();
                }
            }
        }
    }

    private ftm a(is $$0, is $$1) {
        double $$2 = 0.5;
        double $$3 = 0.5 * (double)bgj.m($$1.u() - $$0.u());
        double $$4 = 0.5 * (double)bgj.m($$1.w() - $$0.w());
        return ftm.c($$1).b($$3, 0.0, $$4);
    }

    private Optional<is> a(cht $$0, chl $$12) {
        is $$2 = $$12.dK();
        if (!this.a($$0, $$2)) {
            return Optional.empty();
        }
        ArrayList $$3 = Lists.newArrayList();
        is.a $$4 = $$2.k();
        for (iz $$5 : iz.c.a) {
            $$4.g($$2);
            for (int $$6 = 0; $$6 < this.f; ++$$6) {
                if (this.a($$0, (is)$$4.c($$5))) continue;
                $$4.c($$5.g());
                break;
            }
            if ($$4.k($$2) < this.e) continue;
            $$3.add($$4.j());
        }
        cre $$7 = $$0.N();
        return $$3.stream().sorted(Comparator.comparingDouble($$0.dK()::j)).filter($$1 -> {
            flp $$2 = $$7.a((is)$$1, 0);
            return $$2 != null && $$2.j();
        }).findFirst();
    }

    private boolean a(cht $$0, is $$1) {
        return $$0.N().a($$1) && $$0.a(flx.b($$0, $$1)) == 0.0f;
    }

    private void b(cht $$0, chl $$12) {
        this.k = Optional.empty();
        this.l = this.a($$0, $$12).map($$1 -> new a((is)$$1, $$12.dK(), $$12));
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.c(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (E)((cht)chl2), l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (cht)chl2, l2);
    }

    public static class a {
        private final is a;
        private final is b;
        final chl c;

        public a(is $$0, is $$1, chl $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public is a() {
            return this.a;
        }

        public is b() {
            return this.b;
        }

        public chl c() {
            return this.c;
        }
    }
}

