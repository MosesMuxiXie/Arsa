/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ecb
extends ejg {
    public static final MapCodec<ecb> a = ecb.b(ecb::new);
    public static final epf<epd> b = eox.ah;

    public MapCodec<? extends ecb> a() {
        return a;
    }

    public ecb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, epd.b));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        epd $$8 = $$0.c(b);
        if (!($$4.o() != iz.a.b || $$8 == epd.b != ($$4 == iz.b) || $$6.a(this) && $$6.c(b) != $$8)) {
            return dzs.a.m();
        }
        if ($$8 == epd.b && $$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        is $$1 = $$0.a();
        dwo $$2 = $$0.q();
        if ($$1.v() < $$2.aw() && $$2.a_($$1.d()).a($$0)) {
            return super.a($$0);
        }
        return null;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        is $$5 = $$1.d();
        $$0.a($$5, ecb.b($$0, $$5, (eoh)this.m().b(b, epd.a)), 3);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        if ($$0.c(b) == epd.a) {
            eoh $$3 = $$1.a_($$2.e());
            return $$3.a(this) && $$3.c(b) == epd.b;
        }
        return super.a($$0, $$1, $$2);
    }

    public static void a(dwp $$0, eoh $$1, is $$2, @dzq.b int $$3) {
        is $$4 = $$2.d();
        $$0.a($$2, ecb.b($$0, $$2, (eoh)$$1.b(b, epd.b)), $$3);
        $$0.a($$4, ecb.b($$0, $$4, (eoh)$$1.b(b, epd.a)), $$3);
    }

    public static eoh b(dwr $$0, is $$1, eoh $$2) {
        if ($$2.b(eox.I)) {
            return (eoh)$$2.b(eox.I, $$0.F($$1));
        }
        return $$2;
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        if (!$$0.B_()) {
            if ($$3.gM()) {
                ecb.b($$0, $$1, $$2, $$3);
            } else {
                ecb.a($$2, $$0, $$1, null, (cgk)$$3, $$3.fx());
            }
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(dwo $$0, ddm $$1, is $$2, eoh $$3, @Nullable elb $$4, dlt $$5) {
        super.a($$0, $$1, $$2, dzs.a.m(), $$4, $$5);
    }

    protected static void b(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        is $$5;
        eoh $$6;
        epd $$4 = $$2.c(b);
        if ($$4 == epd.a && ($$6 = $$0.a_($$5 = $$1.e())).a($$2.b()) && $$6.c(b) == epd.b) {
            eoh $$7 = $$6.y().b(flc.c) ? dzs.J.m() : dzs.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a((cgk)$$3, 2001, $$5, dzq.j($$6));
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected long a(eoh $$0, is $$1) {
        return bgj.b($$1.u(), $$1.c($$0.c(b) == epd.b ? 0 : 1).v(), $$1.w());
    }
}

