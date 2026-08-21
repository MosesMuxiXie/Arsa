/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.IntFunction;

public final class ye
extends Record {
    private final String c;
    private final List<a> d;
    private final zf e;
    public static final Codec<ye> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("translation_key").forGetter(ye::a), (App)ye$a.d.listOf().fieldOf("parameters").forGetter(ye::b), (App)zf.b.b.optionalFieldOf("style", (Object)zf.a).forGetter(ye::c)).apply((Applicative)$$0, ye::new));
    public static final aao<xq, ye> b = aao.a(aam.p, ye::a, ye$a.e.a(aam.a()), ye::b, zf.b.c, ye::c, ye::new);

    public ye(String $$0, List<a> $$1, zf $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static ye a(String $$0) {
        return new ye($$0, List.of(ye$a.a, ye$a.c), zf.a);
    }

    public static ye b(String $$0) {
        zf $$1 = zf.a.a(l.h).b(true);
        return new ye($$0, List.of(ye$a.a, ye$a.c), $$1);
    }

    public static ye c(String $$0) {
        zf $$1 = zf.a.a(l.h).b(true);
        return new ye($$0, List.of(ye$a.b, ye$a.c), $$1);
    }

    public static ye d(String $$0) {
        return new ye($$0, List.of(ye$a.b, ye$a.a, ye$a.c), zf.a);
    }

    public yh a(yh $$0, yd.a $$1) {
        Object[] $$2 = this.b($$0, $$1);
        return yh.a(this.c, $$2).c(this.e);
    }

    private yh[] b(yh $$0, yd.a $$1) {
        yh[] $$2 = new yh[this.d.size()];
        for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
            a $$4 = this.d.get($$3);
            $$2[$$3] = $$4.a($$0, $$1);
        }
        return $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ye.class, "translationKey;parameters;style", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ye.class, "translationKey;parameters;style", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ye.class, "translationKey;parameters;style", "c", "d", "e"}, this, $$0);
    }

    public String a() {
        return this.c;
    }

    public List<a> b() {
        return this.d;
    }

    public zf c() {
        return this.e;
    }

    public static final class ye$a
    extends Enum<ye$a>
    implements bhh {
        public static final /* enum */ ye$a a = new ye$a(0, "sender", ($$0, $$1) -> $$1.b());
        public static final /* enum */ ye$a b = new ye$a(1, "target", ($$0, $$1) -> $$1.c().orElse(yg.a));
        public static final /* enum */ ye$a c = new ye$a(2, "content", ($$0, $$1) -> $$0);
        private static final IntFunction<ye$a> f;
        public static final Codec<ye$a> d;
        public static final aao<ByteBuf, ye$a> e;
        private final int g;
        private final String h;
        private final a i;
        private static final /* synthetic */ ye$a[] j;

        public static ye$a[] values() {
            return (ye$a[])j.clone();
        }

        public static ye$a valueOf(String $$0) {
            return Enum.valueOf(ye$a.class, $$0);
        }

        private ye$a(int $$0, String $$1, a $$2) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
        }

        public yh a(yh $$0, yd.a $$1) {
            return this.i.select($$0, $$1);
        }

        @Override
        public String c() {
            return this.h;
        }

        private static /* synthetic */ ye$a[] a() {
            return new ye$a[]{a, b, c};
        }

        static {
            j = ye$a.a();
            f = beu.a($$0 -> $$0.g, ye$a.values(), beu.a.a);
            d = bhh.a(ye$a::values);
            e = aam.a(f, (T $$0) -> $$0.g);
        }

        public static interface a {
            public yh select(yh var1, yd.a var2);
        }
    }
}

