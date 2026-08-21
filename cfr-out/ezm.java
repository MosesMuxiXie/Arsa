/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ezm
extends exx<fbb> {
    public ezm(Codec<fbb> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fbb> $$0) {
        dxn $$12 = $$0.b();
        fbb $$2 = $$0.f();
        bgr $$3 = $$0.d();
        is $$4 = $$0.e();
        Predicate<eoh> $$5 = $$1 -> $$1.a($$0.b);
        int $$6 = $$2.j.a($$3) + 1;
        int $$7 = $$2.j.a($$3) + 1;
        Set<is> $$8 = this.a($$12, $$2, $$3, $$4, $$5, $$6, $$7);
        this.a($$0, $$12, $$2, $$3, $$8, $$6, $$7);
        return !$$8.isEmpty();
    }

    protected Set<is> a(dxn $$02, fbb $$1, bgr $$2, is $$3, Predicate<eoh> $$4, int $$5, int $$6) {
        is.a $$7 = $$3.k();
        is.a $$8 = $$7.k();
        iz $$9 = $$1.e.a();
        iz $$10 = $$9.g();
        HashSet<is> $$11 = new HashSet<is>();
        for (int $$12 = -$$5; $$12 <= $$5; ++$$12) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            for (int $$14 = -$$6; $$14 <= $$6; ++$$14) {
                int $$19;
                boolean $$18;
                boolean $$15 = $$14 == -$$6 || $$14 == $$6;
                boolean $$16 = $$13 || $$15;
                boolean $$17 = $$13 && $$15;
                boolean bl2 = $$18 = $$16 && !$$17;
                if ($$17 || $$18 && ($$1.k == 0.0f || $$2.i() > $$1.k)) continue;
                $$7.a($$3, $$12, 0, $$14);
                for ($$19 = 0; $$02.a((is)$$7, eog.a::l) && $$19 < $$1.h; ++$$19) {
                    $$7.c($$9);
                }
                for ($$19 = 0; $$02.a((is)$$7, (eoh $$0) -> !$$0.l()) && $$19 < $$1.h; ++$$19) {
                    $$7.c($$10);
                }
                $$8.a((jy)$$7, $$1.e.a());
                eoh $$20 = $$02.a_($$8);
                if (!$$02.A($$7) || !$$20.c((dvt)$$02, (is)$$8, $$1.e.a().g())) continue;
                int $$21 = $$1.f.a($$2) + ($$1.g > 0.0f && $$2.i() < $$1.g ? 1 : 0);
                is $$22 = $$8.j();
                boolean $$23 = this.a($$02, $$1, $$4, $$2, $$8, $$21);
                if (!$$23) continue;
                $$11.add($$22);
            }
        }
        return $$11;
    }

    protected void a(exz<fbb> $$0, dxn $$1, fbb $$2, bgr $$3, Set<is> $$4, int $$5, int $$6) {
        for (is $$7 : $$4) {
            if (!($$2.i > 0.0f) || !($$3.i() < $$2.i)) continue;
            this.a($$1, $$2, $$0.c(), $$3, $$7);
        }
    }

    protected boolean a(dxn $$0, fbb $$1, eqg $$2, bgr $$3, is $$4) {
        return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
    }

    protected boolean a(dxn $$0, fbb $$1, Predicate<eoh> $$2, bgr $$3, is.a $$4, int $$5) {
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            eoh $$8;
            eoh $$7 = $$1.c.a($$3, $$4);
            if ($$7.a(($$8 = $$0.a_($$4)).b())) continue;
            if (!$$2.test($$8)) {
                return $$6 != 0;
            }
            $$0.a((is)$$4, $$7, 2);
            $$4.c($$1.e.a());
        }
        return true;
    }
}

