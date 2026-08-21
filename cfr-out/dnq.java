/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dnq {
    public static final int a = 20;
    public static final dnq b = new dnq(List.of(), List.of(), List.of());
    private final List<dqo> c;
    private final List<b<dnp>> d;
    private final List<b<dlp>> e;

    dnq(List<dqo> $$0, List<b<dnp>> $$1, List<b<dlp>> $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public boolean a(dlt $$0) {
        return this.b($$0) || this.c($$0);
    }

    private boolean d(dlt $$0) {
        for (dqo $$1 : this.c) {
            if (!$$1.a($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean b(dlt $$0) {
        for (b<dlp> $$1 : this.e) {
            if (!$$1.b.a($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean c(dlt $$0) {
        for (b<dnp> $$1 : this.d) {
            if (!$$1.b.a($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean a(jd<dnp> $$0) {
        for (b<dnp> $$1 : this.d) {
            if (!$$1.c.a($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean a(dlt $$0, dlt $$1) {
        if (!this.d($$0)) {
            return false;
        }
        return this.b($$0, $$1) || this.c($$0, $$1);
    }

    public boolean b(dlt $$0, dlt $$1) {
        for (b<dlp> $$2 : this.e) {
            if (!$$0.a($$2.a) || !$$2.b.a($$1)) continue;
            return true;
        }
        return false;
    }

    public boolean c(dlt $$0, dlt $$1) {
        Optional<jd<dnp>> $$2 = $$0.a(ki.Y, dnr.a).e();
        if ($$2.isEmpty()) {
            return false;
        }
        for (b<dnp> $$3 : this.d) {
            if (!$$3.a.a($$2.get()) || !$$3.b.a($$1)) continue;
            return true;
        }
        return false;
    }

    public dlt d(dlt $$0, dlt $$1) {
        if ($$1.f()) {
            return $$1;
        }
        Optional<jd<dnp>> $$2 = $$1.a(ki.Y, dnr.a).e();
        if ($$2.isEmpty()) {
            return $$1;
        }
        for (b<dlp> b2 : this.e) {
            if (!$$1.a(b2.a) || !b2.b.a($$0)) continue;
            return dnr.a((dlp)b2.c.a(), $$2.get());
        }
        for (b<dgw> b3 : this.d) {
            if (!b3.a.a($$2.get()) || !b3.b.a($$0)) continue;
            return dnr.a($$1.h(), b3.c);
        }
        return $$1;
    }

    public static dnq a(dgz $$0) {
        a $$1 = new a($$0);
        dnq.a($$1);
        return $$1.a();
    }

    public static void a(a $$0) {
        $$0.a(dlx.up);
        $$0.a(dlx.xD);
        $$0.a(dlx.xG);
        $$0.a(dlx.up, dlx.ra, dlx.xD);
        $$0.a(dlx.xD, dlx.xC, dlx.xG);
        $$0.a(dns.a, dlx.tc, dns.c);
        $$0.a(dns.a, dlx.mB, dns.b);
        $$0.a(dns.a, dlx.un, dns.d);
        $$0.a(dlx.wm, dns.Q);
        $$0.a(dlx.mI, dns.S);
        $$0.a(dlx.b, dns.T);
        $$0.a(dlx.cT, dns.R);
        $$0.a(dns.d, dlx.ww, dns.e);
        $$0.a(dns.e, dlx.mB, dns.f);
        $$0.a(dns.e, dlx.ur, dns.g);
        $$0.a(dns.f, dlx.ur, dns.h);
        $$0.a(dns.g, dlx.mB, dns.h);
        $$0.a(dlx.ut, dns.l);
        $$0.a(dns.l, dlx.mB, dns.m);
        $$0.a(dlx.wQ, dns.i);
        $$0.a(dns.i, dlx.mB, dns.j);
        $$0.a(dns.i, dlx.tc, dns.k);
        $$0.a(dns.i, dlx.ur, dns.q);
        $$0.a(dns.j, dlx.ur, dns.r);
        $$0.a(dns.q, dlx.mB, dns.r);
        $$0.a(dns.q, dlx.tc, dns.s);
        $$0.a(dns.d, dlx.pP, dns.t);
        $$0.a(dns.t, dlx.mB, dns.u);
        $$0.a(dns.t, dlx.tc, dns.v);
        $$0.a(dns.n, dlx.ur, dns.q);
        $$0.a(dns.o, dlx.ur, dns.r);
        $$0.a(dlx.tE, dns.n);
        $$0.a(dns.n, dlx.mB, dns.o);
        $$0.a(dns.n, dlx.tc, dns.p);
        $$0.a(dns.d, dlx.tg, dns.w);
        $$0.a(dns.w, dlx.mB, dns.x);
        $$0.a(dlx.ux, dns.y);
        $$0.a(dns.y, dlx.tc, dns.z);
        $$0.a(dns.y, dlx.ur, dns.A);
        $$0.a(dns.z, dlx.ur, dns.B);
        $$0.a(dns.A, dlx.tc, dns.B);
        $$0.a(dns.C, dlx.ur, dns.A);
        $$0.a(dns.D, dlx.ur, dns.A);
        $$0.a(dns.E, dlx.ur, dns.B);
        $$0.a(dlx.uq, dns.C);
        $$0.a(dns.C, dlx.mB, dns.D);
        $$0.a(dns.C, dlx.tc, dns.E);
        $$0.a(dlx.ul, dns.F);
        $$0.a(dns.F, dlx.mB, dns.G);
        $$0.a(dns.F, dlx.tc, dns.H);
        $$0.a(dlx.us, dns.I);
        $$0.a(dns.I, dlx.mB, dns.J);
        $$0.a(dns.I, dlx.tc, dns.K);
        $$0.a(dns.a, dlx.ur, dns.L);
        $$0.a(dns.L, dlx.mB, dns.M);
        $$0.a(dns.d, dlx.pp, dns.O);
        $$0.a(dns.O, dlx.mB, dns.P);
    }

    static final class b<T>
    extends Record {
        final jd<T> a;
        final dqo b;
        final jd<T> c;

        b(jd<T> $$0, dqo $$1, jd<T> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "from;ingredient;to", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "from;ingredient;to", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "from;ingredient;to", "a", "b", "c"}, this, $$0);
        }

        public jd<T> a() {
            return this.a;
        }

        public dqo b() {
            return this.b;
        }

        public jd<T> c() {
            return this.c;
        }
    }

    public static class a {
        private final List<dqo> a = new ArrayList<dqo>();
        private final List<b<dnp>> b = new ArrayList<b<dnp>>();
        private final List<b<dlp>> c = new ArrayList<b<dlp>>();
        private final dgz d;

        public a(dgz $$0) {
            this.d = $$0;
        }

        private static void b(dlp $$0) {
            if (!($$0 instanceof dmm)) {
                throw new IllegalArgumentException("Expected a potion, got: " + String.valueOf(mi.h.b($$0)));
            }
        }

        public void a(dlp $$0, dlp $$1, dlp $$2) {
            if (!($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d))) {
                return;
            }
            dnq$a.b($$0);
            dnq$a.b($$2);
            this.c.add(new b<dlp>($$0.e(), dqo.a((dwn)$$1), $$2.e()));
        }

        public void a(dlp $$0) {
            if (!$$0.a(this.d)) {
                return;
            }
            dnq$a.b($$0);
            this.a.add(dqo.a((dwn)$$0));
        }

        public void a(jd<dnp> $$0, dlp $$1, jd<dnp> $$2) {
            if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
                this.b.add(new b<dnp>($$0, dqo.a((dwn)$$1), $$2));
            }
        }

        public void a(dlp $$0, jd<dnp> $$1) {
            if ($$1.a().a(this.d)) {
                this.a(dns.a, $$0, dns.b);
                this.a(dns.d, $$0, $$1);
            }
        }

        public dnq a() {
            return new dnq(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
        }
    }
}

