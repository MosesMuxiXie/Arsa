/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class op
implements ok {
    private final je<dlp> b;
    private final ol c;
    private final dlt d;
    private final List<dqo> e = new ArrayList<dqo>();
    private final Map<String, ak<?>> f = new LinkedHashMap();
    private @Nullable String g;

    private op(je<dlp> $$0, ol $$1, dlt $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public static op a(je<dlp> $$0, ol $$1, dlt $$2) {
        return new op($$0, $$1, $$2);
    }

    public static op a(je<dlp> $$0, ol $$1, dwn $$2) {
        return op.a($$0, $$1, $$2, 1);
    }

    public static op a(je<dlp> $$0, ol $$1, dwn $$2, int $$3) {
        return new op($$0, $$1, $$2.h().m().c($$3));
    }

    public op a(bef<dlp> $$0) {
        return this.a(dqo.a(this.b.b($$0)));
    }

    public op b(dwn $$0) {
        return this.a($$0, 1);
    }

    public op a(dwn $$0, int $$1) {
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            this.a(dqo.a($$0));
        }
        return this;
    }

    public op a(dqo $$0) {
        return this.a($$0, 1);
    }

    public op a(dqo $$0, int $$1) {
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            this.e.add($$0);
        }
        return this;
    }

    public op b(String $$0, ak<?> $$1) {
        this.f.put($$0, $$1);
        return this;
    }

    public op b(@Nullable String $$0) {
        this.g = $$0;
        return this;
    }

    @Override
    public dlp a() {
        return this.d.h();
    }

    @Override
    public void a(om $$0, amt<dqs<?>> $$1) {
        this.a($$1);
        ab.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.f.forEach($$2::a);
        dri $$3 = new dri(Objects.requireNonNullElse(this.g, ""), ok.a(this.c), this.d, this.e);
        $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
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

