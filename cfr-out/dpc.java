/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class dpc
extends Record {
    private final List<a> c;
    private final float d;
    private final int e;
    private final boolean f;
    public static final Codec<dpc> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dpc$a.a.listOf().fieldOf("rules").forGetter(dpc::a), (App)Codec.FLOAT.optionalFieldOf("default_mining_speed", (Object)Float.valueOf(1.0f)).forGetter(dpc::b), (App)bfm.q.optionalFieldOf("damage_per_block", (Object)1).forGetter(dpc::c), (App)Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", (Object)true).forGetter(dpc::d)).apply((Applicative)$$0, dpc::new));
    public static final aao<xq, dpc> b = aao.a(dpc$a.b.a(aam.a()), dpc::a, aam.l, dpc::b, aam.h, dpc::c, aam.b, dpc::d, dpc::new);

    public dpc(List<a> $$0, float $$1, int $$2, boolean $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public float a(eoh $$0) {
        for (a $$1 : this.c) {
            if (!$$1.d.isPresent() || !$$0.a($$1.c)) continue;
            return $$1.d.get().floatValue();
        }
        return this.d;
    }

    public boolean b(eoh $$0) {
        for (a $$1 : this.c) {
            if (!$$1.e.isPresent() || !$$0.a($$1.c)) continue;
            return $$1.e.get();
        }
        return false;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpc.class, "rules;defaultMiningSpeed;damagePerBlock;canDestroyBlocksInCreative", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpc.class, "rules;defaultMiningSpeed;damagePerBlock;canDestroyBlocksInCreative", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpc.class, "rules;defaultMiningSpeed;damagePerBlock;canDestroyBlocksInCreative", "c", "d", "e", "f"}, this, $$0);
    }

    public List<a> a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public static final class a
    extends Record {
        final jh<dzq> c;
        final Optional<Float> d;
        final Optional<Boolean> e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.i).fieldOf("blocks").forGetter(a::a), (App)bfm.v.optionalFieldOf("speed").forGetter(a::b), (App)Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(a::c)).apply((Applicative)$$0, a::new));
        public static final aao<xq, a> b = aao.a(aam.c(mj.i), a::a, aam.l.a(aam::a), a::b, aam.b.a(aam::a), a::c, a::new);

        public a(jh<dzq> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        public static a a(jh<dzq> $$0, float $$1) {
            return new a($$0, Optional.of(Float.valueOf($$1)), Optional.of(true));
        }

        public static a a(jh<dzq> $$0) {
            return new a($$0, Optional.empty(), Optional.of(false));
        }

        public static a b(jh<dzq> $$0, float $$1) {
            return new a($$0, Optional.of(Float.valueOf($$1)), Optional.empty());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blocks;speed;correctForDrops", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blocks;speed;correctForDrops", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blocks;speed;correctForDrops", "c", "d", "e"}, this, $$0);
        }

        public jh<dzq> a() {
            return this.c;
        }

        public Optional<Float> b() {
            return this.d;
        }

        public Optional<Boolean> c() {
            return this.e;
        }
    }
}

