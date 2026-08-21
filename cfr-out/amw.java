/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class amw
extends IOException {
    private final List<a> a = Lists.newArrayList();
    private final String b;

    public amw(String $$0) {
        this.a.add(new a());
        this.b = $$0;
    }

    public amw(String $$0, Throwable $$1) {
        super($$1);
        this.a.add(new a());
        this.b = $$0;
    }

    public void a(String $$0) {
        this.a.get(0).a($$0);
    }

    public void b(String $$0) {
        this.a.get((int)0).a = $$0;
        this.a.add(0, new a());
    }

    @Override
    public String getMessage() {
        return "Invalid " + String.valueOf(this.a.get(this.a.size() - 1)) + ": " + this.b;
    }

    public static amw a(Exception $$0) {
        if ($$0 instanceof amw) {
            return (amw)$$0;
        }
        String $$1 = $$0.getMessage();
        if ($$0 instanceof FileNotFoundException) {
            $$1 = "File not found";
        }
        return new amw($$1, $$0);
    }

    public static class a {
        @Nullable String a;
        private final List<String> b = Lists.newArrayList();

        a() {
        }

        void a(String $$0) {
            this.b.add(0, $$0);
        }

        public @Nullable String a() {
            return this.a;
        }

        public String b() {
            return StringUtils.join(this.b, (String)"->");
        }

        public String toString() {
            if (this.a != null) {
                if (this.b.isEmpty()) {
                    return this.a;
                }
                return this.a + " " + this.b();
            }
            if (this.b.isEmpty()) {
                return "(Unknown file)";
            }
            return "(Unknown file) " + this.b();
        }
    }
}

