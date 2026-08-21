/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface am<T extends an> {
    public void a(anb var1, a<T> var2);

    public void b(anb var1, a<T> var2);

    public void a(anb var1);

    public Codec<T> a();

    default public ak<T> a(T $$0) {
        return new ak<T>(this, $$0);
    }

    public record a<T extends an>(T a, ac b, String c) {
        public void a(anb $$0) {
            $$0.a(this.b, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "trigger;advancement;criterion", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "trigger;advancement;criterion", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "trigger;advancement;criterion", "a", "b", "c"}, this, $$0);
        }
    }
}

