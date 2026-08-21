/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cms
extends cmt {
    private static final List<dlp> c = ImmutableList.of((Object)dlx.rb, (Object)dlx.xA);

    @Override
    protected void a(axf $$0, dcx $$1) {
        Optional<jc> $$2 = $$1.ev().c(cqw.c);
        if ($$2.isEmpty()) {
            return;
        }
        jc $$3 = $$2.get();
        eoh $$4 = $$0.a_($$3.b());
        if ($$4.a(dzs.qc)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
        }
    }

    private void a(axf $$0, dcx $$1, jc $$2, eoh $$3) {
        is $$4 = $$2.b();
        if ($$3.c(ebc.e) == 8) {
            $$3 = ebc.a((cgk)$$1, $$3, $$0, $$4);
        }
        int $$5 = 20;
        int $$6 = 10;
        int[] $$7 = new int[c.size()];
        cdk $$8 = $$1.gP();
        int $$9 = $$8.b();
        eoh $$10 = $$3;
        for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; --$$11) {
            int $$15;
            dlt $$12 = $$8.a($$11);
            int $$13 = c.indexOf($$12.h());
            if ($$13 == -1) continue;
            int $$14 = $$12.N();
            $$7[$$13] = $$15 = $$7[$$13] + $$14;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 <= 0) continue;
            $$5 -= $$16;
            for (int $$17 = 0; $$17 < $$16; ++$$17) {
                if (($$10 = ebc.a((cgk)$$1, $$10, $$0, $$12, $$4)).c(ebc.e) != 7) continue;
                this.a($$0, $$3, $$4, $$10);
                return;
            }
        }
        this.a($$0, $$3, $$4, $$10);
    }

    private void a(axf $$0, eoh $$1, is $$2, eoh $$3) {
        $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
    }

    private void c(axf $$0, dcx $$1) {
        cdk $$2 = $$1.gP();
        if ($$2.a_(dlx.rd) > 36) {
            return;
        }
        int $$3 = $$2.a_(dlx.rc);
        int $$4 = 3;
        int $$5 = 3;
        int $$6 = Math.min(3, $$3 / 3);
        if ($$6 == 0) {
            return;
        }
        int $$7 = $$6 * 3;
        $$2.a(dlx.rc, $$7);
        dlt $$8 = $$2.b(new dlt(dlx.rd, $$6));
        if (!$$8.f()) {
            $$1.a($$0, $$8, 0.5f);
        }
    }
}

