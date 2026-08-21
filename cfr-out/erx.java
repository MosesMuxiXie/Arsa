/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class erx
implements AutoCloseable {
    private static final Logger c = LogUtils.getLogger();
    private static final int d = 4096;
    @VisibleForTesting
    protected static final int a = 1024;
    private static final int e = 5;
    private static final int f = 0;
    private static final ByteBuffer g = ByteBuffer.allocateDirect(1);
    private static final String h = ".mcc";
    private static final int i = 128;
    private static final int j = 256;
    private static final int k = 0;
    final esa l;
    private final Path m;
    private final FileChannel n;
    private final Path o;
    final erz p;
    private final ByteBuffer q = ByteBuffer.allocateDirect(8192);
    private final IntBuffer r;
    private final IntBuffer s;
    @VisibleForTesting
    protected final erw b = new erw();

    public erx(esa $$0, Path $$1, Path $$2, boolean $$3) throws IOException {
        this($$0, $$1, $$2, erz.a(), $$3);
    }

    public erx(esa $$0, Path $$1, Path $$2, erz $$3, boolean $$4) throws IOException {
        this.l = $$0;
        this.m = $$1;
        this.p = $$3;
        if (!Files.isDirectory($$2, new LinkOption[0])) {
            throw new IllegalArgumentException("Expected directory, got " + String.valueOf($$2.toAbsolutePath()));
        }
        this.o = $$2;
        this.r = this.q.asIntBuffer();
        this.r.limit(1024);
        this.q.position(4096);
        this.s = this.q.asIntBuffer();
        this.n = $$4 ? FileChannel.open($$1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC) : FileChannel.open($$1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
        this.b.a(0, 2);
        this.q.position(0);
        int $$5 = this.n.read(this.q, 0L);
        if ($$5 != -1) {
            if ($$5 != 8192) {
                c.warn("Region file {} has truncated header: {}", (Object)$$1, (Object)$$5);
            }
            long $$6 = Files.size($$1);
            for (int $$7 = 0; $$7 < 1024; ++$$7) {
                int $$8 = this.r.get($$7);
                if ($$8 == 0) continue;
                int $$9 = erx.b($$8);
                int $$10 = erx.a($$8);
                if ($$9 < 2) {
                    c.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", new Object[]{$$1, $$7, $$9});
                    this.r.put($$7, 0);
                    continue;
                }
                if ($$10 == 0) {
                    c.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", (Object)$$1, (Object)$$7);
                    this.r.put($$7, 0);
                    continue;
                }
                if ((long)$$9 * 4096L > $$6) {
                    c.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", new Object[]{$$1, $$7, $$9});
                    this.r.put($$7, 0);
                    continue;
                }
                this.b.a($$9, $$10);
            }
        }
    }

    public Path a() {
        return this.m;
    }

    private Path f(dvu $$0) {
        String $$1 = "c." + $$0.h + "." + $$0.i + h;
        return this.o.resolve($$1);
    }

    public synchronized @Nullable DataInputStream a(dvu $$0) throws IOException {
        int $$1 = this.g($$0);
        if ($$1 == 0) {
            return null;
        }
        int $$2 = erx.b($$1);
        int $$3 = erx.a($$1);
        int $$4 = $$3 * 4096;
        ByteBuffer $$5 = ByteBuffer.allocate($$4);
        this.n.read($$5, $$2 * 4096);
        $$5.flip();
        if ($$5.remaining() < 5) {
            c.error("Chunk {} header is truncated: expected {} but read {}", new Object[]{$$0, $$4, $$5.remaining()});
            return null;
        }
        int $$6 = $$5.getInt();
        byte $$7 = $$5.get();
        if ($$6 == 0) {
            c.warn("Chunk {} is allocated, but stream is missing", (Object)$$0);
            return null;
        }
        int $$8 = $$6 - 1;
        if (erx.a($$7)) {
            if ($$8 != 0) {
                c.warn("Chunk has both internal and external streams");
            }
            return this.a($$0, erx.b($$7));
        }
        if ($$8 > $$5.remaining()) {
            c.error("Chunk {} stream is truncated: expected {} but read {}", new Object[]{$$0, $$8, $$5.remaining()});
            return null;
        }
        if ($$8 < 0) {
            c.error("Declared size {} of chunk {} is negative", (Object)$$6, (Object)$$0);
            return null;
        }
        bzu.f.a(this.l, $$0, this.p, $$8);
        return this.a($$0, $$7, erx.a($$5, $$8));
    }

    private static int c() {
        return (int)(bhs.e() / 1000L);
    }

    private static boolean a(byte $$0) {
        return ($$0 & 0x80) != 0;
    }

    private static byte b(byte $$0) {
        return (byte)($$0 & 0xFFFFFF7F);
    }

    private @Nullable DataInputStream a(dvu $$0, byte $$1, InputStream $$2) throws IOException {
        erz $$3 = erz.a($$1);
        if ($$3 == erz.e) {
            String $$4 = new DataInputStream($$2).readUTF();
            amo $$5 = amo.c($$4);
            if ($$5 != null) {
                c.error("Unrecognized custom compression {}", (Object)$$5);
                return null;
            }
            c.error("Invalid custom compression id {}", (Object)$$4);
            return null;
        }
        if ($$3 == null) {
            c.error("Chunk {} has invalid chunk stream version {}", (Object)$$0, (Object)$$1);
            return null;
        }
        return new DataInputStream($$3.a($$2));
    }

    private @Nullable DataInputStream a(dvu $$0, byte $$1) throws IOException {
        Path $$2 = this.f($$0);
        if (!Files.isRegularFile($$2, new LinkOption[0])) {
            c.error("External chunk path {} is not file", (Object)$$2);
            return null;
        }
        return this.a($$0, $$1, Files.newInputStream($$2, new OpenOption[0]));
    }

    private static ByteArrayInputStream a(ByteBuffer $$0, int $$1) {
        return new ByteArrayInputStream($$0.array(), $$0.position(), $$1);
    }

    private int a(int $$0, int $$1) {
        return $$0 << 8 | $$1;
    }

    private static int a(int $$0) {
        return $$0 & 0xFF;
    }

    private static int b(int $$0) {
        return $$0 >> 8 & 0xFFFFFF;
    }

    private static int c(int $$0) {
        return ($$0 + 4096 - 1) / 4096;
    }

    public boolean b(dvu $$0) {
        int $$1 = this.g($$0);
        if ($$1 == 0) {
            return false;
        }
        int $$2 = erx.b($$1);
        int $$3 = erx.a($$1);
        ByteBuffer $$4 = ByteBuffer.allocate(5);
        try {
            this.n.read($$4, $$2 * 4096);
            $$4.flip();
            if ($$4.remaining() != 5) {
                return false;
            }
            int $$5 = $$4.getInt();
            byte $$6 = $$4.get();
            if (erx.a($$6)) {
                if (!erz.b(erx.b($$6))) {
                    return false;
                }
                if (!Files.isRegularFile(this.f($$0), new LinkOption[0])) {
                    return false;
                }
            } else {
                if (!erz.b($$6)) {
                    return false;
                }
                if ($$5 == 0) {
                    return false;
                }
                int $$7 = $$5 - 1;
                if ($$7 < 0 || $$7 > 4096 * $$3) {
                    return false;
                }
            }
        }
        catch (IOException $$8) {
            return false;
        }
        return true;
    }

    public DataOutputStream c(dvu $$0) throws IOException {
        return new DataOutputStream(this.p.a(new a($$0)));
    }

    public void b() throws IOException {
        this.n.force(true);
    }

    public void d(dvu $$0) throws IOException {
        int $$1 = erx.h($$0);
        int $$2 = this.r.get($$1);
        if ($$2 == 0) {
            return;
        }
        this.r.put($$1, 0);
        this.s.put($$1, erx.c());
        this.e();
        Files.deleteIfExists(this.f($$0));
        this.b.b(erx.b($$2), erx.a($$2));
    }

    protected synchronized void a(dvu $$0, ByteBuffer $$1) throws IOException {
        b $$13;
        int $$12;
        int $$2 = erx.h($$0);
        int $$3 = this.r.get($$2);
        int $$4 = erx.b($$3);
        int $$5 = erx.a($$3);
        int $$6 = $$1.remaining();
        int $$7 = erx.c($$6);
        if ($$7 >= 256) {
            Path $$8 = this.f($$0);
            c.warn("Saving oversized chunk {} ({} bytes} to external file {}", new Object[]{$$0, $$6, $$8});
            $$7 = 1;
            int $$9 = this.b.a($$7);
            b $$10 = this.a($$8, $$1);
            ByteBuffer $$11 = this.d();
            this.n.write($$11, $$9 * 4096);
        } else {
            $$12 = this.b.a($$7);
            $$13 = () -> Files.deleteIfExists(this.f($$0));
            this.n.write($$1, $$12 * 4096);
        }
        this.r.put($$2, this.a($$12, $$7));
        this.s.put($$2, erx.c());
        this.e();
        $$13.run();
        if ($$4 != 0) {
            this.b.b($$4, $$5);
        }
    }

    private ByteBuffer d() {
        ByteBuffer $$0 = ByteBuffer.allocate(5);
        $$0.putInt(1);
        $$0.put((byte)(this.p.b() | 0x80));
        $$0.flip();
        return $$0;
    }

    private b a(Path $$0, ByteBuffer $$1) throws IOException {
        Path $$2 = Files.createTempFile(this.o, "tmp", null, new FileAttribute[0]);
        try (FileChannel $$3 = FileChannel.open($$2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);){
            $$1.position(5);
            $$3.write($$1);
        }
        return () -> Files.move($$2, $$0, StandardCopyOption.REPLACE_EXISTING);
    }

    private void e() throws IOException {
        this.q.position(0);
        this.n.write(this.q, 0L);
    }

    private int g(dvu $$0) {
        return this.r.get(erx.h($$0));
    }

    public boolean e(dvu $$0) {
        return this.g($$0) != 0;
    }

    private static int h(dvu $$0) {
        return $$0.k() + $$0.l() * 32;
    }

    @Override
    public void close() throws IOException {
        try {
            this.f();
        }
        finally {
            try {
                this.n.force(true);
            }
            finally {
                this.n.close();
            }
        }
    }

    private void f() throws IOException {
        int $$1;
        int $$0 = (int)this.n.size();
        if ($$0 != ($$1 = erx.c($$0) * 4096)) {
            ByteBuffer $$2 = g.duplicate();
            $$2.position(0);
            this.n.write($$2, $$1 - 1);
        }
    }

    class a
    extends ByteArrayOutputStream {
        private final dvu b;

        public a(dvu $$0) {
            super(8096);
            super.write(0);
            super.write(0);
            super.write(0);
            super.write(0);
            super.write(erx.this.p.b());
            this.b = $$0;
        }

        @Override
        public void close() throws IOException {
            ByteBuffer $$0 = ByteBuffer.wrap(this.buf, 0, this.count);
            int $$1 = this.count - 5 + 1;
            bzu.f.b(erx.this.l, this.b, erx.this.p, $$1);
            $$0.putInt(0, $$1);
            erx.this.a(this.b, $$0);
        }
    }

    static interface b {
        public void run() throws IOException;
    }
}

