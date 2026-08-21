/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;

public class bmi
extends bih {
    private static final Logger b = LogUtils.getLogger();
    private static final Set<String> c = Sets.newHashSet();
    private static final Set<String> d = Sets.newHashSet();
    private static final Set<String> e = Sets.newHashSet();
    private static final Set<String> f = Sets.newHashSet();
    private static final Set<String> g = Sets.newHashSet();
    private static final Set<String> h = Sets.newHashSet();

    public bmi(Schema $$0) {
        super($$0, bqh.H);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.a), $$0 -> {
            $$0 = $$0.update(DSL.remainderFinder(), bmi::c);
            for (String $$1 : c) {
                $$0 = this.a((Typed<?>)$$0, $$1, bmi::l);
            }
            for (String $$2 : d) {
                $$0 = this.a((Typed<?>)$$0, $$2, bmi::l);
            }
            for (String $$3 : e) {
                $$0 = this.a((Typed<?>)$$0, $$3, bmi::m);
            }
            for (String $$4 : f) {
                $$0 = this.a((Typed<?>)$$0, $$4, bmi::n);
            }
            for (String $$5 : g) {
                $$0 = this.a((Typed<?>)$$0, $$5, bmi::b);
            }
            for (String $$6 : h) {
                $$0 = this.a((Typed<?>)$$0, $$6, bmi::o);
            }
            $$0 = this.a((Typed<?>)$$0, "minecraft:bee", bmi::k);
            $$0 = this.a((Typed<?>)$$0, "minecraft:zombified_piglin", bmi::k);
            $$0 = this.a((Typed<?>)$$0, "minecraft:fox", bmi::j);
            $$0 = this.a((Typed<?>)$$0, "minecraft:item", bmi::i);
            $$0 = this.a((Typed<?>)$$0, "minecraft:shulker_bullet", bmi::h);
            $$0 = this.a((Typed<?>)$$0, "minecraft:area_effect_cloud", bmi::g);
            $$0 = this.a((Typed<?>)$$0, "minecraft:zombie_villager", bmi::f);
            $$0 = this.a((Typed<?>)$$0, "minecraft:evoker_fangs", bmi::e);
            $$0 = this.a((Typed<?>)$$0, "minecraft:piglin", bmi::d);
            return $$0;
        });
    }

    private static Dynamic<?> d(Dynamic<?> $$02) {
        return $$02.update("Brain", $$0 -> $$0.update("memories", $$02 -> $$02.update("minecraft:angry_at", $$0 -> bmi.a($$0, "value", "value").orElseGet(() -> {
            b.warn("angry_at has no value.");
            return $$0;
        }))));
    }

    private static Dynamic<?> e(Dynamic<?> $$0) {
        return bmi.c($$0, "OwnerUUID", "Owner").orElse($$0);
    }

    private static Dynamic<?> f(Dynamic<?> $$0) {
        return bmi.c($$0, "ConversionPlayer", "ConversionPlayer").orElse($$0);
    }

    private static Dynamic<?> g(Dynamic<?> $$0) {
        return bmi.c($$0, "OwnerUUID", "Owner").orElse($$0);
    }

    private static Dynamic<?> h(Dynamic<?> $$0) {
        $$0 = bmi.b($$0, "Owner", "Owner").orElse($$0);
        return bmi.b($$0, "Target", "Target").orElse($$0);
    }

    private static Dynamic<?> i(Dynamic<?> $$0) {
        $$0 = bmi.b($$0, "Owner", "Owner").orElse($$0);
        return bmi.b($$0, "Thrower", "Thrower").orElse($$0);
    }

    private static Dynamic<?> j(Dynamic<?> $$0) {
        Optional<Dynamic> $$12 = $$0.get("TrustedUUIDs").result().map($$1 -> $$0.createList($$1.asStream().map($$0 -> bmi.a($$0).orElseGet(() -> {
            b.warn("Trusted contained invalid data.");
            return $$0;
        }))));
        return (Dynamic)DataFixUtils.orElse($$12.map($$1 -> $$0.remove("TrustedUUIDs").set("Trusted", $$1)), $$0);
    }

    private static Dynamic<?> k(Dynamic<?> $$0) {
        return bmi.a($$0, "HurtBy", "HurtBy").orElse($$0);
    }

    private static Dynamic<?> l(Dynamic<?> $$0) {
        Dynamic<?> $$1 = bmi.m($$0);
        return bmi.a($$1, "OwnerUUID", "Owner").orElse($$1);
    }

    private static Dynamic<?> m(Dynamic<?> $$0) {
        Dynamic<?> $$1 = bmi.n($$0);
        return bmi.c($$1, "LoveCause", "LoveCause").orElse($$1);
    }

    private static Dynamic<?> n(Dynamic<?> $$02) {
        return bmi.b($$02).update("Leash", $$0 -> bmi.c($$0, "UUID", "UUID").orElse((Dynamic<?>)$$0));
    }

    public static Dynamic<?> b(Dynamic<?> $$0) {
        return $$0.update("Attributes", $$1 -> $$0.createList($$1.asStream().map($$0 -> $$0.update("Modifiers", $$1 -> $$0.createList($$1.asStream().map($$0 -> bmi.c($$0, "UUID", "UUID").orElse((Dynamic<?>)$$0)))))));
    }

    private static Dynamic<?> o(Dynamic<?> $$0) {
        return (Dynamic)DataFixUtils.orElse($$0.get("OwnerUUID").result().map($$1 -> $$0.remove("OwnerUUID").set("Owner", $$1)), $$0);
    }

    public static Dynamic<?> c(Dynamic<?> $$0) {
        return bmi.c($$0, "UUID", "UUID").orElse($$0);
    }

    static {
        c.add("minecraft:donkey");
        c.add("minecraft:horse");
        c.add("minecraft:llama");
        c.add("minecraft:mule");
        c.add("minecraft:skeleton_horse");
        c.add("minecraft:trader_llama");
        c.add("minecraft:zombie_horse");
        d.add("minecraft:cat");
        d.add("minecraft:parrot");
        d.add("minecraft:wolf");
        e.add("minecraft:bee");
        e.add("minecraft:chicken");
        e.add("minecraft:cow");
        e.add("minecraft:fox");
        e.add("minecraft:mooshroom");
        e.add("minecraft:ocelot");
        e.add("minecraft:panda");
        e.add("minecraft:pig");
        e.add("minecraft:polar_bear");
        e.add("minecraft:rabbit");
        e.add("minecraft:sheep");
        e.add("minecraft:turtle");
        e.add("minecraft:hoglin");
        f.add("minecraft:bat");
        f.add("minecraft:blaze");
        f.add("minecraft:cave_spider");
        f.add("minecraft:cod");
        f.add("minecraft:creeper");
        f.add("minecraft:dolphin");
        f.add("minecraft:drowned");
        f.add("minecraft:elder_guardian");
        f.add("minecraft:ender_dragon");
        f.add("minecraft:enderman");
        f.add("minecraft:endermite");
        f.add("minecraft:evoker");
        f.add("minecraft:ghast");
        f.add("minecraft:giant");
        f.add("minecraft:guardian");
        f.add("minecraft:husk");
        f.add("minecraft:illusioner");
        f.add("minecraft:magma_cube");
        f.add("minecraft:pufferfish");
        f.add("minecraft:zombified_piglin");
        f.add("minecraft:salmon");
        f.add("minecraft:shulker");
        f.add("minecraft:silverfish");
        f.add("minecraft:skeleton");
        f.add("minecraft:slime");
        f.add("minecraft:snow_golem");
        f.add("minecraft:spider");
        f.add("minecraft:squid");
        f.add("minecraft:stray");
        f.add("minecraft:tropical_fish");
        f.add("minecraft:vex");
        f.add("minecraft:villager");
        f.add("minecraft:iron_golem");
        f.add("minecraft:vindicator");
        f.add("minecraft:pillager");
        f.add("minecraft:wandering_trader");
        f.add("minecraft:witch");
        f.add("minecraft:wither");
        f.add("minecraft:wither_skeleton");
        f.add("minecraft:zombie");
        f.add("minecraft:zombie_villager");
        f.add("minecraft:phantom");
        f.add("minecraft:ravager");
        f.add("minecraft:piglin");
        g.add("minecraft:armor_stand");
        h.add("minecraft:arrow");
        h.add("minecraft:dragon_fireball");
        h.add("minecraft:firework_rocket");
        h.add("minecraft:fireball");
        h.add("minecraft:llama_spit");
        h.add("minecraft:small_fireball");
        h.add("minecraft:snowball");
        h.add("minecraft:spectral_arrow");
        h.add("minecraft:egg");
        h.add("minecraft:ender_pearl");
        h.add("minecraft:experience_bottle");
        h.add("minecraft:potion");
        h.add("minecraft:trident");
        h.add("minecraft:wither_skull");
    }
}

