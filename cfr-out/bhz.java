/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Set;

public final class bhz
extends Enum<bhz> {
    public static final /* enum */ bhz a = new bhz(bqh.a);
    public static final /* enum */ bhz b = new bhz(bqh.b);
    public static final /* enum */ bhz c = new bhz(bqh.c);
    public static final /* enum */ bhz d = new bhz(bqh.d);
    public static final /* enum */ bhz e = new bhz(bqh.e);
    public static final /* enum */ bhz f = new bhz(bqh.f);
    public static final /* enum */ bhz g = new bhz(bqh.g);
    public static final /* enum */ bhz h = new bhz(bqh.h);
    public static final /* enum */ bhz i = new bhz(bqh.i);
    public static final /* enum */ bhz j = new bhz(bqh.j);
    public static final /* enum */ bhz k = new bhz(bqh.k);
    public static final /* enum */ bhz l = new bhz(bqh.l);
    public static final /* enum */ bhz m = new bhz(bqh.m);
    public static final /* enum */ bhz n = new bhz(bqh.n);
    public static final /* enum */ bhz o = new bhz(bqh.o);
    public static final /* enum */ bhz p = new bhz(bqh.p);
    public static final /* enum */ bhz q = new bhz(bqh.q);
    public static final /* enum */ bhz r = new bhz(bqh.r);
    public static final /* enum */ bhz s = new bhz(bqh.s);
    public static final /* enum */ bhz t = new bhz(bqh.t);
    public static final /* enum */ bhz u = new bhz(bqh.S);
    public static final /* enum */ bhz v = new bhz(bqh.u);
    public static final /* enum */ bhz w = new bhz(bqh.v);
    public static final Set<DSL.TypeReference> x;
    private final DSL.TypeReference y;
    private static final /* synthetic */ bhz[] z;

    public static bhz[] values() {
        return (bhz[])z.clone();
    }

    public static bhz valueOf(String $$0) {
        return Enum.valueOf(bhz.class, $$0);
    }

    private bhz(DSL.TypeReference $$0) {
        this.y = $$0;
    }

    static int a() {
        return w.b().a().b();
    }

    public <A> Codec<A> a(final Codec<A> $$0, final DataFixer $$1, final int $$2) {
        return new Codec<A>(){

            public <T> DataResult<T> encode(A $$02, DynamicOps<T> $$12, T $$22) {
                return $$0.encode($$02, $$12, $$22).flatMap($$1 -> $$12.mergeToMap($$1, $$12.createString("DataVersion"), $$12.createInt(bhz.a())));
            }

            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$02, T $$12) {
                int $$22 = $$02.get($$12, "DataVersion").flatMap(arg_0 -> $$02.getNumberValue(arg_0)).map(Number::intValue).result().orElse($$2);
                Dynamic $$3 = new Dynamic($$02, $$02.remove($$12, "DataVersion"));
                Dynamic $$4 = bhz.this.a($$1, $$3, $$22);
                return $$0.decode($$4);
            }
        };
    }

    public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2, int $$3) {
        return $$0.update(this.y, $$1, $$2, $$3);
    }

    public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2) {
        return this.a($$0, $$1, $$2, bhz.a());
    }

    public uz a(DataFixer $$0, uz $$1, int $$2, int $$3) {
        return (uz)this.a($$0, new Dynamic((DynamicOps)vn.a, (Object)$$1), $$2, $$3).getValue();
    }

    public uz a(DataFixer $$0, uz $$1, int $$2) {
        return this.a($$0, $$1, $$2, bhz.a());
    }

    private static /* synthetic */ bhz[] b() {
        return new bhz[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w};
    }

    static {
        z = bhz.b();
        x = Set.of(bhz.b.y);
    }
}

