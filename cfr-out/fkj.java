/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public final class fkj
extends fks<fkk.a, fkk> {
    private final is.a g = new is.a();

    public fkj(eqt $$0) {
        this($$0, new fkk($$0));
    }

    @VisibleForTesting
    public fkj(eqt $$0, fkk $$1) {
        super($$0, $$1);
    }

    @Override
    protected void a(long $$0) {
        int $$4;
        long $$1 = jw.e($$0);
        if (!((fkk)this.f).b($$1)) {
            return;
        }
        eoh $$2 = this.c(this.g.f($$0));
        int $$3 = this.a($$0, $$2);
        if ($$3 < ($$4 = ((fkk)this.f).e($$0))) {
            ((fkk)this.f).a($$0, 0);
            this.b($$0, fks.a.a($$4));
        } else {
            this.b($$0, c);
        }
        if ($$3 > 0) {
            this.c($$0, fks.a.a($$3, fkj.a($$2)));
        }
    }

    @Override
    protected void a(long $$0, long $$1, int $$2) {
        eoh $$3 = null;
        for (iz $$4 : d) {
            int $$6;
            int $$7;
            long $$5;
            if (!fks.a.a($$1, $$4) || !((fkk)this.f).b(jw.e($$5 = is.a($$0, $$4))) || ($$7 = $$2 - 1) <= ($$6 = ((fkk)this.f).e($$5))) continue;
            this.g.f($$5);
            eoh $$8 = this.c(this.g);
            int $$9 = $$2 - this.b($$8);
            if ($$9 <= $$6) continue;
            if ($$3 == null) {
                eoh eoh2 = $$3 = fks.a.b($$1) ? dzs.a.m() : this.c(this.g.f($$0));
            }
            if (this.a($$3, $$8, $$4)) continue;
            ((fkk)this.f).a($$5, $$9);
            if ($$9 <= 1) continue;
            this.c($$5, fks.a.a($$9, fkj.a($$8), $$4.g()));
        }
    }

    @Override
    protected void a(long $$0, long $$1) {
        int $$2 = fks.a.a($$1);
        for (iz $$3 : d) {
            int $$5;
            long $$4;
            if (!fks.a.a($$1, $$3) || !((fkk)this.f).b(jw.e($$4 = is.a($$0, $$3))) || ($$5 = ((fkk)this.f).e($$4)) == 0) continue;
            if ($$5 <= $$2 - 1) {
                eoh $$6 = this.c(this.g.f($$4));
                int $$7 = this.a($$4, $$6);
                ((fkk)this.f).a($$4, 0);
                if ($$7 < $$5) {
                    this.b($$4, fks.a.a($$5, $$3.g()));
                }
                if ($$7 <= 0) continue;
                this.c($$4, fks.a.a($$7, fkj.a($$6)));
                continue;
            }
            this.c($$4, fks.a.b($$5, false, $$3.g()));
        }
    }

    private int a(long $$0, eoh $$1) {
        int $$2 = $$1.k();
        if ($$2 > 0 && ((fkk)this.f).j(jw.e($$0))) {
            return $$2;
        }
        return 0;
    }

    @Override
    public void b(dvu $$02) {
        this.a($$02, true);
        eqs $$12 = this.e.c($$02.h, $$02.i);
        if ($$12 != null) {
            $$12.a((is $$0, eoh $$1) -> {
                int $$2 = $$1.k();
                this.c($$0.a(), fks.a.a($$2, fkj.a($$1)));
            });
        }
    }
}

