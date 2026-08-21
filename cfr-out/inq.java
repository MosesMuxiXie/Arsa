/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.stream.Collectors;

public class inq
extends bbd<inr> {
    public static final inr a = new inr(Map.of());
    private static final amm b = amm.a("equipment");
    private Map<amt<dul>, inr> c = Map.of();

    public inq() {
        super(inr.a, b);
    }

    @Override
    protected void a(Map<amo, inr> $$02, baz $$1, bzm $$2) {
        this.c = $$02.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0 -> amt.a(dum.a, (amo)$$0.getKey()), Map.Entry::getValue));
    }

    public inr a(amt<dul> $$0) {
        return this.c.getOrDefault($$0, a);
    }
}

