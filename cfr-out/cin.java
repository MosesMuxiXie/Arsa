/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class cin {
    public static final Codec<jd<cin>> a = mi.t.r();
    public static final aao<xq, jd<cin>> b = aam.b(mj.c);
    private final double c;
    private boolean d;
    private final String e;
    private a f = cin$a.a;

    protected cin(String $$0, double $$1) {
        this.c = $$1;
        this.e = $$0;
    }

    public double a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public cin a(boolean $$0) {
        this.d = $$0;
        return this;
    }

    public cin a(a $$0) {
        this.f = $$0;
        return this;
    }

    public double a(double $$0) {
        return $$0;
    }

    public String c() {
        return this.e;
    }

    public l b(boolean $$0) {
        return this.f.a($$0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public l a(boolean $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> {
                    if ($$0) {
                        yield l.j;
                    }
                    yield l.m;
                }
                case 1 -> l.h;
                case 2 -> $$0 ? l.m : l.j;
            };
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = cin$a.a();
        }
    }
}

