/*
 * Decompiled with CFR 0.152.
 */
public interface iog {
    public ilp a(ins var1, iny var2);

    public ilp a(String var1, iny var2);

    default public ilp a(hqp $$0, String $$1, iny $$2) {
        ins $$3 = $$0.a($$1);
        return $$3 != null ? this.a($$3, $$2) : this.a($$1, $$2);
    }
}

