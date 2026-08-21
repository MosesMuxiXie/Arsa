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
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fph
extends fpq {
    public static final MapCodec<fph> a = RecordCodecBuilder.mapCodec($$02 -> fph.a($$02).and($$02.group((App)fsj.a.fieldOf("levels").forGetter($$0 -> $$0.b), (App)js.a(mj.bf).optionalFieldOf("options").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fph::new));
    private final fsi b;
    private final Optional<jh<dso>> c;

    fph(List<frm> $$0, fsi $$1, Optional<jh<dso>> $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    public fps<fph> a() {
        return fpt.g;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.b();
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        bgr $$2 = $$1.b();
        jr $$3 = $$1.d().J_();
        return dsq.a($$2, $$0, this.b.a($$1), $$3, this.c);
    }

    public static a a(jf.a $$0, fsi $$1) {
        return new a($$1).a($$0.e(mj.bf).b(bds.n));
    }

    public static class a
    extends fpq.a<a> {
        private final fsi a;
        private Optional<jh<dso>> b = Optional.empty();

        public a(fsi $$0) {
            this.a = $$0;
        }

        protected a a() {
            return this;
        }

        public a a(jh<dso> $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        @Override
        public fpr b() {
            return new fph(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

