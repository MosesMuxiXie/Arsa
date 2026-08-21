/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class eeh
extends ejg
implements egz {
    public static final MapCodec<eeh> a = eeh.b(eeh::new);
    public static final epf<iz> b = eox.T;
    private final Function<eoh, fug> c;

    public eeh(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(this.c(), 1));
        this.c = this.q();
    }

    private Function<eoh, fug> q() {
        return this.a(this.a(b, this.c()));
    }

    protected MapCodec<eeh> a() {
        return a;
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
        if (this.a($$0, $$1, this.c())) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return $$1.a_($$3).c((dvt)$$1, $$3, iz.b);
    }

    @Override
    public fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.c.apply($$0);
    }

    @Override
    public eoh a(dpu $$0) {
        return this.a($$0, this, this.c(), b);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, this.c());
    }
}

