/*
 * Decompiled with CFR 0.152.
 */
public class cgg {
    public static final cgg a = new cgg(0.75f, 0.5f, 0.25f);
    public static final cgg b = new cgg(0.95f, 0.69f, 0.32f);
    private final float c;
    private final float d;
    private final float e;

    private cgg(float $$0, float $$1, float $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public a a(float $$0) {
        if ($$0 < this.e) {
            return cgg$a.d;
        }
        if ($$0 < this.d) {
            return cgg$a.c;
        }
        if ($$0 < this.c) {
            return cgg$a.b;
        }
        return cgg$a.a;
    }

    public a a(dlt $$0) {
        if (!$$0.m()) {
            return cgg$a.a;
        }
        return this.a($$0.o(), $$0.p());
    }

    public a a(int $$0, int $$1) {
        return this.a((float)($$1 - $$0) / (float)$$1);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cgg$a.a();
        }
    }
}

