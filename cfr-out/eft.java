/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class eft
extends dzq
implements dzy {
    public static final MapCodec<eft> a = eft.b(eft::new);
    private static final float b = 0.083333336f;
    private static final float c = 0.9f;
    private static final float d = 1.5f;
    private static final float e = 2.5f;
    private static final fug f = fud.a(0.0, 0.0, 0.0, 1.0, 0.9f, 1.0);
    private static final double g = 4.0;
    private static final double h = 7.0;

    public MapCodec<eft> a() {
        return a;
    }

    public eft(eog.d $$0) {
        super($$0);
    }

    @Override
    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        if ($$1.a(this)) {
            return true;
        }
        return super.b($$0, $$1, $$2);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$22, cgk $$3, chc $$4, boolean $$5) {
        if (!($$3 instanceof chl) || $$3.dL().a(this)) {
            $$3.a($$0, new ftm(0.9f, 1.5, 0.9f));
            if ($$1.B_()) {
                boolean $$7;
                bgr $$6 = $$1.G_();
                boolean bl2 = $$7 = $$3.ao != $$3.dP() || $$3.aq != $$3.dV();
                if ($$7 && $$6.h()) {
                    $$1.a(ly.aO, $$3.dP(), (double)($$22.v() + 1), $$3.dV(), (double)(bgj.b($$6, -1.0f, 1.0f) * 0.083333336f), (double)0.05f, bgj.b($$6, -1.0f, 1.0f) * 0.083333336f);
                }
            }
        }
        is $$8 = $$22.j();
        $$4.a(chd.e, (cgk $$2) -> {
            if ($$1 instanceof axf) {
                axf $$3 = (axf)$$1;
                if ($$2.cp() && ($$3.U().a(eua.F).booleanValue() || $$2 instanceof ddm) && $$2.c($$3, $$8)) {
                    $$1.b($$8, false);
                }
            }
        });
        $$4.a(chd.a);
        $$4.a(chd.e);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        void $$6;
        if ($$4 < 4.0 || !($$3 instanceof chl)) {
            return;
        }
        chl $$5 = (chl)$$3;
        chl.a $$7 = $$6.fj();
        bcz $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
        $$3.a($$8, 1.0f, 1.0f);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, cgk $$3) {
        fug $$4 = this.b($$0, $$1, $$2, ftr.a($$3));
        return $$4.c() ? fud.b() : $$4;
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        ftw $$4;
        cgk $$5;
        if (!$$3.e() && $$3 instanceof ftw && ($$5 = ($$4 = (ftw)$$3).f()) != null) {
            if ($$5.an > 2.5) {
                return f;
            }
            boolean $$6 = $$5 instanceof czk;
            if ($$6 || eft.a($$5) && $$3.a(fud.b(), $$2, false) && !$$3.c()) {
                return super.b($$0, $$1, $$2, $$3);
            }
        }
        return fud.a();
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.a();
    }

    public static boolean a(cgk $$0) {
        if ($$0.ay().a(bdt.i)) {
            return true;
        }
        if ($$0 instanceof chl) {
            return ((chl)$$0).a(cgv.c).a(dlx.rh);
        }
        return false;
    }

    @Override
    public dlt a(@Nullable chl $$0, dwp $$1, is $$2, eoh $$3) {
        $$1.a($$2, dzs.a.m(), 11);
        if (!$$1.B_()) {
            $$1.c(2001, $$2, dzq.j($$3));
        }
        return new dlt(dlx.sn);
    }

    @Override
    public Optional<bcz> au_() {
        return Optional.of(bda.dz);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return true;
    }
}

