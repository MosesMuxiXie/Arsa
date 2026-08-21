/*
 * Decompiled with CFR 0.152.
 */
public class aiz
implements aay<aib> {
    public static final aao<wx, aiz> a = aay.a(aiz::a, aiz::new);
    private final is b;
    private final int c;
    private final boolean d;

    public aiz(is $$0, int $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private aiz(wx $$0) {
        this.b = $$0.e();
        this.c = $$0.l();
        this.d = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.c(this.c);
        $$0.a(this.d);
    }

    @Override
    public aba<aiz> a() {
        return ahz.bN;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public is b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

