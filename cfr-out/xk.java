/*
 * Decompiled with CFR 0.152.
 */
public interface xk {
    public aaz N_();

    public wv b();

    public void a(ww var1);

    default public void a(aay $$0, Exception $$1) throws v {
        throw abb.a($$1, $$0, this);
    }

    default public ww a(yh $$0, Throwable $$1) {
        return new ww($$0);
    }

    public boolean c();

    default public boolean a(aay<?> $$0) {
        return this.c();
    }

    default public void a(m $$0) {
        n $$1 = $$0.a("Connection");
        $$1.a("Protocol", () -> this.b().a());
        $$1.a("Flow", () -> this.N_().toString());
        this.a($$0, $$1);
    }

    default public void a(m $$0, n $$1) {
    }
}

