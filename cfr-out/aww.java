/*
 * Decompiled with CFR 0.152.
 */
class aww
extends awn {
    private static final int a = awh.b + 1;
    private final aws b;
    private final dxl c;

    public aww(aws $$0, dxl $$1) {
        super(a + 1, 16, 256);
        this.b = $$0;
        this.c = $$1;
        $$1.a(this::b);
    }

    @Override
    protected int b(long $$0) {
        return this.c.a($$0, false);
    }

    @Override
    protected int c(long $$0) {
        awg $$1;
        if (!this.b.a($$0) && ($$1 = this.b.b($$0)) != null) {
            return $$1.j();
        }
        return a;
    }

    @Override
    protected void a(long $$0, int $$1) {
        int $$3;
        awg $$2 = this.b.b($$0);
        int n2 = $$3 = $$2 == null ? a : $$2.j();
        if ($$3 == $$1) {
            return;
        }
        if (($$2 = this.b.a($$0, $$1, $$2, $$3)) != null) {
            this.b.b.add($$2);
        }
    }

    public int a(int $$0) {
        return this.b($$0);
    }
}

