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

public interface dti {
    public static final Codec<dti> c = mi.au.q().dispatch(dti::a, Function.identity());

    public static MapCodec<? extends dti> b(jq<MapCodec<? extends dti>> $$0) {
        jq.a($$0, "all_of", dsz.b.a);
        jq.a($$0, "apply_mob_effect", dtc.a);
        jq.a($$0, "attribute", dtg.a);
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

    public void a(axf var1, int var2, dsn var3, cgk var4, ftm var5, boolean var6);

    default public void a(dsn $$0, cgk $$1, ftm $$2, int $$3) {
    }

    public MapCodec<? extends dti> a();
}

