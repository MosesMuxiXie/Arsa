/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class eja
extends dzq {
    public static final MapCodec<eja> a = eja.b(eja::new);
    public static final epf<iz> b = edt.f;
    public static final eoy c = eox.A;
    public static final eoy d = eox.a;
    protected static final int e = 1;
    protected static final int f = 42;
    private static final int g = 10;
    private static final Map<iz, fug> h = fud.c(dzq.a(6.0, 0.0, 10.0, 10.0, 16.0));

    public MapCodec<eja> a() {
        return a;
    }

    public eja(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false)).b(d, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return h.get($$0.c(b));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = $$0.c(b);
        is $$4 = $$2.a($$3.g());
        eoh $$5 = $$1.a_($$4);
        return $$3.o().d() && $$5.c((dvt)$$1, $$4, $$3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz[] $$4;
        eoh $$1 = (eoh)((eoh)this.m().b(c, false)).b(d, false);
        dwo $$2 = $$0.q();
        is $$3 = $$0.a();
        for (iz $$5 : $$4 = $$0.f()) {
            iz $$6;
            if (!$$5.o().d() || !($$1 = (eoh)$$1.b(b, $$6 = $$5.g())).a((dwr)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        eja.a($$0, $$1, $$2, false, false, -1, null);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, boolean $$3, boolean $$4, int $$5, @Nullable eoh $$6) {
        Optional<iz> $$7 = $$2.d(b);
        if (!$$7.isPresent()) {
            return;
        }
        iz $$8 = $$7.get();
        boolean $$9 = $$2.d(d).orElse(false);
        boolean $$10 = $$2.d(c).orElse(false);
        dzq $$11 = $$2.b();
        boolean $$12 = !$$3;
        boolean $$13 = false;
        int $$14 = 0;
        eoh[] $$15 = new eoh[42];
        for (int $$16 = 1; $$16 < 42; ++$$16) {
            is $$17 = $$1.a($$8, $$16);
            eoh $$18 = $$0.a_($$17);
            if ($$18.a(dzs.gw)) {
                if ($$18.c(b) != $$8.g()) break;
                $$14 = $$16;
                break;
            }
            if ($$18.a(dzs.gx) || $$16 == $$5) {
                if ($$16 == $$5) {
                    $$18 = (eoh)MoreObjects.firstNonNull((Object)$$6, (Object)$$18);
                }
                boolean $$19 = $$18.c(eiz.d) == false;
                boolean $$20 = $$18.c(eiz.b);
                $$13 |= $$19 && $$20;
                $$15[$$16] = $$18;
                if ($$16 != $$5) continue;
                $$0.a($$1, $$11, 10);
                $$12 &= $$19;
                continue;
            }
            $$15[$$16] = null;
            $$12 = false;
        }
        eoh $$21 = (eoh)((eoh)$$11.m().c(d, $$12)).c(c, $$13 &= ($$12 &= $$14 > 1));
        if ($$14 > 0) {
            is $$22 = $$1.a($$8, $$14);
            iz $$23 = $$8.g();
            $$0.a($$22, (eoh)$$21.b(b, $$23), 3);
            eja.a($$11, $$0, $$22, $$23);
            eja.a($$0, $$22, $$12, $$13, $$9, $$10);
        }
        eja.a($$0, $$1, $$12, $$13, $$9, $$10);
        if (!$$3) {
            $$0.a($$1, (eoh)$$21.b(b, $$8), 3);
            if ($$4) {
                eja.a($$11, $$0, $$1, $$8);
            }
        }
        if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; ++$$24) {
                eoh $$27;
                is $$25 = $$1.a($$8, $$24);
                eoh $$26 = $$15[$$24];
                if ($$26 == null || !($$27 = $$0.a_($$25)).a(dzs.gx) && !$$27.a(dzs.gw)) continue;
                $$0.a($$25, (eoh)$$26.c(d, $$12), 3);
            }
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        eja.a((dwo)$$1, $$2, $$0, false, true, -1, null);
    }

    private static void a(dwo $$0, is $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
        if ($$3 && !$$5) {
            $$0.a(null, $$1, bda.Dc, bdb.e, 0.4f, 0.6f);
            $$0.a(null, etk.a, $$1);
        } else if (!$$3 && $$5) {
            $$0.a(null, $$1, bda.Db, bdb.e, 0.4f, 0.5f);
            $$0.a(null, etk.e, $$1);
        } else if ($$2 && !$$4) {
            $$0.a(null, $$1, bda.Da, bdb.e, 0.4f, 0.7f);
            $$0.a(null, etk.b, $$1);
        } else if (!$$2 && $$4) {
            $$0.a(null, $$1, bda.Dd, bdb.e, 0.4f, 1.2f / ($$0.y.i() * 0.2f + 0.9f));
            $$0.a(null, etk.g, $$1);
        }
    }

    private static void a(dzq $$0, dwo $$1, is $$2, iz $$3) {
        iz $$4 = $$3.g();
        fmj $$5 = fmf.a($$1, $$4, iz.b);
        $$1.a($$2, $$0, $$5);
        $$1.a($$2.a($$4), $$0, $$5);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if ($$3) {
            return;
        }
        boolean $$4 = $$0.c(d);
        boolean $$5 = $$0.c(c);
        if ($$4 || $$5) {
            eja.a((dwo)$$1, $$2, $$0, true, false, -1, null);
        }
        if ($$5) {
            eja.a(this, (dwo)$$1, $$2, $$0.c(b));
        }
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(c) != false ? 15 : 0;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if (!$$0.c(c).booleanValue()) {
            return 0;
        }
        if ($$0.c(b) == $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }
}

