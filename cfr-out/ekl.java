/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ekl
extends ehh {
    public static final MapCodec<ekl> b = ekl.b(ekl::new);
    private static @Nullable eom f;
    private static @Nullable eom g;

    public MapCodec<ekl> a() {
        return b;
    }

    protected ekl(eog.d $$0) {
        super(ehh.b.d, $$0);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        ekl.a($$0, $$1);
    }

    public static void a(dwo $$0, is $$1) {
        elb elb2 = $$0.c_($$1);
        if (elb2 instanceof emu) {
            emu $$2 = (emu)elb2;
            ekl.a($$0, $$1, $$2);
        }
    }

    public static void a(dwo $$0, is $$1, emu $$2) {
        boolean $$4;
        if ($$0.B_()) {
            return;
        }
        eoh $$3 = $$2.o();
        boolean bl2 = $$4 = $$3.a(dzs.hx) || $$3.a(dzs.hy);
        if (!$$4 || $$1.v() < $$0.K_() || $$0.av() == ccz.a) {
            return;
        }
        eom.b $$5 = ekl.q().a($$0, $$1);
        if ($$5 == null) {
            return;
        }
        cyw $$6 = cgu.bR.a($$0, cgt.k);
        if ($$6 != null) {
            eam.a($$0, $$5);
            is $$7 = $$5.a(1, 2, 0).d();
            $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == iz.a.a ? 0.0f : 90.0f, 0.0f);
            $$6.bC = $$5.b().o() == iz.a.a ? 0.0f : 90.0f;
            $$6.k();
            for (axg $$8 : $$0.a(axg.class, $$6.dj().g(50.0))) {
                aj.o.a($$8, $$6);
            }
            $$0.b($$6);
            eam.b($$0, $$5);
        }
    }

    public static boolean b(dwo $$0, is $$1, dlt $$2) {
        if ($$2.a(dlx.wy) && $$1.v() >= $$0.K_() + 2 && $$0.av() != ccz.a && !$$0.B_()) {
            return ekl.r().a($$0, $$1) != null;
        }
        return false;
    }

    private static eom q() {
        if (f == null) {
            f = eon.a().a("^^^", "###", "~#~").a('#', (eol $$0) -> $$0.a().a(bdp.aT)).a('^', eol.a(eoq.a(dzs.hx).or(eoq.a(dzs.hy)))).a('~', (eol $$0) -> $$0.a().l()).b();
        }
        return f;
    }

    private static eom r() {
        if (g == null) {
            g = eon.a().a("   ", "###", "~#~").a('#', (eol $$0) -> $$0.a().a(bdp.aT)).a('~', (eol $$0) -> $$0.a().l()).b();
        }
        return g;
    }
}

