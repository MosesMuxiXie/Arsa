/*
 * Decompiled with CFR 0.152.
 */
public abstract class ckp<E extends chl>
implements cje<E>,
cmy<E> {
    private cjd.a a = cjd.a.a;

    @Override
    public final cjd.a a() {
        return this.a;
    }

    @Override
    public final boolean e(axf $$0, E $$1, long $$2) {
        if (this.trigger($$0, $$1, $$2)) {
            this.a = cjd.a.b;
            return true;
        }
        return false;
    }

    @Override
    public final void f(axf $$0, E $$1, long $$2) {
        this.g($$0, $$1, $$2);
    }

    @Override
    public final void g(axf $$0, E $$1, long $$2) {
        this.a = cjd.a.a;
    }

    @Override
    public String b() {
        return this.getClass().getSimpleName();
    }
}

