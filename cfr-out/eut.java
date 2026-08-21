/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public final class eut
extends eqg {
    public static final MapCodec<eut> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dxs.a.fieldOf("biome_source").forGetter($$0 -> $$0.b), (App)euv.b.fieldOf("settings").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, $$02.stable(eut::new)));
    private static final eoh d = dzs.a.m();
    private final jd<euv> e;
    private final Supplier<euc.a> f;

    public eut(dxs $$0, jd<euv> $$1) {
        super($$0);
        this.e = $$1;
        this.f = Suppliers.memoize(() -> eut.a((euv)$$1.a()));
    }

    private static euc.a a(euv $$0) {
        euc.b $$1 = new euc.b(-54, dzs.K.m());
        int $$2 = $$0.l();
        euc.b $$3 = new euc.b($$2, $$0.h());
        euc.b $$42 = new euc.b(esh.e * 2, dzs.a.m());
        return ($$4, $$5, $$6) -> {
            if (w.ay) {
                return $$42;
            }
            if ($$5 < Math.min(-54, $$2)) {
                return $$1;
            }
            return $$3;
        };
    }

    @Override
    public CompletableFuture<eqf> a(eve $$0, evs $$1, dxk $$2, eqf $$3) {
        return CompletableFuture.supplyAsync(() -> {
            this.b($$1, $$0, $$2, $$3);
            return $$3;
        }, bhs.h().a("init_biomes"));
    }

    private void b(evs $$0, eve $$1, dxk $$2, eqf $$32) {
        euu $$4 = $$32.a((eqf $$3) -> this.a((eqf)$$3, $$2, $$0, $$1));
        dxr $$5 = eue.a($$0.a(this.b), $$32);
        $$32.a($$5, $$4.a($$1.a(), this.e.a().k()));
    }

    private euu a(eqf $$0, dxk $$1, evs $$2, eve $$3) {
        return euu.a($$0, $$3, eud.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
    }

    @Override
    protected MapCodec<? extends eqg> b() {
        return c;
    }

    public jd<euv> h() {
        return this.e;
    }

    public boolean a(amt<euv> $$0) {
        return this.e.a($$0);
    }

    @Override
    public int a(int $$0, int $$1, euq.a $$2, dwq $$3, eve $$4) {
        return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.K_());
    }

    @Override
    public dxa a(int $$0, int $$1, dwq $$2, eve $$3) {
        MutableObject $$4 = new MutableObject();
        this.a($$2, $$3, $$0, $$1, (MutableObject<dxa>)$$4, null);
        return (dxa)$$4.get();
    }

    @Override
    public void a(List<String> $$0, eve $$1, is $$2) {
        DecimalFormat $$3 = new DecimalFormat("0.000", DecimalFormatSymbols.getInstance(Locale.ROOT));
        euw $$4 = $$1.a();
        euj.e $$5 = new euj.e($$2.u(), $$2.v(), $$2.w());
        double $$6 = $$4.j().a($$5);
        $$0.add("NoiseRouter T: " + $$3.format($$4.e().a($$5)) + " V: " + $$3.format($$4.f().a($$5)) + " C: " + $$3.format($$4.g().a($$5)) + " E: " + $$3.format($$4.h().a($$5)) + " D: " + $$3.format($$4.i().a($$5)) + " W: " + $$3.format($$6) + " PV: " + $$3.format(eux.a((float)$$6)) + " PS: " + $$3.format($$4.k().a($$5)) + " N: " + $$3.format($$4.l().a($$5)));
    }

    private OptionalInt a(dwq $$0, eve $$1, int $$2, int $$3, @Nullable MutableObject<dxa> $$4, @Nullable Predicate<eoh> $$5) {
        eoh[] $$12;
        euy $$6 = this.e.a().f().a($$0);
        int $$7 = $$6.a();
        int $$8 = $$6.c();
        int $$9 = bgj.b($$8, $$7);
        int $$10 = bgj.b($$6.d(), $$7);
        if ($$10 <= 0) {
            return OptionalInt.empty();
        }
        if ($$4 == null) {
            Object $$11 = null;
        } else {
            $$12 = new eoh[$$6.d()];
            $$4.setValue((Object)new dxa($$8, $$12));
        }
        int $$13 = $$6.b();
        int $$14 = Math.floorDiv($$2, $$13);
        int $$15 = Math.floorDiv($$3, $$13);
        int $$16 = Math.floorMod($$2, $$13);
        int $$17 = Math.floorMod($$3, $$13);
        int $$18 = $$14 * $$13;
        int $$19 = $$15 * $$13;
        double $$20 = (double)$$16 / (double)$$13;
        double $$21 = (double)$$17 / (double)$$13;
        euu $$22 = new euu(1, $$1, $$18, $$19, $$6, euk.b.a, this.e.a(), this.f.get(), evs.a());
        $$22.f();
        $$22.b(0);
        for (int $$23 = $$10 - 1; $$23 >= 0; --$$23) {
            $$22.b($$23, 0);
            for (int $$24 = $$7 - 1; $$24 >= 0; --$$24) {
                eoh $$28;
                int $$25 = ($$9 + $$23) * $$7 + $$24;
                double $$26 = (double)$$24 / (double)$$7;
                $$22.a($$25, $$26);
                $$22.b($$2, $$20);
                $$22.c($$3, $$21);
                eoh $$27 = $$22.e();
                eoh eoh2 = $$28 = $$27 == null ? this.e.a().g() : $$27;
                if ($$12 != null) {
                    int $$29 = $$23 * $$7 + $$24;
                    $$12[$$29] = $$28;
                }
                if ($$5 == null || !$$5.test($$28)) continue;
                $$22.g();
                return OptionalInt.of($$25 + 1);
            }
        }
        $$22.g();
        return OptionalInt.empty();
    }

    @Override
    public void a(axn $$0, dxk $$1, eve $$2, eqf $$3) {
        if (w.a($$3.f()) || w.aA) {
            return;
        }
        evn $$4 = new evn(this, $$0);
        this.a($$3, $$4, $$2, $$1, $$0.H_(), $$0.J_().f(mj.aS), evs.a($$0));
    }

    @VisibleForTesting
    public void a(eqf $$0, evn $$1, eve $$2, dxk $$32, dxq $$4, jq<dxo> $$5, evs $$6) {
        euu $$7 = $$0.a((eqf $$3) -> this.a((eqf)$$3, $$32, $$6, $$2));
        euv $$8 = this.e.a();
        $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
    }

    @Override
    public void a(axn $$0, long $$12, eve $$22, dxq $$32, dxk $$4, eqf $$5) {
        if (w.aB) {
            return;
        }
        dxq $$6 = $$32.a((int $$1, int $$2, int $$3) -> this.b.getNoiseBiome($$1, $$2, $$3, $$22.b()));
        evp $$7 = new evp(new eur(evf.a()));
        int $$8 = 8;
        dvu $$9 = $$5.f();
        euu $$10 = $$5.a((eqf $$3) -> this.a((eqf)$$3, $$4, evs.a($$0), $$22));
        euc $$11 = $$10.i();
        ewr $$122 = new ewr(this, $$0.J_(), $$5.B(), $$10, $$22, this.e.a().j());
        eqe $$13 = ((erb)$$5).G();
        for (int $$14 = -8; $$14 <= 8; ++$$14) {
            for (int $$15 = -8; $$15 <= 8; ++$$15) {
                dvu $$16 = new dvu($$9.h + $$14, $$9.i + $$15);
                eqf $$17 = $$0.a($$16.h, $$16.i);
                dxp $$18 = $$17.a(() -> this.a(this.b.getNoiseBiome(jo.a($$16.e()), 0, jo.a($$16.f()), $$22.b())));
                Iterable<jd<ewu<?>>> $$19 = $$18.a();
                int $$20 = 0;
                for (jd<ewu<?>> $$21 : $$19) {
                    ewu<?> $$222 = $$21.a();
                    $$7.c($$12 + (long)$$20, $$16.h, $$16.i);
                    if ($$222.a($$7)) {
                        $$222.a($$122, $$5, $$6::a, $$7, $$11, $$16, $$13);
                    }
                    ++$$20;
                }
            }
        }
    }

    @Override
    public CompletableFuture<eqf> a(evs $$0, eve $$1, dxk $$2, eqf $$3) {
        euy $$4 = this.e.a().f().a($$3.B());
        int $$5 = $$4.c();
        int $$6 = bgj.b($$5, $$4.a());
        int $$7 = bgj.b($$4.d(), $$4.a());
        if ($$7 <= 0) {
            return CompletableFuture.completedFuture($$3);
        }
        return CompletableFuture.supplyAsync(() -> {
            int $$8 = $$3.f($$7 * $$4.a() - 1 + $$5);
            int $$9 = $$3.f($$5);
            HashSet $$10 = Sets.newHashSet();
            for (int $$11 = $$8; $$11 >= $$9; --$$11) {
                eqr $$12 = $$3.b($$11);
                $$12.a();
                $$10.add($$12);
            }
            try {
                eqf eqf2 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
                return eqf2;
            }
            finally {
                for (eqr $$13 : $$10) {
                    $$13.b();
                }
            }
        }, bhs.h().a("wgen_fill_noise"));
    }

    private eqf a(evs $$0, dxk $$1, eve $$2, eqf $$32, int $$4, int $$5) {
        euu $$6 = $$32.a((eqf $$3) -> this.a((eqf)$$3, $$1, $$0, $$2));
        euq $$7 = $$32.a(euq.a.c);
        euq $$8 = $$32.a(euq.a.a);
        dvu $$9 = $$32.f();
        int $$10 = $$9.e();
        int $$11 = $$9.f();
        euc $$12 = $$6.i();
        $$6.f();
        is.a $$13 = new is.a();
        int $$14 = $$6.j();
        int $$15 = $$6.k();
        int $$16 = 16 / $$14;
        int $$17 = 16 / $$14;
        for (int $$18 = 0; $$18 < $$16; ++$$18) {
            $$6.b($$18);
            for (int $$19 = 0; $$19 < $$17; ++$$19) {
                int $$20 = $$32.ax() - 1;
                eqr $$21 = $$32.b($$20);
                for (int $$22 = $$5 - 1; $$22 >= 0; --$$22) {
                    $$6.b($$22, $$19);
                    for (int $$23 = $$15 - 1; $$23 >= 0; --$$23) {
                        int $$24 = ($$4 + $$22) * $$15 + $$23;
                        int $$25 = $$24 & 0xF;
                        int $$26 = $$32.f($$24);
                        if ($$20 != $$26) {
                            $$20 = $$26;
                            $$21 = $$32.b($$26);
                        }
                        double $$27 = (double)$$23 / (double)$$15;
                        $$6.a($$24, $$27);
                        for (int $$28 = 0; $$28 < $$14; ++$$28) {
                            int $$29 = $$10 + $$18 * $$14 + $$28;
                            int $$30 = $$29 & 0xF;
                            double $$31 = (double)$$28 / (double)$$14;
                            $$6.b($$29, $$31);
                            for (int $$322 = 0; $$322 < $$14; ++$$322) {
                                int $$33 = $$11 + $$19 * $$14 + $$322;
                                int $$34 = $$33 & 0xF;
                                double $$35 = (double)$$322 / (double)$$14;
                                $$6.c($$33, $$35);
                                eoh $$36 = $$6.e();
                                if ($$36 == null) {
                                    $$36 = this.e.a().g();
                                }
                                if (($$36 = this.a($$6, $$29, $$24, $$33, $$36)) == d || w.a($$32.f())) continue;
                                $$21.a($$30, $$25, $$34, $$36, false);
                                $$7.a($$30, $$24, $$34, $$36);
                                $$8.a($$30, $$24, $$34, $$36);
                                if (!$$12.a() || $$36.y().c()) continue;
                                $$13.d($$29, $$24, $$33);
                                $$32.e($$13);
                            }
                        }
                    }
                }
            }
            $$6.h();
        }
        $$6.g();
        return $$32;
    }

    private eoh a(euu $$0, int $$1, int $$2, int $$3, eoh $$4) {
        int $$5;
        int $$6;
        if (w.at && $$3 >= 0 && $$3 % 4 == 0 && $$2 == ($$6 = ($$5 = $$0.a($$1, $$3)) + 8)) {
            $$4 = $$6 < this.f() ? dzs.iN.m() : dzs.qg.m();
        }
        return $$4;
    }

    @Override
    public int e() {
        return this.e.a().f().d();
    }

    @Override
    public int f() {
        return this.e.a().l();
    }

    @Override
    public int g() {
        return this.e.a().f().c();
    }

    @Override
    public void a(axn $$0) {
        if (this.e.a().a()) {
            return;
        }
        dvu $$1 = $$0.b();
        jd<dxo> $$2 = $$0.z($$1.m().h($$0.aw()));
        evp $$3 = new evp(new eur(evf.a()));
        $$3.a($$0.J(), $$1.e(), $$1.f());
        dwz.a($$0, $$2, $$1, $$3);
    }
}

