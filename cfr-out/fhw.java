/*
 * Decompiled with CFR 0.152.
 */
public class fhw {
    private static final amo[] a = new amo[]{amo.b("nether_fossils/fossil_1"), amo.b("nether_fossils/fossil_2"), amo.b("nether_fossils/fossil_3"), amo.b("nether_fossils/fossil_4"), amo.b("nether_fossils/fossil_5"), amo.b("nether_fossils/fossil_6"), amo.b("nether_fossils/fossil_7"), amo.b("nether_fossils/fossil_8"), amo.b("nether_fossils/fossil_9"), amo.b("nether_fossils/fossil_10"), amo.b("nether_fossils/fossil_11"), amo.b("nether_fossils/fossil_12"), amo.b("nether_fossils/fossil_13"), amo.b("nether_fossils/fossil_14")};

    public static void a(fjr $$0, fft $$1, bgr $$2, is $$3) {
        egm $$4 = egm.a($$2);
        $$1.a(new a($$0, bhs.a(a, $$2), $$3, $$4));
    }

    public static class a
    extends ffy {
        public a(fjr $$0, amo $$1, is $$2, egm $$3) {
            super(fgf.ac, 0, $$0, $$1, $$1.toString(), fhw$a.a($$3), $$2);
        }

        public a(fjr $$0, uz $$12) {
            super(fgf.ac, $$12, $$0, (amo $$1) -> fhw$a.a($$12.a("Rot", egm.h).orElseThrow()));
        }

        private static fjm a(egm $$0) {
            return new fjm().a($$0).a(eev.a).a(fir.d);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Rot", egm.h, this.c.d());
        }

        @Override
        protected void a(String $$0, is $$1, dxf $$2, bgr $$3, ffg $$4) {
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            ffg $$7 = this.b.b(this.c, this.d);
            $$4.b($$7);
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
            this.a($$0, $$3, $$7, $$4);
        }

        private void a(dxn $$0, bgr $$1, ffg $$2, ffg $$3) {
            int $$7;
            int $$6;
            int $$5;
            is $$8;
            bgr $$4 = bgr.a($$0.J()).e().a($$2.g());
            if ($$4.i() < 0.5f && $$0.a_($$8 = new is($$5 = $$2.h() + $$4.a($$2.d()), $$6 = $$2.i(), $$7 = $$2.j() + $$4.a($$2.f()))).l() && $$3.b($$8)) {
                $$0.a($$8, dzs.nd.m().a(egm.a($$4)), 2);
            }
        }
    }
}

