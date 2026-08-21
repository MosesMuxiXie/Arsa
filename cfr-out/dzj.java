/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;

public class dzj
extends edt
implements ecn {
    public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(dzj::b), dzj.x()).apply((Applicative)$$0, dzj::new));
    public static final epf<eou> b = eox.bg;
    public static final eoy c = eox.x;
    private static final Map<iz, fug> d = bhs.a(() -> {
        fug $$0 = dzq.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
        fug $$1 = fud.a($$0, f.ab);
        return fud.c(fud.a(dzq.b(16.0, 3.0, 9.0), $$0, $$1));
    });
    private final dkr e;

    public MapCodec<dzj> a() {
        return a;
    }

    public dzj(dkr $$0, eog.d $$1) {
        super($$1);
        this.e = $$0;
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, eou.b)).b(c, false));
    }

    public static @Nullable iz a(dvt $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        return $$2.b() instanceof dzj ? (iz)$$2.c(f) : null;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$12, is $$2, ddm $$3, fti $$4) {
        if ($$12.B_()) {
            return cdc.b;
        }
        if ($$0.c(b) != eou.a && !($$0 = $$12.a_($$2 = $$2.a((iz)$$0.c(f)))).a(this)) {
            return cdc.c;
        }
        cdz $$5 = $$12.c().a(ceg.C, $$2);
        if ($$5.d()) {
            $$5.e().ifPresent($$1 -> $$3.a((yh)$$1, true));
            $$12.a($$2, false);
            is $$6 = $$2.a(((iz)$$0.c(f)).g());
            if ($$12.a_($$6).a(this)) {
                $$12.a($$6, false);
            }
            ftm $$7 = $$2.b();
            $$12.a(null, $$12.as().a($$7), null, $$7, 5.0f, true, dwo.a.b);
            return cdc.b;
        }
        if ($$0.c(c).booleanValue()) {
            if (!this.a($$12, $$2)) {
                $$3.a(yh.c("block.minecraft.bed.occupied"), true);
            }
            return cdc.b;
        }
        $$3.a($$2).ifLeft($$1 -> {
            if ($$1.a() != null) {
                $$3.a($$1.a(), true);
            }
        });
        return cdc.b;
    }

    private boolean a(dwo $$0, is $$1) {
        List<dcx> $$2 = $$0.a(dcx.class, new fth($$1), chl::gr);
        if ($$2.isEmpty()) {
            return false;
        }
        $$2.get(0).gs();
        return true;
    }

    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
    }

    @Override
    public void a(dvt $$0, cgk $$1) {
        if ($$1.cw()) {
            super.a($$0, $$1);
        } else {
            this.a($$1);
        }
    }

    private void a(cgk $$0) {
        ftm $$1 = $$0.dN();
        if ($$1.h < 0.0) {
            double $$2 = $$0 instanceof chl ? 1.0 : 0.8;
            $$0.m($$1.g, -$$1.h * (double)0.66f * $$2, $$1.i);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == dzj.a($$0.c(b), (iz)$$0.c(f))) {
            if ($$6.a(this) && $$6.c(b) != $$0.c(b)) {
                return (eoh)$$0.b(c, $$6.c(c));
            }
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private static iz a(eou $$0, iz $$1) {
        return $$0 == eou.b ? $$1 : $$1.g();
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        is $$5;
        eoh $$6;
        eou $$4;
        if (!$$0.B_() && $$3.gM() && ($$4 = $$2.c(b)) == eou.b && ($$6 = $$0.a_($$5 = $$1.a(dzj.a($$4, (iz)$$2.c(f))))).a(this) && $$6.c(b) == eou.a) {
            $$0.a($$5, dzs.a.m(), 35);
            $$0.a((cgk)$$3, 2001, $$5, dzq.j($$6));
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz $$1 = $$0.g();
        is $$2 = $$0.a();
        is $$3 = $$2.a($$1);
        dwo $$4 = $$0.q();
        if ($$4.a_($$3).a($$0) && $$4.w().a($$3)) {
            return (eoh)this.m().b(f, $$1);
        }
        return null;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d.get(dzj.h($$0).g());
    }

    public static iz h(eoh $$0) {
        iz $$1 = (iz)$$0.c(f);
        return $$0.c(b) == eou.a ? $$1.g() : $$1;
    }

    public static eca.a i(eoh $$0) {
        eou $$1 = $$0.c(b);
        if ($$1 == eou.a) {
            return eca.a.b;
        }
        return eca.a.c;
    }

    private static boolean b(dvt $$0, is $$1) {
        return $$0.a_($$1.e()).b() instanceof dzj;
    }

    public static Optional<ftm> a(cgu<?> $$0, dvx $$1, is $$2, iz $$3, float $$4) {
        iz $$6;
        iz $$5 = $$3.h();
        iz iz2 = $$6 = $$5.a($$4) ? $$5.g() : $$5;
        if (dzj.b($$1, $$2)) {
            return dzj.a($$0, $$1, $$2, $$3, $$6);
        }
        int[][] $$7 = dzj.a($$3, $$6);
        Optional<ftm> $$8 = dzj.a($$0, $$1, $$2, $$7, true);
        if ($$8.isPresent()) {
            return $$8;
        }
        return dzj.a($$0, $$1, $$2, $$7, false);
    }

    private static Optional<ftm> a(cgu<?> $$0, dvx $$1, is $$2, iz $$3, iz $$4) {
        int[][] $$5 = dzj.b($$3, $$4);
        Optional<ftm> $$6 = dzj.a($$0, $$1, $$2, $$5, true);
        if ($$6.isPresent()) {
            return $$6;
        }
        is $$7 = $$2.e();
        Optional<ftm> $$8 = dzj.a($$0, $$1, $$7, $$5, true);
        if ($$8.isPresent()) {
            return $$8;
        }
        int[][] $$9 = dzj.a($$3);
        Optional<ftm> $$10 = dzj.a($$0, $$1, $$2, $$9, true);
        if ($$10.isPresent()) {
            return $$10;
        }
        Optional<ftm> $$11 = dzj.a($$0, $$1, $$2, $$5, false);
        if ($$11.isPresent()) {
            return $$11;
        }
        Optional<ftm> $$12 = dzj.a($$0, $$1, $$7, $$5, false);
        if ($$12.isPresent()) {
            return $$12;
        }
        return dzj.a($$0, $$1, $$2, $$9, false);
    }

    private static Optional<ftm> a(cgu<?> $$0, dvx $$1, is $$2, int[][] $$3, boolean $$4) {
        is.a $$5 = new is.a();
        for (int[] $$6 : $$3) {
            $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
            ftm $$7 = dfz.a($$0, $$1, $$5, $$4);
            if ($$7 == null) continue;
            return Optional.of($$7);
        }
        return Optional.empty();
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, b, c);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ekx($$0, $$1, this.e);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if (!$$0.B_()) {
            is $$5 = $$1.a((iz)$$2.c(f));
            $$0.a($$5, (eoh)$$2.b(b, eou.a), 3);
            $$0.a($$1, dzs.a);
            $$2.a((dwp)$$0, $$1, 3);
        }
    }

    public dkr b() {
        return this.e;
    }

    @Override
    protected long a(eoh $$0, is $$1) {
        is $$2 = $$1.a((iz)$$0.c(f), $$0.c(b) == eou.a ? 0 : 1);
        return bgj.b($$2.u(), $$1.v(), $$2.w());
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    private static int[][] a(iz $$0, iz $$1) {
        return (int[][])ArrayUtils.addAll((Object[])dzj.b($$0, $$1), (Object[])dzj.a($$0));
    }

    private static int[][] b(iz $$0, iz $$1) {
        return new int[][]{{$$1.j(), $$1.l()}, {$$1.j() - $$0.j(), $$1.l() - $$0.l()}, {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2}, {-$$0.j() * 2, -$$0.l() * 2}, {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2}, {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()}, {-$$1.j(), -$$1.l()}, {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()}, {$$0.j(), $$0.l()}, {$$1.j() + $$0.j(), $$1.l() + $$0.l()}};
    }

    private static int[][] a(iz $$0) {
        return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
    }
}

