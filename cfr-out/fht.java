/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class fht
extends ffo {
    public static final MapCodec<fht> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group(fht.a($$02), (App)fht$a.c.fieldOf("mineshaft_type").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fht::new));
    private final a e;

    public fht(ffo.c $$0, a $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        $$0.f().j();
        dvu $$1 = $$0.h();
        is $$2 = new is($$1.c(), 50, $$1.f());
        fgg $$3 = new fgg();
        int $$4 = this.a($$3, $$0);
        return Optional.of(new ffo.b($$2.b(0, $$4, 0), (Either<Consumer<fgg>, fgg>)Either.right((Object)$$3)));
    }

    private int a(fgg $$0, ffo.a $$1) {
        dvu $$2 = $$1.h();
        evp $$3 = $$1.f();
        eqg $$4 = $$1.b();
        fhs.d $$5 = new fhs.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
        $$0.a($$5);
        $$5.a($$5, $$0, $$3);
        int $$6 = $$4.f();
        if (this.e == fht$a.b) {
            is $$7 = $$0.d().g();
            int $$8 = $$4.a($$7.u(), $$7.w(), euq.a.a, $$1.i(), $$1.d());
            int $$9 = $$8 <= $$6 ? $$6 : bgj.b((bgr)$$3, $$6, $$8);
            int $$10 = $$9 - $$7.v();
            $$0.a($$10);
            return $$10;
        }
        return $$0.a($$6, $$4.g(), $$3, 10);
    }

    @Override
    public ffx<?> e() {
        return ffx.h;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("normal", dzs.X, dzs.n, dzs.ex);
        public static final /* enum */ a b = new a("mesa", dzs.ad, dzs.t, dzs.lc);
        public static final Codec<a> c;
        private static final IntFunction<a> d;
        private final String e;
        private final eoh f;
        private final eoh g;
        private final eoh h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, dzq $$1, dzq $$2, dzq $$3) {
            this.e = $$0;
            this.f = $$1.m();
            this.g = $$2.m();
            this.h = $$3.m();
        }

        public String a() {
            return this.e;
        }

        public static a a(int $$0) {
            return d.apply($$0);
        }

        public eoh b() {
            return this.f;
        }

        public eoh d() {
            return this.g;
        }

        public eoh e() {
            return this.h;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b};
        }

        static {
            i = fht$a.f();
            c = bhh.a(a::values);
            d = beu.a(Enum::ordinal, fht$a.values(), beu.a.a);
        }
    }
}

