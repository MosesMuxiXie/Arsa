/*
 * Decompiled with CFR 0.152.
 */
public class aix
implements aay<aib> {
    public static final aao<wx, aix> a = aay.a(aix::a, aix::new);
    private final int b;
    private final int c;

    public aix(int $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private aix(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.l();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.c(this.c);
    }

    @Override
    public aba<aix> a() {
        return ahz.bL;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

