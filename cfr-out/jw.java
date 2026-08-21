/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.longs.LongConsumer
 */
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongConsumer;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class jw
extends jy {
    public static final int a = 4;
    public static final int b = 16;
    public static final int c = 15;
    public static final int d = 8;
    public static final int e = 15;
    private static final int j = 22;
    private static final int k = 20;
    private static final int l = 22;
    private static final long m = 0x3FFFFFL;
    private static final long n = 1048575L;
    private static final long o = 0x3FFFFFL;
    private static final int p = 0;
    private static final int q = 20;
    private static final int r = 42;
    private static final int s = 8;
    private static final int t = 0;
    private static final int u = 4;
    public static final aao<ByteBuf, jw> f = aam.j.a(jw::a, jw::s);

    jw(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    public static jw a(int $$0, int $$1, int $$2) {
        return new jw($$0, $$1, $$2);
    }

    public static jw a(is $$0) {
        return new jw(jw.a($$0.u()), jw.a($$0.v()), jw.a($$0.w()));
    }

    public static jw a(dvu $$0, int $$1) {
        return new jw($$0.h, $$1, $$0.i);
    }

    public static jw a(esp $$0) {
        return jw.a($$0.dK());
    }

    public static jw a(jn $$0) {
        return new jw(jw.b($$0.a()), jw.b($$0.b()), jw.b($$0.c()));
    }

    public static jw a(long $$0) {
        return new jw(jw.b($$0), jw.c($$0), jw.d($$0));
    }

    public static jw a(eqf $$0) {
        return jw.a($$0.f(), $$0.ay());
    }

    public static long a(long $$0, iz $$1) {
        return jw.a($$0, $$1.j(), $$1.k(), $$1.l());
    }

    public static long a(long $$0, int $$1, int $$2, int $$3) {
        return jw.b(jw.b($$0) + $$1, jw.c($$0) + $$2, jw.d($$0) + $$3);
    }

    public static int a(double $$0) {
        return jw.a(bgj.c($$0));
    }

    public static int a(int $$0) {
        return $$0 >> 4;
    }

    public static int b(double $$0) {
        return bgj.c($$0) >> 4;
    }

    public static int b(int $$0) {
        return $$0 & 0xF;
    }

    public static short b(is $$0) {
        int $$1 = jw.b($$0.u());
        int $$2 = jw.b($$0.v());
        int $$3 = jw.b($$0.w());
        return (short)($$1 << 8 | $$3 << 4 | $$2 << 0);
    }

    public static int a(short $$0) {
        return $$0 >>> 8 & 0xF;
    }

    public static int b(short $$0) {
        return $$0 >>> 0 & 0xF;
    }

    public static int c(short $$0) {
        return $$0 >>> 4 & 0xF;
    }

    public int d(short $$0) {
        return this.d() + jw.a($$0);
    }

    public int e(short $$0) {
        return this.e() + jw.b($$0);
    }

    public int f(short $$0) {
        return this.f() + jw.c($$0);
    }

    public is g(short $$0) {
        return new is(this.d($$0), this.e($$0), this.f($$0));
    }

    public static int c(int $$0) {
        return $$0 << 4;
    }

    public static int a(int $$0, int $$1) {
        return jw.c($$0) + $$1;
    }

    public static int b(long $$0) {
        return (int)($$0 << 0 >> 42);
    }

    public static int c(long $$0) {
        return (int)($$0 << 44 >> 44);
    }

    public static int d(long $$0) {
        return (int)($$0 << 22 >> 42);
    }

    public int a() {
        return this.u();
    }

    public int b() {
        return this.v();
    }

    public int c() {
        return this.w();
    }

    public int d() {
        return jw.c(this.a());
    }

    public int e() {
        return jw.c(this.b());
    }

    public int f() {
        return jw.c(this.c());
    }

    public int g() {
        return jw.a(this.a(), 15);
    }

    public int h() {
        return jw.a(this.b(), 15);
    }

    public int i() {
        return jw.a(this.c(), 15);
    }

    public static long e(long $$0) {
        return jw.b(jw.a(is.a($$0)), jw.a(is.b($$0)), jw.a(is.c($$0)));
    }

    public static long b(int $$0, int $$1) {
        return jw.f(jw.b($$0, 0, $$1));
    }

    public static long f(long $$0) {
        return $$0 & 0xFFFFFFFFFFF00000L;
    }

    public static long g(long $$0) {
        return dvu.d(jw.b($$0), jw.d($$0));
    }

    public is j() {
        return new is(jw.c(this.a()), jw.c(this.b()), jw.c(this.c()));
    }

    public is k() {
        int $$0 = 8;
        return this.j().b(8, 8, 8);
    }

    public dvu r() {
        return new dvu(this.a(), this.c());
    }

    public static long c(is $$0) {
        return jw.b(jw.a($$0.u()), jw.a($$0.v()), jw.a($$0.w()));
    }

    public static long b(int $$0, int $$1, int $$2) {
        long $$3 = 0L;
        $$3 |= ((long)$$0 & 0x3FFFFFL) << 42;
        $$3 |= ((long)$$1 & 0xFFFFFL) << 0;
        return $$3 |= ((long)$$2 & 0x3FFFFFL) << 20;
    }

    public long s() {
        return jw.b(this.a(), this.b(), this.c());
    }

    public jw d(int $$0, int $$1, int $$2) {
        if ($$0 == 0 && $$1 == 0 && $$2 == 0) {
            return this;
        }
        return new jw(this.a() + $$0, this.b() + $$1, this.c() + $$2);
    }

    public Stream<is> t() {
        return is.a(this.d(), this.e(), this.f(), this.g(), this.h(), this.i());
    }

    public static Stream<jw> a(jw $$0, int $$1) {
        int $$2 = $$0.a();
        int $$3 = $$0.b();
        int $$4 = $$0.c();
        return jw.a($$2 - $$1, $$3 - $$1, $$4 - $$1, $$2 + $$1, $$3 + $$1, $$4 + $$1);
    }

    public static Stream<jw> a(dvu $$0, int $$1, int $$2, int $$3) {
        int $$4 = $$0.h;
        int $$5 = $$0.i;
        return jw.a($$4 - $$1, $$2, $$5 - $$1, $$4 + $$1, $$3, $$5 + $$1);
    }

    public static Stream<jw> a(final int $$0, final int $$1, final int $$2, final int $$3, final int $$4, final int $$5) {
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<jw>((long)(($$3 - $$0 + 1) * ($$4 - $$1 + 1) * ($$5 - $$2 + 1)), 64){
            final iw a;
            {
                super($$02, $$12);
                this.a = new iw($$0, $$1, $$2, $$3, $$4, $$5);
            }

            @Override
            public boolean tryAdvance(Consumer<? super jw> $$02) {
                if (this.a.a()) {
                    $$02.accept(new jw(this.a.b(), this.a.c(), this.a.d()));
                    return true;
                }
                return false;
            }
        }, false);
    }

    public static void a(is $$0, LongConsumer $$1) {
        jw.a($$0.u(), $$0.v(), $$0.w(), $$1);
    }

    public static void a(long $$0, LongConsumer $$1) {
        jw.a(is.a($$0), is.b($$0), is.c($$0), $$1);
    }

    public static void a(int $$0, int $$1, int $$2, LongConsumer $$3) {
        int $$4 = jw.a($$0 - 1);
        int $$5 = jw.a($$0 + 1);
        int $$6 = jw.a($$1 - 1);
        int $$7 = jw.a($$1 + 1);
        int $$8 = jw.a($$2 - 1);
        int $$9 = jw.a($$2 + 1);
        if ($$4 == $$5 && $$6 == $$7 && $$8 == $$9) {
            $$3.accept(jw.b($$4, $$6, $$8));
        } else {
            for (int $$10 = $$4; $$10 <= $$5; ++$$10) {
                for (int $$11 = $$6; $$11 <= $$7; ++$$11) {
                    for (int $$12 = $$8; $$12 <= $$9; ++$$12) {
                        $$3.accept(jw.b($$10, $$11, $$12));
                    }
                }
            }
        }
    }

    @Override
    public /* synthetic */ jy c(int n2, int n3, int n4) {
        return this.d(n2, n3, n4);
    }
}

