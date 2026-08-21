/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class m {
    private static final Logger a = LogUtils.getLogger();
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
    private final String c;
    private final Throwable d;
    private final List<n> e = Lists.newArrayList();
    private @Nullable Path f;
    private boolean g = true;
    private StackTraceElement[] h = new StackTraceElement[0];
    private final y i = new y();

    public m(String $$0, Throwable $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public String a() {
        return this.c;
    }

    public Throwable b() {
        return this.d;
    }

    public String c() {
        StringBuilder $$0 = new StringBuilder();
        this.a($$0);
        return $$0.toString();
    }

    public void a(StringBuilder $$0) {
        if (!(this.h != null && this.h.length > 0 || this.e.isEmpty())) {
            this.h = (StackTraceElement[])ArrayUtils.subarray((Object[])this.e.get(0).a(), (int)0, (int)1);
        }
        if (this.h != null && this.h.length > 0) {
            $$0.append("-- Head --\n");
            $$0.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
            $$0.append("Stacktrace:\n");
            for (StackTraceElement $$1 : this.h) {
                $$0.append("\t").append("at ").append($$1);
                $$0.append("\n");
            }
            $$0.append("\n");
        }
        for (n $$2 : this.e) {
            $$2.a($$0);
            $$0.append("\n\n");
        }
        this.i.a($$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String d() {
        String string;
        StringWriter $$0 = null;
        PrintWriter $$1 = null;
        Throwable $$2 = this.d;
        if ($$2.getMessage() == null) {
            if ($$2 instanceof NullPointerException) {
                $$2 = new NullPointerException(this.c);
            } else if ($$2 instanceof StackOverflowError) {
                $$2 = new StackOverflowError(this.c);
            } else if ($$2 instanceof OutOfMemoryError) {
                $$2 = new OutOfMemoryError(this.c);
            }
            $$2.setStackTrace(this.d.getStackTrace());
        }
        try {
            $$0 = new StringWriter();
            $$1 = new PrintWriter($$0);
            $$2.printStackTrace($$1);
            string = $$0.toString();
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly((Writer)$$0);
            IOUtils.closeQuietly($$1);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)$$0);
        IOUtils.closeQuietly((Writer)$$1);
        return string;
    }

    public String a(u $$0, List<String> $$1) {
        StringBuilder $$2 = new StringBuilder();
        $$0.a($$2, $$1);
        $$2.append("Time: ");
        $$2.append(b.format(ZonedDateTime.now()));
        $$2.append("\n");
        $$2.append("Description: ");
        $$2.append(this.c);
        $$2.append("\n\n");
        $$2.append(this.d());
        $$2.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int $$3 = 0; $$3 < 87; ++$$3) {
            $$2.append("-");
        }
        $$2.append("\n\n");
        this.a($$2);
        return $$2.toString();
    }

    public String a(u $$0) {
        return this.a($$0, List.of());
    }

    public @Nullable Path e() {
        return this.f;
    }

    public boolean a(Path $$0, u $$1, List<String> $$2) {
        if (this.f != null) {
            return false;
        }
        try {
            if ($$0.getParent() != null) {
                bfp.c($$0.getParent());
            }
            try (BufferedWriter $$3 = Files.newBufferedWriter($$0, StandardCharsets.UTF_8, new OpenOption[0]);){
                $$3.write(this.a($$1, $$2));
            }
            this.f = $$0;
            return true;
        }
        catch (Throwable $$4) {
            a.error("Could not save crash report to {}", (Object)$$0, (Object)$$4);
            return false;
        }
    }

    public boolean a(Path $$0, u $$1) {
        return this.a($$0, $$1, List.of());
    }

    public y f() {
        return this.i;
    }

    public n a(String $$0) {
        return this.a($$0, 1);
    }

    public n a(String $$0, int $$1) {
        n $$2 = new n($$0);
        if (this.g) {
            int $$3 = $$2.a($$1);
            StackTraceElement[] $$4 = this.d.getStackTrace();
            StackTraceElement $$5 = null;
            StackTraceElement $$6 = null;
            int $$7 = $$4.length - $$3;
            if ($$7 < 0) {
                a.error("Negative index in crash report handler ({}/{})", (Object)$$4.length, (Object)$$3);
            }
            if ($$4 != null && 0 <= $$7 && $$7 < $$4.length) {
                $$5 = $$4[$$7];
                if ($$4.length + 1 - $$3 < $$4.length) {
                    $$6 = $$4[$$4.length + 1 - $$3];
                }
            }
            this.g = $$2.a($$5, $$6);
            if ($$4 != null && $$4.length >= $$3 && 0 <= $$7 && $$7 < $$4.length) {
                this.h = new StackTraceElement[$$7];
                System.arraycopy($$4, 0, this.h, 0, this.h.length);
            } else {
                this.g = false;
            }
        }
        this.e.add($$2);
        return $$2;
    }

    public static m a(Throwable $$0, String $$1) {
        m $$4;
        while ($$0 instanceof CompletionException && $$0.getCause() != null) {
            $$0 = $$0.getCause();
        }
        if ($$0 instanceof v) {
            v $$2 = (v)$$0;
            m $$3 = $$2.a();
        } else {
            $$4 = new m($$1, $$0);
        }
        return $$4;
    }

    public static void g() {
        bgh.a();
        new m("Don't panic!", new Throwable()).a(u.a);
    }
}

