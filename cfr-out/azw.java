/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.Map;

interface azw {
    public static final azw a = new azw(){

        public String toString() {
            return "empty";
        }
    };
    public static final azw b = new azw(){

        public String toString() {
            return "relative";
        }
    };

    public static final class a
    extends Record
    implements azw {
        private final Map<String, azt> c;

        public a(Map<String, azt> $$0) {
            this.c = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "children", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "children", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "children", "c"}, this, $$0);
        }

        public Map<String, azt> a() {
            return this.c;
        }
    }

    public static final class b
    extends Record
    implements azw {
        private final Path c;

        public b(Path $$0) {
            this.c = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "contents", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "contents", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "contents", "c"}, this, $$0);
        }

        public Path a() {
            return this.c;
        }
    }
}

