/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.HashCommon;
import org.jspecify.annotations.Nullable;

public class flt {
    private static final int a = 4096;
    private static final int b = 4095;
    private final long[] c = new long[4096];
    private final fls[] d = new fls[4096];

    public fls a(dvt $$0, is $$1) {
        long $$2 = $$1.a();
        int $$3 = flt.a($$2);
        fls $$4 = this.a($$3, $$2);
        if ($$4 != null) {
            return $$4;
        }
        return this.a($$0, $$1, $$3, $$2);
    }

    private @Nullable fls a(int $$0, long $$1) {
        if (this.c[$$0] == $$1) {
            return this.d[$$0];
        }
        return null;
    }

    private fls a(dvt $$0, is $$1, int $$2, long $$3) {
        fls $$4 = flx.b($$0, $$1);
        this.c[$$2] = $$3;
        this.d[$$2] = $$4;
        return $$4;
    }

    public void a(is $$0) {
        long $$1 = $$0.a();
        int $$2 = flt.a($$1);
        if (this.c[$$2] == $$1) {
            this.d[$$2] = null;
        }
    }

    private static int a(long $$0) {
        return (int)HashCommon.mix((long)$$0) & 0xFFF;
    }
}

