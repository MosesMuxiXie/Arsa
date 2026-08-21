/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public final class erm
extends Record {
    final erj a;
    private final erh b;
    final erh c;
    private final int d;
    private final erk e;

    public erm(erj $$0, erh $$1, erh $$2, int $$3, erk $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public int a(erj $$0) {
        if ($$0 == this.a) {
            return 0;
        }
        return this.c.a($$0);
    }

    public CompletableFuture<eqf> a(ero $$0, bhe<awv> $$12, eqf $$2) {
        if ($$2.n().d(this.a)) {
            bzx $$3 = bzu.f.a($$2.f(), $$0.a().aq(), this.a.f());
            return this.e.doWork($$0, this, $$12, $$2).thenApply($$1 -> this.a((eqf)$$1, $$3));
        }
        return this.e.doWork($$0, this, $$12, $$2);
    }

    private eqf a(eqf $$0, @Nullable bzx $$1) {
        erb $$2;
        if ($$0 instanceof erb && ($$2 = (erb)$$0).n().d(this.a)) {
            $$2.a(this.a);
        }
        if ($$1 != null) {
            $$1.finish(true);
        }
        return $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{erm.class, "targetStatus;directDependencies;accumulatedDependencies;blockStateWriteRadius;task", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{erm.class, "targetStatus;directDependencies;accumulatedDependencies;blockStateWriteRadius;task", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{erm.class, "targetStatus;directDependencies;accumulatedDependencies;blockStateWriteRadius;task", "a", "b", "c", "d", "e"}, this, $$0);
    }

    public erj a() {
        return this.a;
    }

    public erh b() {
        return this.b;
    }

    public erh c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public erk e() {
        return this.e;
    }

    public static class a {
        private final erj a;
        private final @Nullable erm b;
        private erj[] c;
        private int d = -1;
        private erk e = erl::a;

        protected a(erj $$0) {
            if ($$0.c() != $$0) {
                throw new IllegalArgumentException("Not starting with the first status: " + String.valueOf($$0));
            }
            this.a = $$0;
            this.b = null;
            this.c = new erj[0];
        }

        protected a(erj $$0, erm $$1) {
            if ($$1.a.b() != $$0.b() - 1) {
                throw new IllegalArgumentException("Out of order status: " + String.valueOf($$0));
            }
            this.a = $$0;
            this.b = $$1;
            this.c = new erj[]{$$1.a};
        }

        public a a(erj $$0, int $$1) {
            if ($$0.a(this.a)) {
                throw new IllegalArgumentException("Status " + String.valueOf($$0) + " can not be required by " + String.valueOf(this.a));
            }
            int $$3 = $$1 + 1;
            erj[] $$2 = this.c;
            if ($$3 > $$2.length) {
                this.c = new erj[$$3];
                Arrays.fill(this.c, $$0);
            }
            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); ++$$4) {
                this.c[$$4] = erj.a($$2[$$4], $$0);
            }
            return this;
        }

        public a a(int $$0) {
            this.d = $$0;
            return this;
        }

        public a a(erk $$0) {
            this.e = $$0;
            return this;
        }

        public erm a() {
            return new erm(this.a, new erh((ImmutableList<erj>)ImmutableList.copyOf((Object[])this.c)), new erh((ImmutableList<erj>)ImmutableList.copyOf((Object[])this.b())), this.d, this.e);
        }

        private erj[] b() {
            if (this.b == null) {
                return this.c;
            }
            int $$0 = this.a(this.b.a);
            erh $$1 = this.b.c;
            erj[] $$2 = new erj[Math.max($$0 + $$1.b(), this.c.length)];
            for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
                int $$4 = $$3 - $$0;
                $$2[$$3] = $$4 < 0 || $$4 >= $$1.b() ? this.c[$$3] : ($$3 >= this.c.length ? $$1.a($$4) : erj.a(this.c[$$3], $$1.a($$4)));
            }
            return $$2;
        }

        private int a(erj $$0) {
            for (int $$1 = this.c.length - 1; $$1 >= 0; --$$1) {
                if (!this.c[$$1].a($$0)) continue;
                return $$1;
            }
            return 0;
        }
    }
}

