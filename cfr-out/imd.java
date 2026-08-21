/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public final class imd
extends Record
implements ilu {
    private final amo c;
    private final List<a> d;
    private final double e;
    private final double f;
    static final Logger g = LogUtils.getLogger();
    public static final MapCodec<imd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("resource").forGetter(imd::b), (App)bfm.b(a.a.listOf()).fieldOf("regions").forGetter(imd::c), (App)Codec.DOUBLE.optionalFieldOf("divisor_x", (Object)1.0).forGetter(imd::d), (App)Codec.DOUBLE.optionalFieldOf("divisor_y", (Object)1.0).forGetter(imd::e)).apply((Applicative)$$0, imd::new));

    public imd(amo $$0, List<a> $$1, double $$2, double $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    @Override
    public void a(baz $$0, ilu.c $$1) {
        amo $$2 = a.a(this.c);
        Optional<bax> $$3 = $$0.getResource($$2);
        if ($$3.isPresent()) {
            ilz $$4 = new ilz($$2, $$3.get(), this.d.size());
            for (a $$5 : this.d) {
                $$1.a($$5.b, new b($$4, $$5, this.e, this.f));
            }
        } else {
            g.warn("Missing sprite: {}", (Object)$$2);
        }
    }

    public MapCodec<imd> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imd.class, "resource;regions;xDivisor;yDivisor", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imd.class, "resource;regions;xDivisor;yDivisor", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imd.class, "resource;regions;xDivisor;yDivisor", "c", "d", "e", "f"}, this, $$0);
    }

    public amo b() {
        return this.c;
    }

    public List<a> c() {
        return this.d;
    }

    public double d() {
        return this.e;
    }

    public double e() {
        return this.f;
    }

    public static final class a
    extends Record {
        final amo b;
        final double c;
        final double d;
        final double e;
        final double f;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("sprite").forGetter(a::a), (App)Codec.DOUBLE.fieldOf("x").forGetter(a::b), (App)Codec.DOUBLE.fieldOf("y").forGetter(a::c), (App)Codec.DOUBLE.fieldOf("width").forGetter(a::d), (App)Codec.DOUBLE.fieldOf("height").forGetter(a::e)).apply((Applicative)$$0, a::new));

        public a(amo $$0, double $$1, double $$2, double $$3, double $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sprite;x;y;width;height", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sprite;x;y;width;height", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sprite;x;y;width;height", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public amo a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }

        public double c() {
            return this.d;
        }

        public double d() {
            return this.e;
        }

        public double e() {
            return this.f;
        }
    }

    static class b
    implements ilu.a {
        private final ilz a;
        private final a b;
        private final double c;
        private final double d;

        b(ilz $$0, a $$1, double $$2, double $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public ilk get(ilt $$0) {
            try {
                fyh $$1 = this.a.a();
                double $$2 = (double)$$1.a() / this.c;
                double $$3 = (double)$$1.b() / this.d;
                int $$4 = bgj.c(this.b.c * $$2);
                int $$5 = bgj.c(this.b.d * $$3);
                int $$6 = bgj.c(this.b.e * $$2);
                int $$7 = bgj.c(this.b.f * $$3);
                fyh $$8 = new fyh(fyh.a.a, $$6, $$7, false);
                $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
                ilk ilk2 = new ilk(this.b.b, new ina($$6, $$7), $$8);
                return ilk2;
            }
            catch (Exception $$9) {
                g.error("Failed to unstitch region {}", (Object)this.b.b, (Object)$$9);
            }
            finally {
                this.a.b();
            }
            return ilf.b();
        }

        @Override
        public void a() {
            this.a.b();
        }
    }
}

