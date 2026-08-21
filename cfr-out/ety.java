/*
 * Decompiled with CFR 0.152.
 */
public final class ety
extends Enum<ety>
implements bhh {
    public static final /* enum */ ety a = new ety("integer");
    public static final /* enum */ ety b = new ety("boolean");
    private final String c;
    private static final /* synthetic */ ety[] d;

    public static ety[] values() {
        return (ety[])d.clone();
    }

    public static ety valueOf(String $$0) {
        return Enum.valueOf(ety.class, $$0);
    }

    private ety(String $$0) {
        this.c = $$0;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ ety[] a() {
        return new ety[]{a, b};
    }

    static {
        d = ety.a();
    }
}

