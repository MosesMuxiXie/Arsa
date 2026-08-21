/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ace(amo a) implements acd
{
    private final amo a;

    public static <T extends wx> aao<T, ace> a(amo $$02, int $$12) {
        return acd.a((T $$0, B $$1) -> {}, (B $$2) -> {
            int $$3 = $$2.readableBytes();
            if ($$3 < 0 || $$3 > $$12) {
                throw new IllegalArgumentException("Payload may not be larger than " + $$12 + " bytes");
            }
            $$2.k($$3);
            return new ace($$02);
        });
    }

    public acd.b<ace> a() {
        return new acd.b<ace>(this.a);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ace.class, "id", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ace.class, "id", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ace.class, "id", "a"}, this, $$0);
    }

    public amo b() {
        return this.a;
    }
}

