/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cpe
extends cop {
    private final cht a;
    private @Nullable chl b;
    private double c;
    private double d;
    private double e;
    private final double f;
    private final float g;

    public cpe(cht $$0, double $$1, float $$2) {
        this.a = $$0;
        this.f = $$1;
        this.g = $$2;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        this.b = this.a.ag_();
        if (this.b == null) {
            return false;
        }
        if (this.b.g(this.a) > (double)(this.g * this.g)) {
            return false;
        }
        ftm $$0 = cso.a(this.a, 16, 7, this.b.dI(), 1.5707963705062866);
        if ($$0 == null) {
            return false;
        }
        this.c = $$0.g;
        this.d = $$0.h;
        this.e = $$0.i;
        return true;
    }

    @Override
    public boolean c() {
        return !this.a.N().l() && this.b.cb() && this.b.g(this.a) < (double)(this.g * this.g);
    }

    @Override
    public void e() {
        this.b = null;
    }

    @Override
    public void d() {
        this.a.N().a(this.c, this.d, this.e, this.f);
    }
}

