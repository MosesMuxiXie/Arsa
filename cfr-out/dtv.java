/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dtv
extends Record
implements dth {
    private final lw d;
    private final a e;
    private final a f;
    private final c g;
    private final c h;
    private final ccf i;
    public static final MapCodec<dtv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ly.bl.fieldOf("particle").forGetter(dtv::c), (App)dtv$a.a.fieldOf("horizontal_position").forGetter(dtv::d), (App)dtv$a.a.fieldOf("vertical_position").forGetter(dtv::e), (App)c.a.fieldOf("horizontal_velocity").forGetter(dtv::f), (App)c.a.fieldOf("vertical_velocity").forGetter(dtv::g), (App)ccf.c.optionalFieldOf("speed", (Object)ccd.a).forGetter(dtv::h)).apply((Applicative)$$0, dtv::new));

    public dtv(lw $$0, a $$1, a $$2, c $$3, c $$4, ccf $$5) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
    }

    public static a a(float $$0) {
        return new a(b.a, $$0, 1.0f);
    }

    public static a b() {
        return new a(b.b, 0.0f, 1.0f);
    }

    public static c b(float $$0) {
        return new c($$0, ccd.a);
    }

    public static c a(ccf $$0) {
        return new c(0.0f, $$0);
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        bgr $$5 = $$3.ep();
        ftm $$6 = $$3.ag();
        float $$7 = $$3.dF();
        float $$8 = $$3.dG();
        $$0.a(this.d, this.e.a($$4.a(), $$4.a(), $$7, $$5), this.f.a($$4.b(), $$4.b() + (double)($$8 / 2.0f), $$8, $$5), this.e.a($$4.c(), $$4.c(), $$7, $$5), 0, this.g.a($$6.a(), $$5), this.h.a($$6.b(), $$5), this.g.a($$6.c(), $$5), (double)this.i.a($$5));
    }

    public MapCodec<dtv> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtv.class, "particle;horizontalPosition;verticalPosition;horizontalVelocity;verticalVelocity;speed", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtv.class, "particle;horizontalPosition;verticalPosition;horizontalVelocity;verticalVelocity;speed", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtv.class, "particle;horizontalPosition;verticalPosition;horizontalVelocity;verticalVelocity;speed", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public lw c() {
        return this.d;
    }

    public a d() {
        return this.e;
    }

    public a e() {
        return this.f;
    }

    public c f() {
        return this.g;
    }

    public c g() {
        return this.h;
    }

    public ccf h() {
        return this.i;
    }

    public static final class a
    extends Record {
        private final b b;
        private final float c;
        private final float d;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dtv$b.c.fieldOf("type").forGetter(a::a), (App)Codec.FLOAT.optionalFieldOf("offset", (Object)Float.valueOf(0.0f)).forGetter(a::b), (App)bfm.v.optionalFieldOf("scale", (Object)Float.valueOf(1.0f)).forGetter(a::c)).apply((Applicative)$$0, a::new)).validate($$0 -> {
            if ($$0.a() == dtv$b.a && $$0.c() != 1.0f) {
                return DataResult.error(() -> "Cannot scale an entity position coordinate source");
            }
            return DataResult.success((Object)$$0);
        });

        public a(b $$0, float $$1, float $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public double a(double $$0, double $$1, float $$2, bgr $$3) {
            return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;offset;scale", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;offset;scale", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;offset;scale", "b", "c", "d"}, this, $$0);
        }

        public b a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }

        public float c() {
            return this.d;
        }
    }

    public static final class c
    extends Record {
        private final float b;
        private final ccf c;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.optionalFieldOf("movement_scale", (Object)Float.valueOf(0.0f)).forGetter(c::a), (App)ccf.c.optionalFieldOf("base", (Object)ccd.a).forGetter(c::b)).apply((Applicative)$$0, c::new));

        public c(float $$0, ccf $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public double a(double $$0, bgr $$1) {
            return $$0 * (double)this.b + (double)this.c.a($$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "movementScale;base", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "movementScale;base", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "movementScale;base", "b", "c"}, this, $$0);
        }

        public float a() {
            return this.b;
        }

        public ccf b() {
            return this.c;
        }
    }

    public static final class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b("entity_position", ($$0, $$1, $$2, $$3) -> $$0);
        public static final /* enum */ b b = new b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);
        public static final Codec<b> c;
        private final String d;
        private final a e;
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, a $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public double a(double $$0, double $$1, float $$2, bgr $$3) {
            return this.e.getCoordinate($$0, $$1, $$2, $$3);
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            f = dtv$b.a();
            c = bhh.a(b::values);
        }

        @FunctionalInterface
        static interface a {
            public double getCoordinate(double var1, double var3, float var5, bgr var6);
        }
    }
}

