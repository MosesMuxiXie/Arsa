/*
 * Decompiled with CFR 0.152.
 */
public class aes
implements aay<adb> {
    public static final aao<wx, aes> a = aay.a(aes::a, aes::new);
    private final int b;
    private final is c;
    private final int d;
    private final boolean e;

    public aes(int $$0, is $$1, int $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1.j();
        this.d = $$2;
        this.e = $$3;
    }

    private aes(wx $$0) {
        this.b = $$0.readInt();
        this.c = $$0.e();
        this.d = $$0.readInt();
        this.e = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.q(this.b);
        $$0.a(this.c);
        $$0.q(this.d);
        $$0.a(this.e);
    }

    @Override
    public aba<aes> a() {
        return ahz.Q;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public boolean b() {
        return this.e;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.d;
    }

    public is g() {
        return this.c;
    }
}

