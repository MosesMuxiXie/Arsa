/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gxt
extends gsb {
    private static final yh a = yh.c("telemetry_info.screen.title");
    private static final yh b = yh.c("telemetry_info.screen.description").b(-4539718);
    private static final yh c = yh.c("telemetry_info.button.privacy_statement");
    private static final yh d = yh.c("telemetry_info.button.give_feedback");
    private static final yh e = yh.c("telemetry_info.button.show_data");
    private static final yh f = yh.c("telemetry_info.opt_in.description").b(-2039584);
    private static final int t = 8;
    private static final boolean u = gfj.V().I();
    private final gsb v;
    private final gfo w;
    private final gou x;
    private @Nullable gxs y;
    private @Nullable gjz z;
    private @Nullable gjg A;
    private double B;

    public gxt(gsb $$0, gfo $$1) {
        super(a);
        this.x = new gou(this, 16 + gfj.V().g.b * 5 + 20, u ? 33 + gjg.a(gfj.V().g) : 33);
        this.v = $$0;
        this.w = $$1;
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), b});
    }

    @Override
    protected void bg_() {
        goy $$02 = this.x.a(goy.d().a(4));
        $$02.c().b();
        $$02.a(new gko(a, this.q));
        this.z = $$02.a(new gjz(b, this.q).a(true));
        goy $$12 = $$02.a(goy.e().a(8));
        $$12.a(gje.a(c, this::a).a());
        $$12.a(gje.a(d, this::b).a());
        goy $$2 = this.x.b(goy.d().a(4));
        $$2.c().b();
        if (u) {
            this.A = $$2.a(gjg.a(f, this.q).a(this.o - 40).a(this.w.aA()).a(this::a).a());
        }
        goy $$3 = $$2.a(goy.e().a(8));
        $$3.a(gje.a(e, this::c).a());
        $$3.a(gje.a(yg.d, (gje $$0) -> this.aX_()).a());
        goy $$4 = this.x.c(goy.d().a(8));
        this.y = $$4.a(new gxs(0, 0, this.o - 40, this.x.d(), this.q));
        this.y.a((double $$0) -> {
            this.B = $$0;
        });
        this.x.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        if (this.y != null) {
            this.y.a(this.B);
            this.y.c(this.o - 40);
            this.y.d(this.x.d());
            this.y.u();
        }
        if (this.z != null) {
            this.z.a(this.o - 16);
        }
        if (this.A != null) {
            this.A.a(this.o - 40, this.q);
        }
        this.x.a();
    }

    @Override
    protected void aI_() {
        if (this.y != null) {
            this.b(this.y);
        }
    }

    private void a(gjc $$0, boolean $$1) {
        if (this.y != null) {
            this.y.a($$1);
        }
    }

    private void a(gje $$0) {
        gqz.a((gsb)this, bez.c);
    }

    private void b(gje $$0) {
        gqz.a((gsb)this, bez.i);
    }

    private void c(gje $$0) {
        bhs.n().a(this.n.y().b());
    }

    @Override
    public void aX_() {
        this.n.a(this.v);
    }
}

