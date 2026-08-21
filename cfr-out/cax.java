/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  it.unimi.dsi.fastutil.ints.Int2DoubleMap
 *  it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class cax {
    private final String b;
    private final caw c;
    private final DoubleSupplier d;
    private final ByteBuf e;
    private final ByteBuf f;
    private volatile boolean g;
    private final @Nullable Runnable h;
    final @Nullable c a;
    private double i;

    protected cax(String $$0, caw $$1, DoubleSupplier $$2, @Nullable Runnable $$3, @Nullable c $$4) {
        this.b = $$0;
        this.c = $$1;
        this.h = $$3;
        this.d = $$2;
        this.a = $$4;
        this.f = ByteBufAllocator.DEFAULT.buffer();
        this.e = ByteBufAllocator.DEFAULT.buffer();
        this.g = true;
    }

    public static cax a(String $$0, caw $$1, DoubleSupplier $$2) {
        return new cax($$0, $$1, $$2, null, null);
    }

    public static <T> cax a(String $$0, caw $$1, T $$2, ToDoubleFunction<T> $$3) {
        return cax.a($$0, $$1, $$3, $$2).a();
    }

    public static <T> a<T> a(String $$0, caw $$1, ToDoubleFunction<T> $$2, T $$3) {
        if ($$2 == null) {
            throw new IllegalStateException();
        }
        return new a<T>($$0, $$1, $$2, $$3);
    }

    public void a() {
        if (!this.g) {
            throw new IllegalStateException("Not running");
        }
        if (this.h != null) {
            this.h.run();
        }
    }

    public void a(int $$0) {
        this.h();
        this.i = this.d.getAsDouble();
        this.f.writeDouble(this.i);
        this.e.writeInt($$0);
    }

    public void b() {
        this.h();
        this.f.release();
        this.e.release();
        this.g = false;
    }

    private void h() {
        if (!this.g) {
            throw new IllegalStateException(String.format(Locale.ROOT, "Sampler for metric %s not started!", this.b));
        }
    }

    DoubleSupplier c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public caw e() {
        return this.c;
    }

    public b f() {
        Int2DoubleOpenHashMap $$0 = new Int2DoubleOpenHashMap();
        int $$1 = Integer.MIN_VALUE;
        int $$2 = Integer.MIN_VALUE;
        while (this.f.isReadable(8)) {
            int $$3 = this.e.readInt();
            if ($$1 == Integer.MIN_VALUE) {
                $$1 = $$3;
            }
            $$0.put($$3, this.f.readDouble());
            $$2 = $$3;
        }
        return new b($$1, $$2, (Int2DoubleMap)$$0);
    }

    public boolean g() {
        return this.a != null && this.a.test(this.i);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        cax $$1 = (cax)$$0;
        return this.b.equals($$1.b) && this.c.equals((Object)$$1.c);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public static interface c {
        public boolean test(double var1);
    }

    public static class a<T> {
        private final String a;
        private final caw b;
        private final DoubleSupplier c;
        private final T d;
        private @Nullable Runnable e;
        private @Nullable c f;

        public a(String $$0, caw $$1, ToDoubleFunction<T> $$2, T $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = () -> $$2.applyAsDouble($$3);
            this.d = $$3;
        }

        public a<T> a(Consumer<T> $$0) {
            this.e = () -> $$0.accept(this.d);
            return this;
        }

        public a<T> a(c $$0) {
            this.f = $$0;
            return this;
        }

        public cax a() {
            return new cax(this.a, this.b, this.c, this.e, this.f);
        }
    }

    public static class b {
        private final Int2DoubleMap a;
        private final int b;
        private final int c;

        public b(int $$0, int $$1, Int2DoubleMap $$2) {
            this.b = $$0;
            this.c = $$1;
            this.a = $$2;
        }

        public double a(int $$0) {
            return this.a.get($$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }

    public static class d
    implements c {
        private final float a;
        private double b = Double.MIN_VALUE;

        public d(float $$0) {
            this.a = $$0;
        }

        @Override
        public boolean test(double $$0) {
            boolean $$2;
            if (this.b == Double.MIN_VALUE || $$0 <= this.b) {
                boolean $$1 = false;
            } else {
                $$2 = ($$0 - this.b) / this.b >= (double)this.a;
            }
            this.b = $$0;
            return $$2;
        }
    }
}

