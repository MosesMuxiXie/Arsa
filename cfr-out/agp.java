/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public final class agp
extends Record
implements aay<adb> {
    private final int c;
    private final List<ama.c<?>> d;
    public static final aao<xq, agp> a = aay.a(agp::b, agp::new);
    public static final int b = 255;

    private agp(xq $$0) {
        this($$0.l(), agp.a($$0));
    }

    public agp(int $$0, List<ama.c<?>> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    private static void a(List<ama.c<?>> $$0, xq $$1) {
        for (ama.c<?> $$2 : $$0) {
            $$2.a($$1);
        }
        $$1.l(255);
    }

    private static List<ama.c<?>> a(xq $$0) {
        short $$2;
        ArrayList $$1 = new ArrayList();
        while (($$2 = $$0.readUnsignedByte()) != 255) {
            $$1.add(ama.c.a($$0, $$2));
        }
        return $$1;
    }

    private void b(xq $$0) {
        $$0.c(this.c);
        agp.a(this.d, $$0);
    }

    @Override
    public aba<agp> a() {
        return ahz.aK;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{agp.class, "id;packedItems", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{agp.class, "id;packedItems", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{agp.class, "id;packedItems", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.c;
    }

    public List<ama.c<?>> e() {
        return this.d;
    }
}

