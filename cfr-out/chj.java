/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public interface chj {
    public static final String g = "leash";
    public static final double h = 12.0;
    public static final double i = 6.0;
    public static final double j = 16.0;
    public static final ftm k = new ftm(0.8, 0.2, 0.8);
    public static final float l = 0.7f;
    public static final double m = 10.0;
    public static final double n = 0.11;
    public static final List<ftm> o = ImmutableList.of((Object)new ftm(0.0, 0.5, 0.5));
    public static final List<ftm> p = ImmutableList.of((Object)new ftm(0.0, 0.5, 0.0));
    public static final List<ftm> q = ImmutableList.of((Object)new ftm(-0.5, 0.5, 0.5), (Object)new ftm(-0.5, 0.5, -0.5), (Object)new ftm(0.5, 0.5, -0.5), (Object)new ftm(0.5, 0.5, 0.5));

    public @Nullable a T_();

    public void a(@Nullable a var1);

    default public boolean S_() {
        return this.T_() != null && this.T_().b != null;
    }

    default public boolean ai_() {
        return this.T_() != null;
    }

    default public boolean b_(cgk $$0) {
        if (this == $$0) {
            return false;
        }
        if (this.b($$0) > this.w()) {
            return false;
        }
        return this.aj_();
    }

    default public double b(cgk $$0) {
        return $$0.dj().f().f(((cgk)((Object)this)).dj().f());
    }

    default public boolean aj_() {
        return true;
    }

    default public void b_(int $$0) {
        this.a(new a($$0));
        chj.a((cgk)((Object)this), false, false);
    }

    default public void b(fnq $$0) {
        a $$1 = $$0.a(g, a.a).orElse(null);
        if (this.T_() != null && $$1 == null) {
            this.r();
        }
        this.a($$1);
    }

    default public void a(fns $$0, @Nullable a $$1) {
        $$0.b(g, a.a, $$1);
    }

    private static <E extends cgk> void b(E $$0, a $$1) {
        dwo dwo2;
        if ($$1.c != null && (dwo2 = $$0.ao()) instanceof axf) {
            axf $$2 = (axf)dwo2;
            Optional $$3 = $$1.c.left();
            Optional $$4 = $$1.c.right();
            if ($$3.isPresent()) {
                cgk $$5 = $$2.d((UUID)$$3.get());
                if ($$5 != null) {
                    chj.a($$0, $$5, true);
                    return;
                }
            } else if ($$4.isPresent()) {
                chj.a($$0, czd.b($$2, (is)$$4.get()), true);
                return;
            }
            if ($$0.at > 100) {
                $$0.a($$2, dlx.wZ);
                ((chj)((Object)$$0)).a(null);
            }
        }
    }

    default public void o() {
        chj.a((cgk)((Object)this), true, true);
    }

    default public void r() {
        chj.a((cgk)((Object)this), true, false);
    }

    default public void s() {
    }

    private static <E extends cgk> void a(E $$0, boolean $$1, boolean $$2) {
        a $$3 = ((chj)((Object)$$0)).T_();
        if ($$3 != null && $$3.b != null) {
            ((chj)((Object)$$0)).a(null);
            ((chj)((Object)$$0)).s();
            dwo dwo2 = $$0.ao();
            if (dwo2 instanceof axf) {
                axf $$4 = (axf)dwo2;
                if ($$2) {
                    $$0.a($$4, dlx.wZ);
                }
                if ($$1) {
                    $$4.p().b($$0, new agq($$0, null));
                }
                $$3.b.b((chj)((Object)$$0));
            }
        }
    }

    public static <E extends cgk> void a_(axf $$0, E $$1) {
        cgk $$3;
        a $$2 = ((chj)((Object)$$1)).T_();
        if ($$2 != null && $$2.c != null) {
            chj.b($$1, $$2);
        }
        if ($$2 == null || $$2.b == null) {
            return;
        }
        if (!$$1.av() || !$$2.b.av()) {
            if ($$0.U().a(eua.k).booleanValue()) {
                ((chj)((Object)$$1)).o();
            } else {
                ((chj)((Object)$$1)).r();
            }
        }
        if (($$3 = ((chj)((Object)$$1)).C()) != null && $$3.ao() == $$1.ao()) {
            double $$4 = ((chj)((Object)$$1)).b($$3);
            ((chj)((Object)$$1)).d($$3);
            if ($$4 > ((chj)((Object)$$1)).w()) {
                $$0.a(null, $$3.dP(), $$3.dR(), $$3.dV(), bda.qd, bdb.g, 1.0f, 1.0f);
                ((chj)((Object)$$1)).y();
            } else if ($$4 > ((chj)((Object)$$1)).x() - (double)$$3.dF() - (double)$$1.dF() && ((chj)((Object)$$1)).a($$3, $$2)) {
                ((chj)((Object)$$1)).v();
            } else {
                ((chj)((Object)$$1)).e($$3);
            }
            $$1.v((float)((double)$$1.ec() - $$2.d));
            $$2.d *= (double)chj.c($$1);
        }
    }

    default public void v() {
        cgk $$0 = (cgk)((Object)this);
        $$0.cQ();
    }

    default public double w() {
        return 12.0;
    }

    default public double x() {
        return 6.0;
    }

    public static <E extends cgk> float c(E $$0) {
        if ($$0.aV()) {
            return $$0.ao().a_($$0.bf()).b().g() * 0.91f;
        }
        if ($$0.bB()) {
            return 0.8f;
        }
        return 0.91f;
    }

    default public void d(cgk $$0) {
        $$0.a(this);
    }

    default public void y() {
        this.o();
    }

    default public void e(cgk $$0) {
    }

    default public boolean a(cgk $$0, a $$1) {
        boolean $$2 = $$0.dY() && this.z();
        List<b> $$3 = chj.a((cgk)((Object)this), $$0, $$2 ? q : o, $$2 ? q : p);
        if ($$3.isEmpty()) {
            return false;
        }
        b $$4 = b.a($$3).a($$2 ? 0.25 : 1.0);
        $$1.d += 10.0 * $$4.b();
        ftm $$5 = chj.g($$0).d(((cgk)((Object)this)).ag());
        ((cgk)((Object)this)).l($$4.a().h(k).e($$5.c(0.11)));
        return true;
    }

    private static ftm g(cgk $$0) {
        chn $$1;
        if ($$0 instanceof chn && ($$1 = (chn)$$0).gG()) {
            return ftm.c;
        }
        return $$0.ag();
    }

    private static <E extends cgk> List<b> a(E $$0, cgk $$1, List<ftm> $$2, List<ftm> $$3) {
        double $$4 = ((chj)((Object)$$0)).x();
        ftm $$5 = chj.g($$0);
        float $$6 = $$0.ec() * ((float)Math.PI / 180);
        ftm $$7 = new ftm($$0.dF(), $$0.dG(), $$0.dF());
        float $$8 = $$1.ec() * ((float)Math.PI / 180);
        ftm $$9 = new ftm($$1.dF(), $$1.dG(), $$1.dF());
        ArrayList<b> $$10 = new ArrayList<b>();
        for (int $$11 = 0; $$11 < $$2.size(); ++$$11) {
            ftm $$12 = $$2.get($$11).h($$7).b(-$$6);
            ftm $$13 = $$0.dI().e($$12);
            ftm $$14 = $$3.get($$11).h($$9).b(-$$8);
            ftm $$15 = $$1.dI().e($$14);
            chj.a($$15, $$13, $$4, $$5, $$12).ifPresent($$10::add);
        }
        return $$10;
    }

    private static Optional<b> a(ftm $$0, ftm $$1, double $$2, ftm $$3, ftm $$4) {
        boolean $$8;
        double $$5 = $$1.f($$0);
        if ($$5 < $$2) {
            return Optional.empty();
        }
        ftm $$6 = $$0.d($$1).d().c($$5 - $$2);
        double $$7 = b.a($$4, $$6);
        boolean bl2 = $$8 = $$3.b($$6) >= 0.0;
        if ($$8) {
            $$6 = $$6.c((double)0.3f);
        }
        return Optional.of(new b($$6, $$7));
    }

    default public boolean z() {
        return false;
    }

    default public ftm[] A() {
        return chj.a((cgk)((Object)this), 0.0, 0.5, 0.5, 0.5);
    }

    public static ftm[] a(cgk $$0, double $$1, double $$2, double $$3, double $$4) {
        float $$5 = $$0.dF();
        double $$6 = $$1 * (double)$$5;
        double $$7 = $$2 * (double)$$5;
        double $$8 = $$3 * (double)$$5;
        double $$9 = $$4 * (double)$$0.dG();
        return new ftm[]{new ftm(-$$8, $$9, $$7 + $$6), new ftm(-$$8, $$9, -$$7 + $$6), new ftm($$8, $$9, -$$7 + $$6), new ftm($$8, $$9, $$7 + $$6)};
    }

    default public ftm a_(float $$0) {
        return this.B();
    }

    default public ftm B() {
        cgk $$0 = (cgk)((Object)this);
        return new ftm(0.0, $$0.dk(), $$0.dF() * 0.4f);
    }

    default public void a_(cgk $$0, boolean $$1) {
        if (this == $$0) {
            return;
        }
        chj.a((cgk)((Object)this), $$0, $$1);
    }

    private static <E extends cgk> void a(E $$0, cgk $$1, boolean $$2) {
        dwo dwo2;
        a $$3 = ((chj)((Object)$$0)).T_();
        if ($$3 == null) {
            $$3 = new a($$1);
            ((chj)((Object)$$0)).a($$3);
        } else {
            cgk $$4 = $$3.b;
            $$3.a($$1);
            if ($$4 != null && $$4 != $$1) {
                $$4.b((chj)((Object)$$0));
            }
        }
        if ($$2 && (dwo2 = $$0.ao()) instanceof axf) {
            axf $$5 = (axf)dwo2;
            $$5.p().b($$0, new agq($$0, $$1));
        }
        if ($$0.cq()) {
            $$0.cf();
        }
    }

    default public @Nullable cgk C() {
        return chj.h((cgk)((Object)this));
    }

    private static <E extends cgk> @Nullable cgk h(E $$0) {
        cgk cgk2;
        a $$1 = ((chj)((Object)$$0)).T_();
        if ($$1 == null) {
            return null;
        }
        if ($$1.e != 0 && $$0.ao().B_() && (cgk2 = $$0.ao().a($$1.e)) instanceof cgk) {
            cgk $$2 = cgk2;
            $$1.a($$2);
        }
        return $$1.b;
    }

    public static List<chj> c_(cgk $$0) {
        return chj.a($$0, (chj $$1) -> $$1.C() == $$0);
    }

    public static List<chj> a(cgk $$0, Predicate<chj> $$1) {
        return chj.a($$0.ao(), $$0.dj().f(), $$1);
    }

    public static List<chj> a(dwo $$0, ftm $$12, Predicate<chj> $$2) {
        double $$3 = 32.0;
        fth $$4 = fth.a($$12, 32.0, 32.0, 32.0);
        return $$0.a(cgk.class, $$4, $$1 -> {
            chj $$2;
            return $$1 instanceof chj && $$2.test($$2 = (chj)((Object)$$1));
        }).stream().map(chj.class::cast).toList();
    }

    public static final class a {
        public static final Codec<a> a = Codec.xor((Codec)jx.a.fieldOf("UUID").codec(), is.a).xmap(a::new, $$0 -> {
            cgk $$1 = $$0.b;
            if ($$1 instanceof czd) {
                czd $$2 = (czd)$$1;
                return Either.right((Object)$$2.i());
            }
            if ($$0.b != null) {
                return Either.left((Object)$$0.b.cY());
            }
            return Objects.requireNonNull($$0.c, "Invalid LeashData had no attachment");
        });
        int e;
        public @Nullable cgk b;
        public @Nullable Either<UUID, is> c;
        public double d;

        private a(Either<UUID, is> $$0) {
            this.c = $$0;
        }

        a(cgk $$0) {
            this.b = $$0;
        }

        a(int $$0) {
            this.e = $$0;
        }

        public void a(cgk $$0) {
            this.b = $$0;
            this.c = null;
            this.e = 0;
        }
    }

    public static final class b
    extends Record {
        private final ftm b;
        private final double c;
        static b a = new b(ftm.c, 0.0);

        public b(ftm $$0, double $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        static double a(ftm $$0, ftm $$1) {
            return $$0.i * $$1.g - $$0.g * $$1.i;
        }

        static b a(List<b> $$0) {
            if ($$0.isEmpty()) {
                return a;
            }
            double $$1 = 0.0;
            double $$2 = 0.0;
            double $$3 = 0.0;
            double $$4 = 0.0;
            for (b $$5 : $$0) {
                ftm $$6 = $$5.b;
                $$1 += $$6.g;
                $$2 += $$6.h;
                $$3 += $$6.i;
                $$4 += $$5.c;
            }
            return new b(new ftm($$1, $$2, $$3), $$4);
        }

        public b a(double $$0) {
            return new b(this.b.c($$0), this.c * $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "force;torque", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "force;torque", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "force;torque", "b", "c"}, this, $$0);
        }

        public ftm a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }
    }
}

