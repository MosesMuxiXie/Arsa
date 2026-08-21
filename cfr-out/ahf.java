/*
 * Decompiled with CFR 0.152.
 */
public class ahf
implements aay<adb> {
    public static final aao<wx, ahf> a = aay.a(ahf::a, ahf::new);
    private final int b;
    private final int c;
    private final int d;

    public ahf(int $$0, int $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private ahf(wx $$0) {
        this.b = $$0.readInt();
        this.c = $$0.readInt();
        this.d = $$0.readInt();
    }

    @Override
    private void a(wx $$0) {
        $$0.q(this.b);
        $$0.q(this.c);
        $$0.q(this.d);
    }

    @Override
    public aba<ahf> a() {
        return ahz.aZ;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

