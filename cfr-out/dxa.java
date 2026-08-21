/*
 * Decompiled with CFR 0.152.
 */
public final class dxa
implements eqc {
    private final int a;
    private final eoh[] b;

    public dxa(int $$0, eoh[] $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public eoh a(int $$0) {
        int $$1 = $$0 - this.a;
        if ($$1 < 0 || $$1 >= this.b.length) {
            return dzs.a.m();
        }
        return this.b[$$1];
    }

    @Override
    public void a(int $$0, eoh $$1) {
        int $$2 = $$0 - this.a;
        if ($$2 < 0 || $$2 >= this.b.length) {
            throw new IllegalArgumentException("Outside of column height: " + $$0);
        }
        this.b[$$2] = $$1;
    }
}

