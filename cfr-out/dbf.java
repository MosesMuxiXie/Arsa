/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dbf
extends dba {
    private static final String a = "Johnny";
    static final Predicate<ccz> b = $$0 -> $$0 == ccz.c || $$0 == ccz.d;
    private static final boolean e = false;
    boolean f = false;

    public dbf(cgu<? extends dbf> $$0, dwo $$1) {
        super((cgu<? extends dba>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cnu<dat>(this, dat.class, 8.0f, 1.0, 1.2));
        this.cs.a(2, new a(this));
        this.cs.a(3, new dba.b(this));
        this.cs.a(4, new dfi.a(this, 10.0f));
        this.cs.a(5, new coz(this, 1.0, false));
        this.ct.a(1, new cqi(this, dfi.class).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
        this.ct.a(3, new cqj<dcw>((chn)this, dcw.class, true));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, true));
        this.ct.a(4, new b(this));
        this.cs.a(8, new cpm(this, 0.6));
        this.cs.a(9, new cox(this, ddm.class, 3.0f, 1.0f));
        this.cs.a(10, new cox(this, chn.class, 8.0f));
    }

    @Override
    protected void a(axf $$0) {
        if (!this.gG() && csp.a(this)) {
            boolean $$1 = $$0.g(this.dK());
            this.N().e($$1);
        }
        super.a($$0);
    }

    public static cir.a gP() {
        return czz.gW().a(cis.x, 0.35f).a(cis.o, 12.0).a(cis.u, 24.0).a(cis.d, 5.0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (this.f) {
            $$0.a(a, true);
        }
    }

    @Override
    public dba.a gY() {
        if (this.gI()) {
            return dba.a.b;
        }
        if (this.hj()) {
            return dba.a.g;
        }
        return dba.a.a;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a(a, false);
    }

    @Override
    public bcz gX() {
        return bda.EF;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        cie $$4 = super.a($$0, $$1, $$2, $$3);
        this.N().e(true);
        bgr $$5 = $$0.G_();
        this.a($$5, $$1);
        this.a($$0, $$5, $$1);
        return $$4;
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        if (this.he() == null) {
            this.a(cgv.a, new dlt(dlx.qK));
        }
    }

    @Override
    public void b(@Nullable yh $$0) {
        super.b($$0);
        if (!this.f && $$0 != null && $$0.getString().equals(a)) {
            this.f = true;
        }
    }

    @Override
    protected bcz W() {
        return bda.EE;
    }

    @Override
    protected bcz fd() {
        return bda.EG;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.EH;
    }

    @Override
    public void a(axf $$0, int $$1, boolean $$2) {
        boolean $$5;
        dlt $$3 = new dlt(dlx.qK);
        dfh $$4 = this.he();
        boolean bl2 = $$5 = this.as.i() <= $$4.s();
        if ($$5) {
            amt<dtz> $$6 = $$1 > $$4.a(ccz.c) ? duf.f : duf.e;
            dsq.a($$3, $$0.J_(), $$6, $$0.c(this.dK()), this.as);
        }
        this.a(cgv.a, $$3);
    }

    static class a
    extends cnx {
        public a(chn $$0) {
            super($$0, 6, b);
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean c() {
            dbf $$0 = (dbf)this.d;
            return $$0.hh() && super.c();
        }

        @Override
        public boolean b() {
            dbf $$0 = (dbf)this.d;
            return $$0.hh() && $$0.as.a(dbf$a.b(10)) == 0 && super.b();
        }

        @Override
        public void d() {
            super.d();
            this.d.n(0);
        }
    }

    static class b
    extends cqj<chl> {
        public b(dbf $$02) {
            super($$02, chl.class, 0, true, true, ($$0, $$1) -> $$0.gm());
        }

        @Override
        public boolean b() {
            return ((dbf)this.e).f && super.b();
        }

        @Override
        public void d() {
            super.d();
            this.e.n(0);
        }
    }
}

