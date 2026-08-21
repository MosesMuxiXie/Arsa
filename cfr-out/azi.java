/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class azi
extends azc {
    static final Logger c = LogUtils.getLogger();
    private final b d;
    private final String e;

    azi(azk $$0, b $$1, String $$2) {
        super($$0);
        this.d = $$1;
        this.e = $$2;
    }

    private static String b(azn $$0, amo $$1) {
        return String.format(Locale.ROOT, "%s/%s/%s", $$0.a(), $$1.b(), $$1.a());
    }

    @Override
    public @Nullable bar<InputStream> a(String ... $$0) {
        return this.b(String.join((CharSequence)"/", $$0));
    }

    @Override
    public bar<InputStream> a(azn $$0, amo $$1) {
        return this.b(azi.b($$0, $$1));
    }

    private String a(String $$0) {
        if (this.e.isEmpty()) {
            return $$0;
        }
        return this.e + "/" + $$0;
    }

    private @Nullable bar<InputStream> b(String $$0) {
        ZipFile $$1 = this.d.a();
        if ($$1 == null) {
            return null;
        }
        ZipEntry $$2 = $$1.getEntry(this.a($$0));
        if ($$2 == null) {
            return null;
        }
        return bar.create($$1, $$2);
    }

    @Override
    public Set<String> a(azn $$0) {
        ZipFile $$1 = this.d.a();
        if ($$1 == null) {
            return Set.of();
        }
        Enumeration<? extends ZipEntry> $$2 = $$1.entries();
        HashSet $$3 = Sets.newHashSet();
        String $$4 = this.a($$0.a() + "/");
        while ($$2.hasMoreElements()) {
            ZipEntry $$5 = $$2.nextElement();
            String $$6 = $$5.getName();
            String $$7 = azi.a($$4, $$6);
            if ($$7.isEmpty()) continue;
            if (amo.j($$7)) {
                $$3.add($$7);
                continue;
            }
            c.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", (Object)$$7, (Object)this.d.a);
        }
        return $$3;
    }

    @VisibleForTesting
    public static String a(String $$0, String $$1) {
        if (!$$1.startsWith($$0)) {
            return "";
        }
        int $$2 = $$0.length();
        int $$3 = $$1.indexOf(47, $$2);
        if ($$3 == -1) {
            return $$1.substring($$2);
        }
        return $$1.substring($$2, $$3);
    }

    @Override
    public void close() {
        this.d.close();
    }

    @Override
    public void a(azn $$0, String $$1, String $$2, azl.a $$3) {
        ZipFile $$4 = this.d.a();
        if ($$4 == null) {
            return;
        }
        Enumeration<? extends ZipEntry> $$5 = $$4.entries();
        String $$6 = this.a($$0.a() + "/" + $$1 + "/");
        String $$7 = $$6 + $$2 + "/";
        while ($$5.hasMoreElements()) {
            String $$9;
            ZipEntry $$8 = $$5.nextElement();
            if ($$8.isDirectory() || !($$9 = $$8.getName()).startsWith($$7)) continue;
            String $$10 = $$9.substring($$6.length());
            amo $$11 = amo.b($$1, $$10);
            if ($$11 != null) {
                $$3.accept($$11, bar.create($$4, $$8));
                continue;
            }
            c.warn("Invalid path in datapack: {}:{}, ignoring", (Object)$$1, (Object)$$10);
        }
    }

    static class b
    implements AutoCloseable {
        final File a;
        private @Nullable ZipFile b;
        private boolean c;

        b(File $$0) {
            this.a = $$0;
        }

        @Nullable ZipFile a() {
            if (this.c) {
                return null;
            }
            if (this.b == null) {
                try {
                    this.b = new ZipFile(this.a);
                }
                catch (IOException $$0) {
                    c.error("Failed to open pack {}", (Object)this.a, (Object)$$0);
                    this.c = true;
                    return null;
                }
            }
            return this.b;
        }

        @Override
        public void close() {
            if (this.b != null) {
                IOUtils.closeQuietly((Closeable)this.b);
                this.b = null;
            }
        }

        protected void finalize() throws Throwable {
            this.close();
            super.finalize();
        }
    }

    public static class a
    implements bah.c {
        private final File a;

        public a(Path $$0) {
            this($$0.toFile());
        }

        public a(File $$0) {
            this.a = $$0;
        }

        @Override
        public azl a(azk $$0) {
            b $$1 = new b(this.a);
            return new azi($$0, $$1, "");
        }

        @Override
        public azl a(azk $$0, bah.a $$1) {
            b $$2 = new b(this.a);
            azi $$3 = new azi($$0, $$2, "");
            List<String> $$4 = $$1.d();
            if ($$4.isEmpty()) {
                return $$3;
            }
            ArrayList<azl> $$5 = new ArrayList<azl>($$4.size());
            for (String $$6 : $$4) {
                $$5.add(new azi($$0, $$2, $$6));
            }
            return new aze($$3, $$5);
        }
    }
}

