/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ijw
implements iki<ekr> {
    private final hrd a;
    private final dkr b;

    public ijw(dkr $$0, hrd $$1) {
        this.a = $$1;
        this.b = $$0;
    }

    public @Nullable ekr a(dlt $$0) {
        return $$0.a(ki.at);
    }

    @Override
    public void a(@Nullable ekr $$0, dlr $$1, fzm $$2, hpo $$3, int $$4, int $$5, boolean $$6, int $$7) {
        this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, ekr.a), $$7);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        this.a.a($$0);
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2) {
        return this.a(dlt2);
    }

    public record a(dkr b) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ijw(this.b, new hrd($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "baseColor", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "baseColor", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "baseColor", "b"}, this, $$0);
        }
    }
}

