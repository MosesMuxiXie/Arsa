/*
 * Decompiled with CFR 0.152.
 */
public final class anf
extends RuntimeException {
    public static final anf a = new anf();

    private anf() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

