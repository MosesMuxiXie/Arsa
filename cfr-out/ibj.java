/*
 * Decompiled with CFR 0.152.
 */
public abstract class ibj<S extends idf, M extends gzm<? super S>> {
    private final hyq<S, M> a;

    public ibj(hyq<S, M> $$0) {
        this.a = $$0;
    }

    protected static <S extends ieh> void a(gzp<? super S> $$0, amo $$1, fzm $$2, hpo $$3, int $$4, S $$5, int $$6, int $$7) {
        if (!$$5.Q) {
            ibj.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }

    protected static <S extends ieh> void b(gzp<? super S> $$0, amo $$1, fzm $$2, hpo $$3, int $$4, S $$5, int $$6, int $$7) {
        $$3.a($$7).a($$0, $$5, $$2, ijt.g($$1), $$4, hxs.a($$5, 0.0f), $$6, null, $$5.U, null);
    }

    public M d() {
        return this.a.c();
    }

    public abstract void a(fzm var1, hpo var2, int var3, S var4, float var5, float var6);
}

