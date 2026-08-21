/*
 * Decompiled with CFR 0.152.
 */
public interface dxd {
    public <T> fve<T> a(is var1, T var2, int var3, fvi var4);

    public <T> fve<T> a(is var1, T var2, int var3);

    public fva<dzq> af();

    default public void a(is $$0, dzq $$1, int $$2, fvi $$3) {
        this.af().a(this.a($$0, (Object)$$1, $$2, $$3));
    }

    default public void a(is $$0, dzq $$1, int $$2) {
        this.af().a(this.a($$0, (Object)$$1, $$2));
    }

    public fva<fla> ae();

    default public void a(is $$0, fla $$1, int $$2, fvi $$3) {
        this.ae().a(this.a($$0, (Object)$$1, $$2, $$3));
    }

    default public void a(is $$0, fla $$1, int $$2) {
        this.ae().a(this.a($$0, (Object)$$1, $$2));
    }
}

