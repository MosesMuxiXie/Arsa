/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class gss {
    public static final Supplier<Optional<yf>> a = Optional::empty;
    private final gsu<?> b;
    private final Map<String, ast.a> c = new HashMap<String, ast.a>();

    public gss(gsu<?> $$0) {
        this.b = $$0;
    }

    public void a(aso $$0, Consumer<gow> $$1) {
        String $$22 = $$0.a();
        gte.a($$0.b(), this.b, ($$2, $$3) -> {
            this.c.put($$22, $$3);
            $$1.accept($$2);
        });
    }

    private static gje.a a(asg $$0, gje.c $$1) {
        gje.a $$2 = gje.a($$0.a(), $$1);
        $$2.a($$0.c());
        if ($$0.b().isPresent()) {
            $$2 = $$2.a(gks.a($$0.b().get()));
        }
        return $$2;
    }

    public Supplier<Optional<yf>> a(Optional<ast> $$0) {
        if ($$0.isPresent()) {
            ast $$1 = $$0.get();
            return () -> $$1.a(this.c);
        }
        return a;
    }

    public gje.a a(ase $$0) {
        Supplier<Optional<yf>> $$12 = this.a($$0.b());
        return gss.a($$0.a(), $$1 -> this.b.a((Optional)$$12.get()));
    }
}

