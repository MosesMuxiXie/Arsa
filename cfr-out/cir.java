/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class cir {
    private final Map<jd<cin>, cio> a;

    cir(Map<jd<cin>, cio> $$0) {
        this.a = $$0;
    }

    private cio d(jd<cin> $$0) {
        cio $$1 = this.a.get($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("Can't find attribute " + $$0.g());
        }
        return $$1;
    }

    public double a(jd<cin> $$0) {
        return this.d($$0).g();
    }

    public double b(jd<cin> $$0) {
        return this.d($$0).b();
    }

    public double a(jd<cin> $$0, amo $$1) {
        ciq $$2 = this.d($$0).a($$1);
        if ($$2 == null) {
            throw new IllegalArgumentException("Can't find modifier " + String.valueOf($$1) + " on attribute " + $$0.g());
        }
        return $$2.b();
    }

    public @Nullable cio a(Consumer<cio> $$0, jd<cin> $$1) {
        cio $$2 = this.a.get($$1);
        if ($$2 == null) {
            return null;
        }
        cio $$3 = new cio($$1, $$0);
        $$3.a($$2);
        return $$3;
    }

    public static a a() {
        return new a();
    }

    public boolean c(jd<cin> $$0) {
        return this.a.containsKey($$0);
    }

    public boolean b(jd<cin> $$0, amo $$1) {
        cio $$2 = this.a.get($$0);
        return $$2 != null && $$2.a($$1) != null;
    }

    public static class a {
        private final ImmutableMap.Builder<jd<cin>, cio> a = ImmutableMap.builder();
        private boolean b;

        private cio b(jd<cin> $$0) {
            cio $$12 = new cio($$0, $$1 -> {
                if (this.b) {
                    throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
                }
            });
            this.a.put($$0, (Object)$$12);
            return $$12;
        }

        public a a(jd<cin> $$0) {
            this.b($$0);
            return this;
        }

        public a a(jd<cin> $$0, double $$1) {
            cio $$2 = this.b($$0);
            $$2.a($$1);
            return this;
        }

        public cir a() {
            this.b = true;
            return new cir((Map<jd<cin>, cio>)this.a.buildKeepingLast());
        }
    }
}

