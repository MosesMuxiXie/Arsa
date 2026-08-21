/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface chh {
    public dwo ao();

    public ftm dI();

    public float ed();

    default public @Nullable chl et() {
        return null;
    }

    public static chh a(chh $$0, ftm $$1) {
        return new a($$0, $$1);
    }

    public record a(chh a, ftm b) implements chh
    {
        @Override
        public dwo ao() {
            return this.a.ao();
        }

        @Override
        public ftm dI() {
            return this.a.dI().e(this.b);
        }

        @Override
        public float ed() {
            return this.a.ed();
        }

        @Override
        public @Nullable chl et() {
            return this.a.et();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "owner;offset", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "owner;offset", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "owner;offset", "a", "b"}, this, $$0);
        }
    }
}

