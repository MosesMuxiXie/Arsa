/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class fla {
    public static final jj<flb> c = new jj();
    protected final eoi<fla, flb> d;
    private flb a;
    private final jd.c<fla> b = mi.c.f(this);

    protected fla() {
        eoi.a<fla, flb> $$0 = new eoi.a<fla, flb>(this);
        this.a($$0);
        this.d = $$0.a(fla::g, flb::new);
        this.f(this.d.b());
    }

    protected void a(eoi.a<fla, flb> $$0) {
    }

    public eoi<fla, flb> f() {
        return this.d;
    }

    protected final void f(flb $$0) {
        this.a = $$0;
    }

    public final flb g() {
        return this.a;
    }

    public abstract dlp a();

    protected void a(dwo $$0, is $$1, flb $$2, bgr $$3) {
    }

    protected void b(axf $$0, is $$1, eoh $$2, flb $$3) {
    }

    protected void a(axf $$0, is $$1, flb $$2, bgr $$3) {
    }

    protected void a(dwo $$0, is $$1, cgk $$2, chc $$3) {
    }

    protected @Nullable lw h() {
        return null;
    }

    protected abstract boolean a(flb var1, dvt var2, is var3, fla var4, iz var5);

    protected abstract ftm a(dvt var1, is var2, flb var3);

    public abstract int a(dwr var1);

    protected boolean i() {
        return false;
    }

    protected boolean b() {
        return false;
    }

    protected abstract float c();

    public abstract float a(flb var1, dvt var2, is var3);

    public abstract float a(flb var1);

    protected abstract eoh b(flb var1);

    public abstract boolean c(flb var1);

    public abstract int d(flb var1);

    public boolean a(fla $$0) {
        return $$0 == this;
    }

    @Deprecated
    public boolean a(bef<fla> $$0) {
        return this.b.a($$0);
    }

    public abstract fug b(flb var1, dvt var2, is var3);

    public @Nullable fth c(flb $$0, dvt $$1, is $$2) {
        if (this.b()) {
            return null;
        }
        float $$3 = $$0.a($$1, $$2);
        return new fth($$2.u(), $$2.v(), $$2.w(), (double)$$2.u() + 1.0, (float)$$2.v() + $$3, (double)$$2.w() + 1.0);
    }

    public Optional<bcz> j() {
        return Optional.empty();
    }

    @Deprecated
    public jd.c<fla> k() {
        return this.b;
    }
}

