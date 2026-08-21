/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class cpi
extends cop {
    public static final int b = 1;
    protected final cht c;
    protected final double d;
    protected double e;
    protected double f;
    protected double g;
    protected boolean h;
    private final Function<cht, bef<cez>> a;

    public cpi(cht $$0, double $$1) {
        this($$0, $$1, bdq.F);
    }

    public cpi(cht $$0, double $$12, bef<cez> $$2) {
        this($$0, $$12, (cht $$1) -> $$2);
    }

    public cpi(cht $$0, double $$1, Function<cht, bef<cez>> $$2) {
        this.c = $$0;
        this.d = $$1;
        this.a = $$2;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        is $$0;
        if (!this.h()) {
            return false;
        }
        if (this.c.cp() && ($$0 = this.a(this.c.ao(), this.c, 5)) != null) {
            this.e = $$0.u();
            this.f = $$0.v();
            this.g = $$0.w();
            return true;
        }
        return this.i();
    }

    protected boolean h() {
        return this.c.fb() != null && this.c.fb().a(this.a.apply(this.c));
    }

    protected boolean i() {
        ftm $$0 = cso.a(this.c, 5, 4);
        if ($$0 == null) {
            return false;
        }
        this.e = $$0.g;
        this.f = $$0.h;
        this.g = $$0.i;
        return true;
    }

    public boolean k() {
        return this.h;
    }

    @Override
    public void d() {
        this.c.N().a(this.e, this.f, this.g, this.d);
        this.h = true;
    }

    @Override
    public void e() {
        this.h = false;
    }

    @Override
    public boolean c() {
        return !this.c.N().l();
    }

    protected @Nullable is a(dvt $$0, cgk $$12, int $$2) {
        is $$3 = $$12.dK();
        if (!$$0.a_($$3).g($$0, $$3).c()) {
            return null;
        }
        return is.a($$12.dK(), $$2, 1, $$1 -> $$0.b_((is)$$1).a(bdv.a)).orElse(null);
    }
}

