/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class cnx
extends coe {
    private static final int g = 240;
    private final Predicate<ccz> h;
    protected int a;
    protected int b = -1;
    protected int c = -1;

    public cnx(chn $$0, Predicate<ccz> $$1) {
        super($$0);
        this.h = $$1;
    }

    public cnx(chn $$0, int $$1, Predicate<ccz> $$2) {
        this($$0, $$2);
        this.c = $$1;
    }

    protected int f() {
        return Math.max(240, this.c);
    }

    @Override
    public boolean b() {
        if (!super.b()) {
            return false;
        }
        if (!cnx.a(this.d).U().a(eua.F).booleanValue()) {
            return false;
        }
        return this.a(this.d.ao().av()) && !this.h();
    }

    @Override
    public void d() {
        super.d();
        this.a = 0;
    }

    @Override
    public boolean c() {
        return this.a <= this.f() && !this.h() && this.e.a(this.d.dI(), 2.0) && this.a(this.d.ao().av());
    }

    @Override
    public void e() {
        super.e();
        this.d.ao().a(this.d.aA(), this.e, -1);
    }

    @Override
    public void a() {
        super.a();
        if (this.d.ep().a(20) == 0) {
            this.d.ao().c(1019, this.e, 0);
            if (!this.d.bp) {
                this.d.a(this.d.ga());
            }
        }
        ++this.a;
        int $$0 = (int)((float)this.a / (float)this.f() * 10.0f);
        if ($$0 != this.b) {
            this.d.ao().a(this.d.aA(), this.e, $$0);
            this.b = $$0;
        }
        if (this.a == this.f() && this.a(this.d.ao().av())) {
            this.d.ao().a(this.e, false);
            this.d.ao().c(1021, this.e, 0);
            this.d.ao().c(2001, this.e, dzq.j(this.d.ao().a_(this.e)));
        }
    }

    private boolean a(ccz $$0) {
        return this.h.test($$0);
    }
}

