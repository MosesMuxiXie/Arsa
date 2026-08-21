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
import java.util.Optional;

public final class enp
extends Record {
    private final amt<fof> d;
    private final double e;
    private final double f;
    private final dlt g;
    private final Optional<amt<fof>> h;
    private final eng i;
    private final eng.a j;
    static final String a = "config";
    static enp b = new enp();
    static Codec<enp> c = RecordCodecBuilder.create($$0 -> $$0.group((App)fof.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(enp::b), (App)Codec.DOUBLE.lenientOptionalFieldOf("activation_range", (Object)b.c()).forGetter(enp::c), (App)Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", (Object)b.d()).forGetter(enp::d), (App)dlt.a("key_item").forGetter(enp::e), (App)fof.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(enp::f)).apply((Applicative)$$0, enp::new)).validate(enp::h);

    private enp() {
        this(fnv.R, 4.0, 4.5, new dlt(dlx.By), Optional.empty(), eng.b, eng.a.a);
    }

    public enp(amt<fof> $$0, double $$1, double $$2, dlt $$3, Optional<amt<fof>> $$4) {
        this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
    }

    public enp(amt<fof> $$0, double $$1, double $$2, dlt $$3, Optional<amt<fof>> $$4, eng $$5, eng.a $$6) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
    }

    public eng a() {
        return w.ai ? eng.c : this.i;
    }

    private DataResult<enp> h() {
        if (this.e > this.f) {
            return DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")");
        }
        return DataResult.success((Object)this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{enp.class, "lootTable;activationRange;deactivationRange;keyItem;overrideLootTableToDisplay;playerDetector;entitySelector", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{enp.class, "lootTable;activationRange;deactivationRange;keyItem;overrideLootTableToDisplay;playerDetector;entitySelector", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{enp.class, "lootTable;activationRange;deactivationRange;keyItem;overrideLootTableToDisplay;playerDetector;entitySelector", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public amt<fof> b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }

    public dlt e() {
        return this.g;
    }

    public Optional<amt<fof>> f() {
        return this.h;
    }

    public eng.a g() {
        return this.j;
    }
}

