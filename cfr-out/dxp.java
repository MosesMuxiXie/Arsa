/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dxp {
    private static final Logger c = LogUtils.getLogger();
    public static final dxp a = new dxp(jh.a(new jd[0]), List.of());
    public static final MapCodec<dxp> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)ewu.c.promotePartial(bhs.a("Carver: ", arg_0 -> ((Logger)c).error(arg_0))).fieldOf("carvers").forGetter($$0 -> $$0.d), (App)fes.d.promotePartial(bhs.a("Features: ", arg_0 -> ((Logger)c).error(arg_0))).fieldOf("features").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dxp::new));
    private final jh<ewu<?>> d;
    private final List<jh<fes>> e;
    private final Supplier<List<exi<?, ?>>> f;
    private final Supplier<Set<fes>> g;

    dxp(jh<ewu<?>> $$0, List<jh<fes>> $$1) {
        this.d = $$0;
        this.e = $$1;
        this.f = Suppliers.memoize(() -> (List)$$1.stream().flatMap(jh::a).map(jd::a).flatMap(fes::a).filter($$0 -> $$0.b() == exx.h).collect(ImmutableList.toImmutableList()));
        this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jh::a).map(jd::a).collect(Collectors.toSet()));
    }

    public Iterable<jd<ewu<?>>> a() {
        return this.d;
    }

    public List<exi<?, ?>> b() {
        return this.f.get();
    }

    public List<jh<fes>> c() {
        return this.e;
    }

    public boolean a(fes $$0) {
        return this.g.get().contains($$0);
    }

    public static class a
    extends b {
        private final je<fes> a;
        private final je<ewu<?>> b;

        public a(je<fes> $$0, je<ewu<?>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(eum.a $$0, amt<fes> $$1) {
            this.a($$0.ordinal(), this.a.b($$1));
            return this;
        }

        public a a(amt<ewu<?>> $$0) {
            this.a(this.b.b($$0));
            return this;
        }
    }

    public static class b {
        private final List<jd<ewu<?>>> a = new ArrayList();
        private final List<List<jd<fes>>> b = new ArrayList<List<jd<fes>>>();

        public b a(eum.a $$0, jd<fes> $$1) {
            return this.a($$0.ordinal(), $$1);
        }

        public b a(int $$0, jd<fes> $$1) {
            this.a($$0);
            this.b.get($$0).add($$1);
            return this;
        }

        public b a(jd<ewu<?>> $$0) {
            this.a.add($$0);
            return this;
        }

        private void a(int $$0) {
            while (this.b.size() <= $$0) {
                this.b.add(Lists.newArrayList());
            }
        }

        public dxp a() {
            return new dxp(jh.a(this.a), (List)this.b.stream().map(jh::a).collect(ImmutableList.toImmutableList()));
        }
    }
}

