/*
 * Decompiled with CFR 0.152.
 */
public class hep<S extends idz>
extends gzm<S>
implements gzk<S>,
gzn {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;

    public hep(hdg $$0) {
        super($$0);
        this.b = $$0.b("head");
        this.c = this.b.b("hat");
        this.c.k = false;
        this.d = $$0.b("arms");
        this.e = $$0.b("left_leg");
        this.f = $$0.b("right_leg");
        this.h = $$0.b("left_arm");
        this.g = $$0.b("right_arm");
    }

    public static hdm e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), hdi.a(0.0f, 0.0f, 0.0f));
        $$2.a("hat", hdl.c().a(32, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 12.0f, 8.0f, new hdk(0.45f)), hdi.a);
        $$2.a("nose", hdl.c().a(24, 0).a(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f), hdi.a(0.0f, -2.0f, 0.0f));
        $$1.a("body", hdl.c().a(16, 20).a(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f).a(0, 38).a(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new hdk(0.5f)), hdi.a(0.0f, 0.0f, 0.0f));
        hdq $$3 = $$1.a("arms", hdl.c().a(44, 22).a(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f).a(40, 38).a(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f), hdi.a(0.0f, 3.0f, -1.0f, -0.75f, 0.0f, 0.0f));
        $$3.a("left_shoulder", hdl.c().a(44, 22).a().a(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f), hdi.a);
        $$1.a("right_leg", hdl.c().a(0, 22).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(-2.0f, 12.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(0, 22).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(2.0f, 12.0f, 0.0f));
        $$1.a("right_arm", hdl.c().a(40, 46).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(-5.0f, 2.0f, 0.0f));
        $$1.a("left_arm", hdl.c().a(40, 46).a().a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(5.0f, 2.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(S $$0) {
        boolean $$4;
        super.a($$0);
        this.b.f = ((idz)$$0).au * ((float)Math.PI / 180);
        this.b.e = ((idz)$$0).av * ((float)Math.PI / 180);
        if (((idz)$$0).b) {
            this.g.e = -0.62831855f;
            this.g.f = 0.0f;
            this.g.g = 0.0f;
            this.h.e = -0.62831855f;
            this.h.f = 0.0f;
            this.h.g = 0.0f;
            this.f.e = -1.4137167f;
            this.f.f = 0.31415927f;
            this.f.g = 0.07853982f;
            this.e.e = -1.4137167f;
            this.e.f = -0.31415927f;
            this.e.g = -0.07853982f;
        } else {
            float $$1 = ((idz)$$0).ay;
            float $$2 = ((idz)$$0).ax;
            this.g.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 2.0f * $$1 * 0.5f;
            this.g.f = 0.0f;
            this.g.g = 0.0f;
            this.h.e = bgj.b((double)($$2 * 0.6662f)) * 2.0f * $$1 * 0.5f;
            this.h.f = 0.0f;
            this.h.g = 0.0f;
            this.f.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1 * 0.5f;
            this.f.f = 0.0f;
            this.f.g = 0.0f;
            this.e.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1 * 0.5f;
            this.e.f = 0.0f;
            this.e.g = 0.0f;
        }
        dba.a $$3 = ((idz)$$0).n;
        if ($$3 == dba.a.b) {
            if (((ich)$$0).bn_().e()) {
                gzj.a(this.h, this.g, true, $$0);
            } else {
                gzj.a(this.g, this.h, ((idz)$$0).d, ((idz)$$0).q, ((idz)$$0).L);
            }
        } else if ($$3 == dba.a.c) {
            this.g.d = 0.0f;
            this.g.b = -5.0f;
            this.h.d = 0.0f;
            this.h.b = 5.0f;
            this.g.e = bgj.b((double)(((idz)$$0).L * 0.6662f)) * 0.25f;
            this.h.e = bgj.b((double)(((idz)$$0).L * 0.6662f)) * 0.25f;
            this.g.g = 2.3561945f;
            this.h.g = -2.3561945f;
            this.g.f = 0.0f;
            this.h.f = 0.0f;
        } else if ($$3 == dba.a.d) {
            this.g.f = -0.1f + this.b.f;
            this.g.e = -1.5707964f + this.b.e;
            this.h.e = -0.9424779f + this.b.e;
            this.h.f = this.b.f - 0.4f;
            this.h.g = 1.5707964f;
        } else if ($$3 == dba.a.e) {
            gzj.a(this.g, this.h, this.b, true);
        } else if ($$3 == dba.a.f) {
            gzj.a(this.g, this.h, ((idz)$$0).o, ((idz)$$0).p, true);
        } else if ($$3 == dba.a.g) {
            this.g.d = 0.0f;
            this.g.b = -5.0f;
            this.g.e = bgj.b((double)(((idz)$$0).L * 0.6662f)) * 0.05f;
            this.g.g = 2.670354f;
            this.g.f = 0.0f;
            this.h.d = 0.0f;
            this.h.b = 5.0f;
            this.h.e = bgj.b((double)(((idz)$$0).L * 0.6662f)) * 0.05f;
            this.h.g = -2.3561945f;
            this.h.f = 0.0f;
        }
        this.d.k = $$4 = $$3 == dba.a.a;
        this.h.k = !$$4;
        this.g.k = !$$4;
    }

    private hdg a(chb $$0) {
        if ($$0 == chb.a) {
            return this.h;
        }
        return this.g;
    }

    public hdg f() {
        return this.c;
    }

    @Override
    public hdg a() {
        return this.b;
    }

    @Override
    public void a(idz $$0, chb $$1, fzm $$2) {
        this.o.a($$2);
        this.a($$1).a($$2);
    }
}

