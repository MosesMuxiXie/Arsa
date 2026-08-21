/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Set;

public class fqp
extends fpq {
    private static final Codec<List<b>> b = fqp$b.a.listOf().validate($$0 -> {
        ObjectOpenHashSet $$1 = new ObjectOpenHashSet();
        for (b $$2 : $$0) {
            if ($$1.add($$2.a())) continue;
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + String.valueOf($$2.a()) + "'");
        }
        return DataResult.success((Object)$$0);
    });
    public static final MapCodec<fqp> a = RecordCodecBuilder.mapCodec($$02 -> fqp.a($$02).and((App)b.optionalFieldOf("effects", List.of()).forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fqp::new));
    private final List<b> c;

    fqp(List<frm> $$0, List<b> $$1) {
        super($$0);
        this.c = $$1;
    }

    public fps<fqp> a() {
        return fpt.r;
    }

    @Override
    public Set<bhv<?>> b() {
        return (Set)this.c.stream().flatMap($$0 -> $$0.b().b().stream()).collect(ImmutableSet.toImmutableSet());
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        if (!$$0.a(dlx.yA) || this.c.isEmpty()) {
            return $$0;
        }
        b $$2 = bhs.a(this.c, $$1.b());
        jd<cfk> $$3 = $$2.a();
        int $$4 = $$2.b().a($$1);
        if (!$$3.a().a()) {
            $$4 *= 20;
        }
        dpa.a $$5 = new dpa.a($$3, $$4);
        $$0.a(ki.aa, dpa.a, $$5, dpa::a);
        return $$0;
    }

    public static a c() {
        return new a();
    }

    static final class b
    extends Record {
        private final jd<cfk> b;
        private final fsi c;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cfk.a.fieldOf("type").forGetter(b::a), (App)fsj.a.fieldOf("duration").forGetter(b::b)).apply((Applicative)$$0, b::new));

        b(jd<cfk> $$0, fsi $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "effect;duration", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "effect;duration", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "effect;duration", "b", "c"}, this, $$0);
        }

        public jd<cfk> a() {
            return this.b;
        }

        public fsi b() {
            return this.c;
        }
    }

    public static class a
    extends fpq.a<a> {
        private final ImmutableList.Builder<b> a = ImmutableList.builder();

        protected a a() {
            return this;
        }

        public a a(jd<cfk> $$0, fsi $$1) {
            this.a.add((Object)new b($$0, $$1));
            return this;
        }

        @Override
        public fpr b() {
            return new fqp(this.g(), (List<b>)this.a.build());
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

