/*
 * Decompiled with CFR 0.152.
 */
public class ajd
implements aay<aib> {
    public static final aao<wx, ajd> a = aay.a(ajd::a, ajd::new);
    private final boolean b;
    private final boolean c;

    public ajd(boolean $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private ajd(wx $$0) {
        this.b = $$0.readBoolean();
        this.c = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public aba<ajd> a() {
        return ahz.bU;
    }

    public boolean b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

