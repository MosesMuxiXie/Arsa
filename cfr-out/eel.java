/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class eel
extends ecp {
    public static final MapCodec<eel> a = eel.b(eel::new);
    public static final eoy b = eox.A;
    private final Function<eoh, fug> d;

    public MapCodec<eel> a() {
        return a;
    }

    protected eel(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(b, false)).b(c, eos.b));
        this.d = this.b();
    }

    private Function<eoh, fug> b() {
        Map<eos, Map<iz, fug>> $$0 = fud.e(dzq.b(6.0, 8.0, 10.0, 16.0));
        return this.a((eoh $$1) -> (fug)((Map)$$0.get($$1.c(c))).get($$1.c(f)), b);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.d.apply($$0);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$1.B_()) {
            eoh $$5 = (eoh)$$0.a(b);
            if ($$5.c(b).booleanValue()) {
                eel.a($$5, (dwp)$$1, $$2, 1.0f);
            }
        } else {
            this.b($$0, $$1, $$2, null);
        }
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g()) {
            this.b($$0, (dwo)$$1, $$2, null);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    public void b(eoh $$0, dwo $$1, is $$2, @Nullable ddm $$3) {
        $$0 = (eoh)$$0.a(b);
        $$1.a($$2, $$0, 3);
        this.c($$0, $$1, $$2);
        eel.a($$3, (dwp)$$1, $$2, $$0);
        $$1.a((cgk)$$3, $$0.c(b) != false ? etk.a : etk.e, $$2);
    }

    protected static void a(@Nullable ddm $$0, dwp $$1, is $$2, eoh $$3) {
        float $$4 = $$3.c(b) != false ? 0.6f : 0.5f;
        $$1.a((cgk)$$0, $$2, bda.qe, bdb.e, 0.3f, $$4);
    }

    private static void a(eoh $$0, dwp $$1, is $$2, float $$3) {
        iz $$4 = ((iz)$$0.c(f)).g();
        iz $$5 = eel.n($$0).g();
        double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
        double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
        double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
        $$1.a(new ls(0xFF0000, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$0.c(b).booleanValue() && $$3.i() < 0.25f) {
            eel.a($$0, (dwp)$$1, $$2, 0.5f);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3 && $$0.c(b).booleanValue()) {
            this.c($$0, $$1, $$2);
        }
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(b) != false ? 15 : 0;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(b).booleanValue() && eel.n($$0) == $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    private void c(eoh $$0, dwo $$1, is $$2) {
        iz $$3;
        fmj $$4 = fmf.a($$1, $$3, ($$3 = eel.n($$0).g()).o().d() ? iz.b : (iz)$$0.c(f));
        $$1.a($$2, (dzq)this, $$4);
        $$1.a($$2.a($$3), (dzq)this, $$4);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, f, b);
    }
}

