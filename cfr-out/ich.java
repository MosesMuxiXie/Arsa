/*
 * Decompiled with CFR 0.152.
 */
public class ich
extends ieh {
    public chb e = chb.b;
    public gzo.a f = gzo.a.a;
    public final ihm g = new ihm();
    public dlt h = dlt.l;
    public gzo.a i = gzo.a.a;
    public final ihm j = new ihm();
    public dlt k = dlt.l;
    public dnf l = dnf.b;
    public float m;

    public ihm bn_() {
        return this.e == chb.b ? this.g : this.j;
    }

    public dlt b() {
        return this.e == chb.b ? this.h : this.k;
    }

    public dlt a(chb $$0) {
        return $$0 == chb.b ? this.h : this.k;
    }

    public float b(chb $$0) {
        return 0.0f;
    }

    public static void a(chl $$0, ich $$1, ihk $$2, float $$3) {
        $$1.e = $$0.at();
        dlt $$4 = $$0.fx();
        $$1.l = $$4.L().a();
        $$1.m = $$0.E($$3);
        $$2.a($$1.g, $$0.b(chb.b), dlr.c, $$0);
        $$2.a($$1.j, $$0.b(chb.a), dlr.b, $$0);
        $$1.k = $$0.b(chb.a).v();
        $$1.h = $$0.b(chb.b).v();
    }
}

