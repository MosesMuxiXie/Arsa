/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.TimeUnit;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hin
implements axq {
    static final Logger b = LogUtils.getLogger();
    private static final long c = TimeUnit.SECONDS.toMillis(30L);
    public static final long a = 500L;
    private final axr d = new axr(true);
    private @Nullable axp e;
    private volatile @Nullable axq.a f;
    private @Nullable b g;
    private final long h;

    public hin() {
        this(0L);
    }

    public hin(long $$0) {
        this.h = $$0;
    }

    public void a(axp $$0) {
        this.e = $$0;
    }

    public void a(hnh $$0, hif $$1, hoh $$2) {
        this.g = new d($$0, $$1, $$2, bhs.c() + c);
    }

    public void a() {
        if (this.g != null) {
            this.g = this.g.b();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        long $$0;
        b b2 = this.g;
        if (!(b2 instanceof a)) return false;
        a a2 = (a)b2;
        try {
            long l2;
            $$0 = l2 = a2.a();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        if (bhs.c() < $$0 + this.h) return false;
        return true;
    }

    public void c() {
        if (this.g != null) {
            this.g = this.g.c();
        }
    }

    @Override
    public void a(axq.a $$0, int $$1) {
        this.d.a($$0, $$1);
        this.f = $$0;
    }

    @Override
    public void a(axq.a $$0, int $$1, int $$2) {
        this.d.a($$0, $$1, $$2);
    }

    @Override
    public void a(axq.a $$0) {
        this.d.a($$0);
    }

    @Override
    public void a(amt<dwo> $$0, dvu $$1) {
        if (this.e != null) {
            this.e.a($$0, $$1);
        }
    }

    public @Nullable axp d() {
        return this.e;
    }

    public float e() {
        return this.d.a();
    }

    public boolean f() {
        return this.f != null;
    }

    static final class d
    extends Record
    implements b {
        private final hnh a;
        private final hif b;
        private final hoh c;
        private final long d;

        d(hnh $$0, hif $$1, hoh $$2, long $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public b c() {
            return new c(this.a, this.b, this.c, this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "player;level;levelRenderer;timeoutAfter", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "player;level;levelRenderer;timeoutAfter", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "player;level;levelRenderer;timeoutAfter", "a", "b", "c", "d"}, this, $$0);
        }

        public hnh a() {
            return this.a;
        }

        public hif d() {
            return this.b;
        }

        public hoh e() {
            return this.c;
        }

        public long f() {
            return this.d;
        }
    }

    static sealed interface b
    permits d, c, a {
        default public b b() {
            return this;
        }

        default public b c() {
            return this;
        }
    }

    record a(long a) implements b
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "readyAt", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "readyAt", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "readyAt", "a"}, this, $$0);
        }
    }

    static final class c
    extends Record
    implements b {
        private final hnh a;
        private final hif b;
        private final hoh c;
        private final long d;

        c(hnh $$0, hif $$1, hoh $$2, long $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public b b() {
            return this.g() ? new a(bhs.c()) : this;
        }

        private boolean g() {
            if (bhs.c() > this.d) {
                b.warn("Timed out while waiting for the client to load chunks, letting the player into the world anyway");
                return true;
            }
            is $$0 = this.a.dK();
            if (this.b.e($$0.v()) || this.a.au() || !this.a.cb()) {
                return true;
            }
            return this.c.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "player;level;levelRenderer;timeoutAfter", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "player;level;levelRenderer;timeoutAfter", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "player;level;levelRenderer;timeoutAfter", "a", "b", "c", "d"}, this, $$0);
        }

        public hnh a() {
            return this.a;
        }

        public hif d() {
            return this.b;
        }

        public hoh e() {
            return this.c;
        }

        public long f() {
            return this.d;
        }
    }
}

