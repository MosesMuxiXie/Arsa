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
import java.util.Optional;

public final class ase
extends Record {
    private final asg b;
    private final Optional<ast> c;
    public static final Codec<ase> a = RecordCodecBuilder.create($$0 -> $$0.group((App)asg.b.forGetter(ase::a), (App)ast.a.optionalFieldOf("action").forGetter(ase::b)).apply((Applicative)$$0, ase::new));

    public ase(asg $$0, Optional<ast> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ase.class, "button;action", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ase.class, "button;action", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ase.class, "button;action", "b", "c"}, this, $$0);
    }

    public asg a() {
        return this.b;
    }

    public Optional<ast> b() {
        return this.c;
    }
}

