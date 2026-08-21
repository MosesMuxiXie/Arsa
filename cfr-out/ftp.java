/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class ftp
extends ftv {
    private final BitSet d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public ftp(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
        this.d = new BitSet($$0 * $$1 * $$2);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public static ftp a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        ftp $$9 = new ftp($$0, $$1, $$2);
        $$9.e = $$3;
        $$9.f = $$4;
        $$9.g = $$5;
        $$9.h = $$6;
        $$9.i = $$7;
        $$9.j = $$8;
        for (int $$10 = $$3; $$10 < $$6; ++$$10) {
            for (int $$11 = $$4; $$11 < $$7; ++$$11) {
                for (int $$12 = $$5; $$12 < $$8; ++$$12) {
                    $$9.a($$10, $$11, $$12, false);
                }
            }
        }
        return $$9;
    }

    public ftp(ftv $$0) {
        super($$0.a, $$0.b, $$0.c);
        if ($$0 instanceof ftp) {
            this.d = (BitSet)((ftp)$$0).d.clone();
        } else {
            this.d = new BitSet(this.a * this.b * this.c);
            for (int $$1 = 0; $$1 < this.a; ++$$1) {
                for (int $$2 = 0; $$2 < this.b; ++$$2) {
                    for (int $$3 = 0; $$3 < this.c; ++$$3) {
                        if (!$$0.b($$1, $$2, $$3)) continue;
                        this.d.set(this.a($$1, $$2, $$3));
                    }
                }
            }
        }
        this.e = $$0.a(iz.a.a);
        this.f = $$0.a(iz.a.b);
        this.g = $$0.a(iz.a.c);
        this.h = $$0.b(iz.a.a);
        this.i = $$0.b(iz.a.b);
        this.j = $$0.b(iz.a.c);
    }

    protected int a(int $$0, int $$1, int $$2) {
        return ($$0 * this.b + $$1) * this.c + $$2;
    }

    @Override
    public boolean b(int $$0, int $$1, int $$2) {
        return this.d.get(this.a($$0, $$1, $$2));
    }

    private void a(int $$0, int $$1, int $$2, boolean $$3) {
        this.d.set(this.a($$0, $$1, $$2));
        if ($$3) {
            this.e = Math.min(this.e, $$0);
            this.f = Math.min(this.f, $$1);
            this.g = Math.min(this.g, $$2);
            this.h = Math.max(this.h, $$0 + 1);
            this.i = Math.max(this.i, $$1 + 1);
            this.j = Math.max(this.j, $$2 + 1);
        }
    }

    @Override
    public void c(int $$0, int $$1, int $$2) {
        this.a($$0, $$1, $$2, true);
    }

    @Override
    public boolean a() {
        return this.d.isEmpty();
    }

    @Override
    public int a(iz.a $$0) {
        return $$0.a(this.e, this.f, this.g);
    }

    @Override
    public int b(iz.a $$0) {
        return $$0.a(this.h, this.i, this.j);
    }

    static ftp a(ftv $$0, ftv $$1, fty $$2, fty $$3, fty $$4, ftq $$5) {
        ftp $$6 = new ftp($$2.size() - 1, $$3.size() - 1, $$4.size() - 1);
        int[] $$72 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        $$2.a((int $$7, int $$8, int $$9) -> {
            boolean[] $$102 = new boolean[]{false};
            $$3.a((int $$10, int $$11, int $$122) -> {
                boolean[] $$132 = new boolean[]{false};
                $$4.a((int $$12, int $$13, int $$14) -> {
                    if ($$5.apply($$0.e($$7, $$10, $$12), $$1.e($$8, $$11, $$13))) {
                        $$7.d.set($$6.a($$9, $$122, $$14));
                        $$10[2] = Math.min($$72[2], $$14);
                        $$10[5] = Math.max($$72[5], $$14);
                        $$11[0] = true;
                    }
                    return true;
                });
                if ($$132[0]) {
                    $$8[1] = Math.min($$72[1], $$122);
                    $$8[4] = Math.max($$72[4], $$122);
                    $$9[0] = true;
                }
                return true;
            });
            if ($$102[0]) {
                $$6[0] = Math.min($$72[0], $$9);
                $$6[3] = Math.max($$72[3], $$9);
            }
            return true;
        });
        $$6.e = $$72[0];
        $$6.f = $$72[1];
        $$6.g = $$72[2];
        $$6.h = $$72[3] + 1;
        $$6.i = $$72[4] + 1;
        $$6.j = $$72[5] + 1;
        return $$6;
    }

    protected static void a(ftv $$0, ftv.b $$1, boolean $$2) {
        ftp $$3 = new ftp($$0);
        for (int $$4 = 0; $$4 < $$3.b; ++$$4) {
            for (int $$5 = 0; $$5 < $$3.a; ++$$5) {
                int $$6 = -1;
                for (int $$7 = 0; $$7 <= $$3.c; ++$$7) {
                    if ($$3.e($$5, $$4, $$7)) {
                        if ($$2) {
                            if ($$6 != -1) continue;
                            $$6 = $$7;
                            continue;
                        }
                        $$1.consume($$5, $$4, $$7, $$5 + 1, $$4 + 1, $$7 + 1);
                        continue;
                    }
                    if ($$6 == -1) continue;
                    int $$8 = $$5;
                    int $$9 = $$4;
                    $$3.b($$6, $$7, $$5, $$4);
                    while ($$3.a($$6, $$7, $$8 + 1, $$4)) {
                        $$3.b($$6, $$7, $$8 + 1, $$4);
                        ++$$8;
                    }
                    while ($$3.a($$5, $$8 + 1, $$6, $$7, $$9 + 1)) {
                        for (int $$10 = $$5; $$10 <= $$8; ++$$10) {
                            $$3.b($$6, $$7, $$10, $$9 + 1);
                        }
                        ++$$9;
                    }
                    $$1.consume($$5, $$4, $$6, $$8 + 1, $$9 + 1, $$7);
                    $$6 = -1;
                }
            }
        }
    }

    private boolean a(int $$0, int $$1, int $$2, int $$3) {
        if ($$2 >= this.a || $$3 >= this.b) {
            return false;
        }
        return this.d.nextClearBit(this.a($$2, $$3, $$0)) >= this.a($$2, $$3, $$1);
    }

    private boolean a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$0; $$5 < $$1; ++$$5) {
            if (this.a($$2, $$3, $$5, $$4)) continue;
            return false;
        }
        return true;
    }

    private void b(int $$0, int $$1, int $$2, int $$3) {
        this.d.clear(this.a($$2, $$3, $$0), this.a($$2, $$3, $$1));
    }

    public boolean d(int $$0, int $$1, int $$2) {
        boolean $$3 = $$0 > 0 && $$0 < this.a - 1 && $$1 > 0 && $$1 < this.b - 1 && $$2 > 0 && $$2 < this.c - 1;
        return $$3 && this.b($$0, $$1, $$2) && this.b($$0 - 1, $$1, $$2) && this.b($$0 + 1, $$1, $$2) && this.b($$0, $$1 - 1, $$2) && this.b($$0, $$1 + 1, $$2) && this.b($$0, $$1, $$2 - 1) && this.b($$0, $$1, $$2 + 1);
    }
}

