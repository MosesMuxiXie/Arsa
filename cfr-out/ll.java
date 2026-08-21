/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ll
extends lj {
    @Override
    protected dlt a(ld $$02, dlt $$1) {
        axf $$2 = $$02.b();
        if (!$$2.B_()) {
            is $$3 = $$02.c().a($$02.d().c(eby.b));
            this.a(ll.a($$2, $$1, $$3) || ll.a($$2, $$3, $$1));
            if (this.b()) {
                $$1.a(1, $$2, null, $$0 -> {});
            }
        }
        return $$1;
    }

    private static boolean a(axf $$02, dlt $$1, is $$2) {
        int $$4;
        eoh $$3 = $$02.a_($$2);
        if ($$3.a(bdp.aU, (eog.a $$0) -> $$0.b(dzk.c) && $$0.b() instanceof dzk) && ($$4 = $$3.c(dzk.c).intValue()) >= 5) {
            $$02.a(null, $$2, bda.cj, bdb.e, 1.0f, 1.0f);
            dzk.a($$02, $$1, $$3, $$02.c_($$2), null, $$2);
            ((dzk)$$3.b()).a((dwo)$$02, $$3, $$2, null, eky.b.b);
            $$02.a(null, etk.M, $$2);
            return true;
        }
        return false;
    }

    private static boolean a(axf $$0, is $$1, dlt $$2) {
        List<cgk> $$3 = $$0.a(cgk.class, new fth($$1), cgs.f);
        for (cgk $$4 : $$3) {
            cib $$5;
            if ($$4.c((ddm)null)) {
                return true;
            }
            if (!($$4 instanceof cib) || !($$5 = (cib)((Object)$$4)).a()) continue;
            $$5.a($$0, bdb.e, $$2);
            $$0.a(null, etk.M, $$1);
            return true;
        }
        return false;
    }
}

