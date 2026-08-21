/*
 * Decompiled with CFR 0.152.
 */
public class cjo
implements cje<chl> {
    private final int a;
    private final int b;
    private cjd.a c = cjd.a.a;
    private long d;

    public cjo(int $$0, int $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public cjd.a a() {
        return this.c;
    }

    @Override
    public final boolean e(axf $$0, chl $$1, long $$2) {
        this.c = cjd.a.b;
        int $$3 = this.a + $$0.G_().a(this.b + 1 - this.a);
        this.d = $$2 + (long)$$3;
        return true;
    }

    @Override
    public final void f(axf $$0, chl $$1, long $$2) {
        if ($$2 > this.d) {
            this.g($$0, $$1, $$2);
        }
    }

    @Override
    public final void g(axf $$0, chl $$1, long $$2) {
        this.c = cjd.a.a;
    }

    @Override
    public String b() {
        return this.getClass().getSimpleName();
    }
}

