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

public class ika
implements ikd {
    private static final iz a = iz.d;
    private final hho b;
    private final amo c;

    public ika(hho $$0, amo $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        ika.a($$1);
        $$2.a(this.b, iz.d, $$1, ijt.g(this.c), $$3, $$4, -1, null, $$6, null);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        ika.a($$1);
        this.b.a(a);
        this.b.b().a($$1, $$0);
    }

    private static void a(fzm $$0) {
        $$0.a(0.5f, 1.5f, 0.5f);
        $$0.b(-1.0f, -1.0f, 1.0f);
    }

    public record a(amo b, ebh.a c) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("texture").forGetter(a::b), (App)ebh.a.f.fieldOf("pose").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(ejq.a $$0, ebh.a $$1) {
            this(cwf.a($$0).e(), $$1);
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            hho $$1 = new hho($$0.b().a(ika$a.a(this.c)));
            return new ika($$1, this.b);
        }

        private static hde a(ebh.a $$0) {
            return switch ($$0) {
                default -> throw new MatchException(null, null);
                case ebh.a.a -> hdf.an;
                case ebh.a.b -> hdf.aq;
                case ebh.a.d -> hdf.ar;
                case ebh.a.c -> hdf.ap;
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "texture;pose", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "texture;pose", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "texture;pose", "b", "c"}, this, $$0);
        }
    }
}

