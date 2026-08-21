/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class cay {
    public static final cay a = new cay();
    private final WeakHashMap<cba, Void> b = new WeakHashMap();

    private cay() {
    }

    public void a(cba $$0) {
        this.b.put($$0, null);
    }

    public List<cax> a() {
        Map<String, List<cax>> $$02 = this.b.keySet().stream().flatMap($$0 -> $$0.bJ().stream()).collect(Collectors.groupingBy(cax::d));
        return cay.a($$02);
    }

    private static List<cax> a(Map<String, List<cax>> $$02) {
        return $$02.entrySet().stream().map($$0 -> {
            String $$1 = (String)$$0.getKey();
            List $$2 = (List)$$0.getValue();
            return $$2.size() > 1 ? new a($$1, $$2) : (cax)$$2.get(0);
        }).collect(Collectors.toList());
    }

    static class a
    extends cax {
        private final List<cax> b;

        a(String $$0, List<cax> $$1) {
            super($$0, $$1.get(0).e(), () -> cay$a.c($$1), () -> cay$a.b($$1), cay$a.a($$1));
            this.b = $$1;
        }

        private static cax.c a(List<cax> $$0) {
            return $$12 -> $$0.stream().anyMatch($$1 -> {
                if ($$1.a != null) {
                    return $$1.a.test($$12);
                }
                return false;
            });
        }

        private static void b(List<cax> $$0) {
            for (cax $$1 : $$0) {
                $$1.a();
            }
        }

        private static double c(List<cax> $$0) {
            double $$1 = 0.0;
            for (cax $$2 : $$0) {
                $$1 += $$2.c().getAsDouble();
            }
            return $$1 / (double)$$0.size();
        }

        @Override
        public boolean equals(@Nullable Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            if (!super.equals($$0)) {
                return false;
            }
            a $$1 = (a)$$0;
            return this.b.equals($$1.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), this.b);
        }
    }
}

