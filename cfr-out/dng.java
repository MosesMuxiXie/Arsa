/*
 * Decompiled with CFR 0.152.
 */
public abstract class dng
extends dmm
implements dmn {
    public static float a = 0.5f;

    public dng(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        if ($$0 instanceof axf) {
            axf $$4 = (axf)$$0;
            dec.a(this::a, $$4, $$3, $$1, -20.0f, a, 1.0f);
        }
        $$1.b(bdk.c.b(this));
        $$3.a(1, (chl)$$1);
        return cdc.a;
    }

    protected abstract dey a(axf var1, chl var2, dlt var3);

    protected abstract dey a(dwo var1, jn var2, dlt var3);

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        return this.a($$0, $$1, $$2);
    }

    @Override
    public dmn.a a() {
        return dmn.a.a().a(dmn.a.a.c() * 0.5f).b(dmn.a.a.d() * 1.25f).a();
    }
}

