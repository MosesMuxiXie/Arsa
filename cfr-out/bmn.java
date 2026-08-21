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

public class bmn
extends bqx {
    public static final Map<String, String> a = ImmutableMap.builder().put((Object)"minecraft:zombie_pigman_spawn_egg", (Object)"minecraft:zombified_piglin_spawn_egg").build();

    public bmn(Schema $$0) {
        super("EntityZombifiedPiglinRenameFix", $$0, true);
    }

    @Override
    protected String a(String $$0) {
        return Objects.equals("minecraft:zombie_pigman", $$0) ? "minecraft:zombified_piglin" : $$0;
    }
}

