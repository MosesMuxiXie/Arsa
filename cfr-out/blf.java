/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.schemas.Schema
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class blf
extends bqx {
    public static final Map<String, String> a = ImmutableMap.builder().put((Object)"minecraft:salmon_mob", (Object)"minecraft:salmon").put((Object)"minecraft:cod_mob", (Object)"minecraft:cod").build();
    public static final Map<String, String> b = ImmutableMap.builder().put((Object)"minecraft:salmon_mob_spawn_egg", (Object)"minecraft:salmon_spawn_egg").put((Object)"minecraft:cod_mob_spawn_egg", (Object)"minecraft:cod_spawn_egg").build();

    public blf(Schema $$0, boolean $$1) {
        super("EntityCodSalmonFix", $$0, $$1);
    }

    @Override
    protected String a(String $$0) {
        return a.getOrDefault($$0, $$0);
    }
}

