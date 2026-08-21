/*
 * Decompiled with CFR 0.152.
 */
public abstract class cbv<R extends Runnable>
extends cbr<R> {
    private int b;

    public cbv(String $$0) {
        super($$0);
    }

    @Override
    public boolean av() {
        return this.bP() || super.av();
    }

    protected boolean bP() {
        return this.b != 0;
    }

    @Override
    public void d(R $$0) {
        ++this.b;
        try {
            super.d($$0);
        }
        finally {
            --this.b;
        }
    }
}

