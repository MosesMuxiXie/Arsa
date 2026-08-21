/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;

public record abn(Optional<UUID> b) implements aay<abg>
{
    public static final aao<wx, abn> a = aay.a(abn::a, abn::new);

    private abn(wx $$0) {
        this($$0.b(jx.g));
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b, jx.g);
    }

    @Override
    public aba<abn> a() {
        return abu.g;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abn.class, "id", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abn.class, "id", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abn.class, "id", "b"}, this, $$0);
    }
}

