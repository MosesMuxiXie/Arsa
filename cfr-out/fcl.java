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
import java.util.List;

public final class fcl
extends Record {
    private final fcd b;
    private final List<a> c;
    public static final Codec<fcl> a = RecordCodecBuilder.create($$0 -> $$0.group((App)fcd.a.fieldOf("fallback").forGetter(fcl::a), (App)fcl$a.a.listOf().fieldOf("rules").forGetter(fcl::b)).apply((Applicative)$$0, fcl::new));

    public fcl(fcd $$0, List<a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static fcl a(fcd $$0) {
        return new fcl($$0, List.of());
    }

    public static fcl a(dzq $$0) {
        return fcl.a(fcd.a($$0));
    }

    public eoh a(dxn $$0, bgr $$1, is $$2) {
        for (a $$3 : this.c) {
            if (!$$3.a().test($$0, $$2)) continue;
            return $$3.b().a($$1, $$2);
        }
        return this.b.a($$1, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fcl.class, "fallback;rules", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fcl.class, "fallback;rules", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fcl.class, "fallback;rules", "b", "c"}, this, $$0);
    }

    public fcd a() {
        return this.b;
    }

    public List<a> b() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final evx b;
        private final fcd c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)evx.b.fieldOf("if_true").forGetter(a::a), (App)fcd.a.fieldOf("then").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(evx $$0, fcd $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "ifTrue;then", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "ifTrue;then", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "ifTrue;then", "b", "c"}, this, $$0);
        }

        public evx a() {
            return this.b;
        }

        public fcd b() {
            return this.c;
        }
    }
}

