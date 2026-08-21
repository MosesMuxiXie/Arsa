/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ahk(yh b, boolean c) implements aay<adb>
{
    private final boolean c;
    public static final aao<xq, ahk> a = aao.a(yj.d, ahk::b, aam.b, ahk::e, ahk::new);

    @Override
    public aba<ahk> a() {
        return ahz.be;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahk.class, "content;overlay", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahk.class, "content;overlay", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahk.class, "content;overlay", "b", "c"}, this, $$0);
    }

    public boolean e() {
        return this.c;
    }
}

