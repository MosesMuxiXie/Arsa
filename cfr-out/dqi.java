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

public abstract class dqi
implements dqh {
    private final dqf d;

    public dqi(dqf $$0) {
        this.d = $$0;
    }

    @Override
    public boolean ar_() {
        return true;
    }

    @Override
    public dqf c() {
        return this.d;
    }

    @Override
    public dqr aq_() {
        return dqr.b;
    }

    @Override
    public abstract drc<? extends dqi> a();

    public static class dqi$a<T extends dqh>
    implements drc<T> {
        private final MapCodec<T> w = RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)dqf.e.fieldOf("category").orElse((Object)dqf.d).forGetter(dqh::c)).apply((Applicative)$$1, $$0::create));
        private final aao<xq, T> x = aao.a(dqf.g, dqh::c, $$0::create);

        public dqi$a(a<T> $$0) {
        }

        @Override
        public MapCodec<T> a() {
            return this.w;
        }

        @Override
        public aao<xq, T> b() {
            return this.x;
        }

        @FunctionalInterface
        public static interface a<T extends dqh> {
            public T create(dqf var1);
        }
    }
}

