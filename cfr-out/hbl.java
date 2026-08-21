/*
 * Decompiled with CFR 0.152.
 */
public class hbl
extends gzm<idt> {
    private static final float b = 14.0f;
    private final hdg c;

    public hbl(hdg $$0) {
        super($$0);
        this.c = $$0.b("goggles");
    }

    public static hdm a(boolean $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("harness", hdl.c().a(0, 0).a(-8.0f, -16.0f, -8.0f, 16.0f, 16.0f, 16.0f), hdi.a(0.0f, 24.0f, 0.0f));
        $$2.a("goggles", hdl.c().a(0, 32).a(-8.0f, -2.5f, -2.5f, 16.0f, 5.0f, 5.0f, new hdk(0.15f)), hdi.a(0.0f, 14.0f, -5.5f));
        return hdm.a($$1, 64, 64).a(hdp.scaling(4.0f)).a($$0 ? hbm.b : hdp.a);
    }

    @Override
    public void a(idt $$0) {
        super.a($$0);
        if ($$0.b) {
            this.c.e = 0.0f;
            this.c.c = 14.0f;
        } else {
            this.c.e = -0.7854f;
            this.c.c = 9.0f;
        }
    }
}

