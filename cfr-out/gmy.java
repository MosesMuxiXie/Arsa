/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gmy
implements gnb {
    private static final amo a = amo.b("toast/now_playing");
    private static final amo e = amo.a("icon/music_notes");
    private static final int f = 7;
    private static final int g = 16;
    private static final int h = 30;
    private static final int i = 30;
    private static final int j = 5000;
    private static final int k = dkr.i.g();
    private static final long l = 25L;
    private static int m;
    private static long n;
    private static int o;
    private boolean p;
    private double q;
    private final gfj r;
    private gnb.a s = gnb.a.b;

    public gmy() {
        this.r = gfj.V();
    }

    public static void a(gir $$0, gio $$1) {
        String $$2 = gmy.g();
        if ($$2 != null) {
            $$0.a(hpa.at, a, 0, 0, gmy.a($$2, $$1), 30);
            int $$3 = 7;
            $$0.a(hpa.at, e, 7, 7, 16, 16, o);
            $$0.b($$1, gmy.a($$2), 30, 15 - $$1.b / 2, k);
        }
    }

    private static @Nullable String g() {
        return gfj.V().w().d();
    }

    public static void c() {
        long $$0;
        if (gmy.g() != null && ($$0 = System.currentTimeMillis()) > n + 25L) {
            n = $$0;
            o = ggp.a(ggp.a.b, (float)(++m));
        }
    }

    private static yh a(@Nullable String $$0) {
        if ($$0 == null) {
            return yh.i();
        }
        return yh.c($$0.replace("/", "."));
    }

    public void a(gfo $$0) {
        this.p = true;
        this.q = $$0.J().b();
        this.a(gnb.a.a);
    }

    @Override
    public void a(gnc $$0, long $$1) {
        if (this.p) {
            this.s = (double)$$1 < 5000.0 * this.q ? gnb.a.a : gnb.a.b;
            gmy.c();
        }
    }

    @Override
    public void a(gir $$0, gio $$1, long $$2) {
        gmy.a($$0, $$1);
    }

    @Override
    public void d() {
        this.p = false;
    }

    @Override
    public int e() {
        return gmy.a(gmy.g(), this.r.g);
    }

    private static int a(@Nullable String $$0, gio $$1) {
        return 30 + $$1.a(gmy.a($$0)) + 7;
    }

    @Override
    public int f() {
        return 30;
    }

    @Override
    public float a(int $$0, float $$1) {
        return (float)this.e() * $$1 - (float)this.e();
    }

    @Override
    public float a(int $$0) {
        return 0.0f;
    }

    @Override
    public gnb.a a() {
        return this.s;
    }

    public void a(gnb.a $$0) {
        this.s = $$0;
    }

    static {
        o = -1;
    }
}

