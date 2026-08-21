/*
 * Decompiled with CFR 0.152.
 */
public class hfp
extends gzm<ifq>
implements gzk<ifq> {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;

    public hfp(hdg $$0) {
        super($$0.b("root"), ijt::j);
        this.b = this.o.b("body");
        this.c = this.b.b("right_arm");
        this.d = this.b.b("left_arm");
        this.e = this.b.b("right_wing");
        this.f = this.b.b("left_wing");
        this.g = this.o.b("head");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(0.0f, -2.5f, 0.0f));
        $$2.a("head", hdl.c().a(0, 0).a(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f, new hdk(0.0f)), hdi.a(0.0f, 20.0f, 0.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(0, 10).a(-1.5f, 0.0f, -1.0f, 3.0f, 4.0f, 2.0f, new hdk(0.0f)).a(0, 16).a(-1.5f, 1.0f, -1.0f, 3.0f, 5.0f, 2.0f, new hdk(-0.2f)), hdi.a(0.0f, 20.0f, 0.0f));
        $$3.a("right_arm", hdl.c().a(23, 0).a(-1.25f, -0.5f, -1.0f, 2.0f, 4.0f, 2.0f, new hdk(-0.1f)), hdi.a(-1.75f, 0.25f, 0.0f));
        $$3.a("left_arm", hdl.c().a(23, 6).a(-0.75f, -0.5f, -1.0f, 2.0f, 4.0f, 2.0f, new hdk(-0.1f)), hdi.a(1.75f, 0.25f, 0.0f));
        $$3.a("left_wing", hdl.c().a(16, 14).a().a(0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 8.0f, new hdk(0.0f)).a(false), hdi.a(0.5f, 1.0f, 1.0f));
        $$3.a("right_wing", hdl.c().a(16, 14).a(0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 8.0f, new hdk(0.0f)), hdi.a(-0.5f, 1.0f, 1.0f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(ifq $$0) {
        super.a($$0);
        this.g.f = $$0.au * ((float)Math.PI / 180);
        this.g.e = $$0.av * ((float)Math.PI / 180);
        float $$1 = bgj.b((double)($$0.L * 5.5f * ((float)Math.PI / 180))) * 0.1f;
        this.c.g = 0.62831855f + $$1;
        this.d.g = -(0.62831855f + $$1);
        if ($$0.a) {
            this.b.e = 0.0f;
            this.a(!$$0.g.e(), !$$0.j.e(), $$1);
        } else {
            this.b.e = 0.15707964f;
        }
        this.f.f = 1.0995574f + bgj.b((double)($$0.L * 45.836624f * ((float)Math.PI / 180))) * ((float)Math.PI / 180) * 16.2f;
        this.e.f = -this.f.f;
        this.f.e = 0.47123888f;
        this.f.g = -0.47123888f;
        this.e.e = 0.47123888f;
        this.e.g = 0.47123888f;
    }

    private void a(boolean $$0, boolean $$1, float $$2) {
        if (!$$0 && !$$1) {
            this.c.e = -1.2217305f;
            this.c.f = 0.2617994f;
            this.c.g = -0.47123888f - $$2;
            this.d.e = -1.2217305f;
            this.d.f = -0.2617994f;
            this.d.g = 0.47123888f + $$2;
            return;
        }
        if ($$0) {
            this.c.e = 3.6651914f;
            this.c.f = 0.2617994f;
            this.c.g = -0.47123888f - $$2;
        }
        if ($$1) {
            this.d.e = 3.6651914f;
            this.d.f = -0.2617994f;
            this.d.g = 0.47123888f + $$2;
        }
    }

    @Override
    public void a(ifq $$0, chb $$1, fzm $$2) {
        boolean $$3 = $$1 == chb.b;
        hdg $$4 = $$3 ? this.c : this.d;
        this.o.a($$2);
        this.b.a($$2);
        $$4.a($$2);
        $$2.b(0.55f, 0.55f, 0.55f);
        this.a($$2, $$3);
    }

    private void a(fzm $$0, boolean $$1) {
        if ($$1) {
            $$0.a(0.046875, -0.15625, 0.078125);
        } else {
            $$0.a(-0.046875, -0.15625, 0.078125);
        }
    }
}

