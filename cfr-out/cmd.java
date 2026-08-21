/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.apache.commons.lang3.function.TriConsumer
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.lang3.function.TriConsumer;
import org.jspecify.annotations.Nullable;

public class cmd
extends cjd<cht> {
    public static final int c = 60;
    private static final int d = 6000;
    private static final int e = 16;
    private static final int f = 10;
    private static final int g = 50;
    private static final int h = 1;
    private static final int i = 140;
    private static final double j = 3.0;
    private static final double k = 0.5;
    private static final double l = 1.0;
    private static final double m = 2.0;
    private final float n;
    private final int o;
    private final int p;
    private final Predicate<eoh> q;
    private final Predicate<eoh> r;
    private final Predicate<d> s;
    private final Consumer<cht> t;
    private final Map<a, b> u;
    private @Nullable d v = null;
    private c w;
    private @Nullable a x;
    private int y;

    public cmd(float $$0, Predicate<eoh> $$1, Predicate<eoh> $$2, int $$3, int $$4, Map<a, b> $$5, Consumer<cht> $$6, Predicate<d> $$7) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.ac, (Object)((Object)cqx.c), cqw.ad, (Object)((Object)cqx.c), cqw.ae, (Object)((Object)cqx.b), cqw.aa, (Object)((Object)cqx.b)));
        this.n = $$0;
        this.q = $$1;
        this.r = $$2;
        this.o = $$3;
        this.p = $$4;
        this.t = $$6;
        this.s = $$7;
        this.u = $$5;
        this.w = cmd$c.a;
    }

    protected void a(axf $$0, cht $$1, long $$2) {
        cre cre2 = $$1.N();
        if (cre2 instanceof crd) {
            crd $$3 = (crd)cre2;
            $$3.d(true);
        }
    }

    @Override
    protected boolean a(axf $$0, cht $$1) {
        return !$$1.S_();
    }

    protected boolean b(axf $$0, cht $$1, long $$2) {
        return $$1.ev().c(cqw.ae).isEmpty() && !$$1.gM() && !$$1.S_();
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected void c(axf $$0, cht $$1, long $$2) {
        boolean $$3 = this.b($$0, $$1);
        if (this.v == null) {
            this.d($$0, $$1, $$2);
            return;
        }
        if ($$3) {
            return;
        }
        if (this.w.equals((Object)cmd$c.b)) {
            this.c(this.v, $$0, $$1);
        }
        if (this.w.equals((Object)cmd$c.a)) {
            this.a(this.v, (dwo)$$0, $$1);
        }
        if (this.w.equals((Object)cmd$c.c)) {
            this.b(this.v, (dwo)$$0, $$1);
        }
    }

    private boolean b(axf $$0, cht $$1) {
        if (!this.a((dwo)$$0, $$1)) {
            this.a($$1);
            Optional<d> $$2 = this.c($$0, $$1);
            if ($$2.isPresent()) {
                this.v = $$2.get();
                this.g($$1);
                this.a($$1, (dwo)$$0, this.v.a);
                return true;
            }
            this.p($$1);
            return true;
        }
        return false;
    }

    private void c(d $$0, dwo $$1, cht $$2) {
        if (!this.b($$0, $$1)) {
            this.e($$2);
        }
    }

    protected void a(d $$0, dwo $$1, cht $$2) {
        if (this.a(3.0, $$0, $$1, $$2, this.c($$2)) && this.b($$0, $$1)) {
            this.d($$2);
        } else if (this.a(cmd.n($$2), $$0, $$1, $$2, this.c($$2))) {
            this.a($$0, $$2);
        } else {
            this.f($$2);
        }
    }

    private ftm c(cht $$0) {
        return this.a($$0, $$0.dI());
    }

    protected void b(d $$0, dwo $$12, cht $$22) {
        if (!this.a(2.0, $$0, $$12, $$22, this.c($$22))) {
            this.g($$22);
        } else {
            ++this.y;
            this.b($$0, $$22);
            if (this.y >= 60) {
                this.a($$22, $$0.b, this::c, (cht $$1, ccv $$2) -> this.a($$22), this::d, (cht $$1, ccv $$2) -> this.a($$22));
                this.g($$22);
            }
        }
    }

    private void d(cht $$0) {
        this.q($$0);
        this.a(cmd$c.b);
    }

    private void e(cht $$0) {
        this.a(cmd$c.a);
        this.f($$0);
    }

    private void f(cht $$0) {
        if (this.v != null) {
            cjf.a((chl)$$0, this.v.a, this.n, 0);
        }
    }

    private void a(d $$0, cht $$1) {
        this.a($$1, $$0.b, this.a(cmd$a.a), this.a(cmd$a.b), this.a(cmd$a.c), this.a(cmd$a.d));
        this.a(cmd$c.c);
    }

    private void g(cht $$0) {
        this.t.accept($$0);
        this.a(cmd$c.a);
        this.x = null;
        this.y = 0;
    }

    private BiConsumer<cht, ccv> a(a $$0) {
        return ($$1, $$2) -> this.b($$0);
    }

    private void a(c $$0) {
        this.w = $$0;
    }

    private void b(a $$0) {
        this.x = $$0;
    }

    private void b(d $$0, cht $$1) {
        $$1.ev().a(cqw.o, new cjg($$0.a));
        this.q($$1);
        if (this.x != null) {
            Optional.ofNullable(this.u.get((Object)this.x)).ifPresent($$2 -> $$2.accept($$1, $$0, this.y));
        }
    }

    private void a(cht $$0, ccv $$1, BiConsumer<cht, ccv> $$2, BiConsumer<cht, ccv> $$3, BiConsumer<cht, ccv> $$4, BiConsumer<cht, ccv> $$5) {
        if (cmd.o($$0)) {
            if (cmd.a($$1)) {
                $$2.accept($$0, $$1);
            } else {
                $$3.accept($$0, $$1);
            }
        } else if (cmd.a($$0, $$1)) {
            $$4.accept($$0, $$1);
        } else {
            $$5.accept($$0, $$1);
        }
    }

    private Optional<d> c(axf $$0, cht $$1) {
        fth $$2 = this.h($$1);
        Set<jc> $$3 = cmd.k($$1);
        Set<jc> $$4 = cmd.l($$1);
        List<dvu> $$5 = dvu.a(new dvu($$1.dK()), Math.floorDiv(this.i($$1), 16) + 1).toList();
        d $$6 = null;
        double $$7 = 3.4028234663852886E38;
        for (dvu $$8 : $$5) {
            eqq $$9 = $$0.p().a($$8.h, $$8.i);
            if ($$9 == null) continue;
            for (elb $$10 : $$9.J().values()) {
                d $$13;
                elj $$11;
                double $$12;
                if (!($$10 instanceof elj) || !(($$12 = ($$11 = (elj)$$10).aD_().b($$1.dI())) < $$7) || ($$13 = this.a($$1, $$0, $$11, $$3, $$4, $$2)) == null) continue;
                $$6 = $$13;
                $$7 = $$12;
            }
        }
        return $$6 == null ? Optional.empty() : Optional.of($$6);
    }

    private @Nullable d a(cht $$0, dwo $$1, elb $$2, Set<jc> $$3, Set<jc> $$4, fth $$5) {
        is $$6 = $$2.aD_();
        boolean $$7 = $$5.e($$6.u(), $$6.v(), $$6.w());
        if (!$$7) {
            return null;
        }
        d $$8 = cmd$d.a($$2, $$1);
        if ($$8 == null) {
            return null;
        }
        boolean $$9 = this.a($$0, $$8.d) && !this.a($$3, $$4, $$8, $$1) && !this.a($$8);
        return $$9 ? $$8 : null;
    }

    @Override
    private boolean a(d $$0) {
        eku $$1;
        elb elb2 = $$0.c;
        return elb2 instanceof eku && ($$1 = (eku)elb2).m();
    }

    private boolean a(dwo $$0, cht $$1) {
        boolean $$2;
        boolean bl2 = $$2 = this.v != null && this.a($$1, this.v.d) && this.b($$0, this.v);
        if ($$2 && !this.a($$0, this.v)) {
            if (!this.w.equals((Object)cmd$c.a)) {
                return true;
            }
            if (this.a($$0, this.v, $$1)) {
                return true;
            }
            this.b($$1, $$0, this.v.a);
        }
        return false;
    }

    private boolean a(dwo $$0, d $$1, cht $$2) {
        flp $$3 = $$2.N().j() == null ? $$2.N().a($$1.a, 0) : $$2.N().j();
        ftm $$4 = this.a($$3, $$2);
        boolean $$5 = this.a(cmd.n($$2), $$1, $$0, $$2, $$4);
        boolean $$6 = $$3 == null && !$$5;
        return $$6 || this.a($$0, $$5, $$4, $$1, $$2);
    }

    private ftm a(@Nullable flp $$0, cht $$1) {
        boolean $$2 = $$0 == null || $$0.d() == null;
        ftm $$3 = $$2 ? $$1.dI() : $$0.d().a().c();
        return this.a($$1, $$3);
    }

    private ftm a(cht $$0, ftm $$1) {
        return $$1.b(0.0, $$0.dj().c() / 2.0, 0.0);
    }

    private boolean a(dwo $$0, d $$1) {
        return eau.a($$0, $$1.a);
    }

    private boolean b(dwo $$0, d $$1) {
        return $$1.c.equals($$0.c_($$1.a));
    }

    private Stream<d> a(d $$0, dwo $$1) {
        if ($$0.d.a(eau.d, eoz.a) != eoz.a) {
            d $$2 = cmd$d.a(eau.b($$0.a, $$0.d), $$1);
            return $$2 != null ? Stream.of($$0, $$2) : Stream.of($$0);
        }
        return Stream.of($$0);
    }

    private fth h(cht $$0) {
        int $$1 = this.i($$0);
        return new fth($$0.dK()).c($$1, this.j($$0), $$1);
    }

    private int i(cht $$0) {
        return $$0.cq() ? 1 : this.o;
    }

    private int j(cht $$0) {
        return $$0.cq() ? 1 : this.p;
    }

    private static Set<jc> k(cht $$0) {
        return $$0.ev().c(cqw.ac).orElse(Set.of());
    }

    private static Set<jc> l(cht $$0) {
        return $$0.ev().c(cqw.ad).orElse(Set.of());
    }

    private boolean a(Set<jc> $$0, Set<jc> $$12, d $$22, dwo $$3) {
        return this.a($$22, $$3).map($$1 -> new jc($$3.aq(), $$1.a)).anyMatch($$2 -> $$0.contains($$2) || $$12.contains($$2));
    }

    private static boolean m(cht $$0) {
        return $$0.N().j() != null && $$0.N().j().c();
    }

    protected void a(cht $$0, dwo $$1, is $$2) {
        HashSet<jc> $$3 = new HashSet<jc>(cmd.k($$0));
        $$3.add(new jc($$1.aq(), $$2));
        if ($$3.size() > 10) {
            this.p($$0);
        } else {
            $$0.ev().a(cqw.ac, $$3, 6000L);
        }
    }

    protected void b(cht $$0, dwo $$1, is $$2) {
        HashSet<jc> $$3 = new HashSet<jc>(cmd.k($$0));
        $$3.remove(new jc($$1.aq(), $$2));
        HashSet<jc> $$4 = new HashSet<jc>(cmd.l($$0));
        $$4.add(new jc($$1.aq(), $$2));
        if ($$4.size() > 50) {
            this.p($$0);
        } else {
            $$0.ev().a(cqw.ac, $$3, 6000L);
            $$0.ev().a(cqw.ad, $$4, 6000L);
        }
    }

    private boolean a(cht $$0, eoh $$1) {
        return cmd.o($$0) ? this.q.test($$1) : this.r.test($$1);
    }

    private static double n(cht $$0) {
        return cmd.m($$0) ? 1.0 : 0.5;
    }

    private boolean a(double $$0, d $$1, dwo $$2, cht $$3, ftm $$4) {
        fth $$5 = $$3.dj();
        fth $$6 = fth.a($$4, $$5.b(), $$5.c(), $$5.d());
        return $$1.d.g($$2, $$1.a).a().c($$0, 0.5, $$0).a($$1.a).c($$6);
    }

    private boolean a(dwo $$0, boolean $$1, ftm $$2, d $$3, cht $$4) {
        return $$1 && this.a($$3, $$0, $$4, $$2);
    }

    private boolean a(d $$0, dwo $$12, cht $$2, ftm $$32) {
        ftm $$4 = $$0.a.b();
        return iz.a().map($$1 -> $$4.b(0.5 * (double)$$1.j(), 0.5 * (double)$$1.k(), 0.5 * (double)$$1.l())).map($$3 -> $$12.a(new dvw($$32, (ftm)$$3, dvw.a.a, dvw.b.a, $$2))).anyMatch($$1 -> $$1.d() == ftk.a.b && $$1.b().equals($$0.a));
    }

    private boolean b(d $$0, dwo $$1) {
        return this.a($$0, $$1).anyMatch(this.s);
    }

    private static boolean o(cht $$0) {
        return $$0.fx().f();
    }

    private static boolean a(ccv $$0) {
        return !$$0.c();
    }

    private static boolean a(cht $$0, ccv $$1) {
        return $$1.c() || cmd.b($$0, $$1);
    }

    private static boolean b(cht $$0, ccv $$1) {
        dlt $$2 = $$0.fx();
        for (dlt $$3 : $$1) {
            if (!dlt.b($$3, $$2)) continue;
            return true;
        }
        return false;
    }

    private void c(cht $$0, ccv $$1) {
        $$0.a(cgv.a, cmd.b($$1));
        $$0.g(cgv.a);
        $$1.e();
        this.b($$0);
    }

    private void d(cht $$0, ccv $$1) {
        dlt $$2 = cmd.e($$0, $$1);
        $$1.e();
        $$0.a(cgv.a, $$2);
        if ($$2.f()) {
            this.b($$0);
        } else {
            this.a($$0);
        }
    }

    private static dlt b(ccv $$0) {
        int $$1 = 0;
        for (dlt $$2 : $$0) {
            if (!$$2.f()) {
                int $$3 = Math.min($$2.N(), 16);
                return $$0.a($$1, $$3);
            }
            ++$$1;
        }
        return dlt.l;
    }

    private static dlt e(cht $$0, ccv $$1) {
        int $$2 = 0;
        dlt $$3 = $$0.fx();
        for (dlt $$4 : $$1) {
            if ($$4.f()) {
                $$1.a($$2, $$3);
                return dlt.l;
            }
            if (dlt.c($$4, $$3) && $$4.N() < $$4.k()) {
                int $$5 = $$4.k() - $$4.N();
                int $$6 = Math.min($$5, $$3.N());
                $$4.e($$4.N() + $$6);
                $$3.e($$3.N() - $$5);
                $$1.a($$2, $$4);
                if ($$3.f()) {
                    return dlt.l;
                }
            }
            ++$$2;
        }
        return $$3;
    }

    protected void a(cht $$0) {
        this.y = 0;
        this.v = null;
        $$0.N().n();
        $$0.ev().b(cqw.n);
    }

    protected void b(cht $$0) {
        this.a($$0);
        $$0.ev().b(cqw.ac);
        $$0.ev().b(cqw.ad);
    }

    private void p(cht $$0) {
        this.a($$0);
        $$0.ev().a(cqw.ae, 140);
        $$0.ev().b(cqw.ac);
        $$0.ev().b(cqw.ad);
    }

    @Override
    protected void d(axf $$0, cht $$1, long $$2) {
        this.g($$1);
        cre cre2 = $$1.N();
        if (cre2 instanceof crd) {
            crd $$3 = (crd)cre2;
            $$3.d(false);
        }
    }

    private void q(cht $$0) {
        $$0.N().n();
        $$0.K(0.0f);
        $$0.J(0.0f);
        $$0.C(0.0f);
        $$0.m(0.0, $$0.dN().h, 0.0);
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (cht)chl2, l2);
    }

    public static final class d
    extends Record {
        final is a;
        final ccv b;
        final elb c;
        final eoh d;

        public d(is $$0, ccv $$1, elb $$2, eoh $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public static @Nullable d a(elb $$0, dwo $$1) {
            is $$2 = $$0.aD_();
            eoh $$3 = $$0.o();
            ccv $$4 = cmd$d.a($$0, $$3, $$1, $$2);
            if ($$4 != null) {
                return new d($$2, $$4, $$0, $$3);
            }
            return null;
        }

        public static @Nullable d a(is $$0, dwo $$1) {
            elb $$2 = $$1.c_($$0);
            return $$2 == null ? null : cmd$d.a($$2, $$1);
        }

        private static @Nullable ccv a(elb $$0, eoh $$1, dwo $$2, is $$3) {
            dzq dzq2 = $$1.b();
            if (dzq2 instanceof eau) {
                eau $$4 = (eau)dzq2;
                return eau.a($$4, $$1, $$2, $$3, false);
            }
            if ($$0 instanceof ccv) {
                ccv $$5 = (ccv)((Object)$$0);
                return $$5;
            }
            return null;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "pos;container;blockEntity;state", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "pos;container;blockEntity;state", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "pos;container;blockEntity;state", "a", "b", "c", "d"}, this, $$0);
        }

        public is a() {
            return this.a;
        }

        public ccv b() {
            return this.b;
        }

        public elb c() {
            return this.c;
        }

        public eoh d() {
            return this.d;
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = cmd$c.a();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cmd$a.a();
        }
    }

    @FunctionalInterface
    public static interface b
    extends TriConsumer<cht, d, Integer> {
    }
}

