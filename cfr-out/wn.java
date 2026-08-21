/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public class wn {
    private final AtomicInteger a = new AtomicInteger();
    private final bxn b;

    public wn(bxn $$0) {
        this.b = $$0;
    }

    public void a(int $$0) {
        this.a.getAndAdd($$0);
    }

    public void a() {
        this.b.a((long)this.a.getAndSet(0));
    }
}

