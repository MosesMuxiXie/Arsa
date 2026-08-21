/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public class gme
extends gmd {
    private static final int e = -16711681;
    private static final int f = -6250241;
    private static final int g = -65536;
    private static final int h = 1024;
    private static final int i = 0x100000;
    private static final int j = 0x100000;

    public gme(gio $$0, bxr $$1) {
        super($$0, $$1);
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, 64);
        this.a($$0, $$1, $$2, $$3, 1024);
        this.a($$0, $$1, $$2, $$3, 16384);
        this.a($$0, gme.c(1048576.0), $$1 + 1, $$3 - gme.d(1048576.0) + 1);
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        this.a($$0, $$1, $$2, $$3 - gme.d($$4), gme.c($$4));
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, String $$4) {
        this.a($$0, $$4, $$1 + 1, $$3 + 1);
        $$0.a($$1, $$1 + $$2 - 1, $$3, -1);
    }

    @Override
    protected String a(double $$0) {
        return gme.c(gme.e($$0));
    }

    private static String c(double $$0) {
        if ($$0 >= 1048576.0) {
            return String.format(Locale.ROOT, "%.1f MiB/s", $$0 / 1048576.0);
        }
        if ($$0 >= 1024.0) {
            return String.format(Locale.ROOT, "%.1f KiB/s", $$0 / 1024.0);
        }
        return String.format(Locale.ROOT, "%d B/s", bgj.c($$0));
    }

    @Override
    protected int b(double $$0) {
        return gme.d(gme.e($$0));
    }

    private static int d(double $$0) {
        return (int)Math.round(Math.log($$0 + 1.0) * 60.0 / Math.log(1048576.0));
    }

    @Override
    protected int a(long $$0) {
        return this.a(gme.e($$0), 0.0, -16711681, 8192.0, -6250241, 1.048576E7, -65536);
    }

    private static double e(double $$0) {
        return $$0 * 20.0;
    }
}

