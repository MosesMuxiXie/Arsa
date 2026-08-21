/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.util.Set;
import org.joml.Quaternionfc;

public class hbq
extends gzm<icv>
implements gzk<icv>,
gzn {
    private static final float b = 2.0f;
    private static final float c = 2.5f;
    private static final float d = 0.015f;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final ggb i;
    private final ggb j;
    private final ggb k;
    private final ggb l;
    private final ggb m;
    private final ggb n;
    private final ggb q;

    public hbq(hdg $$0) {
        super($$0);
        this.f = $$0.b("body");
        this.e = this.f.b("head");
        this.g = this.f.b("right_arm");
        this.h = this.f.b("left_arm");
        this.i = ggh.a.a($$0);
        this.j = ggh.c.a($$0);
        this.k = ggh.b.a($$0);
        this.l = ggh.f.a($$0);
        this.m = ggh.g.a($$0);
        this.n = ggh.d.a($$0);
        this.q = ggh.e.a($$0);
    }

    public static hdm e() {
        hdo $$02 = new hdo().a($$0 -> $$0.c(0.0f, 24.0f, 0.0f));
        hdq $$1 = $$02.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 15).a(-4.0f, -6.0f, -3.0f, 8.0f, 6.0f, 6.0f, hdk.a), hdi.a(0.0f, -5.0f, 0.0f));
        $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -5.0f, -5.0f, 8.0f, 5.0f, 10.0f, new hdk(0.015f)).a(56, 0).a(-1.0f, -2.0f, -6.0f, 2.0f, 3.0f, 2.0f, hdk.a).a(37, 8).a(-1.0f, -9.0f, -1.0f, 2.0f, 4.0f, 2.0f, new hdk(-0.015f)).a(37, 0).a(-2.0f, -13.0f, -2.0f, 4.0f, 4.0f, 4.0f, new hdk(-0.015f)), hdi.a(0.0f, -6.0f, 0.0f));
        $$2.a("right_arm", hdl.c().a(36, 16).a(-3.0f, -1.0f, -2.0f, 3.0f, 10.0f, 4.0f, hdk.a), hdi.a(-4.0f, -6.0f, 0.0f));
        $$2.a("left_arm", hdl.c().a(50, 16).a(0.0f, -1.0f, -2.0f, 3.0f, 10.0f, 4.0f, hdk.a), hdi.a(4.0f, -6.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(0, 27).a(-4.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, hdk.a), hdi.a(0.0f, -5.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(16, 27).a(0.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, hdk.a), hdi.a(0.0f, -5.0f, 0.0f));
        return hdm.a($$02, 64, 64);
    }

    public static hdm f() {
        hdo $$02 = new hdo().a($$0 -> $$0.c(0.0f, 0.0f, 0.0f));
        hdq $$1 = $$02.a();
        hdq $$2 = $$1.a("body", hdl.c(), hdi.a(-1.064f, -5.0f, 0.0f));
        $$2.a("body_r1", hdl.c().a(0, 15).a(-4.02f, -6.116f, -3.5f, 8.0f, 6.0f, 6.0f, new hdk(0.0f)), hdi.a(1.1f, 0.1f, 0.7f, 0.1204f, -0.0064f, -0.0779f));
        $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -5.1f, -5.0f, 8.0f, 5.0f, 10.0f, new hdk(0.0f)).a(56, 0).a(-1.02f, -2.1f, -6.0f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)).a(37, 8).a(-1.02f, -9.1f, -1.0f, 2.0f, 4.0f, 2.0f, new hdk(-0.015f)).a(37, 0).a(-2.0f, -13.1f, -2.0f, 4.0f, 4.0f, 4.0f, new hdk(-0.015f)), hdi.a(0.7f, -5.6f, -1.8f));
        hdq $$3 = $$2.a("right_arm", hdl.c(), hdi.a(-4.0f, -6.0f, 0.0f));
        $$3.a("right_arm_r1", hdl.c().a(36, 16).a(-3.052f, -1.11f, -2.036f, 3.0f, 10.0f, 4.0f, new hdk(0.0f)), hdi.a(0.7f, -0.248f, -1.62f, 1.0036f, 0.0f, 0.0f));
        hdq $$4 = $$2.a("left_arm", hdl.c(), hdi.a(4.0f, -6.0f, 0.0f));
        $$4.a("left_arm_r1", hdl.c().a(50, 16).a(0.032f, -1.1f, -2.0f, 3.0f, 10.0f, 4.0f, new hdk(0.0f)), hdi.a(0.732f, 0.0f, 0.0f, -0.8715f, -0.0535f, -0.0449f));
        hdq $$5 = $$1.a("right_leg", hdl.c(), hdi.a(-3.064f, -5.0f, 0.0f));
        $$5.a("right_leg_r1", hdl.c().a(0, 27).a(-1.856f, -0.1f, -1.09f, 4.0f, 5.0f, 4.0f, new hdk(0.0f)), hdi.a(1.048f, 0.0f, -0.9f, -0.8727f, 0.0f, 0.0f));
        hdq $$6 = $$1.a("left_leg", hdl.c(), hdi.a(0.936f, -5.0f, 0.0f));
        $$6.a("left_leg_r1", hdl.c().a(16, 27).a(-2.088f, -0.1f, -2.0f, 4.0f, 5.0f, 4.0f, new hdk(0.0f)), hdi.a(1.0f, 0.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        return hdm.a($$02, 64, 64);
    }

    public static hdm g() {
        hdo $$02 = new hdo().a($$0 -> $$0.c(0.0f, 0.0f, 0.0f));
        hdq $$1 = $$02.a();
        hdq $$2 = $$1.a("body", hdl.c().a(3, 19).a(-3.0f, -4.0f, -4.525f, 6.0f, 1.0f, 6.0f, new hdk(0.0f)).a(0, 15).a(-4.0f, -3.0f, -3.525f, 8.0f, 6.0f, 6.0f, new hdk(0.0f)), hdi.a(0.0f, -3.0f, 2.325f));
        $$2.a("body_r1", hdl.c().a(3, 18).a(-4.0f, -3.0f, -2.2f, 8.0f, 6.0f, 3.0f, new hdk(0.0f)), hdi.a(0.0f, -1.0f, -4.325f, 0.0f, 0.0f, -3.1416f));
        hdq $$3 = $$2.a("head", hdl.c().a(37, 8).a(-1.0f, -7.0f, -3.3f, 2.0f, 4.0f, 2.0f, new hdk(-0.015f)).a(37, 0).a(-2.0f, -11.0f, -4.3f, 4.0f, 4.0f, 4.0f, new hdk(-0.015f)).a(0, 0).a(-4.0f, -3.0f, -7.325f, 8.0f, 5.0f, 10.0f, new hdk(0.0f)).a(56, 0).a(-1.0f, 0.0f, -8.325f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)), hdi.a(0.0f, -6.0f, -0.2f));
        hdq $$4 = $$2.a("right_arm", hdl.c(), hdi.a(-4.0f, -5.6f, -1.8f, 0.4363f, 0.0f, 0.0f));
        $$4.a("right_arm_r1", hdl.c().a(36, 16).a(-3.075f, -0.9733f, -1.9966f, 3.0f, 10.0f, 4.0f, new hdk(0.0f)), hdi.a(0.0f, 0.0893f, 0.1198f, -1.0472f, 0.0f, 0.0f));
        hdq $$5 = $$2.a("left_arm", hdl.c(), hdi.a(4.0f, -5.6f, -1.7f, 0.4363f, 0.0f, 0.0f));
        $$5.a("left_arm_r1", hdl.c().a(50, 16).a(0.075f, -1.0443f, -1.8997f, 3.0f, 10.0f, 4.0f, new hdk(0.0f)), hdi.a(0.0f, -0.0015f, -0.0808f, -1.0472f, 0.0f, 0.0f));
        hdq $$6 = $$1.a("right_leg", hdl.c(), hdi.a(-2.1f, -2.1f, -2.075f));
        $$6.a("right_leg_r1", hdl.c().a(0, 27).a(-2.0f, 0.975f, 0.0f, 4.0f, 5.0f, 4.0f, new hdk(0.0f)), hdi.a(0.05f, -1.9f, 1.075f, -1.5708f, 0.0f, 0.0f));
        hdq $$7 = $$1.a("left_leg", hdl.c(), hdi.a(2.0f, -2.0f, -2.075f));
        $$7.a("left_leg_r1", hdl.c().a(16, 27).a(-2.0f, 0.975f, 0.0f, 4.0f, 5.0f, 4.0f, new hdk(0.0f)), hdi.a(0.05f, -2.0f, 1.075f, -1.5708f, 0.0f, 0.0f));
        return hdm.a($$02, 64, 64);
    }

    public static hdm h() {
        hdo $$02 = new hdo().a($$0 -> $$0.c(0.0f, 0.0f, 0.0f));
        hdq $$1 = $$02.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 15).a(-4.0f, -6.0f, -3.0f, 8.0f, 6.0f, 6.0f, new hdk(0.0f)), hdi.a(0.0f, -5.0f, 0.0f));
        $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -5.0f, -5.0f, 8.0f, 5.0f, 10.0f, new hdk(0.0f)).a(56, 0).a(-1.0f, -2.0f, -6.0f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)).a(37, 8).a(-1.0f, -9.0f, -1.0f, 2.0f, 4.0f, 2.0f, new hdk(-0.015f)).a(37, 0).a(-2.0f, -13.0f, -2.0f, 4.0f, 4.0f, 4.0f, new hdk(-0.015f)), hdi.a(0.0f, -6.0f, 0.0f));
        hdq $$3 = $$2.a("right_arm", hdl.c(), hdi.a(-4.0f, -6.0f, 0.0f));
        $$3.a("right_arm_r1", hdl.c().a(36, 16).a(-1.5f, -5.0f, -2.0f, 3.0f, 10.0f, 4.0f, new hdk(0.0f)), hdi.a(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.9199f));
        $$3.a("rightItem", hdl.c(), hdi.a(-1.0f, 7.4f, -1.0f));
        hdq $$4 = $$2.a("left_arm", hdl.c(), hdi.a(4.0f, -6.0f, 0.0f));
        $$4.a("left_arm_r1", hdl.c().a(50, 16).a(-1.5f, -5.0f, -2.0f, 3.0f, 10.0f, 4.0f, new hdk(0.0f)), hdi.a(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.9199f));
        hdq $$5 = $$1.a("right_leg", hdl.c(), hdi.a(-3.0f, -5.0f, 0.0f));
        $$5.a("right_leg_r1", hdl.c().a(0, 27).a(-2.0f, -2.5f, -2.0f, 4.0f, 5.0f, 4.0f, new hdk(0.0f)), hdi.a(0.35f, 2.0f, 0.01f, 0.0f, 0.0f, 0.2618f));
        hdq $$6 = $$1.a("left_leg", hdl.c(), hdi.a(1.0f, -5.0f, 0.0f));
        $$6.a("left_leg_r1", hdl.c().a(16, 27).a(-2.0f, -2.5f, -2.0f, 4.0f, 5.0f, 4.0f, new hdk(0.0f)), hdi.a(1.65f, 2.0f, 0.0f, 0.0f, 0.0f, -0.2618f));
        return hdm.a($$02, 64, 64);
    }

    public static hdm i() {
        return hbq.e().a((hdo $$0) -> {
            $$0.a().a(Set.of("eyes"));
            return $$0;
        });
    }

    @Override
    public void a(icv $$0) {
        super.a($$0);
        this.e.e = $$0.av * ((float)Math.PI / 180);
        this.e.f = $$0.au * ((float)Math.PI / 180);
        if ($$0.g.e() && $$0.j.e()) {
            this.i.a($$0.ax, $$0.ay, 2.0f, 2.5f);
        } else {
            this.j.a($$0.ax, $$0.ay, 2.0f, 2.5f);
            this.j();
        }
        this.k.a($$0.c, $$0.L);
        this.l.a($$0.d, $$0.L);
        this.m.a($$0.n, $$0.L);
        this.n.a($$0.o, $$0.L);
        this.q.a($$0.p, $$0.L);
    }

    @Override
    public void a(icv $$0, chb $$1, fzm $$2) {
        this.o.a($$2);
        this.f.a($$2);
        hdg $$3 = $$1 == chb.b ? this.g : this.h;
        $$3.a($$2);
        if ($$0.b.equals(cwg.a)) {
            $$2.a((Quaternionfc)a.d.rotationDegrees($$1 == chb.b ? -90.0f : 90.0f));
            $$2.a(0.0f, 0.0f, 0.125f);
        } else {
            $$2.b(0.55f, 0.55f, 0.55f);
            $$2.a(-0.125f, 0.3125f, -0.1875f);
        }
    }

    @Override
    public hdg a() {
        return this.e;
    }

    @Override
    public void a(fzm $$0) {
        this.f.a($$0);
        this.e.a($$0);
        $$0.a(0.0f, 0.125f, 0.0f);
        $$0.b(1.0625f, 1.0625f, 1.0625f);
    }

    public void b(fzm $$0) {
        this.o.a($$0);
        this.f.a($$0);
        this.e.a($$0);
        $$0.a(0.0, -2.25, 0.0);
    }

    private void j() {
        this.g.e = Math.min(this.g.e, -0.87266463f);
        this.h.e = Math.min(this.h.e, -0.87266463f);
        this.g.f = Math.min(this.g.f, -0.1134464f);
        this.h.f = Math.max(this.h.f, 0.1134464f);
        this.g.g = Math.min(this.g.g, -0.064577185f);
        this.h.g = Math.max(this.h.g, 0.064577185f);
    }
}

