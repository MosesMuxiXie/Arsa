/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record fwj(ftm b, ftm c, ftm d) {
    public static final fwj a = new fwj(ftm.c, new ftm(0.0, 0.0, -1.0), new ftm(0.0, 1.0, 0.0));

    public ftm a() {
        return this.c.c(this.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fwj.class, "position;forward;up", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fwj.class, "position;forward;up", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fwj.class, "position;forward;up", "b", "c", "d"}, this, $$0);
    }
}

