/*
 * Decompiled with CFR 0.152.
 */
public class v
extends RuntimeException {
    private final m a;

    public v(m $$0) {
        this.a = $$0;
    }

    public m a() {
        return this.a;
    }

    @Override
    public Throwable getCause() {
        return this.a.b();
    }

    @Override
    public String getMessage() {
        return this.a.a();
    }
}

