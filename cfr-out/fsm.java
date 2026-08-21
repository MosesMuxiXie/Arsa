/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public record fsm(fsi b, fsi c) implements fsi
{
    private final fsi b;
    private final fsi c;
    public static final MapCodec<fsm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fsj.a.fieldOf("min").forGetter(fsm::c), (App)fsj.a.fieldOf("max").forGetter(fsm::d)).apply((Applicative)$$0, fsm::new));

    @Override
    public fsh a() {
        return fsj.c;
    }

    public static fsm a(float $$0, float $$1) {
        return new fsm(fsf.a($$0), fsf.a($$1));
    }

    @Override
    public int a(fnz $$0) {
        return bgj.a($$0.b(), this.b.a($$0), this.c.a($$0));
    }

    @Override
    public float b(fnz $$0) {
        return bgj.a($$0.b(), this.b.b($$0), this.c.b($$0));
    }

    @Override
    public Set<bhv<?>> b() {
        return Sets.union(this.b.b(), this.c.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsm.class, "min;max", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsm.class, "min;max", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsm.class, "min;max", "b", "c"}, this, $$0);
    }

    public fsi c() {
        return this.b;
    }

    public fsi d() {
        return this.c;
    }
}

