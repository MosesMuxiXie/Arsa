/*
 * Decompiled with CFR 0.152.
 */
public class adi
implements aay<adb> {
    public static final aao<xq, adi> a = aay.a(adi::a, adi::new);
    private final is b;
    private final int c;
    private final int d;
    private final dzq e;

    public adi(is $$0, dzq $$1, int $$2, int $$3) {
        this.b = $$0;
        this.e = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    private adi(xq $$0) {
        this.b = $$0.e();
        this.c = $$0.readUnsignedByte();
        this.d = $$0.readUnsignedByte();
        this.e = (dzq)aam.a(mj.i).decode($$0);
    }

    @Override
    private void a(xq $$0) {
        $$0.a(this.b);
        $$0.l(this.c);
        $$0.l(this.d);
        aam.a(mj.i).encode($$0, this.e);
    }

    @Override
    public aba<adi> a() {
        return ahz.i;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public is b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public dzq g() {
        return this.e;
    }
}

