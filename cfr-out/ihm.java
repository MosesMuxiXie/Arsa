/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ihm {
    dlr a = dlr.a;
    private int b;
    private boolean c;
    private boolean d;
    private @Nullable fth e;
    private b[] f = new b[]{new b()};

    public void a(int $$0) {
        int $$2 = this.b + $$0;
        int $$1 = this.f.length;
        if ($$2 > $$1) {
            this.f = Arrays.copyOf(this.f, $$2);
            for (int $$3 = $$1; $$3 < $$2; ++$$3) {
                this.f[$$3] = new b();
            }
        }
    }

    public b a() {
        this.a(1);
        return this.f[this.b++];
    }

    public void b() {
        this.a = dlr.a;
        for (int $$0 = 0; $$0 < this.b; ++$$0) {
            this.f[$$0].a();
        }
        this.b = 0;
        this.c = false;
        this.d = false;
        this.e = null;
    }

    public void c() {
        this.c = true;
    }

    public boolean d() {
        return this.c;
    }

    public void a(Object $$0) {
    }

    private b i() {
        return this.f[0];
    }

    public boolean e() {
        return this.b == 0;
    }

    public boolean f() {
        return this.i().e;
    }

    public @Nullable ilp a(bgr $$0) {
        if (this.b == 0) {
            return null;
        }
        return this.f[$$0.a((int)this.b)].f;
    }

    public void a(Consumer<Vector3fc> $$0) {
        Vector3f $$1 = new Vector3f();
        fzm.a $$2 = new fzm.a();
        for (int $$3 = 0; $$3 < this.b; ++$$3) {
            Vector3fc[] $$6;
            b $$4 = this.f[$$3];
            $$4.g.a(this.a.d(), $$2);
            Matrix4f $$5 = $$2.a();
            for (Vector3fc $$7 : $$6 = $$4.m.get()) {
                $$0.accept((Vector3fc)$$1.set($$7).mulPosition((Matrix4fc)$$5));
            }
            $$2.c();
        }
    }

    public void a(fzm $$0, hpo $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = 0; $$5 < this.b; ++$$5) {
            this.f[$$5].a($$0, $$1, $$2, $$3, $$4);
        }
    }

    public fth g() {
        fth $$1;
        if (this.e != null) {
            return this.e;
        }
        fth.a $$0 = new fth.a();
        this.a($$0::a);
        this.e = $$1 = $$0.a();
        return $$1;
    }

    public void a(boolean $$0) {
        this.d = $$0;
    }

    public boolean h() {
        return this.d;
    }

    public class b {
        private static final Vector3fc[] c = new Vector3fc[0];
        public static final Supplier<Vector3fc[]> a = () -> c;
        private final List<hqa> d = new ArrayList<hqa>();
        boolean e;
        @Nullable ilp f;
        hqk g = hqk.a;
        private @Nullable ijs h;
        private a i = ihm$a.a;
        private int[] j = new int[0];
        private @Nullable iki<Object> k;
        private @Nullable Object l;
        Supplier<Vector3fc[]> m = a;

        public void a() {
            this.d.clear();
            this.h = null;
            this.i = ihm$a.a;
            this.k = null;
            this.l = null;
            Arrays.fill(this.j, -1);
            this.e = false;
            this.f = null;
            this.g = hqk.a;
            this.m = a;
        }

        public List<hqa> b() {
            return this.d;
        }

        public void a(ijs $$0) {
            this.h = $$0;
        }

        public void a(boolean $$0) {
            this.e = $$0;
        }

        public void a(Supplier<Vector3fc[]> $$0) {
            this.m = $$0;
        }

        public void a(ilp $$0) {
            this.f = $$0;
        }

        public void a(hqk $$0) {
            this.g = $$0;
        }

        public <T> void a(iki<T> $$0, @Nullable T $$1) {
            this.k = ihm$b.a($$0);
            this.l = $$1;
        }

        private static iki<Object> a(iki<?> $$0) {
            return $$0;
        }

        public void a(a $$0) {
            this.i = $$0;
        }

        public int[] a(int $$0) {
            if ($$0 > this.j.length) {
                this.j = new int[$$0];
                Arrays.fill(this.j, -1);
            }
            return this.j;
        }

        void a(fzm $$0, hpo $$1, int $$2, int $$3, int $$4) {
            $$0.a();
            this.g.a(ihm.this.a.d(), $$0.c());
            if (this.k != null) {
                this.k.a(this.l, ihm.this.a, $$0, $$1, $$2, $$3, this.i != ihm$a.a, $$4);
            } else if (this.h != null) {
                $$1.a($$0, ihm.this.a, $$2, $$3, $$4, this.j, this.d, this.h, this.i);
            }
            $$0.b();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = ihm$a.a();
        }
    }
}

