/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class hpv {
    private Map<eoh, hqh> a = Map.of();
    private final iob b;

    public hpv(iob $$0) {
        this.b = $$0;
    }

    public ilp a(eoh $$0) {
        return this.b($$0).a();
    }

    public hqh b(eoh $$0) {
        hqh $$1 = this.a.get($$0);
        if ($$1 == null) {
            $$1 = this.b.a();
        }
        return $$1;
    }

    public iob a() {
        return this.b;
    }

    public void a(Map<eoh, hqh> $$0) {
        this.a = $$0;
    }
}

