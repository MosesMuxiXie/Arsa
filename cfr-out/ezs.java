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
import java.util.List;

public final class ezs
extends Record
implements fac {
    private final List<a> b;
    private final iz c;
    private final evx d;
    private final boolean e;
    public static final Codec<ezs> a = RecordCodecBuilder.create($$0 -> $$0.group((App)ezs$a.a.listOf().fieldOf("layers").forGetter(ezs::a), (App)iz.g.fieldOf("direction").forGetter(ezs::b), (App)evx.b.fieldOf("allowed_placement").forGetter(ezs::c), (App)Codec.BOOL.fieldOf("prioritize_tip").forGetter(ezs::d)).apply((Applicative)$$0, ezs::new));

    public ezs(List<a> $$0, iz $$1, evx $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static a a(cch $$0, fcd $$1) {
        return new a($$0, $$1);
    }

    public static ezs b(cch $$0, fcd $$1) {
        return new ezs(List.of(ezs.a($$0, $$1)), iz.b, evx.c, false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ezs.class, "layers;direction;allowedPlacement;prioritizeTip", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ezs.class, "layers;direction;allowedPlacement;prioritizeTip", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ezs.class, "layers;direction;allowedPlacement;prioritizeTip", "b", "c", "d", "e"}, this, $$0);
    }

    public List<a> a() {
        return this.b;
    }

    public iz b() {
        return this.c;
    }

    public evx c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public static final class a
    extends Record {
        private final cch b;
        private final fcd c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cch.d.fieldOf("height").forGetter(a::a), (App)fcd.a.fieldOf("provider").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(cch $$0, fcd $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "height;state", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "height;state", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "height;state", "b", "c"}, this, $$0);
        }

        public cch a() {
            return this.b;
        }

        public fcd b() {
            return this.c;
        }
    }
}

