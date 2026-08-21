/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ihp
implements ihj {
    private static final int a = 16;
    private final iiv b;
    private final float c;
    private final float[] d;
    private final ihj[] e;
    private final ihj f;

    ihp(iiv $$0, float $$1, float[] $$2, ihj[] $$3, ihj $$4) {
        this.b = $$0;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.c = $$1;
    }

    private static int a(float[] $$0, float $$1) {
        if ($$0.length < 16) {
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                if (!($$0[$$2] > $$1)) continue;
                return $$2 - 1;
            }
            return $$0.length - 1;
        }
        int $$3 = Arrays.binarySearch($$0, $$1);
        if ($$3 < 0) {
            int $$4 = ~$$3;
            return $$4 - 1;
        }
        return $$3;
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        ihj $$10;
        $$0.a(this);
        float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
        if (Float.isNaN($$7)) {
            ihj $$8 = this.f;
        } else {
            int $$9 = ihp.a(this.d, $$7);
            $$10 = $$9 == -1 ? this.f : this.e[$$9];
        }
        $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    public static final class a
    extends Record {
        final float c;
        final ihj.b d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.FLOAT.fieldOf("threshold").forGetter(a::a), (App)ihl.a.fieldOf("model").forGetter(a::b)).apply((Applicative)$$0, a::new));
        public static final Comparator<a> b = Comparator.comparingDouble(a::a);

        public a(float $$0, ihj.b $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "threshold;model", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "threshold;model", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "threshold;model", "c", "d"}, this, $$0);
        }

        public float a() {
            return this.c;
        }

        public ihj.b b() {
            return this.d;
        }
    }

    public record b(iiv b, float c, List<a> d, Optional<ihj.b> e) implements ihj.b
    {
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)iiu.a.forGetter(b::b), (App)Codec.FLOAT.optionalFieldOf("scale", (Object)Float.valueOf(1.0f)).forGetter(b::c), (App)ihp$a.a.listOf().fieldOf("entries").forGetter(b::d), (App)ihl.a.optionalFieldOf("fallback").forGetter(b::e)).apply((Applicative)$$0, b::new));

        public MapCodec<b> a() {
            return a;
        }

        @Override
        public ihj a(ihj.a $$0) {
            float[] $$12 = new float[this.d.size()];
            ihj[] $$2 = new ihj[this.d.size()];
            ArrayList<a> $$3 = new ArrayList<a>(this.d);
            $$3.sort(ihp$a.b);
            for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                a $$5 = (a)$$3.get($$4);
                $$12[$$4] = $$5.c;
                $$2[$$4] = $$5.d.a($$0);
            }
            ihj $$6 = this.e.map($$1 -> $$1.a($$0)).orElse($$0.e());
            return new ihp(this.b, this.c, $$12, $$2, $$6);
        }

        @Override
        public void a(ioe.a $$0) {
            this.e.ifPresent($$1 -> $$1.a($$0));
            this.d.forEach($$1 -> $$1.d.a($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "property;scale;entries;fallback", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "property;scale;entries;fallback", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "property;scale;entries;fallback", "b", "c", "d", "e"}, this, $$0);
        }
    }
}

