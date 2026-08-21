/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class gzu
extends gzm<icf>
implements gzk<icf> {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private static final float h = 0.7853982f;
    private static final float i = -1.134464f;
    private static final float j = -1.0471976f;

    public gzu(hdg $$0) {
        super($$0.b("root"), ijt::j);
        this.b = this.o.b("head");
        this.c = this.o.b("body");
        this.d = this.c.b("right_arm");
        this.e = this.c.b("left_arm");
        this.f = this.c.b("right_wing");
        this.g = this.c.b("left_wing");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(0.0f, 23.5f, 0.0f));
        $$2.a("head", hdl.c().a(0, 0).a(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f, new hdk(0.0f)), hdi.a(0.0f, -3.99f, 0.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(0, 10).a(-1.5f, 0.0f, -1.0f, 3.0f, 4.0f, 2.0f, new hdk(0.0f)).a(0, 16).a(-1.5f, 0.0f, -1.0f, 3.0f, 5.0f, 2.0f, new hdk(-0.2f)), hdi.a(0.0f, -4.0f, 0.0f));
        $$3.a("right_arm", hdl.c().a(23, 0).a(-0.75f, -0.5f, -1.0f, 1.0f, 4.0f, 2.0f, new hdk(-0.01f)), hdi.a(-1.75f, 0.5f, 0.0f));
        $$3.a("left_arm", hdl.c().a(23, 6).a(-0.25f, -0.5f, -1.0f, 1.0f, 4.0f, 2.0f, new hdk(-0.01f)), hdi.a(1.75f, 0.5f, 0.0f));
        $$3.a("right_wing", hdl.c().a(16, 14).a(0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 8.0f, new hdk(0.0f)), hdi.a(-0.5f, 0.0f, 0.6f));
        $$3.a("left_wing", hdl.c().a(16, 14).a(0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 8.0f, new hdk(0.0f)), hdi.a(0.5f, 0.0f, 0.6f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(icf $$0) {
        super.a($$0);
        float $$1 = $$0.ay;
        float $$2 = $$0.ax;
        float $$3 = $$0.L * 20.0f * ((float)Math.PI / 180) + $$2;
        float $$4 = bgj.b((double)$$3) * (float)Math.PI * 0.15f + $$1;
        float $$5 = $$0.L * 9.0f * ((float)Math.PI / 180);
        float $$6 = Math.min($$1 / 0.3f, 1.0f);
        float $$7 = 1.0f - $$6;
        float $$8 = $$0.d;
        if ($$0.a) {
            float $$9 = $$0.L * 8.0f * ((float)Math.PI / 180) + $$1;
            float $$10 = bgj.b((double)$$9) * 16.0f * ((float)Math.PI / 180);
            float $$11 = $$0.c;
            float $$12 = bgj.b((double)$$9) * 14.0f * ((float)Math.PI / 180);
            float $$13 = bgj.b((double)$$9) * 30.0f * ((float)Math.PI / 180);
            this.o.f = $$0.b ? (float)Math.PI * 4 * $$11 : this.o.f;
            this.o.g = $$10 * (1.0f - $$11);
            this.b.f = $$13 * (1.0f - $$11);
            this.b.g = $$12 * (1.0f - $$11);
        } else {
            this.b.e = $$0.av * ((float)Math.PI / 180);
            this.b.f = $$0.au * ((float)Math.PI / 180);
        }
        this.f.e = 0.43633232f * (1.0f - $$6);
        this.f.f = -0.7853982f + $$4;
        this.g.e = 0.43633232f * (1.0f - $$6);
        this.g.f = 0.7853982f - $$4;
        this.c.e = $$6 * 0.7853982f;
        float $$14 = $$8 * bgj.h($$6, -1.0471976f, -1.134464f);
        this.o.c += (float)Math.cos($$5) * 0.25f * $$7;
        this.d.e = $$14;
        this.e.e = $$14;
        float $$15 = $$7 * (1.0f - $$8);
        float $$16 = 0.43633232f - bgj.b((double)($$5 + 4.712389f)) * (float)Math.PI * 0.075f * $$15;
        this.e.g = -$$16;
        this.d.g = $$16;
        this.d.f = 0.27925268f * $$8;
        this.e.f = -0.27925268f * $$8;
    }

    @Override
    public void a(icf $$0, chb $$1, fzm $$2) {
        float $$3 = 1.0f;
        float $$4 = 3.0f;
        this.o.a($$2);
        this.c.a($$2);
        $$2.a(0.0f, 0.0625f, 0.1875f);
        $$2.a((Quaternionfc)a.b.rotation(this.d.e));
        $$2.b(0.7f, 0.7f, 0.7f);
        $$2.a(0.0625f, 0.0f, 0.0f);
    }
}

