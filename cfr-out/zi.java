/*
 * Decompiled with CFR 0.152.
 */
public class zi
extends Exception {
    private final yh a;

    public zi(yh $$0) {
        super($$0.getString());
        this.a = $$0;
    }

    public zi(yh $$0, Throwable $$1) {
        super($$0.getString(), $$1);
        this.a = $$0;
    }

    public yh a() {
        return this.a;
    }
}

