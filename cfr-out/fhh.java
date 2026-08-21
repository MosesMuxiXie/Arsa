/*
 * Decompiled with CFR 0.152.
 */
public class fhh {

    public static class a
    extends ffs {
        public a(is $$0) {
            super(fgf.aa, 0, new ffg($$0));
        }

        public a(uz $$0) {
            super(fgf.aa, $$0);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            int $$7 = $$0.a(euq.a.c, this.f.h(), this.f.j());
            is.a $$8 = new is.a(this.f.h(), $$7, this.f.j());
            while ($$8.v() > $$0.K_()) {
                eoh $$9 = $$0.a_($$8);
                eoh $$10 = $$0.a_($$8.e());
                if ($$10 == dzs.bc.m() || $$10 == dzs.b.m() || $$10 == dzs.g.m() || $$10 == dzs.c.m() || $$10 == dzs.e.m()) {
                    eoh $$11 = $$9.l() || this.b($$9) ? dzs.L.m() : $$9;
                    for (iz $$12 : iz.values()) {
                        is $$13 = $$8.a($$12);
                        eoh $$14 = $$0.a_($$13);
                        if (!$$14.l() && !this.b($$14)) continue;
                        is $$15 = $$13.e();
                        eoh $$16 = $$0.a_($$15);
                        if (($$16.l() || this.b($$16)) && $$12 != iz.b) {
                            $$0.a($$13, $$10, 3);
                            continue;
                        }
                        $$0.a($$13, $$11, 3);
                    }
                    this.f = new ffg($$8);
                    this.a((dxf)$$0, $$4, $$3, $$8, fnv.F, null);
                    return;
                }
                $$8.e(0, -1, 0);
            }
        }

        private boolean b(eoh $$0) {
            return $$0 == dzs.J.m() || $$0 == dzs.K.m();
        }
    }
}

