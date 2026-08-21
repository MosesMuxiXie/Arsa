/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fjq {
    private static final Logger l = LogUtils.getLogger();
    public static final String a = "palette";
    public static final String b = "palettes";
    public static final String c = "entities";
    public static final String d = "blocks";
    public static final String e = "pos";
    public static final String f = "state";
    public static final String g = "nbt";
    public static final String h = "pos";
    public static final String i = "blockPos";
    public static final String j = "nbt";
    public static final String k = "size";
    private final List<b> m = Lists.newArrayList();
    private final List<e> n = Lists.newArrayList();
    private jy o = jy.i;
    private String p = "?";

    public jy a() {
        return this.o;
    }

    public void a(String $$0) {
        this.p = $$0;
    }

    public String b() {
        return this.p;
    }

    public void a(dwo $$0, is $$1, jy $$2, boolean $$3, List<dzq> $$4) {
        if ($$2.u() < 1 || $$2.v() < 1 || $$2.w() < 1) {
            return;
        }
        is $$5 = $$1.a($$2).b(-1, -1, -1);
        ArrayList $$6 = Lists.newArrayList();
        ArrayList $$7 = Lists.newArrayList();
        ArrayList $$8 = Lists.newArrayList();
        is $$9 = new is(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
        is $$10 = new is(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
        this.o = $$2;
        try (bgp.j $$11 = new bgp.j(l);){
            for (is $$12 : is.c($$9, $$10)) {
                d $$18;
                is $$13 = $$12.b($$9);
                eoh $$14 = $$0.a_($$12);
                if ($$4.stream().anyMatch($$14::a)) continue;
                elb $$15 = $$0.c_($$12);
                if ($$15 != null) {
                    fnp $$16 = fnp.a($$11, $$0.J_());
                    $$15.d($$16);
                    d $$17 = new d($$13, $$14, $$16.b());
                } else {
                    $$18 = new d($$13, $$14, null);
                }
                fjq.a($$18, $$6, $$7, $$8);
            }
            List<d> $$19 = fjq.a($$6, $$7, $$8);
            this.m.clear();
            this.m.add(new b($$19));
            if ($$3) {
                this.a($$0, $$9, $$10, $$11);
            } else {
                this.n.clear();
            }
        }
    }

    private static void a(d $$0, List<d> $$1, List<d> $$2, List<d> $$3) {
        if ($$0.c != null) {
            $$2.add($$0);
        } else if (!$$0.b.b().n() && $$0.b.m(dwf.a, is.c)) {
            $$1.add($$0);
        } else {
            $$3.add($$0);
        }
    }

    private static List<d> a(List<d> $$02, List<d> $$1, List<d> $$2) {
        Comparator<d> $$3 = Comparator.comparingInt($$0 -> $$0.a.v()).thenComparingInt($$0 -> $$0.a.u()).thenComparingInt($$0 -> $$0.a.w());
        $$02.sort($$3);
        $$2.sort($$3);
        $$1.sort($$3);
        ArrayList $$4 = Lists.newArrayList();
        $$4.addAll($$02);
        $$4.addAll($$2);
        $$4.addAll($$1);
        return $$4;
    }

    private void a(dwo $$02, is $$1, is $$2, bgp $$3) {
        List<cgk> $$4 = $$02.a(cgk.class, fth.a($$1, $$2), (? super T $$0) -> !($$0 instanceof ddm));
        this.n.clear();
        for (cgk $$5 : $$4) {
            is $$10;
            ftm $$6 = new ftm($$5.dP() - (double)$$1.u(), $$5.dR() - (double)$$1.v(), $$5.dV() - (double)$$1.w());
            fnp $$7 = fnp.a($$3.a($$5.es()), $$5.eo());
            $$5.c($$7);
            if ($$5 instanceof czg) {
                czg $$8 = (czg)$$5;
                is $$9 = $$8.i().b($$1);
            } else {
                $$10 = is.a($$6);
            }
            this.n.add(new e($$6, $$10, $$7.b().l()));
        }
    }

    public List<d> a(is $$0, fjm $$1, dzq $$2) {
        return this.a($$0, $$1, $$2, true);
    }

    public List<a> a(is $$0, egm $$1) {
        if (this.m.isEmpty()) {
            return new ArrayList<a>();
        }
        fjm $$2 = new fjm().a($$1);
        List<a> $$3 = $$2.a(this.m, $$0).a();
        ArrayList<a> $$4 = new ArrayList<a>($$3.size());
        for (a $$5 : $$3) {
            d $$6 = $$5.a;
            $$4.add($$5.b(new d(fjq.a($$2, $$6.a()).a($$0), $$6.b.a($$2.d()), $$6.c)));
        }
        return $$4;
    }

    public ObjectArrayList<d> a(is $$0, fjm $$1, dzq $$2, boolean $$3) {
        ObjectArrayList $$4 = new ObjectArrayList();
        ffg $$5 = $$1.g();
        if (this.m.isEmpty()) {
            return $$4;
        }
        for (d $$6 : $$1.a(this.m, $$0).a($$2)) {
            is $$7;
            is is2 = $$7 = $$3 ? fjq.a($$1, $$6.a).a($$0) : $$6.a;
            if ($$5 != null && !$$5.b($$7)) continue;
            $$4.add((Object)new d($$7, $$6.b.a($$1.d()), $$6.c));
        }
        return $$4;
    }

    public is a(fjm $$0, is $$1, fjm $$2, is $$3) {
        is $$4 = fjq.a($$0, $$1);
        is $$5 = fjq.a($$2, $$3);
        return $$4.b($$5);
    }

    public static is a(fjm $$0, is $$1) {
        return fjq.a($$1, $$0.c(), $$0.d(), $$0.e());
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    public boolean a(dxf $$0, is $$1, is $$2, fjm $$3, bgr $$4, @dzq.b int $$5) {
        if (this.m.isEmpty()) {
            return false;
        }
        List<d> $$6 = $$3.a(this.m, $$1).b();
        if ($$6.isEmpty() && ($$3.f() || this.n.isEmpty()) || this.o.u() < 1 || this.o.v() < 1 || this.o.w() < 1) {
            return false;
        }
        ffg $$7 = $$3.g();
        ArrayList $$8 = Lists.newArrayListWithCapacity((int)($$3.j() ? $$6.size() : 0));
        ArrayList $$9 = Lists.newArrayListWithCapacity((int)($$3.j() ? $$6.size() : 0));
        @Nullable ArrayList $$10 = Lists.newArrayListWithCapacity((int)$$6.size());
        int $$11 = Integer.MAX_VALUE;
        int $$12 = Integer.MAX_VALUE;
        int $$13 = Integer.MAX_VALUE;
        int $$14 = Integer.MIN_VALUE;
        int $$15 = Integer.MIN_VALUE;
        int $$16 = Integer.MIN_VALUE;
        List<d> $$17 = fjq.a($$0, $$1, $$2, $$3, $$6);
        try (bgp.j $$18 = new bgp.j(l);){
            for (d $$19 : $$17) {
                elb $$23;
                is $$20 = $$19.a;
                if ($$7 != null && !$$7.b($$20)) continue;
                flb $$21 = $$3.j() ? $$0.b_($$20) : null;
                eoh $$22 = $$19.b.a($$3.c()).a($$3.d());
                if ($$19.c != null) {
                    $$0.a($$20, dzs.iO.m(), 820);
                }
                if (!$$0.a($$20, $$22, $$5)) continue;
                $$11 = Math.min($$11, $$20.u());
                $$12 = Math.min($$12, $$20.v());
                $$13 = Math.min($$13, $$20.w());
                $$14 = Math.max($$14, $$20.u());
                $$15 = Math.max($$15, $$20.v());
                $$16 = Math.max($$16, $$20.w());
                $$10.add(Pair.of((Object)$$20, (Object)$$19.c));
                if ($$19.c != null && ($$23 = $$0.c_($$20)) != null) {
                    if (!w.J && $$23 instanceof cdj) {
                        $$19.c.a("LootTableSeed", $$4.g());
                    }
                    $$23.b(fno.a($$18.a($$23.v()), (jf.a)$$0.J_(), $$19.c));
                }
                if ($$21 == null) continue;
                if ($$22.y().b()) {
                    $$9.add($$20);
                    continue;
                }
                if (!($$22.b() instanceof eep)) continue;
                ((eep)((Object)$$22.b())).a($$0, $$20, $$22, $$21);
                if ($$21.b()) continue;
                $$8.add($$20);
            }
            boolean $$24 = true;
            iz[] $$25 = new iz[]{iz.b, iz.c, iz.f, iz.d, iz.e};
            while ($$24 && !$$8.isEmpty()) {
                $$24 = false;
                Iterator $$26 = $$8.iterator();
                while ($$26.hasNext()) {
                    eoh $$32;
                    Object $$33;
                    is $$27 = (is)$$26.next();
                    flb $$28 = $$0.b_($$27);
                    for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); ++$$29) {
                        is $$30 = $$27.a($$25[$$29]);
                        flb $$31 = $$0.b_($$30);
                        if (!$$31.b() || $$9.contains($$30)) continue;
                        $$28 = $$31;
                    }
                    if (!$$28.b() || !(($$33 = ($$32 = $$0.a_($$27)).b()) instanceof eep)) continue;
                    ((eep)$$33).a($$0, $$27, $$32, $$28);
                    $$24 = true;
                    $$26.remove();
                }
            }
            if ($$11 <= $$14) {
                if (!$$3.h()) {
                    ftp $$34 = new ftp($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                    int $$35 = $$11;
                    int $$36 = $$12;
                    int $$37 = $$13;
                    for (Pair $$38 : $$10) {
                        is $$39 = (is)$$38.getFirst();
                        ((ftv)$$34).c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                    }
                    fjq.a($$0, $$5, $$34, $$35, $$36, $$37);
                }
                for (Pair $$40 : $$10) {
                    elb $$44;
                    is $$41 = (is)$$40.getFirst();
                    if (!$$3.h()) {
                        eoh $$43;
                        eoh $$42 = $$0.a_($$41);
                        if ($$42 != ($$43 = dzq.b($$42, $$0, $$41))) {
                            $$0.a($$41, $$43, $$5 & 0xFFFFFFFE | 0x10);
                        }
                        $$0.a($$41, $$43.b());
                    }
                    if ($$40.getSecond() == null || ($$44 = $$0.c_($$41)) == null) continue;
                    $$44.e();
                }
            }
            if (!$$3.f()) {
                this.a($$0, $$1, $$3.c(), $$3.d(), $$3.e(), $$7, $$3.k(), $$18);
            }
        }
        return true;
    }

    public static void a(dwp $$0, @dzq.b int $$1, ftv $$2, is $$3) {
        fjq.a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
    }

    public static void a(dwp $$0, @dzq.b int $$1, ftv $$2, int $$3, int $$4, int $$5) {
        is.a $$6 = new is.a();
        is.a $$72 = new is.a();
        $$2.a((iz $$7, int $$8, int $$9, int $$10) -> {
            eoh $$14;
            $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
            $$72.a((jy)$$6, $$7);
            eoh $$11 = $$0.a_($$6);
            eoh $$12 = $$0.a_($$72);
            eoh $$13 = $$11.a($$0, $$0, $$6, $$7, $$72, $$12, $$0.G_());
            if ($$11 != $$13) {
                $$0.a((is)$$6, $$13, $$1 & 0xFFFFFFFE);
            }
            if ($$12 != ($$14 = $$12.a($$0, $$0, $$72, $$7.g(), $$6, $$13, $$0.G_()))) {
                $$0.a((is)$$72, $$14, $$1 & 0xFFFFFFFE);
            }
        });
    }

    public static List<d> a(dxf $$0, is $$1, is $$2, fjm $$3, List<d> $$4) {
        ArrayList<d> $$5 = new ArrayList<d>();
        List<d> $$6 = new ArrayList<d>();
        for (d $$7 : $$4) {
            is $$8 = fjq.a($$3, $$7.a).a($$1);
            d $$9 = new d($$8, $$7.b, $$7.c != null ? $$7.c.l() : null);
            Iterator<fjn> $$10 = $$3.i().iterator();
            while ($$9 != null && $$10.hasNext()) {
                $$9 = $$10.next().a((dwr)$$0, $$1, $$2, $$7, $$9, $$3);
            }
            if ($$9 == null) continue;
            $$6.add($$9);
            $$5.add($$7);
        }
        for (fjn $$11 : $$3.i()) {
            $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
        }
        return $$6;
    }

    private void a(dxf $$0, is $$1, eev $$2, egm $$3, is $$4, @Nullable ffg $$52, boolean $$6, bgp $$7) {
        for (e $$8 : this.n) {
            is $$9 = fjq.a($$8.b, $$2, $$3, $$4).a($$1);
            if ($$52 != null && !$$52.b($$9)) continue;
            uz $$10 = $$8.c.l();
            ftm $$11 = fjq.a($$8.a, $$2, $$3, $$4);
            ftm $$12 = $$11.b($$1.u(), $$1.v(), $$1.w());
            vf $$13 = new vf();
            $$13.add(va.a($$12.g));
            $$13.add(va.a($$12.h));
            $$13.add(va.a($$12.i));
            $$10.a("Pos", $$13);
            $$10.r("UUID");
            fjq.a($$7, $$0, $$10).ifPresent($$5 -> {
                float $$6 = $$5.a($$3);
                $$5.b($$2.g, $$2.h, $$2.i, $$6 += $$5.a($$2) - $$5.ec(), $$5.ee());
                $$5.s($$6);
                $$5.r($$6);
                if ($$6 && $$5 instanceof chn) {
                    chn $$7 = (chn)$$5;
                    $$7.a($$0, $$0.c(is.a($$12)), cgt.d, null);
                }
                $$0.a_((cgk)$$5);
            });
        }
    }

    private static Optional<cgk> a(bgp $$0, dxf $$1, uz $$2) {
        try {
            return cgu.a(fno.a($$0, (jf.a)$$1.J_(), $$2), (dwo)$$1.a(), cgt.d);
        }
        catch (Exception $$3) {
            return Optional.empty();
        }
    }

    public jy a(egm $$0) {
        switch ($$0) {
            case d: 
            case b: {
                return new jy(this.o.w(), this.o.v(), this.o.u());
            }
        }
        return this.o;
    }

    public static is a(is $$0, eev $$1, egm $$2, is $$3) {
        int $$4 = $$0.u();
        int $$5 = $$0.v();
        int $$6 = $$0.w();
        boolean $$7 = true;
        switch ($$1) {
            case b: {
                $$6 = -$$6;
                break;
            }
            case c: {
                $$4 = -$$4;
                break;
            }
            default: {
                $$7 = false;
            }
        }
        int $$8 = $$3.u();
        int $$9 = $$3.w();
        switch ($$2) {
            case c: {
                return new is($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
            }
            case d: {
                return new is($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
            }
            case b: {
                return new is($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
            }
        }
        return $$7 ? new is($$4, $$5, $$6) : $$0;
    }

    public static ftm a(ftm $$0, eev $$1, egm $$2, is $$3) {
        double $$4 = $$0.g;
        double $$5 = $$0.h;
        double $$6 = $$0.i;
        boolean $$7 = true;
        switch ($$1) {
            case b: {
                $$6 = 1.0 - $$6;
                break;
            }
            case c: {
                $$4 = 1.0 - $$4;
                break;
            }
            default: {
                $$7 = false;
            }
        }
        int $$8 = $$3.u();
        int $$9 = $$3.w();
        switch ($$2) {
            case c: {
                return new ftm((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
            }
            case d: {
                return new ftm((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
            }
            case b: {
                return new ftm((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
            }
        }
        return $$7 ? new ftm($$4, $$5, $$6) : $$0;
    }

    public is a(is $$0, eev $$1, egm $$2) {
        return fjq.a($$0, $$1, $$2, this.a().u(), this.a().w());
    }

    public static is a(is $$0, eev $$1, egm $$2, int $$3, int $$4) {
        int $$5 = $$1 == eev.c ? --$$3 : 0;
        int $$6 = $$1 == eev.b ? --$$4 : 0;
        is $$7 = $$0;
        switch ($$2) {
            case a: {
                $$7 = $$0.b($$5, 0, $$6);
                break;
            }
            case b: {
                $$7 = $$0.b($$4 - $$6, 0, $$5);
                break;
            }
            case c: {
                $$7 = $$0.b($$3 - $$5, 0, $$4 - $$6);
                break;
            }
            case d: {
                $$7 = $$0.b($$6, 0, $$3 - $$5);
            }
        }
        return $$7;
    }

    public ffg b(fjm $$0, is $$1) {
        return this.a($$1, $$0.d(), $$0.e(), $$0.c());
    }

    public ffg a(is $$0, egm $$1, is $$2, eev $$3) {
        return fjq.a($$0, $$1, $$2, $$3, this.o);
    }

    @VisibleForTesting
    protected static ffg a(is $$0, egm $$1, is $$2, eev $$3, jy $$4) {
        jy $$5 = $$4.c(-1, -1, -1);
        is $$6 = fjq.a(is.c, $$3, $$1, $$2);
        is $$7 = fjq.a(is.c.a($$5), $$3, $$1, $$2);
        return ffg.a((jy)$$6, (jy)$$7).a((jy)$$0);
    }

    public uz a(uz $$0) {
        if (this.m.isEmpty()) {
            $$0.a(d, new vf());
            $$0.a(a, new vf());
        } else {
            ArrayList $$1 = Lists.newArrayList();
            c $$2 = new c();
            $$1.add($$2);
            for (int $$3 = 1; $$3 < this.m.size(); ++$$3) {
                $$1.add(new c());
            }
            vf $$4 = new vf();
            List<d> $$5 = this.m.get(0).b();
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                d $$7 = $$5.get($$6);
                uz $$8 = new uz();
                $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
                int $$9 = $$2.a($$7.b);
                $$8.a(f, $$9);
                if ($$7.c != null) {
                    $$8.a("nbt", $$7.c);
                }
                $$4.add($$8);
                for (int $$10 = 1; $$10 < this.m.size(); ++$$10) {
                    c $$11 = (c)$$1.get($$10);
                    $$11.a(this.m.get((int)$$10).b().get((int)$$6).b, $$9);
                }
            }
            $$0.a(d, $$4);
            if ($$1.size() == 1) {
                vf $$12 = new vf();
                for (eoh $$13 : $$2) {
                    $$12.add(vo.a($$13));
                }
                $$0.a(a, $$12);
            } else {
                vf $$14 = new vf();
                for (c $$15 : $$1) {
                    vf $$16 = new vf();
                    for (eoh $$17 : $$15) {
                        $$16.add(vo.a($$17));
                    }
                    $$14.add($$16);
                }
                $$0.a(b, $$14);
            }
        }
        vf $$18 = new vf();
        for (e $$19 : this.n) {
            uz $$20 = new uz();
            $$20.a("pos", this.a($$19.a.g, $$19.a.h, $$19.a.i));
            $$20.a(i, this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
            if ($$19.c != null) {
                $$20.a("nbt", $$19.c);
            }
            $$18.add($$20);
        }
        $$0.a(c, $$18);
        $$0.a(k, this.a(this.o.u(), this.o.v(), this.o.w()));
        return vo.e($$0);
    }

    public void a(je<dzq> $$02, uz $$1) {
        this.m.clear();
        this.n.clear();
        vf $$2 = $$1.p(k);
        this.o = new jy($$2.a(0, 0), $$2.a(1, 0), $$2.a(2, 0));
        vf $$3 = $$1.p(d);
        Optional<vf> $$4 = $$1.o(b);
        if ($$4.isPresent()) {
            for (int $$5 = 0; $$5 < $$4.get().size(); ++$$5) {
                this.a($$02, $$4.get().f($$5), $$3);
            }
        } else {
            this.a($$02, $$1.p(a), $$3);
        }
        $$1.p(c).j().forEach($$0 -> {
            vf $$1 = $$0.p("pos");
            ftm $$22 = new ftm($$1.a(0, 0.0), $$1.a(1, 0.0), $$1.a(2, 0.0));
            vf $$3 = $$0.p(i);
            is $$4 = new is($$3.a(0, 0), $$3.a(1, 0), $$3.a(2, 0));
            $$0.m("nbt").ifPresent($$2 -> this.n.add(new e($$22, $$4, (uz)$$2)));
        });
    }

    private void a(je<dzq> $$0, vf $$1, vf $$2) {
        c $$3 = new c();
        for (int $$42 = 0; $$42 < $$1.size(); ++$$42) {
            $$3.a(vo.a($$0, $$1.b($$42)), $$42);
        }
        ArrayList $$5 = Lists.newArrayList();
        ArrayList $$6 = Lists.newArrayList();
        ArrayList $$7 = Lists.newArrayList();
        $$2.j().forEach($$4 -> {
            vf $$5 = $$4.p("pos");
            is $$6 = new is($$5.a(0, 0), $$5.a(1, 0), $$5.a(2, 0));
            eoh $$7 = $$3.a($$4.b(f, 0));
            uz $$8 = $$4.m("nbt").orElse(null);
            d $$9 = new d($$6, $$7, $$8);
            fjq.a($$9, $$5, $$6, $$7);
        });
        List<d> $$8 = fjq.a($$5, $$6, $$7);
        this.m.add(new b($$8));
    }

    private vf a(int ... $$0) {
        vf $$1 = new vf();
        for (int $$2 : $$0) {
            $$1.add(ve.a($$2));
        }
        return $$1;
    }

    private vf a(double ... $$0) {
        vf $$1 = new vf();
        for (double $$2 : $$0) {
            $$1.add(va.a($$2));
        }
        return $$1;
    }

    public static emg.a a(uz $$0, eoh $$1) {
        return $$0.a("joint", emg.a.c).orElseGet(() -> fjq.a($$1));
    }

    public static emg.a a(eoh $$0) {
        return edz.p($$0).o().d() ? emg.a.b : emg.a.a;
    }

    public static final class d
    extends Record {
        final is a;
        final eoh b;
        final @Nullable uz c;

        public d(is $$0, eoh $$1, @Nullable uz $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public String toString() {
            return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "pos;state;nbt", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "pos;state;nbt", "a", "b", "c"}, this, $$0);
        }

        public is a() {
            return this.a;
        }

        public eoh b() {
            return this.b;
        }

        public @Nullable uz c() {
            return this.c;
        }
    }

    public static final class b {
        private final List<d> a;
        private final Map<dzq, List<d>> b = Maps.newHashMap();
        private @Nullable List<a> c;

        b(List<d> $$0) {
            this.a = $$0;
        }

        public List<a> a() {
            if (this.c == null) {
                this.c = this.a(dzs.pZ).stream().map(a::a).toList();
            }
            return this.c;
        }

        public List<d> b() {
            return this.a;
        }

        public List<d> a(dzq $$02) {
            return this.b.computeIfAbsent($$02, $$0 -> this.a.stream().filter($$1 -> $$1.b.a((dzq)$$0)).collect(Collectors.toList()));
        }
    }

    public static class e {
        public final ftm a;
        public final is b;
        public final uz c;

        public e(ftm $$0, is $$1, uz $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }

    public static final class a
    extends Record {
        final d a;
        private final emg.a b;
        private final amo c;
        private final amt<fgy> d;
        private final amo e;
        private final int f;
        private final int g;

        public a(d $$0, emg.a $$1, amo $$2, amt<fgy> $$3, amo $$4, int $$5, int $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        public static a a(d $$0) {
            uz $$1 = Objects.requireNonNull($$0.c(), () -> String.valueOf($$0) + " nbt was null");
            return new a($$0, fjq.a($$1, $$0.b()), $$1.a("name", amo.a).orElse(emg.b), $$1.a("pool", emg.a).orElse(qy.a), $$1.a("target", amo.a).orElse(emg.b), $$1.b("placement_priority", 0), $$1.b("selection_priority", 0));
        }

        @Override
        public String toString() {
            return String.format(Locale.ROOT, "<JigsawBlockInfo | %s | %s | name: %s | pool: %s | target: %s | placement: %d | selection: %d | %s>", this.a.a, this.a.b, this.c, this.d.a(), this.e, this.f, this.g, this.a.c);
        }

        public a b(d $$0) {
            return new a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "info;jointType;name;pool;target;placementPriority;selectionPriority", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "info;jointType;name;pool;target;placementPriority;selectionPriority", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public d a() {
            return this.a;
        }

        public emg.a b() {
            return this.b;
        }

        public amo c() {
            return this.c;
        }

        public amt<fgy> d() {
            return this.d;
        }

        public amo e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public int g() {
            return this.g;
        }
    }

    static class c
    implements Iterable<eoh> {
        public static final eoh a = dzs.a.m();
        private final jj<eoh> b = new jj(16);
        private int c;

        c() {
        }

        public int a(eoh $$0) {
            int $$1 = this.b.a($$0);
            if ($$1 == -1) {
                $$1 = this.c++;
                this.b.a($$0, $$1);
            }
            return $$1;
        }

        public @Nullable eoh a(int $$0) {
            eoh $$1 = this.b.a($$0);
            return $$1 == null ? a : $$1;
        }

        @Override
        public Iterator<eoh> iterator() {
            return this.b.iterator();
        }

        public void a(eoh $$0, int $$1) {
            this.b.a($$0, $$1);
        }
    }
}

