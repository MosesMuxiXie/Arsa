/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.LongFunction;

public class evp
extends eur {
    private final bgr d;
    private int e;

    public evp(bgr $$0) {
        super(0L);
        this.d = $$0;
    }

    public int l() {
        return this.e;
    }

    @Override
    public bgr d() {
        return this.d.d();
    }

    @Override
    public evd e() {
        return this.d.e();
    }

    @Override
    public int c(int $$0) {
        ++this.e;
        bgr bgr2 = this.d;
        if (bgr2 instanceof eur) {
            eur $$1 = (eur)bgr2;
            return $$1.c($$0);
        }
        return (int)(this.d.g() >>> 64 - $$0);
    }

    @Override
    public synchronized void b(long $$0) {
        if (this.d == null) {
            return;
        }
        this.d.b($$0);
    }

    public long a(long $$0, int $$1, int $$2) {
        this.b($$0);
        long $$3 = this.g() | 1L;
        long $$4 = this.g() | 1L;
        long $$5 = (long)$$1 * $$3 + (long)$$2 * $$4 ^ $$0;
        this.b($$5);
        return $$5;
    }

    public void b(long $$0, int $$1, int $$2) {
        long $$3 = $$0 + (long)$$1 + (long)(10000 * $$2);
        this.b($$3);
    }

    public void c(long $$0, int $$1, int $$2) {
        this.b($$0);
        long $$3 = this.g();
        long $$4 = this.g();
        long $$5 = (long)$$1 * $$3 ^ (long)$$2 * $$4 ^ $$0;
        this.b($$5);
    }

    public void a(long $$0, int $$1, int $$2, int $$3) {
        long $$4 = (long)$$1 * 341873128712L + (long)$$2 * 132897987541L + $$0 + (long)$$3;
        this.b($$4);
    }

    public static bgr a(int $$0, int $$1, long $$2, long $$3) {
        return bgr.a($$2 + (long)($$0 * $$0 * 4987142) + (long)($$0 * 5947611) + (long)($$1 * $$1) * 4392871L + (long)($$1 * 389711) ^ $$3);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(eur::new);
        public static final /* enum */ a b = new a(evr::new);
        private final LongFunction<bgr> c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(LongFunction<bgr> $$0) {
            this.c = $$0;
        }

        public bgr a(long $$0) {
            return this.c.apply($$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = evp$a.a();
        }
    }
}

