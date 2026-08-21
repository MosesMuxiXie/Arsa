/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
import org.slf4j.Logger;

public class q
implements Thread.UncaughtExceptionHandler {
    private final Logger a;

    public q(Logger $$0) {
        this.a = $$0;
    }

    @Override
    public void uncaughtException(Thread $$0, Throwable $$1) {
        this.a.error("Caught previously unhandled exception :");
        this.a.error($$0.getName(), $$1);
    }
}

