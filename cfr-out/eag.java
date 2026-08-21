/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class eag
extends dzc
implements ehg {
    public static final MapCodec<eag> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("spawn_particles").forGetter($$0 -> $$0.i), (App)Codec.intRange((int)0, (int)1000).fieldOf("fire_damage").forGetter($$0 -> $$0.D), eag.x()).apply((Applicative)$$02, eag::new));
    public static final eoy b = eox.u;
    public static final eoy c = eox.D;
    public static final eoy d = eox.I;
    public static final epf<iz> e = eox.T;
    private static final fug f = dzq.b(16.0, 0.0, 7.0);
    private static final fug g = dzq.b(4.0, 0.0, 16.0);
    private static final int h = 5;
    private final boolean i;
    private final int D;

    public MapCodec<eag> a() {
        return a;
    }

    public eag(boolean $$0, int $$1, eog.d $$2) {
        super($$2);
        this.i = $$0;
        this.D = $$1;
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, true)).b(c, false)).b(d, false)).b(e, iz.c));
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        elb $$7 = $$2.c_($$3);
        if ($$7 instanceof eli) {
            eli $$8 = (eli)$$7;
            dlt $$9 = $$4.b($$5);
            if ($$2.aa().a(drb.h).a($$9)) {
                axf $$10;
                if ($$2 instanceof axf && $$8.a($$10 = (axf)$$2, $$4, $$9)) {
                    $$4.a(bdk.ax);
                    return cdc.b;
                }
                return cdc.c;
            }
        }
        return cdc.f;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$0.c(b).booleanValue() && $$3 instanceof chl) {
            $$3.a($$1.as().b(), (float)this.D);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        is $$2;
        dwo $$1 = $$0.q();
        boolean $$3 = $$1.b_($$2 = $$0.a()).a() == flc.c;
        return (eoh)((eoh)((eoh)((eoh)this.m().b(d, $$3)).b(c, this.p($$1.a_($$2.e())))).b(b, !$$3)).b(e, $$0.g());
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 == iz.a) {
            return (eoh)$$0.b(c, this.p($$6));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private boolean p(eoh $$0) {
        return $$0.a(dzs.jb);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, bda.ej, bdb.e, 0.5f + $$3.i(), $$3.i() * 0.7f + 0.6f, false);
        }
        if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; ++$$4) {
                $$1.a(ly.ac, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0f), 5.0E-5, $$3.i() / 2.0f);
            }
        }
    }

    public static void a(@Nullable cgk $$0, dwp $$1, is $$2, eoh $$3) {
        if ($$1.B_()) {
            for (int $$4 = 0; $$4 < 20; ++$$4) {
                eag.a((dwo)$$1, $$2, $$3.c(c), true);
            }
        }
        $$1.a($$0, etk.c, $$2);
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        if (!$$2.c(eox.I).booleanValue() && $$3.a() == flc.c) {
            boolean $$4 = $$2.c(b);
            if ($$4) {
                if (!$$0.B_()) {
                    $$0.a(null, $$1, bda.lT, bdb.e, 1.0f, 1.0f);
                }
                eag.a(null, $$0, $$1, $$2);
            }
            $$0.a($$1, (eoh)((eoh)$$2.b(d, true)).b(b, false), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
            return true;
        }
        return false;
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        is $$4 = $$2.b();
        if ($$0 instanceof axf) {
            axf $$5 = (axf)$$0;
            if ($$3.cp() && $$3.c($$5, $$4) && !$$1.c(b).booleanValue() && !$$1.c(d).booleanValue()) {
                $$0.a($$4, (eoh)$$1.b(eox.u, true), 11);
            }
        }
    }

    public static void a(dwo $$0, is $$1, boolean $$2, boolean $$3) {
        bgr $$4 = $$0.G_();
        md $$5 = $$2 ? ly.ay : ly.ax;
        $$0.a($$5, true, (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1), (double)$$1.v() + $$4.j() + $$4.j(), (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1), 0.0, 0.07, 0.0);
        if ($$3) {
            $$0.a(ly.ai, (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1), (double)$$1.v() + 0.4, (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }

    public static boolean a(dwo $$0, is $$1) {
        for (int $$2 = 1; $$2 <= 5; ++$$2) {
            is $$3 = $$1.c($$2);
            eoh $$4 = $$0.a_($$3);
            if (eag.h($$4)) {
                return true;
            }
            boolean $$5 = fud.c(g, $$4.b((dvt)$$0, $$1, ftr.a()), ftq.i);
            if (!$$5) continue;
            eoh $$6 = $$0.a_($$3.e());
            return eag.h($$6);
        }
        return false;
    }

    public static boolean h(eoh $$0) {
        return $$0.b(b) && $$0.a(bdp.bh) && $$0.c(b) != false;
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(e, $$1.a($$0.c(e)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(e)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new eli($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$22) {
        if ($$0 instanceof axf) {
            axf $$32 = (axf)$$0;
            if ($$1.c(b).booleanValue()) {
                dqz.a $$42 = dqz.a(drd.e);
                return eag.a($$22, eld.H, (dwo $$2, is $$3, eoh $$4, ? super E $$5) -> eli.a($$32, $$3, $$4, $$5, $$42));
            }
            return eag.a($$22, eld.H, eli::a);
        }
        if ($$1.c(b).booleanValue()) {
            return eag.a($$22, eld.H, eli::b);
        }
        return null;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    public static boolean i(eoh $$02) {
        return $$02.a(bdp.bh, (eog.a $$0) -> $$0.b(d) && $$0.b(b)) && $$02.c(d) == false && $$02.c(b) == false;
    }
}

