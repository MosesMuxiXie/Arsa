/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class bfh
implements AutoCloseable {
    public static final String a = "session.lock";
    private final FileChannel b;
    private final FileLock c;
    private static final ByteBuffer d;

    public static bfh a(Path $$0) throws IOException {
        Path $$1 = $$0.resolve(a);
        bfp.c($$0);
        FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        try {
            $$2.write(d.duplicate());
            $$2.force(true);
            FileLock $$3 = $$2.tryLock();
            if ($$3 == null) {
                throw bfh$a.a($$1);
            }
            return new bfh($$2, $$3);
        }
        catch (IOException $$4) {
            try {
                $$2.close();
            }
            catch (IOException $$5) {
                $$4.addSuppressed($$5);
            }
            throw $$4;
        }
    }

    private bfh(FileChannel $$0, FileLock $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void close() throws IOException {
        try {
            if (this.c.isValid()) {
                this.c.release();
            }
        }
        finally {
            if (this.b.isOpen()) {
                this.b.close();
            }
        }
    }

    public boolean a() {
        return this.c.isValid();
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Path $$0) throws IOException {
        Path $$1 = $$0.resolve(a);
        try (FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.WRITE);){
            boolean bl2;
            block15: {
                FileLock $$3 = $$2.tryLock();
                try {
                    boolean bl3 = bl2 = $$3 == null;
                    if ($$3 == null) break block15;
                }
                catch (Throwable throwable) {
                    if ($$3 != null) {
                        try {
                            $$3.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                $$3.close();
            }
            return bl2;
        }
        catch (AccessDeniedException $$4) {
            return true;
        }
        catch (NoSuchFileException $$5) {
            return false;
        }
    }

    static {
        byte[] $$0 = "\u2603".getBytes(StandardCharsets.UTF_8);
        d = ByteBuffer.allocateDirect($$0.length);
        d.put($$0);
        d.flip();
    }

    public static class a
    extends IOException {
        private a(Path $$0, String $$1) {
            super(String.valueOf($$0.toAbsolutePath()) + ": " + $$1);
        }

        public static a a(Path $$0) {
            return new a($$0, "already locked (possibly by other Minecraft instance?)");
        }
    }
}

