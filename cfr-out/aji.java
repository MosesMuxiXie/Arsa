/*
 * Decompiled with CFR 0.152.
 */
public class aji
implements aay<aib> {
    public static final aao<wx, aji> a = aay.a(aji::a, aji::new);
    private final is b;
    private final iz c;
    private final a d;
    private final int e;

    public aji(a $$0, is $$1, iz $$2, int $$3) {
        this.d = $$0;
        this.b = $$1.j();
        this.c = $$2;
        this.e = $$3;
    }

    public aji(a $$0, is $$1, iz $$2) {
        this($$0, $$1, $$2, 0);
    }

    private aji(wx $$0) {
        this.d = $$0.b(a.class);
        this.b = $$0.e();
        this.c = iz.a($$0.readUnsignedByte());
        this.e = $$0.l();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.d);
        $$0.a(this.b);
        $$0.l(this.c.d());
        $$0.c(this.e);
    }

    @Override
    public aba<aji> a() {
        return ahz.bZ;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public is b() {
        return this.b;
    }

    public iz e() {
        return this.c;
    }

    public a f() {
        return this.d;
    }

    public int g() {
        return this.e;
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
        public static final /* enum */ a h = new a();
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            i = aji$a.a();
        }
    }
}

