/*
 * Decompiled with CFR 0.152.
 */
public class aff
implements aay<adb> {
    public static final aao<wx, aff> a = aay.a(aff::a, aff::new);
    private final is b;
    private final boolean c;

    public aff(is $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private aff(wx $$0) {
        this.b = $$0.e();
        this.c = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<aff> a() {
        return ahz.ad;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public is b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

