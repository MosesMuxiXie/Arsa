/*
 * Decompiled with CFR 0.152.
 */
public class ghy {
    @Deprecated
    public static amo a(String $$0) {
        return amo.b("block/" + $$0);
    }

    public static amo b(String $$0) {
        return amo.b("item/" + $$0);
    }

    public static amo a(dzq $$0, String $$12) {
        amo $$2 = mi.e.b($$0);
        return $$2.a($$1 -> "block/" + $$1 + $$12);
    }

    public static amo a(dzq $$0) {
        amo $$1 = mi.e.b($$0);
        return $$1.f("block/");
    }

    public static amo a(dlp $$0) {
        amo $$1 = mi.h.b($$0);
        return $$1.f("item/");
    }

    public static amo a(dlp $$0, String $$12) {
        amo $$2 = mi.h.b($$0);
        return $$2.a($$1 -> "item/" + $$1 + $$12);
    }
}

