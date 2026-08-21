/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class fqa
extends fpq {
    public static final MapCodec<fqa> a = RecordCodecBuilder.mapCodec($$02 -> fqa.a($$02).and($$02.group((App)fnx.e.fieldOf("component").forGetter($$0 -> $$0.b), (App)foo.a.listOf().fieldOf("entries").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fqa::new));
    private final fnw<?> b;
    private final List<foq> c;

    fqa(List<frm> $$0, fnw<?> $$1, List<foq> $$2) {
        super($$0);
        this.b = $$1;
        this.c = List.copyOf($$2);
    }

    public fps<fqa> a() {
        return fpt.t;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        if ($$0.f()) {
            return $$0;
        }
        Stream.Builder $$2 = Stream.builder();
        this.c.forEach($$22 -> $$22.expand($$1, $$2 -> $$2.a(fof.a($$1.d(), $$2::add), $$1)));
        this.b.a($$0, $$2.build());
        return $$0;
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        for (int $$1 = 0; $$1 < this.c.size(); ++$$1) {
            this.c.get($$1).a($$0.a(new bgp.d("entries", $$1)));
        }
    }

    public static a a(fnw<?> $$0) {
        return new a($$0);
    }

    public static class a
    extends fpq.a<a> {
        private final ImmutableList.Builder<foq> a = ImmutableList.builder();
        private final fnw<?> b;

        public a(fnw<?> $$0) {
            this.b = $$0;
        }

        protected a a() {
            return this;
        }

        public a a(foq.a<?> $$0) {
            this.a.add((Object)$$0.b());
            return this;
        }

        @Override
        public fpr b() {
            return new fqa(this.g(), this.b, (List<foq>)this.a.build());
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

