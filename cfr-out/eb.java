/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public interface eb {
    public static final eb a = new eb(){

        @Override
        public @Nullable yy a(String $$0) {
            return null;
        }
    };

    public @Nullable yy a(String var1);

    public static final class a
    extends Record
    implements eb {
        private final Map<String, yy> b;

        public a(Map<String, yy> $$0) {
            this.b = $$0;
        }

        @Override
        public @Nullable yy a(String $$0) {
            return this.b.get($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "arguments", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "arguments", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "arguments", "b"}, this, $$0);
        }

        public Map<String, yy> a() {
            return this.b;
        }
    }
}

