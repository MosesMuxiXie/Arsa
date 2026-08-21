/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3i
 */
import org.joml.Vector3i;

public abstract class ftv {
    private static final iz.a[] d = iz.a.values();
    protected final int a;
    protected final int b;
    protected final int c;

    protected ftv(int $$0, int $$1, int $$2) {
        if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
            throw new IllegalArgumentException("Need all positive sizes: x: " + $$0 + ", y: " + $$1 + ", z: " + $$2);
        }
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public ftv a(f $$0) {
        if ($$0 == f.a) {
            return this;
        }
        Vector3i $$1 = $$0.a(new Vector3i(this.a, this.b, this.c));
        int $$2 = ftv.a($$1, 0);
        int $$3 = ftv.a($$1, 1);
        int $$4 = ftv.a($$1, 2);
        ftp $$5 = new ftp($$1.x, $$1.y, $$1.z);
        for (int $$6 = 0; $$6 < this.a; ++$$6) {
            for (int $$7 = 0; $$7 < this.b; ++$$7) {
                for (int $$8 = 0; $$8 < this.c; ++$$8) {
                    if (!this.b($$6, $$7, $$8)) continue;
                    Vector3i $$9 = $$0.a($$1.set($$6, $$7, $$8));
                    int $$10 = $$2 + $$9.x;
                    int $$11 = $$3 + $$9.y;
                    int $$12 = $$4 + $$9.z;
                    ((ftv)$$5).c($$10, $$11, $$12);
                }
            }
        }
        return $$5;
    }

    private static int a(Vector3i $$0, int $$1) {
        int $$2 = $$0.get($$1);
        if ($$2 < 0) {
            $$0.setComponent($$1, -$$2);
            return -$$2 - 1;
        }
        return 0;
    }

    public boolean a(ip $$0, int $$1, int $$2, int $$3) {
        return this.e($$0.a($$1, $$2, $$3, iz.a.a), $$0.a($$1, $$2, $$3, iz.a.b), $$0.a($$1, $$2, $$3, iz.a.c));
    }

