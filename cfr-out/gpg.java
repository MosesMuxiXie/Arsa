/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class gpg {
    int a;
    final Map<a, b> b = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

    public void a(Consumer<gpd> $$0) {
        ++this.a;
        $$0.accept(new c(0));
    }

    public String a(boolean $$0) {
        final StringBuilder $$1 = new StringBuilder();
        Consumer<String> $$22 = new Consumer<String>(this){
            private boolean b = true;

            public void a(String $$0) {
                if (!this.b) {
                    $$1.append(". ");
                }
                this.b = false;
                $$1.append($$0);
            }

            @Override
            public /* synthetic */ void accept(Object object) {
                this.a((String)object);
            }
        };
        this.b.forEach(($$2, $$3) -> {
            if ($$3.b == this.a && ($$0 || !$$3.c)) {
                $$3.a.a($$22);
                $$3.c = true;
            }
        });
        return $$1.toString();
    }

    class c
    implements gpd {
        private final int b;

        c(int $$0) {
            this.b = $$0;
        }

        @Override
        public void a(gpc $$02, gpf<?> $$1) {
            gpg.this.b.computeIfAbsent(new a($$02, this.b), $$0 -> new b()).a(gpg.this.a, $$1);
        }

        @Override
        public gpd a() {
            return new c(this.b + 1);
        }
    }

    static class b {
        gpf<?> a = gpf.a;
        int b = -1;
        boolean c;

        b() {
        }

        public b a(int $$0, gpf<?> $$1) {
            if (!this.a.equals($$1)) {
                this.a = $$1;
                this.c = false;
            } else if (this.b + 1 != $$0) {
                this.c = false;
            }
            this.b = $$0;
            return this;
        }
    }

    static final class a
    extends Record {
        final gpc a;
        final int b;

        a(gpc $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;depth", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;depth", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;depth", "a", "b"}, this, $$0);
        }

        public gpc a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }
}

