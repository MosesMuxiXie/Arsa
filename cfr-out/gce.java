/*
 * Decompiled with CFR 0.152.
 */
public class gce
extends Exception {
    public final gab a;

    public gce(gab $$0) {
        this.a = $$0;
    }

    @Override
    public String getMessage() {
        return this.a.c();
    }
}

