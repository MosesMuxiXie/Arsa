/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eee
extends dzq
implements ehg {
    public static final MapCodec<eee> a = eee.b(eee::new);
    public static final eoy b = eox.m;
    public static final eoy c = eox.I;
    private static final fug d = fud.a(dzq.b(4.0, 7.0, 9.0), dzq.b(6.0, 0.0, 7.0));
    private static final fug e = d.a(0.0, 0.0625, 0.0).d();

    public MapCodec<? extends eee> a() {
        return a;
    }

    public eee(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(c, false));
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        for (iz $$2 : $$0.f()) {
            eoh $$3;
            if ($$2.o() != iz.a.b || !($$3 = (eoh)this.m().b(b, $$2 == iz.b)).a((dwr)$$0.q(), $$0.a())) continue;
            return (eoh)$$3.b(c, $$1.a() == flc.c);
        }
        return null;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(b) != false ? e : d;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = eee.p($$0).g();
        return dzq.a($$1, $$2.a($$3), $$3.g());
    }

    protected static iz p(eoh $$0) {
        return $$0.c(b) != false ? iz.a : iz.b;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if (eee.p($$0).g() == $$4 && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

