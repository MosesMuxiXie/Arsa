/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class cfz {
    private static final int a = Integer.MIN_VALUE;
    private int b = Integer.MIN_VALUE;

    public void a(int $$0) {
        this.b = $$0;
    }

    public void b(int $$0) {
        if (!this.b()) {
            this.a($$0);
        }
    }

    public void a(boolean $$0, int $$1) {
        if ($$0) {
            this.b($$1);
        } else {
            this.a();
        }
    }

    public void a() {
        this.b = Integer.MIN_VALUE;
    }

    public void a(Consumer<cfz> $$0) {
        if (this.b()) {
            $$0.accept(this);
        }
    }

    public void a(int $$0, float $$1) {
        if (!this.b()) {
            return;
        }
        this.b -= (int)((float)$$0 * $$1);
    }

    public long a(float $$0) {
        float $$1 = $$0 - (float)this.b;
        return (long)($$1 * 50.0f);
    }

    public boolean b() {
        return this.b != Integer.MIN_VALUE;
    }

    public void a(cfz $$0) {
        this.b = $$0.b;
    }
}

