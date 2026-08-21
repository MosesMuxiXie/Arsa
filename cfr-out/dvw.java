/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class dvw {
    private final ftm a;
    private final ftm b;
    private final a c;
    private final b d;
    private final ftr e;

    public dvw(ftm $$0, ftm $$1, a $$2, b $$3, cgk $$4) {
        this($$0, $$1, $$2, $$3, ftr.a($$4));
    }

    public dvw(ftm $$0, ftm $$1, a $$2, b $$3, ftr $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public ftm a() {
        return this.b;
    }

    public ftm b() {
        return this.a;
    }

    public fug a(eoh $$0, dvt $$1, is $$2) {
        return this.c.get($$0, $$1, $$2, this.e);
    }

    public fug a(flb $$0, dvt $$1, is $$2) {
        return this.d.a($$0) ? $$0.d($$1, $$2) : fud.a();
    }

    public static final class a
    extends Enum<a>
    implements c {
        public static final /* enum */ a a = new a(eog.a::b);
        public static final /* enum */ a b = new a(eog.a::a);
        public static final /* enum */ a c = new a(eog.a::c);
        public static final /* enum */ a d = new a(($$0, $$1, $$2, $$3) -> {
            ftw $$4;
            if ($$0.a(bdp.be)) {
                return fud.b();
            }
            if ($$3 instanceof ftw && ($$4 = (ftw)$$3).f() != null && $$4.f().ay() == cgu.cb) {
                if ($$0.a(dzs.lB) || $$0.a(dzs.gm)) {
                    return fud.b();
                }
                if ($$1 instanceof axf) {
                    axf $$5 = (axf)$$1;
                    if ($$0.a(dzs.eI) && $$5.U().a(eua.J) == 0) {
                        return fud.b();
                    }
                }
            }
            return fud.a();
        });
        private final c e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(c $$0) {
            this.e = $$0;
        }

        @Override
        public fug get(eoh $$0, dvt $$1, is $$2, ftr $$3) {
            return this.e.get($$0, $$1, $$2, $$3);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            f = dvw$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b($$0 -> false);
        public static final /* enum */ b b = new b(flb::b);
        public static final /* enum */ b c = new b($$0 -> !$$0.c());
        public static final /* enum */ b d = new b($$0 -> $$0.a(bdv.a));
        private final Predicate<flb> e;
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(Predicate<flb> $$0) {
            this.e = $$0;
        }

        public boolean a(flb $$0) {
            return this.e.test($$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d};
        }

        static {
            f = dvw$b.a();
        }
    }

    public static interface c {
        public fug get(eoh var1, dvt var2, is var3, ftr var4);
    }
}

