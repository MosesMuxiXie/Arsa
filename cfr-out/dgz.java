/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public final class dgz {
    private static final dgz b = new dgz(null, 0L);
    public static final int a = 64;
    private final @Nullable dha c;
    private final long d;

    private dgz(@Nullable dha $$0, long $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    static dgz a(dha $$0, Collection<dgx> $$1) {
        if ($$1.isEmpty()) {
            return b;
        }
        long $$2 = dgz.a($$0, 0L, $$1);
        return new dgz($$0, $$2);
    }

    public static dgz a() {
        return b;
    }

    public static dgz a(dgx $$0) {
        return new dgz($$0.a, $$0.b);
    }

    public static dgz a(dgx $$0, dgx ... $$1) {
        long $$2 = $$1.length == 0 ? $$0.b : dgz.a($$0.a, $$0.b, Arrays.asList($$1));
        return new dgz($$0.a, $$2);
    }

    private static long a(dha $$0, long $$1, Iterable<dgx> $$2) {
        for (dgx $$3 : $$2) {
            if ($$0 != $$3.a) {
                throw new IllegalStateException("Mismatched feature universe, expected '" + String.valueOf($$0) + "', but got '" + String.valueOf($$3.a) + "'");
            }
            $$1 |= $$3.b;
        }
        return $$1;
    }

    public boolean b(dgx $$0) {
        if (this.c != $$0.a) {
            return false;
        }
        return (this.d & $$0.b) != 0L;
    }

    public boolean b() {
        return this.equals(b);
    }

    public boolean a(dgz $$0) {
        if (this.c == null) {
            return true;
        }
        if (this.c != $$0.c) {
            return false;
        }
        return (this.d & ($$0.d ^ 0xFFFFFFFFFFFFFFFFL)) == 0L;
    }

    public boolean b(dgz $$0) {
        if (this.c == null || $$0.c == null || this.c != $$0.c) {
            return false;
        }
        return (this.d & $$0.d) != 0L;
    }

    public dgz c(dgz $$0) {
        if (this.c == null) {
            return $$0;
        }
        if ($$0.c == null) {
            return this;
        }
        if (this.c != $$0.c) {
            throw new IllegalArgumentException("Mismatched set elements: '" + String.valueOf(this.c) + "' != '" + String.valueOf($$0.c) + "'");
        }
        return new dgz(this.c, this.d | $$0.d);
    }

    public dgz d(dgz $$0) {
        if (this.c == null || $$0.c == null) {
            return this;
        }
        if (this.c != $$0.c) {
            throw new IllegalArgumentException("Mismatched set elements: '" + String.valueOf(this.c) + "' != '" + String.valueOf($$0.c) + "'");
        }
        long $$1 = this.d & ($$0.d ^ 0xFFFFFFFFFFFFFFFFL);
        if ($$1 == 0L) {
            return b;
        }
        return new dgz(this.c, $$1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof dgz)) return false;
        dgz $$1 = (dgz)$$0;
        if (this.c != $$1.c) return false;
        if (this.d != $$1.d) return false;
        return true;
    }

    public int hashCode() {
        return (int)HashCommon.mix((long)this.d);
    }
}

