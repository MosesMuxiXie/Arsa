/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public final class afb
extends Record
implements aay<adb> {
    private final int b;
    private final List<dgs.a> c;
    public static final aao<wx, afb> a = aao.a(aam.h, afb::b, dgs.a.a.a(aam.a()), afb::e, afb::new);

    public afb(int $$0, List<dgs.a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<afb> a() {
        return ahz.Y;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public @Nullable cgk a(dwo $$0) {
        return $$0.a(this.b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afb.class, "entityId;lerpSteps", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afb.class, "entityId;lerpSteps", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afb.class, "entityId;lerpSteps", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public List<dgs.a> e() {
        return this.c;
    }
}

