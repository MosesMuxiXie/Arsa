/*
 * Decompiled with CFR 0.152.
 */
public class flc {
    public static final fla a = flc.a("empty", new fky());
    public static final fkz b = flc.a("flowing_water", new flh.a());
    public static final fkz c = flc.a("water", new flh.b());
    public static final fkz d = flc.a("flowing_lava", new fle.a());
    public static final fkz e = flc.a("lava", new fle.b());

    private static <T extends fla> T a(String $$0, T $$1) {
        return (T)jq.a(mi.c, $$0, $$1);
    }

    static {
        for (fla $$0 : mi.c) {
            for (flb $$1 : $$0.f().a()) {
                fla.c.b($$1);
            }
        }
    }
}

