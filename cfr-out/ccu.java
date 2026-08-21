/*
 * Decompiled with CFR 0.152.
 */
public class ccu
implements ccv {
    private final ccv b;
    private final ccv c;

    public ccu(ccv $$0, ccv $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public int b() {
        return this.b.b() + this.c.b();
    }

    @Override
    public boolean c() {
        return this.b.c() && this.c.c();
    }

    public boolean a(ccv $$0) {
        return this.b == $$0 || this.c == $$0;
    }

    @Override
    public dlt a(int $$0) {
        if ($$0 >= this.b.b()) {
            return this.c.a($$0 - this.b.b());
        }
        return this.b.a($$0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        if ($$0 >= this.b.b()) {
            return this.c.a($$0 - this.b.b(), $$1);
        }
        return this.b.a($$0, $$1);
    }

    @Override
    public dlt b(int $$0) {
        if ($$0 >= this.b.b()) {
            return this.c.b($$0 - this.b.b());
        }
        return this.b.b($$0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        if ($$0 >= this.b.b()) {
            this.c.a($$0 - this.b.b(), $$1);
        } else {
            this.b.a($$0, $$1);
        }
    }

    @Override
    public int ap_() {
        return this.b.ap_();
    }

    @Override
    public void e() {
        this.b.e();
        this.c.e();
    }

    @Override
    public boolean a(ddm $$0) {
        return this.b.a($$0) && this.c.a($$0);
    }

    @Override
    public void a(cgd $$0) {
        this.b.a($$0);
        this.c.a($$0);
    }

    @Override
    public void b(cgd $$0) {
        this.b.b($$0);
        this.c.b($$0);
    }

    @Override
    public boolean b(int $$0, dlt $$1) {
        if ($$0 >= this.b.b()) {
            return this.c.b($$0 - this.b.b(), $$1);
        }
        return this.b.b($$0, $$1);
    }

    @Override
    public void a() {
        this.b.a();
        this.c.a();
    }
}

