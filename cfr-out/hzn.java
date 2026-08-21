/*
 * Decompiled with CFR 0.152.
 */
public class hzn
extends hvd<cup, idg, hap<idg>> {
    private final amo a;

    public hzn(hwq.a $$02, a $$1) {
        super($$02, new has($$02.a($$1.d)), new has($$02.a($$1.e)));
        this.a = $$1.c;
        this.a(new ibn<idg, hap<idg>, has>(this, $$02.h(), inr.d.e, $$0 -> $$0.c, new has($$02.a(hdf.dS)), new has($$02.a(hdf.dT))));
        this.a(new ibn<idg, hap<idg>, har>(this, $$02.h(), $$1.f, $$0 -> $$0.b, new har($$02.a($$1.g)), new har($$02.a($$1.h))));
    }

    public amo a(idg $$0) {
        return this.a;
    }

    public idg b() {
        return new idg();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idg)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(amo.b("textures/entity/horse/horse_skeleton.png"), hdf.dj, hdf.dk, inr.d.o, hdf.dl, hdf.dm);
        public static final /* enum */ a b = new a(amo.b("textures/entity/horse/horse_zombie.png"), hdf.eA, hdf.eB, inr.d.n, hdf.eC, hdf.eD);
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
            i = hzn$a.a();
        }
    }
}

