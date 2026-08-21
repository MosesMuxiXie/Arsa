/*
 * Decompiled with CFR 0.152.
 */
public class bhl {
    private final int a;
    private final int b;
    private int c;

    public bhl(int $$0, int $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public void a() {
        this.c += this.a;
    }

    public void b() {
        if (this.c > 0) {
            --this.c;
        }
    }

    public boolean c() {
        return this.c < this.b;
    }
}

