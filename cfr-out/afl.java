/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record afl(int b, yh c) implements aay<adb>
{
    private final yh c;
    public static final aao<xq, afl> a = aao.a(aam.h, afl::b, yj.d, afl::e, afl::new);

    @Override
    public aba<afl> a() {
        return ahz.aj;
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
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afl.class, "playerId;message", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afl.class, "playerId;message", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afl.class, "playerId;message", "b", "c"}, this, $$0);
    }

    public yh e() {
        return this.c;
    }
}

