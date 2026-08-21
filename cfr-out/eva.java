/*
 * Decompiled with CFR 0.152.
 */
public final class eva {
    private static final float a = 0.4f;
    private static final int b = 20;
    private static final double c = 0.2;
    private static final float d = 0.7f;
    private static final float e = 0.1f;
    private static final float f = 0.3f;
    private static final float g = 0.6f;
    private static final float h = 0.02f;
    private static final float i = -0.3f;

    private eva() {
    }

    protected static euu.c a(euj $$0, euj $$1, euj $$2, evd $$3) {
        eoh $$4 = w.aa ? dzs.a.m() : null;
        return $$5 -> {
            double $$6 = $$0.a($$5);
            int $$7 = $$5.b();
            a $$8 = $$6 > 0.0 ? eva$a.a : eva$a.b;
            double $$9 = Math.abs($$6);
            int $$10 = $$8.d - $$7;
            int $$11 = $$7 - $$8.c;
            if ($$11 < 0 || $$10 < 0) {
                return $$4;
            }
            int $$12 = Math.min($$10, $$11);
            double $$13 = bgj.a((double)$$12, 0.0, 20.0, -0.2, 0.0);
            if ($$9 + $$13 < (double)0.4f) {
                return $$4;
            }
            bgr $$14 = $$3.a($$5.a(), $$7, $$5.c());
            if ($$14.i() > 0.7f) {
                return $$4;
            }
            if ($$1.a($$5) >= 0.0) {
                return $$4;
            }
            double $$15 = bgj.a($$9, (double)0.4f, (double)0.6f, (double)0.1f, (double)0.3f);
            if ((double)$$14.i() < $$15 && $$2.a($$5) > (double)-0.3f) {
                return $$14.i() < 0.02f ? $$8.f : $$8.e;
            }
            return w.aa ? dzs.hl.m() : $$8.g;
        };
    }

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(dzs.sa.m(), dzs.uF.m(), dzs.c.m(), 0, 50);
        public static final /* enum */ a b = new a(dzs.T.m(), dzs.uE.m(), dzs.rz.m(), -60, -8);
        final eoh e;
        final eoh f;
        final eoh g;
        protected final int c;
        protected final int d;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(eoh $$0, eoh $$1, eoh $$2, int $$3, int $$4) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.c = $$3;
            this.d = $$4;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            h = eva$a.a();
        }
    }
}

