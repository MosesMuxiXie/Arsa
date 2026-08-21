/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import org.slf4j.Logger;

public class xl
implements AutoCloseable {
    static final Logger a = LogUtils.getLogger();
    private final Queue<a<?>> b = Queues.newConcurrentLinkedQueue();
    private final Thread c;
    private boolean d;

    public xl(Thread $$0) {
        this.c = $$0;
    }

    public boolean a() {
        return Thread.currentThread() == this.c;
    }

    public <T extends xk> void a(T $$0, aay<T> $$1) {
        if (this.d) {
            throw new RejectedExecutionException("Server already shutting down");
        }
        this.b.add(new a<T>($$0, $$1));
    }

    public void b() {
        if (!this.d) {
            while (!this.b.isEmpty()) {
                this.b.poll().a();
            }
        }
    }

    @Override
    public void close() {
        this.d = true;
    }

    record a<T extends xk>(T a, aay<T> b) {
        private final T a;
        private final aay<T> b;

        public void a() {
            if (this.a.a(this.b)) {
                try {
                    this.b.a(this.a);
                }
                catch (Exception $$0) {
                    v $$1;
                    if ($$0 instanceof v && ($$1 = (v)$$0).getCause() instanceof OutOfMemoryError) {
                        throw abb.a($$0, this.b, this.a);
                    }
                    this.a.a(this.b, $$0);
                }
            } else {
                a.debug("Ignoring packet due to disconnection: {}", this.b);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "listener;packet", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "listener;packet", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "listener;packet", "a", "b"}, this, $$0);
        }

        public T b() {
            return this.a;
        }

        public aay<T> c() {
            return this.b;
        }
    }
}

