/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.function.Consumer;

public class bhe<T> {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final Object[] e;

    public static <T> bhe<T> a(int $$0, int $$1, int $$2, a<T> $$3) {
        int $$4 = $$0 - $$2;
        int $$5 = $$1 - $$2;
        int $$6 = 2 * $$2 + 1;
        return new bhe<T>($$4, $$5, $$6, $$6, $$3);
    }

    private bhe(int $$0, int $$1, int $$2, int $$3, a<T> $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = new Object[this.c * this.d];
        for (int $$5 = $$0; $$5 < $$0 + $$2; ++$$5) {
            for (int $$6 = $$1; $$6 < $$1 + $$3; ++$$6) {
                this.e[this.c((int)$$5, (int)$$6)] = $$4.get($$5, $$6);
            }
        }
    }

    public void a(Consumer<T> $$0) {
        for (Object $$1 : this.e) {
            $$0.accept($$1);
        }
    }

    public T a(int $$0, int $$1) {
        if (!this.b($$0, $$1)) {
            throw new IllegalArgumentException("Requested out of range value (" + $$0 + "," + $$1 + ") from " + String.valueOf(this));
        }
        return (T)this.e[this.c($$0, $$1)];
    }

    public boolean b(int $$0, int $$1) {
        int $$2 = $$0 - this.a;
        int $$3 = $$1 - this.b;
        return $$2 >= 0 && $$2 < this.c && $$3 >= 0 && $$3 < this.d;
    }

    public String toString() {
        return String.format(Locale.ROOT, "StaticCache2D[%d, %d, %d, %d]", this.a, this.b, this.a + this.c, this.b + this.d);
    }

    private int c(int $$0, int $$1) {
        int $$2 = $$0 - this.a;
        int $$3 = $$1 - this.b;
        return $$2 * this.d + $$3;
    }

    @FunctionalInterface
    public static interface a<T> {
        public T get(int var1, int var2);
    }
}

