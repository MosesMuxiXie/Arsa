/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ayt
implements axv {
    public static final axv.a a = new axv.a("synchronize_registries");
    private final List<bag> b;
    private final jk<anc> c;

    public ayt(List<bag> $$0, jk<anc> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void a(Consumer<aay<?>> $$0) {
        $$0.accept(new acm(this.b));
    }

    private void a(Consumer<aay<?>> $$0, Set<bag> $$12) {
        ams<vz> $$22 = this.c.a().a(vn.a);
        ju.a($$22, this.c.c(anc.b), $$12, ($$1, $$2) -> $$0.accept(new ack((amt<? extends jq<?>>)$$1, (List<ju.a>)$$2)));
        $$0.accept(new abt(beh.a(this.c)));
    }

    public void a(List<bag> $$0, Consumer<aay<?>> $$1) {
        if ($$0.equals(this.b)) {
            this.a($$1, Set.copyOf(this.b));
        } else {
            this.a($$1, Set.of());
        }
    }

    @Override
    public axv.a b() {
        return a;
    }
}

