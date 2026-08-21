/*
 * Decompiled with CFR 0.152.
 */
public class fhq
extends ffm {
    public static final int h = 12;
    public static final int i = 15;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private static final a n = new a();

    public fhq(bgr $$0, int $$1, int $$2) {
        super(fgf.G, $$1, 64, $$2, 12, 10, 15, fhq.a($$0));
    }

    public fhq(uz $$0) {
        super(fgf.G, $$0);
        this.j = $$0.b("placedMainChest", false);
        this.k = $$0.b("placedHiddenChest", false);
        this.l = $$0.b("placedTrap1", false);
        this.m = $$0.b("placedTrap2", false);
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        super.a($$0, $$1);
        $$1.a("placedMainChest", this.j);
        $$1.a("placedHiddenChest", this.k);
        $$1.a("placedTrap1", this.l);
        $$1.a("placedTrap2", this.m);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
        if (!this.a($$0, $$4, 0)) {
            return;
        }
        this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, false, $$3, n);
        this.a($$0, $$4, 2, 1, 2, 9, 2, 2, false, $$3, n);
        this.a($$0, $$4, 2, 1, 12, 9, 2, 12, false, $$3, n);
        this.a($$0, $$4, 2, 1, 3, 2, 2, 11, false, $$3, n);
        this.a($$0, $$4, 9, 1, 3, 9, 2, 11, false, $$3, n);
        this.a($$0, $$4, 1, 3, 1, 10, 6, 1, false, $$3, n);
        this.a($$0, $$4, 1, 3, 13, 10, 6, 13, false, $$3, n);
        this.a($$0, $$4, 1, 3, 2, 1, 6, 12, false, $$3, n);
        this.a($$0, $$4, 10, 3, 2, 10, 6, 12, false, $$3, n);
        this.a($$0, $$4, 2, 3, 2, 9, 3, 12, false, $$3, n);
        this.a($$0, $$4, 2, 6, 2, 9, 6, 12, false, $$3, n);
        this.a($$0, $$4, 3, 7, 3, 8, 7, 11, false, $$3, n);
        this.a($$0, $$4, 4, 8, 4, 7, 8, 10, false, $$3, n);
        this.a($$0, $$4, 3, 1, 3, 8, 2, 11);
        this.a($$0, $$4, 4, 3, 6, 7, 3, 9);
        this.a($$0, $$4, 2, 4, 2, 9, 5, 12);
        this.a($$0, $$4, 4, 6, 5, 7, 6, 9);
        this.a($$0, $$4, 5, 7, 6, 6, 7, 8);
        this.a($$0, $$4, 5, 1, 2, 6, 2, 2);
        this.a($$0, $$4, 5, 2, 12, 6, 2, 12);
        this.a($$0, $$4, 5, 5, 1, 6, 5, 1);
        this.a($$0, $$4, 5, 5, 13, 6, 5, 13);
        this.a($$0, dzs.a.m(), 1, 5, 5, $$4);
        this.a($$0, dzs.a.m(), 10, 5, 5, $$4);
        this.a($$0, dzs.a.m(), 1, 5, 9, $$4);
        this.a($$0, dzs.a.m(), 10, 5, 9, $$4);
        for (int $$7 = 0; $$7 <= 14; $$7 += 14) {
            this.a($$0, $$4, 2, 4, $$7, 2, 5, $$7, false, $$3, n);
            this.a($$0, $$4, 4, 4, $$7, 4, 5, $$7, false, $$3, n);
            this.a($$0, $$4, 7, 4, $$7, 7, 5, $$7, false, $$3, n);
            this.a($$0, $$4, 9, 4, $$7, 9, 5, $$7, false, $$3, n);
        }
        this.a($$0, $$4, 5, 6, 0, 6, 6, 0, false, $$3, n);
        for (int $$8 = 0; $$8 <= 11; $$8 += 11) {
            for (int $$9 = 2; $$9 <= 12; $$9 += 2) {
                this.a($$0, $$4, $$8, 4, $$9, $$8, 5, $$9, false, $$3, n);
            }
            this.a($$0, $$4, $$8, 6, 5, $$8, 6, 5, false, $$3, n);
            this.a($$0, $$4, $$8, 6, 9, $$8, 6, 9, false, $$3, n);
        }
        this.a($$0, $$4, 2, 7, 2, 2, 9, 2, false, $$3, n);
        this.a($$0, $$4, 9, 7, 2, 9, 9, 2, false, $$3, n);
        this.a($$0, $$4, 2, 7, 12, 2, 9, 12, false, $$3, n);
        this.a($$0, $$4, 9, 7, 12, 9, 9, 12, false, $$3, n);
        this.a($$0, $$4, 4, 9, 4, 4, 9, 4, false, $$3, n);
        this.a($$0, $$4, 7, 9, 4, 7, 9, 4, false, $$3, n);
        this.a($$0, $$4, 4, 9, 10, 4, 9, 10, false, $$3, n);
        this.a($$0, $$4, 7, 9, 10, 7, 9, 10, false, $$3, n);
        this.a($$0, $$4, 5, 9, 7, 6, 9, 7, false, $$3, n);
        eoh $$10 = (eoh)dzs.do.m().b(ehz.b, iz.f);
        eoh $$11 = (eoh)dzs.do.m().b(ehz.b, iz.e);
        eoh $$12 = (eoh)dzs.do.m().b(ehz.b, iz.d);
        eoh $$13 = (eoh)dzs.do.m().b(ehz.b, iz.c);
        this.a($$0, $$13, 5, 9, 6, $$4);
        this.a($$0, $$13, 6, 9, 6, $$4);
        this.a($$0, $$12, 5, 9, 8, $$4);
        this.a($$0, $$12, 6, 9, 8, $$4);
        this.a($$0, $$13, 4, 0, 0, $$4);
        this.a($$0, $$13, 5, 0, 0, $$4);
        this.a($$0, $$13, 6, 0, 0, $$4);
        this.a($$0, $$13, 7, 0, 0, $$4);
        this.a($$0, $$13, 4, 1, 8, $$4);
        this.a($$0, $$13, 4, 2, 9, $$4);
        this.a($$0, $$13, 4, 3, 10, $$4);
        this.a($$0, $$13, 7, 1, 8, $$4);
        this.a($$0, $$13, 7, 2, 9, $$4);
        this.a($$0, $$13, 7, 3, 10, $$4);
        this.a($$0, $$4, 4, 1, 9, 4, 1, 9, false, $$3, n);
        this.a($$0, $$4, 7, 1, 9, 7, 1, 9, false, $$3, n);
        this.a($$0, $$4, 4, 1, 10, 7, 2, 10, false, $$3, n);
        this.a($$0, $$4, 5, 4, 5, 6, 4, 5, false, $$3, n);
        this.a($$0, $$10, 4, 4, 5, $$4);
        this.a($$0, $$11, 7, 4, 5, $$4);
        for (int $$14 = 0; $$14 < 4; ++$$14) {
            this.a($$0, $$12, 5, 0 - $$14, 6 + $$14, $$4);
            this.a($$0, $$12, 6, 0 - $$14, 6 + $$14, $$4);
            this.a($$0, $$4, 5, 0 - $$14, 7 + $$14, 6, 0 - $$14, 9 + $$14);
        }
        this.a($$0, $$4, 1, -3, 12, 10, -1, 13);
        this.a($$0, $$4, 1, -3, 1, 3, -1, 13);
        this.a($$0, $$4, 1, -3, 1, 9, -1, 5);
        for (int $$15 = 1; $$15 <= 13; $$15 += 2) {
            this.a($$0, $$4, 1, -3, $$15, 1, -2, $$15, false, $$3, n);
        }
        for (int $$16 = 2; $$16 <= 12; $$16 += 2) {
            this.a($$0, $$4, 1, -1, $$16, 3, -1, $$16, false, $$3, n);
        }
        this.a($$0, $$4, 2, -2, 1, 5, -2, 1, false, $$3, n);
        this.a($$0, $$4, 7, -2, 1, 9, -2, 1, false, $$3, n);
        this.a($$0, $$4, 6, -3, 1, 6, -3, 1, false, $$3, n);
        this.a($$0, $$4, 6, -1, 1, 6, -1, 1, false, $$3, n);
        this.a($$0, (eoh)((eoh)dzs.gw.m().b(eja.b, iz.f)).b(eja.d, true), 1, -3, 8, $$4);
        this.a($$0, (eoh)((eoh)dzs.gw.m().b(eja.b, iz.e)).b(eja.d, true), 4, -3, 8, $$4);
        this.a($$0, (eoh)((eoh)((eoh)dzs.gx.m().b(eiz.f, true)).b(eiz.h, true)).b(eiz.c, true), 2, -3, 8, $$4);
        this.a($$0, (eoh)((eoh)((eoh)dzs.gx.m().b(eiz.f, true)).b(eiz.h, true)).b(eiz.c, true), 3, -3, 8, $$4);
        eoh $$17 = (eoh)((eoh)dzs.cT.m().b(egb.b, epm.b)).b(egb.d, epm.b);
        this.a($$0, $$17, 5, -3, 7, $$4);
        this.a($$0, $$17, 5, -3, 6, $$4);
        this.a($$0, $$17, 5, -3, 5, $$4);
        this.a($$0, $$17, 5, -3, 4, $$4);
        this.a($$0, $$17, 5, -3, 3, $$4);
        this.a($$0, $$17, 5, -3, 2, $$4);
        this.a($$0, (eoh)((eoh)dzs.cT.m().b(egb.b, epm.b)).b(egb.e, epm.b), 5, -3, 1, $$4);
        this.a($$0, (eoh)((eoh)dzs.cT.m().b(egb.c, epm.b)).b(egb.e, epm.b), 4, -3, 1, $$4);
        this.a($$0, dzs.cJ.m(), 3, -3, 1, $$4);
        if (!this.l) {
            this.l = this.a($$0, $$4, $$3, 3, -2, 1, iz.c, fnv.A);
        }
        this.a($$0, (eoh)dzs.fN.m().b(ejh.e, true), 3, -2, 2, $$4);
        this.a($$0, (eoh)((eoh)dzs.gw.m().b(eja.b, iz.c)).b(eja.d, true), 7, -3, 1, $$4);
        this.a($$0, (eoh)((eoh)dzs.gw.m().b(eja.b, iz.d)).b(eja.d, true), 7, -3, 5, $$4);
        this.a($$0, (eoh)((eoh)((eoh)dzs.gx.m().b(eiz.e, true)).b(eiz.g, true)).b(eiz.c, true), 7, -3, 2, $$4);
        this.a($$0, (eoh)((eoh)((eoh)dzs.gx.m().b(eiz.e, true)).b(eiz.g, true)).b(eiz.c, true), 7, -3, 3, $$4);
        this.a($$0, (eoh)((eoh)((eoh)dzs.gx.m().b(eiz.e, true)).b(eiz.g, true)).b(eiz.c, true), 7, -3, 4, $$4);
        this.a($$0, (eoh)((eoh)dzs.cT.m().b(egb.c, epm.b)).b(egb.e, epm.b), 8, -3, 6, $$4);
        this.a($$0, (eoh)((eoh)dzs.cT.m().b(egb.e, epm.b)).b(egb.d, epm.b), 9, -3, 6, $$4);
        this.a($$0, (eoh)((eoh)dzs.cT.m().b(egb.b, epm.b)).b(egb.d, epm.a), 9, -3, 5, $$4);
        this.a($$0, dzs.cJ.m(), 9, -3, 4, $$4);
        this.a($$0, $$17, 9, -2, 4, $$4);
        if (!this.m) {
            this.m = this.a($$0, $$4, $$3, 9, -2, 3, iz.e, fnv.A);
        }
        this.a($$0, (eoh)dzs.fN.m().b(ejh.d, true), 8, -1, 3, $$4);
        this.a($$0, (eoh)dzs.fN.m().b(ejh.d, true), 8, -2, 3, $$4);
        if (!this.j) {
            this.j = this.a($$0, $$4, $$3, 8, -3, 3, fnv.z);
        }
        this.a($$0, dzs.cJ.m(), 9, -3, 2, $$4);
        this.a($$0, dzs.cJ.m(), 8, -3, 1, $$4);
        this.a($$0, dzs.cJ.m(), 4, -3, 5, $$4);
        this.a($$0, dzs.cJ.m(), 5, -2, 5, $$4);
        this.a($$0, dzs.cJ.m(), 5, -1, 5, $$4);
        this.a($$0, dzs.cJ.m(), 6, -3, 5, $$4);
        this.a($$0, dzs.cJ.m(), 7, -2, 5, $$4);
        this.a($$0, dzs.cJ.m(), 7, -1, 5, $$4);
        this.a($$0, dzs.cJ.m(), 8, -3, 5, $$4);
        this.a($$0, $$4, 9, -1, 1, 9, -1, 5, false, $$3, n);
        this.a($$0, $$4, 8, -3, 8, 10, -1, 10);
        this.a($$0, dzs.fq.m(), 8, -2, 11, $$4);
        this.a($$0, dzs.fq.m(), 9, -2, 11, $$4);
        this.a($$0, dzs.fq.m(), 10, -2, 11, $$4);
        eoh $$18 = (eoh)((eoh)dzs.dX.m().b(eel.f, iz.c)).b(eel.c, eos.b);
        this.a($$0, $$18, 8, -2, 12, $$4);
        this.a($$0, $$18, 9, -2, 12, $$4);
        this.a($$0, $$18, 10, -2, 12, $$4);
        this.a($$0, $$4, 8, -3, 8, 8, -3, 10, false, $$3, n);
        this.a($$0, $$4, 10, -3, 8, 10, -3, 10, false, $$3, n);
        this.a($$0, dzs.cJ.m(), 10, -2, 9, $$4);
        this.a($$0, $$17, 8, -2, 9, $$4);
        this.a($$0, $$17, 8, -2, 10, $$4);
        this.a($$0, (eoh)((eoh)((eoh)((eoh)dzs.cT.m().b(egb.b, epm.b)).b(egb.d, epm.b)).b(egb.c, epm.b)).b(egb.e, epm.b), 10, -1, 9, $$4);
        this.a($$0, (eoh)dzs.by.m().b(eny.a, iz.b), 9, -2, 8, $$4);
        this.a($$0, (eoh)dzs.by.m().b(eny.a, iz.e), 10, -2, 8, $$4);
        this.a($$0, (eoh)dzs.by.m().b(eny.a, iz.e), 10, -1, 8, $$4);
        this.a($$0, (eoh)dzs.eM.m().b(egg.f, iz.c), 10, -2, 10, $$4);
        if (!this.k) {
            this.k = this.a($$0, $$4, $$3, 9, -3, 10, fnv.z);
        }
    }

    static class a
    extends ffs.a {
        a() {
        }

        @Override
        public void a(bgr $$0, int $$1, int $$2, int $$3, boolean $$4) {
            this.a = $$0.i() < 0.4f ? dzs.m.m() : dzs.cJ.m();
        }
    }
}

