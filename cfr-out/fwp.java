/*
 * Decompiled with CFR 0.152.
 */
public interface fwp {
    public float getAdvance();

    default public float a(boolean $$0) {
        return this.getAdvance() + ($$0 ? this.a() : 0.0f);
    }

    default public float a() {
        return 1.0f;
    }

    default public float b() {
        return 1.0f;
    }

    public static fwp a(float $$0) {
        return () -> $$0;
    }
}

