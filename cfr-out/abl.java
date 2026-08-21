/*
 * Decompiled with CFR 0.152.
 */
public class abl
implements aay<abg> {
    public static final aao<wx, abl> a = aay.a(abl::a, abl::new);
    private final long b;

    public abl(long $$0) {
        this.b = $$0;
    }

    private abl(wx $$0) {
        this.b = $$0.readLong();
    }

    @Override
    private void a(wx $$0) {
        $$0.b(this.b);
    }

    @Override
    public aba<abl> a() {
        return abu.e;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    public long b() {
        return this.b;
    }
}

