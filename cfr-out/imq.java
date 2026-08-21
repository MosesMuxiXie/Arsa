/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class imq
extends Record {
    private final int e;
    private final int f;
    private final List<amo> g;
    private final List<amo> h;
    @VisibleForTesting
    public static final String a = "hud/locator_bar_dot/";
    public static final int b = 128;
    public static final int c = 332;
    private static final Codec<Integer> i = Codec.intRange((int)0, (int)60000000);
    public static final Codec<imq> d = RecordCodecBuilder.create($$0 -> $$0.group((App)i.optionalFieldOf("near_distance", (Object)128).forGetter(imq::b), (App)i.optionalFieldOf("far_distance", (Object)332).forGetter(imq::c), (App)bfm.b(amo.a.listOf()).fieldOf("sprites").forGetter(imq::d)).apply((Applicative)$$0, imq::new)).validate(imq::a);

    public imq(int $$02, int $$1, List<amo> $$2) {
        this($$02, $$1, $$2, $$2.stream().map($$0 -> $$0.f(a)).toList());
    }

    public imq(int $$0, int $$1, List<amo> $$2, List<amo> $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
    }

    @VisibleForTesting
    public DataResult<imq> a() {
        if (this.g.isEmpty()) {
            return DataResult.error(() -> "Must have at least one sprite icon");
        }
        if (this.e <= 0) {
            return DataResult.error(() -> "Near distance (" + this.e + ") must be greater than zero");
        }
        if (this.e >= this.f) {
            return DataResult.error(() -> "Far distance (" + this.f + ") cannot be closer or equal to near distance (" + this.e + ")");
        }
        return DataResult.success((Object)this);
    }

    public amo a(float $$0) {
        if ($$0 < (float)this.e) {
            return this.h.getFirst();
        }
        if ($$0 >= (float)this.f) {
            return this.h.getLast();
        }
        if (this.h.size() == 1) {
            return this.h.getFirst();
        }
        if (this.h.size() == 3) {
            return this.h.get(1);
        }
        int $$1 = bgj.a(($$0 - (float)this.e) / (float)(this.f - this.e), 1, this.h.size() - 1);
        return this.h.get($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imq.class, "nearDistance;farDistance;sprites;spriteLocations", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imq.class, "nearDistance;farDistance;sprites;spriteLocations", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imq.class, "nearDistance;farDistance;sprites;spriteLocations", "e", "f", "g", "h"}, this, $$0);
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public List<amo> d() {
        return this.g;
    }

    public List<amo> e() {
        return this.h;
    }
}

