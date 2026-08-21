/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gvt
extends gsb {
    private static final int b = 100;
    private final yh c;
    private final @Nullable yh d;
    private final yh e;
    protected @Nullable gjg a;
    private @Nullable gjo f;
    private final gos t;

    protected gvt(yh $$0, yh $$1, yh $$2) {
        this($$0, $$1, null, $$2);
    }

    protected gvt(yh $$0, yh $$1, @Nullable yh $$2, yh $$3) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.t = new gos(0, 0, this.o, this.p);
    }

    protected abstract gov o();

    @Override
    protected void bg_() {
        goy $$02 = this.t.a(goy.d().a(8));
        $$02.c().b();
        $$02.a(new gko(this.q(), this.q));
        this.f = $$02.a(new gjo(0, 0, this.o - 100, this.p - 100, this.c, this.q), $$0 -> $$0.a(12));
        goy $$12 = $$02.a(goy.d().a(8));
        $$12.c().b();
        if (this.d != null) {
            this.a = $$12.a(gjg.a(this.d, this.q).a());
        }
        $$12.a(this.o());
        this.t.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        if (this.f != null) {
            this.f.c(this.o - 100);
            this.f.d(this.p - 100);
            this.f.u();
        }
        this.t.a();
        gos.a(this.t, this.aV_());
    }

    @Override
    public yh i() {
        return this.e;
    }
}

