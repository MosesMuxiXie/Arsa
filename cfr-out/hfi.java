/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class hfi
extends gzm<ifd> {
    private static final int b = 8;
    private final hdg[] c = new hdg[8];

    public hfi(hdg $$0) {
        super($$0);
        Arrays.setAll(this.c, $$1 -> $$0.b(hfi.a($$1)));
    }

    private static String a(int $$0) {
        return "cube" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        for (int $$2 = 0; $$2 < 8; ++$$2) {
            int $$3 = 0;
            int $$4 = 0;
            if ($$2 > 0 && $$2 < 4) {
                $$4 += 9 * $$2;
            } else if ($$2 > 3) {
                $$3 = 32;
                $$4 += 9 * $$2 - 36;
            }
            $$1.a(hfi.a($$2), hdl.c().a($$3, $$4).a(-4.0f, 16 + $$2, -4.0f, 8.0f, 1.0f, 8.0f), hdi.a);
        }
        $$1.a("inside_cube", hdl.c().a(24, 40).a(-2.0f, 18.0f, -2.0f, 4.0f, 4.0f, 4.0f), hdi.a);
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ifd $$0) {
        super.a($$0);
        float $$1 = Math.max(0.0f, $$0.a);
        for (int $$2 = 0; $$2 < this.c.length; ++$$2) {
            this.c[$$2].c = (float)(-(4 - $$2)) * $$1 * 1.7f;
        }
    }
}

