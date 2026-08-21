/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class ibn<S extends ieh, RM extends gzm<? super S>, EM extends gzm<? super S>>
extends ibj<S, RM> {
    private final iau a;
    private final inr.d b;
    private final Function<S, dlt> c;
    private final EM d;
    private final @Nullable EM e;
    private final int f;

    public ibn(hyq<S, RM> $$0, iau $$1, inr.d $$2, Function<S, dlt> $$3, EM $$4, @Nullable EM $$5, int $$6) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
        this.d = $$4;
        this.e = $$5;
        this.f = $$6;
    }

    public ibn(hyq<S, RM> $$0, iau $$1, inr.d $$2, Function<S, dlt> $$3, EM $$4, @Nullable EM $$5) {
        this($$0, $$1, $$2, $$3, $$4, $$5, 0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        dlt $$6 = this.c.apply($$3);
        dun $$7 = $$6.a(ki.H);
        if ($$7 == null || $$7.d().isEmpty() || ((ieh)$$3).aE && this.e == null) {
            return;
        }
        EM $$8 = ((ieh)$$3).aE ? this.e : this.d;
        this.a.a(this.b, $$7.d().get(), $$8, $$3, $$6, $$0, $$1, $$2, (amo)null, ((ieh)$$3).U, this.f);
    }
}

