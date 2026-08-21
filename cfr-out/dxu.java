/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.OptionalInt;

public final class dxu
extends Record {
    private final int b;
    private final Optional<Integer> c;
    private final Optional<Integer> d;
    private final Optional<Integer> e;
    private final b f;
    public static final Codec<dxu> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.n.fieldOf("water_color").forGetter(dxu::a), (App)bfm.n.optionalFieldOf("foliage_color").forGetter(dxu::b), (App)bfm.n.optionalFieldOf("dry_foliage_color").forGetter(dxu::c), (App)bfm.n.optionalFieldOf("grass_color").forGetter(dxu::d), (App)dxu$b.d.optionalFieldOf("grass_color_modifier", (Object)dxu$b.a).forGetter(dxu::e)).apply((Applicative)$$0, dxu::new));

    public dxu(int $$0, Optional<Integer> $$1, Optional<Integer> $$2, Optional<Integer> $$3, b $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dxu.class, "waterColor;foliageColorOverride;dryFoliageColorOverride;grassColorOverride;grassColorModifier", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dxu.class, "waterColor;foliageColorOverride;dryFoliageColorOverride;grassColorOverride;grassColorModifier", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dxu.class, "waterColor;foliageColorOverride;dryFoliageColorOverride;grassColorOverride;grassColorModifier", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public int a() {
        return this.b;
    }

    public Optional<Integer> b() {
        return this.c;
    }

    public Optional<Integer> c() {
        return this.d;
    }

    public Optional<Integer> d() {
        return this.e;
    }

    public b e() {
        return this.f;
    }

    public static abstract sealed class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b("none"){

            @Override
            public int a(double $$0, double $$1, int $$2) {
                return $$2;
            }
        };
        public static final /* enum */ b b = new b("dark_forest"){

            @Override
            public int a(double $$0, double $$1, int $$2) {
                return ($$2 & 0xFEFEFE) + 2634762 >> 1;
            }
        };
        public static final /* enum */ b c = new b("swamp"){

            @Override
            public int a(double $$0, double $$1, int $$2) {
                double $$3 = dxo.e.a($$0 * 0.0225, $$1 * 0.0225, false);
                if ($$3 < -0.1) {
                    return 5011004;
                }
                return 6975545;
            }
        };
        private final String e;
        public static final Codec<b> d;
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public abstract int a(double var1, double var3, int var5);

        b(String $$0) {
            this.e = $$0;
        }

        public String a() {
            return this.e;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c};
        }

        static {
            f = dxu$b.b();
            d = bhh.a(b::values);
        }
    }

    public static class a {
        private OptionalInt a = OptionalInt.empty();
        private Optional<Integer> b = Optional.empty();
        private Optional<Integer> c = Optional.empty();
        private Optional<Integer> d = Optional.empty();
        private b e = dxu$b.a;

        public a a(int $$0) {
            this.a = OptionalInt.of($$0);
            return this;
        }

        public a b(int $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        public a c(int $$0) {
            this.c = Optional.of($$0);
            return this;
        }

        public a d(int $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public a a(b $$0) {
            this.e = $$0;
            return this;
        }

        public dxu a() {
            return new dxu(this.a.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")), this.b, this.c, this.d, this.e);
        }
    }
}

