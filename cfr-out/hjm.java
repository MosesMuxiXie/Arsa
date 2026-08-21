/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class hjm
extends Enum<hjm> {
    public static final /* enum */ hjm a = new hjm("chat");
    public static final /* enum */ hjm b = new hjm("skin");
    public static final /* enum */ hjm c = new hjm("username");
    private final String d;
    private static final /* synthetic */ hjm[] e;

    public static hjm[] values() {
        return (hjm[])e.clone();
    }

    public static hjm valueOf(String $$0) {
        return Enum.valueOf(hjm.class, $$0);
    }

    private hjm(String $$0) {
        this.d = $$0.toUpperCase(Locale.ROOT);
    }

    public String a() {
        return this.d;
    }

    private static /* synthetic */ hjm[] b() {
        return new hjm[]{a, b, c};
    }

    static {
        e = hjm.b();
    }
}

