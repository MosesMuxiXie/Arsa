/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface bbj {
    public static final Codec<bbj> a = mi.aM.q().dispatch(bbj::a, $$0 -> $$0);

    public boolean a(bbn var1);

    public MapCodec<? extends bbj> a();

    public static final class b
    extends Record
    implements bbj {
        private final bbi c;
        public static final MapCodec<b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bbi.b.fieldOf("permission").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(bbi $$0) {
            this.c = $$0;
        }

        public MapCodec<b> a() {
            return b;
        }

        @Override
        public boolean a(bbn $$0) {
            return $$0.hasPermission(this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "permission", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "permission", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "permission", "c"}, this, $$0);
        }

        public bbi b() {
            return this.c;
        }
    }

    public static class a
    implements bbj {
        public static final a b = new a();
        public static final MapCodec<a> c = MapCodec.unit((Object)b);

        private a() {
        }

        @Override
        public boolean a(bbn $$0) {
            return true;
        }

        public MapCodec<a> a() {
            return c;
        }
    }
}

