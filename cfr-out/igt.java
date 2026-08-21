/*
 * Decompiled with CFR 0.152.
 */
public class igt
extends igw {
    @Override
    public jd<cfk> a() {
        return cfo.G;
    }

    @Override
    public void a(igp $$0, ger $$1, hif $$2, float $$3, gez $$4) {
        chl $$5;
        cfm $$6;
        cgk cgk2 = $$1.h();
        if (cgk2 instanceof chl && ($$6 = ($$5 = (chl)cgk2).e(this.a())) != null) {
            float $$7 = bgj.h($$6.a($$5, $$4.a(false)), $$3, 15.0f);
            $$0.a = $$7 * 0.75f;
            $$0.c = $$7;
            $$0.e = $$7;
            $$0.f = $$7;
        }
    }

    @Override
    public float a(chl $$0, float $$1, float $$2) {
        cfm $$3 = $$0.e(this.a());
        return $$3 != null ? Math.max($$3.a($$0, $$2), $$1) : $$1;
    }
}

