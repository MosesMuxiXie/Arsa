/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public final class flp {
    public static final aao<wx, flp> a = aao.a((B $$0, V $$1) -> $$1.a((wx)((Object)$$0)), flp::b);
    private final List<fln> b;
    private @Nullable a c;
    private int d;
    private final is e;
    private final float f;
    private final boolean g;

    public flp(List<fln> $$0, is $$1, boolean $$2) {
        this.b = $$0;
        this.e = $$1;
        this.f = $$0.isEmpty() ? Float.MAX_VALUE : this.b.get(this.b.size() - 1).c(this.e);
        this.g = $$2;
    }

    public void a() {
        ++this.d;
    }

    public boolean b() {
        return this.d <= 0;
    }

    public boolean c() {
        return this.d >= this.b.size();
    }

    public @Nullable fln d() {
        if (!this.b.isEmpty()) {
            return this.b.get(this.b.size() - 1);
        }
        return null;
    }

    public fln a(int $$0) {
        return this.b.get($$0);
    }

    public void b(int $$0) {
        if (this.b.size() > $$0) {
            this.b.subList($$0, this.b.size()).clear();
        }
    }

    public void a(int $$0, fln $$1) {
        this.b.set($$0, $$1);
    }

    public int e() {
        return this.b.size();
    }

    public int f() {
        return this.d;
    }

    public void c(int $$0) {
        this.d = $$0;
    }

    public ftm a(cgk $$0, int $$1) {
        fln $$2 = this.b.get($$1);
        double $$3 = (double)$$2.a + (double)((int)($$0.dF() + 1.0f)) * 0.5;
        double $$4 = $$2.b;
        double $$5 = (double)$$2.c + (double)((int)($$0.dF() + 1.0f)) * 0.5;
        return new ftm($$3, $$4, $$5);
    }

    public is d(int $$0) {
        return this.b.get($$0).a();
    }

    public ftm a(cgk $$0) {
        return this.a($$0, this.d);
    }

    public is g() {
        return this.b.get(this.d).a();
    }

    public fln h() {
        return this.b.get(this.d);
    }

    public @Nullable fln i() {
        return this.d > 0 ? this.b.get(this.d - 1) : null;
    }

    public boolean a(@Nullable flp $$0) {
        return $$0 != null && this.b.equals($$0.b);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object $$0) {
        void $$2;
        if (!($$0 instanceof flp)) {
            return false;
        }
        flp $$1 = (flp)$$0;
        return this.d == $$2.d && this.c == $$2.c && this.g == $$2.g && this.e.equals($$2.e) && this.b.equals($$2.b);
    }

    public int hashCode() {
        return this.d + this.b.hashCode() * 31;
    }

    public boolean j() {
        return this.g;
    }

    @bht
    void a(fln[] $$0, fln[] $$1, Set<flw> $$2) {
        this.c = new a($$0, $$1, $$2);
    }

    public @Nullable a k() {
        return this.c;
    }

    public void a(wx $$02) {
        if (this.c == null || this.c.c.isEmpty()) {
            throw new IllegalStateException("Missing debug data");
        }
        $$02.a(this.g);
        $$02.q(this.d);
        $$02.a(this.e);
        $$02.a(this.b, (? super wx $$0, T $$1) -> $$1.a((wx)((Object)$$0)));
        this.c.a($$02);
    }

    public static flp b(wx $$0) {
        boolean $$1 = $$0.readBoolean();
        int $$2 = $$0.readInt();
        is $$3 = $$0.e();
        List<fln> $$4 = $$0.a(fln::b);
        a $$5 = flp$a.b($$0);
        flp $$6 = new flp($$4, $$3, $$1);
        $$6.c = $$5;
        $$6.d = $$2;
        return $$6;
    }

    public String toString() {
        return "Path(length=" + this.b.size() + ")";
    }

    public is l() {
        return this.e;
    }

    public float m() {
        return this.f;
    }

    static fln[] c(wx $$0) {
        fln[] $$1 = new fln[$$0.l()];
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            $$1[$$2] = fln.b($$0);
        }
        return $$1;
    }

    static void a(wx $$0, fln[] $$1) {
        $$0.c($$1.length);
        for (fln $$2 : $$1) {
            $$2.a($$0);
        }
    }

    public flp n() {
        flp $$0 = new flp(this.b, this.e, this.g);
        $$0.c = this.c;
        $$0.d = this.d;
        return $$0;
    }

    public static final class a
    extends Record {
        private final fln[] a;
        private final fln[] b;
        final Set<flw> c;

        public a(fln[] $$0, fln[] $$1, Set<flw> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(wx $$02) {
            $$02.a(this.c, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
            flp.a($$02, this.a);
            flp.a($$02, this.b);
        }

        public static a b(wx $$0) {
            HashSet $$1 = (HashSet)((Object)$$0.a(HashSet::new, flw::c));
            fln[] $$2 = flp.c($$0);
            fln[] $$3 = flp.c($$0);
            return new a($$2, $$3, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "openSet;closedSet;targetNodes", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "openSet;closedSet;targetNodes", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "openSet;closedSet;targetNodes", "a", "b", "c"}, this, $$0);
        }

        public fln[] a() {
            return this.a;
        }

        public fln[] b() {
            return this.b;
        }

        public Set<flw> c() {
            return this.c;
        }
    }
}

