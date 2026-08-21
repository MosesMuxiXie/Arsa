/*
 * Decompiled with CFR 0.152.
 */
public class hhk
extends hhm {
    private final hdg a;
    private final hdg b;
    private final hdg c;

    public hhk(hdg $$0) {
        super($$0);
        this.a = $$0.b("head");
        this.b = this.a.b("left_ear");
        this.c = this.a.b("right_ear");
    }

    public static hdo a() {
        hdo $$0 = new hdo();
        hew.a(hdk.a, $$0);
        return $$0;
    }

    @Override
    public void a(hhm.a $$0) {
        super.a($$0);
        this.a.f = $$0.b * ((float)Math.PI / 180);
        this.a.e = $$0.c * ((float)Math.PI / 180);
        float $$1 = 1.2f;
        this.b.g = (float)(-(Math.cos($$0.a * (float)Math.PI * 0.2f * 1.2f) + 2.5)) * 0.2f;
        this.c.g = (float)(Math.cos($$0.a * (float)Math.PI * 0.2f) + 2.5) * 0.2f;
    }
}

