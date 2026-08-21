/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

@FunctionalInterface
public interface bem<T> {
    public a accept(T var1);

    public static <T> bem<T> forConsumer(Consumer<T> $$0) {
        return $$1 -> {
            $$0.accept($$1);
            return a.a;
        };
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public boolean a() {
            return this == b;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            c = bem$a.b();
        }
    }
}

