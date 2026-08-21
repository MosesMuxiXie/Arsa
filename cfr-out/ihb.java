/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class ihb
implements uj {
    private final a a = new a(true);
    private final a b = new a(false);
    private boolean c = true;

    private a a(int $$0) {
        if (bel.b($$0) < 255) {
            return this.b;
        }
        return this.a;
    }

    @Override
    public void a(ftm $$0, int $$1, float $$2) {
        this.a((int)$$1).f.add(new c($$0, $$1, $$2));
        this.c = false;
    }

    @Override
    public void a(ftm $$0, ftm $$1, int $$2, float $$3) {
        this.a((int)$$2).b.add(new b($$0, $$1, $$2, $$3));
        this.c = false;
    }

    @Override
    public void a(ftm[] $$0, int $$1) {
        this.a((int)$$1).d.add(new f($$0, $$1));
        this.c = false;
    }

    @Override
    public void a(ftm $$0, ftm $$1, ftm $$2, ftm $$3, int $$4) {
        this.a((int)$$4).c.add(new d($$0, $$1, $$2, $$3, $$4));
        this.c = false;
    }

    @Override
    public void a(ftm $$0, String $$1, ur.a $$2) {
        this.a((int)$$2.b()).e.add(new e($$0, $$1, $$2));
        this.c = false;
    }

    public void a(fzm $$0, hon $$1, ikp $$2, Matrix4f $$3) {
        this.a.a($$0, $$1, $$2, $$3);
        this.b.a($$0, $$1, $$2, $$3);
    }

    public boolean a() {
        return this.c;
    }

    static final class a
    extends Record {
        private final boolean a;
        final List<b> b;
        final List<d> c;
        final List<f> d;
        final List<e> e;
        final List<c> f;

        a(boolean $$0) {
            this($$0, new ArrayList<b>(), new ArrayList<d>(), new ArrayList<f>(), new ArrayList<e>(), new ArrayList<c>());
        }

        private a(boolean $$0, List<b> $$1, List<d> $$2, List<f> $$3, List<e> $$4, List<c> $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        public void a(fzm $$0, hon $$1, ikp $$2, Matrix4f $$3) {
            this.c($$0, $$1, $$2);
            this.b($$0, $$1, $$2);
            this.b($$0, $$1, $$2, $$3);
            this.a($$0, $$1, $$2);
            this.d($$0, $$1, $$2);
        }

        private void a(fzm $$0, hon $$1, ikp $$2) {
            gfj $$3 = gfj.V();
            gio $$4 = $$3.g;
            if (!$$2.c) {
                return;
            }
            double $$5 = $$2.b.a();
            double $$6 = $$2.b.b();
            double $$7 = $$2.b.c();
            for (e $$8 : this.e) {
                float $$10;
                $$0.a();
                $$0.a((float)($$8.a().a() - $$5), (float)($$8.a().b() - $$6), (float)($$8.a().c() - $$7));
                $$0.a((Quaternionfc)$$2.e);
                $$0.b($$8.c.c() / 16.0f, -$$8.c.c() / 16.0f, $$8.c.c() / 16.0f);
                if ($$8.c.d().isEmpty()) {
                    float $$9 = (float)(-$$4.b($$8.b)) / 2.0f;
                } else {
                    $$10 = (float)(-$$8.c.d().getAsDouble()) / $$8.c.c();
                }
                $$4.a($$8.b, $$10, 0.0f, $$8.c.b(), false, $$0.c().a(), $$1, gio.a.a, 0, 0xF000F0);
                $$0.b();
            }
        }

        private void b(fzm $$0, hon $$1, ikp $$2, Matrix4f $$3) {
            fzp $$4 = $$1.a(this.a ? ijt.r() : ijt.s());
            fzm.a $$5 = $$0.c();
            Vector4f $$6 = new Vector4f();
            Vector4f $$7 = new Vector4f();
            Vector4f $$8 = new Vector4f();
            Vector4f $$9 = new Vector4f();
            Vector4f $$10 = new Vector4f();
            double $$11 = $$2.b.a();
            double $$12 = $$2.b.b();
            double $$13 = $$2.b.c();
            for (b $$14 : this.b) {
                boolean $$16;
                $$6.set($$14.a().a() - $$11, $$14.a().b() - $$12, $$14.a().c() - $$13, 1.0);
                $$7.set($$14.b().a() - $$11, $$14.b().b() - $$12, $$14.b().c() - $$13, 1.0);
                $$6.mul((Matrix4fc)$$3, $$8);
                $$7.mul((Matrix4fc)$$3, $$9);
                boolean $$15 = $$8.z > -0.05f;
                boolean bl2 = $$16 = $$9.z > -0.05f;
                if ($$15 && $$16) continue;
                if ($$15 || $$16) {
                    float $$17 = $$9.z - $$8.z;
                    if (Math.abs($$17) < 1.0E-9f) continue;
                    float $$18 = bgj.a((-0.05f - $$8.z) / $$17, 0.0f, 1.0f);
                    $$6.lerp((Vector4fc)$$7, $$18, $$10);
                    if ($$15) {
                        $$6.set((Vector4fc)$$10);
                    } else {
                        $$7.set((Vector4fc)$$10);
                    }
                }
                $$4.a($$5, $$6.x, $$6.y, $$6.z).b($$5, $$7.x - $$6.x, $$7.y - $$6.y, $$7.z - $$6.z).a($$14.c()).a($$14.d());
                $$4.a($$5, $$7.x, $$7.y, $$7.z).b($$5, $$7.x - $$6.x, $$7.y - $$6.y, $$7.z - $$6.z).a($$14.c()).a($$14.d());
            }
        }

        private void b(fzm $$0, hon $$1, ikp $$2) {
            fzm.a $$3 = $$0.c();
            double $$4 = $$2.b.a();
            double $$5 = $$2.b.b();
            double $$6 = $$2.b.c();
            for (f $$7 : this.d) {
                fzp $$8 = $$1.a(ijt.x());
                for (ftm $$9 : $$7.a()) {
                    $$8.a($$3, (float)($$9.a() - $$4), (float)($$9.b() - $$5), (float)($$9.c() - $$6)).a($$7.b());
                }
            }
        }

        private void c(fzm $$0, hon $$1, ikp $$2) {
            fzp $$3 = $$1.a(ijt.u());
            fzm.a $$4 = $$0.c();
            double $$5 = $$2.b.a();
            double $$6 = $$2.b.b();
            double $$7 = $$2.b.c();
            for (d $$8 : this.c) {
                $$3.a($$4, (float)($$8.a().a() - $$5), (float)($$8.a().b() - $$6), (float)($$8.a().c() - $$7)).a($$8.e());
                $$3.a($$4, (float)($$8.b().a() - $$5), (float)($$8.b().b() - $$6), (float)($$8.b().c() - $$7)).a($$8.e());
                $$3.a($$4, (float)($$8.c().a() - $$5), (float)($$8.c().b() - $$6), (float)($$8.c().c() - $$7)).a($$8.e());
                $$3.a($$4, (float)($$8.d().a() - $$5), (float)($$8.d().b() - $$6), (float)($$8.d().c() - $$7)).a($$8.e());
            }
        }

        private void d(fzm $$0, hon $$1, ikp $$2) {
            fzp $$3 = $$1.a(ijt.v());
            fzm.a $$4 = $$0.c();
            double $$5 = $$2.b.a();
            double $$6 = $$2.b.b();
            double $$7 = $$2.b.c();
            for (c $$8 : this.f) {
                $$3.a($$4, (float)($$8.a.a() - $$5), (float)($$8.a.b() - $$6), (float)($$8.a.c() - $$7)).a($$8.b()).a($$8.c());
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "opaque;lines;quads;triangleFans;texts;points", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "opaque;lines;quads;triangleFans;texts;points", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "opaque;lines;quads;triangleFans;texts;points", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public boolean a() {
            return this.a;
        }

        public List<b> b() {
            return this.b;
        }

        public List<d> c() {
            return this.c;
        }

        public List<f> d() {
            return this.d;
        }

        public List<e> e() {
            return this.e;
        }

        public List<c> f() {
            return this.f;
        }
    }

    static final class c
    extends Record {
        final ftm a;
        private final int b;
        private final float c;

        c(ftm $$0, int $$1, float $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "pos;color;size", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "pos;color;size", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "pos;color;size", "a", "b", "c"}, this, $$0);
        }

        public ftm a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public float c() {
            return this.c;
        }
    }

    record b(ftm a, ftm b, int c, float d) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "start;end;color;width", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "start;end;color;width", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "start;end;color;width", "a", "b", "c", "d"}, this, $$0);
        }
    }

    record f(ftm[] a, int b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "points;color", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "points;color", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "points;color", "a", "b"}, this, $$0);
        }
    }

    record d(ftm a, ftm b, ftm c, ftm d, int e) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "a;b;c;d;color", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "a;b;c;d;color", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "a;b;c;d;color", "a", "b", "c", "d", "e"}, this, $$0);
        }
    }

    static final class e
    extends Record {
        private final ftm a;
        final String b;
        final ur.a c;

        e(ftm $$0, String $$1, ur.a $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "pos;text;style", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "pos;text;style", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "pos;text;style", "a", "b", "c"}, this, $$0);
        }

        public ftm a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public ur.a c() {
            return this.c;
        }
    }
}

