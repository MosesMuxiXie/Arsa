/*
 * Decompiled with CFR 0.152.
 */
public class sr
extends sy {
    protected final yh a;
    protected final int b;

    public sr(yh $$0, int $$1) {
        super($$0.getString());
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public yh a() {
        return yh.a("test.error.tick", this.a, this.b);
    }

    @Override
    public String getMessage() {
        return this.a().getString();
    }
}

