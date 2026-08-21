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
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import org.joml.Vector3fc;

public class ikg
implements ikd {
    private final hry a;
    private final float b;
    private final iz c;
    private final ins d;

    public ikg(hry $$0, float $$1, iz $$2, ins $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        this.a.a($$1, $$2, $$3, $$4, this.c, this.b, null, this.d, $$6);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        this.a.a(this.c, this.b, $$0);
    }

    public record a(amo b, float c, iz d) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("texture").forGetter(a::b), (App)Codec.FLOAT.optionalFieldOf("openness", (Object)Float.valueOf(0.0f)).forGetter(a::c), (App)iz.g.optionalFieldOf("orientation", iz.b).forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a() {
            this(amo.b("shulker"), 0.0f, iz.b);
        }

        public a(dkr $$0) {
            this(hpj.e($$0), 0.0f, iz.b);
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ikg(new hry($$0), this.c, this.d, hpj.u.a(this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "texture;openness;orientation", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "texture;openness;orientation", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "texture;openness;orientation", "b", "c", "d"}, this, $$0);
        }
    }
}

