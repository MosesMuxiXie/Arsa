/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public class ibc<S extends ieh, M extends gzm<S>>
extends ibj<S, M> {
    private final Function<S, amo> a;
    private final a<S> b;
    private final M c;
    private final Function<amo, ijs> d;
    private final boolean e;

    public ibc(hyq<S, M> $$0, Function<S, amo> $$1, a<S> $$2, M $$3, Function<amo, ijs> $$4, boolean $$5) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
        this.d = $$4;
        this.e = $$5;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        if (((ieh)$$3).Q && !this.e) {
            return;
        }
        float $$6 = this.b.apply($$3, ((ieh)$$3).L);
        if ($$6 <= 1.0E-5f) {
            return;
        }
        int $$7 = bel.b($$6);
        ijs $$8 = this.d.apply(this.a.apply($$3));
        $$1.a(1).a(this.c, $$3, $$0, $$8, $$2, hxs.a($$3, 0.0f), $$7, (ilp)null, ((ieh)$$3).U, (igi.a)null);
    }

    public static interface a<S extends ieh> {
        public float apply(S var1, float var2);
    }
}

