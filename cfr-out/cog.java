/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cog
extends cop {
    protected final cht a;
    private double b;
    private double c;
    private double d;
    private final double e;
    private final dwo f;

    public cog(cht $$0, double $$1) {
        this.a = $$0;
        this.e = $$1;
        this.f = $$0.ao();
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        if (this.a.ag_() != null) {
            return false;
        }
        if (!this.f.ag()) {
            return false;
        }
        if (!this.a.cp()) {
            return false;
        }
        if (!this.f.k(this.a.dK())) {
            return false;
        }
        if (!this.a.a(cgv.f).f()) {
            return false;
        }
        return this.h();
    }

    protected boolean h() {
        ftm $$0 = this.i();
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

    protected @Nullable ftm i() {
        bgr $$0 = this.a.ep();
        is $$1 = this.a.dK();
        for (int $$2 = 0; $$2 < 10; ++$$2) {
            is $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
            if (this.f.k($$3) || !(this.a.c($$3) < 0.0f)) continue;
            return ftm.c($$3);
        }
        return null;
    }
}

