/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.Map;

public class dlq {
    private final Map<amo, a> a = Maps.newHashMap();
    private int b;

    public boolean a(dlt $$0) {
        return this.a($$0, 0.0f) > 0.0f;
    }

    public float a(dlt $$0, float $$1) {
        amo $$2 = this.b($$0);
        a $$3 = this.a.get($$2);
        if ($$3 != null) {
            float $$4 = $$3.b - $$3.a;
            float $$5 = (float)$$3.b - ((float)this.b + $$1);
            return bgj.a($$5 / $$4, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public void a() {
        ++this.b;
        if (!this.a.isEmpty()) {
            Iterator<Map.Entry<amo, a>> $$0 = this.a.entrySet().iterator();
            while ($$0.hasNext()) {
                Map.Entry<amo, a> $$1 = $$0.next();
                if ($$1.getValue().b > this.b) continue;
                $$0.remove();
                this.b($$1.getKey());
            }
        }
    }

    public amo b(dlt $$0) {
        dpg $$1 = $$0.a(ki.B);
        amo $$2 = mi.h.b($$0.h());
        if ($$1 == null) {
            return $$2;
        }
        return $$1.c().orElse($$2);
    }

    public void a(dlt $$0, int $$1) {
        this.a(this.b($$0), $$1);
    }

    public void a(amo $$0, int $$1) {
        this.a.put($$0, new a(this.b, this.b + $$1));
        this.b($$0, $$1);
    }

    public void a(amo $$0) {
        this.a.remove($$0);
        this.b($$0);
    }

    protected void b(amo $$0, int $$1) {
    }

    protected void b(amo $$0) {
    }

    static final class a
    extends Record {
        final int a;
        final int b;

        a(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "startTime;endTime", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "startTime;endTime", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "startTime;endTime", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }
}

