/*
 * Decompiled with CFR 0.152.
 */
public class aie
implements aay<aib> {
    public static final aao<wx, aie> a = aay.a(aie::a, aie::new);
    private final int b;
    private final is c;

    public aie(int $$0, is $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private aie(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.e();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<aie> a() {
        return ahz.br;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public is e() {
        return this.c;
    }
}

