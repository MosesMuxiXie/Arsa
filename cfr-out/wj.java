/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;

public final class wj
extends Record {
    private final int a;
    private final Map<String, wb<?>> b;
    private final Map<String, wj> c;

    private wj(int $$0) {
        this($$0, new HashMap(), new HashMap<String, wj>());
    }

    public wj(int $$0, Map<String, wb<?>> $$1, Map<String, wj> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static wj a() {
        return new wj(1);
    }

    public void a(wi $$02) {
        if (this.a <= $$02.a().size()) {
            this.c.computeIfAbsent($$02.a().get(this.a - 1), $$0 -> new wj(this.a + 1)).a($$02);
        } else {
            this.b.put($$02.c(), $$02.b());
        }
    }

    public boolean a(wb<?> $$0, String $$1) {
        return $$0.equals(this.c().get($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{wj.class, "depth;selectedFields;fieldsToRecurse", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{wj.class, "depth;selectedFields;fieldsToRecurse", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{wj.class, "depth;selectedFields;fieldsToRecurse", "a", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.a;
    }

    public Map<String, wb<?>> c() {
        return this.b;
    }

    public Map<String, wj> d() {
        return this.c;
    }
}

