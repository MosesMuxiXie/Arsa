/*
 * Decompiled with CFR 0.152.
 */
public interface chv
extends chu {
    public void a(int var1);

    public boolean a();

    public void b(int var1);

    public void b();

    default public int c() {
        return 0;
    }

    default public float e_(int $$0) {
        return $$0 >= 90 ? 1.0f : 0.4f + 0.4f * (float)$$0 / 90.0f;
    }
}

