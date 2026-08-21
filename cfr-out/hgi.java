/*
 * Decompiled with CFR 0.152.
 */
public class hgi
extends gzp<Float> {
    private final hdg a;

    public hgi(hdg $$0) {
        super($$0, ijt::d);
        this.a = $$0.b("flag");
    }

    public static hdm a(boolean $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("flag", hdl.c().a(0, 0).a(-10.0f, 0.0f, -2.0f, 20.0f, 40.0f, 1.0f), hdi.a(0.0f, $$0 ? -44.0f : -20.5f, $$0 ? 0.0f : 10.5f));
        return hdm.a($$1, 64, 64);
    }

    @Override
    public void a(Float $$0) {
        super.a($$0);
        this.a.e = (-0.0125f + 0.01f * bgj.b((double)((float)Math.PI * 2 * $$0.floatValue()))) * (float)Math.PI;
    }
}

