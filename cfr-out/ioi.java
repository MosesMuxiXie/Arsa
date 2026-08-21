/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface ioi {
    public static final String c = "particle";

    default public @Nullable Boolean c() {
        return null;
    }

    default public @Nullable a b() {
        return null;
    }

    default public @Nullable hql d() {
        return null;
    }

    default public hqp.a e() {
        return hqp.a.a;
    }

    default public @Nullable ioh a() {
        return null;
    }

    default public @Nullable amo f() {
        return null;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("front");
        public static final /* enum */ a b = new a("side");
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.c = $$0;
        }

        public static a a(String $$0) {
            for (a $$1 : ioi$a.values()) {
                if (!$$1.c.equals($$0)) continue;
                return $$1;
            }
            throw new IllegalArgumentException("Invalid gui light: " + $$0);
        }

        public boolean a() {
            return this == b;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = ioi$a.b();
        }
    }
}

