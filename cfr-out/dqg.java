/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public class dqg
implements dqy {
    public static final dqg a = new dqg(0, 0, List.of());
    private final int b;
    private final int c;
    private final List<dlt> d;
    private final ddu e = new ddu();
    private final int f;

    private dqg(int $$0, int $$1, List<dlt> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        int $$3 = 0;
        for (dlt $$4 : $$2) {
            if ($$4.f()) continue;
            ++$$3;
            this.e.a($$4, 1);
        }
        this.f = $$3;
    }

    public static dqg a(int $$0, int $$1, List<dlt> $$2) {
        return dqg.b($$0, $$1, $$2).a();
    }

    public static a b(int $$0, int $$1, List<dlt> $$2) {
        if ($$0 == 0 || $$1 == 0) {
            return dqg$a.a;
        }
        int $$3 = $$0 - 1;
        int $$4 = 0;
        int $$5 = $$1 - 1;
        int $$6 = 0;
        for (int $$7 = 0; $$7 < $$1; ++$$7) {
            boolean $$8 = true;
            for (int $$9 = 0; $$9 < $$0; ++$$9) {
                dlt $$10 = $$2.get($$9 + $$7 * $$0);
                if ($$10.f()) continue;
                $$3 = Math.min($$3, $$9);
                $$4 = Math.max($$4, $$9);
                $$8 = false;
            }
            if ($$8) continue;
            $$5 = Math.min($$5, $$7);
            $$6 = Math.max($$6, $$7);
        }
        int $$11 = $$4 - $$3 + 1;
        int $$12 = $$6 - $$5 + 1;
        if ($$11 <= 0 || $$12 <= 0) {
            return dqg$a.a;
        }
        if ($$11 == $$0 && $$12 == $$1) {
            return new a(new dqg($$0, $$1, $$2), $$3, $$5);
        }
        ArrayList<dlt> $$13 = new ArrayList<dlt>($$11 * $$12);
        for (int $$14 = 0; $$14 < $$12; ++$$14) {
            for (int $$15 = 0; $$15 < $$11; ++$$15) {
                int $$16 = $$15 + $$3 + ($$14 + $$5) * $$0;
                $$13.add($$2.get($$16));
            }
        }
        return new a(new dqg($$11, $$12, $$13), $$3, $$5);
    }

    @Override
    public dlt a(int $$0) {
        return this.d.get($$0);
    }

    public dlt a(int $$0, int $$1) {
        return this.d.get($$0 + $$1 * this.b);
    }

    @Override
    public int a() {
        return this.d.size();
    }

    @Override
    public boolean b() {
        return this.f == 0;
    }

    public ddu c() {
        return this.e;
    }

    public List<dlt> d() {
        return this.d;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if ($$0 instanceof dqg) {
            dqg $$1 = (dqg)$$0;
            return this.b == $$1.b && this.c == $$1.c && this.f == $$1.f && dlt.a(this.d, $$1.d);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = dlt.a(this.d);
        $$0 = 31 * $$0 + this.b;
        $$0 = 31 * $$0 + this.c;
        return $$0;
    }

    public static final class a
    extends Record {
        private final dqg b;
        private final int c;
        private final int d;
        public static final a a = new a(a, 0, 0);

        public a(dqg $$0, int $$1, int $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "input;left;top", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "input;left;top", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "input;left;top", "b", "c", "d"}, this, $$0);
        }

        public dqg a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }
    }
}

