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

public final class asi
extends Record
implements ass {
    private final ash h;
    private final ase i;
    private final ase j;
    public static final MapCodec<asi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ash.a.forGetter(asi::A_), (App)ase.a.fieldOf("yes").forGetter(asi::e), (App)ase.a.fieldOf("no").forGetter(asi::f)).apply((Applicative)$$0, asi::new));

    public asi(ash $$0, ase $$1, ase $$2) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
    }

    public MapCodec<asi> a() {
        return a;
    }

    @Override
    public Optional<ast> d() {
        return this.j.b();
    }

    @Override
    public List<ase> b() {
        return List.of(this.i, this.j);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asi.class, "common;yesButton;noButton", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asi.class, "common;yesButton;noButton", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asi.class, "common;yesButton;noButton", "h", "i", "j"}, this, $$0);
    }

    @Override
    public ash A_() {
        return this.h;
    }

    public ase e() {
        return this.i;
    }

    public ase f() {
        return this.j;
    }
}

