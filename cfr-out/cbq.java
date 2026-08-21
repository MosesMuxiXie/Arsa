/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;

public abstract class cbq<T extends Runnable>
implements cba,
cbx<T>,
Runnable {
    private static final Logger a = LogUtils.getLogger();
    private final AtomicReference<a> b = new AtomicReference<a>(cbq$a.a);
    private final cbw<T> c;
    private final Executor d;
    private final String e;

    public cbq(cbw<T> $$0, Executor $$1, String $$2) {
        this.d = $$1;
        this.c = $$0;
        this.e = $$2;
        cay.a.a(this);
    }

    private boolean e() {
        return !this.k() && !this.c.b();
    }

    @Override
    public void close() {
        this.b.set(cbq$a.c);
    }

    private boolean f() {
        if (!this.j()) {
            return false;
        }
        Runnable $$0 = this.c.a();
        if ($$0 == null) {
            return false;
        }
        bhs.a($$0, this.e);
        return true;
    }

    @Override
    public void run() {
        try {
            this.f();
        }
        finally {
            this.i();
            this.g();
        }
    }

    public void a() {
        try {
            while (this.f()) {
            }
        }
        finally {
            this.i();
            this.g();
        }
    }

    @Override
    public void a_(T $$0) {
        this.c.a($$0);
        this.g();
    }

    private void g() {
        if (this.e() && this.h()) {
            try {
                this.d.execute(this);
            }
            catch (RejectedExecutionException $$0) {
                try {
                    this.d.execute(this);
                }
                catch (RejectedExecutionException $$1) {
                    a.error("Could not schedule ConsecutiveExecutor", (Throwable)$$1);
                }
            }
        }
    }

    public int b() {
        return this.c.c();
    }

    public boolean c() {
        return this.j() && !this.c.b();
    }

    public String toString() {
        return this.e + " " + String.valueOf((Object)this.b.get()) + " " + this.c.b();
    }

    @Override
    public String z_() {
        return this.e;
    }

    @Override
    public List<cax> bJ() {
        return ImmutableList.of((Object)cax.a(this.e + "-queue-size", caw.c, this::b));
    }

    private boolean h() {
        return this.b.compareAndSet(cbq$a.a, cbq$a.b);
    }

    private void i() {
        this.b.compareAndSet(cbq$a.b, cbq$a.a);
    }

    private boolean j() {
        return this.b.get() == cbq$a.b;
    }

    private boolean k() {
        return this.b.get() == cbq$a.c;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = cbq$a.a();
        }
    }
}

