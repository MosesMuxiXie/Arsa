/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public interface ejq
extends eat<a> {
    public static final Supplier<BiMap<dzq, dzq>> x_ = Suppliers.memoize(() -> ImmutableBiMap.builder().put((Object)dzs.rW, (Object)dzs.rX).put((Object)dzs.rX, (Object)dzs.rY).put((Object)dzs.rY, (Object)dzs.rZ).put((Object)dzs.sf, (Object)dzs.se).put((Object)dzs.se, (Object)dzs.sd).put((Object)dzs.sd, (Object)dzs.sc).put((Object)dzs.sj, (Object)dzs.si).put((Object)dzs.si, (Object)dzs.sh).put((Object)dzs.sh, (Object)dzs.sg).put((Object)dzs.sv, (Object)dzs.su).put((Object)dzs.su, (Object)dzs.st).put((Object)dzs.st, (Object)dzs.ss).put((Object)dzs.sr, (Object)dzs.sq).put((Object)dzs.sq, (Object)dzs.sp).put((Object)dzs.sp, (Object)dzs.so).put((Object)dzs.sM, (Object)dzs.sN).put((Object)dzs.sN, (Object)dzs.sP).put((Object)dzs.sP, (Object)dzs.sO).put((Object)dzs.sU, (Object)dzs.sV).put((Object)dzs.sV, (Object)dzs.sX).put((Object)dzs.sX, (Object)dzs.sW).putAll(dzs.fD.a()).put((Object)dzs.tc, (Object)dzs.td).put((Object)dzs.td, (Object)dzs.te).put((Object)dzs.te, (Object)dzs.tf).put((Object)dzs.tk, (Object)dzs.tl).put((Object)dzs.tl, (Object)dzs.tm).put((Object)dzs.tm, (Object)dzs.tn).putAll(dzs.pd.a()).put((Object)dzs.ts, (Object)dzs.tt).put((Object)dzs.tt, (Object)dzs.tu).put((Object)dzs.tu, (Object)dzs.tv).put((Object)dzs.tA, (Object)dzs.tB).put((Object)dzs.tB, (Object)dzs.tC).put((Object)dzs.tC, (Object)dzs.tD).put((Object)dzs.tI, (Object)dzs.tJ).put((Object)dzs.tJ, (Object)dzs.tK).put((Object)dzs.tK, (Object)dzs.tL).putAll(dzs.fF.a()).build());
    public static final Supplier<BiMap<dzq, dzq>> y_ = Suppliers.memoize(() -> x_.get().inverse());

    public static Optional<dzq> a(dzq $$0) {
        return Optional.ofNullable((dzq)y_.get().get((Object)$$0));
    }

    public static dzq b(dzq $$0) {
        dzq $$1 = $$0;
        dzq $$2 = (dzq)y_.get().get((Object)$$1);
        while ($$2 != null) {
            $$1 = $$2;
            $$2 = (dzq)y_.get().get((Object)$$1);
        }
        return $$1;
    }

    public static Optional<eoh> b(eoh $$0) {
        return ejq.a($$0.b()).map($$1 -> $$1.m($$0));
    }

    public static Optional<dzq> c(dzq $$0) {
        return Optional.ofNullable((dzq)x_.get().get((Object)$$0));
    }

    public static eoh c(eoh $$0) {
        return ejq.b($$0.b()).m($$0);
    }

    @Override
    default public Optional<eoh> k_(eoh $$0) {
        return ejq.c($$0.b()).map($$1 -> $$1.m($$0));
    }

    @Override
    default public float aw_() {
        if (this.c() == a.a) {
            return 0.75f;
        }
        return 1.0f;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("unaffected");
        public static final /* enum */ a b = new a("exposed");
        public static final /* enum */ a c = new a("weathered");
        public static final /* enum */ a d = new a("oxidized");
        public static final IntFunction<a> e;
        public static final Codec<a> f;
        public static final aao<ByteBuf, a> g;
        private final String h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.h = $$0;
        }

        @Override
        public String c() {
            return this.h;
        }

        public a a() {
            return e.apply(this.ordinal() + 1);
        }

        public a b() {
            return e.apply(this.ordinal() - 1);
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d};
        }

        static {
            i = ejq$a.d();
            e = beu.a(Enum::ordinal, ejq$a.values(), beu.a.c);
            f = bhh.a(a::values);
            g = aam.a(e, Enum::ordinal);
        }
    }
}

