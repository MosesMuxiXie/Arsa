/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dcm
extends dcn {
    public dcm(cgu<? extends dcm> $$0, dwo $$1) {
        super((cgu<? extends dcn>)$$0, $$1);
    }

    @Override
    protected boolean af_() {
        return false;
    }

    @Override
    protected bcz W() {
        return bda.oY;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.pb;
    }

    @Override
    protected bcz fd() {
        return bda.pa;
    }

    @Override
    protected bcz gP() {
        return bda.pc;
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        boolean $$2 = super.c($$0, $$1);
        if ($$2 && this.fx().f() && $$1 instanceof chl) {
            float $$3 = $$0.c(this.dK()).b();
            ((chl)$$1).b(new cfm(cfo.q, 140 * (int)$$3), (cgk)this);
        }
        return $$2;
    }

    @Override
    protected boolean gR() {
        return true;
    }

    @Override
    protected void h(axf $$0) {
        this.a($$0, cgu.bW);
        if (!this.bq()) {
            $$0.a(null, 1041, this.dK(), 0);
        }
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        $$3 = super.a($$0, $$1, $$2, $$3);
        float $$5 = $$1.d();
        if ($$2 != cgt.i) {
            this.b_($$4.i() < 0.55f * $$5);
        }
        if ($$3 != null) {
            $$3 = new a((dcn.b)$$3);
            boolean bl2 = ((a)$$3).a = $$2 != cgt.a;
        }
        if ($$3 instanceof a) {
            is $$7;
            a $$6 = (a)$$3;
            if (!$$6.a && $$0.b(cgu.w.a((double)($$7 = this.dK()).u() + 0.5, $$7.v(), (double)$$7.w() + 0.5))) {
                $$6.a = true;
                if ($$4.i() < 0.1f) {
                    this.a(cgv.a, new dlt(dlx.xL));
                    cua $$8 = cgu.w.a(this.ao(), cgt.a);
                    if ($$8 != null) {
                        $$8.a_(this.dP(), this.dR(), this.dV());
                        $$8.a($$0, $$1, $$2, null);
                        this.a((cgk)$$8, true, true);
                        $$0.b($$8);
                        dbx $$9 = cgu.aV.a(this.ao(), cgt.a);
                        if ($$9 != null) {
                            $$9.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
                            $$9.a($$0, $$1, $$2, null);
                            $$9.a((cgk)$$8, false, false);
                            $$0.a_($$9);
                        }
                    }
                }
            }
        }
        return $$3;
    }

    public static class a
    extends dcn.b {
        public boolean a = false;

        public a(dcn.b $$0) {
            super($$0.b, $$0.c);
        }
    }
}

