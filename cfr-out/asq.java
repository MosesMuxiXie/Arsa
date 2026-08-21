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

public final class asq
extends Record
implements ass {
    private final ash i;
    private final ase j;
    public static final ase a = new ase(new asg(yg.h, 150), Optional.empty());
    public static final MapCodec<asq> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ash.a.forGetter(asq::A_), (App)ase.a.optionalFieldOf("action", (Object)a).forGetter(asq::e)).apply((Applicative)$$0, asq::new));

    public asq(ash $$0, ase $$1) {
        this.i = $$0;
        this.j = $$1;
    }

    public MapCodec<asq> a() {
        return h;
    }

    @Override
    public Optional<ast> d() {
        return this.j.b();
    }

    @Override
    public List<ase> b() {
        return List.of(this.j);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asq.class, "common;action", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asq.class, "common;action", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asq.class, "common;action", "i", "j"}, this, $$0);
    }

    @Override
    public ash A_() {
        return this.i;
    }

    public ase e() {
        return this.j;
    }
}

