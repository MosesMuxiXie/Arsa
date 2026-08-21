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

public class ov
implements ok {
    private final ol b;
    private final jd<dlp> c;
    private final dqo d;
    private final dqo e;
    private final Map<String, ak<?>> f = new LinkedHashMap();
    private @Nullable String g;

    private ov(ol $$0, jd<dlp> $$1, dqo $$2, dqo $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static ov a(ol $$0, dqo $$1, dqo $$2, dlp $$3) {
        return new ov($$0, $$3.e(), $$1, $$2);
    }

    public ov b(String $$0, ak<?> $$1) {
        this.f.put($$0, $$1);
        return this;
    }

    public ov b(@Nullable String $$0) {
        this.g = $$0;
        return this;
    }

    @Override
    public dlp a() {
        return this.c.a();
    }

    @Override
    public void a(om $$0, amt<dqs<?>> $$1) {
        this.a($$1);
        ab.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.f.forEach($$2::a);
        dru $$3 = new dru(Objects.requireNonNullElse(this.g, ""), ok.a(this.b), this.d, this.e, new drv(this.c.a()));
        $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
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

