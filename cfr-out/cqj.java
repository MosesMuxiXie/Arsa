/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cqj<T extends chl>
extends cqq {
    private static final int i = 10;
    protected final Class<T> a;
    protected final int b;
    protected @Nullable chl c;
    protected csk d;

    public cqj(chn $$0, Class<T> $$1, boolean $$2) {
        this($$0, $$1, 10, $$2, false, null);
    }

    public cqj(chn $$0, Class<T> $$1, boolean $$2, csk.a $$3) {
        this($$0, $$1, 10, $$2, false, $$3);
    }

    public cqj(chn $$0, Class<T> $$1, boolean $$2, boolean $$3) {
        this($$0, $$1, 10, $$2, $$3, null);
    }

    public cqj(chn $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable csk.a $$5) {
        super($$0, $$3, $$4);
        this.a = $$1;
        this.b = cqj.b($$2);
        this.a(EnumSet.of(cop.a.d));
        this.d = csk.a().a(this.l()).a($$5);
    }

    @Override
    public boolean b() {
        if (this.b > 0 && this.e.ep().a(this.b) != 0) {
            return false;
        }
        this.h();
        return this.c != null;
    }

    protected fth a(double $$0) {
        return this.e.dj().c($$0, $$0, $$0);
    }

    protected void h() {
        axf $$02 = cqj.a(this.e);
        this.c = this.a == ddm.class || this.a == axg.class ? $$02.a(this.i(), this.e, this.e.dP(), this.e.dT(), this.e.dV()) : $$02.a(this.e.ao().a(this.a, this.a(this.l()), $$0 -> true), this.i(), this.e, this.e.dP(), this.e.dT(), this.e.dV());
    }

    @Override
    public void d() {
        this.e.g(this.c);
        super.d();
    }

    public void a(@Nullable chl $$0) {
        this.c = $$0;
    }

    private csk i() {
        return this.d.a(this.l());
    }
}

