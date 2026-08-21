/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class fib
extends ffo {
    public static final MapCodec<fib> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group(fib.a($$02), (App)fib$a.c.fieldOf("biome_temp").forGetter($$0 -> $$0.e), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("large_probability").forGetter($$0 -> Float.valueOf($$0.f)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("cluster_probability").forGetter($$0 -> Float.valueOf($$0.g))).apply((Applicative)$$02, fib::new));
    public final a e;
    public final float f;
    public final float g;

    public fib(ffo.c $$0, a $$1, float $$2, float $$3) {
        super($$0);
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        return fib.a($$0, euq.a.c, $$1 -> this.a((fgg)$$1, $$0));
    }

    private void a(fgg $$0, ffo.a $$1) {
        is $$2 = new is($$1.h().e(), 90, $$1.h().f());
        egm $$3 = egm.a($$1.f());
        fia.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
    }

    @Override
    public ffx<?> e() {
        return ffx.k;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("warm");
        public static final /* enum */ a b = new a("cold");
        public static final Codec<a> c;
        @Deprecated
        public static final Codec<a> d;
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.e = $$0;
        }

        public String a() {
            return this.e;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            f = fib$a.b();
            c = bhh.a(a::values);
            d = bfm.c(a::valueOf);
        }
    }
}

