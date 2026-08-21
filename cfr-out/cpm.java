/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cpm
extends cop {
    public static final int a = 120;
    protected final cht b;
    protected double c;
    protected double d;
    protected double e;
    protected final double f;
    protected int g;
    protected boolean h;
    private final boolean i;

    public cpm(cht $$0, double $$1) {
        this($$0, $$1, 120);
    }

    public cpm(cht $$0, double $$1, int $$2) {
        this($$0, $$1, $$2, true);
    }

    public cpm(cht $$0, double $$1, int $$2, boolean $$3) {
        this.b = $$0;
        this.f = $$1;
        this.g = $$2;
        this.i = $$3;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        ftm $$0;
        if (this.b.dm()) {
            return false;
        }
        if (!this.h) {
            if (this.i && this.b.eP() >= 100) {
                return false;
            }
            if (this.b.ep().a(cpm.b(this.g)) != 0) {
                return false;
            }
        }
        if (($$0 = this.h()) == null) {
            return false;
        }
        this.c = $$0.g;
        this.d = $$0.h;
        this.e = $$0.i;
        this.h = false;
        return true;
    }

    protected @Nullable ftm h() {
        return cso.a(this.b, 10, 7);
    }

    @Override
    public boolean c() {
        return !this.b.N().l() && !this.b.dm();
    }

    @Override
    public void d() {
        this.b.N().a(this.c, this.d, this.e, this.f);
    }

    @Override
    public void e() {
        this.b.N().n();
        super.e();
    }

    public void i() {
        this.h = true;
    }

    public void c(int $$0) {
        this.g = $$0;
    }
}

