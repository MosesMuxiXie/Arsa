/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class czb
extends cyz {
    private static final alw<iz> b = ama.a(czb.class, aly.q);
    private static final iz c = iz.d;

    protected czb(cgu<? extends czb> $$0, dwo $$1) {
        super((cgu<? extends cyz>)$$0, $$1);
    }

    protected czb(cgu<? extends czb> $$0, dwo $$1, is $$2) {
        this($$0, $$1);
        this.a = $$2;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(b, c);
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if ($$0.equals(b)) {
            this.b(this.dg());
        }
    }

    @Override
    public iz dg() {
        return this.az.a(b);
    }

    protected void a(iz $$0) {
        this.az.a(b, $$0);
    }

    protected void b(iz $$0) {
        Objects.requireNonNull($$0);
        Validate.isTrue((boolean)$$0.o().d());
        this.a($$0);
        this.v($$0.e() * 90);
        this.ab = this.ec();
        this.e();
    }

    @Override
    protected void e() {
        if (this.dg() == null) {
            return;
        }
        fth $$0 = this.a(this.a, this.dg());
        ftm $$1 = $$0.f();
        this.n($$1.g, $$1.h, $$1.i);
        this.a($$0);
    }

    protected abstract fth a(is var1, iz var2);

    @Override
    public boolean f() {
        if (this.b(this.u())) {
            return false;
        }
        boolean $$02 = is.b(this.s()).allMatch($$0 -> {
            eoh $$1 = this.ao().a_((is)$$0);
            return $$1.e() || ebv.n($$1);
        });
        return $$02 && this.a(false);
    }

    protected fth s() {
        return this.dj().a(this.dg().m().mul(-0.5f)).h(1.0E-7);
    }

    protected boolean a(boolean $$0) {
        Predicate<czb> $$12 = $$1 -> {
            boolean $$2 = !$$0 && $$1.ay() == this.ay();
            boolean $$3 = $$1.dg() == this.dg();
            return $$1 != this && ($$2 || $$3);
        };
        return !this.ao().b(esw.a(czb.class), this.u(), $$12);
    }

    protected boolean b(fth $$0) {
        dwo $$1 = this.ao();
        return !$$1.b(this, $$0) || !$$1.d(this, $$0);
    }

    protected fth u() {
        return this.dj();
    }

    public abstract void v();

    @Override
    public czl a(axf $$0, dlt $$1, float $$2) {
        czl $$3 = new czl(this.ao(), this.dP() + (double)((float)this.dg().j() * 0.15f), this.dR() + (double)$$2, this.dV() + (double)((float)this.dg().l() * 0.15f), $$1);
        $$3.i();
        this.ao().b($$3);
        return $$3;
    }

    @Override
    public float a(egm $$0) {
        iz $$1 = this.dg();
        if ($$1.o() != iz.a.b) {
            switch ($$0) {
                case c: {
                    $$1 = $$1.g();
                    break;
                }
                case d: {
                    $$1 = $$1.i();
                    break;
                }
                case b: {
                    $$1 = $$1.h();
                    break;
                }
            }
            this.b($$1);
        }
        float $$2 = bgj.f(this.ec());
        return switch ($$0) {
            case egm.c -> $$2 + 180.0f;
            case egm.d -> $$2 + 90.0f;
            case egm.b -> $$2 + 270.0f;
            default -> $$2;
        };
    }

    @Override
    public float a(eev $$0) {
        return this.a($$0.a(this.dg()));
    }
}

