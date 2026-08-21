/*
 * Decompiled with CFR 0.152.
 */
public class ub
extends sy {
    private final Throwable a;

    public ub(Throwable $$0) {
        super($$0.getMessage());
        this.a = $$0;
    }

    @Override
    public yh a() {
        return yh.a("test.error.unknown", new Object[]{this.a.getMessage()});
    }
}

