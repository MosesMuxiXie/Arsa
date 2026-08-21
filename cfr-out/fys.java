/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fys
implements fyt,
AutoCloseable {
    private final int b;
    private final Deque<a<?>> c = new ArrayDeque();

    public fys(int $$0) {
        this.b = $$0;
    }

    public void a() {
        Iterator<a<?>> $$0 = this.c.iterator();
        while ($$0.hasNext()) {
            a<?> $$1 = $$0.next();
            if ($$1.c-- != 0) continue;
            $$1.close();
            $$0.remove();
        }
    }

    @Override
    public <T> T a(fyv<T> $$0) {
        T $$1 = this.b($$0);
        $$0.b($$1);
        return $$1;
    }

    private <T> T b(fyv<T> $$0) {
        Iterator<a<?>> $$1 = this.c.iterator();
        while ($$1.hasNext()) {
            a<?> $$2 = $$1.next();
            if (!$$0.a($$2.a)) continue;
            $$1.remove();
            return $$2.b;
        }
        return $$0.f();
    }

    @Override
    public <T> void a(fyv<T> $$0, T $$1) {
        this.c.addFirst(new a<T>($$0, $$1, this.b));
    }

    public void b() {
        this.c.forEach(a::close);
        this.c.clear();
    }

    @Override
    public void close() {
        this.b();
    }

    @VisibleForTesting
    protected Collection<a<?>> c() {
        return this.c;
    }

    @VisibleForTesting
    protected static final class a<T>
    implements AutoCloseable {
        final fyv<T> a;
        final T b;
        int c;

        a(fyv<T> $$0, T $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public void close() {
            this.a.a(this.b);
        }
    }
}

