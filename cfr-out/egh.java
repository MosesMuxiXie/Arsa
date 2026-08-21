/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class egh
extends dzq {
    public static final MapCodec<egh> a = egh.b(egh::new);
    public static final int b = 0;
    public static final int c = 4;
    public static final eph d = eox.bd;
    private static final ImmutableList<jy> e = ImmutableList.of((Object)new jy(0, 0, -1), (Object)new jy(-1, 0, 0), (Object)new jy(0, 0, 1), (Object)new jy(1, 0, 0), (Object)new jy(-1, 0, -1), (Object)new jy(1, 0, -1), (Object)new jy(-1, 0, 1), (Object)new jy(1, 0, 1));
    private static final ImmutableList<jy> f = new ImmutableList.Builder().addAll(e).addAll(e.stream().map(jy::p).iterator()).addAll(e.stream().map(jy::q).iterator()).add((Object)new jy(0, 1, 0)).build();

    public MapCodec<egh> a() {
        return a;
    }

    public egh(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(d, 0));
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if (egh.a($$0) && egh.p($$1)) {
            egh.a($$4, $$2, $$3, $$1);
            $$0.a(1, (chl)$$4);
            return cdc.a;
        }
        if ($$5 == cdb.a && egh.a($$4.b(cdb.b)) && egh.p($$1)) {
            return cdc.e;
        }
        return cdc.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        void $$6;
        if ($$0.c(d) == 0) {
            return cdc.e;
        }
        if (!($$1 instanceof axf)) {
            return cdc.c;
        }
        axf $$5 = (axf)$$1;
        if (egh.a((axf)$$6, $$2)) {
            if ($$3 instanceof axg) {
                axg $$7 = (axg)$$3;
                axg.a $$8 = $$7.V();
                axg.a $$9 = new axg.a(fne.a.a($$6.aq(), $$2, 0.0f, 0.0f), false);
                if ($$8 == null || !$$8.a($$9)) {
                    $$7.a($$9, true);
                    $$6.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, bda.yt, bdb.e, 1.0f, 1.0f);
                    return cdc.b;
                }
            }
            return cdc.c;
        }
        this.a($$0, (axf)$$6, $$2);
        return cdc.b;
    }

    private static boolean a(dlt $$0) {
        return $$0.a(dlx.gd);
    }

    private static boolean p(eoh $$0) {
        return $$0.c(d) < 4;
    }

    private static boolean a(is $$0, dwo $$1) {
        flb $$2 = $$1.b_($$0);
        if (!$$2.a(bdv.a)) {
            return false;
        }
        if ($$2.b()) {
            return true;
        }
        float $$3 = $$2.e();
        if ($$3 < 2.0f) {
            return false;
        }
        flb $$4 = $$1.b_($$0.e());
        return !$$4.a(bdv.a);
    }

    private void a(eoh $$0, axf $$12, final is $$2) {
        $$12.a($$2, false);
        boolean $$3 = iz.c.a.a().map($$2::a).anyMatch($$1 -> egh.a($$1, $$12));
        final boolean $$4 = $$3 || $$12.b_($$2.d()).a(bdv.a);
        dwj $$5 = new dwj(this){

            @Override
            public Optional<Float> a(dwi $$0, dvt $$1, is $$22, eoh $$3, flb $$42) {
                if ($$22.equals($$2) && $$4) {
                    return Optional.of(Float.valueOf(dzs.J.e()));
                }
                return super.a($$0, $$1, $$22, $$3, $$42);
            }
        };
        ftm $$6 = $$2.b();
        $$12.a(null, $$12.as().a($$6), $$5, $$6, 5.0f, true, dwo.a.b);
    }

    public static boolean a(axf $$0, is $$1) {
        return $$0.c().a(ceg.D, $$1);
    }

    public static void a(@Nullable cgk $$0, dwo $$1, is $$2, eoh $$3) {
        eoh $$4 = (eoh)$$3.b(d, $$3.c(d) + 1);
        $$1.a($$2, $$4, 3);
        $$1.a(etk.c, $$2, etk.a.a($$0, $$4));
        $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, bda.yr, bdb.e, 1.0f, 1.0f);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$0.c(d) == 0) {
            return;
        }
        if ($$3.a(100) == 0) {
            $$1.a($$2, bda.yq, bdb.e, 1.0f, 1.0f, false);
        }
        double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
        double $$5 = (double)$$2.v() + 1.0;
        double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
        double $$7 = (double)$$3.i() * 0.04;
        $$1.a(ly.aL, $$4, $$5, $$6, 0.0, $$7, 0.0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{d});
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    public static int a(eoh $$0, int $$1) {
        return bgj.b((float)($$0.c(d) - 0) / 4.0f * (float)$$1);
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return egh.a($$0, 15);
    }

    public static Optional<ftm> a(cgu<?> $$0, dvx $$1, is $$2) {
        Optional<ftm> $$3 = egh.a($$0, $$1, $$2, true);
        if ($$3.isPresent()) {
            return $$3;
        }
        return egh.a($$0, $$1, $$2, false);
    }

    private static Optional<ftm> a(cgu<?> $$0, dvx $$1, is $$2, boolean $$3) {
        is.a $$4 = new is.a();
        for (jy $$5 : f) {
            $$4.g($$2).h($$5);
            ftm $$6 = dfz.a($$0, $$1, $$4, $$3);
            if ($$6 == null) continue;
            return Optional.of($$6);
        }
        return Optional.empty();
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

