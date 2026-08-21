/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.function.Function;

public interface bes<C> {
    public static final bes<Float> a = bes.a($$0 -> $$0);

    public float a(C var1);

    public float a();

    public float b();

    public static bes<Float> a(final Float2FloatFunction $$0) {
        return new bes<Float>(){

            @Override
            public float a(Float $$02) {
                return ((Float)$$0.apply((Object)$$02)).floatValue();
            }

            @Override
            public float a() {
                return Float.NEGATIVE_INFINITY;
            }

            @Override
            public float b() {
                return Float.POSITIVE_INFINITY;
            }
        };
    }

    default public <C2> bes<C2> a(final Function<C2, C> $$0) {
        final bes $$1 = this;
        return new bes<C2>(this){

            @Override
            public float a(C2 $$02) {
                return $$1.a($$0.apply($$02));
            }

            @Override
            public float a() {
                return $$1.a();
            }

            @Override
            public float b() {
                return $$1.b();
            }
        };
    }
}

