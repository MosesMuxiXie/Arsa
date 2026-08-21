/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class os {
    private final dqo a;
    private final dqo b;
    private final dqo c;
    private final ol d;
    private final dlp e;
    private final Map<String, ak<?>> f = new LinkedHashMap();

    public os(dqo $$0, dqo $$1, dqo $$2, ol $$3, dlp $$4) {
        this.d = $$3;
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.e = $$4;
    }

    public static os a(dqo $$0, dqo $$1, dqo $$2, ol $$3, dlp $$4) {
        return new os($$0, $$1, $$2, $$3, $$4);
    }

    public os a(String $$0, ak<?> $$1) {
        this.f.put($$0, $$1);
        return this;
    }

    public void a(om $$0, String $$1) {
        this.a($$0, amt.a(mj.bK, amo.a($$1)));
    }

    public void a(om $$0, amt<dqs<?>> $$1) {
        this.a($$1);
        ab.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.f.forEach($$2::a);
        drp $$3 = new drp(Optional.of(this.a), this.b, Optional.of(this.c), new drv(this.e));
        $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
    }

    private void a(amt<dqs<?>> $$0) {
        if (this.f.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf($$0.a()));
        }
    }
}

