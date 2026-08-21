/*
 * Decompiled with CFR 0.152.
 */
public interface dct {
    public static final String r_ = "Inventory";

    public cdk gP();

    public static void a(axf $$0, chn $$1, dct $$2, czl $$3) {
        dlt $$4 = $$3.e();
        if ($$1.c($$0, $$4)) {
            cdk $$5 = $$2.gP();
            boolean $$6 = $$5.c($$4);
            if (!$$6) {
                return;
            }
            $$1.a($$3);
            int $$7 = $$4.N();
            dlt $$8 = $$5.b($$4);
            $$1.a((cgk)$$3, $$7 - $$8.N());
            if ($$8.f()) {
                $$3.aC();
            } else {
                $$4.e($$8.N());
            }
        }
    }

    default public void a_(fnq $$02) {
        $$02.b(r_, dlt.b).ifPresent($$0 -> this.gP().a((fnq.a<dlt>)$$0));
    }

    default public void a_(fns $$0) {
        this.gP().a($$0.a(r_, dlt.b));
    }
}

