/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public final class dnr
extends Record
implements doc,
dpe {
    private final Optional<jd<dnp>> e;
    private final Optional<Integer> f;
    private final List<cfm> g;
    private final Optional<String> h;
    public static final dnr a = new dnr(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
    private static final yh i = yh.c("effect.none").a(l.h);
    public static final int b = -13083194;
    private static final Codec<dnr> j = RecordCodecBuilder.create($$0 -> $$0.group((App)dnp.a.optionalFieldOf("potion").forGetter(dnr::e), (App)Codec.INT.optionalFieldOf("custom_color").forGetter(dnr::f), (App)cfm.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dnr::d), (App)Codec.STRING.optionalFieldOf("custom_name").forGetter(dnr::g)).apply((Applicative)$$0, dnr::new));
    public static final Codec<dnr> c = Codec.withAlternative(j, dnp.a, dnr::new);
    public static final aao<xq, dnr> d = aao.a(dnp.b.a(aam::a), dnr::e, aam.g.a(aam::a), dnr::f, cfm.e.a(aam.a()), dnr::d, aam.p.a(aam::a), dnr::g, dnr::new);

    public dnr(jd<dnp> $$0) {
        this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
    }

    public dnr(Optional<jd<dnp>> $$0, Optional<Integer> $$1, List<cfm> $$2, Optional<String> $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
    }

    public static dlt a(dlp $$0, jd<dnp> $$1) {
        dlt $$2 = new dlt($$0);
        $$2.b(ki.Y, new dnr($$1));
        return $$2;
    }

    public boolean a(jd<dnp> $$0) {
        return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
    }

    public Iterable<cfm> a() {
        if (this.e.isEmpty()) {
            return this.g;
        }
        if (this.g.isEmpty()) {
            return this.e.get().a().a();
        }
        return Iterables.concat(this.e.get().a().a(), this.g);
    }

    public void a(Consumer<cfm> $$0, float $$1) {
        if (this.e.isPresent()) {
            for (cfm $$2 : this.e.get().a().a()) {
                $$0.accept($$2.a($$1));
            }
        }
        for (cfm $$3 : this.g) {
            $$0.accept($$3.a($$1));
        }
    }

    public dnr b(jd<dnp> $$0) {
        return new dnr(Optional.of($$0), this.f, this.g, this.h);
    }

    public dnr a(cfm $$0) {
        return new dnr(this.e, this.f, bhs.a(this.g, $$0), this.h);
    }

    public int b() {
        return this.a(-13083194);
    }

    public int a(int $$0) {
        if (this.f.isPresent()) {
            return this.f.get();
        }
        return dnr.a(this.a()).orElse($$0);
    }

    public yh a(String $$0) {
        String $$1 = this.h.or(() -> this.e.map($$0 -> ((dnp)$$0.a()).b())).orElse("empty");
        return yh.c($$0 + $$1);
    }

    public static OptionalInt a(Iterable<cfm> $$0) {
        int $$1 = 0;
        int $$2 = 0;
        int $$3 = 0;
        int $$4 = 0;
        for (cfm $$5 : $$0) {
            if (!$$5.g()) continue;
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * bel.c($$6);
            $$2 += $$7 * bel.d($$6);
            $$3 += $$7 * bel.e($$6);
            $$4 += $$7;
        }
        if ($$4 == 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(bel.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
    }

    public boolean c() {
        if (!this.g.isEmpty()) {
            return true;
        }
        return this.e.isPresent() && !this.e.get().a().a().isEmpty();
    }

    public List<cfm> d() {
        return Lists.transform(this.g, cfm::new);
    }

    /*
     * WARNING - void declaration
     */
    public void a(chl $$0, float $$1) {
        void $$3;
        ddm $$4;
        dwo dwo2 = $$0.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$2 = (axf)dwo2;
        ddm $$5 = $$0 instanceof ddm ? ($$4 = (ddm)$$0) : null;
        this.a(arg_0 -> dnr.a((axf)$$3, $$5, $$0, arg_0), $$1);
    }

    public static void a(Iterable<cfm> $$0, Consumer<yh> $$12, float $$22, float $$3) {
        ArrayList $$4 = Lists.newArrayList();
        boolean $$5 = true;
        for (cfm $$6 : $$0) {
            $$5 = false;
            jd<cfk> $$7 = $$6.c();
            int $$8 = $$6.e();
            $$7.a().a($$8, ($$1, $$2) -> $$4.add(new Pair($$1, $$2)));
            yw $$9 = dnr.a($$7, $$8);
            if (!$$6.a(20)) {
                $$9 = yh.a("potion.withDuration", $$9, cfn.a($$6, $$22, $$3));
            }
            $$12.accept($$9.a($$7.a().h().a()));
        }
        if ($$5) {
            $$12.accept(i);
        }
        if (!$$4.isEmpty()) {
            $$12.accept(yg.a);
            $$12.accept(yh.c("potion.whenDrank").a(l.f));
            for (Pair $$10 : $$4) {
                double $$14;
                ciq $$11 = (ciq)$$10.getSecond();
                double $$122 = $$11.b();
                if ($$11.c() == ciq.a.b || $$11.c() == ciq.a.c) {
                    double $$13 = $$11.b() * 100.0;
                } else {
                    $$14 = $$11.b();
                }
                if ($$122 > 0.0) {
                    $$12.accept(yh.a("attribute.modifier.plus." + $$11.c().a(), new Object[]{don.d.format($$14), yh.c(((cin)((jd)$$10.getFirst()).a()).c())}).a(l.j));
                    continue;
                }
                if (!($$122 < 0.0)) continue;
                $$12.accept(yh.a("attribute.modifier.take." + $$11.c().a(), new Object[]{don.d.format($$14 *= -1.0), yh.c(((cin)((jd)$$10.getFirst()).a()).c())}).a(l.m));
            }
        }
    }

    public static yw a(jd<cfk> $$0, int $$1) {
        yw $$2 = yh.c($$0.a().f());
        if ($$1 > 0) {
            return yh.a("potion.withAmplifier", $$2, yh.c("potion.potency." + $$1));
        }
        return $$2;
    }

    @Override
    public void a(dwo $$0, chl $$1, dlt $$2, dob $$3) {
        this.a($$1, $$2.a(ki.Z, Float.valueOf(1.0f)).floatValue());
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        dnr.a(this.a(), $$1, $$3.a(ki.Z, Float.valueOf(1.0f)).floatValue(), $$0.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnr.class, "potion;customColor;customEffects;customName", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnr.class, "potion;customColor;customEffects;customName", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnr.class, "potion;customColor;customEffects;customName", "e", "f", "g", "h"}, this, $$0);
    }

    public Optional<jd<dnp>> e() {
        return this.e;
    }

    public Optional<Integer> f() {
        return this.f;
    }

    public Optional<String> g() {
        return this.h;
    }

    private static /* synthetic */ void a(axf $$0, ddm $$1, chl $$2, cfm $$3) {
        if ($$3.c().a().a()) {
            $$3.c().a().a($$0, $$1, $$1, $$2, $$3.e(), 1.0);
        } else {
            $$2.a($$3);
        }
    }
}

