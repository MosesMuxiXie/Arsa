/*
 * Decompiled with CFR 0.152.
 */
public class hoy {
    private int a;
    private int b;
    private int c;
    private int d;

    public hoy(int $$0, int $$1, int $$2, int $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public hoy a(hoy $$0) {
        int $$1 = this.a;
        int $$2 = this.b;
        int $$3 = this.a + this.c;
        int $$4 = this.b + this.d;
        int $$5 = $$0.a();
        int $$6 = $$0.b();
        int $$7 = $$5 + $$0.c();
        int $$8 = $$6 + $$0.d();
        this.a = Math.max($$1, $$5);
        this.b = Math.max($$2, $$6);
        this.c = Math.max(0, Math.min($$3, $$7) - this.a);
        this.d = Math.max(0, Math.min($$4, $$8) - this.b);
        return this;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(int $$0) {
        this.a = $$0;
    }

    public void b(int $$0) {
        this.b = $$0;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void c(int $$0) {
        this.c = $$0;
    }

    public void d(int $$0) {
        this.d = $$0;
    }

    public void a(int $$0, int $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public boolean b(int $$0, int $$1) {
        return $$0 >= this.a && $$0 <= this.a + this.c && $$1 >= this.b && $$1 <= this.b + this.d;
    }
}

