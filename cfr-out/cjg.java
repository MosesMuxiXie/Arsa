/*
 * Decompiled with CFR 0.152.
 */
public class cjg
implements cks {
    private final is a;
    private final ftm b;

    public cjg(is $$0) {
        this.a = $$0.j();
        this.b = ftm.b($$0);
    }

    public cjg(ftm $$0) {
        this.a = is.a($$0);
        this.b = $$0;
    }

    @Override
    public ftm a() {
        return this.b;
    }

    @Override
    public is b() {
        return this.a;
    }

    @Override
    public boolean a(chl $$0) {
        return true;
    }

    public String toString() {
        return "BlockPosTracker{blockPos=" + String.valueOf(this.a) + ", centerPosition=" + String.valueOf(this.b) + "}";
    }
}

