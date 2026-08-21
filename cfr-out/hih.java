/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class hih
implements dqt {
    private final Map<amt<drb>, drb> a;
    private final drf.b<drs> b;

    public hih(Map<amt<drb>, drb> $$0, drf.b<drs> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public drb a(amt<drb> $$0) {
        return this.a.getOrDefault($$0, drb.j);
    }

    @Override
    public drf.b<drs> a() {
        return this.b;
    }
}

