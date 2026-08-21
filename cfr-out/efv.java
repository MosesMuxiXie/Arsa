/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efv
extends dzf {
    public static final MapCodec<efv> b = efv.b(efv::new);
    public static final epf<epl> c = eox.al;
    public static final eoy d = eox.A;

    public MapCodec<efv> a() {
        return b;
    }

    protected efv(eog.d $$0) {
        super(true, $$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(c, epl.a)).b(d, false)).b(a, false));
    }

    protected boolean a(dwo $$0, is $$1, eoh $$2, boolean $$3, int $$4) {
        if ($$4 >= 8) {
            return false;
        }
        int $$5 = $$1.u();
        int $$6 = $$1.v();
        int $$7 = $$1.w();
        boolean $$8 = true;
        epl $$9 = $$2.c(c);
        switch ($$9) {
            case a: {
                if ($$3) {
                    ++$$7;
                    break;
                }
                --$$7;
                break;
            }
            case b: {
                if ($$3) {
                    --$$5;
                    break;
                }
                ++$$5;
                break;
            }
            case c: {
                if ($$3) {
                    --$$5;
                } else {
                    ++$$5;
                    ++$$6;
                    $$8 = false;
                }
                $$9 = epl.b;
                break;
            }
            case d: {
                if ($$3) {
                    --$$5;
                    ++$$6;
                    $$8 = false;
                } else {
                    ++$$5;
                }
                $$9 = epl.b;
                break;
            }
            case e: {
                if ($$3) {
                    ++$$7;
                } else {
                    --$$7;
                    ++$$6;
                    $$8 = false;
                }
                $$9 = epl.a;
                break;
            }
            case f: {
                if ($$3) {
                    ++$$7;
                    ++$$6;
                    $$8 = false;
                } else {
                    --$$7;
                }
                $$9 = epl.a;
            }
        }
        if (this.a($$0, new is($$5, $$6, $$7), $$3, $$4, $$9)) {
            return true;
        }
        return $$8 && this.a($$0, new is($$5, $$6 - 1, $$7), $$3, $$4, $$9);
    }

    protected boolean a(dwo $$0, is $$1, boolean $$2, int $$3, epl $$4) {
        eoh $$5 = $$0.a_($$1);
        if (!$$5.a(this)) {
            return false;
        }
        epl $$6 = $$5.c(c);
        if ($$4 == epl.b && ($$6 == epl.a || $$6 == epl.e || $$6 == epl.f)) {
            return false;
        }
        if ($$4 == epl.a && ($$6 == epl.b || $$6 == epl.c || $$6 == epl.d)) {
            return false;
        }
        if ($$5.c(d).booleanValue()) {
            if ($$0.I($$1)) {
                return true;
            }
            return this.a($$0, $$1, $$5, $$2, $$3 + 1);
        }
        return false;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3) {
        boolean $$5;
        boolean $$4 = $$0.c(d);
        boolean bl2 = $$5 = $$1.I($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
        if ($$5 != $$4) {
            $$1.a($$2, (eoh)$$0.b(d, $$5), 3);
            $$1.a($$2.e(), this);
            if ($$0.c(c).b()) {
                $$1.a($$2.d(), this);
            }
        }
    }

    @Override
    public epk<epl> c() {
        return c;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        epl $$2 = $$0.c(c);
        epl $$3 = this.a($$2, $$1);
        return (eoh)$$0.b(c, $$3);
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        epl $$2 = $$0.c(c);
        epl $$3 = this.a($$2, $$1);
        return (eoh)$$0.b(c, $$3);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d, a);
    }
}

