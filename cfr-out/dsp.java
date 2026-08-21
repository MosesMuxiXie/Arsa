/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dsp {
    public static final Codec<kh<?>> a = Codec.lazyInitialized(() -> mi.ar.q());
    public static final Codec<kf> b = kf.a(a);
    public static final kh<List<dsl<dtj>>> c = dsp.a("damage_protection", $$0 -> $$0.a(dsl.a(dtj.b, fqw.v).listOf()));
    public static final kh<List<dsl<dtf>>> d = dsp.a("damage_immunity", $$0 -> $$0.a(dsl.a(dtf.b, fqw.v).listOf()));
    public static final kh<List<dsl<dtj>>> e = dsp.a("damage", $$0 -> $$0.a(dsl.a(dtj.b, fqw.v).listOf()));
    public static final kh<List<dsl<dtj>>> f = dsp.a("smash_damage_per_fallen_block", $$0 -> $$0.a(dsl.a(dtj.b, fqw.v).listOf()));
    public static final kh<List<dsl<dtj>>> g = dsp.a("knockback", $$0 -> $$0.a(dsl.a(dtj.b, fqw.v).listOf()));
    public static final kh<List<dsl<dtj>>> h = dsp.a("armor_effectiveness", $$0 -> $$0.a(dsl.a(dtj.b, fqw.v).listOf()));
    public static final kh<List<dsx<dth>>> i = dsp.a("post_attack", $$0 -> $$0.a(dsx.a(dth.b, fqw.v).listOf()));
    public static final kh<List<dsl<dth>>> j = dsp.a("post_piercing_attack", $$0 -> $$0.a(dsl.a(dth.b, fqw.v).listOf()));
    public static final kh<List<dsl<dth>>> k = dsp.a("hit_block", $$0 -> $$0.a(dsl.a(dth.b, fqw.z).listOf()));
    public static final kh<List<dsl<dtj>>> l = dsp.a("item_damage", $$0 -> $$0.a(dsl.a(dtj.b, fqw.w).listOf()));
    public static final kh<List<dtg>> m = dsp.a("attributes", $$0 -> $$0.a(dtg.a.codec().listOf()));
    public static final kh<List<dsx<dtj>>> n = dsp.a("equipment_drops", $$0 -> $$0.a(dsx.b(dtj.b, fqw.v).listOf()));
    public static final kh<List<dsl<dti>>> o = dsp.a("location_changed", $$0 -> $$0.a(dsl.a(dti.c, fqw.x).listOf()));
    public static final kh<List<dsl<dth>>> p = dsp.a("tick", $$0 -> $$0.a(dsl.a(dth.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> q = dsp.a("ammo_use", $$0 -> $$0.a(dsl.a(dtj.b, fqw.w).listOf()));
    public static final kh<List<dsl<dtj>>> r = dsp.a("projectile_piercing", $$0 -> $$0.a(dsl.a(dtj.b, fqw.w).listOf()));
    public static final kh<List<dsl<dth>>> s = dsp.a("projectile_spawned", $$0 -> $$0.a(dsl.a(dth.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> t = dsp.a("projectile_spread", $$0 -> $$0.a(dsl.a(dtj.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> u = dsp.a("projectile_count", $$0 -> $$0.a(dsl.a(dtj.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> v = dsp.a("trident_return_acceleration", $$0 -> $$0.a(dsl.a(dtj.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> w = dsp.a("fishing_time_reduction", $$0 -> $$0.a(dsl.a(dtj.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> x = dsp.a("fishing_luck_bonus", $$0 -> $$0.a(dsl.a(dtj.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> y = dsp.a("block_experience", $$0 -> $$0.a(dsl.a(dtj.b, fqw.w).listOf()));
    public static final kh<List<dsl<dtj>>> z = dsp.a("mob_experience", $$0 -> $$0.a(dsl.a(dtj.b, fqw.y).listOf()));
    public static final kh<List<dsl<dtj>>> A = dsp.a("repair_with_xp", $$0 -> $$0.a(dsl.a(dtj.b, fqw.w).listOf()));
    public static final kh<dtj> B = dsp.a("crossbow_charge_time", $$0 -> $$0.a(dtj.b));
    public static final kh<List<dkm.b>> C = dsp.a("crossbow_charging_sounds", $$0 -> $$0.a(dkm.b.a.listOf()));
    public static final kh<List<jd<bcz>>> D = dsp.a("trident_sound", $$0 -> $$0.a(bcz.b.listOf()));
    public static final kh<bhr> E = dsp.a("prevent_equipment_drop", $$0 -> $$0.a(bhr.b));
    public static final kh<bhr> F = dsp.a("prevent_armor_change", $$0 -> $$0.a(bhr.b));
    public static final kh<dtj> G = dsp.a("trident_spin_attack_strength", $$0 -> $$0.a(dtj.b));

    public static kh<?> a(jq<kh<?>> $$0) {
        return c;
    }

    private static <T> kh<T> a(String $$0, UnaryOperator<kh.a<T>> $$1) {
        return jq.a(mi.ar, $$0, ((kh.a)$$1.apply(kh.a())).b());
    }
}

