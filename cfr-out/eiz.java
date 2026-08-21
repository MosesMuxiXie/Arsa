/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class eiz
extends dzq {
    public static final MapCodec<eiz> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.e.q().fieldOf("hook").forGetter($$0 -> $$0.T), eiz.x()).apply((Applicative)$$02, eiz::new));
    public static final eoy b = eox.A;
    public static final eoy c = eox.a;
    public static final eoy d = eox.g;
    public static final eoy e = efm.b;
    public static final eoy f = efm.c;
    public static final eoy g = efm.d;
    public static final eoy h = efm.e;
    private static final Map<iz, eoy> i = ebq.f;
    private static final fug D = dzq.b(16.0, 1.0, 2.5);
    private static final fug R = dzq.b(16.0, 0.0, 8.0);
    private static final int S = 10;
    private final dzq T;

    public MapCodec<eiz> a() {
        return a;
    }

    public eiz(dzq $$0, eog.d $$1) {
        super($$1);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(c, false)).b(d, false)).b(e, false)).b(f, false)).b(g, false)).b(h, false));
        this.T = $$0;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(c) != false ? D : R;
    }

    @Override
    public eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        return (eoh)((eoh)((eoh)((eoh)this.m().b(e, this.a($$1.a_($$2.f()), iz.c))).b(f, this.a($$1.a_($$2.i()), iz.f))).b(g, this.a($$1.a_($$2.g()), iz.d))).b(h, this.a($$1.a_($$2.h()), iz.e));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.o().d()) {
            return (eoh)$$0.b(i.get($$4), this.a($$6, $$4));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$1, $$2, $$0);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3) {
            this.a((dwo)$$1, $$2, (eoh)$$0.b(b, true));
        }
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        if (!$$0.B_() && !$$3.fx().f() && $$3.fx().a(dlx.tZ)) {
            $$0.a($$1, (eoh)$$2.b(d, true), 260);
            $$0.a((cgk)$$3, etk.M, $$1);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    private void a(dwo $$0, is $$1, eoh $$2) {
        block0: for (iz $$3 : new iz[]{iz.d, iz.e}) {
            for (int $$4 = 1; $$4 < 42; ++$$4) {
                is $$5 = $$1.a($$3, $$4);
                eoh $$6 = $$0.a_($$5);
                if ($$6.a(this.T)) {
                    if ($$6.c(eja.b) != $$3.g()) continue block0;
                    eja.a($$0, $$5, $$6, false, true, $$4, $$2);
                    continue block0;
                }
                if (!$$6.a(this)) continue block0;
            }
        }
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, cgk $$3) {
        return $$0.f($$1, $$2);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        if ($$0.c(b).booleanValue()) {
            return;
        }
        this.a($$1, $$2, List.of($$3));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$1.a_($$2).c(b).booleanValue()) {
            return;
        }
        this.a($$1, $$2);
    }

    private void a(dwo $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        List<cgk> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
        this.a($$0, $$1, $$3);
    }

    private void a(dwo $$0, is $$1, List<? extends cgk> $$2) {
        eoh $$3 = $$0.a_($$1);
        boolean $$4 = $$3.c(b);
        boolean $$5 = false;
        if (!$$2.isEmpty()) {
            for (cgk cgk2 : $$2) {
                if (cgk2.m_()) continue;
                $$5 = true;
                break;
            }
        }
        if ($$5 != $$4) {
            $$3 = (eoh)$$3.b(b, $$5);
            $$0.a($$1, $$3, 3);
            this.a($$0, $$1, $$3);
        }
        if ($$5) {
            $$0.a(new is($$1), (dzq)this, 10);
        }
    }

    public boolean a(eoh $$0, iz $$1) {
        if ($$0.a(this.T)) {
            return $$0.c(eja.b) == $$1.g();
        }
        return $$0.a(this);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        switch ($$1) {
            case c: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(e, $$0.c(g))).b(f, $$0.c(h))).b(g, $$0.c(e))).b(h, $$0.c(f));
            }
            case d: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(e, $$0.c(f))).b(f, $$0.c(g))).b(g, $$0.c(h))).b(h, $$0.c(e));
            }
            case b: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(e, $$0.c(h))).b(f, $$0.c(e))).b(g, $$0.c(f))).b(h, $$0.c(g));
            }
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        switch ($$1) {
            case b: {
                return (eoh)((eoh)$$0.b(e, $$0.c(g))).b(g, $$0.c(e));
            }
            case c: {
                return (eoh)((eoh)$$0.b(f, $$0.c(h))).b(h, $$0.c(f));
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e, f, h, g);
    }
}

