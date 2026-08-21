/*
 * Decompiled with CFR 0.152.
 */
public abstract class iat<S extends idf, M extends gzm<S>>
extends ibj<S, M> {
    public iat(hyq<S, M> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        if (!this.a($$3)) {
            return;
        }
        float $$6 = ((idf)$$3).L;
        M $$7 = this.c();
        $$1.a(1).a($$7, $$3, $$0, ijt.b(this.a(), this.a($$6) % 1.0f, $$6 * 0.01f % 1.0f), $$2, ilg.d, -8355712, (ilp)null, ((idf)$$3).U, (igi.a)null);
    }

    protected abstract boolean a(S var1);

    protected abstract float a(float var1);

    protected abstract amo a();

    protected abstract M c();
}

