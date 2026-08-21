/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Function;

public abstract class gzp<S> {
    protected final hdg o;
    protected final Function<amo, ijs> p;
    private final List<hdg> a;

    public gzp(hdg $$0, Function<amo, ijs> $$1) {
        this.o = $$0;
        this.p = $$1;
        this.a = $$0.e();
    }

    public final ijs a(amo $$0) {
        return this.p.apply($$0);
    }

    public final void a(fzm $$0, fzp $$1, int $$2, int $$3, int $$4) {
        this.b().a($$0, $$1, $$2, $$3, $$4);
    }

    public final void a(fzm $$0, fzp $$1, int $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, -1);
    }

    public final hdg b() {
        return this.o;
    }

    public final List<hdg> c() {
        return this.a;
    }

    public void a(S $$0) {
        this.d();
    }

    public final void d() {
        for (hdg $$0 : this.a) {
            $$0.c();
        }
    }

    public static class a
    extends gzp<bhr> {
        public a(hdg $$0, Function<amo, ijs> $$1) {
            super($$0, $$1);
        }

        @Override
        public void a(bhr $$0) {
        }
    }
}

