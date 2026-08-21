/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gfr {
    private static final Logger a = LogUtils.getLogger();
    private @Nullable c b;
    private int c;

    public void a(b $$0, List<azl> $$1) {
        ++this.c;
        if (this.b != null && !this.b.d) {
            a.warn("Reload already ongoing, replacing");
        }
        this.b = new c($$0, (List)$$1.stream().map(azl::b).collect(ImmutableList.toImmutableList()));
    }

    public void a(Throwable $$0) {
        if (this.b == null) {
            a.warn("Trying to signal reload recovery, but nothing was started");
            this.b = new c(gfr$b.c, (List<String>)ImmutableList.of());
        }
        this.b.c = new a($$0);
    }

    public void a() {
        if (this.b == null) {
            a.warn("Trying to finish reload, but nothing was started");
        } else {
            this.b.d = true;
        }
    }

    public void a(m $$0) {
        n $$1 = $$0.a("Last reload");
        $$1.a("Reload number", this.c);
        if (this.b != null) {
            this.b.a($$1);
        }
    }

    static class c {
        private final b a;
        private final List<String> b;
        @Nullable a c;
        boolean d;

        c(b $$0, List<String> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public void a(n $$0) {
            $$0.a("Reload reason", this.a.d);
            $$0.a("Finished", this.d ? "Yes" : "No");
            $$0.a("Packs", () -> String.join((CharSequence)", ", this.b));
            if (this.c != null) {
                this.c.a($$0);
            }
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("initial");
        public static final /* enum */ b b = new b("manual");
        public static final /* enum */ b c = new b("unknown");
        final String d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.d = $$0;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            e = gfr$b.a();
        }
    }

    static class a {
        private final Throwable a;

        a(Throwable $$0) {
            this.a = $$0;
        }

        public void a(n $$0) {
            $$0.a("Recovery", "Yes");
            $$0.a("Recovery reason", () -> {
                StringWriter $$0 = new StringWriter();
                this.a.printStackTrace(new PrintWriter($$0));
                return $$0.toString();
            });
        }
    }
}

