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
import java.util.List;
import java.util.Optional;

public final class asp
extends Record
implements asf {
    private final ash h;
    private final List<ase> i;
    private final Optional<ase> j;
    private final int k;
    public static final MapCodec<asp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ash.a.forGetter(asp::A_), (App)bfm.b(ase.a.listOf()).fieldOf("actions").forGetter(asp::e), (App)ase.a.optionalFieldOf("exit_action").forGetter(asp::c), (App)bfm.r.optionalFieldOf("columns", (Object)2).forGetter(asp::b)).apply((Applicative)$$0, asp::new));

    public asp(ash $$0, List<ase> $$1, Optional<ase> $$2, int $$3) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.k = $$3;
    }

    public MapCodec<asp> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asp.class, "common;actions;exitAction;columns", "h", "i", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asp.class, "common;actions;exitAction;columns", "h", "i", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asp.class, "common;actions;exitAction;columns", "h", "i", "j", "k"}, this, $$0);
    }

    @Override
    public ash A_() {
        return this.h;
    }

    public List<ase> e() {
        return this.i;
    }

    @Override
    public Optional<ase> c() {
        return this.j;
    }

    @Override
    public int b() {
        return this.k;
    }
}

