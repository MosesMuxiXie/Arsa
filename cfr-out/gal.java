/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.compress.archivers.tar.TarArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveOutputStream
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public class gal {
    private static final long a = 0x140000000L;
    private static final String b = "world";
    private final BooleanSupplier c;
    private final Path d;

    public static File a(Path $$0, BooleanSupplier $$1) throws IOException {
        return new gal($$0, $$1).a();
    }

    private gal(Path $$0, BooleanSupplier $$1) {
        this.c = $$1;
        this.d = $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private File a() throws IOException {
        try (TarArchiveOutputStream $$0 = null;){
            File $$1 = File.createTempFile("realms-upload-file", ".tar.gz");
            $$0 = new TarArchiveOutputStream((OutputStream)new GZIPOutputStream(new FileOutputStream($$1)));
            $$0.setLongFileMode(3);
            this.a($$0, this.d, b, true);
            if (this.c.getAsBoolean()) {
                throw new gag();
            }
            $$0.finish();
            this.a($$1.length());
            File file = $$1;
            return file;
        }
    }

    private void a(TarArchiveOutputStream $$0, Path $$1, String $$2, boolean $$3) throws IOException {
        if (this.c.getAsBoolean()) {
            throw new gag();
        }
        this.a($$0.getBytesWritten());
        File $$4 = $$1.toFile();
        String $$5 = $$3 ? $$2 : $$2 + $$4.getName();
        TarArchiveEntry $$6 = new TarArchiveEntry($$4, $$5);
        $$0.putArchiveEntry($$6);
        if ($$4.isFile()) {
            try (FileInputStream $$7 = new FileInputStream($$4);){
                ((InputStream)$$7).transferTo((OutputStream)$$0);
            }
            $$0.closeArchiveEntry();
        } else {
            $$0.closeArchiveEntry();
            File[] $$8 = $$4.listFiles();
            if ($$8 != null) {
                for (File $$9 : $$8) {
                    this.a($$0, $$9.toPath(), $$5 + "/", false);
                }
            }
        }
    }

    private void a(long $$0) {
        if ($$0 > 0x140000000L) {
            throw new gaj(0x140000000L);
        }
    }
}

