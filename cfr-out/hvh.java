/*
 * Decompiled with CFR 0.152.
 */
@Deprecated
public abstract class hvh<T extends chn, S extends ieh, M extends gzm<? super S>>
extends hxx<T, S, M> {
    private final M a;
    private final M i;

    public hvh(hwq.a $$0, M $$1, M $$2, float $$3) {
        super($$0, $$1, $$3);
        this.a = $$1;
        this.i = $$2;
    }

    @Override
    public void a(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        this.f = ((ieh)$$0).aE ? this.i : this.a;
        super.a($$0, $$1, $$2, $$3);
    }
}

