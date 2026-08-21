/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ajg
extends Record
implements aay<aib> {
    private final int b;
    private final dsa c;
    private final boolean d;
    public static final aao<wx, ajg> a = aao.a(aam.x, ajg::b, dsa.a, ajg::e, aam.b, ajg::f, ajg::new);

    public ajg(int $$0, dsa $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public aba<ajg> a() {
        return ahz.bX;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajg.class, "containerId;recipe;useMaxItems", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajg.class, "containerId;recipe;useMaxItems", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajg.class, "containerId;recipe;useMaxItems", "b", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public dsa e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

