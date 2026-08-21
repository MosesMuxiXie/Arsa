/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fqe
extends fpq {
    public static final MapCodec<fqe> a = RecordCodecBuilder.mapCodec($$02 -> fqe.a($$02).and($$02.group((App)Codec.unboundedMap(dso.c, fsj.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0 -> $$0.b), (App)Codec.BOOL.fieldOf("add").orElse((Object)false).forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fqe::new));
    private final Map<jd<dso>, fsi> b;
    private final boolean c;

    fqe(List<frm> $$0, Map<jd<dso>, fsi> $$1, boolean $$2) {
        super($$0);
        this.b = Map.copyOf($$1);
        this.c = $$2;
    }

    public fps<fqe> a() {
        return fpt.i;
    }

    @Override
    public Set<bhv<?>> b() {
        return (Set)this.b.values().stream().flatMap($$0 -> $$0.b().stream()).collect(ImmutableSet.toImmutableSet());
    }

    @Override
    public dlt a(dlt $$0, fnz $$12) {
        if ($$0.a(dlx.sB)) {
            $$0 = $$0.a((dwn)dlx.wI);
        }
        dsq.a($$0, $$1 -> {
            if (this.c) {
                this.b.forEach(($$2, $$3) -> $$1.a((jd<dso>)$$2, bgj.a($$1.a((jd<dso>)$$2) + $$3.a($$12), 0, 255)));
            } else {
                this.b.forEach(($$2, $$3) -> $$1.a((jd<dso>)$$2, bgj.a($$3.a($$12), 0, 255)));
            }
        });
        return $$0;
    }

    public static class a
    extends fpq.a<a> {
        private final ImmutableMap.Builder<jd<dso>, fsi> a = ImmutableMap.builder();
        private final boolean b;

        public a() {
            this(false);
        }

        public a(boolean $$0) {
            this.b = $$0;
        }

        protected a a() {
            return this;
        }

        public a a(jd<dso> $$0, fsi $$1) {
            this.a.put($$0, (Object)$$1);
            return this;
        }

        @Override
        public fpr b() {
            return new fqe(this.g(), (Map<jd<dso>, fsi>)this.a.build(), this.b);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

