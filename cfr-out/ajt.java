/*
 * Decompiled with CFR 0.152.
 */
public class ajt
implements aay<aib> {
    public static final aao<wx, ajt> a = aay.a(ajt::a, ajt::new);
    private final int b;

    public ajt(int $$0) {
        this.b = $$0;
    }

    private ajt(wx $$0) {
        this.b = $$0.readShort();
    }

    @Override
    private void a(wx $$0) {
        $$0.m(this.b);
    }

    @Override
    public aba<ajt> a() {
        return ahz.cj;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }
}

