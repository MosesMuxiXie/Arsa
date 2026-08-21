/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fpb
extends fpq {
    public static final MapCodec<fpb> a = RecordCodecBuilder.mapCodec($$02 -> fpb.a($$02).and($$02.group((App)mi.e.r().fieldOf("block").forGetter($$0 -> $$0.b), (App)Codec.STRING.listOf().fieldOf("properties").forGetter($$0 -> $$0.c.stream().map(epk::f).toList()))).apply((Applicative)$$02, fpb::new));
    private final jd<dzq> b;
    private final Set<epk<?>> c;

    fpb(List<frm> $$0, jd<dzq> $$1, Set<epk<?>> $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    private fpb(List<frm> $$0, jd<dzq> $$1, List<String> $$2) {
        this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
    }

    public fps<fpb> a() {
        return fpt.D;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.i);
    }

    @Override
    protected dlt a(dlt $$0, fnz $$12) {
        eoh $$2 = $$12.c(fqx.i);
        if ($$2 != null) {
            $$0.a(ki.ax, dnw.a, $$1 -> {
                for (epk<?> $$2 : this.c) {
                    if (!$$2.b($$2)) continue;
                    $$1 = $$1.a($$2, $$2);
                }
                return $$1;
            });
        }
        return $$0;
    }

    public static a a(dzq $$0) {
        return new a($$0);
    }

    public static class a
    extends fpq.a<a> {
        private final jd<dzq> a;
        private final ImmutableSet.Builder<epk<?>> b = ImmutableSet.builder();

        a(dzq $$0) {
            this.a = $$0.p();
        }

        public a a(epk<?> $$0) {
            if (!this.a.a().l().d().contains($$0)) {
                throw new IllegalStateException("Property " + String.valueOf($$0) + " is not present on block " + String.valueOf(this.a));
            }
            this.b.add($$0);
            return this;
        }

        protected a a() {
            return this;
        }

        @Override
        public fpr b() {
            return new fpb(this.g(), this.a, (Set<epk<?>>)this.b.build());
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

