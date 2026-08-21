/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  javax.annotation.concurrent.Immutable
 *  org.apache.commons.lang3.Validate
 *  org.apache.commons.lang3.tuple.Pair
 */
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayDeque;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;

@Immutable
public class is
extends jy {
    public static final Codec<is> a = Codec.INT_STREAM.comapFlatMap($$02 -> bhs.a($$02, 3).map($$0 -> new is($$0[0], $$0[1], $$0[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w())).stable();
    public static final aao<ByteBuf, is> b = new aao<ByteBuf, is>(){

        public is a(ByteBuf $$0) {
            return wx.c($$0);
        }

        public void a(ByteBuf $$0, is $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (is)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final is c = new is(0, 0, 0);
    public static final int d = 1 + bgj.g(bgj.c(30000000));
    public static final int e = 64 - 2 * d;
    private static final long j = (1L << d) - 1L;
    private static final long k = (1L << e) - 1L;
    private static final long l = (1L << d) - 1L;
    private static final int m = 0;
    private static final int n = e;
    private static final int o = e + d;
    public static final int f = (1 << d) / 2 - 1;

    public is(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    public is(jy $$0) {
        this($$0.u(), $$0.v(), $$0.w());
    }

    public static long a(long $$0, iz $$1) {
        return is.a($$0, $$1.j(), $$1.k(), $$1.l());
    }

    public static long a(long $$0, int $$1, int $$2, int $$3) {
        return is.a(is.a($$0) + $$1, is.b($$0) + $$2, is.c($$0) + $$3);
    }

    public static int a(long $$0) {
        return (int)($$0 << 64 - o - d >> 64 - d);
    }

    public static int b(long $$0) {
        return (int)($$0 << 64 - e >> 64 - e);
    }

    public static int c(long $$0) {
        return (int)($$0 << 64 - n - d >> 64 - d);
    }

    public static is d(long $$0) {
        return new is(is.a($$0), is.b($$0), is.c($$0));
    }

    public static is a(double $$0, double $$1, double $$2) {
        return new is(bgj.c($$0), bgj.c($$1), bgj.c($$2));
    }

    public static is a(jn $$0) {
        return is.a($$0.a(), $$0.b(), $$0.c());
    }

    public static is a(is $$0, is $$1) {
        return new is(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
    }

    public static is b(is $$0, is $$1) {
        return new is(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
    }

    public long a() {
        return is.a(this.u(), this.v(), this.w());
    }

    public static long a(int $$0, int $$1, int $$2) {
        long $$3 = 0L;
        $$3 |= ((long)$$0 & j) << o;
        $$3 |= ((long)$$1 & k) << 0;
        return $$3 |= ((long)$$2 & l) << n;
    }

    public static long e(long $$0) {
        return $$0 & 0xFFFFFFFFFFFFFFF0L;
    }

    public is b(int $$0, int $$1, int $$2) {
        if ($$0 == 0 && $$1 == 0 && $$2 == 0) {
            return this;
        }
        return new is(this.u() + $$0, this.v() + $$1, this.w() + $$2);
    }

    public ftm b() {
        return ftm.b(this);
    }

    public ftm c() {
        return ftm.c(this);
    }

    public is a(jy $$0) {
        return this.b($$0.u(), $$0.v(), $$0.w());
    }

    public is b(jy $$0) {
        return this.b(-$$0.u(), -$$0.v(), -$$0.w());
    }

    public is a(int $$0) {
        if ($$0 == 1) {
            return this;
        }
        if ($$0 == 0) {
            return c;
        }
        return new is(this.u() * $$0, this.v() * $$0, this.w() * $$0);
    }

    public is d() {
        return this.a(iz.b);
    }

    public is b(int $$0) {
        return this.a(iz.b, $$0);
    }

    public is e() {
        return this.a(iz.a);
    }

    public is c(int $$0) {
        return this.a(iz.a, $$0);
    }

    public is f() {
        return this.a(iz.c);
    }

    public is d(int $$0) {
        return this.a(iz.c, $$0);
    }

    public is g() {
        return this.a(iz.d);
    }

    public is e(int $$0) {
        return this.a(iz.d, $$0);
    }

    public is h() {
        return this.a(iz.e);
    }

    public is f(int $$0) {
        return this.a(iz.e, $$0);
    }

    public is i() {
        return this.a(iz.f);
    }

    public is g(int $$0) {
        return this.a(iz.f, $$0);
    }

    public is a(iz $$0) {
        return new is(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
    }

    public is a(iz $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        return new is(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
    }

    public is a(iz.a $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        int $$2 = $$0 == iz.a.a ? $$1 : 0;
        int $$3 = $$0 == iz.a.b ? $$1 : 0;
        int $$4 = $$0 == iz.a.c ? $$1 : 0;
        return new is(this.u() + $$2, this.v() + $$3, this.w() + $$4);
    }

    public is a(egm $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case egm.b -> new is(-this.w(), this.v(), this.u());
            case egm.c -> new is(-this.u(), this.v(), -this.w());
            case egm.d -> new is(this.w(), this.v(), -this.u());
            case egm.a -> this;
        };
    }

    public is c(jy $$0) {
        return new is(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
    }

    public is h(int $$0) {
        return new is(this.u(), $$0, this.w());
    }

    public is j() {
        return this;
    }

    public a k() {
        return new a(this.u(), this.v(), this.w());
    }

    public ftm a(ftm $$0) {
        return new ftm(bgj.a($$0.g, (double)((float)this.u() + 1.0E-5f), (double)this.u() + 1.0 - (double)1.0E-5f), bgj.a($$0.h, (double)((float)this.v() + 1.0E-5f), (double)this.v() + 1.0 - (double)1.0E-5f), bgj.a($$0.i, (double)((float)this.w() + 1.0E-5f), (double)this.w() + 1.0 - (double)1.0E-5f));
    }

    public static Iterable<is> a(bgr $$0, int $$1, is $$2, int $$3) {
        return is.a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
    }

    @Deprecated
    public static Stream<is> a(is $$0) {
        return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
    }

    public static Iterable<is> a(final bgr $$0, final int $$1, final int $$2, final int $$3, final int $$4, int $$5, int $$6, int $$7) {
        final int $$8 = $$5 - $$2 + 1;
        final int $$9 = $$6 - $$3 + 1;
        final int $$10 = $$7 - $$4 + 1;
        return () -> new AbstractIterator<is>(){
            final a a = new a();
            int b = $$1;

            protected is a() {
                if (this.b <= 0) {
                    return (is)this.endOfData();
                }
                a $$02 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                --this.b;
                return $$02;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static Iterable<is> a(is $$0, final int $$1, final int $$2, final int $$3) {
        final int $$4 = $$1 + $$2 + $$3;
        final int $$5 = $$0.u();
        final int $$6 = $$0.v();
        final int $$7 = $$0.w();
        return () -> new AbstractIterator<is>(){
            private final a h = new a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected is a() {
                if (this.n) {
                    this.n = false;
                    this.h.r($$7 - (this.h.w() - $$7));
                    return this.h;
                }
                a $$0 = null;
                while ($$0 == null) {
                    if (this.m > this.k) {
                        ++this.l;
                        if (this.l > this.j) {
                            ++this.i;
                            if (this.i > $$4) {
                                return (is)this.endOfData();
                            }
                            this.j = Math.min($$1, this.i);
                            this.l = -this.j;
                        }
                        this.k = Math.min($$2, this.i - Math.abs(this.l));
                        this.m = -this.k;
                    }
                    int $$12 = this.l;
                    int $$22 = this.m;
                    int $$32 = this.i - Math.abs($$12) - Math.abs($$22);
                    if ($$32 <= $$3) {
                        this.n = $$32 != 0;
                        $$0 = this.h.d($$5 + $$12, $$6 + $$22, $$7 + $$32);
                    }
                    ++this.m;
                }
                return $$0;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static Optional<is> a(is $$0, int $$1, int $$2, Predicate<is> $$3) {
        for (is $$4 : is.a($$0, $$1, $$2, $$1)) {
            if (!$$3.test($$4)) continue;
            return Optional.of($$4);
        }
        return Optional.empty();
    }

    public static Stream<is> b(is $$0, int $$1, int $$2, int $$3) {
        return StreamSupport.stream(is.a($$0, $$1, $$2, $$3).spliterator(), false);
    }

    public static Iterable<is> a(fth $$0) {
        is $$1 = is.a($$0.a, $$0.b, $$0.c);
        is $$2 = is.a($$0.d, $$0.e, $$0.f);
        return is.c($$1, $$2);
    }

    public static Iterable<is> c(is $$0, is $$1) {
        return is.b(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()), Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
    }

    public static Stream<is> d(is $$0, is $$1) {
        return StreamSupport.stream(is.c($$0, $$1).spliterator(), false);
    }

    public static Stream<is> a(ffg $$0) {
        return is.a(Math.min($$0.h(), $$0.k()), Math.min($$0.i(), $$0.l()), Math.min($$0.j(), $$0.m()), Math.max($$0.h(), $$0.k()), Math.max($$0.i(), $$0.l()), Math.max($$0.j(), $$0.m()));
    }

    public static Stream<is> b(fth $$0) {
        return is.a(bgj.c($$0.a), bgj.c($$0.b), bgj.c($$0.c), bgj.c($$0.d), bgj.c($$0.e), bgj.c($$0.f));
    }

    public static Stream<is> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        return StreamSupport.stream(is.b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
    }

    public static Iterable<is> b(final int $$0, final int $$1, final int $$2, int $$3, int $$4, int $$5) {
        final int $$6 = $$3 - $$0 + 1;
        final int $$7 = $$4 - $$1 + 1;
        int $$8 = $$5 - $$2 + 1;
        final int $$9 = $$6 * $$7 * $$8;
        return () -> new AbstractIterator<is>(){
            private final a g = new a();
            private int h;

            protected is a() {
                if (this.h == $$9) {
                    return (is)this.endOfData();
                }
                int $$02 = this.h % $$6;
                int $$12 = this.h / $$6;
                int $$22 = $$12 % $$7;
                int $$3 = $$12 / $$7;
                ++this.h;
                return this.g.d($$0 + $$02, $$1 + $$22, $$2 + $$3);
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static Iterable<a> a(final is $$0, final int $$1, final iz $$2, final iz $$3) {
        Validate.validState(($$2.o() != $$3.o() ? 1 : 0) != 0, (String)"The two directions cannot be on the same axis", (Object[])new Object[0]);
        return () -> new AbstractIterator<a>(){
            private final iz[] e;
            private final a f;
            private final int g;
            private int h;
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            {
                this.e = new iz[]{$$2, $$3, $$2.g(), $$3.g()};
                this.f = $$0.k().c($$3);
                this.g = 4 * $$1;
                this.h = -1;
                this.k = this.f.u();
                this.l = this.f.v();
                this.m = this.f.w();
            }

            protected a a() {
                this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
                this.k = this.f.u();
                this.l = this.f.v();
                this.m = this.f.w();
                if (this.j >= this.i) {
                    if (this.h >= this.g) {
                        return (a)this.endOfData();
                    }
                    ++this.h;
                    this.j = 0;
                    this.i = this.h / 2 + 1;
                }
                ++this.j;
                return this.f;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static int a(is $$0, int $$1, int $$22, BiConsumer<is, Consumer<is>> $$3, Function<is, b> $$4) {
        ArrayDeque<Pair> $$5 = new ArrayDeque<Pair>();
        LongOpenHashSet $$6 = new LongOpenHashSet();
        $$5.add(Pair.of((Object)$$0, (Object)0));
        int $$7 = 0;
        while (!$$5.isEmpty()) {
            b $$12;
            Pair $$8 = (Pair)$$5.poll();
            is $$9 = (is)$$8.getLeft();
            int $$10 = (Integer)$$8.getRight();
            long $$11 = $$9.a();
            if (!$$6.add($$11) || ($$12 = $$4.apply($$9)) == is$b.b) continue;
            if ($$12 == is$b.c) break;
            if (++$$7 >= $$22) {
                return $$7;
            }
            if ($$10 >= $$1) continue;
            $$3.accept($$9, $$2 -> $$5.add(Pair.of((Object)$$2, (Object)($$10 + 1))));
        }
        return $$7;
    }

    public static Iterable<is> a(fth $$0, ftm $$1) {
        ftm $$2 = $$0.h();
        int $$3 = bgj.c($$2.a());
        int $$4 = bgj.c($$2.b());
        int $$5 = bgj.c($$2.c());
        ftm $$6 = $$0.i();
        int $$7 = bgj.c($$6.a());
        int $$8 = bgj.c($$6.b());
        int $$9 = bgj.c($$6.c());
        return is.a($$3, $$4, $$5, $$7, $$8, $$9, $$1);
    }

    public static Iterable<is> a(is $$0, is $$1, ftm $$2) {
        return is.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w(), $$2);
    }

    public static Iterable<is> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, ftm $$6) {
        int $$7 = Math.min($$0, $$3);
        int $$8 = Math.min($$1, $$4);
        int $$9 = Math.min($$2, $$5);
        int $$10 = Math.max($$0, $$3);
        int $$11 = Math.max($$1, $$4);
        int $$12 = Math.max($$2, $$5);
        int $$13 = $$10 - $$7;
        int $$14 = $$11 - $$8;
        int $$15 = $$12 - $$9;
        final int $$16 = $$6.g >= 0.0 ? $$7 : $$10;
        final int $$17 = $$6.h >= 0.0 ? $$8 : $$11;
        final int $$18 = $$6.i >= 0.0 ? $$9 : $$12;
        ImmutableList<iz.a> $$19 = iz.b($$6);
        iz.a $$20 = (iz.a)$$19.get(0);
        iz.a $$21 = (iz.a)$$19.get(1);
        iz.a $$22 = (iz.a)$$19.get(2);
        final iz $$23 = $$6.a($$20) >= 0.0 ? $$20.e() : $$20.f();
        final iz $$24 = $$6.a($$21) >= 0.0 ? $$21.e() : $$21.f();
        final iz $$25 = $$6.a($$22) >= 0.0 ? $$22.e() : $$22.f();
        final int $$26 = $$20.a($$13, $$14, $$15);
        final int $$27 = $$21.a($$13, $$14, $$15);
        final int $$28 = $$22.a($$13, $$14, $$15);
        return () -> new AbstractIterator<is>(){
            private final a j = new a();
            private int k;
            private int l;
            private int m;
            private boolean n;
            private final int o = $$23.j();
            private final int p = $$23.k();
            private final int q = $$23.l();
            private final int r = $$24.j();
            private final int s = $$24.k();
            private final int t = $$24.l();
            private final int u = $$25.j();
            private final int v = $$25.k();
            private final int w = $$25.l();

            protected is a() {
                if (this.n) {
                    return (is)this.endOfData();
                }
                this.j.d($$16 + this.o * this.k + this.r * this.l + this.u * this.m, $$17 + this.p * this.k + this.s * this.l + this.v * this.m, $$18 + this.q * this.k + this.t * this.l + this.w * this.m);
                if (this.m < $$28) {
                    ++this.m;
                } else if (this.l < $$27) {
                    ++this.l;
                    this.m = 0;
                } else if (this.k < $$26) {
                    ++this.k;
                    this.m = 0;
                    this.l = 0;
                } else {
                    this.n = true;
                }
                return this.j;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    @Override
    public /* synthetic */ jy d(jy jy2) {
        return this.c(jy2);
    }

    @Override
    public /* synthetic */ jy b(iz.a a2, int n2) {
        return this.a(a2, n2);
    }

    @Override
    public /* synthetic */ jy b(iz iz2, int n2) {
        return this.a(iz2, n2);
    }

    @Override
    public /* synthetic */ jy b(iz iz2) {
        return this.a(iz2);
    }

    @Override
    public /* synthetic */ jy i(int n2) {
        return this.g(n2);
    }

    @Override
    public /* synthetic */ jy l() {
        return this.i();
    }

    @Override
    public /* synthetic */ jy j(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ jy m() {
        return this.h();
    }

    @Override
    public /* synthetic */ jy k(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ jy n() {
        return this.g();
    }

    @Override
    public /* synthetic */ jy l(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ jy o() {
        return this.f();
    }

    @Override
    public /* synthetic */ jy m(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ jy p() {
        return this.e();
    }

    @Override
    public /* synthetic */ jy n(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ jy q() {
        return this.d();
    }

    @Override
    public /* synthetic */ jy o(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ jy e(jy jy2) {
        return this.b(jy2);
    }

    @Override
    public /* synthetic */ jy f(jy jy2) {
        return this.a(jy2);
    }

    @Override
    public /* synthetic */ jy c(int n2, int n3, int n4) {
        return this.b(n2, n3, n4);
    }

    public static class a
    extends is {
        public a() {
            this(0, 0, 0);
        }

        public a(int $$0, int $$1, int $$2) {
            super($$0, $$1, $$2);
        }

        public a(double $$0, double $$1, double $$2) {
            this(bgj.c($$0), bgj.c($$1), bgj.c($$2));
        }

        @Override
        public is b(int $$0, int $$1, int $$2) {
            return super.b($$0, $$1, $$2).j();
        }

        @Override
        public is a(int $$0) {
            return super.a($$0).j();
        }

        @Override
        public is a(iz $$0, int $$1) {
            return super.a($$0, $$1).j();
        }

        @Override
        public is a(iz.a $$0, int $$1) {
            return super.a($$0, $$1).j();
        }

        @Override
        public is a(egm $$0) {
            return super.a($$0).j();
        }

        public a d(int $$0, int $$1, int $$2) {
            this.p($$0);
            this.q($$1);
            this.r($$2);
            return this;
        }

        public a b(double $$0, double $$1, double $$2) {
            return this.d(bgj.c($$0), bgj.c($$1), bgj.c($$2));
        }

        public a g(jy $$0) {
            return this.d($$0.u(), $$0.v(), $$0.w());
        }

        public a f(long $$0) {
            return this.d(is$a.a($$0), is$a.b($$0), is$a.c($$0));
        }

        public a a(ip $$0, int $$1, int $$2, int $$3) {
            return this.d($$0.a($$1, $$2, $$3, iz.a.a), $$0.a($$1, $$2, $$3, iz.a.b), $$0.a($$1, $$2, $$3, iz.a.c));
        }

        public a a(jy $$0, iz $$1) {
            return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
        }

        public a a(jy $$0, int $$1, int $$2, int $$3) {
            return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
        }

        public a a(jy $$0, jy $$1) {
            return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
        }

        public a c(iz $$0) {
            return this.c($$0, 1);
        }

        public a c(iz $$0, int $$1) {
            return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
        }

        public a e(int $$0, int $$1, int $$2) {
            return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
        }

        public a h(jy $$0) {
            return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
        }

        public a a(iz.a $$0, int $$1, int $$2) {
            return switch ($$0) {
                default -> throw new MatchException(null, null);
                case iz.a.a -> this.d(bgj.a(this.u(), $$1, $$2), this.v(), this.w());
                case iz.a.b -> this.d(this.u(), bgj.a(this.v(), $$1, $$2), this.w());
                case iz.a.c -> this.d(this.u(), this.v(), bgj.a(this.w(), $$1, $$2));
            };
        }

        public a p(int $$0) {
            super.u($$0);
            return this;
        }

        public a q(int $$0) {
            super.t($$0);
            return this;
        }

        public a r(int $$0) {
            super.s($$0);
            return this;
        }

        @Override
        public is j() {
            return new is(this);
        }

        @Override
        public /* synthetic */ jy d(jy jy2) {
            return super.c(jy2);
        }

        @Override
        public /* synthetic */ jy b(iz.a a2, int n2) {
            return this.a(a2, n2);
        }

        @Override
        public /* synthetic */ jy b(iz iz2, int n2) {
            return this.a(iz2, n2);
        }

        @Override
        public /* synthetic */ jy b(iz iz2) {
            return super.a(iz2);
        }

        @Override
        public /* synthetic */ jy i(int n2) {
            return super.g(n2);
        }

        @Override
        public /* synthetic */ jy l() {
            return super.i();
        }

        @Override
        public /* synthetic */ jy j(int n2) {
            return super.f(n2);
        }

        @Override
        public /* synthetic */ jy m() {
            return super.h();
        }

        @Override
        public /* synthetic */ jy k(int n2) {
            return super.e(n2);
        }

        @Override
        public /* synthetic */ jy n() {
            return super.g();
        }

        @Override
        public /* synthetic */ jy l(int n2) {
            return super.d(n2);
        }

        @Override
        public /* synthetic */ jy o() {
            return super.f();
        }

        @Override
        public /* synthetic */ jy m(int n2) {
            return super.c(n2);
        }

        @Override
        public /* synthetic */ jy p() {
            return super.e();
        }

        @Override
        public /* synthetic */ jy n(int n2) {
            return super.b(n2);
        }

        @Override
        public /* synthetic */ jy q() {
            return super.d();
        }

        @Override
        public /* synthetic */ jy o(int n2) {
            return this.a(n2);
        }

        @Override
        public /* synthetic */ jy e(jy jy2) {
            return super.b(jy2);
        }

        @Override
        public /* synthetic */ jy f(jy jy2) {
            return super.a(jy2);
        }

        @Override
        public /* synthetic */ jy c(int n2, int n3, int n4) {
            return this.b(n2, n3, n4);
        }

        @Override
        public /* synthetic */ jy s(int n2) {
            return this.r(n2);
        }

        @Override
        public /* synthetic */ jy t(int n2) {
            return this.q(n2);
        }

        @Override
        public /* synthetic */ jy u(int n2) {
            return this.p(n2);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = is$b.a();
        }
    }
}

