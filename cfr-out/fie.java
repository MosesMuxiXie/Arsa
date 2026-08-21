/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class fie {
    private static final int a = 32;
    static final is b = new is(4, 0, 15);
    private static final amo[] c = new amo[]{amo.b("shipwreck/with_mast"), amo.b("shipwreck/sideways_full"), amo.b("shipwreck/sideways_fronthalf"), amo.b("shipwreck/sideways_backhalf"), amo.b("shipwreck/rightsideup_full"), amo.b("shipwreck/rightsideup_fronthalf"), amo.b("shipwreck/rightsideup_backhalf"), amo.b("shipwreck/with_mast_degraded"), amo.b("shipwreck/rightsideup_full_degraded"), amo.b("shipwreck/rightsideup_fronthalf_degraded"), amo.b("shipwreck/rightsideup_backhalf_degraded")};
    private static final amo[] d = new amo[]{amo.b("shipwreck/with_mast"), amo.b("shipwreck/upsidedown_full"), amo.b("shipwreck/upsidedown_fronthalf"), amo.b("shipwreck/upsidedown_backhalf"), amo.b("shipwreck/sideways_full"), amo.b("shipwreck/sideways_fronthalf"), amo.b("shipwreck/sideways_backhalf"), amo.b("shipwreck/rightsideup_full"), amo.b("shipwreck/rightsideup_fronthalf"), amo.b("shipwreck/rightsideup_backhalf"), amo.b("shipwreck/with_mast_degraded"), amo.b("shipwreck/upsidedown_full_degraded"), amo.b("shipwreck/upsidedown_fronthalf_degraded"), amo.b("shipwreck/upsidedown_backhalf_degraded"), amo.b("shipwreck/sideways_full_degraded"), amo.b("shipwreck/sideways_fronthalf_degraded"), amo.b("shipwreck/sideways_backhalf_degraded"), amo.b("shipwreck/rightsideup_full_degraded"), amo.b("shipwreck/rightsideup_fronthalf_degraded"), amo.b("shipwreck/rightsideup_backhalf_degraded")};
    static final Map<String, amt<fof>> e = Map.of("map_chest", fnv.G, "treasure_chest", fnv.I, "supply_chest", fnv.H);

    public static a a(fjr $$0, is $$1, egm $$2, fft $$3, bgr $$4, boolean $$5) {
        amo $$6 = bhs.a($$5 ? c : d, $$4);
        a $$7 = new a($$0, $$6, $$1, $$2, $$5);
        $$3.a($$7);
        return $$7;
    }

    public static class a
    extends ffy {
        private final boolean h;

        public a(fjr $$0, amo $$1, is $$2, egm $$3, boolean $$4) {
            super(fgf.ab, 0, $$0, $$1, $$1.toString(), fie$a.a($$3), $$2);
            this.h = $$4;
        }

        public a(fjr $$0, uz $$12) {
            super(fgf.ab, $$12, $$0, $$1 -> fie$a.a($$12.a("Rot", egm.h).orElseThrow()));
            this.h = $$12.b("isBeached", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("isBeached", this.h);
            $$1.a("Rot", egm.h, this.c.d());
        }

        private static fjm a(egm $$0) {
            return new fjm().a($$0).a(eev.a).a(b).a(fir.d);
        }

        @Override
        protected void a(String $$0, is $$1, dxf $$2, bgr $$3, ffg $$4) {
            amt<fof> $$5 = e.get($$0);
            if ($$5 != null) {
                cdj.a($$2, $$3, $$1.e(), $$5);
            }
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            if (this.l()) {
                super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
                return;
            }
            int $$7 = $$0.aw() + 1;
            int $$8 = 0;
            jy $$9 = this.b.a();
            euq.a $$10 = this.h ? euq.a.a : euq.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
                $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
                is $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);
                for (is $$13 : is.c(this.d, $$12)) {
                    int $$14 = $$0.a($$10, $$13.u(), $$13.w());
                    $$8 += $$14;
                    $$7 = Math.min($$7, $$14);
                }
                $$8 /= $$11;
            }
            this.c(this.h ? this.a($$7, $$3) : $$8);
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        public boolean l() {
            jy $$0 = this.b.a();
            return $$0.u() > 32 || $$0.v() > 32;
        }

        public int a(int $$0, bgr $$1) {
            return $$0 - this.b.a().v() / 2 - $$1.a(3);
        }

        public void c(int $$0) {
            this.d = new is(this.d.u(), $$0, this.d.w());
        }
    }
}

