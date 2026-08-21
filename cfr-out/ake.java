/*
 * Decompiled with CFR 0.152.
 */
public class ake
implements aay<aib> {
    public static final aao<wx, ake> a = aay.a(ake::a, ake::new);
    private final fti b;
    private final cdb c;
    private final int d;

    public ake(cdb $$0, fti $$1, int $$2) {
        this.c = $$0;
        this.b = $$1;
        this.d = $$2;
    }

    private ake(wx $$0) {
        this.c = $$0.b(cdb.class);
        this.b = $$0.u();
        this.d = $$0.l();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.c);
        $$0.a(this.b);
        $$0.c(this.d);
    }

    @Override
    public aba<ake> a() {
        return ahz.cu;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public cdb b() {
        return this.c;
    }

    public fti e() {
        return this.b;
    }

    public int f() {
        return this.d;
    }
}

