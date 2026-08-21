/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.DoubleSupplier;
import org.jspecify.annotations.Nullable;

public class cuz
extends cup {
    private static final float cv = 42.16f;
    private static final double cw = 0.5;
    private static final double cx = 0.06666666666666667;
    private static final double cz = 9.0;
    private static final double cA = 1.0;
    private static final cgn cB = cgu.bX.n().a(cgm.a().a(cgl.a, 0.0f, cgu.bX.m() - 0.03125f, 0.0f)).a(0.5f);

    public cuz(cgu<? extends cuz> $$0, dwo $$1) {
        super((cgu<? extends cup>)$$0, $$1);
        this.a(fls.p, -1.0f);
        this.a(fls.q, -1.0f);
    }

    public static cir.a p() {
        return cuz.hx().a(cis.u, 25.0);
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        this.gz();
        return super.a($$0, $$1);
    }

    @Override
    public boolean i(double $$0) {
        return true;
    }

    @Override
    public boolean ho() {
        return this.do() instanceof chn;
    }

    @Override
    protected void a(bgr $$0) {
        this.h(cis.q).a(cuz.c($$0::j));
        this.h(cis.x).a(cuz.d($$0::j));
    }

    private static double c(DoubleSupplier $$0) {
        return 0.5 + $$0.getAsDouble() * 0.06666666666666667 + $$0.getAsDouble() * 0.06666666666666667 + $$0.getAsDouble() * 0.06666666666666667;
    }

    private static double d(DoubleSupplier $$0) {
        return (9.0 + $$0.getAsDouble() * 1.0 + $$0.getAsDouble() * 1.0 + $$0.getAsDouble() * 1.0) / (double)42.16f;
    }

    @Override
    protected bcz W() {
        return bda.GN;
    }

    @Override
    protected bcz fd() {
        return bda.GP;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.GR;
    }

    @Override
    protected bcz hw() {
        return bda.GO;
    }

    @Override
    protected bcz gV() {
        return bda.GQ;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return null;
    }

    @Override
    public boolean gY() {
        return false;
    }

    @Override
    protected void hp() {
        this.cs.a(0, new coh(this));
        this.cs.a(3, new cpy(this, 1.25, $$0 -> $$0.a(bdy.aK), false));
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dcn $$4;
        if ($$2 == cgt.a && ($$4 = cgu.bW.a(this.ao(), cgt.g)) != null) {
            $$4.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
            $$4.a($$0, $$1, $$2, null);
            $$4.a(cgv.a, new dlt(dlx.xL));
            $$4.a((cgk)this, false, false);
        }
        return super.a($$0, $$1, $$2, $$3);
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
    public boolean e(cgv $$0) {
        return true;
    }

    @Override
    public boolean aj_() {
        return this.hn() || !this.ho();
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aK);
    }

    @Override
    protected cgv Y() {
        return cgv.g;
    }

    @Override
    public ftm[] A() {
        return chj.a(this, 0.04, 0.41, 0.18, 0.73);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cB : super.b($$0);
    }

    @Override
    public float gK() {
        return 1.4f;
    }
}

