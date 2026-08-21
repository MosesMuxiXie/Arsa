/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.LinkedList;
import java.util.Optional;

public class fil
extends ffo {
    public static final MapCodec<fil> d = fil.a(fil::new);

    public fil(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        egm $$1 = egm.a($$0.f());
        is $$2 = this.a($$0, $$1);
        if ($$2.v() < 60) {
            return Optional.empty();
        }
        return Optional.of(new ffo.b($$2, $$3 -> this.a((fgg)$$3, $$0, $$2, $$1)));
    }

    private void a(fgg $$0, ffo.a $$1, is $$2, egm $$3) {
        LinkedList $$4 = Lists.newLinkedList();
        fik.a($$1.e(), $$2, $$3, $$4, $$1.f());
        $$4.forEach($$0::a);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, fgd $$6) {
        is.a $$7 = new is.a();
        int $$8 = $$0.K_();
        ffg $$9 = $$6.b();
        int $$10 = $$9.i();
        for (int $$11 = $$4.h(); $$11 <= $$4.k(); ++$$11) {
            block1: for (int $$12 = $$4.j(); $$12 <= $$4.m(); ++$$12) {
                $$7.d($$11, $$10, $$12);
                if ($$0.A($$7) || !$$9.b($$7) || !$$6.a($$7)) continue;
                for (int $$13 = $$10 - 1; $$13 > $$8; --$$13) {
                    $$7.q($$13);
                    if (!$$0.A($$7) && !$$0.a_($$7).n()) continue block1;
                    $$0.a((is)$$7, dzs.m.m(), 2);
                }
            }
        }
    }

    @Override
    public ffx<?> e() {
        return ffx.p;
    }
}

