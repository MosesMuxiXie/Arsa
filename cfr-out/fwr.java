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
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class fwr
implements fwq {
    private final Int2ObjectMap<god> b;

    public fwr(Map<Integer, Float> $$02) {
        this.b = new Int2ObjectOpenHashMap($$02.size());
        $$02.forEach(($$0, $$1) -> this.b.put($$0.intValue(), (Object)new god($$1.floatValue())));
    }

    @Override
    public @Nullable fwt a(int $$0) {
        return (fwt)this.b.get($$0);
    }

    @Override
    public IntSet a() {
        return IntSets.unmodifiable((IntSet)this.b.keySet());
    }

    public record a(Map<Integer, Float> c) implements goj
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.unboundedMap(bfm.N, (Codec)Codec.FLOAT).fieldOf("advances").forGetter(a::c)).apply((Applicative)$$0, a::new));

        @Override
        public gok a() {
            return gok.c;
        }

        @Override
        public Either<goj.b, goj.c> b() {
            goj.b $$02 = $$0 -> new fwr(this.c);
            return Either.left((Object)$$02);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "advances", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "advances", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "advances", "c"}, this, $$0);
        }
    }
}

