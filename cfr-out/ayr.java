/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ayr
implements axv {
    public static final axv.a a = new axv.a("server_code_of_conduct");
    private final Supplier<String> b;

    public ayr(Supplier<String> $$0) {
        this.b = $$0;
    }

    @Override
    public void a(Consumer<aay<?>> $$0) {
        $$0.accept(new aci(this.b.get()));
    }

    @Override
    public axv.a b() {
        return a;
    }
}

