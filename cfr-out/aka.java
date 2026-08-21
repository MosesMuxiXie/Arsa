/*
 * Decompiled with CFR 0.152.
 */
public class aka
implements aay<aib> {
    public static final aao<wx, aka> a = aay.a(aka::a, aka::new);
    private static final int b = 384;
    private final is c;
    private final String[] d;
    private final boolean e;

    public aka(is $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
        this.c = $$0;
        this.e = $$1;
        this.d = new String[]{$$2, $$3, $$4, $$5};
    }

    private aka(wx $$0) {
        this.c = $$0.e();
        this.e = $$0.readBoolean();
        this.d = new String[4];
        for (int $$1 = 0; $$1 < 4; ++$$1) {
            this.d[$$1] = $$0.d(384);
        }
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.c);
        $$0.a(this.e);
        for (int $$1 = 0; $$1 < 4; ++$$1) {
            $$0.a(this.d[$$1]);
        }
    }

    @Override
    public aba<aka> a() {
        return ahz.cr;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public is b() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public String[] f() {
        return this.d;
    }
}

