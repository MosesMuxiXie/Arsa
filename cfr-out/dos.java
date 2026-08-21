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
import java.util.Map;

public final class dos
extends Record {
    private final Map<String, a> c;
    public static final dos a = new dos(Map.of());
    public static final Codec<dos> b = Codec.unboundedMap((Codec)Codec.STRING, dos$a.a).xmap(dos::new, dos::a);

    public dos(Map<String, a> $$0) {
        this.c = $$0;
    }

    public dos a(String $$0, a $$1) {
        return new dos(bhs.a(this.c, $$0, $$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dos.class, "decorations", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dos.class, "decorations", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dos.class, "decorations", "c"}, this, $$0);
    }

    public Map<String, a> a() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final jd<fmr> b;
        private final double c;
        private final double d;
        private final float e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)fmr.b.fieldOf("type").forGetter(a::a), (App)Codec.DOUBLE.fieldOf("x").forGetter(a::b), (App)Codec.DOUBLE.fieldOf("z").forGetter(a::c), (App)Codec.FLOAT.fieldOf("rotation").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(jd<fmr> $$0, double $$1, double $$2, float $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;x;z;rotation", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;x;z;rotation", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;x;z;rotation", "b", "c", "d", "e"}, this, $$0);
        }

        public jd<fmr> a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }

        public double c() {
            return this.d;
        }

        public float d() {
            return this.e;
        }
    }
}

