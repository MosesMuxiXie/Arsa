/*
 * Decompiled with CFR 0.152.
 */
public abstract class hxx<T extends chn, S extends ieh, M extends gzm<? super S>>
extends hxs<T, S, M> {
    public hxx(hwq.a $$0, M $$1, float $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected boolean a(T $$0, double $$1) {
        return super.a($$0, $$1) && (((chl)$$0).de() || ((cgk)$$0).i_() && $$0 == this.c.c);
    }

    @Override
    protected float g(S $$0) {
        return super.g($$0) * ((ieh)$$0).aA;
    }

    protected static boolean a(cgk $$0, String $$1) {
        yh $$2 = $$0.as();
        return $$2 != null && $$1.equals($$2.getString());
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.g((ieh)idf2);
    }
}

