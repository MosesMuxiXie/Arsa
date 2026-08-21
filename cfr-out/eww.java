/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class eww<C extends ewp> {
    public static final eww<ews> a = eww.a("cave", new ewt(ews.a));
    public static final eww<ews> b = eww.a("nether_cave", new ewv(ews.a));
    public static final eww<ewn> c = eww.a("canyon", new ewo(ewn.a));
    protected static final eoh d = dzs.a.m();
    protected static final eoh e = dzs.nZ.m();
    protected static final flb f = flc.c.g();
    protected static final flb g = flc.e.g();
    protected Set<fla> h = ImmutableSet.of((Object)flc.c);
    private final MapCodec<ewu<C>> i;

    private static <C extends ewp, F extends eww<C>> F a(String $$0, F $$1) {
        return (F)jq.a(mi.N, $$0, $$1);
    }

    public eww(Codec<C> $$0) {
        this.i = $$0.fieldOf("config").xmap(this::a, ewu::b);
    }

    public ewu<C> a(C $$0) {
        return new ewu<C>(this, $$0);
    }

    public MapCodec<ewu<C>> c() {
        return this.i;
    }

    public int d() {
        return 4;
    }

    protected boolean a(ewr $$0, C $$1, eqf $$2, Function<is, jd<dxo>> $$3, euc $$4, double $$5, double $$6, double $$7, double $$8, double $$9, eqe $$10, a $$11) {
        dvu $$12 = $$2.f();
        double $$13 = $$12.c();
        double $$14 = $$12.d();
        double $$15 = 16.0 + $$8 * 2.0;
        if (Math.abs($$5 - $$13) > $$15 || Math.abs($$7 - $$14) > $$15) {
            return false;
        }
        int $$16 = $$12.e();
        int $$17 = $$12.f();
        int $$18 = Math.max(bgj.c($$5 - $$8) - $$16 - 1, 0);
        int $$19 = Math.min(bgj.c($$5 + $$8) - $$16, 15);
        int $$20 = Math.max(bgj.c($$6 - $$9) - 1, $$0.a() + 1);
        int $$21 = $$2.A() ? 0 : 7;
        int $$22 = Math.min(bgj.c($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
        int $$23 = Math.max(bgj.c($$7 - $$8) - $$17 - 1, 0);
        int $$24 = Math.min(bgj.c($$7 + $$8) - $$17, 15);
        boolean $$25 = false;
        is.a $$26 = new is.a();
        is.a $$27 = new is.a();
        for (int $$28 = $$18; $$28 <= $$19; ++$$28) {
            int $$29 = $$12.a($$28);
            double $$30 = ((double)$$29 + 0.5 - $$5) / $$8;
            for (int $$31 = $$23; $$31 <= $$24; ++$$31) {
                int $$32 = $$12.b($$31);
                double $$33 = ((double)$$32 + 0.5 - $$7) / $$8;
                if ($$30 * $$30 + $$33 * $$33 >= 1.0) continue;
                MutableBoolean $$34 = new MutableBoolean(false);
                for (int $$35 = $$22; $$35 > $$20; --$$35) {
                    double $$36 = ((double)$$35 - 0.5 - $$6) / $$9;
                    if ($$11.shouldSkip($$0, $$30, $$36, $$33, $$35) || $$10.b($$28, $$35, $$31) && !eww.b($$1)) continue;
                    $$10.a($$28, $$35, $$31);
                    $$26.d($$29, $$35, $$32);
                    $$25 |= this.a($$0, $$1, $$2, $$3, $$10, $$26, $$27, $$4, $$34);
                }
            }
        }
        return $$25;
    }

    protected boolean a(ewr $$0, C $$1, eqf $$22, Function<is, jd<dxo>> $$3, eqe $$4, is.a $$5, is.a $$6, euc $$7, MutableBoolean $$8) {
        eoh $$9 = $$22.a_($$5);
        if ($$9.a(dzs.i) || $$9.a(dzs.fU)) {
            $$8.setTrue();
        }
        if (!this.a($$1, $$9) && !eww.b($$1)) {
            return false;
        }
        eoh $$10 = this.a($$0, $$1, $$5, $$7);
        if ($$10 == null) {
            return false;
        }
        $$22.a((is)$$5, $$10);
        if ($$7.a() && !$$10.y().c()) {
            $$22.e($$5);
        }
        if ($$8.isTrue()) {
            $$6.a((jy)$$5, iz.a);
            if ($$22.a_($$6).a(dzs.j)) {
                $$0.a($$3, $$22, $$6, !$$10.y().c()).ifPresent($$2 -> {
                    $$22.a((is)$$6, (eoh)$$2);
                    if (!$$2.y().c()) {
                        $$22.e($$6);
                    }
                });
            }
        }
        return true;
    }

    private @Nullable eoh a(ewr $$0, C $$1, is $$2, euc $$3) {
        if ($$2.v() <= ((ewp)$$1).g.a($$0)) {
            return g.g();
        }
        eoh $$4 = $$3.a(new euj.e($$2.u(), $$2.v(), $$2.w()), 0.0);
        if ($$4 == null) {
            return eww.b($$1) ? ((ewp)$$1).h.e() : null;
        }
        return eww.b($$1) ? eww.b($$1, $$4) : $$4;
    }

    private static eoh b(ewp $$0, eoh $$1) {
        if ($$1.a(dzs.a)) {
            return $$0.h.b();
        }
        if ($$1.a(dzs.J)) {
            eoh $$2 = $$0.h.c();
            if ($$2.b(eox.I)) {
                return (eoh)$$2.b(eox.I, true);
            }
            return $$2;
        }
        if ($$1.a(dzs.K)) {
            return $$0.h.d();
        }
        return $$1;
    }

    public abstract boolean a(ewr var1, C var2, eqf var3, Function<is, jd<dxo>> var4, bgr var5, euc var6, dvu var7, eqe var8);

    public abstract boolean a(C var1, bgr var2);

    protected boolean a(C $$0, eoh $$1) {
        return $$1.a(((ewp)$$0).i);
    }

    protected static boolean a(dvu $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
        double $$11;
        double $$10;
        double $$7;
        double $$9;
        double $$6 = $$0.c();
        double $$8 = $$1 - $$6;
        return $$8 * $$8 + ($$9 = $$2 - ($$7 = (double)$$0.d())) * $$9 - ($$10 = (double)($$4 - $$3)) * $$10 <= ($$11 = (double)($$5 + 2.0f + 16.0f)) * $$11;
    }

    private static boolean b(ewp $$0) {
        return w.Z || $$0.h.a();
    }

    public static interface a {
        public boolean shouldSkip(ewr var1, double var2, double var4, double var6, int var8);
    }
}

