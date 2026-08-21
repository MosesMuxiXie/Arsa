/*
 * Decompiled with CFR 0.152.
 */
public class hpm
implements fzp {
    private final fzp a;
    private final ilp b;

    public hpm(fzp $$0, ilp $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public fzp a(float $$0, float $$1, float $$2) {
        return this.a.a($$0, $$1, $$2);
    }

    @Override
    public fzp a(int $$0, int $$1, int $$2, int $$3) {
        return this.a.a($$0, $$1, $$2, $$3);
    }

    @Override
    public fzp a(int $$0) {
        return this.a.a($$0);
    }

    @Override
    public fzp a(float $$0, float $$1) {
        return this.a.a(this.b.a($$0), this.b.b($$1));
    }

    @Override
    public fzp a(int $$0, int $$1) {
        return this.a.a($$0, $$1);
    }

    @Override
    public fzp b(int $$0, int $$1) {
        return this.a.b($$0, $$1);
    }

    @Override
    public fzp b(float $$0, float $$1, float $$2) {
        return this.a.b($$0, $$1, $$2);
    }

    @Override
    public fzp a(float $$0) {
        this.a.a($$0);
        return this;
    }

    @Override
    public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
        this.a.a($$0, $$1, $$2, $$3, this.b.a($$4), this.b.b($$5), $$6, $$7, $$8, $$9, $$10);
    }
}

