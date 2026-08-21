/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cnu<T extends chl>
extends cop {
    protected final cht a;
    private final double i;
    private final double j;
    protected @Nullable T b;
    protected final float c;
    protected @Nullable flp d;
    protected final cre e;
    protected final Class<T> f;
    protected final Predicate<? super chl> g;
    protected final Predicate<? super chl> h;
    private final csk k;

    public cnu(cht $$02, Class<T> $$1, float $$2, double $$3, double $$4) {
        this($$02, $$1, $$0 -> true, $$2, $$3, $$4, cgs.e);
    }

    public cnu(cht $$0, Class<T> $$1, Predicate<chl> $$22, float $$32, double $$4, double $$5, Predicate<? super chl> $$6) {
        this.a = $$0;
        this.f = $$1;
        this.g = $$22;
        this.c = $$32;
        this.i = $$4;
        this.j = $$5;
        this.h = $$6;
        this.e = $$0.N();
        this.a(EnumSet.of(cop.a.a));
        this.k = csk.a().a($$32).a((chl $$2, axf $$3) -> $$6.test($$2) && $$22.test($$2));
    }

    public cnu(cht $$02, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<? super chl> $$5) {
        this($$02, $$1, $$0 -> true, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean b() {
        this.b = cnu.a(this.a).a(this.a.ao().a(this.f, this.a.dj().c(this.c, 3.0, this.c), $$0 -> true), this.k, this.a, this.a.dP(), this.a.dR(), this.a.dV());
        if (this.b == null) {
            return false;
        }
        ftm $$02 = cso.a(this.a, 16, 7, ((cgk)this.b).dI());
        if ($$02 == null) {
            return false;
        }
        if (((cgk)this.b).h($$02.g, $$02.h, $$02.i) < ((cgk)this.b).g(this.a)) {
            return false;
        }
        this.d = this.e.a($$02.g, $$02.h, $$02.i, 0);
        return this.d != null;
    }

    @Override
    public boolean c() {
        return !this.e.l();
    }

    @Override
    public void d() {
        this.e.a(this.d, this.i);
    }

    @Override
    public void e() {
        this.b = null;
    }

    @Override
    public void a() {
        if (this.a.g((cgk)this.b) < 49.0) {
            this.a.N().a(this.j);
        } else {
            this.a.N().a(this.i);
        }
    }
}

