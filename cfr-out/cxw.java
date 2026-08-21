/*
 * Decompiled with CFR 0.152.
 */
public class cxw {
    public static final amt<cxv> a = cxw.a(cxw$a.a);
    public static final amt<cxv> b = cxw.a(cxw$a.b);
    public static final amt<cxv> c = cxw.a(cxw$a.c);
    public static final amt<cxv> d = cxw.a(cxw$a.d);
    public static final amt<cxv> e = cxw.a(cxw$a.e);
    public static final amt<cxv> f = cxw.a(cxw$a.f);
    public static final amt<cxv> g = cxw.a(cxw$a.g);

    private static amt<cxv> a(a $$0) {
        return amt.a(mj.bC, amo.b($$0.a()));
    }

    public static void a(qr<cxv> $$0) {
        cxw.a($$0, a, cxw$a.a);
        cxw.a($$0, b, cxw$a.b);
        cxw.a($$0, c, cxw$a.c);
        cxw.a($$0, d, cxw$a.d);
        cxw.a($$0, e, cxw$a.e);
        cxw.a($$0, f, cxw$a.f);
        cxw.a($$0, g, cxw$a.g);
    }

    private static void a(qr<cxv> $$0, amt<cxv> $$1, a $$2) {
        $$0.a($$1, bda.Gh.get((Object)$$2));
    }

    public static jd<cxv> a(jr $$0, bgr $$1) {
        return $$0.f(mj.bC).a($$1).orElseThrow();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("classic", "");
        public static final /* enum */ a b = new a("puglin", "_puglin");
        public static final /* enum */ a c = new a("sad", "_sad");
        public static final /* enum */ a d = new a("angry", "_angry");
        public static final /* enum */ a e = new a("grumpy", "_grumpy");
        public static final /* enum */ a f = new a("big", "_big");
        public static final /* enum */ a g = new a("cute", "_cute");
        private final String h;
        private final String i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, String $$1) {
            this.h = $$0;
            this.i = $$1;
        }

        public String a() {
            return this.h;
        }

        public String b() {
            return this.i;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            j = cxw$a.c();
        }
    }
}

