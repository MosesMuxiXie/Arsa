/*
 * Decompiled with CFR 0.152.
 */
public class hdk {
    public static final hdk a = new hdk(0.0f);
    final float b;
    final float c;
    final float d;

    public hdk(float $$0, float $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public hdk(float $$0) {
        this($$0, $$0, $$0);
    }

    public hdk a(float $$0) {
        return new hdk(this.b + $$0, this.c + $$0, this.d + $$0);
    }

    public hdk a(float $$0, float $$1, float $$2) {
        return new hdk(this.b + $$0, this.c + $$1, this.d + $$2);
    }
}

