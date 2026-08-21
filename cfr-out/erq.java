/*
 * Decompiled with CFR 0.152.
 */
public interface erq {
    public void a(Throwable var1, esa var2, dvu var3);

    public void b(Throwable var1, esa var2, dvu var3);

    public static v a(dvu $$0, dvu $$1) {
        m $$2 = m.a(new IllegalStateException("Retrieved chunk position " + String.valueOf($$0) + " does not match requested " + String.valueOf($$1)), "Chunk found in invalid location");
        n $$3 = $$2.a("Misplaced Chunk");
        $$3.a("Stored Position", $$0::toString);
        return new v($$2);
    }

    default public void a(dvu $$0, dvu $$1, esa $$2) {
        this.a(erq.a($$0, $$1), $$2, $$1);
    }
}

