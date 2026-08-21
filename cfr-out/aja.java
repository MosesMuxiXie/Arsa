/*
 * Decompiled with CFR 0.152.
 */
public class aja
implements aay<aib> {
    public static final aao<wx, aja> a = aay.a(aja::a, aja::new);
    private final boolean b;

    public aja(boolean $$0) {
        this.b = $$0;
    }

    private aja(wx $$0) {
        this.b = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<aja> a() {
        return ahz.bO;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public boolean b() {
        return this.b;
    }
}

