/*
 * Decompiled with CFR 0.152.
 */
public class bhv<T> {
    private final amo a;

    public bhv(amo $$0) {
        this.a = $$0;
    }

    public static <T> bhv<T> a(String $$0) {
        return new bhv<T>(amo.b($$0));
    }

    public amo a() {
        return this.a;
    }

    public String toString() {
        return "<parameter " + String.valueOf(this.a) + ">";
    }
}

