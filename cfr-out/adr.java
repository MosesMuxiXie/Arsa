/*
 * Decompiled with CFR 0.152.
 */
public class adr
implements aay<adb> {
    public static final aao<wx, adr> a = aay.a(adr::a, adr::new);
    private final boolean b;

    public adr(boolean $$0) {
        this.b = $$0;
    }

    private adr(wx $$0) {
        this.b = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<adr> a() {
        return ahz.p;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public boolean b() {
        return this.b;
    }
}

