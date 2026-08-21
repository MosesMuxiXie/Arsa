/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jspecify.annotations.Nullable;

public class bfd {
    private static final String a = "\r\n";
    private static final String b = ",";
    private final Writer c;
    private final int d;

    bfd(Writer $$0, List<String> $$1) throws IOException {
        this.c = $$0;
        this.d = $$1.size();
        this.a($$1.stream());
    }

    public static a a() {
        return new a();
    }

    public void a(Object ... $$0) throws IOException {
        if ($$0.length != this.d) {
            throw new IllegalArgumentException("Invalid number of columns, expected " + this.d + ", but got " + $$0.length);
        }
        this.a(Stream.of($$0));
    }

    private void a(Stream<? extends @Nullable Object> $$0) throws IOException {
        this.c.write($$0.map(bfd::a).collect(Collectors.joining(b)) + a);
    }

    private static String a(@Nullable Object $$0) {
        return StringEscapeUtils.escapeCsv((String)($$0 != null ? $$0.toString() : "[null]"));
    }

    public static class a {
        private final List<String> a = Lists.newArrayList();

        public a a(String $$0) {
            this.a.add($$0);
            return this;
        }

        public bfd a(Writer $$0) throws IOException {
            return new bfd($$0, this.a);
        }
    }
}

