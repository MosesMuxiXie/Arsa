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

public class blw
extends bqx {
    public static final Map<String, String> a = ImmutableMap.builder().put((Object)"minecraft:illager_beast_spawn_egg", (Object)"minecraft:ravager_spawn_egg").build();

    public blw(Schema $$0, boolean $$1) {
        super("EntityRavagerRenameFix", $$0, $$1);
    }

    @Override
    protected String a(String $$0) {
        return Objects.equals("minecraft:illager_beast", $$0) ? "minecraft:ravager" : $$0;
    }
}

