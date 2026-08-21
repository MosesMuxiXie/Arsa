/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.MemoryPool
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.MemoryUtil$MemoryAllocator
 *  org.slf4j.Logger
 */
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class fzi
implements AutoCloseable {
    private static final MemoryPool a = TracyClient.createMemoryPool((String)"ByteBufferBuilder");
    private static final Logger b = LogUtils.getLogger();
    private static final MemoryUtil.MemoryAllocator c = MemoryUtil.getAllocator((boolean)false);
    private static final long d = 0xFFFFFFFFL;
    private static final int e = 0x200000;
    private static final int f = -1;
    long g;
    private long h;
    private final long i;
    private long j;
    private long k;
    private int l;
    private int m;

    public fzi(int $$0, long $$1) {
        this.h = $$0;
        this.i = $$1;
        this.g = c.malloc((long)$$0);
        a.malloc(this.g, $$0);
        if (this.g == 0L) {
            throw new OutOfMemoryError("Failed to allocate " + $$0 + " bytes");
        }
    }

    public fzi(int $$0) {
        this($$0, 0xFFFFFFFFL);
    }

    public static fzi a(int $$0) {
        return new fzi($$0, $$0);
    }

    public long b(int $$0) {
        long $$1 = this.j;
        long $$2 = Math.addExact($$1, (long)$$0);
        this.a($$2);
        this.j = $$2;
        return Math.addExact(this.g, $$1);
    }

    private void a(long $$0) {
        if ($$0 > this.h) {
            if ($$0 > this.i) {
                throw new IllegalArgumentException("Maximum capacity of ByteBufferBuilder (" + this.i + ") exceeded, required " + $$0);
            }
            long $$1 = Math.min(this.h, 0x200000L);
            long $$2 = bgj.a(this.h + $$1, $$0, this.i);
            this.b($$2);
        }
    }

    private void b(long $$0) {
        a.free(this.g);
        this.g = c.realloc(this.g, $$0);
        a.malloc(this.g, (int)Math.min($$0, Integer.MAX_VALUE));
        b.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", (Object)this.h, (Object)$$0);
        if (this.g == 0L) {
            throw new OutOfMemoryError("Failed to resize buffer from " + this.h + " bytes to " + $$0 + " bytes");
        }
        this.h = $$0;
    }

    public @Nullable a a() {
        this.f();
        long $$0 = this.k;
        long $$1 = this.j - $$0;
        if ($$1 == 0L) {
            return null;
        }
        if ($$1 > Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot build buffer larger than 2147483647 bytes (was " + $$1 + ")");
        }
        this.k = this.j;
        ++this.l;
        return new a($$0, (int)$$1, this.m);
    }

    public void b() {
        if (this.l > 0) {
            b.warn("Clearing BufferBuilder with unused batches");
        }
        this.c();
    }

    public void c() {
        this.f();
        if (this.l > 0) {
            this.e();
            this.l = 0;
        }
    }

    boolean c(int $$0) {
        return $$0 == this.m;
    }

    void d() {
        if (--this.l <= 0) {
            this.e();
        }
    }

    private void e() {
        long $$0 = this.j - this.k;
        if ($$0 > 0L) {
            MemoryUtil.memCopy((long)(this.g + this.k), (long)this.g, (long)$$0);
        }
        this.j = $$0;
        this.k = 0L;
        ++this.m;
    }

    @Override
    public void close() {
        if (this.g != 0L) {
            a.free(this.g);
            c.free(this.g);
            this.g = 0L;
            this.m = -1;
        }
    }

    private void f() {
        if (this.g == 0L) {
            throw new IllegalStateException("Buffer has been freed");
        }
    }

    public class a
    implements AutoCloseable {
        private final long b;
        private final int c;
        private final int d;
        private boolean e;

        a(long $$1, int $$2, int $$3) {
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public ByteBuffer a() {
            if (!fzi.this.c(this.d)) {
                throw new IllegalStateException("Buffer is no longer valid");
            }
            return MemoryUtil.memByteBuffer((long)(fzi.this.g + this.b), (int)this.c);
        }

        @Override
        public void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            if (fzi.this.c(this.d)) {
                fzi.this.d();
            }
        }
    }
}

