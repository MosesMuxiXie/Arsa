/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class dne
extends dkb {
    protected final dzq a;
    private final iz b;

    public dne(dzq $$0, dzq $$1, iz $$2, dlp.a $$3) {
        super($$0, $$3);
        this.a = $$1;
        this.b = $$2;
    }

    protected boolean a(dwr $$0, eoh $$1, is $$2) {
        return $$1.a($$0, $$2);
    }

    @Override
    protected @Nullable eoh c(dpu $$0) {
        eoh $$1 = this.a.a($$0);
        eoh $$2 = null;
        dwo $$3 = $$0.q();
        is $$4 = $$0.a();
        for (iz $$5 : $$0.f()) {
            eoh $$6;
            if ($$5 == this.b.g()) continue;
            eoh eoh2 = $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 == null || !this.a((dwr)$$3, $$6, $$4)) continue;
            $$2 = $$6;
            break;
        }
        return $$2 != null && $$3.a($$2, $$4, ftr.a()) ? $$2 : null;
    }

    @Override
    public void a(Map<dzq, dlp> $$0, dlp $$1) {
        super.a($$0, $$1);
        $$0.put(this.a, $$1);
    }
}

