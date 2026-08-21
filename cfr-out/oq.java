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

public class oq
implements ok {
    private final ol b;
    private final dqe c;
    private final dlp d;
    private final dqo e;
    private final float f;
    private final int g;
    private final Map<String, ak<?>> h = new LinkedHashMap();
    private @Nullable String i;
    private final dpy.a<?> j;

    private oq(ol $$0, dqe $$1, dwn $$2, dqo $$3, float $$4, int $$5, dpy.a<?> $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2.h();
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.j = $$6;
    }

    public static <T extends dpy> oq a(dqo $$0, ol $$1, dwn $$2, float $$3, int $$4, drc<T> $$5, dpy.a<T> $$6) {
        return new oq($$1, oq.a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
    }

    public static oq a(dqo $$0, ol $$1, dwn $$2, float $$3, int $$4) {
        return new oq($$1, dqe.a, $$2, $$0, $$3, $$4, dqd::new);
    }

    public static oq b(dqo $$0, ol $$1, dwn $$2, float $$3, int $$4) {
        return new oq($$1, oq.c($$2), $$2, $$0, $$3, $$4, dqb::new);
    }

    public static oq c(dqo $$0, ol $$1, dwn $$2, float $$3, int $$4) {
        return new oq($$1, oq.b($$2), $$2, $$0, $$3, $$4, drm::new);
    }

    public static oq d(dqo $$0, ol $$1, dwn $$2, float $$3, int $$4) {
        return new oq($$1, dqe.a, $$2, $$0, $$3, $$4, drr::new);
    }

    public oq b(String $$0, ak<?> $$1) {
        this.h.put($$0, $$1);
        return this;
    }

    public oq b(@Nullable String $$0) {
        this.i = $$0;
        return this;
    }

    @Override
    public dlp a() {
        return this.d;
    }

    @Override
    public void a(om $$0, amt<dqs<?>> $$1) {
        this.a($$1);
        ab.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(ag.a.c($$1)).a(af.a.b);
        this.h.forEach($$2::a);
        Object $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new dlt(this.d), this.f, this.g);
        $$0.a($$1, (dqs<?>)$$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
    }

    private static dqe b(dwn $$0) {
        if ($$0.h().f().c(ki.y)) {
            return dqe.a;
        }
        if ($$0.h() instanceof dkb) {
            return dqe.b;
        }
        return dqe.c;
    }

    private static dqe c(dwn $$0) {
        if ($$0.h() instanceof dkb) {
            return dqe.b;
        }
        return dqe.c;
    }

    private static dqe a(drc<? extends dpy> $$0, dwn $$1) {
        if ($$0 == drc.o) {
            return oq.b($$1);
        }
        if ($$0 == drc.p) {
            return oq.c($$1);
        }
        if ($$0 == drc.q || $$0 == drc.r) {
            return dqe.a;
        }
        throw new IllegalStateException("Unknown cooking recipe type");
    }

    private void a(amt<dqs<?>> $$0) {
        if (this.h.isEmpty()) {
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

