/*
 * Decompiled with CFR 0.152.
 */
public class aca
implements aay<abv> {
    public static final aao<wx, aca> a = aay.a(aca::a, aca::new);
    private final int b;

    public aca(int $$0) {
        this.b = $$0;
    }

    private aca(wx $$0) {
        this.b = $$0.readInt();
    }

    @Override
    private void a(wx $$0) {
        $$0.q(this.b);
    }

    @Override
    public aba<aca> a() {
        return abu.q;
    }

    @Override
    public void a(abv $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }
}

