/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ikh
implements ikd {
    private final hhm a;
    private final float b;
    private final ijs c;

    public ikh(hhm $$0, float $$1, ijs $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        hsa.a(null, 180.0f, this.b, $$1, $$2, $$3, this.a, this.c, $$6, null);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        $$1.a(0.5f, 0.0f, 0.5f);
        $$1.b(-1.0f, -1.0f, 1.0f);
        hhm.a $$2 = new hhm.a();
        $$2.a = this.b;
        $$2.b = 180.0f;
        this.a.a($$2);
        this.a.b().a($$1, $$0);
    }

    public record a(ehh.a b, Optional<amo> c, float d) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ehh.a.b.fieldOf("kind").forGetter(a::b), (App)amo.a.optionalFieldOf("texture").forGetter(a::c), (App)Codec.FLOAT.optionalFieldOf("animation", (Object)Float.valueOf(0.0f)).forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(ehh.a $$0) {
            this($$0, Optional.empty(), 0.0f);
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public @Nullable iki<?> a(iki.a $$0) {
            hhm $$1 = hsa.a($$0.b(), this.b);
            amo $$2 = this.c.map($$02 -> $$02.a($$0 -> "textures/entity/" + $$0 + ".png")).orElse(null);
            if ($$1 == null) {
                return null;
            }
            ijs $$3 = hsa.a(this.b, $$2);
            return new ikh($$1, this.d, $$3);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "kind;textureOverride;animation", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "kind;textureOverride;animation", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "kind;textureOverride;animation", "b", "c", "d"}, this, $$0);
        }
    }
}

