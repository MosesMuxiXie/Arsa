/*
 * Decompiled with CFR 0.152.
 */
public class iw {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int l;
    private int m;
    private int n;
    private int o;

    public iw(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3 - $$0 + 1;
        this.i = $$4 - $$1 + 1;
        this.j = $$5 - $$2 + 1;
        this.k = this.h * this.i * this.j;
    }

    public boolean a() {
        if (this.l == this.k) {
            return false;
        }
        this.m = this.l % this.h;
        int $$0 = this.l / this.h;
        this.n = $$0 % this.i;
        this.o = $$0 / this.i;
        ++this.l;
        return true;
    }

    public int b() {
        return this.e + this.m;
    }

    public int c() {
        return this.f + this.n;
    }

    public int d() {
        return this.g + this.o;
    }

    public int e() {
        int $$0 = 0;
        if (this.m == 0 || this.m == this.h - 1) {
            ++$$0;
        }
        if (this.n == 0 || this.n == this.i - 1) {
            ++$$0;
        }
        if (this.o == 0 || this.o == this.j - 1) {
            ++$$0;
        }
        return $$0;
    }
}

