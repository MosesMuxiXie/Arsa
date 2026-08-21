/*
 * Decompiled with CFR 0.152.
 */
public class iec
extends idf {
    public final ihm a = new ihm();
    public int b;
    public int c;

    public void a(cgk $$0, dlt $$1, ihk $$2) {
        $$2.a(this.a, $$1, dlr.h, $$0);
        this.b = iec.a($$1.N());
        this.c = iec.a($$1);
    }

    public static int a(dlt $$0) {
        return $$0.f() ? 187 : dlp.a($$0.h()) + $$0.o();
    }

    public static int a(int $$0) {
        if ($$0 <= 1) {
            return 1;
        }
        if ($$0 <= 16) {
            return 2;
        }
        if ($$0 <= 32) {
            return 3;
        }
        if ($$0 <= 48) {
            return 4;
        }
        return 5;
    }
}

