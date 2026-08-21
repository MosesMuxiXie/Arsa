/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface cen<Argument>
extends cel<Integer, Argument> {
    public static final cen<Integer> e = new cen<Integer>(){

        public Integer a(Integer $$0, Integer $$1) {
            return bel.e($$0, $$1);
        }

        @Override
        public Codec<Integer> argumentCodec(cea<Integer> $$0) {
            return bfm.o;
        }

        @Override
        public cei<Integer> argumentKeyframeLerp(cea<Integer> $$0) {
            return cei.c();
        }

        @Override
        public /* synthetic */ Object apply(Object object, Object object2) {
            return this.a((Integer)object, (Integer)object2);
        }
    };
    public static final cen<Integer> f = bel::b;
    public static final cen<Integer> g = bel::c;
    public static final cen<Integer> h = bel::a;
    public static final cen<Integer> i = bel::a;
    public static final cen<b> j = new cen<b>(){

        public Integer a(Integer $$0, b $$1) {
            int $$2 = bel.b(bel.f($$0), $$1.b);
            return bel.a($$1.c, (int)$$0, $$2);
        }

        @Override
        public Codec<b> argumentCodec(cea<Integer> $$0) {
            return b.a;
        }

        @Override
        public cei<b> argumentKeyframeLerp(cea<Integer> $$02) {
            return ($$0, $$1, $$2) -> new b(bgj.h($$0, $$1.b, $$2.b), bgj.h($$0, $$1.c, $$2.c));
        }

        @Override
        public /* synthetic */ Object apply(Object object, Object object2) {
            return this.a((Integer)object, (b)object2);
        }
    };

    @FunctionalInterface
    public static interface c
    extends cen<Integer> {
        @Override
        default public Codec<Integer> argumentCodec(cea<Integer> $$0) {
            return bfm.n;
        }

        @Override
        default public cei<Integer> argumentKeyframeLerp(cea<Integer> $$0) {
            return cei.c();
        }
    }

    @FunctionalInterface
    public static interface a
    extends cen<Integer> {
        @Override
        default public Codec<Integer> argumentCodec(cea<Integer> $$02) {
            return Codec.either(bfm.o, bfm.l).xmap(Either::unwrap, $$0 -> bel.b($$0) == 255 ? Either.right((Object)$$0) : Either.left((Object)$$0));
        }

        @Override
        default public cei<Integer> argumentKeyframeLerp(cea<Integer> $$0) {
            return cei.c();
        }
    }

    public static final class b
    extends Record {
        final float b;
        final float c;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("brightness").forGetter(b::a), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("factor").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(float $$0, float $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "brightness;factor", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "brightness;factor", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "brightness;factor", "b", "c"}, this, $$0);
        }

        public float a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }
    }
}

