/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cur
extends cup {
    private static final alw<Integer> cv = ama.a(cur.class, aly.b);
    private static final cgn cw = cgu.aq.n().a(cgm.a().a(cgl.a, 0.0f, cgu.aq.m() + 0.125f, 0.0f)).a(0.5f);
    private static final int cx = 0;

    public cur(cgu<? extends cur> $$0, dwo $$1) {
        super((cgu<? extends cup>)$$0, $$1);
        this.a(fls.p, -1.0f);
        this.a(fls.q, -1.0f);
    }

    @Override
    protected void a(bgr $$0) {
        this.h(cis.u).a(cur.a($$0::a));
        this.h(cis.x).a(cur.b($$0::j));
        this.h(cis.q).a(cur.a($$0::j));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, 0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Variant", this.gQ());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.w($$0.a("Variant", 0));
    }

    private void w(int $$0) {
        this.az.a(cv, $$0);
    }

    private int gQ() {
        return this.az.a(cv);
    }

    private void a(cuy $$0, cut $$1) {
        this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
    }

    public cuy p() {
        return cuy.a(this.gQ() & 0xFF);
    }

    private void a(cuy $$0) {
        this.w($$0.a() & 0xFF | this.gQ() & 0xFFFFFF00);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aT) {
            return cur.c($$0, this.p());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aT);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aT) {
            this.a(cur.c(ki.aT, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    public cut gP() {
        return cut.a((this.gQ() & 0xFF00) >> 8);
    }

    @Override
    protected void a(ehs $$0) {
        super.a($$0);
        if (this.as.a(10) == 0) {
            this.a(bda.oI, $$0.a() * 0.6f, $$0.b());
        }
    }

    @Override
    protected bcz W() {
        return bda.oE;
    }

    @Override
    protected bcz fd() {
        return bda.oJ;
    }

    @Override
    protected bcz gV() {
        return bda.oK;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.oM;
    }

    @Override
    protected bcz hw() {
        return bda.oF;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        boolean $$2;
        boolean bl2 = $$2 = !this.e_() && this.hn() && $$0.gA();
        if (this.cr() || $$2) {
            return super.b($$0, $$1);
        }
        dlt $$3 = $$0.b($$1);
        if (!$$3.f()) {
            if (this.j($$3)) {
                return this.c($$0, $$3);
            }
            if (!this.hn()) {
                this.hD();
                return cdc.a;
            }
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean a(cth $$0) {
        if ($$0 == this) {
            return false;
        }
        if ($$0 instanceof cuq || $$0 instanceof cur) {
            return this.hF() && ((cup)$$0).hF();
        }
        return false;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        if ($$1 instanceof cuq) {
            cuu $$2 = cgu.aL.a($$0, cgt.e);
            if ($$2 != null) {
                this.a($$1, $$2);
            }
            return $$2;
        }
        cur $$3 = (cur)$$1;
        cur $$4 = cgu.aq.a($$0, cgt.e);
        if ($$4 != null) {
            cut $$12;
            cuy $$8;
            int $$5 = this.as.a(9);
            if ($$5 < 4) {
                cuy $$6 = this.p();
            } else if ($$5 < 8) {
                cuy $$7 = $$3.p();
            } else {
                $$8 = bhs.a(cuy.values(), this.as);
            }
            int $$9 = this.as.a(5);
            if ($$9 < 2) {
                cut $$10 = this.gP();
            } else if ($$9 < 4) {
                cut $$11 = $$3.gP();
            } else {
                $$12 = bhs.a(cut.values(), this.as);
            }
            $$4.a($$8, $$12);
            this.a($$1, $$4);
        }
        return $$4;
    }

    @Override
    public boolean e(cgv $$0) {
        return true;
    }

    @Override
    protected void c(cex $$0, float $$1) {
        this.a($$0, $$1, cgv.g);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        cuy $$6;
        bgr $$4 = $$0.G_();
        if ($$3 instanceof a) {
            cuy $$5 = ((a)$$3).a;
        } else {
            $$6 = bhs.a(cuy.values(), $$4);
            $$3 = new a($$6);
        }
        this.a($$6, bhs.a(cut.values(), $$4));
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cw : super.b($$0);
    }

    public static class a
    extends cfy.a {
        public final cuy a;

        public a(cuy $$0) {
            super(true);
            this.a = $$0;
        }
    }
}

