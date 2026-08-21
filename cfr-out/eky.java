/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class eky
extends elb {
    static final Logger c = LogUtils.getLogger();
    private static final String d = "flower_pos";
    private static final String e = "bees";
    static final List<String> f = Arrays.asList("Air", "drop_chances", "equipment", "Brain", "CanPickUpLoot", "DeathTime", "fall_distance", "FallFlying", "Fire", "HurtByTimestamp", "HurtTime", "LeftHanded", "Motion", "NoGravity", "OnGround", "PortalCooldown", "Pos", "Rotation", "sleeping_pos", "CannotEnterHiveTicks", "TicksSincePollination", "CropsGrownSincePollination", "hive_pos", "Passengers", "leash", "UUID");
    public static final int a = 3;
    private static final int g = 400;
    private static final int h = 2400;
    public static final int b = 600;
    private final List<a> i = Lists.newArrayList();
    private @Nullable is j;

    public eky(is $$0, eoh $$1) {
        super(eld.I, $$0, $$1);
    }

    @Override
    public void e() {
        if (this.a()) {
            this.a(null, this.n.a_(this.aD_()), eky$b.c);
        }
        super.e();
    }

    public boolean a() {
        if (this.n == null) {
            return false;
        }
        for (is $$0 : is.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (!(this.n.a_($$0).b() instanceof ecv)) continue;
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.i.isEmpty();
    }

    public boolean d() {
        return this.i.size() == 3;
    }

    public void a(@Nullable ddm $$0, eoh $$1, b $$2) {
        List<cgk> $$3 = this.a($$1, $$2);
        if ($$0 != null) {
            for (cgk $$4 : $$3) {
                if (!($$4 instanceof ctw)) continue;
                ctw $$5 = (ctw)$$4;
                if (!($$0.dI().g($$4.dI()) <= 16.0)) continue;
                if (!this.h()) {
                    $$5.g($$0);
                    continue;
                }
                $$5.s(400);
            }
        }
    }

    private List<cgk> a(eoh $$0, b $$1) {
        ArrayList $$2 = Lists.newArrayList();
        this.i.removeIf($$3 -> eky.a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
        if (!$$2.isEmpty()) {
            super.e();
        }
        return $$2;
    }

    @bht
    public int f() {
        return this.i.size();
    }

    public static int a(eoh $$0) {
        return $$0.c(dzk.c);
    }

    @bht
    public boolean h() {
        return eag.a(this.n, this.aD_());
    }

    public void a(ctw $$0) {
        if (this.i.size() >= 3) {
            return;
        }
        $$0.cf();
        $$0.ce();
        $$0.o();
        this.a(eky$c.a($$0));
        if (this.n != null) {
            if ($$0.gP() && (!this.k() || this.n.y.h())) {
                this.j = $$0.p();
            }
            is $$1 = this.aD_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), bda.ch, bdb.e, 1.0f, 1.0f);
            this.n.a(etk.c, $$1, etk.a.a($$0, this.o()));
        }
        $$0.aC();
        super.e();
    }

    public void a(c $$0) {
        this.i.add(new a($$0));
    }

    private static boolean a(dwo $$02, is $$1, eoh $$2, c $$3, @Nullable List<cgk> $$4, b $$5, @Nullable is $$6) {
        boolean $$9;
        if ($$02.c().a(ceg.O, $$1).booleanValue() && $$5 != eky$b.c) {
            return false;
        }
        iz $$7 = $$2.c(dzk.b);
        is $$8 = $$1.a($$7);
        boolean bl2 = $$9 = !$$02.a_($$8).g($$02, $$8).c();
        if ($$9 && $$5 != eky$b.c) {
            return false;
        }
        cgk $$10 = $$3.a($$02, $$1);
        if ($$10 != null) {
            if ($$10 instanceof ctw) {
                ctw $$11 = (ctw)$$10;
                if ($$6 != null && !$$11.gP() && $$02.y.i() < 0.9f) {
                    $$11.h($$6);
                }
                if ($$5 == eky$b.a) {
                    int $$12;
                    $$11.hg();
                    if ($$2.a(bdp.aU, (eog.a $$0) -> $$0.b(dzk.c)) && ($$12 = eky.a($$2)) < 5) {
                        int $$13;
                        int n2 = $$13 = $$02.y.a(100) == 0 ? 2 : 1;
                        if ($$12 + $$13 > 5) {
                            --$$13;
                        }
                        $$02.c($$1, (eoh)$$2.b(dzk.c, $$12 + $$13));
                    }
                }
                if ($$4 != null) {
                    $$4.add($$11);
                }
                float $$14 = $$10.dF();
                double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0f);
                double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dG() / 2.0f);
                double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                $$10.b($$16, $$17, $$18, $$10.ec(), $$10.ee());
            }
            $$02.a(null, $$1, bda.ci, bdb.e, 1.0f, 1.0f);
            $$02.a(etk.c, $$1, etk.a.a($$10, $$02.a_($$1)));
            return $$02.b($$10);
        }
        return false;
    }

    private boolean k() {
        return this.j != null;
    }

    private static void a(dwo $$0, is $$1, eoh $$2, List<a> $$3, @Nullable is $$4) {
        boolean $$5 = false;
        Iterator<a> $$6 = $$3.iterator();
        while ($$6.hasNext()) {
            b $$8;
            a $$7 = $$6.next();
            if (!$$7.a()) continue;
            b b2 = $$8 = $$7.c() ? eky$b.a : eky$b.b;
            if (!eky.a($$0, $$1, $$2, $$7.b(), null, $$8, $$4)) continue;
            $$5 = true;
            $$6.remove();
        }
        if ($$5) {
            eky.a($$0, $$1, $$2);
        }
    }

    public static void a(dwo $$0, is $$1, eoh $$2, eky $$3) {
        eky.a($$0, $$1, $$2, $$3.i, $$3.j);
        if (!$$3.i.isEmpty() && $$0.G_().j() < 0.005) {
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = $$1.v();
            double $$6 = (double)$$1.w() + 0.5;
            $$0.a(null, $$4, $$5, $$6, bda.ck, bdb.e, 1.0f, 1.0f);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.i.clear();
        $$0.a(e, eky$c.b).orElse(List.of()).forEach(this::a);
        this.j = $$0.a(d, is.a).orElse(null);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(e, eky$c.b, this.l());
        $$0.b(d, is.a, this.j);
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.i.clear();
        List<c> $$1 = $$0.a(ki.ay, dnv.c).a();
        $$1.forEach(this::a);
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.ay, new dnv(this.l()));
    }

    @Override
    public void b(fns $$0) {
        super.b($$0);
        $$0.c(e);
    }

    private List<c> l() {
        return this.i.stream().map(a::b).toList();
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
        $$1.a(bxf.h, () -> bxa.a(this));
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = eky$b.a();
        }
    }

    public static final class c
    extends Record {
        final dpf<cgu<?>> d;
        private final int e;
        final int f;
        public static final Codec<c> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dpf.a(cgu.a).fieldOf("entity_data").forGetter(c::a), (App)Codec.INT.fieldOf("ticks_in_hive").forGetter(c::b), (App)Codec.INT.fieldOf("min_ticks_in_hive").forGetter(c::c)).apply((Applicative)$$0, c::new));
        public static final Codec<List<c>> b = a.listOf();
        public static final aao<xq, c> c = aao.a(dpf.a(cgu.b), c::a, aam.h, c::b, aam.h, c::c, c::new);

        public c(dpf<cgu<?>> $$0, int $$1, int $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        public static c a(cgk $$0) {
            try (bgp.j $$1 = new bgp.j($$0.es(), c);){
                fnp $$2 = fnp.a($$1, $$0.eo());
                $$0.c($$2);
                f.forEach($$2::c);
                uz $$3 = $$2.b();
                boolean $$4 = $$3.b("HasNectar", false);
                c c2 = new c(dpf.a($$0.ay(), $$3), 0, $$4 ? 2400 : 600);
                return c2;
            }
        }

        public static c a(int $$0) {
            return new c(dpf.a(cgu.n, new uz()), $$0, 600);
        }

        public @Nullable cgk a(dwo $$0, is $$1) {
            uz $$2 = this.d.c();
            f.forEach($$2::r);
            cgk $$3 = cgu.a(this.d.a(), $$2, $$0, cgt.r, cgq.a);
            if ($$3 == null || !$$3.ay().a(bdt.f)) {
                return null;
            }
            $$3.g(true);
            if ($$3 instanceof ctw) {
                ctw $$4 = (ctw)$$3;
                $$4.i($$1);
                eky$c.a(this.e, $$4);
            }
            return $$3;
        }

        private static void a(int $$0, ctw $$1) {
            int $$2 = $$1.Z_();
            if ($$2 < 0) {
                $$1.d_(Math.min(0, $$2 + $$0));
            } else if ($$2 > 0) {
                $$1.d_(Math.max(0, $$2 - $$0));
            }
            $$1.r(Math.max(0, $$1.gZ() - $$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "entityData;ticksInHive;minTicksInHive", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "entityData;ticksInHive;minTicksInHive", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "entityData;ticksInHive;minTicksInHive", "d", "e", "f"}, this, $$0);
        }

        public dpf<cgu<?>> a() {
            return this.d;
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }
    }

    static class a {
        private final c a;
        private int b;

        a(c $$0) {
            this.a = $$0;
            this.b = $$0.b();
        }

        public boolean a() {
            return this.b++ > this.a.f;
        }

        public c b() {
            return new c(this.a.d, this.b, this.a.f);
        }

        public boolean c() {
            return this.a.d.b().b("HasNectar", false);
        }
    }
}

