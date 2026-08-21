/*
 * Decompiled with CFR 0.152.
 */
public interface cei<T> {
    public static cei<Float> a() {
        return bgj::h;
    }

    public static cei<Float> a(float $$0) {
        return ($$1, $$2, $$3) -> {
            float $$4 = bgj.f($$3.floatValue() - $$2.floatValue());
            if (Math.abs($$4) >= $$0) {
                return $$3;
            }
            return Float.valueOf($$2.floatValue() + $$1 * $$4);
        };
    }

    public static <T> cei<T> b() {
        return ($$0, $$1, $$2) -> $$1;
    }

    public static <T> cei<T> b(float $$0) {
        return ($$1, $$2, $$3) -> $$1 >= $$0 ? $$3 : $$2;
    }

    public static cei<Integer> c() {
        return bel::a;
    }

    public T apply(float var1, T var2, T var3);
}

