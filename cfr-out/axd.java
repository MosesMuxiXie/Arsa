/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class axd {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 1;
    private static final double d = 7.62939453125E-6;
    public static final int a = 60;
    private static final int e = 400;
    private final axf f;
    private final cgk g;
    private final int h;
    private final boolean i;
    private final a j;
    private final akg k = new akg();
    private byte l;
    private byte m;
    private byte n;
    private ftm o;
    private int p;
    private int q;
    private List<cgk> r = Collections.emptyList();
    private boolean s;
    private boolean t;
    private @Nullable List<ama.c<?>> u;

    public axd(axf $$0, cgk $$1, int $$2, boolean $$3, a $$4) {
        this.f = $$0;
        this.j = $$4;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.k.e($$1.dJ());
        this.o = $$1.dN();
        this.l = bgj.e($$1.ec());
        this.m = bgj.e($$1.ee());
        this.n = bgj.e($$1.cS());
        this.t = $$1.aV();
        this.u = $$1.aD().c();
    }

    public void a() {
        cgk cgk2;
        this.g.aI();
        List<cgk> $$0 = this.g.dn();
        if (!$$0.equals(this.r)) {
            this.j.a(new agx(this.g), (axg $$1) -> $$0.contains($$1) == this.r.contains($$1));
            this.r = $$0;
        }
        if ((cgk2 = this.g) instanceof czc) {
            czc $$12 = (czc)cgk2;
            if (this.p % 10 == 0) {
                fmu $$3;
                fmw $$4;
                dlt $$2 = $$12.w();
                if ($$2.h() instanceof dmg && ($$4 = dmg.a($$3 = $$2.a(ki.T), (dwo)this.f)) != null) {
                    for (axg axg2 : this.f.E()) {
                        $$4.a(axg2, $$2);
                        aay<?> $$6 = $$4.a($$3, axg2);
                        if ($$6 == null) continue;
                        axg2.g.b($$6);
                    }
                }
                this.g();
            }
        }
        if (this.p % this.h == 0 || this.g.aF || this.g.aD().a()) {
            boolean $$9;
            byte $$7 = bgj.e(this.g.ec());
            byte $$8 = bgj.e(this.g.ee());
            boolean bl2 = $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if (this.g.cq()) {
                if ($$9) {
                    this.j.a(new afa.c(this.g.aA(), $$7, $$8, this.g.aV()));
                    this.l = $$7;
                    this.m = $$8;
                }
                this.k.e(this.g.dJ());
                this.g();
                this.s = true;
            } else {
                dgi $$10;
                dgl dgl2;
                cgk cgk3 = this.g;
                if (cgk3 instanceof dgi && (dgl2 = ($$10 = (dgi)cgk3).q()) instanceof dgs) {
                    dgs $$11 = (dgs)dgl2;
                    this.a($$11, $$7, $$8, $$9);
                } else {
                    ftm $$22;
                    double $$23;
                    boolean $$21;
                    ++this.q;
                    ftm ftm2 = this.g.dJ();
                    boolean $$13 = this.k.d(ftm2).h() >= 7.62939453125E-6;
                    aay<adb> $$14 = null;
                    boolean $$15 = $$13 || this.p % 60 == 0;
                    boolean $$16 = false;
                    boolean $$17 = false;
                    long $$18 = this.k.a(ftm2);
                    long $$19 = this.k.b(ftm2);
                    long $$20 = this.k.c(ftm2);
                    boolean bl3 = $$21 = $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L;
                    if (this.g.az() || $$21 || this.q > 400 || this.s || this.t != this.g.aV()) {
                        this.t = this.g.aV();
                        this.q = 0;
                        $$14 = aej.a(this.g);
                        $$16 = true;
                        $$17 = true;
                    } else if ($$15 && $$9 || this.g instanceof deh) {
                        $$14 = new afa.b(this.g.aA(), (short)$$18, (short)$$19, (short)$$20, $$7, $$8, this.g.aV());
                        $$16 = true;
                        $$17 = true;
                    } else if ($$15) {
                        $$14 = new afa.a(this.g.aA(), (short)$$18, (short)$$19, (short)$$20, this.g.aV());
                        $$16 = true;
                    } else if ($$9) {
                        $$14 = new afa.c(this.g.aA(), $$7, $$8, this.g.aV());
                        $$17 = true;
                    }
                    if ((this.g.aF || this.i || this.g instanceof chl && ((chl)this.g).gj()) && (($$23 = ($$22 = this.g.dN()).g(this.o)) > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0)) {
                        this.o = $$22;
                        cgk cgk4 = this.g;
                        if (cgk4 instanceof dem) {
                            dem $$24 = (dem)cgk4;
                            this.j.a(new adm((Iterable<aay<? super adb>>)List.of(new agr(this.g.aA(), this.o), new afr($$24.aA(), $$24.d))));
                        } else {
                            this.j.a(new agr(this.g.aA(), this.o));
                        }
                    }
                    if ($$14 != null) {
                        this.j.a($$14);
                    }
                    this.g();
                    if ($$16) {
                        this.k.e(ftm2);
                    }
                    if ($$17) {
                        this.l = $$7;
                        this.m = $$8;
                    }
                    this.s = false;
                }
            }
            byte $$25 = bgj.e(this.g.cS());
            if (Math.abs($$25 - this.n) >= 1) {
                this.j.a(new afz(this.g, $$25));
                this.n = $$25;
            }
            this.g.aF = false;
        }
        ++this.p;
        if (this.g.ah) {
            this.g.ah = false;
            this.j.b(new agr(this.g));
        }
    }

    private void a(dgs $$0, byte $$1, byte $$2, boolean $$3) {
        this.g();
        if ($$0.e.isEmpty()) {
            boolean $$8;
            ftm $$4 = this.g.dN();
            double $$5 = $$4.g(this.o);
            ftm $$6 = this.g.dJ();
            boolean $$7 = this.k.d($$6).h() >= 7.62939453125E-6;
            boolean bl2 = $$8 = $$7 || this.p % 60 == 0;
            if ($$8 || $$3 || $$5 > 1.0E-7) {
                this.j.a(new afb(this.g.aA(), List.of(new dgs.a(this.g.dI(), this.g.dN(), this.g.ec(), this.g.ee(), 1.0f))));
            }
        } else {
            this.j.a(new afb(this.g.aA(), List.copyOf($$0.e)));
            $$0.e.clear();
        }
        this.l = $$1;
        this.m = $$2;
        this.k.e(this.g.dI());
    }

    public void a(axg $$0) {
        this.g.e($$0);
        $$0.g.b(new afv(this.g.aA()));
    }

    public void b(axg $$0) {
        ArrayList<aay<? super adb>> $$1 = new ArrayList<aay<? super adb>>();
        this.a($$0, $$1::add);
        $$0.g.b(new adm((Iterable<aay<? super adb>>)$$1));
        this.g.d($$0);
    }

    public void a(axg $$0, Consumer<aay<adb>> $$1) {
        chj $$9;
        chl $$3;
        Object $$4;
        cgk cgk2;
        this.g.aI();
        if (this.g.eh()) {
            b.warn("Fetching packet for removed entity {}", (Object)this.g);
        }
        aay<adb> $$2 = this.g.a(this);
        $$1.accept($$2);
        if (this.u != null) {
            $$1.accept(new agp(this.g.aA(), this.u));
        }
        if ((cgk2 = this.g) instanceof chl && !($$4 = ($$3 = (chl)cgk2).fw().c()).isEmpty()) {
            $$1.accept(new ahu(this.g.aA(), (Collection<cio>)$$4));
        }
        if (($$4 = this.g) instanceof chl) {
            chl $$5 = (chl)$$4;
            ArrayList $$6 = Lists.newArrayList();
            for (cgv $$7 : cgv.j) {
                dlt $$8 = $$5.a($$7);
                if ($$8.f()) continue;
                $$6.add(Pair.of((Object)$$7, (Object)$$8.v()));
            }
            if (!$$6.isEmpty()) {
                $$1.accept(new ags(this.g.aA(), $$6));
            }
        }
        if (!this.g.dn().isEmpty()) {
            $$1.accept(new agx(this.g));
        }
        if (this.g.cq()) {
            $$1.accept(new agx(this.g.dz()));
        }
        if ((cgk2 = this.g) instanceof chj && ($$9 = (chj)((Object)cgk2)).S_()) {
            $$1.accept(new agq(this.g, $$9.C()));
        }
    }

    public ftm b() {
        return this.k.a();
    }

    public ftm c() {
        return this.o;
    }

    public float d() {
        return bgj.a(this.m);
    }

    public float e() {
        return bgj.a(this.l);
    }

    public float f() {
        return bgj.a(this.n);
    }

    private void g() {
        ama $$0 = this.g.aD();
        List<ama.c<?>> $$1 = $$0.b();
        if ($$1 != null) {
            this.u = $$0.c();
            this.j.b(new agp(this.g.aA(), $$1));
        }
        if (this.g instanceof chl) {
            Set<cio> $$2 = ((chl)this.g).fw().a();
            if (!$$2.isEmpty()) {
                this.j.b(new ahu(this.g.aA(), $$2));
            }
            $$2.clear();
        }
    }

    public static interface a {
        public void a(aay<? super adb> var1);

        public void b(aay<? super adb> var1);

        public void a(aay<? super adb> var1, Predicate<axg> var2);
    }
}

