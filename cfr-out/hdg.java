/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class hdg {
    public static final float a = 1.0f;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h = 1.0f;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;
    public boolean l;
    private final List<a> m;
    private final Map<String, hdg> n;
    private hdi o = hdi.a;

    public hdg(List<a> $$0, Map<String, hdg> $$1) {
        this.m = $$0;
        this.n = $$1;
    }

    public hdi a() {
        return hdi.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public hdi b() {
        return this.o;
    }

    public void a(hdi $$0) {
        this.o = $$0;
    }

    public void c() {
        this.b(this.o);
    }

    public void b(hdi $$0) {
        this.b = $$0.a();
        this.c = $$0.b();
        this.d = $$0.c();
        this.e = $$0.d();
        this.f = $$0.e();
        this.g = $$0.f();
        this.h = $$0.g();
        this.i = $$0.h();
        this.j = $$0.i();
    }

    public boolean a(String $$0) {
        return this.n.containsKey($$0);
    }

    public hdg b(String $$0) {
        hdg $$1 = this.n.get($$0);
        if ($$1 == null) {
            throw new NoSuchElementException("Can't find part " + $$0);
        }
        return $$1;
    }

    public void a(float $$0, float $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public void b(float $$0, float $$1, float $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public void a(fzm $$0, fzp $$1, int $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, -1);
    }

    public void a(fzm $$0, fzp $$1, int $$2, int $$3, int $$4) {
        if (!this.k) {
            return;
        }
        if (this.m.isEmpty() && this.n.isEmpty()) {
            return;
        }
        $$0.a();
        this.a($$0);
        if (!this.l) {
            this.a($$0.c(), $$1, $$2, $$3, $$4);
        }
        for (hdg $$5 : this.n.values()) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
        }
        $$0.b();
    }

    public void a(Quaternionf $$0) {
        Matrix3f $$1 = new Matrix3f().rotationZYX(this.g, this.f, this.e);
        Matrix3f $$2 = $$1.rotate((Quaternionfc)$$0);
        Vector3f $$3 = $$2.getEulerAnglesZYX(new Vector3f());
        this.b($$3.x, $$3.y, $$3.z);
    }

    public void a(fzm $$0, Consumer<Vector3fc> $$12) {
        this.a($$0, (fzm.a $$1, String $$2, int $$3, a $$4) -> {
            for (b $$5 : $$4.a) {
                for (c $$6 : $$5.a()) {
                    float $$7 = $$6.a();
                    float $$8 = $$6.b();
                    float $$9 = $$6.c();
                    Vector3f $$10 = $$1.a().transformPosition($$7, $$8, $$9, new Vector3f());
                    $$12.accept((Vector3fc)$$10);
                }
            }
        });
    }

    public void a(fzm $$0, d $$1) {
        this.a($$0, $$1, "");
    }

    private void a(fzm $$0, d $$1, String $$2) {
        if (this.m.isEmpty() && this.n.isEmpty()) {
            return;
        }
        $$0.a();
        this.a($$0);
        fzm.a $$32 = $$0.c();
        for (int $$42 = 0; $$42 < this.m.size(); ++$$42) {
            $$1.visit($$32, $$2, $$42, this.m.get($$42));
        }
        String $$5 = $$2 + "/";
        this.n.forEach(($$3, $$4) -> $$4.a($$0, $$1, $$5 + $$3));
        $$0.b();
    }

    public void a(fzm $$0) {
        $$0.a(this.b / 16.0f, this.c / 16.0f, this.d / 16.0f);
        if (this.e != 0.0f || this.f != 0.0f || this.g != 0.0f) {
            $$0.a((Quaternionfc)new Quaternionf().rotationZYX(this.g, this.f, this.e));
        }
        if (this.h != 1.0f || this.i != 1.0f || this.j != 1.0f) {
            $$0.b(this.h, this.i, this.j);
        }
    }

    private void a(fzm.a $$0, fzp $$1, int $$2, int $$3, int $$4) {
        for (a $$5 : this.m) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
        }
    }

    public a a(bgr $$0) {
        return this.m.get($$0.a(this.m.size()));
    }

    public boolean d() {
        return this.m.isEmpty();
    }

    public void a(Vector3f $$0) {
        this.b += $$0.x();
        this.c += $$0.y();
        this.d += $$0.z();
    }

    public void b(Vector3f $$0) {
        this.e += $$0.x();
        this.f += $$0.y();
        this.g += $$0.z();
    }

    public void c(Vector3f $$0) {
        this.h += $$0.x();
        this.i += $$0.y();
        this.j += $$0.z();
    }

    public List<hdg> e() {
        ArrayList<hdg> $$0 = new ArrayList<hdg>();
        $$0.add(this);
        this.a((String $$1, hdg $$2) -> $$0.add((hdg)$$2));
        return List.copyOf($$0);
    }

    public Function<String, @Nullable hdg> f() {
        HashMap<String, hdg> $$0 = new HashMap<String, hdg>();
        $$0.put("root", this);
        this.a($$0::putIfAbsent);
        return $$0::get;
    }

    private void a(BiConsumer<String, hdg> $$0) {
        for (Map.Entry<String, hdg> $$1 : this.n.entrySet()) {
            $$0.accept($$1.getKey(), $$1.getValue());
        }
        for (hdg $$2 : this.n.values()) {
            $$2.a($$0);
        }
    }

    @FunctionalInterface
    public static interface d {
        public void visit(fzm.a var1, String var2, int var3, a var4);
    }

    public static class a {
        public final b[] a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;

        public a(int $$0, int $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, boolean $$11, float $$12, float $$13, Set<iz> $$14) {
            this.b = $$2;
            this.c = $$3;
            this.d = $$4;
            this.e = $$2 + $$5;
            this.f = $$3 + $$6;
            this.g = $$4 + $$7;
            this.a = new b[$$14.size()];
            float $$15 = $$2 + $$5;
            float $$16 = $$3 + $$6;
            float $$17 = $$4 + $$7;
            $$2 -= $$8;
            $$3 -= $$9;
            $$4 -= $$10;
            $$15 += $$8;
            $$16 += $$9;
            $$17 += $$10;
            if ($$11) {
                float $$18 = $$15;
                $$15 = $$2;
                $$2 = $$18;
            }
            c $$19 = new c($$2, $$3, $$4, 0.0f, 0.0f);
            c $$20 = new c($$15, $$3, $$4, 0.0f, 8.0f);
            c $$21 = new c($$15, $$16, $$4, 8.0f, 8.0f);
            c $$22 = new c($$2, $$16, $$4, 8.0f, 0.0f);
            c $$23 = new c($$2, $$3, $$17, 0.0f, 0.0f);
            c $$24 = new c($$15, $$3, $$17, 0.0f, 8.0f);
            c $$25 = new c($$15, $$16, $$17, 8.0f, 8.0f);
            c $$26 = new c($$2, $$16, $$17, 8.0f, 0.0f);
            float $$27 = $$0;
            float $$28 = (float)$$0 + $$7;
            float $$29 = (float)$$0 + $$7 + $$5;
            float $$30 = (float)$$0 + $$7 + $$5 + $$5;
            float $$31 = (float)$$0 + $$7 + $$5 + $$7;
            float $$32 = (float)$$0 + $$7 + $$5 + $$7 + $$5;
            float $$33 = $$1;
            float $$34 = (float)$$1 + $$7;
            float $$35 = (float)$$1 + $$7 + $$6;
            int $$36 = 0;
            if ($$14.contains(iz.a)) {
                this.a[$$36++] = new b(new c[]{$$24, $$23, $$19, $$20}, $$28, $$33, $$29, $$34, $$12, $$13, $$11, iz.a);
            }
            if ($$14.contains(iz.b)) {
                this.a[$$36++] = new b(new c[]{$$21, $$22, $$26, $$25}, $$29, $$34, $$30, $$33, $$12, $$13, $$11, iz.b);
            }
            if ($$14.contains(iz.e)) {
                this.a[$$36++] = new b(new c[]{$$19, $$23, $$26, $$22}, $$27, $$34, $$28, $$35, $$12, $$13, $$11, iz.e);
            }
            if ($$14.contains(iz.c)) {
                this.a[$$36++] = new b(new c[]{$$20, $$19, $$22, $$21}, $$28, $$34, $$29, $$35, $$12, $$13, $$11, iz.c);
            }
            if ($$14.contains(iz.f)) {
                this.a[$$36++] = new b(new c[]{$$24, $$20, $$21, $$25}, $$29, $$34, $$31, $$35, $$12, $$13, $$11, iz.f);
            }
            if ($$14.contains(iz.d)) {
                this.a[$$36] = new b(new c[]{$$23, $$24, $$25, $$26}, $$31, $$34, $$32, $$35, $$12, $$13, $$11, iz.d);
            }
        }

        public void a(fzm.a $$0, fzp $$1, int $$2, int $$3, int $$4) {
            Matrix4f $$5 = $$0.a();
            Vector3f $$6 = new Vector3f();
            for (b $$7 : this.a) {
                Vector3f $$8 = $$0.a($$7.b, $$6);
                float $$9 = $$8.x();
                float $$10 = $$8.y();
                float $$11 = $$8.z();
                for (c $$12 : $$7.a) {
                    float $$13 = $$12.a();
                    float $$14 = $$12.b();
                    float $$15 = $$12.c();
                    Vector3f $$16 = $$5.transformPosition($$13, $$14, $$15, $$6);
                    $$1.a($$16.x(), $$16.y(), $$16.z(), $$4, $$12.e, $$12.f, $$3, $$2, $$9, $$10, $$11);
                }
            }
        }
    }

    public static final class b
    extends Record {
        final c[] a;
        final Vector3fc b;

        public b(c[] $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, boolean $$7, iz $$8) {
            this($$0, ($$7 ? hdg$b.a($$8) : $$8).s());
            float $$9 = 0.0f / $$5;
            float $$10 = 0.0f / $$6;
            $$0[0] = $$0[0].a($$3 / $$5 - $$9, $$2 / $$6 + $$10);
            $$0[1] = $$0[1].a($$1 / $$5 + $$9, $$2 / $$6 + $$10);
            $$0[2] = $$0[2].a($$1 / $$5 + $$9, $$4 / $$6 - $$10);
            $$0[3] = $$0[3].a($$3 / $$5 - $$9, $$4 / $$6 - $$10);
            if ($$7) {
                int $$11 = $$0.length;
                for (int $$12 = 0; $$12 < $$11 / 2; ++$$12) {
                    c $$13 = $$0[$$12];
                    $$0[$$12] = $$0[$$11 - 1 - $$12];
                    $$0[$$11 - 1 - $$12] = $$13;
                }
            }
        }

        public b(c[] $$0, Vector3fc $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private static iz a(iz $$0) {
            return $$0.o() == iz.a.a ? $$0.g() : $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "vertices;normal", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "vertices;normal", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "vertices;normal", "a", "b"}, this, $$0);
        }

        public c[] a() {
            return this.a;
        }

        public Vector3fc b() {
            return this.b;
        }
    }

    public static final class c
    extends Record {
        private final float b;
        private final float c;
        private final float d;
        final float e;
        final float f;
        public static final float a = 16.0f;

        public c(float $$0, float $$1, float $$2, float $$3, float $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        public c a(float $$0, float $$1) {
            return new c(this.b, this.c, this.d, $$0, $$1);
        }

        public float a() {
            return this.b / 16.0f;
        }

        public float b() {
            return this.c / 16.0f;
        }

        public float c() {
            return this.d / 16.0f;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "x;y;z;u;v", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "x;y;z;u;v", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "x;y;z;u;v", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public float d() {
            return this.b;
        }

        public float e() {
            return this.c;
        }

        public float f() {
            return this.d;
        }

        public float g() {
            return this.e;
        }

        public float h() {
            return this.f;
        }
    }
}

