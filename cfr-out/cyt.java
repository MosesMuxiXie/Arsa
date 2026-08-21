/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cyt<T extends cyn> {
    private static cyt<?>[] l = new cyt[0];
    public static final cyt<cyj> a = cyt.a(cyj.class, "HoldingPattern");
    public static final cyt<cyr> b = cyt.a(cyr.class, "StrafePlayer");
    public static final cyt<cyl> c = cyt.a(cyl.class, "LandingApproach");
    public static final cyt<cym> d = cyt.a(cym.class, "Landing");
    public static final cyt<cys> e = cyt.a(cys.class, "Takeoff");
    public static final cyt<cyp> f = cyt.a(cyp.class, "SittingFlaming");
    public static final cyt<cyq> g = cyt.a(cyq.class, "SittingScanning");
    public static final cyt<cyo> h = cyt.a(cyo.class, "SittingAttacking");
    public static final cyt<cyh> i = cyt.a(cyh.class, "ChargingPlayer");
    public static final cyt<cyi> j = cyt.a(cyi.class, "Dying");
    public static final cyt<cyk> k = cyt.a(cyk.class, "Hover");
    private final Class<? extends cyn> m;
    private final int n;
    private final String o;

    private cyt(int $$0, Class<? extends cyn> $$1, String $$2) {
        this.n = $$0;
        this.m = $$1;
        this.o = $$2;
    }

    public cyn a(cyc $$0) {
        try {
            Constructor<cyn> $$1 = this.a();
            return $$1.newInstance($$0);
        }
        catch (Exception $$2) {
            throw new Error($$2);
        }
    }

    protected Constructor<? extends cyn> a() throws NoSuchMethodException {
        return this.m.getConstructor(cyc.class);
    }

    public int b() {
        return this.n;
    }

    public String toString() {
        return this.o + " (#" + this.n + ")";
    }

    public static cyt<?> a(int $$0) {
        if ($$0 < 0 || $$0 >= l.length) {
            return a;
        }
        return l[$$0];
    }

    public static int c() {
        return l.length;
    }

    private static <T extends cyn> cyt<T> a(Class<T> $$0, String $$1) {
        cyt<T> $$2 = new cyt<T>(l.length, $$0, $$1);
        l = Arrays.copyOf(l, l.length + 1);
        cyt.l[$$2.b()] = $$2;
        return $$2;
    }
}

