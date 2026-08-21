/*
 * Decompiled with CFR 0.152.
 */
public interface csu {
    public static final csu a = csu.a("zombie_villager_cured");
    public static final csu b = csu.a("golem_killed");
    public static final csu c = csu.a("villager_hurt");
    public static final csu d = csu.a("villager_killed");
    public static final csu e = csu.a("trade");

    public static csu a(final String $$0) {
        return new csu(){

            public String toString() {
                return $$0;
            }
        };
    }
}

