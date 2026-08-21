/*
 * Decompiled with CFR 0.152.
 */
public class agt
implements aay<adb> {
    public static final aao<wx, agt> a = aay.a(agt::a, agt::new);
    private final float b;
    private final int c;
    private final int d;

    public agt(float $$0, int $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private agt(wx $$0) {
        this.b = $$0.readFloat();
        this.d = $$0.l();
        this.c = $$0.l();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.c(this.d);
        $$0.c(this.c);
    }

    @Override
    public aba<agt> a() {
        return ahz.aO;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public float b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

