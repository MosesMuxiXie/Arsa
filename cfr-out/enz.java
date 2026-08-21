/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class enz
extends ebw {
    public static final MapCodec<enz> b = enz.b(enz::new);
    public static final epf<epj> c = eox.bl;
    public static final eoy d = eox.B;
    public static final int e = 4;
    private static final fug f = dzq.c(16.0, 0.0, 4.0);
    private static final Map<iz, fug> g = fud.d(fud.a(f, dzq.c(4.0, 4.0, 16.0)));
    private static final Map<iz, fug> h = fud.d(fud.a(f, dzq.c(4.0, 4.0, 20.0)));

    protected MapCodec<enz> a() {
        return b;
    }

    public enz(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(a, iz.c)).b(c, epj.a)).b(d, false));
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return ($$0.c(d) != false ? g : h).get($$0.c(a));
    }

    private boolean a(eoh $$0, eoh $$1) {
        dzq $$2 = $$0.c(c) == epj.a ? dzs.bI : dzs.by;
        return $$1.a($$2) && $$1.c(eny.c) != false && $$1.c(a) == $$0.c(a);
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        is $$4;
        if (!$$0.B_() && $$3.gM() && this.a($$2, $$0.a_($$4 = $$1.a(((iz)$$2.c(a)).g())))) {
            $$0.b($$4, false);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        is $$4 = $$2.a(((iz)$$0.c(a)).g());
        if (this.a($$0, $$1.a_($$4))) {
            $$1.b($$4, true);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(a) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.a(((iz)$$0.c(a)).g()));
        return this.a($$0, $$3) || $$3.a(dzs.ca) && $$3.c(a) == $$0.c(a);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$0.a((dwr)$$1, $$2)) {
            $$1.b($$2.a(((iz)$$0.c(a)).g()), $$3, fmf.a($$4, ((iz)$$0.c(a)).g()));
        }
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt($$2.c(c) == epj.b ? dzs.by : dzs.bI);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(a, $$1.a((iz)$$0.c(a)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a((iz)$$0.c(a)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, c, d);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

