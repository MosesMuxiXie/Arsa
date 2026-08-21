/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cox
extends cop {
    public static final float a = 0.02f;
    protected final chn b;
    protected @Nullable cgk c;
    protected final float d;
    private int h;
    protected final float e;
    private final boolean i;
    protected final Class<? extends chl> f;
    protected final csk g;

    public cox(chn $$0, Class<? extends chl> $$1, float $$2) {
        this($$0, $$1, $$2, 0.02f);
    }

    public cox(chn $$0, Class<? extends chl> $$1, float $$2, float $$3) {
        this($$0, $$1, $$2, $$3, false);
    }

    public cox(chn $$0, Class<? extends chl> $$12, float $$22, float $$3, boolean $$4) {
        this.b = $$0;
        this.f = $$12;
        this.d = $$22;
        this.e = $$3;
        this.i = $$4;
        this.a(EnumSet.of(cop.a.b));
        if ($$12 == ddm.class) {
            Predicate<cgk> $$5 = cgs.b($$0);
            this.g = csk.b().a($$22).a((chl $$1, axf $$2) -> $$5.test($$1));
        } else {
            this.g = csk.b().a($$22);
        }
    }

    @Override
    public boolean b() {
        if (this.b.ep().i() >= this.e) {
            return false;
        }
        if (this.b.ag_() != null) {
            this.c = this.b.ag_();
        }
        axf $$02 = cox.a(this.b);
        this.c = this.f == ddm.class ? $$02.a(this.g, this.b, this.b.dP(), this.b.dT(), this.b.dV()) : $$02.a(this.b.ao().a(this.f, this.b.dj().c(this.d, 3.0, this.d), $$0 -> true), this.g, this.b, this.b.dP(), this.b.dT(), this.b.dV());
        return this.c != null;
    }

    @Override
    public boolean c() {
        if (!this.c.cb()) {
            return false;
        }
        if (this.b.g(this.c) > (double)(this.d * this.d)) {
            return false;
        }
        return this.h > 0;
    }

    @Override
    public void d() {
        this.h = this.a(40 + this.b.ep().a(40));
    }

    @Override
    public void e() {
        this.c = null;
    }

    @Override
    public void a() {
        if (!this.c.cb()) {
            return;
        }
        double $$0 = this.i ? this.b.dT() : this.c.dT();
        this.b.J().a(this.c.dP(), $$0, this.c.dV());
        --this.h;
    }
}

