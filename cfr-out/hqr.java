/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.UnaryOperator;

@FunctionalInterface
public interface hqr
extends UnaryOperator<hqq> {
    public static final a<g> a = hqq::a;
    public static final a<g> b = hqq::b;
    public static final a<g> c = hqq::c;
    public static final a<amo> d = hqq::a;
    public static final a<Boolean> e = hqq::a;

    default public hqr then(hqr $$0) {
        return $$1 -> (hqq)$$0.apply((hqq)this.apply($$1));
    }

    @FunctionalInterface
    public static interface a<T> {
        public hqq apply(hqq var1, T var2);

        default public hqr withValue(T $$0) {
            return $$1 -> this.apply((hqq)$$1, $$0);
        }
    }
}

