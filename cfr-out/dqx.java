/*
 * Decompiled with CFR 0.152.
 */
public final class dqx<T extends dqs<?>>
extends Record {
    private final amt<dqs<?>> b;
    private final T c;
    public static final aao<xq, dqx<?>> a = aao.a(amt.b(mj.bK), dqx::a, dqs.c, dqx::b, dqx::new);

    public dqx(amt<dqs<?>> $$0, T $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof dqx)) return false;
        dqx $$1 = (dqx)$$0;
        if (this.b != $$1.b) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public String toString() {
        return this.b.toString();
    }

    public amt<dqs<?>> a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }
}

