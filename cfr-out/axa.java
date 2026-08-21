/*
 * Decompiled with CFR 0.152.
 */
public abstract class axa
extends fkn {
    protected axa(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void a(long $$0, int $$1, boolean $$2) {
        if ($$2 && $$1 >= this.f - 2) {
            return;
        }
        for (int $$3 = -1; $$3 <= 1; ++$$3) {
            for (int $$4 = -1; $$4 <= 1; ++$$4) {
                for (int $$5 = -1; $$5 <= 1; ++$$5) {
                    long $$6 = jw.a($$0, $$3, $$4, $$5);
                    if ($$6 == $$0) continue;
                    this.b($$0, $$6, $$1, $$2);
                }
            }
        }
    }

    @Override
    protected int a(long $$0, long $$1, int $$2) {
        int $$3 = $$2;
        for (int $$4 = -1; $$4 <= 1; ++$$4) {
            for (int $$5 = -1; $$5 <= 1; ++$$5) {
                for (int $$6 = -1; $$6 <= 1; ++$$6) {
                    long $$7 = jw.a($$0, $$4, $$5, $$6);
                    if ($$7 == $$0) {
                        $$7 = Long.MAX_VALUE;
                    }
                    if ($$7 == $$1) continue;
                    int $$8 = this.b($$7, $$0, this.c($$7));
                    if ($$3 > $$8) {
                        $$3 = $$8;
                    }
                    if ($$3 != 0) continue;
                    return $$3;
                }
            }
        }
        return $$3;
    }

    @Override
    protected int b(long $$0, long $$1, int $$2) {
        if (this.a($$0)) {
            return this.b($$1);
        }
        return $$2 + 1;
    }

    protected abstract int b(long var1);

    public void b(long $$0, int $$1, boolean $$2) {
        this.a(Long.MAX_VALUE, $$0, $$1, $$2);
    }
}

