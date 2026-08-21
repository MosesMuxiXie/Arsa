/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Queues;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;

public interface cbw<T extends Runnable> {
    public @Nullable Runnable a();

    public boolean a(T var1);

    public boolean b();

    public int c();

    public static final class a
    implements cbw<c> {
        private final Queue<Runnable>[] a;
        private final AtomicInteger b = new AtomicInteger();

        public a(int $$0) {
            this.a = new Queue[$$0];
            for (int $$1 = 0; $$1 < $$0; ++$$1) {
                this.a[$$1] = Queues.newConcurrentLinkedQueue();
            }
        }

        @Override
        public @Nullable Runnable a() {
            for (Queue<Runnable> $$0 : this.a) {
                Runnable $$1 = $$0.poll();
                if ($$1 == null) continue;
                this.b.decrementAndGet();
                return $$1;
            }
            return null;
        }

        @Override
        public boolean a(c $$0) {
            int $$1 = $$0.a;
            if ($$1 >= this.a.length || $$1 < 0) {
                throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", $$1, this.a.length - 1));
            }
            this.a[$$1].add($$0);
            this.b.incrementAndGet();
            return true;
        }

        @Override
        public boolean b() {
            return this.b.get() == 0;
        }

        @Override
        public int c() {
            return this.b.get();
        }
    }

    public static final class c
    extends Record
    implements Runnable {
        final int a;
        private final Runnable b;

        public c(int $$0, Runnable $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void run() {
            this.b.run();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "priority;task", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "priority;task", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "priority;task", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public Runnable b() {
            return this.b;
        }
    }

    public static final class b
    implements cbw<Runnable> {
        private final Queue<Runnable> a;

        public b(Queue<Runnable> $$0) {
            this.a = $$0;
        }

        @Override
        public @Nullable Runnable a() {
            return this.a.poll();
        }

        @Override
        public boolean a(Runnable $$0) {
            return this.a.add($$0);
        }

        @Override
        public boolean b() {
            return this.a.isEmpty();
        }

        @Override
        public int c() {
            return this.a.size();
        }
    }
}

