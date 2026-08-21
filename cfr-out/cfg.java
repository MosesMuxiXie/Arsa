/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

class cfg
extends cfj {
    private final boolean c;

    public cfg(cfl $$0, int $$1, boolean $$2) {
        super($$0, $$1);
        this.c = $$2;
    }

    @Override
    public boolean a(axf $$0, chl $$1, int $$2) {
        if (this.c == $$1.eY()) {
            $$1.d(Math.max(4 << $$2, 0));
        } else {
            $$1.a($$0, $$1.en().q(), (float)(6 << $$2));
        }
        return true;
    }

    @Override
    public void a(axf $$0, @Nullable cgk $$1, @Nullable cgk $$2, chl $$3, int $$4, double $$5) {
        if (this.c == $$3.eY()) {
            int $$6 = (int)($$5 * (double)(4 << $$4) + 0.5);
            $$3.d($$6);
        } else {
            int $$7 = (int)($$5 * (double)(6 << $$4) + 0.5);
            if ($$1 == null) {
                $$3.a($$0, $$3.en().q(), (float)$$7);
            } else {
                $$3.a($$0, $$3.en().c($$1, $$2), (float)$$7);
            }
        }
    }
}

