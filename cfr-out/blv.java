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
import java.util.Objects;

public class blv
extends bqx {
    public static final Map<String, String> a = ImmutableMap.builder().put((Object)"minecraft:puffer_fish_spawn_egg", (Object)"minecraft:pufferfish_spawn_egg").build();

    public blv(Schema $$0, boolean $$1) {
        super("EntityPufferfishRenameFix", $$0, $$1);
    }

    @Override
    protected String a(String $$0) {
        return Objects.equals("minecraft:puffer_fish", $$0) ? "minecraft:pufferfish" : $$0;
    }
}

