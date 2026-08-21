/*
 * Decompiled with CFR 0.152.
 */
public interface dqy {
    public dlt a(int var1);

    public int a();

    default public boolean b() {
        for (int $$0 = 0; $$0 < this.a(); ++$$0) {
            if (this.a($$0).f()) continue;
            return false;
        }
        return true;
    }
}

