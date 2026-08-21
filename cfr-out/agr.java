/*
 * Decompiled with CFR 0.152.
 */
public class agr
implements aay<adb> {
    public static final aao<wx, agr> a = aay.a(agr::a, agr::new);
    private final int b;
    private final ftm c;

    public agr(cgk $$0) {
        this($$0.aA(), $$0.dN());
    }

    public agr(int $$0, ftm $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private agr(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.k();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.b(this.c);
    }

    @Override
    public aba<agr> a() {
        return ahz.aM;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public ftm e() {
        return this.c;
    }
}

