/*
 * Decompiled with CFR 0.152.
 */
public class anq
implements Runnable {
    private final int a;
    private final Runnable b;

    public anq(int $$0, Runnable $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.a;
    }

    @Override
    public void run() {
        this.b.run();
    }
}

