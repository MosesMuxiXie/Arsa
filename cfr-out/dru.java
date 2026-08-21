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

public class dru
implements dqh {
    final String d;
    final dqf e;
    final dqo f;
    final dqo g;
    final drv h;
    private @Nullable dqr i;

    public dru(String $$0, dqf $$1, dqo $$2, dqo $$3, drv $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() != 2) {
            return false;
        }
        boolean $$2 = false;
        boolean $$3 = false;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if (!$$2 && this.f.a($$5)) {
                if (this.h.b($$5)) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            if (!$$3 && this.g.a($$5)) {
                $$3 = true;
                continue;
            }
            return false;
        }
        return $$2 && $$3;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        for (int $$2 = 0; $$2 < $$0.a(); ++$$2) {
            dlt $$3 = $$0.a($$2);
            if ($$3.f() || !this.f.a($$3)) continue;
            return this.h.a($$3);
        }
        return dlt.l;
    }

    @Override
    public List<dry> g() {
        return List.of(new dsd(List.of(this.f.c(), this.g.c()), this.h.a(), new dse.d(dlx.fu)));
    }

    @Override
    public drc<dru> a() {
        return drc.m;
    }

    @Override
    public String j() {
        return this.d;
    }

    @Override
    public dqr aq_() {
        if (this.i == null) {
            this.i = dqr.b(List.of(this.f, this.g));
        }
        return this.i;
    }

    @Override
    public dqf c() {
        return this.e;
    }

    public static class a
    implements drc<dru> {
        private static final MapCodec<dru> x = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter($$0 -> $$0.d), (App)dqf.e.fieldOf("category").orElse((Object)dqf.d).forGetter($$0 -> $$0.e), (App)dqo.d.fieldOf("input").forGetter($$0 -> $$0.f), (App)dqo.d.fieldOf("material").forGetter($$0 -> $$0.g), (App)drv.a.fieldOf("result").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, dru::new));
        public static final aao<xq, dru> w = aao.a(aam.p, $$0 -> $$0.d, dqf.g, $$0 -> $$0.e, dqo.a, $$0 -> $$0.f, dqo.a, $$0 -> $$0.g, drv.b, $$0 -> $$0.h, dru::new);

        @Override
        public MapCodec<dru> a() {
            return x;
        }

        @Override
        public aao<xq, dru> b() {
            return w;
        }
    }
}

