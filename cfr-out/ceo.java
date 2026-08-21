/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface ceo<Argument>
extends cel<Float, Argument> {
    public static final ceo<cep> e = new ceo<cep>(){

        public Float a(Float $$0, cep $$1) {
            return Float.valueOf(bgj.h($$1.b(), $$0.floatValue(), $$1.a()));
        }

        @Override
        public Codec<cep> argumentCodec(cea<Float> $$0) {
            return cep.a;
        }

        @Override
        public cei<cep> argumentKeyframeLerp(cea<Float> $$02) {
            return ($$0, $$1, $$2) -> new cep(bgj.h($$0, $$1.a(), $$2.a()), bgj.h($$0, $$1.b(), $$2.b()));
        }

        @Override
        public /* synthetic */ Object apply(Object object, Object object2) {
            return this.a((Float)object, (cep)object2);
        }
    };
    public static final ceo<Float> f = Float::sum;
    public static final ceo<Float> g = ($$0, $$1) -> Float.valueOf($$0.floatValue() - $$1.floatValue());
    public static final ceo<Float> h = ($$0, $$1) -> Float.valueOf($$0.floatValue() * $$1.floatValue());
    public static final ceo<Float> i = Math::min;
    public static final ceo<Float> j = Math::max;

    @FunctionalInterface
    public static interface a
    extends ceo<Float> {
        @Override
        default public Codec<Float> argumentCodec(cea<Float> $$0) {
            return Codec.FLOAT;
        }

        @Override
        default public cei<Float> argumentKeyframeLerp(cea<Float> $$0) {
            return cei.a();
        }
    }
}

