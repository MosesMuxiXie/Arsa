/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.MoreObjects
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eom {
    private final Predicate<eol>[][][] a;
    private final int b;
    private final int c;
    private final int d;

    public eom(Predicate<eol>[][][] $$0) {
        this.a = $$0;
        this.b = $$0.length;
        if (this.b > 0) {
            this.c = $$0[0].length;
            this.d = this.c > 0 ? $$0[0][0].length : 0;
        } else {
            this.c = 0;
            this.d = 0;
        }
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    @VisibleForTesting
    public Predicate<eol>[][][] d() {
        return this.a;
    }

    @VisibleForTesting
    public @Nullable b a(dwr $$0, is $$1, iz $$2, iz $$3) {
        LoadingCache<is, eol> $$4 = eom.a($$0, false);
        return this.a($$1, $$2, $$3, $$4);
    }

    private @Nullable b a(is $$0, iz $$1, iz $$2, LoadingCache<is, eol> $$3) {
        for (int $$4 = 0; $$4 < this.d; ++$$4) {
            for (int $$5 = 0; $$5 < this.c; ++$$5) {
                for (int $$6 = 0; $$6 < this.b; ++$$6) {
                    if (this.a[$$6][$$5][$$4].test((eol)$$3.getUnchecked((Object)eom.a($$0, $$1, $$2, $$4, $$5, $$6)))) continue;
                    return null;
                }
            }
        }
        return new b($$0, $$1, $$2, $$3, this.d, this.c, this.b);
    }

    public @Nullable b a(dwr $$0, is $$1) {
        LoadingCache<is, eol> $$2 = eom.a($$0, false);
        int $$3 = Math.max(Math.max(this.d, this.c), this.b);
        for (is $$4 : is.c($$1, $$1.b($$3 - 1, $$3 - 1, $$3 - 1))) {
            for (iz $$5 : iz.values()) {
                for (iz $$6 : iz.values()) {
                    b $$7;
                    if ($$6 == $$5 || $$6 == $$5.g() || ($$7 = this.a($$4, $$5, $$6, $$2)) == null) continue;
                    return $$7;
                }
            }
        }
        return null;
    }

    public static LoadingCache<is, eol> a(dwr $$0, boolean $$1) {
        return CacheBuilder.newBuilder().build((CacheLoader)new a($$0, $$1));
    }

    protected static is a(is $$0, iz $$1, iz $$2, int $$3, int $$4, int $$5) {
        if ($$1 == $$2 || $$1 == $$2.g()) {
            throw new IllegalArgumentException("Invalid forwards & up combination");
        }
        jy $$6 = new jy($$1.j(), $$1.k(), $$1.l());
        jy $$7 = new jy($$2.j(), $$2.k(), $$2.l());
        jy $$8 = $$6.d($$7);
        return $$0.b($$7.u() * -$$4 + $$8.u() * $$3 + $$6.u() * $$5, $$7.v() * -$$4 + $$8.v() * $$3 + $$6.v() * $$5, $$7.w() * -$$4 + $$8.w() * $$3 + $$6.w() * $$5);
    }

    public static class b {
        private final is a;
        private final iz b;
        private final iz c;
        private final LoadingCache<is, eol> d;
        private final int e;
        private final int f;
        private final int g;

        public b(is $$0, iz $$1, iz $$2, LoadingCache<is, eol> $$3, int $$4, int $$5, int $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        public is a() {
            return this.a;
        }

        public iz b() {
            return this.b;
        }

        public iz c() {
            return this.c;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.f;
        }

        public int f() {
            return this.g;
        }

        public eol a(int $$0, int $$1, int $$2) {
            return (eol)this.d.getUnchecked((Object)eom.a(this.a, this.b(), this.c(), $$0, $$1, $$2));
        }

        public String toString() {
            return MoreObjects.toStringHelper((Object)this).add("up", (Object)this.c).add("forwards", (Object)this.b).add("frontTopLeft", (Object)this.a).toString();
        }
    }

    static class a
    extends CacheLoader<is, eol> {
        private final dwr a;
        private final boolean b;

        public a(dwr $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public eol a(is $$0) {
            return new eol(this.a, $$0, this.b);
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((is)object);
        }
    }
}

