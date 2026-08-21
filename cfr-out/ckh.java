/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class ckh<E extends chn>
extends cjd<E> {
    protected static final int c = 20;
    private static final int m = 40;
    protected static final int d = 8;
    private static final int n = 200;
    private static final List<Integer> o = Lists.newArrayList((Object[])new Integer[]{65, 70, 75, 80});
    private final ccn p;
    protected final int e;
    protected final int f;
    protected final float g;
    protected List<a> h = Lists.newArrayList();
    protected Optional<ftm> i = Optional.empty();
    protected @Nullable ftm j;
    protected int k;
    protected long l;
    private final Function<E, bcz> q;
    private final BiPredicate<E, is> r;

    public ckh(ccn $$0, int $$1, int $$2, float $$3, Function<E, bcz> $$4) {
        this($$0, $$1, $$2, $$3, $$4, ckh::a);
    }

    public static <E extends chn> boolean a(E $$0, is $$1) {
        is $$3;
        dwo $$2 = $$0.ao();
        return $$2.a_($$3 = $$1.e()).s() && $$0.a(flx.b($$0, $$1)) == 0.0f;
    }

    public ckh(ccn $$0, int $$1, int $$2, float $$3, Function<E, bcz> $$4, BiPredicate<E, is> $$5) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.c), cqw.T, (Object)((Object)cqx.b), cqw.U, (Object)((Object)cqx.b)), 200);
        this.p = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.q = $$4;
        this.r = $$5;
    }

    @Override
    protected boolean a(axf $$0, chn $$1) {
        boolean $$2;
        boolean bl2 = $$2 = $$1.aV() && !$$1.by() && !$$1.bN() && !$$0.a_($$1.dK()).a(dzs.qg);
        if (!$$2) {
            $$1.ev().a(cqw.T, this.p.a($$0.y) / 2);
        }
        return $$2;
    }

    protected boolean b(axf $$0, chn $$1, long $$2) {
        boolean $$3;
        boolean bl2 = $$3 = this.i.isPresent() && this.i.get().equals($$1.dI()) && this.k > 0 && !$$1.by() && (this.j != null || !this.h.isEmpty());
        if (!$$3 && $$1.ev().c(cqw.U).isEmpty()) {
            $$1.ev().a(cqw.T, this.p.a($$0.y) / 2);
            $$1.ev().b(cqw.o);
        }
        return $$3;
    }

    protected void a(axf $$0, E $$12, long $$2) {
        this.j = null;
        this.k = 20;
        this.i = Optional.of(((cgk)$$12).dI());
        is $$3 = ((cgk)$$12).dK();
        int $$4 = $$3.u();
        int $$5 = $$3.v();
        int $$6 = $$3.w();
        this.h = is.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f).filter($$1 -> !$$1.equals($$3)).map($$1 -> new a($$1.j(), bgj.e($$3.j((jy)$$1)))).collect(Collectors.toCollection(Lists::newArrayList));
    }

    @Override
    protected void c(axf $$0, E $$1, long $$2) {
        if (this.j != null) {
            if ($$2 - this.l >= 40L) {
                ((cgk)$$1).v(((chn)$$1).bC);
                ((chl)$$1).r(true);
                double $$3 = this.j.g();
                double $$4 = $$3 + (double)((chl)$$1).fG();
                ((cgk)$$1).k(this.j.c($$4 / $$3));
                ((chl)$$1).ev().a(cqw.U, true);
                $$0.a(null, (cgk)$$1, this.q.apply($$1), bdb.g, 1.0f, 1.0f);
            }
        } else {
            --this.k;
            this.d($$0, $$1, $$2);
        }
    }

    @Override
    protected void d(axf $$0, E $$1, long $$2) {
        while (!this.h.isEmpty()) {
            ftm $$6;
            ftm $$7;
            a $$4;
            is $$5;
            Optional<a> $$3 = this.a($$0);
            if ($$3.isEmpty() || !this.a($$0, $$1, $$5 = ($$4 = $$3.get()).a()) || ($$7 = this.a((chn)$$1, $$6 = ftm.b($$5))) == null) continue;
            ((chl)$$1).ev().a(cqw.o, new cjg($$5));
            cre $$8 = ((chn)$$1).N();
            flp $$9 = $$8.a($$5, 0, 8);
            if ($$9 != null && $$9.j()) continue;
            this.j = $$7;
            this.l = $$2;
            return;
        }
    }

    protected Optional<a> a(axf $$0) {
        Optional<a> $$1 = cbo.a($$0.y, this.h, a::b);
        $$1.ifPresent(this.h::remove);
        return $$1;
    }

    private boolean a(axf $$0, E $$1, is $$2) {
        is $$3 = ((cgk)$$1).dK();
        int $$4 = $$3.u();
        int $$5 = $$3.w();
        if ($$4 == $$2.u() && $$5 == $$2.w()) {
            return false;
        }
        return this.r.test($$1, $$2);
    }

    protected @Nullable ftm a(chn $$0, ftm $$1) {
        ArrayList $$2 = Lists.newArrayList(o);
        Collections.shuffle($$2);
        float $$3 = (float)($$0.i(cis.q) * (double)this.g);
        Iterator iterator = $$2.iterator();
        while (iterator.hasNext()) {
            int $$4 = (Integer)iterator.next();
            Optional<ftm> $$5 = cki.a($$0, $$1, $$3, $$4, true);
            if (!$$5.isPresent()) continue;
            return $$5.get();
        }
        return null;
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (chn)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (E)((chn)chl2), l2);
    }

    public record a(is a, int b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "targetPos;weight", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "targetPos;weight", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "targetPos;weight", "a", "b"}, this, $$0);
        }
    }
}

