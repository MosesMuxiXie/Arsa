/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;

public class dvu {
    public static final Codec<dvu> a = Codec.INT_STREAM.comapFlatMap($$02 -> bhs.a($$02, 2).map($$0 -> new dvu($$0[0], $$0[1])), $$0 -> IntStream.of($$0.h, $$0.i)).stable();
    public static final aao<ByteBuf, dvu> b = new aao<ByteBuf, dvu>(){

        public dvu a(ByteBuf $$0) {
            return wx.d($$0);
        }

        public void a(ByteBuf $$0, dvu $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (dvu)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    private static final int j = 1056;
    public static final long c = dvu.d(1875066, 1875066);
    private static final int k = (32 + eri.a.a(erj.n).c().b() + 1) * 2;
    public static final int d = jw.a(is.f) - k;
    public static final dvu e = new dvu(0, 0);
    private static final long l = 32L;
    private static final long m = 0xFFFFFFFFL;
    private static final int n = 5;
    public static final int f = 32;
    private static final int o = 31;
    public static final int g = 31;
    public final int h;
    public final int i;
    private static final int p = 1664525;
    private static final int q = 1013904223;
    private static final int r = -559038737;

    public dvu(int $$0, int $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    public dvu(is $$0) {
        this.h = jw.a($$0.u());
        this.i = jw.a($$0.w());
    }

    public dvu(long $$0) {
        this.h = (int)$$0;
        this.i = (int)($$0 >> 32);
    }

    public static dvu a(int $$0, int $$1) {
        return new dvu($$0 << 5, $$1 << 5);
    }

    public static dvu b(int $$0, int $$1) {
        return new dvu(($$0 << 5) + 31, ($$1 << 5) + 31);
    }

    public boolean a() {
        return dvu.c(this.h, this.i);
    }

    public static boolean c(int $$0, int $$1) {
        return bgj.a($$0, $$1) <= d;
    }

    public long b() {
        return dvu.d(this.h, this.i);
    }

    public static long d(int $$0, int $$1) {
        return (long)$$0 & 0xFFFFFFFFL | ((long)$$1 & 0xFFFFFFFFL) << 32;
    }

    public static long a(is $$0) {
        return dvu.d(jw.a($$0.u()), jw.a($$0.w()));
    }

    public static int a(long $$0) {
        return (int)($$0 & 0xFFFFFFFFL);
    }

    public static int b(long $$0) {
        return (int)($$0 >>> 32 & 0xFFFFFFFFL);
    }

    public int hashCode() {
        return dvu.e(this.h, this.i);
    }

    public static int e(int $$0, int $$1) {
        int $$2 = 1664525 * $$0 + 1013904223;
        int $$3 = 1664525 * ($$1 ^ 0xDEADBEEF) + 1013904223;
        return $$2 ^ $$3;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof dvu) {
            dvu $$1 = (dvu)$$0;
            return this.h == $$1.h && this.i == $$1.i;
        }
        return false;
    }

    public int c() {
        return this.a(8);
    }

    public int d() {
        return this.b(8);
    }

    public int e() {
        return jw.c(this.h);
    }

    public int f() {
        return jw.c(this.i);
    }

    public int g() {
        return this.a(15);
    }

    public int h() {
        return this.b(15);
    }

    public int i() {
        return this.h >> 5;
    }

    public int j() {
        return this.i >> 5;
    }

    public int k() {
        return this.h & 0x1F;
    }

    public int l() {
        return this.i & 0x1F;
    }

    public is a(int $$0, int $$1, int $$2) {
        return new is(this.a($$0), $$1, this.b($$2));
    }

    public int a(int $$0) {
        return jw.a(this.h, $$0);
    }

    public int b(int $$0) {
        return jw.a(this.i, $$0);
    }

    public is c(int $$0) {
        return new is(this.c(), $$0, this.d());
    }

    public boolean b(is $$0) {
        return $$0.u() >= this.e() && $$0.w() >= this.f() && $$0.u() <= this.g() && $$0.w() <= this.h();
    }

    public String toString() {
        return "[" + this.h + ", " + this.i + "]";
    }

    public is m() {
        return new is(this.e(), 0, this.f());
    }

    public int a(dvu $$0) {
        return this.f($$0.h, $$0.i);
    }

    public int f(int $$0, int $$1) {
        return bgj.a($$0, $$1, this.h, this.i);
    }

    public int b(dvu $$0) {
        return this.g($$0.h, $$0.i);
    }

    public int c(long $$0) {
        return this.g(dvu.a($$0), dvu.b($$0));
    }

    private int g(int $$0, int $$1) {
        int $$2 = $$0 - this.h;
        int $$3 = $$1 - this.i;
        return $$2 * $$2 + $$3 * $$3;
    }

    public static Stream<dvu> a(dvu $$0, int $$1) {
        return dvu.a(new dvu($$0.h - $$1, $$0.i - $$1), new dvu($$0.h + $$1, $$0.i + $$1));
    }

    public static Stream<dvu> a(final dvu $$0, final dvu $$1) {
        int $$2 = Math.abs($$0.h - $$1.h) + 1;
        int $$3 = Math.abs($$0.i - $$1.i) + 1;
        final int $$4 = $$0.h < $$1.h ? 1 : -1;
        final int $$5 = $$0.i < $$1.i ? 1 : -1;
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<dvu>((long)($$2 * $$3), 64){
            private @Nullable dvu e;

            @Override
            public boolean tryAdvance(Consumer<? super dvu> $$02) {
                if (this.e == null) {
                    this.e = $$0;
                } else {
                    int $$12 = this.e.h;
                    int $$2 = this.e.i;
                    if ($$12 == $$1.h) {
                        if ($$2 == $$1.i) {
                            return false;
                        }
                        this.e = new dvu($$0.h, $$2 + $$5);
                    } else {
                        this.e = new dvu($$12 + $$4, $$2);
                    }
                }
                $$02.accept(this.e);
                return true;
            }
        }, false);
    }
}

