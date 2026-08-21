/*
 * Decompiled with CFR 0.152.
 */
public class abm
implements aay<abg> {
    public static final aao<wx, abm> a = aay.a(abm::a, abm::new);
    private final int b;

    public abm(int $$0) {
        this.b = $$0;
    }

    private abm(wx $$0) {
        this.b = $$0.readInt();
    }

    @Override
    private void a(wx $$0) {
        $$0.q(this.b);
    }

    @Override
    public aba<abm> a() {
        return abu.f;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }
}

