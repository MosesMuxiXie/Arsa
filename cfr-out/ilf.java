/*
 * Decompiled with CFR 0.152.
 */
public final class ilf {
    private static final int a = 16;
    private static final int b = 16;
    private static final String c = "missingno";
    private static final amo d = amo.b("missingno");

    public static fyh a() {
        return ilf.a(16, 16);
    }

    public static fyh a(int $$0, int $$1) {
        fyh $$2 = new fyh($$0, $$1, false);
        int $$3 = -524040;
        for (int $$4 = 0; $$4 < $$1; ++$$4) {
            for (int $$5 = 0; $$5 < $$0; ++$$5) {
                if ($$4 < $$1 / 2 ^ $$5 < $$0 / 2) {
                    $$2.b($$5, $$4, -524040);
                    continue;
                }
                $$2.b($$5, $$4, -16777216);
            }
        }
        return $$2;
    }

    public static ilk b() {
        fyh $$0 = ilf.a(16, 16);
        return new ilk(d, new ina(16, 16), $$0);
    }

    public static amo c() {
        return d;
    }
}

