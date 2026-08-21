/*
 * Decompiled with CFR 0.152.
 */
public class cfw
extends cfk {
    public static final int c = 40;

    protected cfw(cfl $$0, int $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(axf $$0, chl $$1, int $$2) {
        $$1.a($$0, $$1.en().r(), 1.0f);
        return true;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        int $$2 = 40 >> $$1;
        if ($$2 > 0) {
            return $$0 % $$2 == 0;
        }
        return true;
    }
}

