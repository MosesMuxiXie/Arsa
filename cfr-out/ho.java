/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ho<T, P>
implements hf<T> {
    private final a<T, P> a;
    private final List<P> b;
    private final hc<T> c;
    private int d;

    private ho(a<T, P> $$0, List<P> $$1, hi $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = new hc($$2, this);
    }

    @Override
    public void execute(hg<T> $$0, hi $$1) {
        P $$2 = this.b.get(this.d);
        $$0.a(this.a.create($$1, $$2));
        if (++this.d < this.b.size()) {
            $$0.a(this.c);
        }
    }

    public static <T, P> void a(hg<T> $$0, hi $$1, List<P> $$2, a<T, P> $$3) {
        int $$4 = $$2.size();
        switch ($$4) {
            case 0: {
                break;
            }
            case 1: {
                $$0.a($$3.create($$1, $$2.get(0)));
                break;
            }
            case 2: {
                $$0.a($$3.create($$1, $$2.get(0)));
                $$0.a($$3.create($$1, $$2.get(1)));
                break;
            }
            default: {
                $$0.a(new ho<T, P>($$3, $$2, (hi)$$1).c);
            }
        }
    }

    @FunctionalInterface
    public static interface a<T, P> {
        public hc<T> create(hi var1, P var2);
    }
}

