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

public final class asl
extends Record
implements asf {
    private final ash h;
    private final jh<asj> i;
    private final Optional<ase> j;
    private final int k;
    private final int l;
    public static final MapCodec<asl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ash.a.forGetter(asl::A_), (App)asj.e.fieldOf("dialogs").forGetter(asl::e), (App)ase.a.optionalFieldOf("exit_action").forGetter(asl::c), (App)bfm.r.optionalFieldOf("columns", (Object)2).forGetter(asl::b), (App)b.optionalFieldOf("button_width", (Object)150).forGetter(asl::f)).apply((Applicative)$$0, asl::new));

    public asl(ash $$0, jh<asj> $$1, Optional<ase> $$2, int $$3, int $$4) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.k = $$3;
        this.l = $$4;
    }

    public MapCodec<asl> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asl.class, "common;dialogs;exitAction;columns;buttonWidth", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asl.class, "common;dialogs;exitAction;columns;buttonWidth", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asl.class, "common;dialogs;exitAction;columns;buttonWidth", "h", "i", "j", "k", "l"}, this, $$0);
    }

    @Override
    public ash A_() {
        return this.h;
    }

    public jh<asj> e() {
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

    public int f() {
        return this.l;
    }
}

