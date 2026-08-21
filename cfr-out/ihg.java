/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ihg
implements ihj {
    private final List<ihj> a;

    public ihg(List<ihj> $$0) {
        this.a = $$0;
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        $$0.a(this.a.size());
        for (ihj $$7 : this.a) {
            $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }
    }

    public record a(List<ihj.b> b) implements ihj.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ihl.a.listOf().fieldOf("models").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public void a(ioe.a $$0) {
            for (ihj.b $$1 : this.b) {
                $$1.a($$0);
            }
        }

        @Override
        public ihj a(ihj.a $$0) {
            return new ihg(this.b.stream().map($$1 -> $$1.a($$0)).toList());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "models", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "models", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "models", "b"}, this, $$0);
        }
    }
}

