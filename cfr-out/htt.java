/*
 * Decompiled with CFR 0.152.
 */
public final class htt {
    private int a;
    private int b;
    private int c;

    public static htt a(ftm $$0, long $$1) {
        return new htt().b($$0, $$1);
    }

    public htt b(ftm $$0, long $$1) {
        this.a = htt.a($$0.a(), jw.b($$1));
        this.b = htt.a($$0.b(), jw.c($$1));
        this.c = htt.a($$0.c(), jw.d($$1));
        return this;
    }

    private static int a(double $$0, int $$1) {
        int $$2 = jw.b($$0) - $$1;
        return bgj.a($$2, -1, 1);
    }

    public boolean a() {
        return this.a == 0 || this.b == 0 || this.c == 0;
    }

    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if ($$0 instanceof htt) {
            htt $$1 = (htt)$$0;
            return this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
        }
        return false;
    }
}

