/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface ok {
    public static final amo a = amo.b("recipes/root");

    public ok a(String var1, ak<?> var2);

    public ok a(@Nullable String var1);

    public dlp a();

    public void a(om var1, amt<dqs<?>> var2);

    default public void a(om $$0) {
        this.a($$0, amt.a(mj.bK, ok.a(this.a())));
    }

    default public void a(om $$0, String $$1) {
        amo $$2 = ok.a(this.a());
        amo $$3 = amo.a($$1);
        if ($$3.equals($$2)) {
            throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
        }
        this.a($$0, amt.a(mj.bK, $$3));
    }

    public static amo a(dwn $$0) {
        return mi.h.b($$0.h());
    }

    public static dqf a(ol $$0) {
        return switch ($$0) {
            case ol.a -> dqf.a;
            case ol.e, ol.f -> dqf.c;
            case ol.c -> dqf.b;
            default -> dqf.d;
        };
    }
}

