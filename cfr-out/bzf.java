/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bzf {
    private final LongSupplier a;
    private final IntSupplier b;
    private final BooleanSupplier c;
    private bzj d = bzi.a;

    public bzf(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public boolean a() {
        return this.d != bzi.a;
    }

    public void b() {
        this.d = bzi.a;
    }

    public void c() {
        this.d = new bze(this.a, this.b, this.c);
    }

    public bzm d() {
        return this.d;
    }

    public bzk e() {
        return this.d.d();
    }
}

