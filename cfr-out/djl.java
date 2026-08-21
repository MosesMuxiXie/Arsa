/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class djl
extends din {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int u = 8;
    public static final int v = 26;
    public static final int w = 44;
    private static final int y = 98;
    public static final int x = 48;
    private final dwo z;
    private final drb A;
    private final drb B;
    private final drb C;
    private final did D = did.a();

    public djl(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public djl(int $$0, ddl $$1, dhw $$2) {
        this($$0, $$1, $$2, $$1.j.ao());
    }

    private djl(int $$0, ddl $$1, dhw $$2, dwo $$3) {
        super(dis.v, $$0, $$1, $$2, djl.a($$3.aa()));
        this.z = $$3;
        this.A = $$3.aa().a(drb.b);
        this.B = $$3.aa().a(drb.c);
        this.C = $$3.aa().a(drb.d);
        this.a(this.D).a(0);
    }

    private static dio a(dqt $$0) {
        drb $$1 = $$0.a(drb.b);
        drb $$2 = $$0.a(drb.c);
        drb $$3 = $$0.a(drb.d);
        return dio.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
    }

    @Override
    protected boolean a(eoh $$0) {
        return $$0.a(dzs.oY);
    }

    @Override
    protected void a(ddm $$02, dlt $$12) {
        $$12.a($$02, $$12.N());
        this.t.a($$02, this.o());
        this.e(0);
        this.e(1);
        this.e(2);
        this.q.a((dwo $$0, is $$1) -> $$0.c(1044, (is)$$1, 0));
    }

    private List<dlt> o() {
        return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
    }

    private dro p() {
        return new dro(this.s.a(0), this.s.a(1), this.s.a(2));
    }

    private void e(int $$0) {
        dlt $$1 = this.s.a($$0);
        if (!$$1.f()) {
            $$1.h(1);
            this.s.a($$0, $$1);
        }
    }

    @Override
    public void a(ccv $$0) {
        super.a($$0);
        if (this.z instanceof axf) {
            boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
            this.D.a($$1 ? 1 : 0);
        }
    }

    @Override
    public void l() {
        Optional<dqx> $$3;
        dro $$0 = this.p();
        dwo dwo2 = this.z;
        if (dwo2 instanceof axf) {
            axf $$12 = (axf)dwo2;
            Optional<dqx<drn>> $$2 = $$12.x().a(drd.g, $$0, $$12);
        } else {
            $$3 = Optional.empty();
        }
        $$3.ifPresentOrElse($$1 -> {
            dlt $$2 = ((drn)$$1.b()).a($$0, this.z.J_());
            this.t.a((dqx<?>)$$1);
            this.t.a(0, $$2);
        }, () -> {
            this.t.a((dqx<?>)null);
            this.t.a(0, dlt.l);
        });
    }

    @Override
    public boolean a(dlt $$0, dji $$1) {
        return $$1.c != this.t && super.a($$0, $$1);
    }

    @Override
    public boolean b(dlt $$0) {
        if (this.B.a($$0) && !this.b(0).h()) {
            return true;
        }
        if (this.A.a($$0) && !this.b(1).h()) {
            return true;
        }
        return this.C.a($$0) && !this.b(2).h();
    }

    public boolean m() {
        return this.D.b() > 0;
    }
}
