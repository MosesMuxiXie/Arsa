/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public final class fhp
extends ffo {
    public static final fgo d = fgo.b;
    public static final fja e = fja.b;
    public static final int f = 128;
    public static final int g = 0;
    public static final int h = 20;
    public static final MapCodec<fhp> i = RecordCodecBuilder.mapCodec($$02 -> $$02.group(fhp.a($$02), (App)fgy.b.fieldOf("start_pool").forGetter($$0 -> $$0.j), (App)amo.a.optionalFieldOf("start_jigsaw_name").forGetter($$0 -> $$0.k), (App)Codec.intRange((int)0, (int)20).fieldOf("size").forGetter($$0 -> $$0.l), (App)fdv.c.fieldOf("start_height").forGetter($$0 -> $$0.m), (App)Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0 -> $$0.n), (App)euq.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0 -> $$0.o), (App)fhp$a.a.fieldOf("max_distance_from_center").forGetter($$0 -> $$0.p), (App)Codec.list(fha.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0 -> $$0.q), (App)fgo.a.optionalFieldOf("dimension_padding", (Object)d).forGetter($$0 -> $$0.r), (App)fja.c.optionalFieldOf("liquid_settings", (Object)e).forGetter($$0 -> $$0.s)).apply((Applicative)$$02, fhp::new)).validate(fhp::a);
    private final jd<fgy> j;
    private final Optional<amo> k;
    private final int l;
    private final fdv m;
    private final boolean n;
    private final Optional<euq.a> o;
    private final a p;
    private final List<fha> q;
    private final fgo r;
    private final fja s;

    private static DataResult<fhp> a(fhp $$0) {
        int $$1;
        switch ($$0.d()) {
            default: {
                throw new MatchException(null, null);
            }
            case a: {
                int n2 = 0;
                break;
            }
            case b: 
            case c: 
            case d: 
            case e: {
                int n2 = $$1 = 12;
            }
        }
        if ($$0.p.a() + $$1 > 128) {
            return DataResult.error(() -> "Horizontal structure size including terrain adaptation must not exceed 128");
        }
        return DataResult.success((Object)$$0);
    }

    public fhp(ffo.c $$0, jd<fgy> $$1, Optional<amo> $$2, int $$3, fdv $$4, boolean $$5, Optional<euq.a> $$6, a $$7, List<fha> $$8, fgo $$9, fja $$10) {
        super($$0);
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
        this.m = $$4;
        this.n = $$5;
        this.o = $$6;
        this.p = $$7;
        this.q = $$8;
        this.r = $$9;
        this.s = $$10;
    }

    public fhp(ffo.c $$0, jd<fgy> $$1, int $$2, fdv $$3, boolean $$4, euq.a $$5) {
        this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), new a(80), List.of(), d, e);
    }

    public fhp(ffo.c $$0, jd<fgy> $$1, int $$2, fdv $$3, boolean $$4) {
        this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), new a(80), List.of(), d, e);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        dvu $$1 = $$0.h();
        int $$2 = this.m.a($$0.f(), new evn($$0.b(), $$0.i()));
        is $$3 = new is($$1.e(), $$2, $$1.f());
        return fgs.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, fhc.create(this.q, $$3, $$0.g()), this.r, this.s);
    }

    @Override
    public ffx<?> e() {
        return ffx.f;
    }

    @VisibleForTesting
    public jd<fgy> f() {
        return this.j;
    }

    @VisibleForTesting
    public List<fha> g() {
        return this.q;
    }

    public static final class a
    extends Record {
        private final int b;
        private final int c;
        private static final Codec<Integer> d = Codec.intRange((int)1, (int)128);
        private static final Codec<a> e = RecordCodecBuilder.create($$0 -> $$0.group((App)d.fieldOf("horizontal").forGetter(a::a), (App)bfm.a(1, esh.c).optionalFieldOf("vertical", (Object)esh.c).forGetter(a::b)).apply((Applicative)$$0, a::new));
        public static final Codec<a> a = Codec.either(e, d).xmap($$0 -> (a)$$0.map(Function.identity(), a::new), $$0 -> $$0.b == $$0.c ? Either.right((Object)$$0.b) : Either.left((Object)$$0));

        public a(int $$0) {
            this($$0, $$0);
        }

        public a(int $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "horizontal;vertical", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "horizontal;vertical", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "horizontal;vertical", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }
}

