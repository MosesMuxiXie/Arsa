/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cpa
extends cpm {
    private static final int i = 10;
    private static final int j = 7;

    public cpa(cht $$0, double $$1, boolean $$2) {
        super($$0, $$1, 10, $$2);
    }

    @Override
    public boolean b() {
        is $$1;
        axf $$0 = (axf)this.b.ao();
        if ($$0.e($$1 = this.b.dK())) {
            return false;
        }
        return super.b();
    }

    @Override
    protected @Nullable ftm h() {
        is $$1;
        jw $$2;
        axf $$0 = (axf)this.b.ao();
        jw $$3 = cjf.a($$0, $$2 = jw.a($$1 = this.b.dK()), 2);
        if ($$3 != $$2) {
            return cso.a(this.b, 10, 7, ftm.c($$3.k()), 1.5707963705062866);
        }
        return null;
    }
}

