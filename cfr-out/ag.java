/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public final class ag
extends Record {
    private final int c;
    private final List<amt<fof>> d;
    private final List<amt<dqs<?>>> e;
    private final Optional<dy> f;
    public static final Codec<ag> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.optionalFieldOf("experience", (Object)0).forGetter(ag::a), (App)fof.a.listOf().optionalFieldOf("loot", List.of()).forGetter(ag::b), (App)dqs.b.listOf().optionalFieldOf("recipes", List.of()).forGetter(ag::c), (App)dy.a.optionalFieldOf("function").forGetter(ag::d)).apply((Applicative)$$0, ag::new));
    public static final ag b = new ag(0, List.of(), List.of(), Optional.empty());

    public ag(int $$0, List<amt<fof>> $$1, List<amt<dqs<?>>> $$2, Optional<dy> $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public void a(axg $$0) {
        $$0.d(this.c);
        axf $$12 = $$0.A();
        MinecraftServer $$22 = $$12.s();
        fod $$3 = new fod.a($$12).a(fqx.a, $$0).a(fqx.h, $$0.dI()).a(fqw.m);
        boolean $$4 = false;
        for (amt<fof> $$5 : this.d) {
            for (dlt $$6 : $$22.be().a($$5).a($$3)) {
                if ($$0.h($$6)) {
                    $$12.a(null, $$0.dP(), $$0.dR(), $$0.dV(), bda.pG, bdb.h, 0.2f, (($$0.ep().i() - $$0.ep().i()) * 0.7f + 1.0f) * 2.0f);
                    $$4 = true;
                    continue;
                }
                czl $$7 = $$0.a($$6, false);
                if ($$7 == null) continue;
                $$7.k();
                $$7.b($$0.cY());
            }
        }
        if ($$4) {
            $$0.cn.d();
        }
        if (!this.e.isEmpty()) {
            $$0.b(this.e);
        }
        this.f.flatMap($$1 -> $$1.a($$22.aC())).ifPresent($$2 -> $$22.aC().a((ht<ed>)$$2, $$0.C().a().a(bbh.c)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ag.class, "experience;loot;recipes;function", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ag.class, "experience;loot;recipes;function", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ag.class, "experience;loot;recipes;function", "c", "d", "e", "f"}, this, $$0);
    }

    public int a() {
        return this.c;
    }

    public List<amt<fof>> b() {
        return this.d;
    }

    public List<amt<dqs<?>>> c() {
        return this.e;
    }

    public Optional<dy> d() {
        return this.f;
    }

    public static class a {
        private int a;
        private final ImmutableList.Builder<amt<fof>> b = ImmutableList.builder();
        private final ImmutableList.Builder<amt<dqs<?>>> c = ImmutableList.builder();
        private Optional<amo> d = Optional.empty();

        public static a a(int $$0) {
            return new a().b($$0);
        }

        public a b(int $$0) {
            this.a += $$0;
            return this;
        }

        public static a a(amt<fof> $$0) {
            return new a().b($$0);
        }

        public a b(amt<fof> $$0) {
            this.b.add($$0);
            return this;
        }

        public static a c(amt<dqs<?>> $$0) {
            return new a().d($$0);
        }

        public a d(amt<dqs<?>> $$0) {
            this.c.add($$0);
            return this;
        }

        public static a a(amo $$0) {
            return new a().b($$0);
        }

        public a b(amo $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public ag a() {
            return new ag(this.a, (List<amt<fof>>)this.b.build(), (List<amt<dqs<?>>>)this.c.build(), this.d.map(dy::new));
        }
    }
}

