/*
 * Decompiled with CFR 0.152.
 */
public class bep {
    private final int a;
    private final bfj b;
    private int c;
    private int d;

    public bep(int $$0, bfj $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public bep(int $$0) {
        this($$0, bfj.d);
    }

    public void a(boolean $$0) {
        this.d = this.c;
        if ($$0) {
            if (this.c < this.a) {
                ++this.c;
            }
        } else if (this.c > 0) {
            --this.c;
        }
    }

    public float a(float $$0) {
        float $$1 = bgj.h($$0, this.d, this.c) / (float)this.a;
        return this.b.apply($$1);
    }
}

