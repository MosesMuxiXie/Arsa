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

public class ijy
implements ikd {
    public static final amo a = amo.b("christmas");
    public static final amo b = amo.b("normal");
    public static final amo c = amo.b("trapped");
    public static final amo d = amo.b("ender");
    public static final amo e = amo.b("copper");
    public static final amo f = amo.b("copper_exposed");
    public static final amo g = amo.b("copper_weathered");
    public static final amo h = amo.b("copper_oxidized");
    private final inu i;
    private final hgv j;
    private final ins k;
    private final float l;

    public ijy(inu $$0, hgv $$1, ins $$2, float $$3) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        $$2.a(this.j, Float.valueOf(this.l), $$1, this.k.a(ijt::d), $$3, $$4, -1, this.i.a(this.k), $$6, null);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        this.j.a(Float.valueOf(this.l));
        this.j.b().a($$1, $$0);
    }

    public record a(amo b, float c) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("texture").forGetter(a::b), (App)Codec.FLOAT.optionalFieldOf("openness", (Object)Float.valueOf(0.0f)).forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(amo $$0) {
            this($$0, 0.0f);
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            hgv $$1 = new hgv($$0.b().a(hdf.X));
            ins $$2 = hpj.r.a(this.b);
            return new ijy($$0.c(), $$1, $$2, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "texture;openness", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "texture;openness", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "texture;openness", "b", "c"}, this, $$0);
        }
    }
}

