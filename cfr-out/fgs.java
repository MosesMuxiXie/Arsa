/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fgs {
    static final Logger a = LogUtils.getLogger();
    private static final int b = Integer.MIN_VALUE;

    public static Optional<ffo.b> a(ffo.a $$02, jd<fgy> $$1, Optional<amo> $$22, int $$3, is $$4, boolean $$5, Optional<euq.a> $$6, fhp.a $$7, fhc $$8, fgo $$9, fja $$10) {
        is $$23;
        jr $$11 = $$02.a();
        eqg $$12 = $$02.b();
        fjr $$13 = $$02.e();
        dwq $$14 = $$02.i();
        evp $$15 = $$02.f();
        jq<fgy> $$16 = $$11.f(mj.bt);
        egm $$172 = egm.a($$15);
        fgy $$18 = $$1.e().flatMap($$2 -> $$16.f($$8.lookup((amt<fgy>)$$2))).orElse($$1.a());
        fgw $$19 = $$18.a($$15);
        if ($$19 == fgp.b) {
            return Optional.empty();
        }
        if ($$22.isPresent()) {
            amo $$20 = $$22.get();
            Optional<is> $$21 = fgs.a($$19, $$20, $$4, $$172, $$13, $$15);
            if ($$21.isEmpty()) {
                a.error("No starting jigsaw {} found in start pool {}", (Object)$$20, (Object)$$1.e().map($$0 -> $$0.a().toString()).orElse("<unregistered>"));
                return Optional.empty();
            }
            is $$222 = $$21.get();
        } else {
            $$23 = $$4;
        }
        is $$24 = $$23.b($$4);
        is $$25 = $$4.b($$24);
        ffk $$26 = new ffk($$13, $$19, $$25, $$19.h(), $$172, $$19.a($$13, $$25, $$172), $$10);
        ffg $$27 = $$26.f();
        int $$28 = ($$27.k() + $$27.h()) / 2;
        int $$29 = ($$27.m() + $$27.j()) / 2;
        int $$30 = $$6.isEmpty() ? $$25.v() : $$4.v() + $$12.b($$28, $$29, $$6.get(), $$14, $$02.d());
        int $$31 = $$27.i() + $$26.d();
        $$26.a(0, $$30 - $$31, 0);
        if (fgs.a($$14, $$9, $$26.f())) {
            a.debug("Center piece {} with bounding box {} does not fit dimension padding {}", new Object[]{$$19, $$26.f(), $$9});
            return Optional.empty();
        }
        int $$32 = $$30 + $$24.v();
        return Optional.of(new ffo.b(new is($$28, $$32, $$29), $$17 -> {
            ArrayList $$18 = Lists.newArrayList();
            $$18.add($$26);
            if ($$3 <= 0) {
                return;
            }
            fth $$19 = new fth($$28 - $$7.a(), Math.max($$32 - $$7.b(), $$14.K_() + $$9.b()), $$29 - $$7.a(), $$28 + $$7.a() + 1, Math.min($$32 + $$7.b() + 1, $$14.aw() + 1 - $$9.c()), $$29 + $$7.a() + 1);
            fug $$20 = fud.a(fud.a($$19), fud.a(fth.a($$27)), ftq.e);
            fgs.a($$02.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18, $$20, $$8, $$10);
            $$18.forEach($$17::a);
        }));
    }

    private static boolean a(dwq $$0, fgo $$1, ffg $$2) {
        if ($$1 == fgo.b) {
            return false;
        }
        int $$3 = $$0.K_() + $$1.b();
        int $$4 = $$0.aw() - $$1.c();
        return $$2.i() < $$3 || $$2.l() > $$4;
    }

    private static Optional<is> a(fgw $$0, amo $$1, is $$2, egm $$3, fjr $$4, evp $$5) {
        List<fjq.a> $$6 = $$0.a($$4, $$2, $$3, $$5);
        for (fjq.a $$7 : $$6) {
            if (!$$1.equals($$7.c())) continue;
            return Optional.of($$7.a().a());
        }
        return Optional.empty();
    }

    private static void a(eve $$0, int $$1, boolean $$2, eqg $$3, fjr $$4, dwq $$5, bgr $$6, jq<fgy> $$7, ffk $$8, List<ffk> $$9, fug $$10, fhc $$11, fja $$12) {
        b $$13 = new b($$7, $$1, $$3, $$4, $$9, $$6);
        $$13.a($$8, (MutableObject<fug>)new MutableObject((Object)$$10), 0, $$2, $$5, $$0, $$11, $$12);
        while ($$13.g.hasNext()) {
            a $$14 = (a)$$13.g.next();
            $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
        }
    }

    public static boolean a(axf $$02, jd<fgy> $$1, amo $$2, int $$3, is $$4, boolean $$5) {
        eqg $$6 = $$02.p().g();
        fjr $$7 = $$02.u();
        dxk $$8 = $$02.b();
        bgr $$9 = $$02.G_();
        ffo.a $$10 = new ffo.a($$02.J_(), $$6, $$6.d(), $$02.p().i(), $$7, $$02.J(), new dvu($$4), $$02, $$0 -> true);
        Optional<ffo.b> $$11 = fgs.a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), new fhp.a(128), fhc.a, fhp.d, fhp.e);
        if ($$11.isPresent()) {
            fgg $$12 = $$11.get().a();
            for (ffs $$13 : $$12.a().c()) {
                if (!($$13 instanceof ffk)) continue;
                ffk $$14 = (ffk)$$13;
                $$14.a((dxn)$$02, $$8, $$6, $$9, ffg.a(), $$4, $$5);
            }
            return true;
        }
        return false;
    }

    static final class b {
        private final jq<fgy> a;
        private final int b;
        private final eqg c;
        private final fjr d;
        private final List<? super ffk> e;
        private final bgr f;
        final bgu<a> g = new bgu();

        b(jq<fgy> $$0, int $$1, eqg $$2, fjr $$3, List<? super ffk> $$4, bgr $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        /*
         * Issues handling annotations - annotations may be inaccurate
         */
        void a(ffk $$02, MutableObject<fug> $$1, int $$22, boolean $$3, dwq $$4, eve $$5, fhc $$6, fja $$7) {
            fgw $$8 = $$02.b();
            is $$9 = $$02.c();
            egm $$10 = $$02.a();
            fgy.a $$11 = $$8.g();
            boolean $$12 = $$11 == fgy.a.b;
            @Nullable MutableObject $$13 = new MutableObject();
            ffg $$14 = $$02.f();
            int $$15 = $$14.i();
            block0: for (fjq.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
                fgw $$32;
                MutableObject<fug> $$29;
                fjq.d $$17 = $$16.a();
                iz $$18 = edz.p($$17.b());
                is $$19 = $$17.a();
                is $$20 = $$19.a($$18);
                int $$21 = $$19.v() - $$15;
                int $$222 = Integer.MIN_VALUE;
                amt<fgy> $$23 = $$6.lookup($$16.d());
                Optional $$24 = this.a.a($$23);
                if ($$24.isEmpty()) {
                    a.warn("Empty or non-existent pool: {}", (Object)$$23.a());
                    continue;
                }
                jd $$25 = (jd)$$24.get();
                if (((fgy)$$25.a()).c() == 0 && !$$25.a(qy.a)) {
                    a.warn("Empty or non-existent pool: {}", (Object)$$23.a());
                    continue;
                }
                jd<fgy> $$26 = ((fgy)$$25.a()).b();
                if ($$26.a().c() == 0 && !$$26.a(qy.a)) {
                    a.warn("Empty or non-existent fallback pool: {}", (Object)$$26.e().map($$0 -> $$0.a().toString()).orElse("<unregistered>"));
                    continue;
                }
                boolean $$27 = $$14.b($$20);
                if ($$27) {
                    MutableObject $$28 = $$13;
                    if ($$13.get() == null) {
                        $$13.setValue((Object)fud.a(fth.a($$14)));
                    }
                } else {
                    $$29 = $$1;
                }
                ArrayList $$30 = Lists.newArrayList();
                if ($$22 != this.b) {
                    $$30.addAll(((fgy)$$25.a()).b(this.f));
                }
                $$30.addAll($$26.a().b(this.f));
                int $$31 = $$16.f();
                Iterator iterator = $$30.iterator();
                while (iterator.hasNext() && ($$32 = (fgw)iterator.next()) != fgp.b) {
                    for (egm $$33 : egm.b(this.f)) {
                        int $$37;
                        List<fjq.a> $$34 = $$32.a(this.d, is.c, $$33, this.f);
                        ffg $$35 = $$32.a(this.d, is.c, $$33);
                        if (!$$3 || $$35.e() > 16) {
                            boolean $$36 = false;
                        } else {
                            $$37 = $$34.stream().mapToInt($$2 -> {
                                fjq.d $$3 = $$2.a();
                                if (!$$35.b($$3.a().a(edz.p($$3.b())))) {
                                    return 0;
                                }
                                amt<fgy> $$4 = $$6.lookup($$2.d());
                                Optional $$5 = this.a.a($$4);
                                Optional<jd> $$6 = $$5.map($$0 -> ((fgy)$$0.a()).b());
                                int $$7 = $$5.map($$0 -> ((fgy)$$0.a()).a(this.d)).orElse(0);
                                int $$8 = $$6.map($$0 -> ((fgy)$$0.a()).a(this.d)).orElse(0);
                                return Math.max($$7, $$8);
                            }).max().orElse(0);
                        }
                        for (fjq.a $$38 : $$34) {
                            int $$59;
                            int $$55;
                            int $$48;
                            if (!edz.a($$16, $$38)) continue;
                            is $$39 = $$38.a().a();
                            is $$40 = $$20.b($$39);
                            ffg $$41 = $$32.a(this.d, $$40, $$33);
                            int $$42 = $$41.i();
                            fgy.a $$43 = $$32.g();
                            boolean $$44 = $$43 == fgy.a.b;
                            int $$45 = $$39.v();
                            int $$46 = $$21 - $$45 + edz.p($$17.b()).k();
                            if ($$12 && $$44) {
                                int $$47 = $$15 + $$46;
                            } else {
                                if ($$222 == Integer.MIN_VALUE) {
                                    $$222 = this.c.b($$19.u(), $$19.w(), euq.a.a, $$4, $$5);
                                }
                                $$48 = $$222 - $$45;
                            }
                            int $$49 = $$48 - $$42;
                            ffg $$50 = $$41.b(0, $$49, 0);
                            is $$51 = $$40.b(0, $$49, 0);
                            if ($$37 > 0) {
                                int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                $$50.a(new is($$50.h(), $$50.i() + $$52, $$50.j()));
                            }
                            if (fud.c((fug)$$29.get(), fud.a(fth.a($$50).h(0.25)), ftq.c)) continue;
                            $$29.setValue((Object)fud.b((fug)$$29.get(), fud.a(fth.a($$50)), ftq.e));
                            int $$53 = $$02.d();
                            if ($$44) {
                                int $$54 = $$53 - $$46;
                            } else {
                                $$55 = $$32.h();
                            }
                            ffk $$56 = new ffk(this.d, $$32, $$51, $$55, $$33, $$50, $$7);
                            if ($$12) {
                                int $$57 = $$15 + $$21;
                            } else if ($$44) {
                                int $$58 = $$48 + $$45;
                            } else {
                                if ($$222 == Integer.MIN_VALUE) {
                                    $$222 = this.c.b($$19.u(), $$19.w(), euq.a.a, $$4, $$5);
                                }
                                $$59 = $$222 + $$46 / 2;
                            }
                            $$02.a(new fgr($$20.u(), (int)($$59 - $$21 + $$53), $$20.w(), $$46, $$43));
                            $$56.a(new fgr($$19.u(), $$59 - $$45 + $$55, $$19.w(), -$$46, $$11));
                            this.e.add($$56);
                            if ($$22 + 1 > this.b) continue block0;
                            a $$60 = new a($$56, $$29, $$22 + 1);
                            this.g.a($$60, $$31);
                            continue block0;
                        }
                    }
                }
            }
        }
    }

    static final class a
    extends Record {
        final ffk a;
        final MutableObject<fug> b;
        final int c;

        a(ffk $$0, MutableObject<fug> $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "piece;free;depth", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "piece;free;depth", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "piece;free;depth", "a", "b", "c"}, this, $$0);
        }

        public ffk a() {
            return this.a;
        }

        public MutableObject<fug> b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }
}

