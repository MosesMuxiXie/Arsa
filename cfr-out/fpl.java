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

public class fpl
extends fpq {
    public static final MapCodec<fpl> a = RecordCodecBuilder.mapCodec($$02 -> fpl.a($$02).and($$02.group((App)cg.a.fieldOf("item_filter").forGetter($$0 -> $$0.b), (App)fpt.c.optionalFieldOf("on_pass").forGetter($$0 -> $$0.c), (App)fpt.c.optionalFieldOf("on_fail").forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fpl::new));
    private final cg b;
    private final Optional<fpr> c;
    private final Optional<fpr> d;

    fpl(List<frm> $$0, cg $$1, Optional<fpr> $$2, Optional<fpr> $$3) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public fps<fpl> a() {
        return fpt.v;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        Optional<fpr> $$2;
        Optional<fpr> optional = $$2 = this.b.a($$0) ? this.c : this.d;
        if ($$2.isPresent()) {
            return (dlt)$$2.get().apply($$0, $$1);
        }
        return $$0;
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        this.c.ifPresent($$1 -> $$1.a($$0.a(new bgp.c("on_pass"))));
        this.d.ifPresent($$1 -> $$1.a($$0.a(new bgp.c("on_fail"))));
    }

    public static a a(cg $$0) {
        return new a($$0);
    }

    public static class a
    extends fpq.a<a> {
        private final cg a;
        private Optional<fpr> b = Optional.empty();
        private Optional<fpr> c = Optional.empty();

        a(cg $$0) {
            this.a = $$0;
        }

        protected a a() {
            return this;
        }

        public a a(Optional<fpr> $$0) {
            this.b = $$0;
            return this;
        }

        public a b(Optional<fpr> $$0) {
            this.c = $$0;
            return this;
        }

        @Override
        public fpr b() {
            return new fpl(this.g(), this.a, this.b, this.c);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

