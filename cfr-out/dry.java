/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface dry {
    public static final Codec<dry> d = mi.ay.q().dispatch(dry::a, a::a);
    public static final aao<xq, dry> e = aam.a(mj.ao).b(dry::a, a::b);

    public dse d();

    public dse e();

    public a<? extends dry> a();

    default public boolean a(dgz $$0) {
        return this.d().a($$0) && this.e().a($$0);
    }

    public record a<T extends dry>(MapCodec<T> a, aao<xq, T> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "codec;streamCodec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "codec;streamCodec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "codec;streamCodec", "a", "b"}, this, $$0);
        }
    }
}

