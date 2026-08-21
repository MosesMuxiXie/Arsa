/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class or
implements ok {
    private final ol b;
    private final dlp c;
    private final dqo d;
    private final int e;
    private final Map<String, ak<?>> f = new LinkedHashMap();
    private @Nullable String g;
    private final drk.a<?> h;

    public or(ol $$0, drk.a<?> $$1, dqo $$2, dwn $$3, int $$4) {
        this.b = $$0;
        this.h = $$1;
        this.c = $$3.h();
        this.d = $$2;
        this.e = $$4;
    }

    public static or a(dqo $$0, ol $$1, dwn $$2) {
        return new or($$1, drs::new, $$0, $$2, 1);
    }

    public static or a(dqo $$0, ol $$1, dwn $$2, int $$3) {
        return new or($$1, drs::new, $$0, $$2, $$3);
    }

    public or b(String $$0, ak<?> $$1) {
        this.f.put($$0, $$1);
        return this;
    }

    public or b(@Nullable String $$0) {
        this.g = $$0;
        return this;
    }

    @Override
    public dlp a() {
        return this.c;
    }

    @Override
    public void a(om $$0, amt<dqs<?>> $$1) {
        this.a($$1);
        ab.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.f.forEach($$2::a);
        Object $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new dlt(this.c, this.e));
        $$0.a($$1, (dqs<?>)$$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
    }

    private void a(amt<dqs<?>> $$0) {
        if (this.f.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf($$0.a()));
        }
    }

    @Override
    public /* synthetic */ ok a(@Nullable String string) {
        return this.b(string);
    }

    public /* synthetic */ ok a(String string, ak ak2) {
        return this.b(string, ak2);
    }
}

