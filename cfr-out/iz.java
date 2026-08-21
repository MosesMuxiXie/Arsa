/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterators
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  org.jetbrains.annotations.Contract
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jetbrains.annotations.Contract;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class iz
extends Enum<iz>
implements bhh {
    public static final /* enum */ iz a = new iz(0, 1, -1, "down", iz$b.b, iz$a.b, new jy(0, -1, 0));
    public static final /* enum */ iz b = new iz(1, 0, -1, "up", iz$b.a, iz$a.b, new jy(0, 1, 0));
    public static final /* enum */ iz c = new iz(2, 3, 2, "north", iz$b.b, iz$a.c, new jy(0, 0, -1));
    public static final /* enum */ iz d = new iz(3, 2, 0, "south", iz$b.a, iz$a.c, new jy(0, 0, 1));
    public static final /* enum */ iz e = new iz(4, 5, 1, "west", iz$b.b, iz$a.a, new jy(-1, 0, 0));
    public static final /* enum */ iz f = new iz(5, 4, 3, "east", iz$b.a, iz$a.a, new jy(1, 0, 0));
    public static final bhh.a<iz> g;
    public static final Codec<iz> h;
    public static final IntFunction<iz> i;
    public static final aao<ByteBuf, iz> j;
    @Deprecated
    public static final Codec<iz> k;
    @Deprecated
    public static final Codec<iz> l;
    private static final ImmutableList<a> m;
    private static final ImmutableList<a> n;
    private final int o;
    private final int p;
    private final int q;
    private final String r;
    private final a s;
    private final b t;
    private final jy u;
    private final ftm v;
    private final Vector3fc w;
    private static final iz[] x;
    private static final iz[] y;
    private static final iz[] z;
    private static final /* synthetic */ iz[] A;

    public static iz[] values() {
        return (iz[])A.clone();
    }

    public static iz valueOf(String $$0) {
        return Enum.valueOf(iz.class, $$0);
    }

    private iz(int $$0, int $$1, int $$2, String $$3, b $$4, a $$5, jy $$6) {
        this.o = $$0;
        this.q = $$2;
        this.p = $$1;
        this.r = $$3;
        this.s = $$5;
        this.t = $$4;
        this.u = $$6;
        this.v = ftm.a($$6);
        this.w = new Vector3f((float)$$6.u(), (float)$$6.v(), (float)$$6.w());
    }

    public static iz[] a(cgk $$0) {
        iz $$17;
        float $$1 = $$0.i(1.0f) * ((float)Math.PI / 180);
        float $$2 = -$$0.j(1.0f) * ((float)Math.PI / 180);
        float $$3 = bgj.a((double)$$1);
        float $$4 = bgj.b((double)$$1);
        float $$5 = bgj.a((double)$$2);
        float $$6 = bgj.b((double)$$2);
        boolean $$7 = $$5 > 0.0f;
        boolean $$8 = $$3 < 0.0f;
        boolean $$9 = $$6 > 0.0f;
        float $$10 = $$7 ? $$5 : -$$5;
        float $$11 = $$8 ? -$$3 : $$3;
        float $$12 = $$9 ? $$6 : -$$6;
        float $$13 = $$10 * $$4;
        float $$14 = $$12 * $$4;
        iz $$15 = $$7 ? f : e;
        iz $$16 = $$8 ? b : a;
        iz iz2 = $$17 = $$9 ? d : c;
        if ($$10 > $$12) {
            if ($$11 > $$13) {
                return iz.a($$16, $$15, $$17);
            }
            if ($$14 > $$11) {
                return iz.a($$15, $$17, $$16);
            }
            return iz.a($$15, $$16, $$17);
        }
        if ($$11 > $$14) {
            return iz.a($$16, $$17, $$15);
        }
        if ($$13 > $$11) {
            return iz.a($$17, $$15, $$16);
        }
        return iz.a($$17, $$16, $$15);
    }

    private static iz[] a(iz $$0, iz $$1, iz $$2) {
        return new iz[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
    }

    public static iz a(Matrix4fc $$0, iz $$1) {
        Vector3f $$2 = $$0.transformDirection($$1.w, new Vector3f());
        return iz.a($$2.x(), $$2.y(), $$2.z());
    }

    public static Collection<iz> a(bgr $$0) {
        return bhs.b(iz.values(), $$0);
    }

    public static Stream<iz> a() {
        return Stream.of(x);
    }

    public static float a(iz $$0) {
        return switch ($$0.ordinal()) {
            case 2 -> 180.0f;
            case 3 -> 0.0f;
            case 4 -> 90.0f;
            case 5 -> -90.0f;
            default -> throw new IllegalStateException("No y-Rot for vertical axis: " + String.valueOf($$0));
        };
    }

    public Quaternionf b() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> new Quaternionf().rotationX((float)Math.PI);
            case 1 -> new Quaternionf();
            case 2 -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, (float)Math.PI);
            case 3 -> new Quaternionf().rotationX(1.5707964f);
            case 4 -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, 1.5707964f);
            case 5 -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, -1.5707964f);
        };
    }

    public int d() {
        return this.o;
    }

    public int e() {
        return this.q;
    }

    public b f() {
        return this.t;
    }

    public static iz a(cgk $$0, a $$1) {
        return switch ($$1.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (f.a($$0.j(1.0f))) {
                    yield f;
                }
                yield e;
            }
            case 2 -> {
                if (d.a($$0.j(1.0f))) {
                    yield d;
                }
                yield c;
            }
            case 1 -> $$0.i(1.0f) < 0.0f ? b : a;
        };
    }

    public iz g() {
        return iz.a(this.p);
    }

    public iz a(a $$0) {
        return switch ($$0.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (this == e || this == f) {
                    yield this;
                }
                yield this.t();
            }
            case 1 -> {
                if (this == b || this == a) {
                    yield this;
                }
                yield this.h();
            }
            case 2 -> this == c || this == d ? this : this.v();
        };
    }

    public iz b(a $$0) {
        return switch ($$0.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (this == e || this == f) {
                    yield this;
                }
                yield this.u();
            }
            case 1 -> {
                if (this == b || this == a) {
                    yield this;
                }
                yield this.i();
            }
            case 2 -> this == c || this == d ? this : this.w();
        };
    }

    public iz h() {
        return switch (this.ordinal()) {
            case 2 -> f;
            case 5 -> d;
            case 3 -> e;
            case 4 -> c;
            default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + String.valueOf(this));
        };
    }

    private iz t() {
        return switch (this.ordinal()) {
            case 1 -> c;
            case 2 -> a;
            case 0 -> d;
            case 3 -> b;
            default -> throw new IllegalStateException("Unable to get X-rotated facing of " + String.valueOf(this));
        };
    }

    private iz u() {
        return switch (this.ordinal()) {
            case 1 -> d;
            case 3 -> a;
            case 0 -> c;
            case 2 -> b;
            default -> throw new IllegalStateException("Unable to get X-rotated facing of " + String.valueOf(this));
        };
    }

    private iz v() {
        return switch (this.ordinal()) {
            case 1 -> f;
            case 5 -> a;
            case 0 -> e;
            case 4 -> b;
            default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + String.valueOf(this));
        };
    }

    private iz w() {
        return switch (this.ordinal()) {
            case 1 -> e;
            case 4 -> a;
            case 0 -> f;
            case 5 -> b;
            default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + String.valueOf(this));
        };
    }

    public iz i() {
        return switch (this.ordinal()) {
            case 2 -> e;
            case 5 -> c;
            case 3 -> f;
            case 4 -> d;
            default -> throw new IllegalStateException("Unable to get CCW facing of " + String.valueOf(this));
        };
    }

    public int j() {
        return this.u.u();
    }

    public int k() {
        return this.u.v();
    }

    public int l() {
        return this.u.w();
    }

    public Vector3f m() {
        return new Vector3f(this.w);
    }

    public String n() {
        return this.r;
    }

    public a o() {
        return this.s;
    }

    public static @Nullable iz a(String $$0) {
        return g.a($$0);
    }

    public static iz a(int $$0) {
        return y[bgj.a($$0 % y.length)];
    }

    public static iz b(int $$0) {
        return z[bgj.a($$0 % z.length)];
    }

    public static iz a(double $$0) {
        return iz.b(bgj.c($$0 / 90.0 + 0.5) & 3);
    }

    public static iz a(a $$0, b $$1) {
        return switch ($$0.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if ($$1 == iz$b.a) {
                    yield f;
                }
                yield e;
            }
            case 1 -> {
                if ($$1 == iz$b.a) {
                    yield b;
                }
                yield a;
            }
            case 2 -> $$1 == iz$b.a ? d : c;
        };
    }

    public float p() {
        return (this.q & 3) * 90;
    }

    public static iz b(bgr $$0) {
        return bhs.a(x, $$0);
    }

    public static iz a(double $$0, double $$1, double $$2) {
        return iz.a((float)$$0, (float)$$1, (float)$$2);
    }

    public static iz a(float $$0, float $$1, float $$2) {
        iz $$3 = c;
        float $$4 = Float.MIN_VALUE;
        for (iz $$5 : x) {
            float $$6 = $$0 * (float)$$5.u.u() + $$1 * (float)$$5.u.v() + $$2 * (float)$$5.u.w();
            if (!($$6 > $$4)) continue;
            $$4 = $$6;
            $$3 = $$5;
        }
        return $$3;
    }

    public static iz a(ftm $$0) {
        return iz.a($$0.g, $$0.h, $$0.i);
    }

    @Contract(value="_,_,_,!null->!null;_,_,_,_->_")
    public static @Nullable iz a(int $$0, int $$1, int $$2, @Nullable iz $$3) {
        int $$4 = Math.abs($$0);
        int $$5 = Math.abs($$1);
        int $$6 = Math.abs($$2);
        if ($$4 > $$6 && $$4 > $$5) {
            return $$0 < 0 ? e : f;
        }
        if ($$6 > $$4 && $$6 > $$5) {
            return $$2 < 0 ? c : d;
        }
        if ($$5 > $$4 && $$5 > $$6) {
            return $$1 < 0 ? a : b;
        }
        return $$3;
    }

    @Contract(value="_,!null->!null;_,_->_")
    public static @Nullable iz a(jy $$0, @Nullable iz $$1) {
        return iz.a($$0.u(), $$0.v(), $$0.w(), $$1);
    }

    public String toString() {
        return this.r;
    }

    @Override
    public String c() {
        return this.r;
    }

    private static DataResult<iz> b(iz $$0) {
        return $$0.o().b() ? DataResult.success((Object)$$0) : DataResult.error(() -> "Expected a vertical direction");
    }

    public static iz a(b $$0, a $$1) {
        for (iz $$2 : x) {
            if ($$2.f() != $$0 || $$2.o() != $$1) continue;
            return $$2;
        }
        throw new IllegalArgumentException("No such direction: " + String.valueOf((Object)$$0) + " " + String.valueOf($$1));
    }

    public static ImmutableList<a> b(ftm $$0) {
        if (Math.abs($$0.g) < Math.abs($$0.i)) {
            return n;
        }
        return m;
    }

    public jy q() {
        return this.u;
    }

    public ftm r() {
        return this.v;
    }

    public Vector3fc s() {
        return this.w;
    }

    public boolean a(float $$0) {
        float $$1 = $$0 * ((float)Math.PI / 180);
        float $$2 = -bgj.a((double)$$1);
        float $$3 = bgj.b((double)$$1);
        return (float)this.u.u() * $$2 + (float)this.u.w() * $$3 > 0.0f;
    }

    private static /* synthetic */ iz[] y() {
        return new iz[]{a, b, c, d, e, f};
    }

    static {
        A = iz.y();
        g = bhh.a(iz::values);
        h = g.validate(iz::b);
        i = beu.a(iz::d, iz.values(), beu.a.b);
        j = aam.a(i, iz::d);
        k = Codec.BYTE.xmap(iz::a, $$0 -> (byte)$$0.d());
        l = Codec.BYTE.xmap(iz::b, $$0 -> (byte)$$0.e());
        m = ImmutableList.of((Object)iz$a.b, (Object)iz$a.a, (Object)iz$a.c);
        n = ImmutableList.of((Object)iz$a.b, (Object)iz$a.c, (Object)iz$a.a);
        x = iz.values();
        y = (iz[])Arrays.stream(x).sorted(Comparator.comparingInt($$0 -> $$0.o)).toArray(iz[]::new);
        z = (iz[])Arrays.stream(x).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.q)).toArray(iz[]::new);
    }

    public static abstract sealed class a
    extends Enum<a>
    implements bhh,
    Predicate<iz> {
        public static final /* enum */ a a = new a("x"){

            @Override
            public int a(int $$0, int $$1, int $$2) {
                return $$0;
            }

            @Override
            public boolean a(boolean $$0, boolean $$1, boolean $$2) {
                return $$0;
            }

            @Override
            public double a(double $$0, double $$1, double $$2) {
                return $$0;
            }

            @Override
            public iz e() {
                return iz.f;
            }

            @Override
            public iz f() {
                return iz.e;
            }

            @Override
            public /* synthetic */ boolean test(@Nullable Object object) {
                return super.a((iz)object);
            }
        };
        public static final /* enum */ a b = new a("y"){

            @Override
            public int a(int $$0, int $$1, int $$2) {
                return $$1;
            }

            @Override
            public double a(double $$0, double $$1, double $$2) {
                return $$1;
            }

            @Override
            public boolean a(boolean $$0, boolean $$1, boolean $$2) {
                return $$1;
            }

            @Override
            public iz e() {
                return iz.b;
            }

            @Override
            public iz f() {
                return iz.a;
            }

            @Override
            public /* synthetic */ boolean test(@Nullable Object object) {
                return super.a((iz)object);
            }
        };
        public static final /* enum */ a c = new a("z"){

            @Override
            public int a(int $$0, int $$1, int $$2) {
                return $$2;
            }

            @Override
            public double a(double $$0, double $$1, double $$2) {
                return $$2;
            }

            @Override
            public boolean a(boolean $$0, boolean $$1, boolean $$2) {
                return $$2;
            }

            @Override
            public iz e() {
                return iz.d;
            }

            @Override
            public iz f() {
                return iz.c;
            }

            @Override
            public /* synthetic */ boolean test(@Nullable Object object) {
                return super.a((iz)object);
            }
        };
        public static final a[] d;
        public static final bhh.a<a> e;
        private final String f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.f = $$0;
        }

        public static @Nullable a a(String $$0) {
            return e.a($$0);
        }

        public String a() {
            return this.f;
        }

        public boolean b() {
            return this == b;
        }

        public boolean d() {
            return this == a || this == c;
        }

        public abstract iz e();

        public abstract iz f();

        public iz[] g() {
            return new iz[]{this.e(), this.f()};
        }

        public String toString() {
            return this.f;
        }

        public static a a(bgr $$0) {
            return bhs.a(d, $$0);
        }

        public boolean a(@Nullable iz $$0) {
            return $$0 != null && $$0.o() == this;
        }

        public c h() {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0, 2 -> iz$c.a;
                case 1 -> iz$c.b;
            };
        }

        @Override
        public String c() {
            return this.f;
        }

        public abstract int a(int var1, int var2, int var3);

        public abstract double a(double var1, double var3, double var5);

        public abstract boolean a(boolean var1, boolean var2, boolean var3);

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((iz)object);
        }

        private static /* synthetic */ a[] i() {
            return new a[]{a, b, c};
        }

        static {
            g = iz$a.i();
            d = iz$a.values();
            e = bhh.a(a::values);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(1, "Towards positive");
        public static final /* enum */ b b = new b(-1, "Towards negative");
        private final int c;
        private final String d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, String $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public int a() {
            return this.c;
        }

        public String b() {
            return this.d;
        }

        public String toString() {
            return this.d;
        }

        public b c() {
            return this == a ? b : a;
        }

        private static /* synthetic */ b[] d() {
            return new b[]{a, b};
        }

        static {
            e = iz$b.d();
        }
    }

    public static final class c
    extends Enum<c>
    implements Iterable<iz>,
    Predicate<iz> {
        public static final /* enum */ c a = new c(new iz[]{c, f, d, e}, new a[]{iz$a.a, iz$a.c});
        public static final /* enum */ c b = new c(new iz[]{b, a}, new a[]{iz$a.b});
        private final iz[] c;
        private final a[] d;
        private static final /* synthetic */ c[] e;

        public static c[] values() {
            return (c[])e.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(iz[] $$0, a[] $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public iz a(bgr $$0) {
            return bhs.a(this.c, $$0);
        }

        public a b(bgr $$0) {
            return bhs.a(this.d, $$0);
        }

        public boolean a(@Nullable iz $$0) {
            return $$0 != null && $$0.o().h() == this;
        }

        @Override
        public Iterator<iz> iterator() {
            return Iterators.forArray((Object[])this.c);
        }

        public Stream<iz> a() {
            return Arrays.stream(this.c);
        }

        public List<iz> c(bgr $$0) {
            return bhs.b(this.c, $$0);
        }

        public int b() {
            return this.c.length;
        }

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((iz)object);
        }

        private static /* synthetic */ c[] c() {
            return new c[]{a, b};
        }

        static {
            e = iz$c.c();
        }
    }
}

