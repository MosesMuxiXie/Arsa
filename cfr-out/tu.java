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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class tu<EnvironmentType>
extends Record {
    private final EnvironmentType b;
    private final amo c;
    private final int d;
    private final int e;
    private final boolean f;
    private final egm g;
    private final boolean h;
    private final int i;
    private final int j;
    private final boolean k;
    public static final MapCodec<tu<jd<tv>>> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)tv.b.fieldOf("environment").forGetter(tu::a), (App)amo.a.fieldOf("structure").forGetter(tu::b), (App)bfm.r.fieldOf("max_ticks").forGetter(tu::c), (App)bfm.q.optionalFieldOf("setup_ticks", (Object)0).forGetter(tu::d), (App)Codec.BOOL.optionalFieldOf("required", (Object)true).forGetter(tu::e), (App)egm.f.optionalFieldOf("rotation", (Object)egm.a).forGetter(tu::f), (App)Codec.BOOL.optionalFieldOf("manual_only", (Object)false).forGetter(tu::g), (App)bfm.r.optionalFieldOf("max_attempts", (Object)1).forGetter(tu::h), (App)bfm.r.optionalFieldOf("required_successes", (Object)1).forGetter(tu::i), (App)Codec.BOOL.optionalFieldOf("sky_access", (Object)false).forGetter(tu::j)).apply((Applicative)$$0, tu::new));

    public tu(EnvironmentType $$0, amo $$1, int $$2, int $$3, boolean $$4, egm $$5) {
        this($$0, $$1, $$2, $$3, $$4, $$5, false, 1, 1, false);
    }

    public tu(EnvironmentType $$0, amo $$1, int $$2, int $$3, boolean $$4) {
        this($$0, $$1, $$2, $$3, $$4, egm.a);
    }

    public tu(EnvironmentType $$0, amo $$1, int $$2, int $$3, boolean $$4, egm $$5, boolean $$6, int $$7, int $$8, boolean $$9) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
    }

    public <T> tu<T> a(Function<EnvironmentType, T> $$0) {
        return new tu<T>($$0.apply(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tu.class, "environment;structure;maxTicks;setupTicks;required;rotation;manualOnly;maxAttempts;requiredSuccesses;skyAccess", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tu.class, "environment;structure;maxTicks;setupTicks;required;rotation;manualOnly;maxAttempts;requiredSuccesses;skyAccess", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tu.class, "environment;structure;maxTicks;setupTicks;required;rotation;manualOnly;maxAttempts;requiredSuccesses;skyAccess", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this, $$0);
    }

    public EnvironmentType a() {
        return this.b;
    }

    public amo b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public egm f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }
}

