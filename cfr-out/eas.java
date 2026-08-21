/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eas
extends egl
implements ehg {
    public static final MapCodec<eas> a = eas.b(eas::new);
    public static final eoy b = eox.I;
    private static final Map<iz.a, fug> e = fud.b(dzq.a(3.0, 3.0, 16.0));

    public MapCodec<? extends eas> a() {
        return a;
    }

    public eas(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(d, iz.a.b));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e.get($$0.c(d));
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == flc.c;
        return (eoh)super.a($$0).b(b, $$2);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b}).a(new epk[]{d});
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

