/*
 * Decompiled with CFR 0.152.
 */
public interface fuy
extends ccv {
    public dlt g();

    default public dlt d(int $$0) {
        return this.g().a($$0);
    }

    public void b(dlt var1);

    default public dlt i() {
        return this.d(this.ap_());
    }

    @Override
    default public int b() {
        return 1;
    }

    @Override
    default public boolean c() {
        return this.g().f();
    }

    @Override
    default public void a() {
        this.i();
    }

    @Override
    default public dlt b(int $$0) {
        return this.a($$0, this.ap_());
    }

    @Override
    default public dlt a(int $$0) {
        return $$0 == 0 ? this.g() : dlt.l;
    }

    @Override
    default public dlt a(int $$0, int $$1) {
        if ($$0 != 0) {
            return dlt.l;
        }
        return this.d($$1);
    }

    @Override
    default public void a(int $$0, dlt $$1) {
        if ($$0 == 0) {
            this.b($$1);
        }
    }

    public static interface a
    extends fuy {
        public elb w();

        @Override
        default public boolean a(ddm $$0) {
            return ccv.a(this.w(), $$0);
        }
    }
}

