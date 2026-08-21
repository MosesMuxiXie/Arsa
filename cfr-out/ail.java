/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ail(yz.a b) implements aay<aib>
{
    public static final aao<wx, ail> a = aay.a(ail::a, ail::new);

    private ail(wx $$0) {
        this(yz.a.a($$0));
    }

    @Override
    private void a(wx $$0) {
        yz.a.a($$0, this.b);
    }

    @Override
    public aba<ail> a() {
        return ahz.bz;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ail.class, "chatSession", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ail.class, "chatSession", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ail.class, "chatSession", "b"}, this, $$0);
    }
}

