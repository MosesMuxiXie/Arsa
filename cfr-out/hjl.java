/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Locale;

public final class hjl
extends Enum<hjl> {
    public static final /* enum */ hjl a = new hjl("i_want_to_report_them");
    public static final /* enum */ hjl b = new hjl("hate_speech");
    public static final /* enum */ hjl c = new hjl("harassment_or_bullying");
    public static final /* enum */ hjl d = new hjl("self_harm_or_suicide");
    public static final /* enum */ hjl e = new hjl("imminent_harm");
    public static final /* enum */ hjl f = new hjl("defamation_impersonation_false_information");
    public static final /* enum */ hjl g = new hjl("alcohol_tobacco_drugs");
    public static final /* enum */ hjl h = new hjl("child_sexual_exploitation_or_abuse");
    public static final /* enum */ hjl i = new hjl("terrorism_or_violent_extremism");
    public static final /* enum */ hjl j = new hjl("non_consensual_intimate_imagery");
    public static final /* enum */ hjl k = new hjl("sexually_inappropriate");
    private final String l;
    private final yh m;
    private final yh n;
    private static final /* synthetic */ hjl[] o;

    public static hjl[] values() {
        return (hjl[])o.clone();
    }

    public static hjl valueOf(String $$0) {
        return Enum.valueOf(hjl.class, $$0);
    }

    private hjl(String $$0) {
        this.l = $$0.toUpperCase(Locale.ROOT);
        String $$1 = "gui.abuseReport.reason." + $$0;
        this.m = yh.c($$1);
        this.n = yh.c($$1 + ".description");
    }

    public String a() {
        return this.l;
    }

    public yh b() {
        return this.m;
    }

    public yh c() {
        return this.n;
    }

    public static List<hjl> a(hjm $$0) {
        return switch ($$0) {
            case hjm.a -> List.of(k);
            case hjm.b -> List.of(e, f);
            default -> List.of();
        };
    }

    private static /* synthetic */ hjl[] d() {
        return new hjl[]{a, b, c, d, e, f, g, h, i, j, k};
    }

    static {
        o = hjl.d();
    }
}

