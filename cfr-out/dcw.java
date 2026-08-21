/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public abstract class dcw
extends cfy
implements dct,
dcu,
dvk {
    private static final alw<Integer> cx = ama.a(dcw.class, aly.b);
    public static final int cv = 300;
    private static final int cy = 8;
    private @Nullable ddm cz;
    protected @Nullable dvm cw;
    private final cdk cA = new cdk(8);

    public dcw(cgu<? extends dcw> $$0, dwo $$1) {
        super((cgu<? extends cfy>)$$0, $$1);
        this.a(fls.n, 16.0f);
        this.a(fls.o, -1.0f);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$3 == null) {
            $$3 = new cfy.a(false);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public int p() {
        return this.az.a(cx);
    }

    public void r(int $$0) {
        this.az.a(cx, $$0);
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cx, 0);
    }

    @Override
    public void a(@Nullable ddm $$0) {
        this.cz = $$0;
    }

    @Override
    public @Nullable ddm a() {
        return this.cz;
    }

    public boolean gQ() {
        return this.cz != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public dvm b() {
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            throw new IllegalStateException("Cannot load Villager offers on the client");
        }
        axf $$0 = (axf)dwo2;
        if (this.cw == null) {
            void $$1;
            this.cw = new dvm();
            this.h((axf)$$1);
        }
        return this.cw;
    }

    @Override
    public void a(@Nullable dvm $$0) {
    }

    @Override
    public void a(int $$0) {
    }

    @Override
    public void a(dvl $$0) {
        $$0.l();
        this.cm = -this.S();
        this.b($$0);
        if (this.cz instanceof axg) {
            aj.t.a((axg)this.cz, this, $$0.f());
        }
    }

    protected abstract void b(dvl var1);

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void a(dlt $$0) {
        if (!this.ao().B_() && this.cm > -this.S() + 20) {
            this.cm = -this.S();
            this.b(this.x(!$$0.f()));
        }
    }

    @Override
    public bcz f() {
        return bda.Eq;
    }

    protected bcz x(boolean $$0) {
        return $$0 ? bda.Eq : bda.Eo;
    }

    public void gR() {
        this.b(bda.El);
    }

    @Override
    protected void a(fns $$0) {
        dvm $$1;
        super.a($$0);
        if (!this.ao().B_() && !($$1 = this.b()).isEmpty()) {
            $$0.a("Offers", dvm.a, $$1);
        }
        this.a_($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.cw = $$0.a("Offers", dvm.a).orElse(null);
        this.a_($$0);
    }

    @Override
    public @Nullable cgk b(fmb $$0) {
        this.gS();
        return super.b($$0);
    }

    protected void gS() {
        this.a((ddm)null);
    }

    @Override
    public void a(cex $$0) {
        super.a($$0);
        this.gS();
    }

    protected void a(lw $$0) {
        for (int $$1 = 0; $$1 < 5; ++$$1) {
            double $$2 = this.as.k() * 0.02;
            double $$3 = this.as.k() * 0.02;
            double $$4 = this.as.k() * 0.02;
            this.ao().a($$0, this.e(1.0), this.dS() + 1.0, this.h(1.0), $$2, $$3, $$4);
        }
    }

    @Override
    public boolean aj_() {
        return false;
    }

    @Override
    public cdk gP() {
        return this.cA;
    }

    @Override
    public @Nullable cic a_(int $$0) {
        int $$1 = $$0 - 300;
        if ($$1 >= 0 && $$1 < this.cA.b()) {
            return this.cA.a_($$1);
        }
        return super.a_($$0);
    }

    protected abstract void h(axf var1);

    protected void a(axf $$0, dvm $$1, ddb.g[] $$2, int $$3) {
        ArrayList $$4 = Lists.newArrayList((Object[])$$2);
        int $$5 = 0;
        while ($$5 < $$3 && !$$4.isEmpty()) {
            dvl $$6 = ((ddb.g)$$4.remove(this.as.a($$4.size()))).a($$0, this, this.as);
            if ($$6 == null) continue;
            $$1.add($$6);
            ++$$5;
        }
    }

    @Override
    public ftm u(float $$0) {
        float $$1 = bgj.h($$0, this.bD, this.bC) * ((float)Math.PI / 180);
        ftm $$2 = new ftm(0.0, this.dj().c() - 1.0, 0.2);
        return this.p($$0).e($$2.b(-$$1));
    }

    @Override
    public boolean c() {
        return this.ao().B_();
    }

    @Override
    public boolean b(ddm $$0) {
        return this.a() == $$0 && this.cb() && $$0.b((cgk)this, 4.0);
    }
}

