/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class hcs
extends gzm<ifg> {
    public static final hdp b = hdp.scaling(0.5f);
    private final hdg[] c = new hdg[8];

    public hcs(hdg $$0) {
        super($$0);
        Arrays.setAll(this.c, $$1 -> $$0.b(hcs.a($$1)));
    }

    private static String a(int $$0) {
        return "tentacle" + $$0;
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdk $$2 = new hdk(0.02f);
        int $$3 = -16;
        $$1.a("body", hdl.c().a(0, 0).a(-6.0f, -8.0f, -6.0f, 12.0f, 16.0f, 12.0f, $$2), hdi.a(0.0f, 8.0f, 0.0f));
        int $$4 = 8;
        hdl $$5 = hdl.c().a(48, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 18.0f, 2.0f);
        for (int $$6 = 0; $$6 < 8; ++$$6) {
            double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
            float $$8 = (float)Math.cos($$7) * 5.0f;
            float $$9 = 15.0f;
            float $$10 = (float)Math.sin($$7) * 5.0f;
            $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + 1.5707963267948966;
            float $$11 = (float)$$7;
            $$1.a(hcs.a($$6), $$5, hdi.a($$8, 15.0f, $$10, 0.0f, $$11, 0.0f));
        }
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(ifg $$0) {
        super.a($$0);
        for (hdg $$1 : this.c) {
            $$1.e = $$0.a;
        }
    }
}

