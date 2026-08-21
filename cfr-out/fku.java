/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public final class fku
extends fks<fkv.a, fkv> {
    private static final long g = fks.a.a(15);
    private static final long h = fks.a.a(15, iz.b);
    private static final long i = fks.a.a(15, false, iz.b);
    private final is.a j = new is.a();
    private final fkl k;

    public fku(eqt $$0) {
        this($$0, new fkv($$0));
    }

    @VisibleForTesting
    protected fku(eqt $$0, fkv $$1) {
        super($$0, $$1);
        this.k = new fkl($$0.s());
    }

    private static boolean a(int $$0) {
        return $$0 == 15;
    }

    private int a(int $$0, int $$1, int $$2) {
        fkl $$3 = this.b(jw.a($$0), jw.a($$1));
        if ($$3 == null) {
            return $$2;
        }
        return $$3.a(jw.b($$0), jw.b($$1));
    }

    private @Nullable fkl b(int $$0, int $$1) {
        eqs $$2 = this.e.c($$0, $$1);
        return $$2 != null ? $$2.D() : null;
    }

    @Override
    protected void a(long $$0) {
        boolean $$6;
        int $$5;
        int $$1 = is.a($$0);
        int $$2 = is.b($$0);
        int $$3 = is.c($$0);
        long $$4 = jw.e($$0);
        int n2 = $$5 = ((fkv)this.f).j($$4) ? this.a($$1, $$3, Integer.MAX_VALUE) : Integer.MAX_VALUE;
        if ($$5 != Integer.MAX_VALUE) {
            this.b($$1, $$3, $$5);
        }
        if (!((fkv)this.f).b($$4)) {
            return;
        }
        boolean bl2 = $$6 = $$2 >= $$5;
        if ($$6) {
            this.b($$0, h);
            this.c($$0, i);
        } else {
            int $$7 = ((fkv)this.f).e($$0);
            if ($$7 > 0) {
                ((fkv)this.f).a($$0, 0);
                this.b($$0, fks.a.a($$7));
            } else {
                this.b($$0, c);
            }
        }
    }

    private void b(int $$0, int $$1, int $$2) {
        int $$3 = jw.c(((fkv)this.f).c());
        this.a($$0, $$1, $$2, $$3);
        this.b($$0, $$1, $$2, $$3);
    }

    private void a(int $$0, int $$1, int $$2, int $$3) {
        if ($$2 <= $$3) {
            return;
        }
        int $$4 = jw.a($$0);
        int $$5 = jw.a($$1);
        int $$6 = $$2 - 1;
        int $$7 = jw.a($$6);
        while (((fkv)this.f).a($$7)) {
            if (((fkv)this.f).b(jw.b($$4, $$7, $$5))) {
                int $$8 = jw.c($$7);
                int $$9 = $$8 + 15;
                for (int $$10 = Math.min($$9, $$6); $$10 >= $$8; --$$10) {
                    long $$11 = is.a($$0, $$10, $$1);
                    if (!fku.a(((fkv)this.f).e($$11))) {
                        return;
                    }
                    ((fkv)this.f).a($$11, 0);
                    this.b($$11, $$10 == $$2 - 1 ? g : h);
                }
            }
            --$$7;
        }
    }

    private void b(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = jw.a($$0);
        int $$5 = jw.a($$1);
        int $$6 = Math.max(Math.max(this.a($$0 - 1, $$1, Integer.MIN_VALUE), this.a($$0 + 1, $$1, Integer.MIN_VALUE)), Math.max(this.a($$0, $$1 - 1, Integer.MIN_VALUE), this.a($$0, $$1 + 1, Integer.MIN_VALUE)));
        int $$7 = Math.max($$2, $$3);
        long $$8 = jw.b($$4, jw.a($$7), $$5);
        while (!((fkv)this.f).m($$8)) {
            if (((fkv)this.f).b($$8)) {
                int $$9 = jw.c(jw.c($$8));
                int $$10 = $$9 + 15;
                for (int $$11 = Math.max($$9, $$7); $$11 <= $$10; ++$$11) {
                    long $$12 = is.a($$0, $$11, $$1);
                    if (fku.a(((fkv)this.f).e($$12))) {
                        return;
                    }
                    ((fkv)this.f).a($$12, 15);
                    if ($$11 >= $$6 && $$11 != $$2) continue;
                    this.c($$12, i);
                }
            }
            $$8 = jw.a($$8, iz.b);
        }
    }

    @Override
    protected void a(long $$0, long $$1, int $$2) {
        eoh $$3 = null;
        int $$4 = this.d($$0);
        for (iz $$5 : d) {
            int $$7;
            int $$8;
            long $$6;
            if (!fks.a.a($$1, $$5) || !((fkv)this.f).b(jw.e($$6 = is.a($$0, $$5))) || ($$8 = $$2 - 1) <= ($$7 = ((fkv)this.f).e($$6))) continue;
            this.j.f($$6);
            eoh $$9 = this.c(this.j);
            int $$10 = $$2 - this.b($$9);
            if ($$10 <= $$7) continue;
            if ($$3 == null) {
                eoh eoh2 = $$3 = fks.a.b($$1) ? dzs.a.m() : this.c(this.j.f($$0));
            }
            if (this.a($$3, $$9, $$5)) continue;
            ((fkv)this.f).a($$6, $$10);
            if ($$10 > 1) {
                this.c($$6, fks.a.a($$10, fku.a($$9), $$5.g()));
            }
            this.a($$6, $$5, $$10, true, $$4);
        }
    }

    @Override
    protected void a(long $$0, long $$1) {
        int $$2 = this.d($$0);
        int $$3 = fks.a.a($$1);
        for (iz $$4 : d) {
            int $$6;
            long $$5;
            if (!fks.a.a($$1, $$4) || !((fkv)this.f).b(jw.e($$5 = is.a($$0, $$4))) || ($$6 = ((fkv)this.f).e($$5)) == 0) continue;
            if ($$6 <= $$3 - 1) {
                ((fkv)this.f).a($$5, 0);
                this.b($$5, fks.a.a($$6, $$4.g()));
                this.a($$5, $$4, $$6, false, $$2);
                continue;
            }
            this.c($$5, fks.a.b($$6, false, $$4.g()));
        }
    }

    private int d(long $$0) {
        int $$1 = is.b($$0);
        int $$2 = jw.b($$1);
        if ($$2 != 0) {
            return 0;
        }
        int $$3 = is.a($$0);
        int $$4 = is.c($$0);
        int $$5 = jw.b($$3);
        int $$6 = jw.b($$4);
        if ($$5 == 0 || $$5 == 15 || $$6 == 0 || $$6 == 15) {
            int $$7 = jw.a($$3);
            int $$8 = jw.a($$1);
            int $$9 = jw.a($$4);
            int $$10 = 0;
            while (!((fkv)this.f).b(jw.b($$7, $$8 - $$10 - 1, $$9)) && ((fkv)this.f).a($$8 - $$10 - 1)) {
                ++$$10;
            }
            return $$10;
        }
        return 0;
    }

    private void a(long $$0, iz $$1, int $$2, boolean $$3, int $$4) {
        if ($$4 == 0) {
            return;
        }
        int $$5 = is.a($$0);
        int $$6 = is.c($$0);
        if (!fku.a($$1, jw.b($$5), jw.b($$6))) {
            return;
        }
        int $$7 = is.b($$0);
        int $$8 = jw.a($$5);
        int $$9 = jw.a($$6);
        int $$10 = jw.a($$7) - 1;
        int $$11 = $$10 - $$4 + 1;
        while ($$10 >= $$11) {
            if (!((fkv)this.f).b(jw.b($$8, $$10, $$9))) {
                --$$10;
                continue;
            }
            int $$12 = jw.c($$10);
            for (int $$13 = 15; $$13 >= 0; --$$13) {
                long $$14 = is.a($$5, $$12 + $$13, $$6);
                if ($$3) {
                    ((fkv)this.f).a($$14, $$2);
                    if ($$2 <= 1) continue;
                    this.c($$14, fks.a.a($$2, true, $$1.g()));
                    continue;
                }
                ((fkv)this.f).a($$14, 0);
                this.b($$14, fks.a.a($$2, $$1.g()));
            }
            --$$10;
        }
    }

    private static boolean a(iz $$0, int $$1, int $$2) {
        return switch ($$0) {
            case iz.c -> {
                if ($$2 == 15) {
                    yield true;
                }
                yield false;
            }
            case iz.d -> {
                if ($$2 == 0) {
                    yield true;
                }
                yield false;
            }
            case iz.e -> {
                if ($$1 == 15) {
                    yield true;
                }
                yield false;
            }
            case iz.f -> {
                if ($$1 == 0) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    @Override
    public void a(dvu $$0, boolean $$1) {
        super.a($$0, $$1);
        if ($$1) {
            fkl $$2 = Objects.requireNonNullElse(this.b($$0.h, $$0.i), this.k);
            int $$3 = $$2.a() - 1;
            int $$4 = jw.a($$3) + 1;
            long $$5 = jw.b($$0.h, $$0.i);
            int $$6 = ((fkv)this.f).n($$5);
            int $$7 = Math.max(((fkv)this.f).c(), $$4);
            for (int $$8 = $$6 - 1; $$8 >= $$7; --$$8) {
                eql $$9 = ((fkv)this.f).c(jw.b($$0.h, $$8, $$0.i));
                if ($$9 == null || !$$9.d()) continue;
                $$9.a(15);
            }
        }
    }

    @Override
    public void b(dvu $$0) {
        long $$1 = jw.b($$0.h, $$0.i);
        ((fkv)this.f).b($$1, true);
        fkl $$2 = Objects.requireNonNullElse(this.b($$0.h, $$0.i), this.k);
        fkl $$3 = Objects.requireNonNullElse(this.b($$0.h, $$0.i - 1), this.k);
        fkl $$4 = Objects.requireNonNullElse(this.b($$0.h, $$0.i + 1), this.k);
        fkl $$5 = Objects.requireNonNullElse(this.b($$0.h - 1, $$0.i), this.k);
        fkl $$6 = Objects.requireNonNullElse(this.b($$0.h + 1, $$0.i), this.k);
        int $$7 = ((fkv)this.f).n($$1);
        int $$8 = ((fkv)this.f).c();
        int $$9 = jw.c($$0.h);
        int $$10 = jw.c($$0.i);
        for (int $$11 = $$7 - 1; $$11 >= $$8; --$$11) {
            long $$12 = jw.b($$0.h, $$11, $$0.i);
            eql $$13 = ((fkv)this.f).c($$12);
            if ($$13 == null) continue;
            int $$14 = jw.c($$11);
            int $$15 = $$14 + 15;
            boolean $$16 = false;
            for (int $$17 = 0; $$17 < 16; ++$$17) {
                for (int $$18 = 0; $$18 < 16; ++$$18) {
                    int $$19 = $$2.a($$18, $$17);
                    if ($$19 > $$15) continue;
                    int $$20 = $$17 == 0 ? $$3.a($$18, 15) : $$2.a($$18, $$17 - 1);
                    int $$21 = $$17 == 15 ? $$4.a($$18, 0) : $$2.a($$18, $$17 + 1);
                    int $$22 = $$18 == 0 ? $$5.a(15, $$17) : $$2.a($$18 - 1, $$17);
                    int $$23 = $$18 == 15 ? $$6.a(0, $$17) : $$2.a($$18 + 1, $$17);
                    int $$24 = Math.max(Math.max($$20, $$21), Math.max($$22, $$23));
                    for (int $$25 = $$15; $$25 >= Math.max($$14, $$19); --$$25) {
                        $$13.a($$18, jw.b($$25), $$17, 15);
                        if ($$25 != $$19 && $$25 >= $$24) continue;
                        long $$26 = is.a($$9 + $$18, $$25, $$10 + $$17);
                        this.c($$26, fks.a.a($$25 == $$19, $$25 < $$20, $$25 < $$21, $$25 < $$22, $$25 < $$23));
                    }
                    if ($$19 >= $$14) continue;
                    $$16 = true;
                }
            }
            if (!$$16) break;
        }
    }
}

