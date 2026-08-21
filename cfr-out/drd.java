/*
 * Decompiled with CFR 0.152.
 */
public interface drd<T extends dqs<?>> {
    public static final drd<dqh> a = drd.a("crafting");
    public static final drd<drm> b = drd.a("smelting");
    public static final drd<dqb> c = drd.a("blasting");
    public static final drd<drr> d = drd.a("smoking");
    public static final drd<dqd> e = drd.a("campfire_cooking");
    public static final drd<drs> f = drd.a("stonecutting");
    public static final drd<drn> g = drd.a("smithing");

    public static <T extends dqs<?>> drd<T> a(final String $$0) {
        return jq.a(mi.r, amo.b($$0), new drd<T>(){

            public String toString() {
                return $$0;
            }
        });
    }
}

