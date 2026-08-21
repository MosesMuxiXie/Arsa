/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  org.apache.commons.lang3.ObjectUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ama {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 254;
    static final bew c = new bew();
    private final alz d;
    private final b<?>[] e;
    private boolean f;

    ama(alz $$0, b<?>[] $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static <T> alw<T> a(Class<? extends alz> $$0, alx<T> $$1) {
        int $$3;
        if (a.isDebugEnabled()) {
            try {
                Class<?> $$2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
                if (!$$2.equals($$0)) {
                    a.debug("defineId called for: {} from {}", new Object[]{$$0, $$2, new RuntimeException()});
                }
            }
            catch (ClassNotFoundException $$2) {
                // empty catch block
            }
        }
        if (($$3 = c.c($$0)) > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + $$3 + "! (Max is 254)");
        }
        return $$1.a($$3);
    }

    private <T> b<T> b(alw<T> $$0) {
        return this.e[$$0.a()];
    }

    public <T> T a(alw<T> $$0) {
        return this.b($$0).b();
    }

    public <T> void a(alw<T> $$0, T $$1) {
        this.a($$0, $$1, false);
    }

    public <T> void a(alw<T> $$0, T $$1, boolean $$2) {
        b<T> $$3 = this.b($$0);
        if ($$2 || ObjectUtils.notEqual($$1, $$3.b())) {
            $$3.a($$1);
            this.d.a($$0);
            $$3.a(true);
            this.f = true;
        }
    }

    public boolean a() {
        return this.f;
    }

    public @Nullable List<c<?>> b() {
        if (!this.f) {
            return null;
        }
        this.f = false;
        ArrayList $$0 = new ArrayList();
        for (b<?> $$1 : this.e) {
            if (!$$1.c()) continue;
            $$1.a(false);
            $$0.add($$1.e());
        }
        return $$0;
    }

    public @Nullable List<c<?>> c() {
        ArrayList $$0 = null;
        for (b<?> $$1 : this.e) {
            if ($$1.d()) continue;
            if ($$0 == null) {
                $$0 = new ArrayList();
            }
            $$0.add($$1.e());
        }
        return $$0;
    }

    public void a(List<c<?>> $$0) {
        for (c<?> $$1 : $$0) {
            b<?> $$2 = this.e[$$1.a];
            this.a($$2, $$1);
            this.d.a($$2.a());
        }
        this.d.a($$0);
    }

    private <T> void a(b<T> $$0, c<?> $$1) {
        if (!Objects.equals($$1.b(), $$0.a.b())) {
            throw new IllegalStateException(String.format(Locale.ROOT, "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)", $$0.a.a(), this.d, $$0.b, $$0.b.getClass(), $$1.c, $$1.c.getClass()));
        }
        $$0.a($$1.c);
    }

    public static class b<T> {
        final alw<T> a;
        T b;
        private final T c;
        private boolean d;

        public b(alw<T> $$0, T $$1) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$1;
        }

        public alw<T> a() {
            return this.a;
        }

        public void a(T $$0) {
            this.b = $$0;
        }

        public T b() {
            return this.b;
        }

        public boolean c() {
            return this.d;
        }

        public void a(boolean $$0) {
            this.d = $$0;
        }

        public boolean d() {
            return this.c.equals(this.b);
        }

        public c<T> e() {
            return ama$c.a(this.a, this.b);
        }
    }

    public static final class c<T>
    extends Record {
        final int a;
        private final alx<T> b;
        final T c;

        public c(int $$0, alx<T> $$1, T $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public static <T> c<T> a(alw<T> $$0, T $$1) {
            alx<T> $$2 = $$0.b();
            return new c<T>($$0.a(), $$2, $$2.copy($$1));
        }

        public void a(xq $$0) {
            int $$1 = aly.b(this.b);
            if ($$1 < 0) {
                throw new EncoderException("Unknown serializer type " + String.valueOf(this.b));
            }
            $$0.l(this.a);
            $$0.c($$1);
            this.b.codec().encode($$0, this.c);
        }

        public static c<?> a(xq $$0, int $$1) {
            int $$2 = $$0.l();
            alx<?> $$3 = aly.a($$2);
            if ($$3 == null) {
                throw new DecoderException("Unknown serializer type " + $$2);
            }
            return ama$c.a($$0, $$1, $$3);
        }

        private static <T> c<T> a(xq $$0, int $$1, alx<T> $$2) {
            return new c<T>($$1, $$2, $$2.codec().decode($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id;serializer;value", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id;serializer;value", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id;serializer;value", "a", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public alx<T> b() {
            return this.b;
        }

        public T c() {
            return this.c;
        }
    }

    public static class a {
        private final alz a;
        private final @Nullable b<?>[] b;

        public a(alz $$0) {
            this.a = $$0;
            this.b = new b[c.b($$0.getClass())];
        }

        public <T> a a(alw<T> $$0, T $$1) {
            int $$2 = $$0.a();
            if ($$2 > this.b.length) {
                throw new IllegalArgumentException("Data value id is too big with " + $$2 + "! (Max is " + this.b.length + ")");
            }
            if (this.b[$$2] != null) {
                throw new IllegalArgumentException("Duplicate id value for " + $$2 + "!");
            }
            if (aly.b($$0.b()) < 0) {
                throw new IllegalArgumentException("Unregistered serializer " + String.valueOf($$0.b()) + " for " + $$2 + "!");
            }
            this.b[$$0.a()] = new b<T>($$0, $$1);
            return this;
        }

        public ama a() {
            for (int $$0 = 0; $$0 < this.b.length; ++$$0) {
                if (this.b[$$0] != null) continue;
                throw new IllegalStateException("Entity " + String.valueOf(this.a.getClass()) + " has not defined synched data value " + $$0);
            }
            return new ama(this.a, this.b);
        }
    }
}

