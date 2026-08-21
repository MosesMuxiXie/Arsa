/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class eqo<T>
implements eqw<T> {
    private final bfa<T> a;
    private final int b;

    public eqo(int $$0, List<T> $$1) {
        this($$0);
        $$1.forEach(this.a::d);
    }

    public eqo(int $$0) {
        this($$0, bfa.c(1 << $$0));
    }

    private eqo(int $$0, bfa<T> $$1) {
        this.b = $$0;
        this.a = $$1;
    }

    public static <A> eqw<A> a(int $$0, List<A> $$1) {
        return new eqo<A>($$0, $$1);
    }

    @Override
    public int a(T $$0, eqx<T> $$1) {
        int $$2 = this.a.a($$0);
        if ($$2 == -1 && ($$2 = this.a.d($$0)) >= 1 << this.b) {
            $$2 = $$1.onResize(this.b + 1, $$0);
        }
        return $$2;
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        for (int $$1 = 0; $$1 < this.a(); ++$$1) {
            if (!$$0.test(this.a.a($$1))) continue;
            return true;
        }
        return false;
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
        this.a.a();
        int $$2 = $$0.l();
        for (int $$3 = 0; $$3 < $$2; ++$$3) {
            this.a.d($$1.b($$0.l()));
        }
    }

    @Override
    public void b(wx $$0, ji<T> $$1) {
        int $$2 = this.a();
        $$0.c($$2);
        for (int $$3 = 0; $$3 < $$2; ++$$3) {
            $$0.c($$1.a(this.a.a($$3)));
        }
    }

    @Override
    public int a(ji<T> $$0) {
        int $$1 = xy.a(this.a());
        for (int $$2 = 0; $$2 < this.a(); ++$$2) {
            $$1 += xy.a($$0.a(this.a.a($$2)));
        }
        return $$1;
    }

    public List<T> c() {
        ArrayList $$0 = new ArrayList();
        this.a.iterator().forEachRemaining($$0::add);
        return $$0;
    }

    @Override
    public int a() {
        return this.a.d();
    }

    @Override
    public eqw<T> b() {
        return new eqo<T>(this.b, this.a.b());
    }
}

