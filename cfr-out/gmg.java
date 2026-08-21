/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public class gmg
extends gmd {
    private static final int e = 500;

    public gmg(gio $$0, bxr $$1) {
        super($$0, $$1);
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2, int $$3) {
        this.a($$0, "500 ms", $$1 + 1, $$3 - 60 + 1);
    }

    @Override
    protected String a(double $$0) {
        return String.format(Locale.ROOT, "%d ms", (int)Math.round($$0));
    }

    @Override
    protected int b(double $$0) {
        return (int)Math.round($$0 * 60.0 / 500.0);
    }

    @Override
    protected int a(long $$0) {
        return this.a($$0, 0.0, -16711936, 250.0, -256, 500.0, -65536);
    }
}

