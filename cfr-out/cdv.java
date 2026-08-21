/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.DataResult;

public interface cdv<Value> {
    public static final cdv<Float> a = cdv.a(0.0f, 1.0f);
    public static final cdv<Float> b = cdv.a(0.0f, Float.POSITIVE_INFINITY);

    public static <Value> cdv<Value> a() {
        return new cdv<Value>(){

            @Override
            public DataResult<Value> a(Value $$0) {
                return DataResult.success($$0);
            }

            @Override
            public Value b(Value $$0) {
                return $$0;
            }
        };
    }

    public static cdv<Float> a(final float $$0, final float $$1) {
        return new cdv<Float>(){

            @Override
            public DataResult<Float> a(Float $$02) {
                if ($$02.floatValue() >= $$0 && $$02.floatValue() <= $$1) {
                    return DataResult.success((Object)$$02);
                }
                return DataResult.error(() -> $$02 + " is not in range [" + $$0 + "; " + $$1 + "]");
            }

            @Override
            public Float b(Float $$02) {
                if ($$02.floatValue() >= $$0 && $$02.floatValue() <= $$1) {
                    return $$02;
                }
                return Float.valueOf(bgj.a($$02.floatValue(), $$0, $$1));
            }
        };
    }

    public DataResult<Value> a(Value var1);

    public Value b(Value var1);
}

