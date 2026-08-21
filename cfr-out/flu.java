/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class flu {
    private final dvx a;
    private final @Nullable flt b;
    private final is c;
    private final is.a d = new is.a();

    public flu(dvx $$0, chn $$1) {
        this.a = $$0;
        dwo dwo2 = $$1.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            this.b = $$2.N();
        } else {
            this.b = null;
        }
        this.c = $$1.dK();
    }

    public fls a(int $$0, int $$1, int $$2) {
        is.a $$3 = this.d.d($$0, $$1, $$2);
        if (this.b == null) {
            return flx.b(this.a, (is)$$3);
        }
        return this.b.a(this.a, $$3);
    }

    public eoh a(is $$0) {
        return this.a.a_($$0);
    }

    public dvx a() {
        return this.a;
    }

    public is b() {
        return this.c;
    }
}

