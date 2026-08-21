/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class imr
extends bbd<imq> {
    private static final amm a = amm.a("waypoint_style");
    private static final imq b = new imq(0, 1, List.of(ilf.c()));
    private Map<amt<fvv>, imq> c = Map.of();

    public imr() {
        super(imq.d, a);
    }

    @Override
    protected void a(Map<amo, imq> $$02, baz $$1, bzm $$2) {
        this.c = $$02.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0 -> amt.a(fvw.a, (amo)$$0.getKey()), Map.Entry::getValue));
    }

    public imq a(amt<fvv> $$0) {
        return this.c.getOrDefault($$0, b);
    }
}

