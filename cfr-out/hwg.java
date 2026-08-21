/*
 * Decompiled with CFR 0.152.
 */
public class hwg<T extends cuo>
extends hvd<T, idb, haq> {
    private final amo a;

    public hwg(hwq.a $$02, a $$1) {
        super($$02, new haq($$02.a($$1.d)), new haq($$02.a($$1.e)));
        this.a = $$1.c;
        this.a(new ibn<idb, haq, har>(this, $$02.h(), $$1.f, $$0 -> $$0.b, new har($$02.a($$1.g)), new har($$02.a($$1.h))));
    }

    public amo a(idb $$0) {
        return this.a;
    }

    public idb a() {
        return new idb();
    }

    @Override
    public void a(T $$0, idb $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = ((cuo)$$0).gP();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idb)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(amo.b("textures/entity/horse/donkey.png"), hdf.aG, hdf.aH, inr.d.l, hdf.aI, hdf.aJ);
        public static final /* enum */ a b = new a(amo.b("textures/entity/horse/mule.png"), hdf.bX, hdf.bY, inr.d.m, hdf.bZ, hdf.ca);
        final amo c;
        final hde d;
        final hde e;
        final inr.d f;
        final hde g;
        final hde h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(amo $$0, hde $$1, hde $$2, inr.d $$3, hde $$4, hde $$5) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            i = hwg$a.a();
        }
    }
}

