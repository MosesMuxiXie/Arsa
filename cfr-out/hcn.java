/*
 * Decompiled with CFR 0.152.
 */
public class hcn
extends gzq<iez> {
    public hcn(hdg $$0) {
        super($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-3.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, new hdk(0.6f)), hdi.a(0.0f, 6.0f, -8.0f));
        $$1.a("body", hdl.c().a(28, 8).a(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f, new hdk(1.75f)), hdi.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        hdl $$2 = hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new hdk(0.5f));
        $$1.a("right_hind_leg", $$2, hdi.a(-3.0f, 12.0f, 7.0f));
        $$1.a("left_hind_leg", $$2, hdi.a(3.0f, 12.0f, 7.0f));
        $$1.a("right_front_leg", $$2, hdi.a(-3.0f, 12.0f, -5.0f));
        $$1.a("left_front_leg", $$2, hdi.a(3.0f, 12.0f, -5.0f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(iez $$0) {
        super.a($$0);
        this.b.c += $$0.a * 9.0f * $$0.aA;
        this.b.e = $$0.b;
    }
}

