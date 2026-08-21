/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class asa {
    private final Path a;
    private arz b;

    public asa(Path $$0) {
        this.a = $$0;
        this.b = arz.a($$0);
    }

    public arz a() {
        return this.b;
    }

    public void b() {
        this.b.c(this.a);
    }

    public asa a(UnaryOperator<arz> $$0) {
        this.b = (arz)$$0.apply(this.b);
        this.b.c(this.a);
        return this;
    }
}

