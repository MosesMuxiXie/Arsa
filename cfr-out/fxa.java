/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.MemoryPool
 *  com.mojang.jtracy.TracyClient
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class fxa
extends GpuBuffer {
    protected static final MemoryPool a = TracyClient.createMemoryPool((String)"GPU Buffers");
    protected boolean b;
    protected final @Nullable Supplier<String> c;
    private final fwz f;
    protected final int d;
    protected @Nullable ByteBuffer e;

    protected fxa(@Nullable Supplier<String> $$0, fwz $$1, @GpuBuffer.a int $$2, long $$3, int $$4, @Nullable ByteBuffer $$5) {
        super($$2, $$3);
        this.c = $$0;
        this.f = $$1;
        this.d = $$4;
        this.e = $$5;
        int $$6 = (int)Math.min($$3, Integer.MAX_VALUE);
        a.malloc((long)$$4, $$6);
    }

    @Override
    public boolean isClosed() {
        return this.b;
    }

    @Override
    public void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.e != null) {
            this.f.a(this.d, this.usage());
            this.e = null;
        }
        GlStateManager._glDeleteBuffers(this.d);
        a.free((long)this.d);
    }

    public static class a
    implements GpuBuffer.MappedView {
        private final Runnable a;
        private final fxa b;
        private final ByteBuffer c;
        private boolean d;

        protected a(Runnable $$0, fxa $$1, ByteBuffer $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public ByteBuffer data() {
            return this.c;
        }

        @Override
        public void close() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.run();
        }
    }
}

