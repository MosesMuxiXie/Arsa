/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public interface axv {
    public void a(Consumer<aay<?>> var1);

    default public boolean a() {
        return false;
    }

    public a b();

    public record a(String a) {
        @Override
        public String toString() {
            return this.a;
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id", "a"}, this, $$0);
        }
    }
}

