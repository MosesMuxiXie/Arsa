/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 */
import org.joml.Vector2i;

public class gft {
    private double a;
    private double b;

    public Vector2i a(double $$0, double $$1) {
        if (this.a != 0.0 && Math.signum($$0) != Math.signum(this.a)) {
            this.a = 0.0;
        }
        if (this.b != 0.0 && Math.signum($$1) != Math.signum(this.b)) {
            this.b = 0.0;
        }
        this.a += $$0;
        this.b += $$1;
        int $$2 = (int)this.a;
        int $$3 = (int)this.b;
        if ($$2 == 0 && $$3 == 0) {
            return new Vector2i(0, 0);
        }
        this.a -= (double)$$2;
        this.b -= (double)$$3;
        return new Vector2i($$2, $$3);
    }

    public static int a(double $$0, int $$1, int $$2) {
        int $$3 = (int)Math.signum($$0);
        $$1 -= $$3;
        for ($$1 = Math.max(-1, $$1); $$1 < 0; $$1 += $$2) {
        }
        while ($$1 >= $$2) {
            $$1 -= $$2;
        }
        return $$1;
    }
}

