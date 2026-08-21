/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class hol
implements AutoCloseable {
    private static final int a = 3;
    private final GpuBuffer[] b = new GpuBuffer[3];
    private final @Nullable GpuFence[] c = new GpuFence[3];
    private final int d;
    private int e = 0;

    public hol(Supplier<String> $$0, @GpuBuffer.a int $$1, int $$2) {
        GpuDevice $$3 = RenderSystem.getDevice();
        if (($$1 & 1) == 0 && ($$1 & 2) == 0) {
            throw new IllegalArgumentException("MappableRingBuffer requires at least one of USAGE_MAP_READ or USAGE_MAP_WRITE");
        }
        for (int $$4 = 0; $$4 < 3; ++$$4) {
            int $$5 = $$4;
            this.b[$$4] = $$3.createBuffer(() -> (String)$$0.get() + " #" + $$5, $$1, $$2);
            this.c[$$4] = null;
        }
        this.d = $$2;
    }

    public int a() {
        return this.d;
    }

    public GpuBuffer b() {
        GpuFence $$0 = this.c[this.e];
        if ($$0 != null) {
            $$0.awaitCompletion(Long.MAX_VALUE);
            $$0.close();
            this.c[this.e] = null;
        }
        return this.b[this.e];
    }

    public void c() {
        if (this.c[this.e] != null) {
            this.c[this.e].close();
        }
        this.c[this.e] = RenderSystem.getDevice().createCommandEncoder().createFence();
        this.e = (this.e + 1) % 3;
    }

    @Override
    public void close() {
        for (int $$0 = 0; $$0 < 3; ++$$0) {
            this.b[$$0].close();
            if (this.c[$$0] == null) continue;
            this.c[$$0].close();
        }
    }
}

