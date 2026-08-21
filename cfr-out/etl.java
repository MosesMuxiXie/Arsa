/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class etl {
    private final axf a;

    public etl(axf $$0) {
        this.a = $$0;
    }

    public void a(jd<etk> $$0, ftm $$1, etk.a $$2) {
        int $$3 = $$0.a().a();
        is $$42 = is.a($$1);
        int $$52 = jw.a($$42.u() - $$3);
        int $$6 = jw.a($$42.v() - $$3);
        int $$7 = jw.a($$42.w() - $$3);
        int $$8 = jw.a($$42.u() + $$3);
        int $$9 = jw.a($$42.v() + $$3);
        int $$10 = jw.a($$42.w() + $$3);
        ArrayList<etk.b> $$11 = new ArrayList<etk.b>();
        etn.a $$12 = ($$4, $$5) -> {
            if ($$4.c() == etm.a.b) {
                $$11.add(new etk.b($$0, $$1, $$2, $$4, $$5));
            } else {
                $$4.a(this.a, $$0, $$2, $$1);
            }
        };
        boolean $$13 = false;
        for (int $$14 = $$52; $$14 <= $$8; ++$$14) {
            for (int $$15 = $$7; $$15 <= $$10; ++$$15) {
                eqq $$16 = this.a.p().a($$14, $$15);
                if ($$16 == null) continue;
                for (int $$17 = $$6; $$17 <= $$9; ++$$17) {
                    $$13 |= ((eqf)$$16).a($$17).a($$0, $$1, $$2, $$12);
                }
            }
        }
        if (!$$11.isEmpty()) {
            this.a($$11);
        }
        if ($$13) {
            this.a.W().b(is.a($$1), bxf.p, new bwx($$0, $$1));
        }
    }

    private void a(List<etk.b> $$0) {
        Collections.sort($$0);
        for (etk.b $$1 : $$0) {
            etm $$2 = $$1.d();
            $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
        }
    }
}

