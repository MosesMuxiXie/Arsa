/*
 * Decompiled with CFR 0.152.
 */
public class hhj
extends hhm {
    private final hdg a;
    private final hdg b;

    public hhj(hdg $$0) {
        super($$0);
        this.a = $$0.b("head");
        this.b = this.a.b("jaw");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = -16.0f;
        hdq $$3 = $$1.a("head", hdl.c().a("upper_lip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 176, 44).a("upper_head", -8.0f, -8.0f, -10.0f, 16, 16, 16, 112, 30).a(true).a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0).a(false).a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0), hdi.a(0.0f, -7.986666f, 0.0f).b(0.75f));
        $$3.a("jaw", hdl.c().a(176, 65).a("jaw", -6.0f, 0.0f, -16.0f, 12.0f, 4.0f, 16.0f), hdi.a(0.0f, 4.0f, -8.0f));
        return hdm.a($$0, 256, 256);
    }

    @Override
    public void a(hhm.a $$0) {
        super.a($$0);
        this.b.e = (float)(Math.sin($$0.a * (float)Math.PI * 0.2f) + 1.0) * 0.2f;
        this.a.f = $$0.b * ((float)Math.PI / 180);
        this.a.e = $$0.c * ((float)Math.PI / 180);
    }
}

