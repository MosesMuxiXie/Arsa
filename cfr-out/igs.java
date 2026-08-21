/*
 * Decompiled with CFR 0.152.
 */
public class igs
extends igw {
    @Override
    public jd<cfk> a() {
        return cfo.o;
    }

    @Override
    public void a(igp $$0, ger $$1, hif $$2, float $$3, gez $$4) {
        chl $$5;
        cfm $$6;
        cgk cgk2 = $$1.h();
        if (cgk2 instanceof chl && ($$6 = ($$5 = (chl)cgk2).e(this.a())) != null) {
            float $$7 = $$6.b() ? 5.0f : bgj.h(Math.min(1.0f, (float)$$6.d() / 20.0f), $$3, 5.0f);
            $$0.a = $$7 * 0.25f;
            $$0.c = $$7;
            $$0.e = $$7 * 0.8f;
            $$0.f = $$7 * 0.8f;
        }
    }

    @Override
    public float a(chl $$0, float $$1, float $$2) {
        cfm $$3 = $$0.e(this.a());
        if ($$3 != null) {
            $$1 = $$3.a(19) ? Math.max((float)$$3.d() / 20.0f, $$1) : 1.0f;
        }
        return $$1;
    }
}

