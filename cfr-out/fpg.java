/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fpg
extends fpq {
    private static final Logger b = LogUtils.getLogger();
    public static final MapCodec<fpg> a = RecordCodecBuilder.mapCodec($$02 -> fpg.a($$02).and($$02.group((App)js.a(mj.bf).optionalFieldOf("options").forGetter($$0 -> $$0.c), (App)Codec.BOOL.optionalFieldOf("only_compatible", (Object)true).forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fpg::new));
    private final Optional<jh<dso>> c;
    private final boolean d;

    fpg(List<frm> $$0, Optional<jh<dso>> $$1, boolean $$2) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
    }

    public fps<fpg> a() {
        return fpt.h;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        bgr $$22 = $$1.b();
        boolean $$3 = $$0.a(dlx.sB);
        boolean $$4 = !$$3 && this.d;
        Stream<jd> $$5 = this.c.map(jh::a).orElseGet(() -> $$1.d().J_().f(mj.bf).c().map(Function.identity())).filter($$2 -> !$$4 || ((dso)$$2.a()).c($$0));
        List<jd> $$6 = $$5.toList();
        Optional<jd> $$7 = bhs.b($$6, $$22);
        if ($$7.isEmpty()) {
            b.warn("Couldn't find a compatible enchantment for {}", (Object)$$0);
            return $$0;
        }
        return fpg.a($$0, $$7.get(), $$22);
    }

    private static dlt a(dlt $$0, jd<dso> $$1, bgr $$2) {
        int $$3 = bgj.a($$2, $$1.a().d(), $$1.a().e());
        if ($$0.a(dlx.sB)) {
            $$0 = new dlt(dlx.wI);
        }
        $$0.a($$1, $$3);
        return $$0;
    }

    public static a c() {
        return new a();
    }

    public static a a(jf.a $$0) {
        return fpg.c().a($$0.e(mj.bf).b(bds.n));
    }

    public static class a
    extends fpq.a<a> {
        private Optional<jh<dso>> a = Optional.empty();
        private boolean b = true;

        protected a a() {
            return this;
        }

        public a a(jd<dso> $$0) {
            this.a = Optional.of(jh.a($$0));
            return this;
        }

        public a a(jh<dso> $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a e() {
            this.b = false;
            return this;
        }

        @Override
        public fpr b() {
            return new fpg(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

