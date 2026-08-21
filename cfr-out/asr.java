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

public final class asr
extends Record
implements asf {
    private final ash h;
    private final Optional<ase> i;
    private final int j;
    private final int k;
    public static final MapCodec<asr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ash.a.forGetter(asr::A_), (App)ase.a.optionalFieldOf("exit_action").forGetter(asr::c), (App)bfm.r.optionalFieldOf("columns", (Object)2).forGetter(asr::b), (App)b.optionalFieldOf("button_width", (Object)150).forGetter(asr::e)).apply((Applicative)$$0, asr::new));

    public asr(ash $$0, Optional<ase> $$1, int $$2, int $$3) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.k = $$3;
    }

    public MapCodec<asr> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asr.class, "common;exitAction;columns;buttonWidth", "h", "i", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asr.class, "common;exitAction;columns;buttonWidth", "h", "i", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asr.class, "common;exitAction;columns;buttonWidth", "h", "i", "j", "k"}, this, $$0);
    }

    @Override
    public ash A_() {
        return this.h;
    }

    @Override
    public Optional<ase> c() {
        return this.i;
    }

    @Override
    public int b() {
        return this.j;
    }

    public int e() {
        return this.k;
    }
}

