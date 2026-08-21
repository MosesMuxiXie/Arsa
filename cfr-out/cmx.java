/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Const
 *  com.mojang.datafixers.kinds.Const$Mu
 *  com.mojang.datafixers.kinds.IdF
 *  com.mojang.datafixers.kinds.IdF$Mu
 *  com.mojang.datafixers.kinds.K1
 *  com.mojang.datafixers.kinds.OptionalBox
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  com.mojang.datafixers.util.Unit
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.util.Unit;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface cmx<F extends K1, Value> {
    public cqw<Value> a();

    public cqx b();

    public @Nullable cmw<F, Value> a(cim<?> var1, Optional<Value> var2);

    public record a<Value>(cqw<Value> a) implements cmx<Const.Mu<Unit>, Value>
    {
        @Override
        public cqx b() {
            return cqx.b;
        }

        @Override
        public cmw<Const.Mu<Unit>, Value> a(cim<?> $$0, Optional<Value> $$1) {
            if ($$1.isPresent()) {
                return null;
            }
            return new cmw($$0, this.a, Const.create((Object)Unit.INSTANCE));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "memory", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "memory", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "memory", "a"}, this, $$0);
        }
    }

    public record b<Value>(cqw<Value> a) implements cmx<IdF.Mu, Value>
    {
        @Override
        public cqx b() {
            return cqx.a;
        }

        @Override
        public cmw<IdF.Mu, Value> a(cim<?> $$0, Optional<Value> $$1) {
            if ($$1.isEmpty()) {
                return null;
            }
            return new cmw($$0, this.a, IdF.create($$1.get()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "memory", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "memory", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "memory", "a"}, this, $$0);
        }
    }

    public record c<Value>(cqw<Value> a) implements cmx<OptionalBox.Mu, Value>
    {
        @Override
        public cqx b() {
            return cqx.c;
        }

        @Override
        public cmw<OptionalBox.Mu, Value> a(cim<?> $$0, Optional<Value> $$1) {
            return new cmw($$0, this.a, OptionalBox.create($$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "memory", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "memory", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "memory", "a"}, this, $$0);
        }
    }
}

