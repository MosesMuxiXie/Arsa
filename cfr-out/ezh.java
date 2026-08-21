/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ezh
extends exx<faw> {
    public static final int a = 10;
    private static final int b = 42;
    private static final LoadingCache<Long, List<a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build((CacheLoader)new b());

    public ezh(Codec<faw> $$0) {
        super($$0);
    }

    public static List<a> a(dxn $$0) {
        bgr $$1 = bgr.a($$0.J());
        long $$2 = $$1.g() & 0xFFFFL;
        return (List)c.getUnchecked((Object)$$2);
    }

    @Override
    public boolean a(exz<faw> $$0) {
        faw $$1 = $$0.f();
        dxn $$2 = $$0.b();
        bgr $$3 = $$0.d();
        is $$4 = $$0.e();
        List<a> $$5 = $$1.b();
        if ($$5.isEmpty()) {
            $$5 = ezh.a($$2);
        }
        for (a $$6 : $$5) {
            if (!$$6.a($$4)) continue;
            this.a((dxf)$$2, $$3, $$1, $$6);
        }
        return true;
    }

    private void a(dxf $$0, bgr $$1, faw $$2, a $$3) {
        cyb $$19;
        int $$4 = $$3.c();
        for (is $$5 : is.c(new is($$3.a() - $$4, $$0.K_(), $$3.b() - $$4), new is($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
            if ($$5.d($$3.a(), $$5.v(), $$3.b()) <= (double)($$4 * $$4 + 1) && $$5.v() < $$3.d()) {
                this.a($$0, $$5, dzs.cK.m());
                continue;
            }
            if ($$5.v() <= 65) continue;
            this.a($$0, $$5, dzs.a.m());
        }
        if ($$3.e()) {
            int $$6 = -2;
            int $$7 = 2;
            int $$8 = 3;
            is.a $$9 = new is.a();
            for (int $$10 = -2; $$10 <= 2; ++$$10) {
                for (int $$11 = -2; $$11 <= 2; ++$$11) {
                    for (int $$12 = 0; $$12 <= 3; ++$$12) {
                        boolean $$15;
                        boolean $$13 = bgj.a($$10) == 2;
                        boolean $$14 = bgj.a($$11) == 2;
                        boolean bl2 = $$15 = $$12 == 3;
                        if (!$$13 && !$$14 && !$$15) continue;
                        boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                        boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                        eoh $$18 = (eoh)((eoh)((eoh)((eoh)dzs.fC.m().b(edy.a, $$16 && $$11 != -2)).b(edy.c, $$16 && $$11 != 2)).b(edy.d, $$17 && $$10 != -2)).b(edy.b, $$17 && $$10 != 2);
                        this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                    }
                }
            }
        }
        if (($$19 = cgu.V.a($$0.a(), cgt.d)) != null) {
            $$19.a($$2.c());
            $$19.n($$2.a());
            $$19.b((double)$$3.a() + 0.5, $$3.d() + 1, (double)$$3.b() + 0.5, $$1.i() * 360.0f, 0.0f);
            $$0.b($$19);
            is $$20 = $$19.dK();
            this.a($$0, $$20.e(), dzs.I.m());
            this.a($$0, $$20, ecv.a($$0, $$20));
        }
    }

    public static class a {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("centerX").orElse((Object)0).forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("centerZ").orElse((Object)0).forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("radius").orElse((Object)0).forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("height").orElse((Object)0).forGetter($$0 -> $$0.e), (App)Codec.BOOL.fieldOf("guarded").orElse((Object)false).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, a::new));
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final boolean f;
        private final fth g;

        public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = new fth($$0 - $$2, esh.e, $$1 - $$2, $$0 + $$2, esh.d, $$1 + $$2);
        }

        public boolean a(is $$0) {
            return jw.a($$0.u()) == jw.a(this.b) && jw.a($$0.w()) == jw.a(this.c);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }

        public fth f() {
            return this.g;
        }
    }

    static class b
    extends CacheLoader<Long, List<a>> {
        b() {
        }

        public List<a> a(Long $$0) {
            IntArrayList $$1 = bhs.a(IntStream.range(0, 10), bgr.a($$0));
            ArrayList $$2 = Lists.newArrayList();
            for (int $$3 = 0; $$3 < 10; ++$$3) {
                int $$4 = bgj.c(42.0 * Math.cos(2.0 * (-Math.PI + 0.3141592653589793 * (double)$$3)));
                int $$5 = bgj.c(42.0 * Math.sin(2.0 * (-Math.PI + 0.3141592653589793 * (double)$$3)));
                int $$6 = $$1.get($$3);
                int $$7 = 2 + $$6 / 3;
                int $$8 = 76 + $$6 * 3;
                boolean $$9 = $$6 == 1 || $$6 == 2;
                $$2.add(new a($$4, $$5, $$7, $$8, $$9));
            }
            return $$2;
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((Long)object);
        }
    }
}

