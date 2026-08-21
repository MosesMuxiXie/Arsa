/*
 * Decompiled with CFR 0.152.
 */
public class akf
implements aay<aib> {
    public static final aao<wx, akf> a = aay.a(akf::a, akf::new);
    private final cdb b;
    private final int c;
    private final float d;
    private final float e;

    public akf(cdb $$0, int $$1, float $$2, float $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    private akf(wx $$0) {
        this.b = $$0.b(cdb.class);
        this.c = $$0.l();
        this.d = $$0.readFloat();
        this.e = $$0.readFloat();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.c(this.c);
        $$0.a(this.d);
        $$0.a(this.e);
    }

    @Override
    public aba<akf> a() {
        return ahz.cv;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public cdb b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }

    public float g() {
        return this.e;
    }
}

