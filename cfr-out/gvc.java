/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class gvc
extends gsb {
    private static final yh a = yh.c("test_instance_block.test_id");
    private static final yh b = yh.c("test_instance_block.size");
    private static final yh c = yh.c("test_instance_block.entities");
    private static final yh d = yh.c("test_instance_block.rotation");
    private static final int e = 8;
    private static final int f = 316;
    private final emz t;
    private @Nullable gjn u;
    private @Nullable gjn v;
    private @Nullable gjn w;
    private @Nullable gjn x;
    private @Nullable gjo y;
    private @Nullable gje z;
    private @Nullable gje A;
    private @Nullable gjl<Boolean> B;
    private @Nullable gjl<egm> C;

    public gvc(emz $$0) {
        super($$0.o().b().f());
        this.t = $$0;
    }

    @Override
    protected void bg_() {
        int $$02 = this.o / 2 - 158;
        boolean $$12 = w.aX;
        int $$2 = $$12 ? 3 : 2;
        int $$3 = gvc.a($$2);
        this.u = new gjn(this.q, $$02, 40, 316, 20, yh.c("test_instance_block.test_id"));
        this.u.k(128);
        Optional<amt<tb>> $$4 = this.t.h();
        if ($$4.isPresent()) {
            this.u.a($$4.get().a().toString());
        }
        this.u.b((String $$0) -> this.c(false));
        this.c(this.u);
        this.y = new gjo($$02, 70, 316, 8 * this.q.b, yh.b(""), this.q);
        this.c(this.y);
        jy $$5 = this.t.m();
        int $$6 = 0;
        this.v = new gjn(this.q, this.c($$6++, 5), 160, gvc.a(5), 20, yh.c("structure_block.size.x"));
        this.v.k(15);
        this.c(this.v);
        this.w = new gjn(this.q, this.c($$6++, 5), 160, gvc.a(5), 20, yh.c("structure_block.size.y"));
        this.w.k(15);
        this.c(this.w);
        this.x = new gjn(this.q, this.c($$6++, 5), 160, gvc.a(5), 20, yh.c("structure_block.size.z"));
        this.x.k(15);
        this.c(this.x);
        this.a($$5);
        this.C = this.c(gjl.a(gvc::a, this.t.w()).a((egm[])egm.values()).a().a(this.c($$6++, 5), 160, gvc.a(5), 20, d, ($$0, $$1) -> this.o()));
        this.B = this.c(gjl.a(!this.t.l()).a().a(this.c($$6++, 5), 160, gvc.a(5), 20, c));
        $$6 = 0;
        this.c(gje.a(yh.c("test_instance.action.reset"), (gje $$0) -> {
            this.a(akd.a.d);
            this.n.a((gsb)null);
        }).a(this.c($$6++, $$2), 185, $$3, 20).a());
        this.z = this.c(gje.a(yh.c("test_instance.action.save"), (gje $$0) -> {
            this.a(akd.a.e);
            this.n.a((gsb)null);
        }).a(this.c($$6++, $$2), 185, $$3, 20).a());
        if ($$12) {
            this.A = this.c(gje.a(yh.b("Export Structure"), (gje $$0) -> {
                this.a(akd.a.f);
                this.n.a((gsb)null);
            }).a(this.c($$6++, $$2), 185, $$3, 20).a());
        }
        this.c(gje.a(yh.c("test_instance.action.run"), (gje $$0) -> {
            this.a(akd.a.g);
            this.n.a((gsb)null);
        }).a(this.c(0, 3), 210, gvc.a(3), 20).a());
        this.c(gje.a(yg.d, (gje $$0) -> this.p()).a(this.c(1, 3), 210, gvc.a(3), 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.F()).a(this.c(2, 3), 210, gvc.a(3), 20).a());
        this.c(true);
    }

    private void o() {
        boolean $$0;
        this.z.k = $$0 = this.C.a() == egm.a && amo.c(this.u.a()) != null;
        if (this.A != null) {
            this.A.k = $$0;
        }
    }

    private static yh a(egm $$0) {
        return yh.b(switch ($$0) {
            default -> throw new MatchException(null, null);
            case egm.a -> "0";
            case egm.b -> "90";
            case egm.c -> "180";
            case egm.d -> "270";
        });
    }

    private void a(jy $$0) {
        this.v.a(Integer.toString($$0.u()));
        this.w.a(Integer.toString($$0.v()));
        this.x.a(Integer.toString($$0.w()));
    }

    private int c(int $$0, int $$1) {
        int $$2 = this.o / 2 - 158;
        float $$3 = gvc.b($$1);
        return (int)((float)$$2 + (float)$$0 * (8.0f + $$3));
    }

    private static int a(int $$0) {
        return (int)gvc.b($$0);
    }

    private static float b(int $$0) {
        return (float)(316 - ($$0 - 1) * 8) / (float)$$0;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        int $$4 = this.o / 2 - 158;
        $$0.a(this.q, this.m, this.o / 2, 10, -1);
        $$0.b(this.q, a, $$4, 30, -6250336);
        $$0.b(this.q, b, $$4, 150, -6250336);
        $$0.b(this.q, d, this.C.aT_(), 150, -6250336);
        $$0.b(this.q, c, this.B.aT_(), 150, -6250336);
    }

    private void c(boolean $$0) {
        boolean $$1 = this.a($$0 ? akd.a.a : akd.a.b);
        if (!$$1) {
            this.y.a_(yh.c("test_instance.description.invalid_id").a(l.m));
        }
        this.o();
    }

    private void p() {
        this.a(akd.a.c);
        this.aX_();
    }

    private boolean a(akd.a $$02) {
        Optional<amo> $$1 = Optional.ofNullable(amo.c(this.u.a()));
        Optional<amt<tb>> $$2 = $$1.map($$0 -> amt.a(mj.bv, $$0));
        jy $$3 = new jy(gvc.a(this.v.a()), gvc.a(this.w.a()), gvc.a(this.x.a()));
        boolean $$4 = this.B.a() == false;
        this.n.R().b(new akd(this.t.aD_(), $$02, $$2, $$3, this.C.a(), $$4));
        return $$1.isPresent();
    }

    public void a(yh $$0, Optional<jy> $$12) {
        yw $$2 = yh.i();
        this.t.x().ifPresent($$1 -> $$2.b(yh.a("test_instance.description.failed", yh.i().a(l.m).b((yh)$$1))).f("\n\n"));
        $$2.b($$0);
        this.y.a_($$2);
        $$12.ifPresent(this::a);
    }

    private void F() {
        this.aX_();
    }

    private static int a(String $$0) {
        try {
            return bgj.a(Integer.parseInt($$0), 1, 48);
        }
        catch (NumberFormatException $$1) {
            return 1;
        }
    }

    @Override
    public boolean v() {
        return true;
    }
}

