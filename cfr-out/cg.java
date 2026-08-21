/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;

public final class cg
extends Record
implements Predicate<dlt> {
    private final Optional<jh<dlp>> b;
    private final cq.d c;
    private final bh d;
    public static final Codec<cg> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.R).optionalFieldOf("items").forGetter(cg::a), (App)cq.d.d.optionalFieldOf("count", (Object)cq.d.c).forGetter(cg::b), (App)bh.b.forGetter(cg::c)).apply((Applicative)$$0, cg::new));

    public cg(Optional<jh<dlp>> $$0, cq.d $$1, bh $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public boolean a(dlt $$0) {
        if (this.b.isPresent() && !$$0.a(this.b.get())) {
            return false;
        }
        if (!this.c.d($$0.N())) {
            return false;
        }
        return this.d.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cg.class, "items;count;components", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cg.class, "items;count;components", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cg.class, "items;count;components", "b", "c", "d"}, this, $$0);
    }

    public Optional<jh<dlp>> a() {
        return this.b;
    }

    public cq.d b() {
        return this.c;
    }

    public bh c() {
        return this.d;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dlt)object);
    }

    public static class a {
        private Optional<jh<dlp>> a = Optional.empty();
        private cq.d b = cq.d.c;
        private bh c = bh.a;

        public static a a() {
            return new a();
        }

        public a a(je<dlp> $$02, dwn ... $$1) {
            this.a = Optional.of(jh.a($$0 -> $$0.h().e(), $$1));
            return this;
        }

        public a a(je<dlp> $$0, bef<dlp> $$1) {
            this.a = Optional.of($$0.b($$1));
            return this;
        }

        public a a(cq.d $$0) {
            this.b = $$0;
            return this;
        }

        public a a(bh $$0) {
            this.c = $$0;
            return this;
        }

        public cg b() {
            return new cg(this.a, this.b, this.c);
        }
    }
}

