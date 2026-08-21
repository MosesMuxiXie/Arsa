/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class cbs
extends cbq<Runnable> {
    public cbs(Executor $$0, String $$1) {
        super(new cbw.b(new ConcurrentLinkedQueue<Runnable>()), $$0, $$1);
    }

    @Override
    public Runnable f(Runnable $$0) {
        return $$0;
    }
}

