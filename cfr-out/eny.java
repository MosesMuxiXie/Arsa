/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class eny
extends ebw {
    public static final MapCodec<eny> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("sticky").forGetter($$0 -> $$0.i), eny.x()).apply((Applicative)$$02, eny::new));
    public static final eoy c = eox.j;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    private static final Map<iz, fug> h = fud.d(dzq.c(16.0, 4.0, 16.0));
    private final boolean i;

    public MapCodec<eny> a() {
        return b;
    }

    public eny(boolean $$0, eog.d $$1) {
        super($$1);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(a, iz.c)).b(c, false));
        this.i = $$0;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        if ($$0.c(c).booleanValue()) {
            return h.get($$0.c(a));
        }
        return fud.b();
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        if (!$$0.B_()) {
            this.a($$0, $$1, $$2);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if (!$$1.B_()) {
            this.a($$1, $$2, $$0);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        if (!$$1.B_() && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
        }
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)((eoh)this.m().b(a, $$0.d().g())).b(c, false);
    }

    private void a(dwo $$0, is $$1, eoh $$2) {
        iz $$3 = (iz)$$2.c(a);
        boolean $$4 = this.a((dxg)$$0, $$1, $$3);
        if ($$4 && !$$2.c(c).booleanValue()) {
            if (new eoc($$0, $$1, $$3, true).a()) {
                $$0.a($$1, (dzq)this, 0, $$3.d());
            }
        } else if (!$$4 && $$2.c(c).booleanValue()) {
            eob $$9;
            elb $$8;
            is $$5 = $$1.a($$3, 2);
            eoh $$6 = $$0.a_($$5);
            int $$7 = 1;
            if ($$6.a(dzs.ca) && $$6.c(a) == $$3 && ($$8 = $$0.c_($$5)) instanceof eob && ($$9 = (eob)$$8).a() && ($$9.a(0.0f) < 0.5f || $$0.au() == $$9.m() || ((axf)$$0).f())) {
                $$7 = 2;
            }
            $$0.a($$1, (dzq)this, $$7, $$3.d());
        }
    }

    private boolean a(dxg $$0, is $$1, iz $$2) {
        for (iz $$3 : iz.values()) {
            if ($$3 == $$2 || !$$0.b($$1.a($$3), $$3)) continue;
            return true;
        }
        if ($$0.b($$1, iz.a)) {
            return true;
        }
        is $$4 = $$1.d();
        for (iz $$5 : iz.values()) {
            if ($$5 == iz.a || !$$0.b($$4.a($$5), $$5)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(eoh $$0, dwo $$1, is $$2, int $$3, int $$4) {
        iz $$5 = (iz)$$0.c(a);
        eoh $$6 = (eoh)$$0.b(c, true);
        if (!$$1.B_()) {
            boolean $$7 = this.a((dxg)$$1, $$2, $$5);
            if ($$7 && ($$3 == 1 || $$3 == 2)) {
                $$1.a($$2, $$6, 2);
                return false;
            }
            if (!$$7 && $$3 == 0) {
                return false;
            }
        }
        if ($$3 == 0) {
            if (!this.a($$1, $$2, $$5, true)) return false;
            $$1.a($$2, $$6, 67);
            $$1.a(null, $$2, bda.wM, bdb.e, 0.5f, $$1.y.i() * 0.25f + 0.6f);
            $$1.a(etk.a, $$2, etk.a.a($$6));
            return true;
        } else {
            if ($$3 != 1 && $$3 != 2) return true;
            elb $$8 = $$1.c_($$2.a($$5));
            if ($$8 instanceof eob) {
                ((eob)$$8).k();
            }
            eoh $$9 = (eoh)((eoh)dzs.ca.m().b(enx.b, $$5)).b(enx.c, this.i ? epj.b : epj.a);
            $$1.a($$2, $$9, 276);
            $$1.b(enx.a($$2, $$9, (eoh)this.m().b(a, iz.a($$4 & 7)), $$5, false, true));
            $$1.a($$2, $$9.b());
            $$9.a((dwp)$$1, $$2, 2);
            if (this.i) {
                eob $$14;
                elb $$13;
                is $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
                eoh $$11 = $$1.a_($$10);
                boolean $$12 = false;
                if ($$11.a(dzs.ca) && ($$13 = $$1.c_($$10)) instanceof eob && ($$14 = (eob)$$13).c() == $$5 && $$14.a()) {
                    $$14.k();
                    $$12 = true;
                }
                if (!$$12) {
                    if ($$3 == 1 && !$$11.l() && eny.a($$11, $$1, $$10, $$5.g(), false, $$5) && ($$11.r() == flg.a || $$11.a(dzs.bI) || $$11.a(dzs.by))) {
                        this.a($$1, $$2, $$5, false);
                    } else {
                        $$1.a($$2.a($$5), false);
                    }
                }
            } else {
                $$1.a($$2.a($$5), false);
            }
            $$1.a(null, $$2, bda.wL, bdb.e, 0.5f, $$1.y.i() * 0.15f + 0.6f);
            $$1.a(etk.e, $$2, etk.a.a($$9));
        }
        return true;
    }

    public static boolean a(eoh $$0, dwo $$1, is $$2, iz $$3, boolean $$4, iz $$5) {
        if ($$2.v() < $$1.K_() || $$2.v() > $$1.aw() || !$$1.w().a($$2)) {
            return false;
        }
        if ($$0.l()) {
            return true;
        }
        if ($$0.a(dzs.cK) || $$0.a(dzs.qk) || $$0.a(dzs.ql) || $$0.a(dzs.uN)) {
            return false;
        }
        if ($$3 == iz.a && $$2.v() == $$1.K_()) {
            return false;
        }
        if ($$3 == iz.b && $$2.v() == $$1.aw()) {
            return false;
        }
        if ($$0.a(dzs.bI) || $$0.a(dzs.by)) {
            if ($$0.c(c).booleanValue()) {
                return false;
            }
        } else {
            if ($$0.e($$1, $$2) == -1.0f) {
                return false;
            }
            switch ($$0.r()) {
                case c: {
                    return false;
                }
                case b: {
                    return $$4;
                }
                case e: {
                    return $$3 == $$5;
                }
            }
        }
        return !$$0.x();
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(dwo $$0, is $$1, iz $$2, boolean $$3) {
        void var16_30;
        void var16_28;
        eoc $$5;
        is $$4 = $$1.a($$2);
        if (!$$3 && $$0.a_($$4).a(dzs.bJ)) {
            $$0.a($$4, dzs.a.m(), 276);
        }
        if (!($$5 = new eoc($$0, $$1, $$2, $$3)).a()) {
            return false;
        }
        HashMap $$6 = Maps.newHashMap();
        List<is> $$7 = $$5.c();
        ArrayList $$8 = Lists.newArrayList();
        for (is $$9 : $$7) {
            eoh $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
        }
        List<is> $$11 = $$5.d();
        eoh[] $$12 = new eoh[$$7.size() + $$11.size()];
        iz $$13 = $$3 ? $$2 : $$2.g();
        int $$14 = 0;
        for (int $$15 = $$11.size() - 1; $$15 >= 0; --$$15) {
            is $$16 = $$11.get($$15);
            eoh eoh2 = $$0.a_($$16);
            elb $$18 = eoh2.x() ? $$0.c_($$16) : null;
            eny.a(eoh2, $$0, $$16, $$18);
            if (!eoh2.a(bdp.aY) && $$0.B_()) {
                $$0.c(2001, $$16, eny.j(eoh2));
            }
            $$0.a($$16, dzs.a.m(), 18);
            $$0.a(etk.f, $$16, etk.a.a(eoh2));
            $$12[$$14++] = eoh2;
        }
        for (int $$19 = $$7.size() - 1; $$19 >= 0; --$$19) {
            is $$20 = $$7.get($$19);
            eoh eoh3 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            eoh $$22 = (eoh)dzs.ca.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.b(enx.a($$20, $$22, (eoh)$$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = eoh3;
        }
        if ($$3) {
            epj $$23 = this.i ? epj.b : epj.a;
            eoh $$24 = (eoh)((eoh)dzs.bJ.m().b(enz.a, $$2)).b(enz.c, $$23);
            eoh eoh4 = (eoh)((eoh)dzs.ca.m().b(enx.b, $$2)).b(enx.c, this.i ? epj.b : epj.a);
            $$6.remove($$4);
            $$0.a($$4, eoh4, 324);
            $$0.b(enx.a($$4, eoh4, $$24, $$2, true, true));
        }
        eoh $$26 = dzs.a.m();
        for (is is2 : $$6.keySet()) {
            $$0.a(is2, $$26, 82);
        }
        for (Map.Entry entry : $$6.entrySet()) {
            is $$29 = (is)entry.getKey();
            eoh $$30 = (eoh)entry.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a((dwp)$$0, $$29, 2);
            $$26.b($$0, $$29, 2);
        }
        fmj $$31 = fmf.a($$0, $$5.b(), null);
        $$14 = 0;
        int n2 = $$11.size() - 1;
        while (var16_28 >= 0) {
            eoh $$33 = $$12[$$14++];
            is $$34 = $$11.get((int)var16_28);
            if ($$0 instanceof axf) {
                axf $$35 = (axf)$$0;
                $$33.a($$35, $$34, false);
            }
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
            --var16_28;
        }
        int n3 = $$7.size() - 1;
        while (var16_30 >= 0) {
            $$0.a($$7.get((int)var16_30), $$12[$$14++].b(), $$31);
            --var16_30;
        }
        if ($$3) {
            $$0.a($$4, dzs.bJ, $$31);
        }
        return true;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(a, $$1.a((iz)$$0.c(a)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a((iz)$$0.c(a)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, c);
    }

    @Override
    protected boolean g_(eoh $$0) {
        return $$0.c(c);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

