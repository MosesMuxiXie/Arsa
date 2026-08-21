/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3fc
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import org.joml.Vector3fc;

public class ijx
implements ikd {
    private final hrf a;
    private final ins b;

    public ijx(hrf $$0, ins $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        this.a.a($$1, $$2, $$3, $$4, this.b, $$6);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        this.a.a($$0);
    }

    public record a(amo b) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("texture").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(dkr $$0) {
            this(hpj.b($$0));
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ijx(new hrf($$0), hpj.t.a(this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "texture", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "texture", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "texture", "b"}, this, $$0);
        }
    }
}

