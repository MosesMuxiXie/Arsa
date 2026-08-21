/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class iin
extends iit {
    public static final MapCodec<iin> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("wobble", (Object)true).forGetter(iit::b), (App)iin$a.e.fieldOf("target").forGetter(iin::a)).apply((Applicative)$$0, iin::new));
    private final iit.a b;
    private final iit.a c;
    private final a d;
    private final bgr e = bgr.a();

    public iin(boolean $$0, a $$1) {
        super($$0);
        this.b = this.a(0.8f);
        this.c = this.a(0.8f);
        this.d = $$1;
    }

    @Override
    protected float a(dlt $$0, hif $$1, int $$2, chh $$3) {
        jc $$4 = this.d.a($$1, $$0, $$3);
        long $$5 = $$1.au();
        if (!iin.a($$3, $$4)) {
            return this.a($$2, $$5);
        }
        return this.a($$3, $$5, $$4.b());
    }

    private float a(int $$0, long $$1) {
        if (this.c.a($$1)) {
            this.c.a($$1, this.e.i());
        }
        float $$2 = this.c.a() + (float)iin.a($$0) / 2.1474836E9f;
        return bgj.c($$2, 1.0f);
    }

    private float a(chh $$0, long $$1, is $$2) {
        float $$8;
        ddm $$6;
        float $$3 = (float)iin.a($$0, $$2);
        float $$4 = iin.a($$0);
        chl $$5 = $$0.et();
        if ($$5 instanceof ddm && ($$6 = (ddm)$$5).gH() && $$6.ao().y().i()) {
            if (this.b.a($$1)) {
                this.b.a($$1, 0.5f - ($$4 - 0.25f));
            }
            float $$7 = $$3 + this.b.a();
        } else {
            $$8 = 0.5f - ($$4 - 0.25f - $$3);
        }
        return bgj.c($$8, 1.0f);
    }

    private static boolean a(chh $$0, @Nullable jc $$1) {
        return $$1 != null && $$1.a() == $$0.ao().aq() && !($$1.b().b($$0.dI()) < (double)1.0E-5f);
    }

    private static double a(chh $$0, is $$1) {
        ftm $$2 = ftm.b($$1);
        ftm $$3 = $$0.dI();
        return Math.atan2($$2.c() - $$3.c(), $$2.a() - $$3.a()) / 6.2831854820251465;
    }

    private static float a(chh $$0) {
        return bgj.c($$0.ed() / 360.0f, 1.0f);
    }

    private static int a(int $$0) {
        return $$0 * 1327217883;
    }

    protected a a() {
        return this.d;
    }

    public static abstract sealed class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("none"){

            @Override
            public @Nullable jc a(hif $$0, dlt $$1, @Nullable chh $$2) {
                return null;
            }
        };
        public static final /* enum */ a b = new a("lodestone"){

            @Override
            public @Nullable jc a(hif $$0, dlt $$1, @Nullable chh $$2) {
                dor $$3 = $$1.a(ki.ao);
                return $$3 != null ? (jc)$$3.a().orElse(null) : null;
            }
        };
        public static final /* enum */ a c = new a("spawn"){

            @Override
            public jc a(hif $$0, dlt $$1, @Nullable chh $$2) {
                return $$0.C().c();
            }
        };
        public static final /* enum */ a d = new a("recovery"){

            @Override
            public @Nullable jc a(hif $$0, dlt $$1, @Nullable chh $$2) {
                jc jc2;
                chl $$3;
                chl chl2 = $$3 = $$2 == null ? null : $$2.et();
                if ($$3 instanceof ddm) {
                    ddm $$4 = (ddm)$$3;
                    jc2 = $$4.hk().orElse(null);
                } else {
                    jc2 = null;
                }
                return jc2;
            }
        };
        public static final Codec<a> e;
        private final String f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.f = $$0;
        }

        @Override
        public String c() {
            return this.f;
        }

        abstract @Nullable jc a(hif var1, dlt var2, @Nullable chh var3);

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            g = iin$a.a();
            e = bhh.a(a::values);
        }
    }
}

