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
import java.util.Optional;

public final class ati
extends Record
implements atg {
    private final int c;
    private final yh d;
    private final String e;
    private final a f;
    public static final MapCodec<ati> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)asj.b.optionalFieldOf("width", (Object)200).forGetter(ati::b), (App)yj.a.fieldOf("label").forGetter(ati::c), (App)Codec.STRING.optionalFieldOf("label_format", (Object)"options.generic_value").forGetter(ati::d), (App)ati$a.a.forGetter(ati::e)).apply((Applicative)$$0, ati::new));

    public ati(int $$0, yh $$1, String $$2, a $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public MapCodec<ati> a() {
        return a;
    }

    public yh a(String $$0) {
        return yh.a(this.e, this.d, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ati.class, "width;label;labelFormat;rangeInfo", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ati.class, "width;label;labelFormat;rangeInfo", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ati.class, "width;label;labelFormat;rangeInfo", "c", "d", "e", "f"}, this, $$0);
    }

    public int b() {
        return this.c;
    }

    public yh c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public a e() {
        return this.f;
    }

    public record a(float b, float c, Optional<Float> d, Optional<Float> e) {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("start").forGetter(a::b), (App)Codec.FLOAT.fieldOf("end").forGetter(a::c), (App)Codec.FLOAT.optionalFieldOf("initial").forGetter(a::d), (App)bfm.v.optionalFieldOf("step").forGetter(a::e)).apply((Applicative)$$0, a::new)).validate($$0 -> {
            if ($$0.d.isPresent()) {
                double $$1 = $$0.d.get().floatValue();
                double $$2 = Math.min($$0.b, $$0.c);
                double $$3 = Math.max($$0.b, $$0.c);
                if ($$1 < $$2 || $$1 > $$3) {
                    return DataResult.error(() -> "Initial value " + $$1 + " is outside of range [" + $$2 + ", " + $$3 + "]");
                }
            }
            return DataResult.success((Object)$$0);
        });

        public float a(float $$0) {
            float $$4;
            int $$5;
            float $$1 = bgj.h($$0, this.b, this.c);
            if (this.e.isEmpty()) {
                return $$1;
            }
            float $$2 = this.e.get().floatValue();
            float $$3 = this.f();
            float $$6 = $$3 + (float)($$5 = Math.round(($$4 = $$1 - $$3) / $$2)) * $$2;
            if (!this.b($$6)) {
                return $$6;
            }
            int $$7 = $$5 - bgj.m($$5);
            return $$3 + (float)$$7 * $$2;
        }

        private boolean b(float $$0) {
            float $$1 = this.c($$0);
            return (double)$$1 < 0.0 || (double)$$1 > 1.0;
        }

        private float f() {
            if (this.d.isPresent()) {
                return this.d.get().floatValue();
            }
            return (this.b + this.c) / 2.0f;
        }

        public float a() {
            float $$0 = this.f();
            return this.c($$0);
        }

        private float c(float $$0) {
            if (this.b == this.c) {
                return 0.5f;
            }
            return bgj.f($$0, this.b, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "start;end;initial;step", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "start;end;initial;step", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "start;end;initial;step", "b", "c", "d", "e"}, this, $$0);
        }
    }
}

