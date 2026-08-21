/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 */
import org.joml.Quaternionf;

public class hhr
extends hht {
    private static final String z = "cape";
    private final hdg A;

    public hhr(hdg $$0) {
        super($$0, false);
        this.A = this.j.b(z);
    }

    public static hdm e() {
        hdo $$0 = hht.a(hdk.a, false);
        hdq $$1 = $$0.a().a();
        hdq $$2 = $$1.b("body");
        $$2.a(z, hdl.c().a(0, 0).a(-5.0f, 0.0f, -1.0f, 10.0f, 16.0f, 1.0f, hdk.a, 1.0f, 0.5f), hdi.a(0.0f, 0.0f, 2.0f, 0.0f, (float)Math.PI, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ick $$0) {
        super.a($$0);
        this.A.a(new Quaternionf().rotateY((float)(-Math.PI)).rotateX((6.0f + $$0.c / 2.0f + $$0.b) * ((float)Math.PI / 180)).rotateZ($$0.d / 2.0f * ((float)Math.PI / 180)).rotateY((180.0f - $$0.d / 2.0f) * ((float)Math.PI / 180)));
    }
}

