/*
 * Decompiled with CFR 0.152.
 */
public class ajm
implements aay<aib> {
    public static final aao<wx, ajm> a = aay.a(ajm::a, ajm::new);
    private final dja b;
    private final boolean c;
    private final boolean d;

    public ajm(dja $$0, boolean $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private ajm(wx $$0) {
        this.b = $$0.b(dja.class);
        this.c = $$0.readBoolean();
        this.d = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.a(this.d);
    }

    @Override
    public aba<ajm> a() {
        return ahz.cd;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public dja b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

