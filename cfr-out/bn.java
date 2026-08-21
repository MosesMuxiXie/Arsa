/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class bn
extends Record {
    private final Optional<jh<dso>> b;
    private final cq.d c;
    public static final Codec<bn> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.bf).optionalFieldOf("enchantments").forGetter(bn::a), (App)cq.d.d.optionalFieldOf("levels", (Object)cq.d.c).forGetter(bn::b)).apply((Applicative)$$0, bn::new));

    public bn(jd<dso> $$0, cq.d $$1) {
        this(Optional.of(jh.a($$0)), $$1);
    }

    public bn(jh<dso> $$0, cq.d $$1) {
        this(Optional.of($$0), $$1);
    }

    public bn(Optional<jh<dso>> $$0, cq.d $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public boolean a(dsu $$0) {
        if (this.b.isPresent()) {
            for (jd jd2 : this.b.get()) {
                if (!this.a($$0, jd2)) continue;
                return true;
            }
            return false;
        }
        if (this.c != cq.d.c) {
            for (Object2IntMap.Entry<jd<dso>> entry : $$0.b()) {
                if (!this.c.d(entry.getIntValue())) continue;
                return true;
            }
            return false;
        }
        return !$$0.d();
    }

    private boolean a(dsu $$0, jd<dso> $$1) {
        int $$2 = $$0.a($$1);
        if ($$2 == 0) {
            return false;
        }
        if (this.c == cq.d.c) {
            return true;
        }
        return this.c.d($$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bn.class, "enchantments;level", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bn.class, "enchantments;level", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bn.class, "enchantments;level", "b", "c"}, this, $$0);
    }

    public Optional<jh<dso>> a() {
        return this.b;
    }

    public cq.d b() {
        return this.c;
    }
}

