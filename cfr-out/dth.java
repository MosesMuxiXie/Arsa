/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dth
extends dti {
    public static final Codec<dth> b = mi.at.q().dispatch(dth::a, Function.identity());

    public static MapCodec<? extends dth> a(jq<MapCodec<? extends dth>> $$0) {
        jq.a($$0, "all_of", dsz.a.a);
        jq.a($$0, "apply_mob_effect", dtc.a);
        jq.a($$0, "change_item_damage", dtd.a);
        jq.a($$0, "damage_entity", dte.a);
        jq.a($$0, "explode", dtk.a);
        jq.a($$0, "ignite", dtl.a);
        jq.a($$0, "apply_impulse", dta.a);
        jq.a($$0, "apply_exhaustion", dtb.a);
        jq.a($$0, "play_sound", dtn.a);
        jq.a($$0, "replace_block", dtp.a);
        jq.a($$0, "replace_disk", dtq.a);
        jq.a($$0, "run_function", dtr.a);
        jq.a($$0, "set_block_properties", dtt.a);
        jq.a($$0, "spawn_particles", dtv.a);
        return jq.a($$0, "summon_entity", dtw.a);
    }

    public void a(axf var1, int var2, dsn var3, cgk var4, ftm var5);

    @Override
    default public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4, boolean $$5) {
        this.a($$0, $$1, $$2, $$3, $$4);
    }

    public MapCodec<? extends dth> a();
}

