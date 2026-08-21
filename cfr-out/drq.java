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
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class drq
implements drn {
    final dqo d;
    final dqo e;
    final dqo f;
    final jd<dut> g;
    private @Nullable dqr h;

    public drq(dqo $$0, dqo $$1, dqo $$2, jd<dut> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public dlt a(dro $$0, jf.a $$1) {
        return drq.a($$1, $$0.d(), $$0.e(), this.g);
    }

    public static dlt a(jf.a $$0, dlt $$1, dlt $$2, jd<dut> $$3) {
        Optional<jd<dur>> $$4 = dus.a($$0, $$2);
        if ($$4.isPresent()) {
            dup $$6;
            dup $$5 = $$1.a(ki.ad);
            if (Objects.equals($$5, $$6 = new dup($$4.get(), $$3))) {
                return dlt.l;
            }
            dlt $$7 = $$1.c(1);
            $$7.b(ki.ad, $$6);
            return $$7;
        }
        return dlt.l;
    }

    @Override
    public Optional<dqo> c() {
        return Optional.of(this.d);
    }

    @Override
    public dqo f() {
        return this.e;
    }

    @Override
    public Optional<dqo> k() {
        return Optional.of(this.f);
    }

    @Override
    public drc<drq> a() {
        return drc.u;
    }

    @Override
    public dqr aq_() {
        if (this.h == null) {
            this.h = dqr.b(List.of(this.d, this.e, this.f));
        }
        return this.h;
    }

    @Override
    public List<dry> g() {
        dse $$0 = this.e.c();
        dse $$1 = this.f.c();
        dse $$2 = this.d.c();
        return List.of(new dsh($$2, $$0, $$1, new dse.g($$0, $$1, this.g), new dse.d(dlx.yU)));
    }

    public static class a
    implements drc<drq> {
        private static final MapCodec<drq> x = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dqo.d.fieldOf("template").forGetter($$0 -> $$0.d), (App)dqo.d.fieldOf("base").forGetter($$0 -> $$0.e), (App)dqo.d.fieldOf("addition").forGetter($$0 -> $$0.f), (App)dut.c.fieldOf("pattern").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, drq::new));
        public static final aao<xq, drq> w = aao.a(dqo.a, $$0 -> $$0.d, dqo.a, $$0 -> $$0.e, dqo.a, $$0 -> $$0.f, dut.d, $$0 -> $$0.g, drq::new);

        @Override
        public MapCodec<drq> a() {
            return x;
        }

        @Override
        public aao<xq, drq> b() {
            return w;
        }
    }
}

