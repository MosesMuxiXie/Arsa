/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class coo
extends cop {
    public static final int a = 8;
    public static final int b = 4;
    public static final int c = 3;
    private final cth d;
    private @Nullable cth e;
    private final double f;
    private int g;

    public coo(cth $$0, double $$1) {
        this.d = $$0;
        this.f = $$1;
    }

    @Override
    public boolean b() {
        if (this.d.Z_() >= 0) {
            return false;
        }
        List<?> $$0 = this.d.ao().a(this.d.getClass(), this.d.dj().c(8.0, 4.0, 8.0));
        cth $$1 = null;
        double $$2 = Double.MAX_VALUE;
        for (cth $$3 : $$0) {
            double $$4;
            if ($$3.Z_() < 0 || ($$4 = this.d.g((cgk)$$3)) > $$2) continue;
            $$2 = $$4;
            $$1 = $$3;
        }
        if ($$1 == null) {
            return false;
        }
        if ($$2 < 9.0) {
            return false;
        }
        this.e = $$1;
        return true;
    }

    @Override
    public boolean c() {
        if (this.d.Z_() >= 0) {
            return false;
        }
        if (!this.e.cb()) {
            return false;
        }
        double $$0 = this.d.g((cgk)this.e);
        return !($$0 < 9.0) && !($$0 > 256.0);
    }

    @Override
    public void d() {
        this.g = 0;
    }

    @Override
    public void e() {
        this.e = null;
    }

    @Override
    public void a() {
        if (--this.g > 0) {
            return;
        }
        this.g = this.a(10);
        this.d.N().a((cgk)this.e, this.f);
    }
}

