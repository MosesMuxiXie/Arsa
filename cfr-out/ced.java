/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class ced {
    private final Map<cea<?>, a<?>> a = new Reference2ObjectOpenHashMap();
    private final Function<cea<?>, a<?>> b = $$0 -> new a($$0);
    @Nullable dwo c;
    @Nullable ftm d;
    final cej e = new cej();

    public void a() {
        this.c = null;
        this.d = null;
        this.e.a();
        this.a.clear();
    }

    public void a(dwo $$02, ftm $$12) {
        this.c = $$02;
        this.d = $$12;
        this.a.values().removeIf(a::a);
        this.e.a();
        ceh.a($$12.c(0.25), $$02.H_()::a, ($$0, $$1) -> this.e.a($$0, ((dxo)$$1.a()).g()));
    }

    public <Value> Value a(cea<Value> $$0, float $$1) {
        a<?> $$2 = this.a.computeIfAbsent($$0, this.b);
        return (Value)$$2.a($$0, $$1);
    }

    class a<Value> {
        private Value b;
        private @Nullable Value c;

        public a(cea<Value> $$0) {
            Value $$1 = this.a($$0);
            this.b = $$1;
            this.c = $$1;
        }

        private Value a(cea<Value> $$0) {
            if (ced.this.c == null || ced.this.d == null) {
                return $$0.b();
            }
            return ced.this.c.c().a($$0, ced.this.d, ced.this.e);
        }

        public boolean a() {
            if (this.c == null) {
                return true;
            }
            this.b = this.c;
            this.c = null;
            return false;
        }

        public Value a(cea<Value> $$0, float $$1) {
            if (this.c == null) {
                this.c = this.a($$0);
            }
            return $$0.a().g().apply($$1, this.b, this.c);
        }
    }
}

