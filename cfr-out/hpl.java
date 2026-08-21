/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class hpl {
    public static final hpl a = new hpl(Map.of());
    private final Map<dzq, iki<?>> b;

    public hpl(Map<dzq, iki<?>> $$0) {
        this.b = $$0;
    }

    public static hpl a(iki.a $$0) {
        return new hpl(ikj.a($$0));
    }

    public void a(dzq $$0, dlr $$1, fzm $$2, hpo $$3, int $$4, int $$5, int $$6) {
        iki<?> $$7 = this.b.get($$0);
        if ($$7 != null) {
            $$7.a(null, $$1, $$2, $$3, $$4, $$5, false, $$6);
        }
    }
}

