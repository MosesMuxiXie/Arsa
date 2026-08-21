/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class eqn<T>
implements eqw<T> {
    private final ji<T> a;

    public eqn(ji<T> $$0) {
        this.a = $$0;
    }

    @Override
    public int a(T $$0, eqx<T> $$1) {
        int $$2 = this.a.a($$0);
        return $$2 == -1 ? 0 : $$2;
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        return true;
    }

    @Override
    public T a(int $$0) {
        T $$1 = this.a.a($$0);
        if ($$1 == null) {
            throw new eqv($$0);
        }
        return $$1;
    }

    @Override
    public void a(wx $$0, ji<T> $$1) {
    }

    @Override
    public void b(wx $$0, ji<T> $$1) {
    }

    @Override
    public int a(ji<T> $$0) {
        return 0;
    }

    @Override
    public int a() {
        return this.a.d();
    }

    @Override
    public eqw<T> b() {
        return this;
    }
}

