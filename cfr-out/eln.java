/*
 * Decompiled with CFR 0.152.
 */
public class eln
extends elb {
    private static final int a = 0;
    private int b = 0;

    public eln(is $$0, eoh $$1) {
        super(eld.t, $$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("OutputSignal", this.b);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b = $$0.a("OutputSignal", 0);
    }

    public int a() {
        return this.b;
    }

    public void a(int $$0) {
        this.b = $$0;
    }
}

