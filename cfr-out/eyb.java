/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class eyb
extends exx<eyc> {
    public eyb(Codec<eyc> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<eyc> $$0) {
        bgr $$1 = $$0.d();
        dxn $$2 = $$0.b();
        is $$3 = $$0.e();
        egm $$4 = egm.a($$1);
        eyc $$5 = $$0.f();
        int $$6 = $$1.a($$5.b.size());
        fjr $$7 = $$2.a().s().ba();
        fjq $$8 = $$7.a($$5.b.get($$6));
        fjq $$9 = $$7.a($$5.c.get($$6));
        dvu $$10 = new dvu($$3);
        ffg $$11 = new ffg($$10.e() - 16, $$2.K_(), $$10.f() - 16, $$10.g() + 16, $$2.aw(), $$10.h() + 16);
        fjm $$12 = new fjm().a($$4).a($$11).a($$1);
        jy $$13 = $$8.a($$4);
        is $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
        int $$15 = $$3.v();
        for (int $$16 = 0; $$16 < $$13.u(); ++$$16) {
            for (int $$17 = 0; $$17 < $$13.w(); ++$$17) {
                $$15 = Math.min($$15, $$2.a(euq.a.c, $$14.u() + $$16, $$14.w() + $$17));
            }
        }
        int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.K_() + 10);
        is $$19 = $$8.a($$14.h($$18), eev.a, $$4);
        if (eyb.a($$2, $$8.b($$12, $$19)) > $$5.f) {
            return false;
        }
        $$12.b();
        $$5.d.a().a().forEach($$12::a);
        $$8.a($$2, $$19, $$19, $$12, $$1, 260);
        $$12.b();
        $$5.e.a().a().forEach($$12::a);
        $$9.a($$2, $$19, $$19, $$12, $$1, 260);
        return true;
    }

    private static int a(dxn $$0, ffg $$1) {
        MutableInt $$22 = new MutableInt(0);
        $$1.a((is $$2) -> {
            eoh $$3 = $$0.a_((is)$$2);
            if ($$3.l() || $$3.a(dzs.K) || $$3.a(dzs.J)) {
                $$22.add(1);
            }
        });
        return $$22.intValue();
    }
}

