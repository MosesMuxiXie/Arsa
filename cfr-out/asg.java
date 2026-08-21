/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class asg
extends Record {
    private final yh c;
    private final Optional<yh> d;
    private final int e;
    public static final int a = 150;
    public static final MapCodec<asg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("label").forGetter(asg::a), (App)yj.a.optionalFieldOf("tooltip").forGetter(asg::b), (App)asj.b.optionalFieldOf("width", (Object)150).forGetter(asg::c)).apply((Applicative)$$0, asg::new));

    public asg(yh $$0, int $$1) {
        this($$0, Optional.empty(), $$1);
    }

    public asg(yh $$0, Optional<yh> $$1, int $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asg.class, "label;tooltip;width", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asg.class, "label;tooltip;width", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asg.class, "label;tooltip;width", "c", "d", "e"}, this, $$0);
    }

    public yh a() {
        return this.c;
    }

    public Optional<yh> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }
}

