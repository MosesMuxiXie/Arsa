/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import org.jspecify.annotations.Nullable;

public class gra
extends gsb {
    private final yh t;
    protected goy a = goy.d().a(8);
    protected yh b;
    protected yh c;
    protected @Nullable gje d;
    protected @Nullable gje e;
    private int u;
    protected final BooleanConsumer f;

    public gra(BooleanConsumer $$0, yh $$1, yh $$2) {
        this($$0, $$1, $$2, yg.f, yg.g);
    }

    public gra(BooleanConsumer $$0, yh $$1, yh $$2, yh $$3, yh $$4) {
        super($$1);
        this.f = $$0;
        this.t = $$2;
        this.b = $$3;
        this.c = $$4;
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), this.t});
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.a.c().b();
        this.a.a(new gko(this.m, this.q));
        this.a.a(new gjz(this.t, this.q).a(this.o - 50).b(15).a(true));
        this.l();
        goy $$0 = this.a.a(goy.e().a(4));
        $$0.c().c(16);
        this.a($$0);
        this.a.a(this::c);
        this.c();
    }

    @Override
    protected void c() {
        this.a.a();
        gos.a(this.a, this.aV_());
    }

    protected void l() {
    }

    protected void a(goy $$02) {
        this.d = $$02.a(gje.a(this.b, (gje $$0) -> this.f.accept(true)).a());
        this.e = $$02.a(gje.a(this.c, (gje $$0) -> this.f.accept(false)).a());
    }

    public void a(int $$0) {
        this.u = $$0;
        this.d.k = false;
        this.e.k = false;
    }

    @Override
    public void e() {
        super.e();
        if (--this.u == 0) {
            this.d.k = true;
            this.e.k = true;
        }
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.u <= 0 && $$0.t() == 256) {
            this.f.accept(false);
            return true;
        }
        return super.a($$0);
    }
}

