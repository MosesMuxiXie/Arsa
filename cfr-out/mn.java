/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class mn {
    private final dzq a;
    final Map<b, dzq> b = Maps.newHashMap();
    boolean c = true;
    boolean d = true;
    @Nullable String e;
    @Nullable String f;

    mn(dzq $$0) {
        this.a = $$0;
    }

    public dzq a() {
        return this.a;
    }

    public Map<b, dzq> b() {
        return this.b;
    }

    public dzq a(b $$0) {
        return this.b.get((Object)$$0);
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public Optional<String> e() {
        if (bhi.h(this.e)) {
            return Optional.empty();
        }
        return Optional.of(this.e);
    }

    public Optional<String> f() {
        if (bhi.h(this.f)) {
            return Optional.empty();
        }
        return Optional.of(this.f);
    }

    public static class a {
        private final mn a;

        public a(dzq $$0) {
            this.a = new mn($$0);
        }

        public mn a() {
            return this.a;
        }

        public a a(dzq $$0) {
            this.a.b.put(mn$b.a, $$0);
            return this;
        }

        public a b(dzq $$0) {
            this.a.b.put(mn$b.b, $$0);
            return this;
        }

        public a c(dzq $$0) {
            this.a.b.put(mn$b.j, $$0);
            return this;
        }

        public a d(dzq $$0) {
            this.a.b.put(mn$b.c, $$0);
            return this;
        }

        public a e(dzq $$0) {
            this.a.b.put(mn$b.d, $$0);
            return this;
        }

        public a f(dzq $$0) {
            this.a.b.put(mn$b.e, $$0);
            return this;
        }

        public a g(dzq $$0) {
            this.a.b.put(mn$b.f, $$0);
            return this;
        }

        public a h(dzq $$0) {
            this.a.b.put(mn$b.g, $$0);
            return this;
        }

        public a i(dzq $$0) {
            this.a.b.put(mn$b.h, $$0);
            return this;
        }

        public a j(dzq $$0) {
            this.a.b.put(mn$b.i, $$0);
            return this;
        }

        public a a(dzq $$0, dzq $$1) {
            this.a.b.put(mn$b.k, $$0);
            this.a.b.put(mn$b.r, $$1);
            return this;
        }

        public a k(dzq $$0) {
            this.a.b.put(mn$b.l, $$0);
            return this;
        }

        public a l(dzq $$0) {
            this.a.b.put(mn$b.m, $$0);
            return this;
        }

        public a m(dzq $$0) {
            this.a.b.put(mn$b.n, $$0);
            return this;
        }

        public a n(dzq $$0) {
            this.a.b.put(mn$b.o, $$0);
            return this;
        }

        public a o(dzq $$0) {
            this.a.b.put(mn$b.p, $$0);
            return this;
        }

        public a p(dzq $$0) {
            this.a.b.put(mn$b.q, $$0);
            return this;
        }

        public a b() {
            this.a.c = false;
            return this;
        }

        public a c() {
            this.a.d = false;
            return this;
        }

        public a a(String $$0) {
            this.a.e = $$0;
            return this;
        }

        public a b(String $$0) {
            this.a.f = $$0;
            return this;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("button");
        public static final /* enum */ b b = new b("chiseled");
        public static final /* enum */ b c = new b("cracked");
        public static final /* enum */ b d = new b("cut");
        public static final /* enum */ b e = new b("door");
        public static final /* enum */ b f = new b("fence");
        public static final /* enum */ b g = new b("fence");
        public static final /* enum */ b h = new b("fence_gate");
        public static final /* enum */ b i = new b("fence_gate");
        public static final /* enum */ b j = new b("mosaic");
        public static final /* enum */ b k = new b("sign");
        public static final /* enum */ b l = new b("slab");
        public static final /* enum */ b m = new b("stairs");
        public static final /* enum */ b n = new b("pressure_plate");
        public static final /* enum */ b o = new b("polished");
        public static final /* enum */ b p = new b("trapdoor");
        public static final /* enum */ b q = new b("wall");
        public static final /* enum */ b r = new b("wall_sign");
        private final String s;
        private static final /* synthetic */ b[] t;

        public static b[] values() {
            return (b[])t.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.s = $$0;
        }

        public String a() {
            return this.s;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
        }

        static {
            t = mn$b.b();
        }
    }
}

