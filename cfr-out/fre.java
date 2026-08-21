/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public interface fre<T extends fre<T>> {
    public T b(frm.a var1);

    default public <E> T a_(Iterable<E> $$0, Function<E, frm.a> $$1) {
        T $$2 = this.d();
        for (E $$3 : $$0) {
            $$2 = $$2.b($$1.apply($$3));
        }
        return $$2;
    }

    public T d();
}

