/*
 * Decompiled with CFR 0.152.
 */
public sealed class ens
extends Enum<ens>
implements bhh {
    public static final /* enum */ ens a = new ens("inactive", ens$a.a){

        @Override
        protected void a(axf $$0, is $$1, enp $$2, enr $$3, boolean $$4) {
            $$3.a(dlt.l);
            $$0.c(3016, $$1, $$4 ? 1 : 0);
        }
    };
    public static final /* enum */ ens b = new ens("active", ens$a.b){

        @Override
        protected void a(axf $$0, is $$1, enp $$2, enr $$3, boolean $$4) {
            if (!$$3.b()) {
                enn.b.a($$0, this, $$2, $$3, $$1);
            }
            $$0.c(3015, $$1, $$4 ? 1 : 0);
        }
    };
    public static final /* enum */ ens c = new ens("unlocking", ens$a.b){

        @Override
        protected void a(axf $$0, is $$1, enp $$2, enr $$3, boolean $$4) {
            $$0.a(null, $$1, bda.Eb, bdb.e);
        }
    };
    public static final /* enum */ ens d = new ens("ejecting", ens$a.b){

        @Override
        protected void a(axf $$0, is $$1, enp $$2, enr $$3, boolean $$4) {
            $$0.a(null, $$1, bda.Ed, bdb.e);
        }

        @Override
        protected void a(axf $$0, is $$1, enp $$2, enr $$3) {
            $$0.a(null, $$1, bda.DV, bdb.e);
        }
    };
    private static final int e = 20;
    private static final int f = 20;
    private static final int g = 20;
    private static final int h = 20;
    private final String i;
    private final a j;
    private static final /* synthetic */ ens[] k;

    public static ens[] values() {
        return (ens[])k.clone();
    }

    public static ens valueOf(String $$0) {
        return Enum.valueOf(ens.class, $$0);
    }

    ens(String $$0, a $$1) {
        this.i = $$0;
        this.j = $$1;
    }

    @Override
    public String c() {
        return this.i;
    }

    public int a() {
        return this.j.c;
    }

    public ens a(axf $$0, is $$1, enp $$2, enq $$3, enr $$4) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> ens.a($$0, $$1, $$2, $$3, $$4, $$2.c());
            case 1 -> ens.a($$0, $$1, $$2, $$3, $$4, $$2.d());
            case 2 -> {
                $$3.b($$0.au() + 20L);
                yield d;
            }
            case 3 -> {
                if ($$3.d().isEmpty()) {
                    $$3.e();
                    yield ens.a($$0, $$1, $$2, $$3, $$4, $$2.d());
                }
                float $$5 = $$3.h();
                this.a($$0, $$1, $$3.g(), $$5);
                $$4.a($$3.f());
                boolean $$6 = $$3.d().isEmpty();
                int $$7 = $$6 ? 20 : 20;
                $$3.b($$0.au() + (long)$$7);
                yield d;
            }
        };
    }

    private static ens a(axf $$0, is $$1, enp $$2, enq $$3, enr $$4, double $$5) {
        $$4.a($$0, $$1, $$3, $$2, $$5);
        $$3.b($$0.au() + 20L);
        return $$4.c() ? b : a;
    }

    public void a(axf $$0, is $$1, ens $$2, enp $$3, enr $$4, boolean $$5) {
        this.a($$0, $$1, $$3, $$4);
        $$2.a($$0, $$1, $$3, $$4, $$5);
    }

    protected void a(axf $$0, is $$1, enp $$2, enr $$3, boolean $$4) {
    }

    protected void a(axf $$0, is $$1, enp $$2, enr $$3) {
    }

    private void a(axf $$0, is $$1, dlt $$2, float $$3) {
        lf.a($$0, $$2, 2, iz.b, ftm.c($$1).a(iz.b, 1.2));
        $$0.c(3017, $$1, 0);
        $$0.a(null, $$1, bda.DX, bdb.e, 1.0f, 0.8f + 0.4f * $$3);
    }

    private static /* synthetic */ ens[] b() {
        return new ens[]{a, b, c, d};
    }

    static {
        k = ens.b();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(6);
        public static final /* enum */ a b = new a(12);
        final int c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.c = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = ens$a.a();
        }
    }
}

