/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.IntFunction;

public final class ciq
extends Record {
    private final amo d;
    private final double e;
    private final a f;
    public static final MapCodec<ciq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("id").forGetter(ciq::a), (App)Codec.DOUBLE.fieldOf("amount").forGetter(ciq::b), (App)ciq$a.f.fieldOf("operation").forGetter(ciq::c)).apply((Applicative)$$0, ciq::new));
    public static final Codec<ciq> b = a.codec();
    public static final aao<ByteBuf, ciq> c = aao.a(amo.b, ciq::a, aam.m, ciq::b, ciq$a.e, ciq::c, ciq::new);

    public ciq(amo $$0, double $$1, a $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public boolean a(amo $$0) {
        return $$0.equals(this.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ciq.class, "id;amount;operation", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ciq.class, "id;amount;operation", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ciq.class, "id;amount;operation", "d", "e", "f"}, this, $$0);
    }

    public amo a() {
        return this.d;
    }

    public double b() {
        return this.e;
    }

    public a c() {
        return this.f;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("add_value", 0);
        public static final /* enum */ a b = new a("add_multiplied_base", 1);
        public static final /* enum */ a c = new a("add_multiplied_total", 2);
        public static final IntFunction<a> d;
        public static final aao<ByteBuf, a> e;
        public static final Codec<a> f;
        private final String g;
        private final int h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public int a() {
            return this.h;
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            i = ciq$a.b();
            d = beu.a(a::a, ciq$a.values(), beu.a.a);
            e = aam.a(d, a::a);
            f = bhh.a(a::values);
        }
    }
}

