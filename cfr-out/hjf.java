/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public final class hjf
extends Enum<hjf> {
    public static final /* enum */ hjf a = new hjf("generic_violation");
    public static final /* enum */ hjf b = new hjf("false_reporting");
    public static final /* enum */ hjf c = new hjf("hate_speech");
    public static final /* enum */ hjf d = new hjf("hate_terrorism_notorious_figure");
    public static final /* enum */ hjf e = new hjf("harassment_or_bullying");
    public static final /* enum */ hjf f = new hjf("defamation_impersonation_false_information");
    public static final /* enum */ hjf g = new hjf("drugs");
    public static final /* enum */ hjf h = new hjf("fraud");
    public static final /* enum */ hjf i = new hjf("spam_or_advertising");
    public static final /* enum */ hjf j = new hjf("nudity_or_pornography");
    public static final /* enum */ hjf k = new hjf("sexually_inappropriate");
    public static final /* enum */ hjf l = new hjf("extreme_violence_or_gore");
    public static final /* enum */ hjf m = new hjf("imminent_harm_to_person_or_property");
    private final yh n;
    private static final /* synthetic */ hjf[] o;

    public static hjf[] values() {
        return (hjf[])o.clone();
    }

    public static hjf valueOf(String $$0) {
        return Enum.valueOf(hjf.class, $$0);
    }

    private hjf(String $$0) {
        this.n = yh.c("gui.banned.reason." + $$0);
    }

    public yh a() {
        return this.n;
    }

    public static @Nullable hjf a(int $$0) {
        return switch ($$0) {
            case 17, 19, 23, 31 -> a;
            case 2 -> b;
            case 5 -> c;
            case 16, 25 -> d;
            case 21 -> e;
            case 27 -> f;
            case 28 -> g;
            case 29 -> h;
            case 30 -> i;
            case 32 -> j;
            case 33, 35, 36 -> k;
            case 34 -> l;
            case 53 -> m;
            default -> null;
        };
    }

    private static /* synthetic */ hjf[] b() {
        return new hjf[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
    }

    static {
        o = hjf.b();
    }
}

