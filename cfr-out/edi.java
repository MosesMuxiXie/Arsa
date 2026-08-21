/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class edi
extends ecp {
    public static final MapCodec<edi> a = edi.b(edi::new);
    private static final yh b = yh.c("container.grindstone_title");
    private final Function<eoh, fug> d;

    public MapCodec<edi> a() {
        return a;
    }

    protected edi(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(c, eos.b));
        this.d = this.b();
    }

    private Function<eoh, fug> b() {
        fug $$0 = fud.a(dzq.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dzq.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
        fug $$12 = fud.a($$0, f.z);
        fug $$2 = fud.a(dzq.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$12);
        Map<eos, Map<iz, fug>> $$3 = fud.e($$2);
        return this.a((eoh $$1) -> (fug)((Map)$$3.get($$1.c(c))).get($$1.c(f)));
    }

    private fug p(eoh $$0) {
        return this.d.apply($$0);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.p($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.p($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return true;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.aF);
        }
        return cdc.a;
    }

    @Override
    protected cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new dij($$2, $$3, dhw.a($$1, $$22)), b);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(f, $$1.a((iz)$$0.c(f)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a((iz)$$0.c(f)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, c);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

