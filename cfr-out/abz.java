/*
 * Decompiled with CFR 0.152.
 */
public class abz
implements aay<abv> {
    public static final aao<wx, abz> a = aay.a(abz::a, abz::new);
    private final long b;

    public abz(long $$0) {
        this.b = $$0;
    }

    private abz(wx $$0) {
        this.b = $$0.readLong();
    }

    @Override
    private void a(wx $$0) {
        $$0.b(this.b);
    }

    @Override
    public aba<abz> a() {
        return abu.p;
    }

    @Override
    public void a(abv $$0) {
        $$0.a(this);
    }

    public long b() {
        return this.b;
    }
}

