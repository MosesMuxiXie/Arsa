/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class fod {
    private final axf a;
    private final bhx b;
    private final Map<amo, b> c;
    private final float d;

    public fod(axf $$0, bhx $$1, Map<amo, b> $$2, float $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public axf a() {
        return this.a;
    }

    public bhx b() {
        return this.b;
    }

    public void a(amo $$0, Consumer<dlt> $$1) {
        b $$2 = this.c.get($$0);
        if ($$2 != null) {
            $$2.add($$1);
        }
    }

    public float c() {
        return this.d;
    }

    @FunctionalInterface
    public static interface b {
        public void add(Consumer<dlt> var1);
    }

    public static class a {
        private final axf a;
        private final bhx.a b = new bhx.a();
        private final Map<amo, b> c = Maps.newHashMap();
        private float d;

        public a(axf $$0) {
            this.a = $$0;
        }

        public axf a() {
            return this.a;
        }

        public <T> a a(bhv<T> $$0, T $$1) {
            this.b.a($$0, $$1);
            return this;
        }

        public <T> a b(bhv<T> $$0, @Nullable T $$1) {
            this.b.b($$0, $$1);
            return this;
        }

        public <T> T a(bhv<T> $$0) {
            return this.b.a($$0);
        }

        public <T> @Nullable T b(bhv<T> $$0) {
            return this.b.b($$0);
        }

        public a a(amo $$0, b $$1) {
            b $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
                throw new IllegalStateException("Duplicated dynamic drop '" + String.valueOf(this.c) + "'");
            }
            return this;
        }

        public a a(float $$0) {
            this.d = $$0;
            return this;
        }

        public fod a(bhw $$0) {
            bhx $$1 = this.b.a($$0);
            return new fod(this.a, $$1, this.c, this.d);
        }
    }
}

