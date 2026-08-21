/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public class emn
extends elb
implements etm.b<a> {
    private final a a;

    public emn(is $$0, eoh $$1) {
        super(eld.L, $$0, $$1);
        this.a = new a($$1, new etg($$0));
    }

    public static void a(dwo $$0, is $$1, eoh $$2, emn $$3) {
        $$3.a.d().a($$0, $$1, $$0.G_(), true);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a.b.a($$0);
    }

    @Override
    protected void a(fns $$0) {
        this.a.b.a($$0);
        super.a($$0);
    }

    public a a() {
        return this.a;
    }

    @Override
    public /* synthetic */ etm c() {
        return this.a();
    }

    public static class a
    implements etm {
        public static final int a = 8;
        final egv b;
        private final eoh c;
        private final eto d;

        public a(eoh $$0, eto $$1) {
            this.c = $$0;
            this.d = $$1;
            this.b = egv.a();
        }

        @Override
        public eto a() {
            return this.d;
        }

        @Override
        public int b() {
            return 8;
        }

        @Override
        public etm.a c() {
            return etm.a.b;
        }

        @Override
        public boolean a(axf $$0, jd<etk> $$12, etk.a $$2, ftm $$3) {
            cgk cgk2;
            if ($$12.a(etk.p) && (cgk2 = $$2.a()) instanceof chl) {
                chl $$4 = (chl)cgk2;
                if (!$$4.ff()) {
                    cex $$5 = $$4.fb();
                    int $$6 = $$4.a($$0, t.a($$5, cex::d));
                    if ($$4.eI() && $$6 > 0) {
                        this.b.a(is.a($$3.a(iz.b, 0.5)), $$6);
                        this.a((dwo)$$0, $$4);
                    }
                    $$4.fe();
                    this.d.a($$0).ifPresent($$1 -> this.a($$0, is.a($$1), this.c, $$0.G_()));
                }
                return true;
            }
            return false;
        }

        @VisibleForTesting
        public egv d() {
            return this.b;
        }

        private void a(axf $$0, is $$1, eoh $$2, bgr $$3) {
            $$0.a($$1, (eoh)$$2.b(egs.b, true), 3);
            $$0.a($$1, $$2.b(), 8);
            $$0.a(ly.L, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
            $$0.a(null, $$1, bda.yV, bdb.e, 2.0f, 0.6f + $$3.i() * 0.4f);
        }

        private void a(dwo $$0, chl $$1) {
            chl $$2 = $$1.eK();
            if ($$2 instanceof axg) {
                axg $$3 = (axg)$$2;
                cex $$4 = $$1.fb() == null ? $$0.as().a($$3) : $$1.fb();
                aj.ab.a($$3, $$1, $$4);
            }
        }
    }
}

