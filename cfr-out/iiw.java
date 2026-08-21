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

public class iiw
extends iit
implements iiv {
    public static final MapCodec<iiw> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.optionalFieldOf("wobble", (Object)true).forGetter(iit::b), (App)iiw$a.d.fieldOf("source").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, iiw::new));
    private final a b;
    private final bgr c = bgr.a();
    private final iit.a d;

    public iiw(boolean $$0, a $$1) {
        super($$0);
        this.b = $$1;
        this.d = this.a(0.9f);
    }

    @Override
    protected float a(dlt $$0, hif $$1, int $$2, chh $$3) {
        float $$4 = this.b.a($$1, $$0, $$3, this.c);
        long $$5 = $$1.au();
        if (this.d.a($$5)) {
            this.d.a($$5, $$4);
        }
        return this.d.a();
    }

    public MapCodec<iiw> a() {
        return a;
    }

    public static abstract sealed class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("random"){

            @Override
            public float a(hif $$0, dlt $$1, chh $$2, bgr $$3) {
                return $$3.i();
            }
        };
        public static final /* enum */ a b = new a("daytime"){

            @Override
            public float a(hif $$0, dlt $$1, chh $$2, bgr $$3) {
                return $$0.c().a(ceg.m, $$2.dI()).floatValue() / 360.0f;
            }
        };
        public static final /* enum */ a c = new a("moon_phase"){

            @Override
            public float a(hif $$0, dlt $$1, chh $$2, bgr $$3) {
                return (float)$$0.c().a(ceg.p, $$2.dI()).a() / (float)dwy.j;
            }
        };
        public static final Codec<a> d;
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.e = $$0;
        }

        @Override
        public String c() {
            return this.e;
        }

        abstract float a(hif var1, dlt var2, chh var3, bgr var4);

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = iiw$a.a();
            d = bhh.a(a::values);
        }
    }
}

