/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class fbx
extends Record {
    private final fcd b;
    private final float c;
    public static final Codec<fbx> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("above_root_provider").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("above_root_placement_chance").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, fbx::new));

    public fbx(fcd $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fbx.class, "aboveRootProvider;aboveRootPlacementChance", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fbx.class, "aboveRootProvider;aboveRootPlacementChance", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fbx.class, "aboveRootProvider;aboveRootPlacementChance", "b", "c"}, this, $$0);
    }

    public fcd a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

