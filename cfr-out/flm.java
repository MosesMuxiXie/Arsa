/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class flm
extends flx {
    private final Long2ObjectMap<fls> a = new Long2ObjectOpenHashMap();
    private static final float m = 1.0f;
    private static final float n = 1.1f;
    private static final int o = 10;

    @Override
    public void a(dxb $$0, chn $$1) {
        super.a($$0, $$1);
        this.a.clear();
        $$1.G();
    }

    @Override
    public void b() {
        this.c.H();
        this.a.clear();
        super.b();
    }

    @Override
    public fln a() {
        is $$4;
        int $$3;
        if (this.f() && this.c.by()) {
            int $$0 = this.c.dQ();
            is.a $$1 = new is.a(this.c.dP(), (double)$$0, this.c.dV());
            eoh $$2 = this.b.a($$1);
            while ($$2.a(dzs.J)) {
                $$1.b(this.c.dP(), (double)(++$$0), this.c.dV());
                $$2 = this.b.a($$1);
            }
        } else {
            $$3 = bgj.c(this.c.dR() + 0.5);
        }
        if (!this.a($$4 = is.a(this.c.dP(), (double)$$3, this.c.dV()))) {
            for (is $$5 : this.a(this.c)) {
                if (!this.a($$5)) continue;
                return super.c($$5);
            }
        }
        return super.c($$4);
    }

    @Override
    protected boolean a(is $$0) {
        fls $$1 = this.b($$0.u(), $$0.v(), $$0.w());
        return this.c.a($$1) >= 0.0f;
    }

    @Override
    public flw a(double $$0, double $$1, double $$2) {
        return this.b($$0, $$1, $$2);
    }

    @Override
    public int a(fln[] $$0, fln $$1) {
        fln $$28;
        fln $$27;
        fln $$26;
        fln $$25;
        fln $$24;
        fln $$23;
        fln $$22;
        fln $$21;
        fln $$20;
        fln $$19;
        fln $$18;
        fln $$17;
        fln $$16;
        fln $$15;
        fln $$14;
        fln $$13;
        fln $$12;
        fln $$11;
        fln $$10;
        fln $$9;
        fln $$8;
        fln $$7;
        fln $$6;
        fln $$5;
        fln $$4;
        int $$2 = 0;
        fln $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
        if (this.c($$3)) {
            $$0[$$2++] = $$3;
        }
        if (this.c($$4 = this.a($$1.a - 1, $$1.b, $$1.c))) {
            $$0[$$2++] = $$4;
        }
        if (this.c($$5 = this.a($$1.a + 1, $$1.b, $$1.c))) {
            $$0[$$2++] = $$5;
        }
        if (this.c($$6 = this.a($$1.a, $$1.b, $$1.c - 1))) {
            $$0[$$2++] = $$6;
        }
        if (this.c($$7 = this.a($$1.a, $$1.b + 1, $$1.c))) {
            $$0[$$2++] = $$7;
        }
        if (this.c($$8 = this.a($$1.a, $$1.b - 1, $$1.c))) {
            $$0[$$2++] = $$8;
        }
        if (this.c($$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1)) && this.b($$3) && this.b($$7)) {
            $$0[$$2++] = $$9;
        }
        if (this.c($$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c)) && this.b($$4) && this.b($$7)) {
            $$0[$$2++] = $$10;
        }
        if (this.c($$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c)) && this.b($$5) && this.b($$7)) {
            $$0[$$2++] = $$11;
        }
        if (this.c($$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1)) && this.b($$6) && this.b($$7)) {
            $$0[$$2++] = $$12;
        }
        if (this.c($$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1)) && this.b($$3) && this.b($$8)) {
            $$0[$$2++] = $$13;
        }
        if (this.c($$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c)) && this.b($$4) && this.b($$8)) {
            $$0[$$2++] = $$14;
        }
        if (this.c($$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c)) && this.b($$5) && this.b($$8)) {
            $$0[$$2++] = $$15;
        }
        if (this.c($$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1)) && this.b($$6) && this.b($$8)) {
            $$0[$$2++] = $$16;
        }
        if (this.c($$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1)) && this.b($$6) && this.b($$5)) {
            $$0[$$2++] = $$17;
        }
        if (this.c($$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1)) && this.b($$3) && this.b($$5)) {
            $$0[$$2++] = $$18;
        }
        if (this.c($$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1)) && this.b($$6) && this.b($$4)) {
            $$0[$$2++] = $$19;
        }
        if (this.c($$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1)) && this.b($$3) && this.b($$4)) {
            $$0[$$2++] = $$20;
        }
        if (this.c($$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1)) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
            $$0[$$2++] = $$21;
        }
        if (this.c($$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1)) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
            $$0[$$2++] = $$22;
        }
        if (this.c($$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1)) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
            $$0[$$2++] = $$23;
        }
        if (this.c($$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1)) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
            $$0[$$2++] = $$24;
        }
        if (this.c($$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1)) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
            $$0[$$2++] = $$25;
        }
        if (this.c($$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1)) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
            $$0[$$2++] = $$26;
        }
        if (this.c($$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1)) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
            $$0[$$2++] = $$27;
        }
        if (this.c($$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1)) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
            $$0[$$2++] = $$28;
        }
        return $$2;
    }

    private boolean b(@Nullable fln $$0) {
        return $$0 != null && $$0.k >= 0.0f;
    }

    private boolean c(@Nullable fln $$0) {
        return $$0 != null && !$$0.i;
    }

    protected @Nullable fln a(int $$0, int $$1, int $$2) {
        fln $$3 = null;
        fls $$4 = this.b($$0, $$1, $$2);
        float $$5 = this.c.a($$4);
        if ($$5 >= 0.0f) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if ($$4 == fls.c) {
                $$3.k += 1.0f;
            }
        }
        return $$3;
    }

    @Override
    protected fls b(int $$0, int $$1, int $$2) {
        return (fls)((Object)this.a.computeIfAbsent(is.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c)));
    }

    @Override
    public fls a(flu $$0, int $$1, int $$2, int $$3) {
        fls $$4 = $$0.a($$1, $$2, $$3);
        if ($$4 == fls.b && $$2 >= $$0.a().K_() + 1) {
            is $$5 = new is($$1, $$2 - 1, $$3);
            fls $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$6 == fls.o || $$6 == fls.i) {
                $$4 = fls.o;
            } else if ($$6 == fls.q) {
                $$4 = fls.q;
            } else if ($$6 == fls.x) {
                $$4 = fls.x;
            } else if ($$6 == fls.h) {
                if (!$$5.equals($$0.b())) {
                    $$4 = fls.h;
                }
            } else {
                fls fls2 = $$4 = $$6 == fls.c || $$6 == fls.b || $$6 == fls.j ? fls.b : fls.c;
            }
        }
        if ($$4 == fls.c || $$4 == fls.b) {
            $$4 = flm.a($$0, $$1, $$2, $$3, $$4);
        }
        return $$4;
    }

    private Iterable<is> a(chn $$0) {
        boolean $$2;
        fth $$1 = $$0.dj();
        boolean bl2 = $$2 = $$1.a() < 1.0;
        if (!$$2) {
            return List.of(is.a($$1.a, (double)$$0.dQ(), $$1.c), is.a($$1.a, (double)$$0.dQ(), $$1.f), is.a($$1.d, (double)$$0.dQ(), $$1.c), is.a($$1.d, (double)$$0.dQ(), $$1.f));
        }
        double $$3 = Math.max(0.0, (double)1.1f - $$1.d());
        double $$4 = Math.max(0.0, (double)1.1f - $$1.b());
        double $$5 = Math.max(0.0, (double)1.1f - $$1.c());
        fth $$6 = $$1.c($$4, $$5, $$3);
        return is.a($$0.ep(), 10, bgj.c($$6.a), bgj.c($$6.b), bgj.c($$6.c), bgj.c($$6.d), bgj.c($$6.e), bgj.c($$6.f));
    }
}