    public boolean e(int $$0, int $$1, int $$2) {
        if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
            return false;
        }
        if ($$0 >= this.a || $$1 >= this.b || $$2 >= this.c) {
            return false;
        }
        return this.b($$0, $$1, $$2);
    }

    public boolean b(ip $$0, int $$1, int $$2, int $$3) {
        return this.b($$0.a($$1, $$2, $$3, iz.a.a), $$0.a($$1, $$2, $$3, iz.a.b), $$0.a($$1, $$2, $$3, iz.a.c));
    }

    public abstract boolean b(int var1, int var2, int var3);

    public abstract void c(int var1, int var2, int var3);

    public boolean a() {
        for (iz.a $$0 : d) {
            if (this.a($$0) < this.b($$0)) continue;
            return true;
        }
        return false;
    }

    public abstract int a(iz.a var1);

    public abstract int b(iz.a var1);

    public int a(iz.a $$0, int $$1, int $$2) {
        int $$3 = this.c($$0);
        if ($$1 < 0 || $$2 < 0) {
            return $$3;
        }
        iz.a $$4 = ip.b.a($$0);
        iz.a $$5 = ip.c.a($$0);
        if ($$1 >= this.c($$4) || $$2 >= this.c($$5)) {
            return $$3;
        }
        ip $$6 = ip.a(iz.a.a, $$0);
        for (int $$7 = 0; $$7 < $$3; ++$$7) {
            if (!this.b($$6, $$7, $$1, $$2)) continue;
            return $$7;
        }
        return $$3;
    }

    public int b(iz.a $$0, int $$1, int $$2) {
        if ($$1 < 0 || $$2 < 0) {
            return 0;
        }
        iz.a $$3 = ip.b.a($$0);
        iz.a $$4 = ip.c.a($$0);
        if ($$1 >= this.c($$3) || $$2 >= this.c($$4)) {
            return 0;
        }
        int $$5 = this.c($$0);
        ip $$6 = ip.a(iz.a.a, $$0);
        for (int $$7 = $$5 - 1; $$7 >= 0; --$$7) {
            if (!this.b($$6, $$7, $$1, $$2)) continue;
            return $$7 + 1;
        }
        return 0;
    }

    public int c(iz.a $$0) {
        return $$0.a(this.a, this.b, this.c);
    }

    public int b() {
        return this.c(iz.a.a);
    }

    public int c() {
        return this.c(iz.a.b);
    }

    public int d() {
        return this.c(iz.a.c);
    }

    public void a(b $$0, boolean $$1) {
        this.a($$0, ip.a, $$1);
        this.a($$0, ip.b, $$1);
        this.a($$0, ip.c, $$1);
    }

    private void a(b $$0, ip $$1, boolean $$2) {
        ip $$3 = $$1.a();
        int $$4 = this.c($$3.a(iz.a.a));
        int $$5 = this.c($$3.a(iz.a.b));
        int $$6 = this.c($$3.a(iz.a.c));
        for (int $$7 = 0; $$7 <= $$4; ++$$7) {
            for (int $$8 = 0; $$8 <= $$5; ++$$8) {
                int $$9 = -1;
                for (int $$10 = 0; $$10 <= $$6; ++$$10) {
                    int $$11 = 0;
                    int $$12 = 0;
                    for (int $$13 = 0; $$13 <= 1; ++$$13) {
                        for (int $$14 = 0; $$14 <= 1; ++$$14) {
                            if (!this.a($$3, $$7 + $$13 - 1, $$8 + $$14 - 1, $$10)) continue;
                            ++$$11;
                            $$12 ^= $$13 ^ $$14;
                        }
                    }
                    if ($$11 == 1 || $$11 == 3 || $$11 == 2 && !($$12 & true)) {
                        if ($$2) {
                            if ($$9 != -1) continue;
                            $$9 = $$10;
                            continue;
                        }
                        $$0.consume($$3.a($$7, $$8, $$10, iz.a.a), $$3.a($$7, $$8, $$10, iz.a.b), $$3.a($$7, $$8, $$10, iz.a.c), $$3.a($$7, $$8, $$10 + 1, iz.a.a), $$3.a($$7, $$8, $$10 + 1, iz.a.b), $$3.a($$7, $$8, $$10 + 1, iz.a.c));
                        continue;
                    }
                    if ($$9 == -1) continue;
                    $$0.consume($$3.a($$7, $$8, $$9, iz.a.a), $$3.a($$7, $$8, $$9, iz.a.b), $$3.a($$7, $$8, $$9, iz.a.c), $$3.a($$7, $$8, $$10, iz.a.a), $$3.a($$7, $$8, $$10, iz.a.b), $$3.a($$7, $$8, $$10, iz.a.c));
                    $$9 = -1;
                }
            }
        }
    }

    public void b(b $$0, boolean $$1) {
        ftp.a(this, $$0, $$1);
    }

    public void a(a $$0) {
        this.a($$0, ip.a);
        this.a($$0, ip.b);
        this.a($$0, ip.c);
    }

    private void a(a $$0, ip $$1) {
        ip $$2 = $$1.a();
        iz.a $$3 = $$2.a(iz.a.c);
        int $$4 = this.c($$2.a(iz.a.a));
        int $$5 = this.c($$2.a(iz.a.b));
        int $$6 = this.c($$3);
        iz $$7 = iz.a($$3, iz.b.b);
        iz $$8 = iz.a($$3, iz.b.a);
        for (int $$9 = 0; $$9 < $$4; ++$$9) {
            for (int $$10 = 0; $$10 < $$5; ++$$10) {
                boolean $$11 = false;
                for (int $$12 = 0; $$12 <= $$6; ++$$12) {
                    boolean $$13;
                    boolean bl2 = $$13 = $$12 != $$6 && this.b($$2, $$9, $$10, $$12);
                    if (!$$11 && $$13) {
                        $$0.consume($$7, $$2.a($$9, $$10, $$12, iz.a.a), $$2.a($$9, $$10, $$12, iz.a.b), $$2.a($$9, $$10, $$12, iz.a.c));
                    }
                    if ($$11 && !$$13) {
                        $$0.consume($$8, $$2.a($$9, $$10, $$12 - 1, iz.a.a), $$2.a($$9, $$10, $$12 - 1, iz.a.b), $$2.a($$9, $$10, $$12 - 1, iz.a.c));
                    }
                    $$11 = $$13;
                }
            }
        }
    }

    public static interface b {
        public void consume(int var1, int var2, int var3, int var4, int var5, int var6);
    }

    public static interface a {
        public void consume(iz var1, int var2, int var3, int var4);
    }
}

