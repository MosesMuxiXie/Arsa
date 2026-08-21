/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.function.Supplier;

public class gmi
extends gmd {
    private static final int e = -6745839;
    private static final int f = -4548257;
    private static final int g = -10547572;
    private final Supplier<Float> h;

    public gmi(gio $$0, bxr $$1, Supplier<Float> $$2) {
        super($$0, $$1);
        this.h = $$2;
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2, int $$3) {
        float $$4 = (float)bhn.c / this.h.get().floatValue();
        this.a($$0, String.format(Locale.ROOT, "%.1f TPS", Float.valueOf($$4)), $$1 + 1, $$3 - 60 + 1);
    }

    @Override
    protected void c(gir $$0, int $$1, int $$2, int $$3) {
        long $$4 = this.d.a($$3, bxs.b.ordinal());
        int $$5 = this.b($$4);
        $$0.a($$2, $$1 - $$5, $$2 + 1, $$1, -6745839);
        long $$6 = this.d.a($$3, bxs.c.ordinal());
        int $$7 = this.b($$6);
        $$0.a($$2, $$1 - $$5 - $$7, $$2 + 1, $$1 - $$5, -4548257);
        long $$8 = this.d.a($$3) - this.d.a($$3, bxs.d.ordinal()) - $$4 - $$6;
        int $$9 = this.b($$8);
        $$0.a($$2, $$1 - $$9 - $$7 - $$5, $$2 + 1, $$1 - $$7 - $$5, -10547572);
    }

    @Override
    protected long b(int $$0) {
        return this.d.a($$0) - this.d.a($$0, bxs.d.ordinal());
    }

    @Override
    protected String a(double $$0) {
        return String.format(Locale.ROOT, "%d ms", (int)Math.round(gmi.c($$0)));
    }

    @Override
    protected int b(double $$0) {
        return (int)Math.round(gmi.c($$0) * 60.0 / (double)this.h.get().floatValue());
    }

    @Override
    protected int a(long $$0) {
        float $$1 = this.h.get().floatValue();
        return this.a(gmi.c($$0), $$1, -16711936, (double)$$1 * 1.125, -256, (double)$$1 * 1.25, -65536);
    }

    private static double c(double $$0) {
        return $$0 / 1000000.0;
    }
}

