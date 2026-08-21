/*
 * Decompiled with CFR 0.152.
 */
public class fkl {
    private static final int b = 16;
    public static final int a = Integer.MIN_VALUE;
    private final int c;
    private final beq d;
    private final is.a e = new is.a();
    private final is.a f = new is.a();

    public fkl(dwq $$0) {
        this.c = $$0.K_() - 1;
        int $$1 = $$0.aw() + 1;
        int $$2 = bgj.f($$1 - this.c + 1);
        this.d = new bgy($$2, 256);
    }

    public void a(eqf $$0) {
        int $$1 = $$0.a();
        if ($$1 == -1) {
            this.a(this.c);
            return;
        }
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            for (int $$3 = 0; $$3 < 16; ++$$3) {
                int $$4 = Math.max(this.a($$0, $$1, $$3, $$2), this.c);
                this.b(fkl.c($$3, $$2), $$4);
            }
        }
    }

    private int a(eqf $$0, int $$1, int $$2, int $$3) {
        int $$4 = jw.c($$0.h($$1) + 1);
        is.a $$5 = this.e.d($$2, $$4, $$3);
        is.a $$6 = this.f.a((jy)$$5, iz.a);
        eoh $$7 = dzs.a.m();
        for (int $$8 = $$1; $$8 >= 0; --$$8) {
            eqr $$9 = $$0.b($$8);
            if ($$9.c()) {
                $$7 = dzs.a.m();
                int $$10 = $$0.h($$8);
                $$5.q(jw.c($$10));
                $$6.q($$5.v() - 1);
                continue;
            }
            for (int $$11 = 15; $$11 >= 0; --$$11) {
                eoh $$12 = $$9.a($$2, $$11, $$3);
                if (fkl.a($$7, $$12)) {
                    return $$5.v();
                }
                $$7 = $$12;
                $$5.g($$6);
                $$6.c(iz.a);
            }
        }
        return this.c;
    }

    public boolean a(dvt $$0, int $$1, int $$2, int $$3) {
        eoh $$10;
        is.a $$9;
        eoh $$8;
        int $$4 = $$2 + 1;
        int $$5 = fkl.c($$1, $$3);
        int $$6 = this.b($$5);
        if ($$4 < $$6) {
            return false;
        }
        is.a $$7 = this.e.d($$1, $$2 + 1, $$3);
        if (this.a($$0, $$5, $$6, $$7, $$8 = $$0.a_($$7), $$9 = this.f.d($$1, $$2, $$3), $$10 = $$0.a_($$9))) {
            return true;
        }
        is.a $$11 = this.e.d($$1, $$2 - 1, $$3);
        eoh $$12 = $$0.a_($$11);
        return this.a($$0, $$5, $$6, $$9, $$10, $$11, $$12);
    }

    private boolean a(dvt $$0, int $$1, int $$2, is $$3, eoh $$4, is $$5, eoh $$6) {
        int $$7 = $$3.v();
        if (fkl.a($$4, $$6)) {
            if ($$7 > $$2) {
                this.b($$1, $$7);
                return true;
            }
        } else if ($$7 == $$2) {
            this.b($$1, this.a($$0, $$5, $$6));
            return true;
        }
        return false;
    }

    private int a(dvt $$0, is $$1, eoh $$2) {
        is.a $$3 = this.e.g($$1);
        is.a $$4 = this.f.a((jy)$$1, iz.a);
        eoh $$5 = $$2;
        while ($$4.v() >= this.c) {
            eoh $$6 = $$0.a_($$4);
            if (fkl.a($$5, $$6)) {
                return $$3.v();
            }
            $$5 = $$6;
            $$3.g($$4);
            $$4.c(iz.a);
        }
        return this.c;
    }

    private static boolean a(eoh $$0, eoh $$1) {
        if ($$1.g() != 0) {
            return true;
        }
        fug $$2 = fks.a($$0, iz.a);
        fug $$3 = fks.a($$1, iz.b);
        return fud.b($$2, $$3);
    }

    public int a(int $$0, int $$1) {
        int $$2 = this.b(fkl.c($$0, $$1));
        return this.c($$2);
    }

    public int a() {
        int $$0 = Integer.MIN_VALUE;
        for (int $$1 = 0; $$1 < this.d.b(); ++$$1) {
            int $$2 = this.d.a($$1);
            if ($$2 <= $$0) continue;
            $$0 = $$2;
        }
        return this.c($$0 + this.c);
    }

    private void a(int $$0) {
        int $$1 = $$0 - this.c;
        for (int $$2 = 0; $$2 < this.d.b(); ++$$2) {
            this.d.b($$2, $$1);
        }
    }

    private void b(int $$0, int $$1) {
        this.d.b($$0, $$1 - this.c);
    }

    private int b(int $$0) {
        return this.d.a($$0) + this.c;
    }

    private int c(int $$0) {
        if ($$0 == this.c) {
            return Integer.MIN_VALUE;
        }
        return $$0;
    }

    private static int c(int $$0, int $$1) {
        return $$0 + $$1 * 16;
    }
}

