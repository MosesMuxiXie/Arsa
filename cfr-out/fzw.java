/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.mojang.logging.LogUtils
 *  javax.annotation.CheckReturnValue
 *  org.apache.commons.compress.archivers.tar.TarArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveInputStream
 *  org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.io.output.CountingOutputStream
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Locale;
import java.util.OptionalLong;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.CheckReturnValue;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.CountingOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fzw {
    private static final Logger a = LogUtils.getLogger();
    private volatile boolean b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile @Nullable File f;
    private volatile File g;
    private volatile @Nullable CompletableFuture<?> h;
    private @Nullable Thread i;
    private static final String[] j = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    private <T> @Nullable T a(CompletableFuture<T> $$0) throws Throwable {
        this.h = $$0;
        if (this.b) {
            $$0.cancel(true);
            return null;
        }
        try {
            try {
                return $$0.join();
            }
            catch (CompletionException $$1) {
                throw $$1.getCause();
            }
        }
        catch (CancellationException $$2) {
            return null;
        }
    }

    private static HttpClient e() {
        return HttpClient.newBuilder().executor(bhs.j()).connectTimeout(Duration.ofMinutes(2L)).build();
    }

    private static HttpRequest.Builder c(String $$0) {
        return HttpRequest.newBuilder(URI.create($$0)).timeout(Duration.ofMinutes(2L));
    }

    @CheckReturnValue
    public static OptionalLong a(String $$0) {
        HttpClient $$1 = fzw.e();
        try {
            HttpResponse<Void> $$2 = $$1.send(fzw.c($$0).HEAD().build(), HttpResponse.BodyHandlers.discarding());
            OptionalLong optionalLong = $$2.headers().firstValueAsLong("Content-Length");
            if ($$1 != null) {
                $$1.close();
            }
            return optionalLong;
        }
        catch (Throwable throwable) {
            try {
                if ($$1 != null) {
                    try {
                        $$1.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (Exception $$3) {
                a.error("Unable to get content length for download");
                return OptionalLong.empty();
            }
        }
    }

    public void a(gby $$0, String $$1, gcr.a $$2, fni $$3) {
        if (this.i != null) {
            return;
        }
        this.i = new Thread(() -> {
            try (HttpClient $$4 = fzw.e();){
                try {
                    this.f = File.createTempFile("backup", ".tar.gz");
                    this.a($$2, $$4, $$0.a(), this.f);
                    this.a($$1.trim(), this.f, $$3, $$2);
                }
                catch (Exception $$5) {
                    a.error("Caught exception while downloading world", (Throwable)$$5);
                    this.d = true;
                }
                finally {
                    this.h = null;
                    if (this.f != null) {
                        this.f.delete();
                    }
                    this.f = null;
                }
                if (this.d) {
                    return;
                }
                String $$6 = $$0.b();
                if (!$$6.isEmpty() && !$$0.c().isEmpty()) {
                    try {
                        this.f = File.createTempFile("resources", ".tar.gz");
                        this.a($$2, $$4, $$6, this.f);
                        this.a($$2, this.f, $$0);
                    }
                    catch (Exception $$7) {
                        a.error("Caught exception while downloading resource pack", (Throwable)$$7);
                        this.d = true;
                    }
                    finally {
                        this.h = null;
                        if (this.f != null) {
                            this.f.delete();
                        }
                        this.f = null;
                    }
                }
                this.c = true;
            }
        });
        this.i.setUncaughtExceptionHandler(new gcc(a));
        this.i.start();
    }

    /*
     * WARNING - void declaration
     */
    private void a(gcr.a $$0, HttpClient $$1, String $$2, File $$3) throws IOException {
        void $$8;
        HttpRequest $$4 = fzw.c($$2).GET().build();
        try {
            HttpResponse<InputStream> $$5 = this.a($$1.sendAsync($$4, HttpResponse.BodyHandlers.ofInputStream()));
        }
        catch (Error $$6) {
            throw $$6;
        }
        catch (Throwable $$7) {
            a.error("Failed to download {}", (Object)$$2, (Object)$$7);
            this.d = true;
            return;
        }
        if ($$8 == null || this.b) {
            return;
        }
        if ($$8.statusCode() != 200) {
            this.d = true;
            return;
        }
        $$0.b = $$8.headers().firstValueAsLong("Content-Length").orElse(0L);
        try (InputStream $$9 = (InputStream)$$8.body();
             FileOutputStream $$10 = new FileOutputStream($$3);){
            $$9.transferTo((OutputStream)((Object)new a($$10, $$0)));
        }
    }

    public void a() {
        if (this.f != null) {
            this.f.delete();
            this.f = null;
        }
        this.b = true;
        CompletableFuture<?> $$0 = this.h;
        if ($$0 != null) {
            $$0.cancel(true);
        }
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public static String b(String $$0) {
        $$0 = ((String)$$0).replaceAll("[\\./\"]", "_");
        for (String $$1 : j) {
            if (!((String)$$0).equalsIgnoreCase($$1)) continue;
            $$0 = "_" + (String)$$0 + "_";
        }
        return $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(String $$0, @Nullable File $$1, fni $$2) throws IOException {
        String $$13;
        Pattern $$3 = Pattern.compile(".*-([0-9]+)$");
        int $$4 = 1;
        for (char $$5 : w.bg) {
            $$0 = $$0.replace($$5, '_');
        }
        if (StringUtils.isEmpty((CharSequence)$$0)) {
            $$0 = "Realm";
        }
        $$0 = fzw.b($$0);
        try {
            Object object = $$2.b().iterator();
            while (object.hasNext()) {
                fni.b $$6 = (fni.b)object.next();
                String $$7 = $$6.a();
                if (!$$7.toLowerCase(Locale.ROOT).startsWith($$0.toLowerCase(Locale.ROOT))) continue;
                Matcher $$8 = $$3.matcher($$7);
                if ($$8.matches()) {
                    int $$9 = Integer.parseInt($$8.group(1));
                    if ($$9 <= $$4) continue;
                    $$4 = $$9;
                    continue;
                }
                ++$$4;
            }
        }
        catch (Exception $$10) {
            a.error("Error getting level list", (Throwable)$$10);
            this.d = true;
            return;
        }
        if (!$$2.a($$0) || $$4 > 1) {
            String $$11 = $$0 + (String)($$4 == 1 ? "" : "-" + $$4);
            if (!$$2.a($$11)) {
                boolean $$12 = false;
                while (!$$12) {
                    if (!$$2.a($$11 = $$0 + (String)(++$$4 == 1 ? "" : "-" + $$4))) continue;
                    $$12 = true;
                }
            }
        } else {
            $$13 = $$0;
        }
        TarArchiveInputStream $$14 = null;
        File $$15 = new File(gfj.V().p.getAbsolutePath(), "saves");
        try {
            $$15.mkdir();
            $$14 = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream((InputStream)new BufferedInputStream(new FileInputStream($$1))));
            TarArchiveEntry $$16 = $$14.getNextTarEntry();
            while ($$16 != null) {
                File $$17 = new File($$15, $$16.getName().replace("world", $$13));
                if ($$16.isDirectory()) {
                    $$17.mkdirs();
                } else {
                    $$17.createNewFile();
                    try (FileOutputStream $$18 = new FileOutputStream($$17);){
                        IOUtils.copy((InputStream)$$14, (OutputStream)$$18);
                    }
                }
                $$16 = $$14.getNextTarEntry();
            }
        }
        catch (Exception $$22) {
            a.error("Error extracting world", (Throwable)$$22);
            this.d = true;
        }
        finally {
            if ($$14 != null) {
                $$14.close();
            }
            if ($$1 != null) {
                $$1.delete();
            }
            try (fni.c $$23 = $$2.d($$13);){
                $$23.b($$13);
            }
            catch (IOException | vk | vr $$24) {
                a.error("Failed to modify unpacked realms level {}", (Object)$$13, (Object)$$24);
            }
            catch (ftb $$25) {
                a.warn("Failed to download file", (Throwable)$$25);
            }
            this.g = new File($$15, $$13 + File.separator + "resources.zip");
        }
    }

    private void a(String $$0, File $$1, fni $$2, gcr.a $$3) {
        if ($$3.a >= $$3.b && !this.b && !this.d) {
            try {
                this.e = true;
                this.a($$0, $$1, $$2);
            }
            catch (IOException $$4) {
                a.error("Error extracting archive", (Throwable)$$4);
                this.d = true;
            }
        }
    }

    private void a(gcr.a $$0, File $$1, gby $$2) {
        if ($$0.a >= $$0.b && !this.b) {
            try {
                String $$3 = Hashing.sha1().hashBytes(Files.toByteArray((File)$$1)).toString();
                if ($$3.equals($$2.c())) {
                    FileUtils.copyFile((File)$$1, (File)this.g);
                    this.c = true;
                } else {
                    a.error("Resourcepack had wrong hash (expected {}, found {}). Deleting it.", (Object)$$2.c(), (Object)$$3);
                    FileUtils.deleteQuietly((File)$$1);
                    this.d = true;
                }
            }
            catch (IOException $$4) {
                a.error("Error copying resourcepack file: {}", (Object)$$4.getMessage());
                this.d = true;
            }
        }
    }

    static class a
    extends CountingOutputStream {
        private final gcr.a a;

        public a(OutputStream $$0, gcr.a $$1) {
            super($$0);
            this.a = $$1;
        }

        protected void afterWrite(int $$0) throws IOException {
            super.afterWrite($$0);
            this.a.a = this.getByteCount();
        }
    }
}

