/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class bhx {
    private final Map<bhv<?>, Object> a;

    bhx(Map<bhv<?>, Object> $$0) {
        this.a = $$0;
    }

    public boolean a(bhv<?> $$0) {
        return this.a.containsKey($$0);
    }

    public <T> T b(bhv<T> $$0) {
        Object $$1 = this.a.get($$0);
        if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
        }
        return (T)$$1;
    }

    public <T> @Nullable T c(bhv<T> $$0) {
        return (T)this.a.get($$0);
    }

    @Contract(value="_,!null->!null; _,_->_")
    public <T> @Nullable T a(bhv<T> $$0, @Nullable T $$1) {
        return (T)this.a.getOrDefault($$0, $$1);
    }

    public static class a {
        private final Map<bhv<?>, Object> a = new IdentityHashMap();

        public <T> a a(bhv<T> $$0, T $$1) {
            this.a.put($$0, $$1);
            return this;
        }

        public <T> a b(bhv<T> $$0, @Nullable T $$1) {
            if ($$1 == null) {
                this.a.remove($$0);
            } else {
                this.a.put($$0, $$1);
            }
            return this;
        }

        public <T> T a(bhv<T> $$0) {
            Object $$1 = this.a.get($$0);
            if ($$1 == null) {
                throw new NoSuchElementException($$0.a().toString());
            }
            return (T)$$1;
        }

        public <T> @Nullable T b(bhv<T> $$0) {
            return (T)this.a.get($$0);
        }

        public bhx a(bhw $$0) {
            Sets.SetView $$1 = Sets.difference(this.a.keySet(), $$0.b());
            if (!$$1.isEmpty()) {
                throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + String.valueOf($$1));
            }
            Sets.SetView $$2 = Sets.difference($$0.a(), this.a.keySet());
            if (!$$2.isEmpty()) {
                throw new IllegalArgumentException("Missing required parameters: " + String.valueOf($$2));
            }
            return new bhx(this.a);
        }
    }
}

