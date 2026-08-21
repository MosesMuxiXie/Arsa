/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ecx
extends ejg
implements dzt,
egz {
    public static final MapCodec<ecx> a = ecx.b(ecx::new);
    public static final epf<iz> b = eox.T;
    public static final eph c = eox.U;
    private final Function<eoh, fug> g;

    public MapCodec<ecx> a() {
        return a;
    }

    protected ecx(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, 1));
        this.g = this.q();
    }

    private Function<eoh, fug> q() {
        return this.a(this.a(b, c));
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    public boolean a(eoh $$0, dpu $$1) {
        if (this.a($$0, $$1, c)) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.g.apply($$0);
    }

    @Override
    public double b() {
        return 3.0;
    }

    @Override
    public eph c() {
        return c;
    }

    @Override
    public eoh a(dpu $$0) {
        return this.a($$0, this, c, b);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return true;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        int $$4 = $$3.c(c);
        if ($$4 < 4) {
            $$0.a($$2, (eoh)$$3.b(c, $$4 + 1), 2);
        } else {
            ecx.a((dwo)$$0, $$2, new dlt(this));
        }
    }
}

