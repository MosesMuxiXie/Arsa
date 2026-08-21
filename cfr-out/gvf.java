/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class gvf
implements gvi {
    private static final int a = 10;
    private static final int b = 2;
    private final List<hou.a> c;

    public gvf(a $$0) {
        this.c = $$0.a();
    }

    @Override
    public int a(gio $$0) {
        return this.c.size() * 12 + 2;
    }

    private static String a(hou.a $$0) {
        return $$0.a().name();
    }

    @Override
    public int b(gio $$0) {
        int $$1 = 0;
        for (hou.a $$2 : this.c) {
            int $$3 = $$0.b(gvf.a($$2));
            if ($$3 <= $$1) continue;
            $$1 = $$3;
        }
        return $$1 + 10 + 6;
    }

    @Override
    public void a(gio $$0, int $$1, int $$2, int $$3, int $$4, gir $$5) {
        for (int $$6 = 0; $$6 < this.c.size(); ++$$6) {
            hou.a $$7 = this.c.get($$6);
            int $$8 = $$2 + 2 + $$6 * 12;
            gke.a($$5, $$7.b(), $$1 + 2, $$8, 10);
            $$5.b($$0, gvf.a($$7), $$1 + 10 + 4, $$8 + 2, -1);
        }
    }

    public record a(List<hou.a> a) implements djs
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "profiles", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "profiles", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "profiles", "a"}, this, $$0);
        }
    }
}

