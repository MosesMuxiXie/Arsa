/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 */
import org.joml.Quaternionf;

public class hgx
extends gzm<idc> {
    private static final String f = "outer_glass";
    private static final String g = "inner_glass";
    private static final String h = "base";
    private static final float i = (float)Math.sin(0.7853981633974483);
    public final hdg b;
    public final hdg c;
    public final hdg d;
    public final hdg e;

    public hgx(hdg $$0) {
        super($$0);
        this.b = $$0.b(h);
        this.c = $$0.b(f);
        this.d = this.c.b(g);
        this.e = this.d.b("cube");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = 0.875f;
        hdl $$3 = hdl.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        hdq $$4 = $$1.a(f, $$3, hdi.a(0.0f, 24.0f, 0.0f));
        hdq $$5 = $$4.a(g, $$3, hdi.a.a(0.875f));
        $$5.a("cube", hdl.c().a(32, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), hdi.a.a(0.765625f));
        $$1.a(h, hdl.c().a(0, 16).a(-6.0f, 0.0f, -6.0f, 12.0f, 4.0f, 12.0f), hdi.a);
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(idc $$0) {
        super.a($$0);
        this.b.k = $$0.a;
        float $$1 = $$0.L * 3.0f;
        float $$2 = hwk.a($$0.L) * 16.0f;
        this.c.c += $$2 / 2.0f;
        this.c.a(a.d.rotationDegrees($$1).rotateAxis(1.0471976f, i, 0.0f, i));
        this.d.a(new Quaternionf().setAngleAxis(1.0471976f, i, 0.0f, i).rotateY($$1 * ((float)Math.PI / 180)));
        this.e.a(new Quaternionf().setAngleAxis(1.0471976f, i, 0.0f, i).rotateY($$1 * ((float)Math.PI / 180)));
    }
}

