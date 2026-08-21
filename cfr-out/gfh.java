/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gfh
implements Comparable<gfh> {
    private static final Map<String, gfh> b = Maps.newHashMap();
    private static final Map<fyc.a, List<gfh>> c = Maps.newHashMap();
    private final String d;
    private final fyc.a e;
    private final a f;
    protected fyc.a a;
    private boolean g;
    private int h;
    private final int i;

    public static void a(fyc.a $$02) {
        gfh.a($$02, (gfh $$0) -> ++$$0.h);
    }

    public static void a(fyc.a $$0, boolean $$12) {
        gfh.a($$0, (gfh $$1) -> $$1.a($$12));
    }

    private static void a(fyc.a $$0, Consumer<gfh> $$1) {
        List<gfh> $$2 = c.get($$0);
        if ($$2 != null && !$$2.isEmpty()) {
            for (gfh $$3 : $$2) {
                $$1.accept($$3);
            }
        }
    }

    public static void a() {
        fyk $$0 = gfj.V().aR();
        for (gfh $$1 : b.values()) {
            if (!$$1.j()) continue;
            $$1.a(fyc.a($$0, $$1.a.b()));
        }
    }

    public static void b() {
        for (gfh $$0 : b.values()) {
            $$0.i();
        }
    }

    public static void c() {
        for (gfh $$0 : b.values()) {
            gfw $$1;
            if (!($$0 instanceof gfw) || !($$1 = (gfw)$$0).q()) continue;
            $$1.a(true);
        }
    }

    public static void d() {
        for (gfh $$0 : b.values()) {
            if (!($$0 instanceof gfw)) continue;
            gfw $$1 = (gfw)$$0;
            $$1.r();
        }
    }

    public static void e() {
        c.clear();
        for (gfh $$0 : b.values()) {
            $$0.c($$0.a);
        }
    }

    public gfh(String $$0, int $$1, a $$2) {
        this($$0, fyc.b.a, $$1, $$2);
    }

    public gfh(String $$0, fyc.b $$1, int $$2, a $$3) {
        this($$0, $$1, $$2, $$3, 0);
    }

    public gfh(String $$0, fyc.b $$1, int $$2, a $$3, int $$4) {
        this.d = $$0;
        this.e = this.a = $$1.a($$2);
        this.f = $$3;
        this.i = $$4;
        b.put($$0, this);
        this.c(this.a);
    }

    public boolean f() {
        return this.g;
    }

    public a g() {
        return this.f;
    }

    public boolean h() {
        if (this.h == 0) {
            return false;
        }
        --this.h;
        return true;
    }

    protected void i() {
        this.h = 0;
        this.a(false);
    }

    protected boolean j() {
        return this.a.a() == fyc.b.a && this.a.b() != fyc.bF.b();
    }

    public String k() {
        return this.d;
    }

    public fyc.a l() {
        return this.e;
    }

    public void b(fyc.a $$0) {
        this.a = $$0;
    }

    public int a(gfh $$0) {
        if (this.f == $$0.f) {
            if (this.i == $$0.i) {
                return imu.a(this.d, new Object[0]).compareTo(imu.a($$0.d, new Object[0]));
            }
            return Integer.compare(this.i, $$0.i);
        }
        return Integer.compare(gfh$a.j.indexOf(this.f), gfh$a.j.indexOf($$0.f));
    }

    public static Supplier<yh> a(String $$0) {
        gfh $$1 = b.get($$0);
        if ($$1 == null) {
            return () -> yh.c($$0);
        }
        return $$1::n;
    }

    public boolean b(gfh $$0) {
        return this.a.equals($$0.a);
    }

    public boolean m() {
        return this.a.equals(fyc.bF);
    }

    public boolean a(gzb $$0) {
        if ($$0.t() == fyc.bF.b()) {
            return this.a.a() == fyc.b.b && this.a.b() == $$0.u();
        }
        return this.a.a() == fyc.b.a && this.a.b() == $$0.t();
    }

    public boolean a(gzc $$0) {
        return this.a.a() == fyc.b.c && this.a.b() == $$0.t();
    }

    public yh n() {
        return this.a.d();
    }

    public boolean o() {
        return this.a.equals(this.e);
    }

    public String p() {
        return this.a.c();
    }

    public void a(boolean $$0) {
        this.g = $$0;
    }

    private void c(fyc.a $$02) {
        c.computeIfAbsent($$02, $$0 -> new ArrayList()).add(this);
    }

    public static @Nullable gfh b(String $$0) {
        return b.get($$0);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((gfh)object);
    }

    public static final class a
    extends Record {
        private final amo i;
        static final List<a> j = new ArrayList<a>();
        public static final a a = gfh$a.a("movement");
        public static final a b = gfh$a.a("misc");
        public static final a c = gfh$a.a("multiplayer");
        public static final a d = gfh$a.a("gameplay");
        public static final a e = gfh$a.a("inventory");
        public static final a f = gfh$a.a("creative");
        public static final a g = gfh$a.a("spectator");
        public static final a h = gfh$a.a("debug");

        public a(amo $$0) {
            this.i = $$0;
        }

        private static a a(String $$0) {
            return gfh$a.a(amo.b($$0));
        }

        public static a a(amo $$0) {
            a $$1 = new a($$0);
            if (j.contains($$1)) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "Category '%s' is already registered.", $$0));
            }
            j.add($$1);
            return $$1;
        }

        public yh a() {
            return yh.c(this.i.h("key.category"));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id", "i"}, this, $$0);
        }

        public amo b() {
            return this.i;
        }
    }
}

