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
import java.util.List;

public abstract class dpy
extends drk {
    private final dqe d;
    private final float e;
    private final int f;

    public dpy(String $$0, dqe $$1, dqo $$2, dlt $$3, float $$4, int $$5) {
        super($$0, $$2, $$3);
        this.d = $$1;
        this.e = $$4;
        this.f = $$5;
    }

    @Override
    public abstract drc<? extends dpy> a();

    @Override
    public abstract drd<? extends dpy> b();

    public float c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public dqe e() {
        return this.d;
    }

    protected abstract dlp f();

    @Override
    public List<dry> g() {
        return List.of(new drx(this.k().c(), dse.a.c, new dse.f(this.l()), new dse.d(this.f()), this.f, this.e));
    }

    @FunctionalInterface
    public static interface a<T extends dpy> {
        public T create(String var1, dqe var2, dqo var3, dlt var4, float var5, int var6);
    }

    public static class b<T extends dpy>
    implements drc<T> {
        private final MapCodec<T> w = RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(drk::j), (App)dqe.d.fieldOf("category").orElse((Object)dqe.c).forGetter(dpy::e), (App)dqo.d.fieldOf("ingredient").forGetter(drk::k), (App)dlt.e.fieldOf("result").forGetter(drk::l), (App)Codec.FLOAT.fieldOf("experience").orElse((Object)Float.valueOf(0.0f)).forGetter(dpy::c), (App)Codec.INT.fieldOf("cookingtime").orElse((Object)$$1).forGetter(dpy::d)).apply((Applicative)$$2, $$0::create));
        private final aao<xq, T> x = aao.a(aam.p, drk::j, dqe.e, dpy::e, dqo.a, drk::k, dlt.j, drk::l, aam.l, dpy::c, aam.g, dpy::d, $$0::create);

        public b(a<T> $$0, int $$1) {
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

