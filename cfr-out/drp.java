/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class drp
implements drn {
    final Optional<dqo> d;
    final dqo e;
    final Optional<dqo> f;
    final drv g;
    private @Nullable dqr h;

    public drp(Optional<dqo> $$0, dqo $$1, Optional<dqo> $$2, drv $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public dlt a(dro $$0, jf.a $$1) {
        return this.g.a($$0.d());
    }

    @Override
    public Optional<dqo> c() {
        return this.d;
    }

    @Override
    public dqo f() {
        return this.e;
    }

    @Override
    public Optional<dqo> k() {
        return this.f;
    }

    @Override
    public drc<drp> a() {
        return drc.t;
    }

    @Override
    public dqr aq_() {
        if (this.h == null) {
            this.h = dqr.a(List.of(this.d, Optional.of(this.e), this.f));
        }
        return this.h;
    }

    @Override
    public List<dry> g() {
        return List.of(new dsh(dqo.a(this.d), this.e.c(), dqo.a(this.f), this.g.a(), new dse.d(dlx.yU)));
    }

    public static class a
    implements drc<drp> {
        private static final MapCodec<drp> x = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dqo.d.optionalFieldOf("template").forGetter($$0 -> $$0.d), (App)dqo.d.fieldOf("base").forGetter($$0 -> $$0.e), (App)dqo.d.optionalFieldOf("addition").forGetter($$0 -> $$0.f), (App)drv.a.fieldOf("result").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, drp::new));
        public static final aao<xq, drp> w = aao.a(dqo.b, $$0 -> $$0.d, dqo.a, $$0 -> $$0.e, dqo.b, $$0 -> $$0.f, drv.b, $$0 -> $$0.g, drp::new);

        @Override
        public MapCodec<drp> a() {
            return x;
        }

        @Override
        public aao<xq, drp> b() {
            return w;
        }
    }
}

