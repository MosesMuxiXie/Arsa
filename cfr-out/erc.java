/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;

public class erc<T>
implements eqw<T> {
    private @Nullable T a;

    public erc(List<T> $$0) {
        if (!$$0.isEmpty()) {
            Validate.isTrue(($$0.size() <= 1 ? 1 : 0) != 0, (String)"Can't initialize SingleValuePalette with %d values.", (long)$$0.size());
            this.a = $$0.getFirst();
        }
    }

    public static <A> eqw<A> a(int $$0, List<A> $$1) {
        return new erc<A>($$1);
    }

    @Override
    public int a(T $$0, eqx<T> $$1) {
        if (this.a == null || this.a == $$0) {
            this.a = $$0;
            return 0;
        }
        return $$1.onResize(1, $$0);
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        if (this.a == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return $$0.test(this.a);
    }

    @Override
    public T a(int $$0) {
        if (this.a == null || $$0 != 0) {
            throw new IllegalStateException("Missing Palette entry for id " + $$0 + ".");
        }
        return this.a;
    }

    @Override
    public void a(wx $$0, ji<T> $$1) {
        this.a = $$1.b($$0.l());
    }

    @Override
    public void b(wx $$0, ji<T> $$1) {
        if (this.a == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        $$0.c($$1.a(this.a));
    }

    @Override
    public int a(ji<T> $$0) {
        if (this.a == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return xy.a($$0.a(this.a));
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public eqw<T> b() {
        if (this.a == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return this;
    }
}

