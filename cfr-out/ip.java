/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class ip
extends Enum<ip> {
    public static final /* enum */ ip a = new ip(){

        @Override
        public int a(int $$0, int $$1, int $$2, iz.a $$3) {
            return $$3.a($$0, $$1, $$2);
        }

        @Override
        public double a(double $$0, double $$1, double $$2, iz.a $$3) {
            return $$3.a($$0, $$1, $$2);
        }

        @Override
        public iz.a a(iz.a $$0) {
            return $$0;
        }

        @Override
        public ip a() {
            return this;
        }
    };
    public static final /* enum */ ip b = new ip(){

        @Override
        public int a(int $$0, int $$1, int $$2, iz.a $$3) {
            return $$3.a($$2, $$0, $$1);
        }

        @Override
        public double a(double $$0, double $$1, double $$2, iz.a $$3) {
            return $$3.a($$2, $$0, $$1);
        }

        @Override
        public iz.a a(iz.a $$0) {
            return d[Math.floorMod($$0.ordinal() + 1, 3)];
        }

        @Override
        public ip a() {
            return c;
        }
    };
    public static final /* enum */ ip c = new ip(){

        @Override
        public int a(int $$0, int $$1, int $$2, iz.a $$3) {
            return $$3.a($$1, $$2, $$0);
        }

        @Override
        public double a(double $$0, double $$1, double $$2, iz.a $$3) {
            return $$3.a($$1, $$2, $$0);
        }

        @Override
        public iz.a a(iz.a $$0) {
            return d[Math.floorMod($$0.ordinal() - 1, 3)];
        }

        @Override
        public ip a() {
            return b;
        }
    };
    public static final iz.a[] d;
    public static final ip[] e;
    private static final /* synthetic */ ip[] f;

    public static ip[] values() {
        return (ip[])f.clone();
    }

    public static ip valueOf(String $$0) {
        return Enum.valueOf(ip.class, $$0);
    }

    public abstract int a(int var1, int var2, int var3, iz.a var4);

    public abstract double a(double var1, double var3, double var5, iz.a var7);

    public abstract iz.a a(iz.a var1);

    public abstract ip a();

    public static ip a(iz.a $$0, iz.a $$1) {
        return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
    }

    private static /* synthetic */ ip[] b() {
        return new ip[]{a, b, c};
    }

    static {
        f = ip.b();
        d = iz.a.values();
        e = ip.values();
    }
}

