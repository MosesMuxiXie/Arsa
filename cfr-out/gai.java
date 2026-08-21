/*
 * Decompiled with CFR 0.152.
 */
public class gai
extends gah {
    private final yh a;

    public gai(yh $$0) {
        this.a = $$0;
    }

    public gai(String $$0) {
        this(yh.b($$0));
    }

    @Override
    public yh a() {
        return yh.a("mco.upload.failed", this.a);
    }
}

