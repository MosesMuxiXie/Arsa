/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hn<T extends ef<T>>
implements hk<T> {
    private final hv<T> a;
    private final ea b;
    private final boolean c;

    public hn(hv<T> $$0, ea $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public void a(T $$0, hg<T> $$12, hi $$22) {
        $$12.e();
        List<hk<T>> $$3 = this.a.b();
        hj $$4 = $$12.b();
        if ($$4 != null) {
            $$4.a($$22.c(), this.a.a(), this.a.b().size());
        }
        int $$5 = $$22.c() + 1;
        hi.a $$6 = this.c ? $$22.e() : $$12.b($$5);
        hi $$7 = new hi($$5, this.b, $$6);
        ho.a($$12, $$7, $$3, ($$1, $$2) -> new hc<ef>($$1, $$2.bind($$0)));
    }

    @Override
    public /* synthetic */ void execute(Object object, hg hg2, hi hi2) {
        this.a((ef)object, hg2, hi2);
    }
}

