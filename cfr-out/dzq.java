/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dzq
extends eog
implements dwn {
    public static final MapCodec<dzq> j = dzq.b(dzq::new);
    private static final Logger a = LogUtils.getLogger();
    private final jd.c<dzq> b = mi.e.f(this);
    public static final jj<eoh> k = new jj();
    private static final LoadingCache<fug, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build((CacheLoader)new CacheLoader<fug, Boolean>(){

        public Boolean a(fug $$0) {
            return !fud.c(fud.b(), $$0, ftq.g);
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((fug)object);
        }
    });
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;
    public static final int o = 8;
    public static final int p = 16;
    public static final int q = 32;
    public static final int r = 64;
    public static final int s = 128;
    public static final int t = 256;
    public static final int u = 512;
    @b
    public static final int v = 260;
    @b
    public static final int w = 3;
    @b
    public static final int x = 11;
    @b
    public static final int y = 816;
    public static final float z = -1.0f;
    public static final float A = 0.0f;
    public static final int B = 512;
    protected final eoi<dzq, eoh> C;
    private eoh d;
    private @Nullable dlp e;
    private static final int f = 256;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<a>> g = ThreadLocal.withInitial(() -> {
        Object2ByteLinkedOpenHashMap<a> $$0 = new Object2ByteLinkedOpenHashMap<a>(256, 0.25f){

            protected void rehash(int $$0) {
            }
        };
        $$0.defaultReturnValue((byte)127);
        return $$0;
    });

    @Override
    protected MapCodec<? extends dzq> a() {
        return j;
    }

    public static int j(@Nullable eoh $$0) {
        if ($$0 == null) {
            return 0;
        }
        int $$1 = k.a($$0);
        return $$1 == -1 ? 0 : $$1;
    }

    public static eoh a(int $$0) {
        eoh $$1 = k.a($$0);
        return $$1 == null ? dzs.a.m() : $$1;
    }

    public static dzq a(@Nullable dlp $$0) {
        if ($$0 instanceof dkb) {
            return ((dkb)$$0).c();
        }
        return dzs.a;
    }

    public static eoh a(eoh $$0, eoh $$1, dwp $$2, is $$3) {
        fug $$4 = fud.b($$0.g($$2, $$3), $$1.g($$2, $$3), ftq.c).a($$3);
        if ($$4.c()) {
            return $$1;
        }
        List<cgk> $$5 = $$2.a_(null, $$4.a());
        for (cgk $$6 : $$5) {
            double $$7 = fud.a(iz.a.b, $$6.dj().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
        }
        return $$1;
    }

    public static fug a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        return fud.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
    }

    public static fug[] a(int $$0, IntFunction<fug> $$1) {
        return (fug[])IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fug[]::new);
    }

    public static fug a(double $$0) {
        return dzq.a($$0, $$0, $$0);
    }

    public static fug a(double $$0, double $$1, double $$2) {
        double $$3 = $$1 / 2.0;
        return dzq.a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
    }

    public static fug b(double $$0, double $$1, double $$2) {
        return dzq.a($$0, $$0, $$1, $$2);
    }

    public static fug a(double $$0, double $$1, double $$2, double $$3) {
        double $$4 = $$0 / 2.0;
        double $$5 = $$1 / 2.0;
        return dzq.a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
    }

    public static fug c(double $$0, double $$1, double $$2) {
        return dzq.b($$0, $$0, $$1, $$2);
    }

    public static fug b(double $$0, double $$1, double $$2, double $$3) {
        double $$4 = $$1 / 2.0;
        return dzq.a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
    }

    public static fug a(double $$0, double $$1, double $$2, double $$3, double $$4) {
        double $$5 = $$0 / 2.0;
        return dzq.a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
    }

    public static eoh b(eoh $$0, dwp $$1, is $$2) {
        eoh $$3 = $$0;
        is.a $$4 = new is.a();
        for (iz $$5 : E) {
            $$4.a((jy)$$2, $$5);
            $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.G_());
        }
        return $$3;
    }

    public static void a(eoh $$0, eoh $$1, dwp $$2, is $$3, @b int $$4) {
        dzq.a($$0, $$1, $$2, $$3, $$4, 512);
    }

    public static void a(eoh $$0, eoh $$1, dwp $$2, is $$3, @b int $$4, int $$5) {
        if ($$1 != $$0) {
            if ($$1.l()) {
                if (!$$2.B_()) {
                    $$2.a($$3, ($$4 & 0x20) == 0, null, $$5);
                }
            } else {
                $$2.a($$3, $$1, $$4 & 0xFFFFFFDF, $$5);
            }
        }
    }

    public dzq(eog.d $$0) {
        super($$0);
        String $$2;
        eoi.a<dzq, eoh> $$1 = new eoi.a<dzq, eoh>(this);
        this.a($$1);
        this.C = $$1.a(dzq::m, eoh::new);
        this.l(this.C.b());
        if (w.aX && !($$2 = this.getClass().getSimpleName()).endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", (Object)$$2);
        }
    }

    public static boolean k(eoh $$0) {
        return $$0.b() instanceof eei || $$0.a(dzs.iO) || $$0.a(dzs.eJ) || $$0.a(dzs.eK) || $$0.a(dzs.fI) || $$0.a(dzs.fH) || $$0.a(bdp.ah);
    }

    protected static boolean a(axf $$0, amt<fof> $$1, eoh $$2, @Nullable elb $$3, @Nullable dlt $$42, @Nullable cgk $$5, BiConsumer<axf, dlt> $$6) {
        return dzq.a($$0, $$1, (fod.a $$4) -> $$4.a(fqx.i, $$2).b(fqx.j, $$3).b(fqx.b, $$5).b(fqx.k, $$42).a(fqw.u), $$6);
    }

    protected static boolean a(axf $$0, amt<fof> $$1, Function<fod.a, fod> $$22, BiConsumer<axf, dlt> $$3) {
        fod $$5;
        fof $$4 = $$0.s().be().a($$1);
        ObjectArrayList<dlt> $$6 = $$4.a($$5 = $$22.apply(new fod.a($$0)));
        if (!$$6.isEmpty()) {
            $$6.forEach($$2 -> $$3.accept($$0, (dlt)$$2));
            return true;
        }
        return false;
    }

    public static boolean a(eoh $$0, eoh $$1, iz $$2) {
        fug $$3 = $$1.a($$2.g());
        if ($$3 == fud.b()) {
            return false;
        }
        if ($$0.a($$1, $$2)) {
            return false;
        }
        if ($$3 == fud.a()) {
            return true;
        }
        fug $$4 = $$0.a($$2);
        if ($$4 == fud.a()) {
            return true;
        }
        a $$5 = new a($$4, $$3);
        Object2ByteLinkedOpenHashMap<a> $$6 = g.get();
        byte $$7 = $$6.getAndMoveToFirst((Object)$$5);
        if ($$7 != 127) {
            return $$7 != 0;
        }
        boolean $$8 = fud.c($$4, $$3, ftq.e);
        if ($$6.size() == 256) {
            $$6.removeLastByte();
        }
        $$6.putAndMoveToFirst((Object)$$5, (byte)($$8 ? 1 : 0));
        return $$8;
    }

    public static boolean c(dvt $$0, is $$1) {
        return $$0.a_($$1).a($$0, $$1, iz.b, eig.c);
    }

    public static boolean a(dwr $$0, is $$1, iz $$2) {
        eoh $$3 = $$0.a_($$1);
        if ($$2 == iz.a && $$3.a(bdp.bk)) {
            return false;
        }
        return $$3.a((dvt)$$0, $$1, $$2, eig.b);
    }

    public static boolean a(fug $$0, iz $$1) {
        fug $$2 = $$0.a($$1);
        return dzq.a($$2);
    }

    public static boolean a(fug $$0) {
        return (Boolean)c.getUnchecked((Object)$$0);
    }

    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
    }

    public void a(dwp $$0, is $$1, eoh $$2) {
    }

    public static List<dlt> a(eoh $$0, axf $$1, is $$2, @Nullable elb $$3) {
        fod.a $$4 = new fod.a($$1).a(fqx.h, ftm.b($$2)).a(fqx.k, dlt.l).b(fqx.j, $$3);
        return $$0.a($$4);
    }

    public static List<dlt> a(eoh $$0, axf $$1, is $$2, @Nullable elb $$3, @Nullable cgk $$4, dlt $$5) {
        fod.a $$6 = new fod.a($$1).a(fqx.h, ftm.b($$2)).a(fqx.k, $$5).b(fqx.a, $$4).b(fqx.j, $$3);
        return $$0.a($$6);
    }

    public static void b(eoh $$0, dwo $$1, is $$22) {
        if ($$1 instanceof axf) {
            dzq.a($$0, (axf)$$1, $$22, null).forEach($$2 -> dzq.a($$1, $$22, $$2));
            $$0.a((axf)$$1, $$22, dlt.l, true);
        }
    }

    public static void a(eoh $$0, dwp $$1, is $$22, @Nullable elb $$3) {
        if ($$1 instanceof axf) {
            dzq.a($$0, (axf)$$1, $$22, $$3).forEach($$2 -> dzq.a((dwo)((axf)$$1), $$22, $$2));
            $$0.a((axf)$$1, $$22, dlt.l, true);
        }
    }

    public static void a(eoh $$0, dwo $$1, is $$22, @Nullable elb $$3, @Nullable cgk $$4, dlt $$5) {
        if ($$1 instanceof axf) {
            dzq.a($$0, (axf)$$1, $$22, $$3, $$4, $$5).forEach($$2 -> dzq.a($$1, $$22, $$2));
            $$0.a((axf)$$1, $$22, $$5, true);
        }
    }

    public static void a(dwo $$0, is $$1, dlt $$2) {
        double $$3 = (double)cgu.av.m() / 2.0;
        double $$4 = (double)$$1.u() + 0.5 + bgj.a($$0.y, -0.25, 0.25);
        double $$5 = (double)$$1.v() + 0.5 + bgj.a($$0.y, -0.25, 0.25) - $$3;
        double $$6 = (double)$$1.w() + 0.5 + bgj.a($$0.y, -0.25, 0.25);
        dzq.a($$0, () -> new czl($$0, $$4, $$5, $$6, $$2), $$2);
    }

    public static void a(dwo $$0, is $$1, iz $$2, dlt $$3) {
        int $$4 = $$2.j();
        int $$5 = $$2.k();
        int $$6 = $$2.l();
        double $$7 = (double)cgu.av.l() / 2.0;
        double $$8 = (double)cgu.av.m() / 2.0;
        double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? bgj.a($$0.y, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
        double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? bgj.a($$0.y, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
        double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? bgj.a($$0.y, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
        double $$12 = $$4 == 0 ? bgj.a($$0.y, -0.1, 0.1) : (double)$$4 * 0.1;
        double $$13 = $$5 == 0 ? bgj.a($$0.y, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
        double $$14 = $$6 == 0 ? bgj.a($$0.y, -0.1, 0.1) : (double)$$6 * 0.1;
        dzq.a($$0, () -> new czl($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
    }

    private static void a(dwo $$0, Supplier<czl> $$1, dlt $$2) {
        block3: {
            block2: {
                if (!($$0 instanceof axf)) break block2;
                axf $$3 = (axf)$$0;
                if (!$$2.f() && $$3.U().a(eua.d).booleanValue()) break block3;
            }
            return;
        }
        czl $$5 = $$1.get();
        $$5.i();
        $$0.b($$5);
    }

    protected void a(axf $$0, is $$1, int $$2) {
        if ($$0.U().a(eua.d).booleanValue()) {
            cgz.a($$0, ftm.b($$1), $$2);
        }
    }

    public float e() {
        return this.G;
    }

    public void a(axf $$0, is $$1, dwi $$2) {
    }

    public void a(dwo $$0, is $$1, eoh $$2, cgk $$3) {
    }

    public @Nullable eoh a(dpu $$0) {
        return this.m();
    }

    public void a(dwo $$0, ddm $$1, is $$2, eoh $$3, @Nullable elb $$4, dlt $$5) {
        $$1.b(bdk.a.b(this));
        $$1.a(0.005f);
        dzq.a($$3, $$0, $$2, $$4, (cgk)$$1, $$5);
    }

    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
    }

    public boolean a(eoh $$0) {
        return !$$0.e() && !$$0.n();
    }

    public yw f() {
        return yh.c(this.z());
    }

    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        $$3.a($$4, 1.0f, $$3.en().l());
    }

    public void a(dvt $$0, cgk $$1) {
        $$1.k($$1.dN().d(1.0, 0.0, 1.0));
    }

    public float g() {
        return this.J;
    }

    public float i() {
        return this.K;
    }

    public float j() {
        return this.L;
    }

    protected void a(dwo $$0, ddm $$1, is $$2, eoh $$3) {
        $$0.a((cgk)$$1, 2001, $$2, dzq.j($$3));
    }

    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        this.a($$0, $$3, $$1, $$2);
        if ($$2.a(bdp.bi) && $$0 instanceof axf) {
            axf $$4 = (axf)$$0;
            dbk.a($$4, $$3, false);
        }
        $$0.a(etk.f, $$1, etk.a.a($$3, $$2));
        return $$2;
    }

    public void a(eoh $$0, dwo $$1, is $$2, dxo.c $$3) {
    }

    public boolean a(dwi $$0) {
        return true;
    }

    protected void a(eoi.a<dzq, eoh> $$0) {
    }

    public eoi<dzq, eoh> l() {
        return this.C;
    }

    protected final void l(eoh $$0) {
        this.d = $$0;
    }

    public final eoh m() {
        return this.d;
    }

    public final eoh m(eoh $$0) {
        eoh $$1 = this.m();
        for (epk<?> $$2 : $$0.b().l().d()) {
            if (!$$1.b($$2)) continue;
            $$1 = dzq.a($$0, $$1, $$2);
        }
        return $$1;
    }

    private static <T extends Comparable<T>> eoh a(eoh $$0, eoh $$1, epk<T> $$2) {
        return (eoh)$$1.b($$2, $$0.c($$2));
    }

    @Override
    public dlp h() {
        if (this.e == null) {
            this.e = dlp.a(this);
        }
        return this.e;
    }

    public boolean n() {
        return this.M;
    }

    public String toString() {
        return "Block{" + mi.e.e(this).g() + "}";
    }

    @Override
    protected dzq o() {
        return this;
    }

    protected Function<eoh, fug> a(Function<eoh, fug> $$0) {
        return arg_0 -> ((ImmutableMap)((ImmutableMap)this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0)))).get(arg_0);
    }

    protected Function<eoh, fug> a(Function<eoh, fug> $$02, epk<?> ... $$1) {
        Map<epk, Object> $$22 = Arrays.stream($$1).collect(Collectors.toMap($$0 -> $$0, $$0 -> $$0.a().getFirst()));
        ImmutableMap $$3 = (ImmutableMap)this.C.a().stream().filter($$12 -> $$22.entrySet().stream().allMatch($$1 -> $$12.c((epk)$$1.getKey()) == $$1.getValue())).collect(ImmutableMap.toImmutableMap(Function.identity(), $$02));
        return $$2 -> {
            for (Map.Entry $$3 : $$22.entrySet()) {
                $$2 = dzq.a($$2, (epk)$$3.getKey(), $$3.getValue());
            }
            return (fug)$$3.get($$2);
        };
    }

    private static <S extends eoj<?, S>, T extends Comparable<T>> S a(S $$0, epk<T> $$1, Object $$2) {
        return (S)((eoj)$$0.b($$1, (Comparable)((Comparable)$$2)));
    }

    @Deprecated
    public jd.c<dzq> p() {
        return this.b;
    }

    protected void a(axf $$0, is $$1, dlt $$2, cch $$3) {
        int $$4 = dsq.b($$0, $$2, $$3.a($$0.G_()));
        if ($$4 > 0) {
            this.a($$0, $$1, $$4);
        }
    }

    record a(fug a, fug b) {
        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean equals(Object $$0) {
            if (!($$0 instanceof a)) return false;
            a $$1 = (a)$$0;
            if (this.a != $$1.a) return false;
            if (this.b != $$1.b) return false;
            return true;
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(this.a) * 31 + System.identityHashCode(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "first;second", "a", "b"}, this);
        }
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface b {
    }
}

