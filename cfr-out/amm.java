/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public class amm {
    private final String a;
    private final String b;

    public amm(String $$0, String $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static amm a(String $$0) {
        return new amm($$0, ".json");
    }

    public static amm a(amt<? extends jq<?>> $$0) {
        return amm.a(mj.c($$0));
    }

    public amo a(amo $$0) {
        return $$0.e(this.a + "/" + $$0.a() + this.b);
    }

    public amo b(amo $$0) {
        String $$1 = $$0.a();
        return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
    }

    public Map<amo, bax> a(baz $$02) {
        return $$02.b(this.a, $$0 -> $$0.a().endsWith(this.b));
    }

    public Map<amo, List<bax>> b(baz $$02) {
        return $$02.c(this.a, $$0 -> $$0.a().endsWith(this.b));
    }
}

