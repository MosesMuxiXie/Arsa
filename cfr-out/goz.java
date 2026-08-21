/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class goz
implements gow {
    private int a;
    private int b;
    private final int c;
    private final int d;

    public goz(int $$0, int $$1) {
        this(0, 0, $$0, $$1);
    }

    public goz(int $$0, int $$1, int $$2, int $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public static goz a(int $$0) {
        return new goz($$0, 0);
    }

    public static goz b(int $$0) {
        return new goz(0, $$0);
    }

    @Override
    public void f(int $$0) {
        this.a = $$0;
    }

    @Override
    public void g(int $$0) {
        this.b = $$0;
    }

    @Override
    public int aT_() {
        return this.a;
    }

    @Override
    public int aU_() {
        return this.b;
    }

    @Override
    public int aS_() {
        return this.c;
    }

    @Override
    public int aR_() {
        return this.d;
    }

    @Override
    public void a(Consumer<gjc> $$0) {
    }
}

