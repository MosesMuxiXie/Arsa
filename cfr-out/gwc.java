/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gwc
extends gsb {
    protected final gsb b;
    protected final gfo c;
    protected @Nullable gkc d;
    public final gou e = new gou(this);

    public gwc(gsb $$0, gfo $$1, yh $$2) {
        super($$2);
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    protected void bg_() {
        this.F();
        this.I();
        this.p();
        this.e.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    protected void F() {
        this.e.a(this.m, this.q);
    }

    protected void I() {
        this.d = this.e.c(new gkc(this.n, this.o, this));
        this.o();
        gjc gjc2 = this.d.b(this.c.aK());
        if (gjc2 instanceof gjl) {
            gjl $$0;
            this.r = $$0 = (gjl)gjc2;
            this.r.k = this.n.aZ().a();
        }
    }

    protected abstract void o();

    protected void p() {
        this.e.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
    }

    @Override
    protected void c() {
        this.e.a();
        if (this.d != null) {
            this.d.a(this.o, this.e);
        }
    }

    @Override
    public void aZ_() {
        this.n.k.aQ();
    }

    @Override
    public void aX_() {
        if (this.d != null) {
            this.d.c();
        }
        this.n.a(this.b);
    }

    public void a(gfn<?> $$0) {
        if (this.d != null) {
            this.d.c($$0);
        }
    }
}

