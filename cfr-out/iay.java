/*
 * Decompiled with CFR 0.152.
 */
public class iay<S extends idy, M extends gzo<S>, A extends gzo<S>>
extends ibj<S, M> {
    private final hvk<A> a;
    private final hvk<A> b;
    private final iau c;

    public iay(hyq<S, M> $$0, hvk<A> $$1, iau $$2) {
        this($$0, $$1, $$1, $$2);
    }

    public iay(hyq<S, M> $$0, hvk<A> $$1, hvk<A> $$2, iau $$3) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
    }

    public static boolean a(dlt $$0, cgv $$1) {
        dun $$2 = $$0.a(ki.H);
        return $$2 != null && iay.a($$2, $$1);
    }

    private static boolean a(dun $$0, cgv $$1) {
        return $$0.d().isPresent() && $$0.b() == $$1;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        this.a($$0, $$1, ((idy)$$3).aq, cgv.e, $$2, $$3);
        this.a($$0, $$1, ((idy)$$3).ar, cgv.d, $$2, $$3);
        this.a($$0, $$1, ((idy)$$3).as, cgv.c, $$2, $$3);
        this.a($$0, $$1, ((idy)$$3).ap, cgv.f, $$2, $$3);
    }

    private void a(fzm $$0, hpo $$1, dlt $$2, cgv $$3, int $$4, S $$5) {
        dun $$6 = $$2.a(ki.H);
        if ($$6 == null || !iay.a($$6, $$3)) {
            return;
        }
        A $$7 = this.a($$5, $$3);
        inr.d $$8 = this.a($$3) ? inr.d.b : inr.d.a;
        this.c.a($$8, $$6.d().orElseThrow(), $$7, $$5, $$2, $$0, $$1, $$4, ((idy)$$5).U);
    }

    private A a(S $$0, cgv $$1) {
        return (A)((gzo)(((idy)$$0).aE ? this.b : this.a).a($$1));
    }

    private boolean a(cgv $$0) {
        return $$0 == cgv.d;
    }
}

