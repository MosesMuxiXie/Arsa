/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dto
extends Record
implements dtj {
    private final dsv c;
    public static final MapCodec<dto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("chance").forGetter(dto::b)).apply((Applicative)$$0, dto::new));

    public dto(dsv $$0) {
        this.c = $$0;
    }

    @Override
    public float a(int $$0, bgr $$1, float $$2) {
        float $$3 = this.c.a($$0);
        int $$4 = 0;
        if ($$2 <= 128.0f || $$2 * $$3 < 20.0f || $$2 * (1.0f - $$3) < 20.0f) {
            int $$5 = 0;
            while ((float)$$5 < $$2) {
                if ($$1.i() < $$3) {
                    ++$$4;
                }
                ++$$5;
            }
        } else {
            double $$6 = Math.floor($$2 * $$3);
            double $$7 = Math.sqrt($$2 * $$3 * (1.0f - $$3));
            $$4 = (int)Math.round($$6 + $$1.k() * $$7);
            $$4 = Math.clamp((long)$$4, 0, (int)$$2);
        }
        return $$2 - (float)$$4;
    }

    public MapCodec<dto> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dto.class, "chance", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dto.class, "chance", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dto.class, "chance", "c"}, this, $$0);
    }

    public dsv b() {
        return this.c;
    }
}

