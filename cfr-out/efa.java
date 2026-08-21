/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class efa {
    public static final e[] a = new e[]{e.a, e.b, e.c};
    private final b b;

    public efa(eey $$0) {
        this(new a($$0));
    }

    public efa(b $$0) {
        this.b = $$0;
    }

    public boolean a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return iz.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, (iz)$$4, this.b::a).isPresent());
    }

    public Optional<c> a(eoh $$0, dwp $$12, is $$2, bgr $$3) {
        return iz.a($$3).stream().filter($$1 -> this.b.b($$0, (iz)$$1)).map($$4 -> this.a($$0, $$12, $$2, (iz)$$4, $$3, false)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    public long a(eoh $$0, dwp $$12, is $$2, boolean $$3) {
        return iz.a().filter($$1 -> this.b.b($$0, (iz)$$1)).map($$4 -> this.a($$0, $$12, $$2, (iz)$$4, $$3)).reduce(0L, Long::sum);
    }

    public Optional<c> a(eoh $$0, dwp $$1, is $$2, iz $$3, bgr $$4, boolean $$52) {
        return iz.a($$4).stream().map($$5 -> this.a($$0, $$1, $$2, $$3, (iz)$$5, $$52)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    private long a(eoh $$0, dwp $$1, is $$2, iz $$3, boolean $$4) {
        return iz.a().map($$5 -> this.a($$0, $$1, $$2, $$3, (iz)$$5, $$4)).filter(Optional::isPresent).count();
    }

    @VisibleForTesting
    public Optional<c> a(eoh $$0, dwp $$1, is $$22, iz $$3, iz $$4, boolean $$5) {
        return this.a($$0, (dvt)$$1, $$22, $$3, $$4, this.b::a).flatMap($$2 -> this.a($$1, (c)$$2, $$5));
    }

    public Optional<c> a(eoh $$0, dvt $$1, is $$2, iz $$3, iz $$4, d $$5) {
        if ($$4.o() == $$3.o()) {
            return Optional.empty();
        }
        if (!(this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4))) {
            return Optional.empty();
        }
        for (e $$6 : this.b.a()) {
            c $$7 = $$6.a($$2, $$4, $$3);
            if (!$$5.test($$1, $$2, $$7)) continue;
            return Optional.of($$7);
        }
        return Optional.empty();
    }

    public Optional<c> a(dwp $$0, c $$1, boolean $$2) {
        eoh $$3 = $$0.a_($$1.a());
        if (this.b.a($$0, $$1, $$3, $$2)) {
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public static class a
    implements b {
        protected eey a;

        public a(eey $$0) {
            this.a = $$0;
        }

        @Override
        public @Nullable eoh a(eoh $$0, dvt $$1, is $$2, iz $$3) {
            return this.a.c($$0, $$1, $$2, $$3);
        }

        protected boolean a(dvt $$0, is $$1, is $$2, iz $$3, eoh $$4) {
            return $$4.l() || $$4.a(this.a) || $$4.a(dzs.J) && $$4.y().b();
        }

        @Override
        public boolean a(dvt $$0, is $$1, c $$2) {
            eoh $$3 = $$0.a_($$2.a());
            return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
        }
    }

    public static interface b {
        public @Nullable eoh a(eoh var1, dvt var2, is var3, iz var4);

        public boolean a(dvt var1, is var2, c var3);

        default public e[] a() {
            return a;
        }

        default public boolean a(eoh $$0, iz $$1) {
            return eey.a($$0, $$1);
        }

        default public boolean a(eoh $$0) {
            return false;
        }

        default public boolean b(eoh $$0, iz $$1) {
            return this.a($$0) || this.a($$0, $$1);
        }

        default public boolean a(dwp $$0, c $$1, eoh $$2, boolean $$3) {
            eoh $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
            if ($$4 != null) {
                if ($$3) {
                    $$0.E($$1.a()).e($$1.a());
                }
                return $$0.a($$1.a(), $$4, 2);
            }
            return false;
        }
    }

    @FunctionalInterface
    public static interface d {
        public boolean test(dvt var1, is var2, c var3);
    }

    public static abstract sealed class e
    extends Enum<e> {
        public static final /* enum */ e a = new e(){

            @Override
            public c a(is $$0, iz $$1, iz $$2) {
                return new c($$0, $$1);
            }
        };
        public static final /* enum */ e b = new e(){

            @Override
            public c a(is $$0, iz $$1, iz $$2) {
                return new c($$0.a($$1), $$2);
            }
        };
        public static final /* enum */ e c = new e(){

            @Override
            public c a(is $$0, iz $$1, iz $$2) {
                return new c($$0.a($$1).a($$2), $$1.g());
            }
        };
        private static final /* synthetic */ e[] d;

        public static e[] values() {
            return (e[])d.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        public abstract c a(is var1, iz var2, iz var3);

        private static /* synthetic */ e[] a() {
            return new e[]{a, b, c};
        }

        static {
            d = e.a();
        }
    }

    public record c(is a, iz b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "pos;face", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "pos;face", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "pos;face", "a", "b"}, this, $$0);
        }
    }
}

