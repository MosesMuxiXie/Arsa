/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public class equ<T>
implements eqw<T> {
    private final T[] a;
    private final int b;
    private int c;

    private equ(int $$0, List<T> $$1) {
        this.a = new Object[1 << $$0];
        this.b = $$0;
        Validate.isTrue(($$1.size() <= this.a.length ? 1 : 0) != 0, (String)"Can't initialize LinearPalette of size %d with %d entries", (Object[])new Object[]{this.a.length, $$1.size()});
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            this.a[$$2] = $$1.get($$2);
        }
        this.c = $$1.size();
    }

    private equ(T[] $$0, int $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static <A> eqw<A> a(int $$0, List<A> $$1) {
        return new equ<A>($$0, $$1);
    }

    @Override
    public int a(T $$0, eqx<T> $$1) {
        int $$3;
        for (int $$2 = 0; $$2 < this.c; ++$$2) {
            if (this.a[$$2] != $$0) continue;
            return $$2;
        }
        if (($$3 = this.c++) < this.a.length) {
            this.a[$$3] = $$0;
            return $$3;
        }
        return $$1.onResize(this.b + 1, $$0);
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        for (int $$1 = 0; $$1 < this.c; ++$$1) {
            if (!$$0.test(this.a[$$1])) continue;
            return true;
        }
        return false;
    }

    @Override
    public T a(int $$0) {
        if ($$0 >= 0 && $$0 < this.c) {
            return this.a[$$0];
        }
        throw new eqv($$0);
    }

    @Override
    public void a(wx $$0, ji<T> $$1) {
        this.c = $$0.l();
        for (int $$2 = 0; $$2 < this.c; ++$$2) {
            this.a[$$2] = $$1.b($$0.l());
        }
    }

    @Override
    public void b(wx $$0, ji<T> $$1) {
        $$0.c(this.c);
        for (int $$2 = 0; $$2 < this.c; ++$$2) {
            $$0.c($$1.a(this.a[$$2]));
        }
    }

    @Override
    public int a(ji<T> $$0) {
        int $$1 = xy.a(this.a());
        for (int $$2 = 0; $$2 < this.a(); ++$$2) {
            $$1 += xy.a($$0.a(this.a[$$2]));
        }
        return $$1;
    }

    @Override
    public int a() {
        return this.c;
    }

    @Override
    public eqw<T> b() {
        return new equ<Object>((Object[])this.a.clone(), this.b, this.c);
    }
}

