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

public final class ca
extends Record {
    private final Optional<jh<fla>> b;
    private final Optional<dl> c;
    public static final Codec<ca> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.L).optionalFieldOf("fluids").forGetter(ca::a), (App)dl.a.optionalFieldOf("state").forGetter(ca::b)).apply((Applicative)$$0, ca::new));

    public ca(Optional<jh<fla>> $$0, Optional<dl> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public boolean a(axf $$0, is $$1) {
        if (!$$0.t($$1)) {
            return false;
        }
        flb $$2 = $$0.b_($$1);
        if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
        }
        return !this.c.isPresent() || this.c.get().a($$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ca.class, "fluids;properties", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ca.class, "fluids;properties", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ca.class, "fluids;properties", "b", "c"}, this, $$0);
    }

    public Optional<jh<fla>> a() {
        return this.b;
    }

    public Optional<dl> b() {
        return this.c;
    }

    public static class a {
        private Optional<jh<fla>> a = Optional.empty();
        private Optional<dl> b = Optional.empty();

        private a() {
        }

        public static a a() {
            return new a();
        }

        public a a(fla $$0) {
            this.a = Optional.of(jh.a($$0.k()));
            return this;
        }

        public a a(jh<fla> $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a a(dl $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        public ca b() {
            return new ca(this.a, this.b);
        }
    }
}

