/*
 * Decompiled with CFR 0.152.
 */
public class ain
implements aay<aib> {
    public static final aao<wx, ain> a = aay.a(ain::a, ain::new);
    private final a b;

    public ain(a $$0) {
        this.b = $$0;
    }

    private ain(wx $$0) {
        this.b = $$0.b(a.class);
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<ain> a() {
        return ahz.bB;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public a b() {
        return this.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = ain$a.a();
        }
    }
}

