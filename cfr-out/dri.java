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
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dri
implements dqh {
    final String d;
    final dqf e;
    final dlt f;
    final List<dqo> g;
    private @Nullable dqr h;

    public dri(String $$0, dqf $$1, dlt $$2, List<dqo> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public drc<dri> a() {
        return drc.b;
    }

    @Override
    public String j() {
        return this.d;
    }

    @Override
    public dqf c() {
        return this.e;
    }

    @Override
    public dqr aq_() {
        if (this.h == null) {
            this.h = dqr.b(this.g);
        }
        return this.h;
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() != this.g.size()) {
            return false;
        }
        if ($$0.a() == 1 && this.g.size() == 1) {
            return this.g.getFirst().a($$0.a(0));
        }
        return $$0.c().a(this, null);
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        return this.f.v();
    }

    @Override
    public List<dry> g() {
        return List.of(new dsd(this.g.stream().map(dqo::c).toList(), new dse.f(this.f), new dse.d(dlx.fu)));
    }

    public static class a
    implements drc<dri> {
        private static final MapCodec<dri> x = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter($$0 -> $$0.d), (App)dqf.e.fieldOf("category").orElse((Object)dqf.d).forGetter($$0 -> $$0.e), (App)dlt.d.fieldOf("result").forGetter($$0 -> $$0.f), (App)dqo.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dri::new));
        public static final aao<xq, dri> w = aao.a(aam.p, $$0 -> $$0.d, dqf.g, $$0 -> $$0.e, dlt.j, $$0 -> $$0.f, dqo.a.a(aam.a()), $$0 -> $$0.g, dri::new);

        @Override
        public MapCodec<dri> a() {
            return x;
        }

        @Override
        public aao<xq, dri> b() {
            return w;
        }
    }
}

