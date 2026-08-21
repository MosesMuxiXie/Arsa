/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public abstract class drk
implements dqs<drl> {
    private final dqo d;
    private final dlt e;
    private final String f;
    private @Nullable dqr g;

    public drk(String $$0, dqo $$1, dlt $$2) {
        this.f = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public abstract drc<? extends drk> a();

    @Override
    public abstract drd<? extends drk> b();

    @Override
    public boolean a(drl $$0, dwo $$1) {
        return this.d.a($$0.c());
    }

    @Override
    public String j() {
        return this.f;
    }

    public dqo k() {
        return this.d;
    }

    protected dlt l() {
        return this.e;
    }

    @Override
    public dqr aq_() {
        if (this.g == null) {
            this.g = dqr.a(this.d);
        }
        return this.g;
    }

    @Override
    public dlt a(drl $$0, jf.a $$1) {
        return this.e.v();
    }

    @FunctionalInterface
    public static interface a<T extends drk> {
        public T create(String var1, dqo var2, dlt var3);
    }

    public static class b<T extends drk>
    implements drc<T> {
        private final MapCodec<T> w = RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(drk::j), (App)dqo.d.fieldOf("ingredient").forGetter(drk::k), (App)dlt.d.fieldOf("result").forGetter(drk::l)).apply((Applicative)$$1, $$0::create));
        private final aao<xq, T> x = aao.a(aam.p, drk::j, dqo.a, drk::k, dlt.j, drk::l, $$0::create);

        protected b(a<T> $$0) {
        }

        @Override
        public MapCodec<T> a() {
            return this.w;
        }

        @Override
        public aao<xq, T> b() {
            return this.x;
        }
    }
}

