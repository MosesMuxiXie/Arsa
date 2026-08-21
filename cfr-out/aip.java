/*
 * Decompiled with CFR 0.152.
 */
public class aip
implements aay<aib> {
    public static final aao<wx, aip> a = aay.a(aip::a, aip::new);
    private final int b;
    private final String c;

    public aip(int $$0, String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private aip(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.d(32500);
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c, 32500);
    }

    @Override
    public aba<aip> a() {
        return ahz.bD;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public String e() {
        return this.c;
    }
}

