/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.math.DoubleMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public abstract class fug {
    protected final ftv a;
    private @Nullable fug @Nullable [] b;

    protected fug(ftv $$0) {
        this.a = $$0;
    }

    public double b(iz.a $$0) {
        int $$1 = this.a.a($$0);
        if ($$1 >= this.a.c($$0)) {
            return Double.POSITIVE_INFINITY;
        }
        return this.a($$0, $$1);
    }

    public double c(iz.a $$0) {
        int $$1 = this.a.b($$0);
        if ($$1 <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return this.a($$0, $$1);
    }

    public fth a() {
        if (this.c()) {
            throw bhs.b(new UnsupportedOperationException("No bounds for empty shape."));
        }
        return new fth(this.b(iz.a.a), this.b(iz.a.b), this.b(iz.a.c), this.c(iz.a.a), this.c(iz.a.b), this.c(iz.a.c));
    }

    public fug b() {
        if (this.c()) {
            return fud.a();
        }
        return fud.a(this.b(iz.a.a), this.b(iz.a.b), this.b(iz.a.c), this.c(iz.a.a), this.c(iz.a.b), this.c(iz.a.c));
    }

    protected double a(iz.a $$0, int $$1) {
        return this.a($$0).getDouble($$1);
    }

    public abstract DoubleList a(iz.a var1);

    public boolean c() {
        return this.a.a();
    }

    public fug a(ftm $$0) {
        return this.a($$0.g, $$0.h, $$0.i);
    }

    public fug a(jy $$0) {
        return this.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
    }

    public fug a(double $$0, double $$1, double $$2) {
        if (this.c()) {
            return fud.a();
        }
        return new fto(this.a, (DoubleList)new fuc(this.a(iz.a.a), $$0), (DoubleList)new fuc(this.a(iz.a.b), $$1), (DoubleList)new fuc(this.a(iz.a.c), $$2));
    }

    public fug d() {
        fug[] $$0 = new fug[]{fud.a()};
        this.b((double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) -> {
            $$0[0] = fud.b($$0[0], fud.a($$1, $$2, $$3, $$4, $$5, $$6), ftq.o);
        });
        return $$0[0];
    }

    public void a(fud.a $$0) {
        this.a.a((int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) -> $$0.consume(this.a(iz.a.a, $$1), this.a(iz.a.b, $$2), this.a(iz.a.c, $$3), this.a(iz.a.a, $$4), this.a(iz.a.b, $$5), this.a(iz.a.c, $$6)), true);
    }

    public void b(fud.a $$0) {
        DoubleList $$1 = this.a(iz.a.a);
        DoubleList $$2 = this.a(iz.a.b);
        DoubleList $$3 = this.a(iz.a.c);
        this.a.b(($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume($$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)), true);
    }

    public List<fth> e() {
        ArrayList $$0 = Lists.newArrayList();
        this.b((double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) -> $$0.add(new fth($$1, $$2, $$3, $$4, $$5, $$6)));
        return $$0;
    }

    public double a(iz.a $$0, double $$1, double $$2) {
        int $$6;
        iz.a $$3 = ip.b.a($$0);
        iz.a $$4 = ip.c.a($$0);
        int $$5 = this.a($$3, $$1);
        int $$7 = this.a.a($$0, $$5, $$6 = this.a($$4, $$2));
        if ($$7 >= this.a.c($$0)) {
            return Double.POSITIVE_INFINITY;
        }
        return this.a($$0, $$7);
    }

    public double b(iz.a $$0, double $$1, double $$2) {
        int $$6;
        iz.a $$3 = ip.b.a($$0);
        iz.a $$4 = ip.c.a($$0);
        int $$5 = this.a($$3, $$1);
        int $$7 = this.a.b($$0, $$5, $$6 = this.a($$4, $$2));
        if ($$7 <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return this.a($$0, $$7);
    }

    protected int a(iz.a $$0, double $$1) {
        return bgj.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
    }

    public @Nullable fti a(ftm $$0, ftm $$1, is $$2) {
        if (this.c()) {
            return null;
        }
        ftm $$3 = $$1.d($$0);
        if ($$3.h() < 1.0E-7) {
            return null;
        }
        ftm $$4 = $$0.e($$3.c(0.001));
        if (this.a.e(this.a(iz.a.a, $$4.g - (double)$$2.u()), this.a(iz.a.b, $$4.h - (double)$$2.v()), this.a(iz.a.c, $$4.i - (double)$$2.w()))) {
            return new fti($$4, iz.a($$3.g, $$3.h, $$3.i).g(), $$2, true);
        }
        return fth.a(this.e(), $$0, $$1, $$2);
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    public Optional<ftm> b(ftm $$0) {
        if (this.c()) {
            return Optional.empty();
        }
        @Nullable MutableObject $$1 = new MutableObject();
        this.b((double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) -> {
            double $$8 = bgj.a($$0.a(), $$2, $$5);
            double $$9 = bgj.a($$0.b(), $$3, $$6);
            double $$10 = bgj.a($$0.c(), $$4, $$7);
            ftm $$11 = (ftm)$$1.get();
            if ($$11 == null || $$0.c($$8, $$9, $$10) < $$0.g($$11)) {
                $$1.setValue((Object)new ftm($$8, $$9, $$10));
            }
        });
        return Optional.of(Objects.requireNonNull((ftm)$$1.get()));
    }

    public fug a(iz $$0) {
        fug $$2;
        if (this.c() || this == fud.b()) {
            return this;
        }
        if (this.b != null) {
            fug $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
                return $$1;
            }
        } else {
            this.b = new fug[6];
        }
        this.b[$$0.ordinal()] = $$2 = this.b($$0);
        return $$2;
    }

    private fug b(iz $$0) {
        iz.a $$1 = $$0.o();
        if (this.d($$1)) {
            return this;
        }
        iz.b $$2 = $$0.f();
        int $$3 = this.a($$1, $$2 == iz.b.a ? 0.9999999 : 1.0E-7);
        fue $$4 = new fue(this, $$1, $$3);
        if ($$4.c()) {
            return fud.a();
        }
        if ($$4.f()) {
            return fud.b();
        }
        return $$4;
    }

    protected boolean f() {
        for (iz.a $$0 : iz.a.d) {
            if (this.d($$0)) continue;
            return false;
        }
        return true;
    }

    private boolean d(iz.a $$0) {
        DoubleList $$1 = this.a($$0);
        return $$1.size() == 2 && DoubleMath.fuzzyEquals((double)$$1.getDouble(0), (double)0.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)$$1.getDouble(1), (double)1.0, (double)1.0E-7);
    }

    public double a(iz.a $$0, fth $$1, double $$2) {
        return this.a(ip.a($$0, iz.a.a), $$1, $$2);
    }

    protected double a(ip $$0, fth $$1, double $$2) {
        block11: {
            int $$14;
            int $$12;
            double $$8;
            iz.a $$4;
            ip $$3;
            block10: {
                if (this.c()) {
                    return $$2;
                }
                if (Math.abs($$2) < 1.0E-7) {
                    return 0.0;
                }
                $$3 = $$0.a();
                $$4 = $$3.a(iz.a.a);
                iz.a $$5 = $$3.a(iz.a.b);
                iz.a $$6 = $$3.a(iz.a.c);
                double $$7 = $$1.b($$4);
                $$8 = $$1.a($$4);
                int $$9 = this.a($$4, $$8 + 1.0E-7);
                int $$10 = this.a($$4, $$7 - 1.0E-7);
                int $$11 = Math.max(0, this.a($$5, $$1.a($$5) + 1.0E-7));
                $$12 = Math.min(this.a.c($$5), this.a($$5, $$1.b($$5) - 1.0E-7) + 1);
                int $$13 = Math.max(0, this.a($$6, $$1.a($$6) + 1.0E-7));
                $$14 = Math.min(this.a.c($$6), this.a($$6, $$1.b($$6) - 1.0E-7) + 1);
                int $$15 = this.a.c($$4);
                if (!($$2 > 0.0)) break block10;
                for (int $$16 = $$10 + 1; $$16 < $$15; ++$$16) {
                    for (int $$17 = $$11; $$17 < $$12; ++$$17) {
                        for (int $$18 = $$13; $$18 < $$14; ++$$18) {
                            if (!this.a.a($$3, $$16, $$17, $$18)) continue;
                            double $$19 = this.a($$4, $$16) - $$7;
                            if ($$19 >= -1.0E-7) {
                                $$2 = Math.min($$2, $$19);
                            }
                            return $$2;
                        }
                    }
                }
                break block11;
            }
            if (!($$2 < 0.0)) break block11;
            for (int $$20 = $$9 - 1; $$20 >= 0; --$$20) {
                for (int $$21 = $$11; $$21 < $$12; ++$$21) {
                    for (int $$22 = $$13; $$22 < $$14; ++$$22) {
                        if (!this.a.a($$3, $$20, $$21, $$22)) continue;
                        double $$23 = this.a($$4, $$20 + 1) - $$8;
                        if ($$23 <= 1.0E-7) {
                            $$2 = Math.max($$2, $$23);
                        }
                        return $$2;
                    }
                }
            }
        }
        return $$2;
    }

    public boolean equals(Object $$0) {
        return super.equals($$0);
    }

    public String toString() {
        return this.c() ? "EMPTY" : "VoxelShape[" + String.valueOf(this.a()) + "]";
    }
}

