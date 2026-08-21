/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.apache.commons.lang3.math.Fraction
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;
import org.jspecify.annotations.Nullable;

public final class dnz
implements djs {
    public static final dnz a = new dnz(List.of());
    public static final Codec<dnz> b = dlt.b.listOf().flatXmap(dnz::a, $$0 -> DataResult.success($$0.g));
    public static final aao<xq, dnz> c = dlt.j.a(aam.a()).a(dnz::new, $$0 -> $$0.g);
    private static final Fraction e = Fraction.getFraction((int)1, (int)16);
    private static final int f = -1;
    public static final int d = -1;
    final List<dlt> g;
    final Fraction h;
    final int i;

    dnz(List<dlt> $$0, Fraction $$1, int $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
    }

    private static DataResult<dnz> a(List<dlt> $$0) {
        try {
            Fraction $$1 = dnz.b($$0);
            return DataResult.success((Object)new dnz($$0, $$1, -1));
        }
        catch (ArithmeticException $$2) {
            return DataResult.error(() -> "Excessive total bundle weight");
        }
    }

    public dnz(List<dlt> $$0) {
        this($$0, dnz.b($$0), -1);
    }

    private static Fraction b(List<dlt> $$0) {
        Fraction $$1 = Fraction.ZERO;
        for (dlt $$2 : $$0) {
            $$1 = $$1.add(dnz.b($$2).multiplyBy(Fraction.getFraction((int)$$2.N(), (int)1)));
        }
        return $$1;
    }

    static Fraction b(dlt $$0) {
        dnz $$1 = $$0.a(ki.X);
        if ($$1 != null) {
            return e.add($$1.f());
        }
        List<eky.c> $$2 = $$0.a(ki.ay, dnv.c).a();
        if (!$$2.isEmpty()) {
            return Fraction.ONE;
        }
        return Fraction.getFraction((int)1, (int)$$0.k());
    }

    public static boolean a(dlt $$0) {
        return !$$0.f() && $$0.h().d();
    }

    public int a() {
        int $$0 = this.e();
        int $$1 = $$0 > 12 ? 11 : 12;
        int $$2 = $$0 % 4;
        int $$3 = $$2 == 0 ? 0 : 4 - $$2;
        return Math.min($$0, $$1 - $$3);
    }

    public dlt a(int $$0) {
        return this.g.get($$0);
    }

    public Stream<dlt> b() {
        return this.g.stream().map(dlt::v);
    }

    public Iterable<dlt> c() {
        return this.g;
    }

    public Iterable<dlt> d() {
        return Lists.transform(this.g, dlt::v);
    }

    public int e() {
        return this.g.size();
    }

    public Fraction f() {
        return this.h;
    }

    public boolean g() {
        return this.g.isEmpty();
    }

    public int h() {
        return this.i;
    }

    public boolean i() {
        return this.i != -1;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof dnz) {
            dnz $$1 = (dnz)$$0;
            return this.h.equals((Object)$$1.h) && dlt.a(this.g, $$1.g);
        }
        return false;
    }

    public int hashCode() {
        return dlt.a(this.g);
    }

    public String toString() {
        return "BundleContents" + String.valueOf(this.g);
    }

    public static class a {
        private final List<dlt> a;
        private Fraction b;
        private int c;

        public a(dnz $$0) {
            this.a = new ArrayList<dlt>($$0.g);
            this.b = $$0.h;
            this.c = $$0.i;
        }

        public a a() {
            this.a.clear();
            this.b = Fraction.ZERO;
            this.c = -1;
            return this;
        }

        private int b(dlt $$0) {
            if (!$$0.l()) {
                return -1;
            }
            for (int $$1 = 0; $$1 < this.a.size(); ++$$1) {
                if (!dlt.c(this.a.get($$1), $$0)) continue;
                return $$1;
            }
            return -1;
        }

        private int c(dlt $$0) {
            Fraction $$1 = Fraction.ONE.subtract(this.b);
            return Math.max($$1.divideBy(dnz.b($$0)).intValue(), 0);
        }

        public int a(dlt $$0) {
            if (!dnz.a($$0)) {
                return 0;
            }
            int $$1 = Math.min($$0.N(), this.c($$0));
            if ($$1 == 0) {
                return 0;
            }
            this.b = this.b.add(dnz.b($$0).multiplyBy(Fraction.getFraction((int)$$1, (int)1)));
            int $$2 = this.b($$0);
            if ($$2 != -1) {
                dlt $$3 = this.a.remove($$2);
                dlt $$4 = $$3.c($$3.N() + $$1);
                $$0.h($$1);
                this.a.add(0, $$4);
            } else {
                this.a.add(0, $$0.a($$1));
            }
            return $$1;
        }

        public int a(dji $$0, ddm $$1) {
            dlt $$2 = $$0.g();
            int $$3 = this.c($$2);
            return dnz.a($$2) ? this.a($$0.b($$2.N(), $$3, $$1)) : 0;
        }

        public void a(int $$0) {
            this.c = this.c == $$0 || this.b($$0) ? -1 : $$0;
        }

        private boolean b(int $$0) {
            return $$0 < 0 || $$0 >= this.a.size();
        }

        public @Nullable dlt b() {
            if (this.a.isEmpty()) {
                return null;
            }
            int $$0 = this.b(this.c) ? 0 : this.c;
            dlt $$1 = this.a.remove($$0).v();
            this.b = this.b.subtract(dnz.b($$1).multiplyBy(Fraction.getFraction((int)$$1.N(), (int)1)));
            this.a(-1);
            return $$1;
        }

        public Fraction c() {
            return this.b;
        }

        public dnz d() {
            return new dnz(List.copyOf(this.a), this.b, this.c);
        }
    }
}

