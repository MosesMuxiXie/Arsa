/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class ot {
    private final ol a;
    private final dqo b;
    private final dqo c;
    private final dqo d;
    private final jd<dut> e;
    private final Map<String, ak<?>> f = new LinkedHashMap();

    public ot(ol $$0, dqo $$1, dqo $$2, dqo $$3, jd<dut> $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public static ot a(dqo $$0, dqo $$1, dqo $$2, jd<dut> $$3, ol $$4) {
        return new ot($$4, $$0, $$1, $$2, $$3);
    }

    public ot a(String $$0, ak<?> $$1) {
        this.f.put($$0, $$1);
        return this;
    }

    public void a(om $$0, amt<dqs<?>> $$1) {
        this.a($$1);
        ab.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.f.forEach($$2::a);
        drq $$3 = new drq(this.b, this.c, this.d, this.e);
        $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
    }

    private void a(amt<dqs<?>> $$0) {
        if (this.f.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf($$0.a()));
        }
    }
}

