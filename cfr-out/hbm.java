/*
 * Decompiled with CFR 0.152.
 */
public class hbm
extends gzm<idt> {
    public static final hdp b = hdp.scaling(0.2375f);
    private static final float c = 0.9375f;
    private final hdg[] d = new hdg[9];
    private final hdg e;

    public hbm(hdg $$0) {
        super($$0);
        this.e = $$0.b("body");
        for (int $$1 = 0; $$1 < this.d.length; ++$$1) {
            this.d[$$1] = this.e.b(hdh.a($$1));
        }
    }

    public static hdm a(boolean $$0, hdk $$1) {
        hdo $$2 = new hdo();
        hdq $$3 = $$2.a();
        hdq $$4 = $$3.a("body", hdl.c().a(0, 0).a(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f, $$1), hdi.a(0.0f, 16.0f, 0.0f));
        if ($$0) {
            $$4.a("inner_body", hdl.c().a(0, 32).a(-8.0f, -16.0f, -8.0f, 16.0f, 16.0f, 16.0f, $$1.a(-0.5f)), hdi.a(0.0f, 8.0f, 0.0f));
        }
        $$4.a(hdh.a(0), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, $$1), hdi.a(-3.75f, 7.0f, -5.0f));
        $$4.a(hdh.a(1), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f, $$1), hdi.a(1.25f, 7.0f, -5.0f));
        $$4.a(hdh.a(2), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, $$1), hdi.a(6.25f, 7.0f, -5.0f));
        $$4.a(hdh.a(3), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, $$1), hdi.a(-6.25f, 7.0f, 0.0f));
        $$4.a(hdh.a(4), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, $$1), hdi.a(-1.25f, 7.0f, 0.0f));
        $$4.a(hdh.a(5), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f, $$1), hdi.a(3.75f, 7.0f, 0.0f));
        $$4.a(hdh.a(6), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, $$1), hdi.a(-3.75f, 7.0f, 5.0f));
        $$4.a(hdh.a(7), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, $$1), hdi.a(1.25f, 7.0f, 5.0f));
        $$4.a(hdh.a(8), hdl.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, $$1), hdi.a(6.25f, 7.0f, 5.0f));
        return hdm.a($$2, 64, 64).a(hdp.scaling(4.0f));
    }

    @Override
    public void a(idt $$0) {
        super.a($$0);
        if (!$$0.a.f()) {
            this.e.h = 0.9375f;
            this.e.i = 0.9375f;
            this.e.j = 0.9375f;
        }
        hei.a($$0, this.d);
    }
}

