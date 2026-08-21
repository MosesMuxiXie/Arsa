/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class euy
extends Record {
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    public static final Codec<euy> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.intRange((int)esh.e, (int)esh.d).fieldOf("min_y").forGetter(euy::c), (App)Codec.intRange((int)0, (int)esh.c).fieldOf("height").forGetter(euy::d), (App)Codec.intRange((int)1, (int)4).fieldOf("size_horizontal").forGetter(euy::e), (App)Codec.intRange((int)1, (int)4).fieldOf("size_vertical").forGetter(euy::f)).apply((Applicative)$$0, euy::new)).comapFlatMap(euy::a, Function.identity());
    protected static final euy b = euy.a(-64, 384, 1, 2);
    protected static final euy c = euy.a(0, 128, 1, 2);
    protected static final euy d = euy.a(0, 128, 2, 1);
    protected static final euy e = euy.a(-64, 192, 1, 2);
    protected static final euy f = euy.a(0, 256, 2, 1);

    public euy(int $$0, int $$1, int $$2, int $$3) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.j = $$3;
    }

    private static DataResult<euy> a(euy $$0) {
        if ($$0.c() + $$0.d() > esh.d + 1) {
            return DataResult.error(() -> "min_y + height cannot be higher than: " + (esh.d + 1));
        }
        if ($$0.d() % 16 != 0) {
            return DataResult.error(() -> "height has to be a multiple of 16");
        }
        if ($$0.c() % 16 != 0) {
            return DataResult.error(() -> "min_y has to be a multiple of 16");
        }
        return DataResult.success((Object)$$0);
    }

    public static euy a(int $$02, int $$1, int $$2, int $$3) {
        euy $$4 = new euy($$02, $$1, $$2, $$3);
        euy.a($$4).error().ifPresent($$0 -> {
            throw new IllegalStateException($$0.message());
        });
        return $$4;
    }

    public int a() {
        return jo.c(this.f());
    }

    public int b() {
        return jo.c(this.e());
    }

    public euy a(dwq $$0) {
        int $$1 = Math.max(this.g, $$0.K_());
        int $$2 = Math.min(this.g + this.h, $$0.aw() + 1) - $$1;
        return new euy($$1, $$2, this.i, this.j);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{euy.class, "minY;height;noiseSizeHorizontal;noiseSizeVertical", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{euy.class, "minY;height;noiseSizeHorizontal;noiseSizeVertical", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{euy.class, "minY;height;noiseSizeHorizontal;noiseSizeVertical", "g", "h", "i", "j"}, this, $$0);
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }
}

