/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpd
extends cop {
    private final cht a;
    private double b;
    private double c;
    private double d;
    private final double e;

    public cpd(cht $$0, double $$1) {
        this.a = $$0;
        this.e = $$1;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        if (this.a.gB()) {
            return false;
        }
        ftm $$0 = cso.a(this.a, 16, 7, ftm.c(this.a.gC()), 1.5707963705062866);
        if ($$0 == null) {
            return false;
        }
        this.b = $$0.g;
        this.c = $$0.h;
        this.d = $$0.i;
        return true;
    }

    @Override
    public boolean c() {
        return !this.a.N().l();
    }

    @Override
    public void d() {
        this.a.N().a(this.b, this.c, this.d, this.e);
    }
}

