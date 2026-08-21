/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.joml.Quaternionfc
 */
import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionfc;

public class hru
extends hrc {
    private static final String b = "plank";
    private static final String c = "vChains";
    private static final String d = "normalChains";
    private static final String e = "chainL1";
    private static final String f = "chainL2";
    private static final String g = "chainR1";
    private static final String h = "chainR2";
    private static final String i = "board";
    public static final float a = 1.0f;
    private static final float j = 0.9f;
    private static final ftm k = new ftm(0.0, -0.32f, 0.073f);
    private final Map<b, gzp.a> l;

    public hru(hrj.a $$02) {
        super($$02);
        Stream $$12 = epw.a().flatMap($$0 -> Arrays.stream(hru$a.values()).map($$1 -> new b((epw)$$0, (a)$$1)));
        this.l = (Map)$$12.collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$1 -> hru.a($$02.f(), $$1.a, $$1.b)));
    }

    public static gzp.a a(hdc $$0, epw $$1, a $$2) {
        return new gzp.a($$0.a(hdf.a($$1, $$2)), ijt::g);
    }

    @Override
    protected float a() {
        return 1.0f;
    }

    @Override
    protected float b() {
        return 0.9f;
    }

    public static void a(fzm $$0, float $$1) {
        $$0.a(0.5, 0.9375, 0.5);
        $$0.a((Quaternionfc)a.d.rotationDegrees($$1));
        $$0.a(0.0f, -0.3125f, 0.0f);
    }

    @Override
    protected void a(fzm $$0, float $$1, eoh $$2) {
        hru.a($$0, $$1);
    }

    @Override
    protected gzp.a a(eoh $$0, epw $$1) {
        a $$2 = hru$a.a($$0);
        return this.l.get(new b($$1, $$2));
    }

    @Override
    protected ins a(epw $$0) {
        return hpj.b($$0);
    }

    @Override
    protected ftm c() {
        return k;
    }

    public static void a(inu $$0, fzm $$1, hpo $$2, int $$3, int $$4, gzp.a $$5, ins $$6) {
        $$1.a();
        hru.a($$1, 0.0f);
        $$1.b(1.0f, -1.0f, -1.0f);
        $$2.a($$5, bhr.a, $$1, $$6.a($$5::a), $$3, $$4, -1, $$0.a($$6), ilg.d, null);
        $$1.b();
    }

    public static hdm a(a $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a(i, hdl.c().a(0, 12).a(-7.0f, 0.0f, -1.0f, 14.0f, 10.0f, 2.0f), hdi.a);
        if ($$0 == hru$a.a) {
            $$2.a(b, hdl.c().a(0, 0).a(-8.0f, -6.0f, -2.0f, 16.0f, 2.0f, 4.0f), hdi.a);
        }
        if ($$0 == hru$a.a || $$0 == hru$a.b) {
            hdq $$3 = $$2.a(d, hdl.c(), hdi.a);
            $$3.a(e, hdl.c().a(0, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), hdi.a(-5.0f, -6.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
            $$3.a(f, hdl.c().a(6, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), hdi.a(-5.0f, -6.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
            $$3.a(g, hdl.c().a(0, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), hdi.a(5.0f, -6.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
            $$3.a(h, hdl.c().a(6, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), hdi.a(5.0f, -6.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        }
        if ($$0 == hru$a.c) {
            $$2.a(c, hdl.c().a(14, 6).a(-6.0f, -6.0f, 0.0f, 12.0f, 6.0f, 0.0f), hdi.a);
        }
        return hdm.a($$1, 64, 32);
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("wall");
        public static final /* enum */ a b = new a("ceiling");
        public static final /* enum */ a c = new a("ceiling_middle");
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        public static a a(eoh $$0) {
            if ($$0.b() instanceof ear) {
                return $$0.c(eox.a) != false ? c : b;
            }
            return a;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            e = hru$a.a();
        }
    }

    public static final class b
    extends Record {
        final epw a;
        final a b;

        public b(epw $$0, a $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "woodType;attachmentType", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "woodType;attachmentType", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "woodType;attachmentType", "a", "b"}, this, $$0);
        }

        public epw a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }
    }
}

