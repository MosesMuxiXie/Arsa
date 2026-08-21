/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.Hash;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import org.jspecify.annotations.Nullable;

public final class fve<T>
extends Record {
    private final T d;
    private final is e;
    private final long f;
    private final fvi g;
    private final long h;
    public static final Comparator<fve<?>> a = ($$0, $$1) -> {
        int $$2 = Long.compare($$0.f, $$1.f);
        if ($$2 != 0) {
            return $$2;
        }
        $$2 = $$0.g.compareTo($$1.g);
        if ($$2 != 0) {
            return $$2;
        }
        return Long.compare($$0.h, $$1.h);
    };
    public static final Comparator<fve<?>> b = ($$0, $$1) -> {
        int $$2 = $$0.g.compareTo($$1.g);
        if ($$2 != 0) {
            return $$2;
        }
        return Long.compare($$0.h, $$1.h);
    };
    public static final Hash.Strategy<fve<?>> c = new Hash.Strategy<fve<?>>(){

        public int a(fve<?> $$0) {
            return 31 * $$0.b().hashCode() + $$0.a().hashCode();
        }

        public boolean a(@Nullable fve<?> $$0, @Nullable fve<?> $$1) {
            if ($$0 == $$1) {
                return true;
            }
            if ($$0 == null || $$1 == null) {
                return false;
            }
            return $$0.a() == $$1.a() && $$0.b().equals($$1.b());
        }

        public /* synthetic */ boolean equals(@Nullable Object object, @Nullable Object object2) {
            return this.a((fve)object, (fve)object2);
        }

        public /* synthetic */ int hashCode(Object object) {
            return this.a((fve)object);
        }
    };

    public fve(T $$0, is $$1, long $$2, long $$3) {
        this($$0, $$1, $$2, fvi.d, $$3);
    }

    public fve(T $$0, is $$1, long $$2, fvi $$3, long $$4) {
        $$1 = $$1.j();
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    public static <T> fve<T> a(T $$0, is $$1) {
        return new fve<T>($$0, $$1, 0L, fvi.d, 0L);
    }

    public fvd<T> a(long $$0) {
        return new fvd<T>(this.d, this.e, (int)(this.f - $$0), this.g);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fve.class, "type;pos;triggerTick;priority;subTickOrder", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fve.class, "type;pos;triggerTick;priority;subTickOrder", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fve.class, "type;pos;triggerTick;priority;subTickOrder", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public T a() {
        return this.d;
    }

    public is b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public fvi d() {
        return this.g;
    }

    public long e() {
        return this.h;
    }
}

