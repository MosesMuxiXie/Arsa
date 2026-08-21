/*
 * Decompiled with CFR 0.152.
 */
public final class eos
extends Enum<eos>
implements bhh {
    public static final /* enum */ eos a = new eos("floor");
    public static final /* enum */ eos b = new eos("wall");
    public static final /* enum */ eos c = new eos("ceiling");
    private final String d;
    private static final /* synthetic */ eos[] e;

    public static eos[] values() {
        return (eos[])e.clone();
    }

    public static eos valueOf(String $$0) {
        return Enum.valueOf(eos.class, $$0);
    }

    private eos(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ eos[] a() {
        return new eos[]{a, b, c};
    }

    static {
        e = eos.a();
    }
}

