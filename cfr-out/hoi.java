/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class hoi
implements hov.a {
    public static final amo a = hov.a;
    public static final amo b = amo.b("translucent");
    public static final amo c = amo.b("item_entity");
    public static final amo d = amo.b("particles");
    public static final amo e = amo.b("weather");
    public static final amo f = amo.b("clouds");
    public static final amo g = amo.b("entity_outline");
    public static final Set<amo> h = Set.of(a);
    public static final Set<amo> i = Set.of(a, g);
    public static final Set<amo> j = Set.of(a, b, c, d, e, f);
    public fyw<fxt> k = fyw.a();
    public @Nullable fyw<fxt> l;
    public @Nullable fyw<fxt> m;
    public @Nullable fyw<fxt> n;
    public @Nullable fyw<fxt> o;
    public @Nullable fyw<fxt> p;
    public @Nullable fyw<fxt> q;

    @Override
    public void a(amo $$0, fyw<fxt> $$1) {
        if ($$0.equals(a)) {
            this.k = $$1;
        } else if ($$0.equals(b)) {
            this.l = $$1;
        } else if ($$0.equals(c)) {
            this.m = $$1;
        } else if ($$0.equals(d)) {
            this.n = $$1;
        } else if ($$0.equals(e)) {
            this.o = $$1;
        } else if ($$0.equals(f)) {
            this.p = $$1;
        } else if ($$0.equals(g)) {
            this.q = $$1;
        } else {
            throw new IllegalArgumentException("No target with id " + String.valueOf($$0));
        }
    }

    @Override
    public @Nullable fyw<fxt> a(amo $$0) {
        if ($$0.equals(a)) {
            return this.k;
        }
        if ($$0.equals(b)) {
            return this.l;
        }
        if ($$0.equals(c)) {
            return this.m;
        }
        if ($$0.equals(d)) {
            return this.n;
        }
        if ($$0.equals(e)) {
            return this.o;
        }
        if ($$0.equals(f)) {
            return this.p;
        }
        if ($$0.equals(g)) {
            return this.q;
        }
        return null;
    }

    public void a() {
        this.k = fyw.a();
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }
}

