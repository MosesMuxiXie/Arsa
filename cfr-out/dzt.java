/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public interface dzt {
    public boolean a(dwr var1, is var2, eoh var3);

    public boolean a(dwo var1, bgr var2, is var3, eoh var4);

    public void a(axf var1, bgr var2, is var3, eoh var4);

    public static boolean a_(dwr $$0, is $$1, eoh $$2) {
        return dzt.a(iz.c.a.a().toList(), $$0, $$1, $$2).isPresent();
    }

    public static Optional<is> a(dwo $$0, is $$1, eoh $$2) {
        return dzt.a(iz.c.a.c($$0.y), $$0, $$1, $$2);
    }

    private static Optional<is> a(List<iz> $$0, dwr $$1, is $$2, eoh $$3) {
        for (iz $$4 : $$0) {
            is $$5 = $$2.a($$4);
            if (!$$1.A($$5) || !$$3.a($$1, $$5)) continue;
            return Optional.of($$5);
        }
        return Optional.empty();
    }

    default public is a(is $$0) {
        return switch (this.as_().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> $$0.d();
            case 1 -> $$0;
        };
    }

    default public a as_() {
        return a.b;
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

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = dzt$a.a();
        }
    }
}

