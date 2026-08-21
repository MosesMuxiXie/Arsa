/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class ggb {
    private final gfz a;
    private final List<a> b;

    private ggb(gfz $$0, List<a> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    static ggb a(hdg $$0, gfz $$1) {
        ArrayList<a> $$2 = new ArrayList<a>();
        Function<String, @Nullable hdg> $$3 = $$0.f();
        for (Map.Entry<String, List<gfy>> $$4 : $$1.c().entrySet()) {
            String $$5 = $$4.getKey();
            List<gfy> $$6 = $$4.getValue();
            hdg $$7 = $$3.apply($$5);
            if ($$7 == null) {
                throw new IllegalArgumentException("Cannot animate " + $$5 + ", which does not exist in model");
            }
            for (gfy $$8 : $$6) {
                $$2.add(new a($$7, $$8.a(), $$8.b()));
            }
        }
        return new ggb($$1, List.copyOf($$2));
    }

    public void a() {
        this.a(0L, 1.0f);
    }

    public void a(float $$0, float $$1, float $$2, float $$3) {
        long $$4 = (long)($$0 * 50.0f * $$2);
        float $$5 = Math.min($$1 * $$3, 1.0f);
        this.a($$4, $$5);
    }

    public void a(cfz $$0, float $$1) {
        this.a($$0, $$1, 1.0f);
    }

    public void a(cfz $$0, float $$1, float $$22) {
        $$0.a($$2 -> this.a((long)((float)$$2.a($$1) * $$22), 1.0f));
    }

    public void a(long $$0, float $$1) {
        float $$2 = this.a($$0);
        Vector3f $$3 = new Vector3f();
        for (a $$4 : this.b) {
            $$4.a($$2, $$1, $$3);
        }
    }

    private float a(long $$0) {
        float $$1 = (float)$$0 / 1000.0f;
        return this.a.b() ? $$1 % this.a.a() : $$1;
    }

    record a(hdg a, gfy.c b, gga[] c) {
        public void a(float $$0, float $$12, Vector3f $$2) {
            float $$9;
            int $$3 = Math.max(0, bgj.a(0, this.c.length, $$1 -> $$0 <= this.c[$$1].a()) - 1);
            int $$4 = Math.min(this.c.length - 1, $$3 + 1);
            gga $$5 = this.c[$$3];
            gga $$6 = this.c[$$4];
            float $$7 = $$0 - $$5.a();
            if ($$4 != $$3) {
                float $$8 = bgj.a($$7 / ($$6.a() - $$5.a()), 0.0f, 1.0f);
            } else {
                $$9 = 0.0f;
            }
            $$6.d().apply($$2, $$9, this.c, $$3, $$4, $$12);
            this.b.apply(this.a, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "part;target;keyframes", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "part;target;keyframes", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "part;target;keyframes", "a", "b", "c"}, this, $$0);
        }
    }
}

