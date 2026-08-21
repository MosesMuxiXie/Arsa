/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public final class bym {
    private static final int b = -1;
    private static final Object c = new Object(){

        public String toString() {
            return "frame";
        }
    };
    private static final int d = 2;
    private @Nullable Object[] e = new Object[128];
    private int f = 0;
    private int g = 0;

    public bym() {
        this.e[0] = c;
        this.e[1] = null;
    }

    private int c(byc<?> $$0) {
        for (int $$1 = this.f; $$1 > this.g; $$1 -= 2) {
            Object $$2 = this.e[$$1];
            assert ($$2 instanceof byc);
            if ($$2 != $$0) continue;
            return $$1 + 1;
        }
        return -1;
    }

    public int a(byc<?> ... $$0) {
        for (int $$1 = this.f; $$1 > this.g; $$1 -= 2) {
            Object $$2 = this.e[$$1];
            assert ($$2 instanceof byc);
            for (byc<?> $$3 : $$0) {
                if ($$3 != $$2) continue;
                return $$1 + 1;
            }
        }
        return -1;
    }

    private void a(int $$0) {
        int $$2 = this.f + 1;
        int $$3 = $$2 + $$0 * 2;
        int $$1 = this.e.length;
        if ($$3 >= $$1) {
            int $$4 = bhs.a($$1, $$3 + 1);
            Object[] $$5 = new Object[$$4];
            System.arraycopy(this.e, 0, $$5, 0, $$1);
            this.e = $$5;
        }
        assert (this.i());
    }

    private void h() {
        this.f += 2;
        this.e[this.f] = c;
        this.e[this.f + 1] = this.g;
        this.g = this.f;
    }

    public void a() {
        this.a(1);
        this.h();
        assert (this.i());
    }

    private int b(int $$0) {
        return (Integer)this.e[$$0 + 1];
    }

    public void b() {
        assert (this.g != 0);
        this.f = this.g - 2;
        this.g = this.b(this.g);
        assert (this.i());
    }

    public void c() {
        int $$0 = this.g;
        int $$1 = (this.f - this.g) / 2;
        this.a($$1 + 1);
        this.h();
        int $$2 = $$0 + 2;
        int $$3 = this.f;
        for (int $$4 = 0; $$4 < $$1; ++$$4) {
            $$3 += 2;
            Object $$5 = this.e[$$2];
            assert ($$5 != null);
            this.e[$$3] = $$5;
            this.e[$$3 + 1] = null;
            $$2 += 2;
        }
        this.f = $$3;
        assert (this.i());
    }

    public void d() {
        for (int $$0 = this.f; $$0 > this.g; $$0 -= 2) {
            assert (this.e[$$0] instanceof byc);
            this.e[$$0 + 1] = null;
        }
        assert (this.i());
    }

    public void e() {
        int $$0;
        int $$1 = $$0 = this.b(this.g);
        int $$2 = this.g;
        while ($$2 < this.f) {
            $$1 += 2;
            Object $$3 = this.e[$$2 += 2];
            assert ($$3 instanceof byc);
            Object $$4 = this.e[$$2 + 1];
            Object $$5 = this.e[$$1];
            if ($$5 != $$3) {
                this.e[$$1] = $$3;
                this.e[$$1 + 1] = $$4;
                continue;
            }
            if ($$4 == null) continue;
            this.e[$$1 + 1] = $$4;
        }
        this.f = $$1;
        this.g = $$0;
        assert (this.i());
    }

    public <T> void a(byc<T> $$0, @Nullable T $$1) {
        int $$2 = this.c($$0);
        if ($$2 != -1) {
            this.e[$$2] = $$1;
        } else {
            this.a(1);
            this.f += 2;
            this.e[this.f] = $$0;
            this.e[this.f + 1] = $$1;
        }
        assert (this.i());
    }

    public <T> @Nullable T a(byc<T> $$0) {
        int $$1 = this.c($$0);
        return (T)($$1 != -1 ? this.e[$$1] : null);
    }

    public <T> T b(byc<T> $$0) {
        int $$1 = this.c($$0);
        if ($$1 == -1) {
            throw new IllegalArgumentException("No value for atom " + String.valueOf($$0));
        }
        return (T)this.e[$$1];
    }

    public <T> T b(byc<T> $$0, T $$1) {
        int $$2 = this.c($$0);
        return (T)($$2 != -1 ? this.e[$$2] : $$1);
    }

    @SafeVarargs
    public final <T> @Nullable T b(byc<? extends T> ... $$0) {
        int $$1 = this.a($$0);
        return (T)($$1 != -1 ? this.e[$$1] : null);
    }

    @SafeVarargs
    public final <T> T c(byc<? extends T> ... $$0) {
        int $$1 = this.a($$0);
        if ($$1 == -1) {
            throw new IllegalArgumentException("No value for atoms " + Arrays.toString($$0));
        }
        return (T)this.e[$$1];
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        boolean $$1 = true;
        for (int $$2 = 0; $$2 <= this.f; $$2 += 2) {
            Object $$3 = this.e[$$2];
            Object $$4 = this.e[$$2 + 1];
            if ($$3 == c) {
                $$0.append('|');
                $$1 = true;
                continue;
            }
            if (!$$1) {
                $$0.append(',');
            }
            $$1 = false;
            $$0.append($$3).append(':').append($$4);
        }
        return $$0.toString();
    }

    @VisibleForTesting
    public Map<byc<?>, ?> f() {
        HashMap<byc, Object> $$0 = new HashMap<byc, Object>();
        for (int $$1 = this.f; $$1 > this.g; $$1 -= 2) {
            Object $$2 = this.e[$$1];
            Object $$3 = this.e[$$1 + 1];
            $$0.put((byc)$$2, $$3);
        }
        return $$0;
    }

    public boolean g() {
        for (int $$0 = this.f; $$0 > 0; --$$0) {
            if (this.e[$$0] != c) continue;
            return false;
        }
        if (this.e[0] != c) {
            throw new IllegalStateException("Corrupted stack");
        }
        return true;
    }

    private boolean i() {
        assert (this.g >= 0);
        assert (this.f >= this.g);
        for (int $$0 = 0; $$0 <= this.f; $$0 += 2) {
            Object $$1 = this.e[$$0];
            if ($$1 == c || $$1 instanceof byc) continue;
            return false;
        }
        int $$2 = this.g;
        while ($$2 != 0) {
            Object $$3 = this.e[$$2];
            if ($$3 != c) {
                return false;
            }
            $$2 = this.b($$2);
        }
        return true;
    }
}

