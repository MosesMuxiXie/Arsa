/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aim(float b) implements aay<aib>
{
    public static final aao<wx, aim> a = aay.a(aim::a, aim::new);

    private aim(wx $$0) {
        this($$0.readFloat());
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<aim> a() {
        return ahz.bA;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aim.class, "desiredChunksPerTick", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aim.class, "desiredChunksPerTick", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aim.class, "desiredChunksPerTick", "b"}, this, $$0);
    }
}

