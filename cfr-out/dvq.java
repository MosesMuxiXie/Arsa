/*
 * Decompiled with CFR 0.152.
 */
public interface dvq
extends dvt {
    public float a(iz var1, boolean var2);

    public fkq C_();

    public int a(is var1, dvz var2);

    default public int a(dww $$0, is $$1) {
        return this.C_().a($$0).b($$1);
    }

    default public int b(is $$0, int $$1) {
        return this.C_().a($$0, $$1);
    }

    default public boolean k(is $$0) {
        return this.a(dww.a, $$0) >= 15;
    }
}

