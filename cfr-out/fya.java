/*
 * Decompiled with CFR 0.152.
 */
public class fya {
    private static final int a = 60;
    private static final int b = 10;
    private static final int c = 30;
    private static final int d = 10;
    private static final long e = 60000L;
    private static final long f = 600000L;
    private final gfo g;
    private final gfj h;
    private int i;
    private long j;

    public fya(gfo $$0, gfj $$1) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$0.h().b();
    }

    public int a() {
        return switch (this.b().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.i;
            case 1 -> 10;
            case 2 -> 10;
            case 3 -> Math.min(this.i, 30);
            case 4 -> 60;
        };
    }

    public a b() {
        gff $$0 = this.g.j().b();
        if (this.h.aR().j()) {
            return fya$a.b;
        }
        if ($$0 == gff.b) {
            long $$1 = bhs.c() - this.j;
            if ($$1 > 600000L) {
                return fya$a.c;
            }
            if ($$1 > 60000L) {
                return fya$a.d;
            }
        }
        if (this.h.r == null && (this.h.x != null || this.h.aP() != null)) {
            return fya$a.e;
        }
        return fya$a.a;
    }

    public boolean c() {
        a $$0 = this.b();
        return $$0 == fya$a.b || $$0 == fya$a.c;
    }

    public void a(int $$0) {
        this.i = $$0;
    }

    public void d() {
        this.j = bhs.c();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = fya$a.a();
        }
    }
}

