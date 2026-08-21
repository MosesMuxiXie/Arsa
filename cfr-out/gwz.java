/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class gwz {
    public static final gwz a = new gwz(List.of());
    private final List<drz> b;
    private final Set<dsa> c = new HashSet<dsa>();
    private final Set<dsa> d = new HashSet<dsa>();

    public gwz(List<drz> $$0) {
        this.b = $$0;
    }

    public void a(ddu $$0, Predicate<dry> $$1) {
        for (drz $$2 : this.b) {
            boolean $$3 = $$1.test($$2.b());
            if ($$3) {
                this.d.add($$2.a());
            } else {
                this.d.remove($$2.a());
            }
            if ($$3 && $$2.a($$0)) {
                this.c.add($$2.a());
                continue;
            }
            this.c.remove($$2.a());
        }
    }

    public boolean a(dsa $$0) {
        return this.c.contains($$0);
    }

    public boolean a() {
        return !this.c.isEmpty();
    }

    public boolean b() {
        return !this.d.isEmpty();
    }

    public List<drz> c() {
        return this.b;
    }

    public List<drz> a(a $$02) {
        Predicate<dsa> $$1 = switch ($$02.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.d::contains;
            case 1 -> this.c::contains;
            case 2 -> $$0 -> this.d.contains($$0) && !this.c.contains($$0);
        };
        ArrayList<drz> $$2 = new ArrayList<drz>();
        for (drz $$3 : this.b) {
            if (!$$1.test($$3.a())) continue;
            $$2.add($$3);
        }
        return $$2;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = gwz$a.a();
        }
    }
}

