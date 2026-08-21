/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class lh
extends lf {
    public static final lh c = new lh();

    @Override
    protected dlt a(ld $$0, dlt $$1) {
        return lh.b($$0, $$1) ? $$1 : super.a($$0, $$1);
    }

    public static boolean b(ld $$0, dlt $$12) {
        is $$2 = $$0.c().a($$0.d().c(eby.b));
        List<chl> $$3 = $$0.b().a(chl.class, new fth($$2), (? super T $$1) -> $$1.e($$12));
        if ($$3.isEmpty()) {
            return false;
        }
        chl $$4 = $$3.getFirst();
        cgv $$5 = $$4.f($$12);
        dlt $$6 = $$12.a(1);
        $$4.a($$5, $$6);
        if ($$4 instanceof chn) {
            chn $$7 = (chn)$$4;
            $$7.g($$5);
            $$7.gz();
        }
        return true;
    }
}

