/*
 * Decompiled with CFR 0.152.
 */
public class ajj
implements aay<aib> {
    public static final aao<wx, ajj> a = aay.a(ajj::a, ajj::new);
    private final int b;
    private final a c;
    private final int d;

    public ajj(cgk $$0, a $$1) {
        this($$0, $$1, 0);
    }

    public ajj(cgk $$0, a $$1, int $$2) {
        this.b = $$0.aA();
        this.c = $$1;
        this.d = $$2;
    }

    private ajj(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.b(a.class);
        this.d = $$0.l();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
        $$0.c(this.d);
    }

    @Override
    public aba<ajj> a() {
        return ahz.ca;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public a e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            h = ajj$a.a();
        }
    }
}

