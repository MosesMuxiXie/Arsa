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

public final class fau
extends Record
implements fac {
    private final fcd b;
    private final boolean c;
    public static final Codec<fau> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("to_place").forGetter($$0 -> $$0.b), (App)Codec.BOOL.optionalFieldOf("schedule_tick", (Object)false).forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fau::new));

    public fau(fcd $$0) {
        this($$0, false);
    }

    public fau(fcd $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fau.class, "toPlace;scheduleTick", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fau.class, "toPlace;scheduleTick", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fau.class, "toPlace;scheduleTick", "b", "c"}, this, $$0);
    }

    public fcd a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }
}

