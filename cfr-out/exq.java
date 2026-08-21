/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;

public class exq
extends exx<ezz> {
    public exq(Codec<ezz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezz> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        ezz $$3 = $$0.f();
        bgr $$4 = $$0.d();
        if (!exr.a($$1, $$2)) {
            return false;
        }
        int $$5 = $$3.c.a($$4);
        float $$6 = $$3.i.a($$4);
        float $$7 = $$3.h.a($$4);
        int $$8 = $$3.d.a($$4);
        int $$9 = $$3.d.a($$4);
        for (int $$10 = -$$8; $$10 <= $$8; ++$$10) {
            for (int $$11 = -$$9; $$11 <= $$9; ++$$11) {
                double $$12 = this.a($$8, $$9, $$10, $$11, $$3);
                is $$13 = $$2.b($$10, 0, $$11);
                this.a($$1, $$4, $$13, $$10, $$11, $$6, $$12, $$5, $$7, $$3);
            }
        }
        return true;
    }

    private void a(dxn $$0, bgr $$1, is $$2, int $$3, int $$4, float $$5, double $$6, int $$7, float $$8, ezz $$9) {
        boolean $$39;
        int $$38;
        int $$37;
        int $$28;
        boolean $$24;
        int $$23;
        boolean $$18;
        eug $$16;
        boolean $$13;
        Optional<eug> $$10 = eug.a($$0, $$2, $$9.b, exr::c, exr::d);
        if ($$10.isEmpty()) {
            return;
        }
        OptionalInt $$11 = $$10.get().b();
        OptionalInt $$12 = $$10.get().c();
        if ($$11.isEmpty() && $$12.isEmpty()) {
            return;
        }
        boolean bl2 = $$13 = $$1.i() < $$5;
        if ($$13 && $$12.isPresent() && this.b($$0, $$2.h($$12.getAsInt()))) {
            int $$14 = $$12.getAsInt();
            eug $$15 = $$10.get().a(OptionalInt.of($$14 - 1));
            $$0.a($$2.h($$14), dzs.J.m(), 2);
        } else {
            $$16 = $$10.get();
        }
        OptionalInt $$17 = $$16.c();
        boolean bl3 = $$18 = $$1.j() < $$6;
        if ($$11.isPresent() && $$18 && !this.a((dwr)$$0, $$2.h($$11.getAsInt()))) {
            int $$21;
            int $$19 = $$9.g.a($$1);
            this.a($$0, $$2.h($$11.getAsInt()), $$19, iz.b);
            if ($$17.isPresent()) {
                int $$20 = Math.min($$7, $$11.getAsInt() - $$17.getAsInt());
            } else {
                $$21 = $$7;
            }
            int $$22 = this.a($$1, $$3, $$4, $$8, $$21, $$9);
        } else {
            $$23 = 0;
        }
        boolean bl4 = $$24 = $$1.j() < $$6;
        if ($$17.isPresent() && $$24 && !this.a((dwr)$$0, $$2.h($$17.getAsInt()))) {
            int $$25 = $$9.g.a($$1);
            this.a($$0, $$2.h($$17.getAsInt()), $$25, iz.a);
            if ($$11.isPresent()) {
                int $$26 = Math.max(0, $$23 + bgj.b($$1, -$$9.e, $$9.e));
            } else {
                int $$27 = this.a($$1, $$3, $$4, $$8, $$7, $$9);
            }
        } else {
            $$28 = 0;
        }
        if ($$11.isPresent() && $$17.isPresent() && $$11.getAsInt() - $$23 <= $$17.getAsInt() + $$28) {
            int $$29 = $$17.getAsInt();
            int $$30 = $$11.getAsInt();
            int $$31 = Math.max($$30 - $$23, $$29 + 1);
            int $$32 = Math.min($$29 + $$28, $$30 - 1);
            int $$33 = bgj.b($$1, $$31, $$32 + 1);
            int $$34 = $$33 - 1;
            int $$35 = $$30 - $$33;
            int $$36 = $$34 - $$29;
        } else {
            $$37 = $$23;
            $$38 = $$28;
        }
        boolean bl5 = $$39 = $$1.h() && $$37 > 0 && $$38 > 0 && $$16.d().isPresent() && $$37 + $$38 == $$16.d().getAsInt();
        if ($$11.isPresent()) {
            exr.a($$0, $$2.h($$11.getAsInt() - 1), iz.a, $$37, $$39);
        }
        if ($$17.isPresent()) {
            exr.a($$0, $$2.h($$17.getAsInt() + 1), iz.b, $$38, $$39);
        }
    }

    private boolean a(dwr $$0, is $$1) {
        return $$0.a_($$1).a(dzs.K);
    }

    private int a(bgr $$0, int $$1, int $$2, float $$3, int $$4, ezz $$5) {
        if ($$0.i() > $$3) {
            return 0;
        }
        int $$6 = Math.abs($$1) + Math.abs($$2);
        float $$7 = (float)bgj.a((double)$$6, 0.0, (double)$$5.l, (double)$$4 / 2.0, 0.0);
        return (int)exq.a($$0, 0.0f, $$4, $$7, $$5.f);
    }

    private boolean b(dxn $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        if ($$2.a(dzs.J) || $$2.a(dzs.tR) || $$2.a(dzs.tQ)) {
            return false;
        }
        if ($$0.a_($$1.d()).y().a(bdv.a)) {
            return false;
        }
        for (iz $$3 : iz.c.a) {
            if (this.a((dwp)$$0, $$1.a($$3))) continue;
            return false;
        }
        return this.a((dwp)$$0, $$1.e());
    }

    private boolean a(dwp $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        return $$2.a(bdp.br) || $$2.y().a(bdv.a);
    }

    private void a(dxn $$0, is $$1, int $$2, iz $$3) {
        is.a $$4 = $$1.k();
        for (int $$5 = 0; $$5 < $$2; ++$$5) {
            if (!exr.c($$0, $$4)) {
                return;
            }
            $$4.c($$3);
        }
    }

    private double a(int $$0, int $$1, int $$2, int $$3, ezz $$4) {
        int $$5 = $$0 - Math.abs($$2);
        int $$6 = $$1 - Math.abs($$3);
        int $$7 = Math.min($$5, $$6);
        return bgj.b($$7, 0.0f, $$4.k, $$4.j, 1.0f);
    }

    private static float a(bgr $$0, float $$1, float $$2, float $$3, float $$4) {
        return ccb.a($$0, $$3, $$4, $$1, $$2);
    }
}

