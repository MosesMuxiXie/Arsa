/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class fll {
    private fln[] a = new fln[128];
    private int b;

    public fln a(fln $$0) {
        if ($$0.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            fln[] $$1 = new fln[this.b << 1];
            System.arraycopy(this.a, 0, $$1, 0, this.b);
            this.a = $$1;
        }
        this.a[this.b] = $$0;
        $$0.d = this.b;
        this.a(this.b++);
        return $$0;
    }

    public void a() {
        this.b = 0;
    }

    public fln b() {
        return this.a[0];
    }

    public fln c() {
        fln $$0 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        $$0.d = -1;
        return $$0;
    }

    public void b(fln $$0) {
        this.a[$$0.d] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > $$0.d) {
            if (this.a[$$0.d].g < $$0.g) {
                this.a($$0.d);
            } else {
                this.b($$0.d);
            }
        }
        $$0.d = -1;
    }

    public void a(fln $$0, float $$1) {
        float $$2 = $$0.g;
        $$0.g = $$1;
        if ($$1 < $$2) {
            this.a($$0.d);
        } else {
            this.b($$0.d);
        }
    }

    public int d() {
        return this.b;
    }

    private void a(int $$0) {
        fln $$1 = this.a[$$0];
        float $$2 = $$1.g;
        while ($$0 > 0) {
            int $$3 = $$0 - 1 >> 1;
            fln $$4 = this.a[$$3];
            if (!($$2 < $$4.g)) break;
            this.a[$$0] = $$4;
            $$4.d = $$0;
            $$0 = $$3;
        }
        this.a[$$0] = $$1;
        $$1.d = $$0;
    }

    private void b(int $$0) {
        fln $$1 = this.a[$$0];
        float $$2 = $$1.g;
        while (true) {
            float $$10;
            fln $$9;
            int $$3 = 1 + ($$0 << 1);
            int $$4 = $$3 + 1;
            if ($$3 >= this.b) break;
            fln $$5 = this.a[$$3];
            float $$6 = $$5.g;
            if ($$4 >= this.b) {
                Object $$7 = null;
                float $$8 = Float.POSITIVE_INFINITY;
            } else {
                $$9 = this.a[$$4];
                $$10 = $$9.g;
            }
            if ($$6 < $$10) {
                if (!($$6 < $$2)) break;
                this.a[$$0] = $$5;
                $$5.d = $$0;
                $$0 = $$3;
                continue;
            }
            if (!($$10 < $$2)) break;
            this.a[$$0] = $$9;
            $$9.d = $$0;
            $$0 = $$4;
        }
        this.a[$$0] = $$1;
        $$1.d = $$0;
    }

    public boolean e() {
        return this.b == 0;
    }

    public fln[] f() {
        return Arrays.copyOf(this.a, this.b);
    }
}

