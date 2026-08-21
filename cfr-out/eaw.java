/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class eaw
extends dzq {
    public static final MapCodec<eaw> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.e.q().fieldOf("plant").forGetter($$0 -> $$0.e), eaw.x()).apply((Applicative)$$02, eaw::new));
    public static final int b = 5;
    public static final eph c = eox.ay;
    private static final fug d = dzq.b(14.0, 0.0, 15.0);
    private final dzq e;

    public MapCodec<eaw> a() {
        return a;
    }

    protected eaw(dzq $$0, eog.d $$1) {
        super($$1);
        this.e = $$0;
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(c) < 5;
    }

    @Override
    public fug b_(eoh $$0, dvt $$1, is $$2) {
        return d;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        is $$4 = $$2.d();
        if (!$$1.A($$4) || $$4.v() > $$1.aw()) {
            return;
        }
        int $$5 = $$0.c(c);
        if ($$5 >= 5) {
            return;
        }
        boolean $$6 = false;
        boolean $$7 = false;
        eoh $$8 = $$1.a_($$2.e());
        if ($$8.a(dzs.go)) {
            $$6 = true;
        } else if ($$8.a(this.e)) {
            int $$9 = 1;
            for (int $$10 = 0; $$10 < 4; ++$$10) {
                eoh $$11 = $$1.a_($$2.c($$9 + 1));
                if ($$11.a(this.e)) {
                    ++$$9;
                    continue;
                }
                if (!$$11.a(dzs.go)) break;
                $$7 = true;
                break;
            }
            if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                $$6 = true;
            }
        } else if ($$8.l()) {
            $$6 = true;
        }
        if ($$6 && eaw.b($$1, $$4, null) && $$1.A($$2.b(2))) {
            $$1.a($$2, eax.a((dvt)$$1, $$2, this.e.m()), 2);
            this.a((dwo)$$1, $$4, $$5);
        } else if ($$5 < 4) {
            int $$12 = $$3.a(4);
            if ($$7) {
                ++$$12;
            }
            boolean $$13 = false;
            for (int $$14 = 0; $$14 < $$12; ++$$14) {
                iz $$15 = iz.c.a.a($$3);
                is $$16 = $$2.a($$15);
                if (!$$1.A($$16) || !$$1.A($$16.e()) || !eaw.b($$1, $$16, $$15.g())) continue;
                this.a((dwo)$$1, $$16, $$5 + 1);
                $$13 = true;
            }
            if ($$13) {
                $$1.a($$2, eax.a((dvt)$$1, $$2, this.e.m()), 2);
            } else {
                this.a($$1, $$2);
            }
        } else {
            this.a($$1, $$2);
        }
    }

    private void a(dwo $$0, is $$1, int $$2) {
        $$0.a($$1, (eoh)this.m().b(c, $$2), 2);
        $$0.c(1033, $$1, 0);
    }

    private void a(dwo $$0, is $$1) {
        $$0.a($$1, (eoh)this.m().b(c, 5), 2);
        $$0.c(1034, $$1, 0);
    }

    private static boolean b(dwr $$0, is $$1, @Nullable iz $$2) {
        for (iz $$3 : iz.c.a) {
            if ($$3 == $$2 || $$0.A($$1.a($$3))) continue;
            return false;
        }
        return true;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 != iz.b && !$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.e());
        if ($$3.a(this.e) || $$3.a(dzs.go)) {
            return true;
        }
        if (!$$3.l()) {
            return false;
        }
        boolean $$4 = false;
        for (iz $$5 : iz.c.a) {
            eoh $$6 = $$1.a_($$2.a($$5));
            if ($$6.a(this.e)) {
                if ($$4) {
                    return false;
                }
                $$4 = true;
                continue;
            }
            if ($$6.l()) continue;
            return false;
        }
        return $$4;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    public static void a(dwp $$0, is $$1, bgr $$2, int $$3) {
        $$0.a($$1, eax.a((dvt)$$0, $$1, dzs.lq.m()), 2);
        eaw.a($$0, $$1, $$2, $$1, $$3, 0);
    }

    private static void a(dwp $$0, is $$1, bgr $$2, is $$3, int $$4, int $$5) {
        dzq $$6 = dzs.lq;
        int $$7 = $$2.a(4) + 1;
        if ($$5 == 0) {
            ++$$7;
        }
        for (int $$8 = 0; $$8 < $$7; ++$$8) {
            is $$9 = $$1.b($$8 + 1);
            if (!eaw.b($$0, $$9, null)) {
                return;
            }
            $$0.a($$9, eax.a((dvt)$$0, $$9, $$6.m()), 2);
            $$0.a($$9.e(), eax.a((dvt)$$0, $$9.e(), $$6.m()), 2);
        }
        boolean $$10 = false;
        if ($$5 < 4) {
            int $$11 = $$2.a(4);
            if ($$5 == 0) {
                ++$$11;
            }
            for (int $$12 = 0; $$12 < $$11; ++$$12) {
                iz $$13 = iz.c.a.a($$2);
                is $$14 = $$1.b($$7).a($$13);
                if (Math.abs($$14.u() - $$3.u()) >= $$4 || Math.abs($$14.w() - $$3.w()) >= $$4 || !$$0.A($$14) || !$$0.A($$14.e()) || !eaw.b($$0, $$14, $$13.g())) continue;
                $$10 = true;
                $$0.a($$14, eax.a((dvt)$$0, $$14, $$6.m()), 2);
                $$0.a($$14.a($$13.g()), eax.a((dvt)$$0, $$14.a($$13.g()), $$6.m()), 2);
                eaw.a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
        }
        if (!$$10) {
            $$0.a($$1.b($$7), (eoh)dzs.lr.m().b(c, 5), 2);
        }
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        axf $$5;
        is $$4 = $$2.b();
        if ($$0 instanceof axf && $$3.c($$5 = (axf)$$0, $$4) && $$3.a($$5)) {
            $$0.a($$4, true, $$3);
        }
    }
}

