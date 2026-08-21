/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class fhj
extends ffm {
    public static final int h = 21;
    public static final int i = 21;
    private final boolean[] j = new boolean[4];
    private final List<is> k = new ArrayList<is>();
    private is l = is.c;

    public fhj(bgr $$0, int $$1, int $$2) {
        super(fgf.L, $$1, 64, $$2, 21, 15, 21, fhj.a($$0));
    }

    public fhj(uz $$0) {
        super(fgf.L, $$0);
        this.j[0] = $$0.b("hasPlacedChest0", false);
        this.j[1] = $$0.b("hasPlacedChest1", false);
        this.j[2] = $$0.b("hasPlacedChest2", false);
        this.j[3] = $$0.b("hasPlacedChest3", false);
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        super.a($$0, $$1);
        $$1.a("hasPlacedChest0", this.j[0]);
        $$1.a("hasPlacedChest1", this.j[1]);
        $$1.a("hasPlacedChest2", this.j[2]);
        $$1.a("hasPlacedChest3", this.j[3]);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
        if (!this.a((dwp)$$0, -$$3.a(3))) {
            return;
        }
        this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, dzs.bc.m(), dzs.bc.m(), false);
        for (int $$7 = 1; $$7 <= 9; ++$$7) {
            this.a($$0, $$4, $$7, $$7, $$7, this.a - 1 - $$7, $$7, this.c - 1 - $$7, dzs.bc.m(), dzs.bc.m(), false);
            this.a($$0, $$4, $$7 + 1, $$7, $$7 + 1, this.a - 2 - $$7, $$7, this.c - 2 - $$7, dzs.a.m(), dzs.a.m(), false);
        }
        for (int $$8 = 0; $$8 < this.a; ++$$8) {
            for (int $$9 = 0; $$9 < this.c; ++$$9) {
                int $$10 = -5;
                this.b($$0, dzs.bc.m(), $$8, -5, $$9, $$4);
            }
        }
        eoh $$11 = (eoh)dzs.gs.m().b(ehz.b, iz.c);
        eoh $$12 = (eoh)dzs.gs.m().b(ehz.b, iz.d);
        eoh $$13 = (eoh)dzs.gs.m().b(ehz.b, iz.f);
        eoh $$14 = (eoh)dzs.gs.m().b(ehz.b, iz.e);
        this.a($$0, $$4, 0, 0, 0, 4, 9, 4, dzs.bc.m(), dzs.a.m(), false);
        this.a($$0, $$4, 1, 10, 1, 3, 10, 3, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$11, 2, 10, 0, $$4);
        this.a($$0, $$12, 2, 10, 4, $$4);
        this.a($$0, $$13, 0, 10, 2, $$4);
        this.a($$0, $$14, 4, 10, 2, $$4);
        this.a($$0, $$4, this.a - 5, 0, 0, this.a - 1, 9, 4, dzs.bc.m(), dzs.a.m(), false);
        this.a($$0, $$4, this.a - 4, 10, 1, this.a - 2, 10, 3, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$11, this.a - 3, 10, 0, $$4);
        this.a($$0, $$12, this.a - 3, 10, 4, $$4);
        this.a($$0, $$13, this.a - 5, 10, 2, $$4);
        this.a($$0, $$14, this.a - 1, 10, 2, $$4);
        this.a($$0, $$4, 8, 0, 0, 12, 4, 4, dzs.bc.m(), dzs.a.m(), false);
        this.a($$0, $$4, 9, 1, 0, 11, 3, 4, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, dzs.be.m(), 9, 1, 1, $$4);
        this.a($$0, dzs.be.m(), 9, 2, 1, $$4);
        this.a($$0, dzs.be.m(), 9, 3, 1, $$4);
        this.a($$0, dzs.be.m(), 10, 3, 1, $$4);
        this.a($$0, dzs.be.m(), 11, 3, 1, $$4);
        this.a($$0, dzs.be.m(), 11, 2, 1, $$4);
        this.a($$0, dzs.be.m(), 11, 1, 1, $$4);
        this.a($$0, $$4, 4, 1, 1, 8, 3, 3, dzs.bc.m(), dzs.a.m(), false);
        this.a($$0, $$4, 4, 1, 2, 8, 2, 2, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, $$4, 12, 1, 1, 16, 3, 3, dzs.bc.m(), dzs.a.m(), false);
        this.a($$0, $$4, 12, 1, 2, 16, 2, 2, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, $$4, 5, 4, 5, this.a - 6, 4, this.c - 6, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, 9, 4, 9, 11, 4, 11, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, $$4, 8, 1, 8, 8, 3, 8, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, 12, 1, 8, 12, 3, 8, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, 8, 1, 12, 8, 3, 12, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, 12, 1, 12, 12, 3, 12, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, 1, 1, 5, 4, 4, 11, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, this.a - 5, 1, 5, this.a - 2, 4, 11, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, 6, 7, 9, 6, 7, 11, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, this.a - 7, 7, 9, this.a - 7, 7, 11, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, 5, 5, 9, 5, 7, 11, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, this.a - 6, 5, 9, this.a - 6, 7, 11, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, dzs.a.m(), 5, 5, 10, $$4);
        this.a($$0, dzs.a.m(), 5, 6, 10, $$4);
        this.a($$0, dzs.a.m(), 6, 6, 10, $$4);
        this.a($$0, dzs.a.m(), this.a - 6, 5, 10, $$4);
        this.a($$0, dzs.a.m(), this.a - 6, 6, 10, $$4);
        this.a($$0, dzs.a.m(), this.a - 7, 6, 10, $$4);
        this.a($$0, $$4, 2, 4, 4, 2, 6, 4, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, $$4, this.a - 3, 4, 4, this.a - 3, 6, 4, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, $$11, 2, 4, 5, $$4);
        this.a($$0, $$11, 2, 3, 4, $$4);
        this.a($$0, $$11, this.a - 3, 4, 5, $$4);
        this.a($$0, $$11, this.a - 3, 3, 4, $$4);
        this.a($$0, $$4, 1, 1, 3, 2, 2, 3, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, this.a - 3, 1, 3, this.a - 2, 2, 3, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, dzs.bc.m(), 1, 1, 2, $$4);
        this.a($$0, dzs.bc.m(), this.a - 2, 1, 2, $$4);
        this.a($$0, dzs.ky.m(), 1, 2, 2, $$4);
        this.a($$0, dzs.ky.m(), this.a - 2, 2, 2, $$4);
        this.a($$0, $$14, 2, 1, 2, $$4);
        this.a($$0, $$13, this.a - 3, 1, 2, $$4);
        this.a($$0, $$4, 4, 3, 5, 4, 3, 17, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, this.a - 5, 3, 5, this.a - 5, 3, 17, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, 3, 1, 5, 4, 2, 16, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, $$4, this.a - 6, 1, 5, this.a - 5, 2, 16, dzs.a.m(), dzs.a.m(), false);
        for (int $$15 = 5; $$15 <= 17; $$15 += 2) {
            this.a($$0, dzs.be.m(), 4, 1, $$15, $$4);
            this.a($$0, dzs.bd.m(), 4, 2, $$15, $$4);
            this.a($$0, dzs.be.m(), this.a - 5, 1, $$15, $$4);
            this.a($$0, dzs.bd.m(), this.a - 5, 2, $$15, $$4);
        }
        this.a($$0, dzs.ib.m(), 10, 0, 7, $$4);
        this.a($$0, dzs.ib.m(), 10, 0, 8, $$4);
        this.a($$0, dzs.ib.m(), 9, 0, 9, $$4);
        this.a($$0, dzs.ib.m(), 11, 0, 9, $$4);
        this.a($$0, dzs.ib.m(), 8, 0, 10, $$4);
        this.a($$0, dzs.ib.m(), 12, 0, 10, $$4);
        this.a($$0, dzs.ib.m(), 7, 0, 10, $$4);
        this.a($$0, dzs.ib.m(), 13, 0, 10, $$4);
        this.a($$0, dzs.ib.m(), 9, 0, 11, $$4);
        this.a($$0, dzs.ib.m(), 11, 0, 11, $$4);
        this.a($$0, dzs.ib.m(), 10, 0, 12, $$4);
        this.a($$0, dzs.ib.m(), 10, 0, 13, $$4);
        this.a($$0, dzs.il.m(), 10, 0, 10, $$4);
        for (int $$16 = 0; $$16 <= this.a - 1; $$16 += this.a - 1) {
            this.a($$0, dzs.be.m(), $$16, 2, 1, $$4);
            this.a($$0, dzs.ib.m(), $$16, 2, 2, $$4);
            this.a($$0, dzs.be.m(), $$16, 2, 3, $$4);
            this.a($$0, dzs.be.m(), $$16, 3, 1, $$4);
            this.a($$0, dzs.ib.m(), $$16, 3, 2, $$4);
            this.a($$0, dzs.be.m(), $$16, 3, 3, $$4);
            this.a($$0, dzs.ib.m(), $$16, 4, 1, $$4);
            this.a($$0, dzs.bd.m(), $$16, 4, 2, $$4);
            this.a($$0, dzs.ib.m(), $$16, 4, 3, $$4);
            this.a($$0, dzs.be.m(), $$16, 5, 1, $$4);
            this.a($$0, dzs.ib.m(), $$16, 5, 2, $$4);
            this.a($$0, dzs.be.m(), $$16, 5, 3, $$4);
            this.a($$0, dzs.ib.m(), $$16, 6, 1, $$4);
            this.a($$0, dzs.bd.m(), $$16, 6, 2, $$4);
            this.a($$0, dzs.ib.m(), $$16, 6, 3, $$4);
            this.a($$0, dzs.ib.m(), $$16, 7, 1, $$4);
            this.a($$0, dzs.ib.m(), $$16, 7, 2, $$4);
            this.a($$0, dzs.ib.m(), $$16, 7, 3, $$4);
            this.a($$0, dzs.be.m(), $$16, 8, 1, $$4);
            this.a($$0, dzs.be.m(), $$16, 8, 2, $$4);
            this.a($$0, dzs.be.m(), $$16, 8, 3, $$4);
        }
        for (int $$17 = 2; $$17 <= this.a - 3; $$17 += this.a - 3 - 2) {
            this.a($$0, dzs.be.m(), $$17 - 1, 2, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17, 2, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 + 1, 2, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 - 1, 3, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17, 3, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 + 1, 3, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17 - 1, 4, 0, $$4);
            this.a($$0, dzs.bd.m(), $$17, 4, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17 + 1, 4, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 - 1, 5, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17, 5, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 + 1, 5, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17 - 1, 6, 0, $$4);
            this.a($$0, dzs.bd.m(), $$17, 6, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17 + 1, 6, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17 - 1, 7, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17, 7, 0, $$4);
            this.a($$0, dzs.ib.m(), $$17 + 1, 7, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 - 1, 8, 0, $$4);
            this.a($$0, dzs.be.m(), $$17, 8, 0, $$4);
            this.a($$0, dzs.be.m(), $$17 + 1, 8, 0, $$4);
        }
        this.a($$0, $$4, 8, 4, 0, 12, 6, 0, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, dzs.a.m(), 8, 6, 0, $$4);
        this.a($$0, dzs.a.m(), 12, 6, 0, $$4);
        this.a($$0, dzs.ib.m(), 9, 5, 0, $$4);
        this.a($$0, dzs.bd.m(), 10, 5, 0, $$4);
        this.a($$0, dzs.ib.m(), 11, 5, 0, $$4);
        this.a($$0, $$4, 8, -14, 8, 12, -11, 12, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, 8, -10, 8, 12, -10, 12, dzs.bd.m(), dzs.bd.m(), false);
        this.a($$0, $$4, 8, -9, 8, 12, -9, 12, dzs.be.m(), dzs.be.m(), false);
        this.a($$0, $$4, 8, -8, 8, 12, -1, 12, dzs.bc.m(), dzs.bc.m(), false);
        this.a($$0, $$4, 9, -11, 9, 11, -1, 11, dzs.a.m(), dzs.a.m(), false);
        this.a($$0, dzs.dY.m(), 10, -11, 10, $$4);
        this.a($$0, $$4, 9, -13, 9, 11, -13, 11, dzs.cu.m(), dzs.a.m(), false);
        this.a($$0, dzs.a.m(), 8, -11, 10, $$4);
        this.a($$0, dzs.a.m(), 8, -10, 10, $$4);
        this.a($$0, dzs.bd.m(), 7, -10, 10, $$4);
        this.a($$0, dzs.be.m(), 7, -11, 10, $$4);
        this.a($$0, dzs.a.m(), 12, -11, 10, $$4);
        this.a($$0, dzs.a.m(), 12, -10, 10, $$4);
        this.a($$0, dzs.bd.m(), 13, -10, 10, $$4);
        this.a($$0, dzs.be.m(), 13, -11, 10, $$4);
        this.a($$0, dzs.a.m(), 10, -11, 8, $$4);
        this.a($$0, dzs.a.m(), 10, -10, 8, $$4);
        this.a($$0, dzs.bd.m(), 10, -10, 7, $$4);
        this.a($$0, dzs.be.m(), 10, -11, 7, $$4);
        this.a($$0, dzs.a.m(), 10, -11, 12, $$4);
        this.a($$0, dzs.a.m(), 10, -10, 12, $$4);
        this.a($$0, dzs.bd.m(), 10, -10, 13, $$4);
        this.a($$0, dzs.be.m(), 10, -11, 13, $$4);
        for (iz $$18 : iz.c.a) {
            if (this.j[$$18.e()]) continue;
            int $$19 = $$18.j() * 2;
            int $$20 = $$18.l() * 2;
            this.j[$$18.e()] = this.a($$0, $$4, $$3, 10 + $$19, -11, 10 + $$20, fnv.y);
        }
        this.a($$0, $$4);
    }

    private void a(dxn $$0, ffg $$1) {
        is $$2 = new is(16, -4, 13);
        this.a($$2, $$0, $$1);
        this.b($$2, $$0, $$1);
    }

    private void a(is $$0, dxn $$1, ffg $$2) {
        int $$3 = $$0.u();
        int $$4 = $$0.v();
        int $$5 = $$0.w();
        eoh $$6 = dzs.gs.m();
        this.a($$1, $$6.a(egm.d), 13, -1, 17, $$2);
        this.a($$1, $$6.a(egm.d), 14, -2, 17, $$2);
        this.a($$1, $$6.a(egm.d), 15, -3, 17, $$2);
        eoh $$7 = dzs.L.m();
        eoh $$8 = dzs.bc.m();
        boolean $$9 = $$1.G_().h();
        this.a($$1, $$7, $$3 - 4, $$4 + 4, $$5 + 4, $$2);
        this.a($$1, $$7, $$3 - 3, $$4 + 4, $$5 + 4, $$2);
        this.a($$1, $$7, $$3 - 2, $$4 + 4, $$5 + 4, $$2);
        this.a($$1, $$7, $$3 - 1, $$4 + 4, $$5 + 4, $$2);
        this.a($$1, $$7, $$3, $$4 + 4, $$5 + 4, $$2);
        this.a($$1, $$7, $$3 - 2, $$4 + 3, $$5 + 4, $$2);
        this.a($$1, $$9 ? $$7 : $$8, $$3 - 1, $$4 + 3, $$5 + 4, $$2);
        this.a($$1, !$$9 ? $$7 : $$8, $$3, $$4 + 3, $$5 + 4, $$2);
        this.a($$1, $$7, $$3 - 1, $$4 + 2, $$5 + 4, $$2);
        this.a($$1, $$8, $$3, $$4 + 2, $$5 + 4, $$2);
        this.a($$1, $$7, $$3, $$4 + 1, $$5 + 4, $$2);
    }

    private void b(is $$0, dxn $$1, ffg $$2) {
        int $$3 = $$0.u();
        int $$4 = $$0.v();
        int $$5 = $$0.w();
        eoh $$6 = dzs.be.m();
        eoh $$7 = dzs.bd.m();
        this.a($$1, $$2, $$3 - 3, $$4 + 1, $$5 - 3, $$3 - 3, $$4 + 1, $$5 + 2, $$6, $$6, true);
        this.a($$1, $$2, $$3 + 3, $$4 + 1, $$5 - 3, $$3 + 3, $$4 + 1, $$5 + 2, $$6, $$6, true);
        this.a($$1, $$2, $$3 - 3, $$4 + 1, $$5 - 3, $$3 + 3, $$4 + 1, $$5 - 2, $$6, $$6, true);
        this.a($$1, $$2, $$3 - 3, $$4 + 1, $$5 + 3, $$3 + 3, $$4 + 1, $$5 + 3, $$6, $$6, true);
        this.a($$1, $$2, $$3 - 3, $$4 + 2, $$5 - 3, $$3 - 3, $$4 + 2, $$5 + 2, $$7, $$7, true);
        this.a($$1, $$2, $$3 + 3, $$4 + 2, $$5 - 3, $$3 + 3, $$4 + 2, $$5 + 2, $$7, $$7, true);
        this.a($$1, $$2, $$3 - 3, $$4 + 2, $$5 - 3, $$3 + 3, $$4 + 2, $$5 - 2, $$7, $$7, true);
        this.a($$1, $$2, $$3 - 3, $$4 + 2, $$5 + 3, $$3 + 3, $$4 + 2, $$5 + 3, $$7, $$7, true);
        this.a($$1, $$2, $$3 - 3, -1, $$5 - 3, $$3 - 3, -1, $$5 + 2, $$6, $$6, true);
        this.a($$1, $$2, $$3 + 3, -1, $$5 - 3, $$3 + 3, -1, $$5 + 2, $$6, $$6, true);
        this.a($$1, $$2, $$3 - 3, -1, $$5 - 3, $$3 + 3, -1, $$5 - 2, $$6, $$6, true);
        this.a($$1, $$2, $$3 - 3, -1, $$5 + 3, $$3 + 3, -1, $$5 + 3, $$6, $$6, true);
        this.a($$3 - 2, $$4 + 1, $$5 - 2, $$3 + 2, $$4 + 3, $$5 + 2);
        this.a($$1, $$2, $$3 - 2, $$4 + 4, $$5 - 2, $$3 + 2, $$5 + 2);
        eoh $$8 = dzs.ib.m();
        eoh $$9 = dzs.il.m();
        this.a($$1, $$9, $$3, $$4, $$5, $$2);
        this.a($$1, $$8, $$3 + 1, $$4, $$5 - 1, $$2);
        this.a($$1, $$8, $$3 + 1, $$4, $$5 + 1, $$2);
        this.a($$1, $$8, $$3 - 1, $$4, $$5 - 1, $$2);
        this.a($$1, $$8, $$3 - 1, $$4, $$5 + 1, $$2);
        this.a($$1, $$8, $$3 + 2, $$4, $$5, $$2);
        this.a($$1, $$8, $$3 - 2, $$4, $$5, $$2);
        this.a($$1, $$8, $$3, $$4, $$5 + 2, $$2);
        this.a($$1, $$8, $$3, $$4, $$5 - 2, $$2);
        this.a($$1, $$8, $$3 + 3, $$4, $$5, $$2);
        this.c($$3 + 3, $$4 + 1, $$5);
        this.c($$3 + 3, $$4 + 2, $$5);
        this.a($$1, $$6, $$3 + 4, $$4 + 1, $$5, $$2);
        this.a($$1, $$7, $$3 + 4, $$4 + 2, $$5, $$2);
        this.a($$1, $$8, $$3 - 3, $$4, $$5, $$2);
        this.c($$3 - 3, $$4 + 1, $$5);
        this.c($$3 - 3, $$4 + 2, $$5);
        this.a($$1, $$6, $$3 - 4, $$4 + 1, $$5, $$2);
        this.a($$1, $$7, $$3 - 4, $$4 + 2, $$5, $$2);
        this.a($$1, $$8, $$3, $$4, $$5 + 3, $$2);
        this.c($$3, $$4 + 1, $$5 + 3);
        this.c($$3, $$4 + 2, $$5 + 3);
        this.a($$1, $$8, $$3, $$4, $$5 - 3, $$2);
        this.c($$3, $$4 + 1, $$5 - 3);
        this.c($$3, $$4 + 2, $$5 - 3);
        this.a($$1, $$6, $$3, $$4 + 1, $$5 - 4, $$2);
        this.a($$1, $$7, $$3, -2, $$5 - 4, $$2);
    }

    private void c(int $$0, int $$1, int $$2) {
        is.a $$3 = this.b($$0, $$1, $$2);
        this.k.add($$3);
    }

    private void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = $$1; $$6 <= $$4; ++$$6) {
            for (int $$7 = $$0; $$7 <= $$3; ++$$7) {
                for (int $$8 = $$2; $$8 <= $$5; ++$$8) {
                    this.c($$7, $$6, $$8);
                }
            }
        }
    }

    private void a(dxn $$0, int $$1, int $$2, int $$3, ffg $$4) {
        if ($$0.G_().i() < 0.33f) {
            eoh $$5 = dzs.bc.m();
            this.a($$0, $$5, $$1, $$2, $$3, $$4);
        } else {
            eoh $$6 = dzs.L.m();
            this.a($$0, $$6, $$1, $$2, $$3, $$4);
        }
    }

    private void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        for (int $$7 = $$2; $$7 <= $$5; ++$$7) {
            for (int $$8 = $$4; $$8 <= $$6; ++$$8) {
                this.a($$0, $$7, $$3, $$8, $$1);
            }
        }
        bgr $$9 = bgr.a($$0.J()).e().a(this.b($$2, $$3, $$4));
        int $$10 = $$9.a($$2, $$5);
        int $$11 = $$9.a($$4, $$6);
        this.l = new is(this.a($$10, $$11), this.b($$3), this.b($$10, $$11));
    }

    public List<is> b() {
        return this.k;
    }

    public is c() {
        return this.l;
    }
}

