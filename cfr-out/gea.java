/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class gea {
    private gea() {
    }

    @VisibleForTesting
    protected static List<String> a(String $$0) {
        return Arrays.asList($$0.split("\\n"));
    }

    public static List<a> a(String $$0, b ... $$1) {
        return gea.a($$0, Arrays.asList($$1));
    }

    private static List<a> a(String $$0, List<b> $$1) {
        List<String> $$2 = gea.a($$0);
        return gea.a($$2, $$1);
    }

    private static List<a> a(List<String> $$0, List<b> $$1) {
        int $$2 = 0;
        ArrayList $$3 = Lists.newArrayList();
        for (String $$4 : $$0) {
            ArrayList $$5 = Lists.newArrayList();
            List<String> $$6 = gea.a($$4, "%link");
            for (String $$7 : $$6) {
                if ("%link".equals($$7)) {
                    $$5.add($$1.get($$2++));
                    continue;
                }
                $$5.add(b.a($$7));
            }
            $$3.add(new a($$5));
        }
        return $$3;
    }

    public static List<String> a(String $$0, String $$1) {
        int $$4;
        if ($$1.isEmpty()) {
            throw new IllegalArgumentException("Delimiter cannot be the empty string");
        }
        ArrayList $$2 = Lists.newArrayList();
        int $$3 = 0;
        while (($$4 = $$0.indexOf($$1, $$3)) != -1) {
            if ($$4 > $$3) {
                $$2.add($$0.substring($$3, $$4));
            }
            $$2.add($$1);
            $$3 = $$4 + $$1.length();
        }
        if ($$3 < $$0.length()) {
            $$2.add($$0.substring($$3));
        }
        return $$2;
    }

    public static class b {
        private final String a;
        private final @Nullable String b;
        private final @Nullable String c;

        private b(String $$0) {
            this.a = $$0;
            this.b = null;
            this.c = null;
        }

        private b(String $$0, @Nullable String $$1, @Nullable String $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            b $$1 = (b)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b) && Objects.equals(this.c, $$1.c);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }

        public String toString() {
            return "Segment{fullText='" + this.a + "', linkTitle='" + this.b + "', linkUrl='" + this.c + "'}";
        }

        public String a() {
            return this.b() ? this.b : this.a;
        }

        public boolean b() {
            return this.b != null;
        }

        public String c() {
            if (!this.b()) {
                throw new IllegalStateException("Not a link: " + String.valueOf(this));
            }
            return this.c;
        }

        public static b a(String $$0, String $$1) {
            return new b(null, $$0, $$1);
        }

        @VisibleForTesting
        protected static b a(String $$0) {
            return new b($$0);
        }
    }

    public static class a {
        public final List<b> a;

        a(b ... $$0) {
            this(Arrays.asList($$0));
        }

        a(List<b> $$0) {
            this.a = $$0;
        }

        public String toString() {
            return "Line{segments=" + String.valueOf(this.a) + "}";
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            a $$1 = (a)$$0;
            return Objects.equals(this.a, $$1.a);
        }

        public int hashCode() {
            return Objects.hash(this.a);
        }
    }
}

