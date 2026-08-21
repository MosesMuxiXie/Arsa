/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class oo
implements ok {
    private final je<dlp> b;
    private final ol c;
    private final dlp d;
    private final int e;
    private final List<String> f = Lists.newArrayList();
    private final Map<Character, dqo> g = Maps.newLinkedHashMap();
    private final Map<String, ak<?>> h = new LinkedHashMap();
    private @Nullable String i;
    private boolean j = true;

    private oo(je<dlp> $$0, ol $$1, dwn $$2, int $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2.h();
        this.e = $$3;
    }

    public static oo a(je<dlp> $$0, ol $$1, dwn $$2) {
        return oo.a($$0, $$1, $$2, 1);
    }

    public static oo a(je<dlp> $$0, ol $$1, dwn $$2, int $$3) {
        return new oo($$0, $$1, $$2, $$3);
    }

    public oo a(Character $$0, bef<dlp> $$1) {
        return this.a($$0, dqo.a(this.b.b($$1)));
    }

    public oo a(Character $$0, dwn $$1) {
        return this.a($$0, dqo.a($$1));
    }

    public oo a(Character $$0, dqo $$1) {
        if (this.g.containsKey($$0)) {
            throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
        }
        if ($$0.charValue() == ' ') {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
        }
        this.g.put($$0, $$1);
        return this;
    }

    public oo b(String $$0) {
        if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        }
        this.f.add($$0);
        return this;
    }

    public oo b(String $$0, ak<?> $$1) {
        this.h.put($$0, $$1);
        return this;
    }

    public oo c(@Nullable String $$0) {
        this.i = $$0;
        return this;
    }

    public oo a(boolean $$0) {
        this.j = $$0;
        return this;
    }

    @Override
    public dlp a() {
        return this.d;
    }

    @Override
    public void a(om $$0, amt<dqs<?>> $$1) {
        drh $$2 = this.a($$1);
        ab.a $$3 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.h.forEach($$3::a);
        drg $$4 = new drg(Objects.requireNonNullElse(this.i, ""), ok.a(this.c), $$2, new dlt(this.d, this.e), this.j);
        $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
    }

    private drh a(amt<dqs<?>> $$0) {
        if (this.h.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf($$0.a()));
        }
        return drh.a(this.g, this.f);
    }

    @Override
    public /* synthetic */ ok a(@Nullable String string) {
        return this.c(string);
    }

    public /* synthetic */ ok a(String string, ak ak2) {
        return this.b(string, ak2);
    }
}

