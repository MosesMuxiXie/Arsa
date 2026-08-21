/*
 * Decompiled with CFR 0.152.
 */
public class flw
extends fln {
    private float m = Float.MAX_VALUE;
    private fln n;
    private boolean o;

    public flw(fln $$0) {
        super($$0.a, $$0.b, $$0.c);
    }

    public flw(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    public void a(float $$0, fln $$1) {
        if ($$0 < this.m) {
            this.m = $$0;
            this.n = $$1;
        }
    }

    public fln d() {
        return this.n;
    }

    public void e() {
        this.o = true;
    }

    public boolean f() {
        return this.o;
    }

    public static flw c(wx $$0) {
        flw $$1 = new flw($$0.readInt(), $$0.readInt(), $$0.readInt());
        flw.a($$0, $$1);
        return $$1;
    }
}

