/*
 * Decompiled with CFR 0.152.
 */
public class gun
extends gsb {
    private static final yh a = yh.c("jigsaw_block.joint_label");
    private static final yh b = yh.c("jigsaw_block.pool");
    private static final yh c = yh.c("jigsaw_block.name");
    private static final yh d = yh.c("jigsaw_block.target");
    private static final yh e = yh.c("jigsaw_block.final_state");
    private static final yh f = yh.c("jigsaw_block.placement_priority");
    private static final yh t = yh.c("jigsaw_block.placement_priority.tooltip");
    private static final yh u = yh.c("jigsaw_block.selection_priority");
    private static final yh v = yh.c("jigsaw_block.selection_priority.tooltip");
    private final emg w;
    private gjn x;
    private gjn y;
    private gjn z;
    private gjn A;
    private gjn B;
    private gjn C;
    int D;
    private boolean E = true;
    private gjl<emg.a> F;
    private gje G;
    private gje H;
    private emg.a I;

    public gun(emg $$0) {
        super(gfa.a);
        this.w = $$0;
    }

    private void o() {
        this.F();
        this.n.a((gsb)null);
    }

    private void p() {
        this.n.a((gsb)null);
    }

    private void F() {
        this.n.R().b(new ajx(this.w.aD_(), amo.a(this.x.a()), amo.a(this.y.a()), amo.a(this.z.a()), this.A.a(), this.I, this.b(this.B.a()), this.b(this.C.a())));
    }

    private int b(String $$0) {
        try {
            return Integer.parseInt($$0);
        }
        catch (NumberFormatException $$1) {
            return 0;
        }
    }

    private void I() {
        this.n.R().b(new aiz(this.w.aD_(), this.D, this.E));
    }

    @Override
    public void aX_() {
        this.p();
    }

    @Override
    protected void bg_() {
        boolean $$02;
        this.z = new gjn(this.q, this.o / 2 - 153, 20, 300, 20, b);
        this.z.k(128);
        this.z.a(this.w.d().a().toString());
        this.z.b((String $$0) -> this.J());
        this.d(this.z);
        this.x = new gjn(this.q, this.o / 2 - 153, 55, 300, 20, c);
        this.x.k(128);
        this.x.a(this.w.a().toString());
        this.x.b((String $$0) -> this.J());
        this.d(this.x);
        this.y = new gjn(this.q, this.o / 2 - 153, 90, 300, 20, d);
        this.y.k(128);
        this.y.a(this.w.c().toString());
        this.y.b((String $$0) -> this.J());
        this.d(this.y);
        this.A = new gjn(this.q, this.o / 2 - 153, 125, 300, 20, e);
        this.A.k(256);
        this.A.a(this.w.f());
        this.d(this.A);
        this.B = new gjn(this.q, this.o / 2 - 153, 160, 98, 20, u);
        this.B.k(3);
        this.B.a(Integer.toString(this.w.l()));
        this.B.a(gks.a(v));
        this.d(this.B);
        this.C = new gjn(this.q, this.o / 2 - 50, 160, 98, 20, f);
        this.C.k(3);
        this.C.a(Integer.toString(this.w.k()));
        this.C.a(gks.a(t));
        this.d(this.C);
        this.I = this.w.h();
        this.F = this.c(gjl.a(emg.a::a, this.I).a((emg.a[])emg.a.values()).a().a(this.o / 2 + 54, 160, 100, 20, a, ($$0, $$1) -> {
            this.I = $$1;
        }));
        this.F.k = $$02 = edz.p(this.w.o()).o().b();
        this.F.l = $$02;
        this.c(new giz(this.o / 2 - 154, 185, 100, 20, yg.a, 0.0){
            {
                this.c();
            }

            @Override
            protected void c() {
                this.a_(yh.a("jigsaw_block.levels", gun.this.D));
            }

            @Override
            protected void a() {
                gun.this.D = bgj.c(bgj.b(this.e, 0.0, 20.0));
            }
        });
        this.c(gjl.a(this.E).a(this.o / 2 - 50, 185, 100, 20, yh.c("jigsaw_block.keep_jigsaws"), ($$0, $$1) -> {
            this.E = $$1;
        }));
        this.H = this.c(gje.a(yh.c("jigsaw_block.generate"), (gje $$0) -> {
            this.o();
            this.I();
        }).a(this.o / 2 + 54, 185, 100, 20).a());
        this.G = this.c(gje.a(yg.d, (gje $$0) -> this.o()).a(this.o / 2 - 4 - 150, 210, 150, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.p()).a(this.o / 2 + 4, 210, 150, 20).a());
        this.J();
    }

    @Override
    protected void aI_() {
        this.b(this.z);
    }

    public static boolean a(String $$0) {
        return amo.c($$0) != null;
    }

    private void J() {
        boolean $$0;
        this.G.k = $$0 = gun.a(this.x.a()) && gun.a(this.y.a()) && gun.a(this.z.a());
        this.H.k = $$0;
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.x.a();
        String $$3 = this.y.a();
        String $$4 = this.z.a();
        String $$5 = this.A.a();
        String $$6 = this.B.a();
        String $$7 = this.C.a();
        int $$8 = this.D;
        emg.a $$9 = this.I;
        this.b($$0, $$1);
        this.x.a($$2);
        this.y.a($$3);
        this.z.a($$4);
        this.A.a($$5);
        this.D = $$8;
        this.I = $$9;
        this.F.a($$9);
        this.B.a($$6);
        this.C.a($$7);
    }

    @Override
    public boolean a(gzb $$0) {
        if (super.a($$0)) {
            return true;
        }
        if (this.G.k && $$0.d()) {
            this.o();
            return true;
        }
        return false;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.b(this.q, b, this.o / 2 - 153, 10, -6250336);
        this.z.a($$0, $$1, $$2, $$3);
        $$0.b(this.q, c, this.o / 2 - 153, 45, -6250336);
        this.x.a($$0, $$1, $$2, $$3);
        $$0.b(this.q, d, this.o / 2 - 153, 80, -6250336);
        this.y.a($$0, $$1, $$2, $$3);
        $$0.b(this.q, e, this.o / 2 - 153, 115, -6250336);
        this.A.a($$0, $$1, $$2, $$3);
        $$0.b(this.q, u, this.o / 2 - 153, 150, -6250336);
        this.C.a($$0, $$1, $$2, $$3);
        $$0.b(this.q, f, this.o / 2 - 50, 150, -6250336);
        this.B.a($$0, $$1, $$2, $$3);
        if (edz.p(this.w.o()).o().b()) {
            $$0.b(this.q, a, this.o / 2 + 53, 150, -6250336);
        }
    }
}

