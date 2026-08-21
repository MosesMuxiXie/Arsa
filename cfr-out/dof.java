/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public final class dof
extends Record {
    private final List<Float> d;
    private final List<Boolean> e;
    private final List<String> f;
    private final List<Integer> g;
    public static final dof a = new dof(List.of(), List.of(), List.of(), List.of());
    public static final Codec<dof> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(dof::a), (App)Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(dof::b), (App)Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(dof::c), (App)bfm.l.listOf().optionalFieldOf("colors", List.of()).forGetter(dof::d)).apply((Applicative)$$0, dof::new));
    public static final aao<ByteBuf, dof> c = aao.a(aam.l.a(aam.a()), dof::a, aam.b.a(aam.a()), dof::b, aam.p.a(aam.a()), dof::c, aam.g.a(aam.a()), dof::d, dof::new);

    public dof(List<Float> $$0, List<Boolean> $$1, List<String> $$2, List<Integer> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    private static <T> @Nullable T a(List<T> $$0, int $$1) {
        if ($$1 < 0 || $$1 >= $$0.size()) {
            return null;
        }
        return $$0.get($$1);
    }

    public @Nullable Float a(int $$0) {
        return dof.a(this.d, $$0);
    }

    public @Nullable Boolean b(int $$0) {
        return dof.a(this.e, $$0);
    }

    public @Nullable String c(int $$0) {
        return dof.a(this.f, $$0);
    }

    public @Nullable Integer d(int $$0) {
        return dof.a(this.g, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dof.class, "floats;flags;strings;colors", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dof.class, "floats;flags;strings;colors", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dof.class, "floats;flags;strings;colors", "d", "e", "f", "g"}, this, $$0);
    }

    public List<Float> a() {
        return this.d;
    }

    public List<Boolean> b() {
        return this.e;
    }

    public List<String> c() {
        return this.f;
    }

    public List<Integer> d() {
        return this.g;
    }
}

