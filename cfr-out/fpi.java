/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fpi
extends fpq {
    public static final int a = 0;
    public static final MapCodec<fpi> b = RecordCodecBuilder.mapCodec($$02 -> fpi.a($$02).and($$02.group((App)dso.c.fieldOf("enchantment").forGetter($$0 -> $$0.c), (App)fsj.a.fieldOf("count").forGetter($$0 -> $$0.d), (App)Codec.INT.optionalFieldOf("limit", (Object)0).forGetter($$0 -> $$0.e))).apply((Applicative)$$02, fpi::new));
    private final jd<dso> c;
    private final fsi d;
    private final int e;

    fpi(List<frm> $$0, jd<dso> $$1, fsi $$2, int $$3) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public fps<fpi> a() {
        return fpt.m;
    }

    @Override
    public Set<bhv<?>> b() {
        return Sets.union((Set)ImmutableSet.of(fqx.f), this.d.b());
    }

    private boolean c() {
        return this.e > 0;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        cgk $$2 = $$1.c(fqx.f);
        if ($$2 instanceof chl) {
            chl $$3 = (chl)$$2;
            int $$4 = dsq.a(this.c, $$3);
            if ($$4 == 0) {
                return $$0;
            }
            float $$5 = (float)$$4 * this.d.b($$1);
            $$0.g(Math.round($$5));
            if (this.c()) {
                $$0.f(this.e);
            }
        }
        return $$0;
    }

    public static a a(jf.a $$0, fsi $$1) {
        jf.b<dso> $$2 = $$0.e(mj.bf);
        return new a($$2.b(dst.s), $$1);
    }

    public static class a
    extends fpq.a<a> {
        private final jd<dso> a;
        private final fsi b;
        private int c = 0;

        public a(jd<dso> $$0, fsi $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        protected a a() {
            return this;
        }

        public a a(int $$0) {
            this.c = $$0;
            return this;
        }

        @Override
        public fpr b() {
            return new fpi(this.g(), this.a, this.b, this.c);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

