/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hnx<T extends a>
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private final List<hol> b = new ArrayList<hol>();
    private final int c;
    private hol d;
    private int e;
    private int f;
    private @Nullable T g;
    private final String h;

    public hnx(String $$0, int $$1, int $$2) {
        GpuDevice $$3 = RenderSystem.getDevice();
        this.c = bgj.e($$1, $$3.getUniformOffsetAlignment());
        this.f = bgj.c($$2);
        this.e = 0;
        this.d = new hol(() -> $$0 + " x" + this.c, 130, this.c * this.f);
        this.h = $$0;
    }

    public void a() {
        this.e = 0;
        this.g = null;
        this.d.c();
        if (!this.b.isEmpty()) {
            for (hol $$0 : this.b) {
                $$0.close();
            }
            this.b.clear();
        }
    }

    private void a(int $$0) {
        this.f = $$0;
        this.e = 0;
        this.g = null;
        this.b.add(this.d);
        this.d = new hol(() -> this.h + " x" + this.c, 130, this.c * this.f);
    }

    public GpuBufferSlice a(T $$0) {
        if (this.g != null && this.g.equals($$0)) {
            return this.d.b().slice((this.e - 1) * this.c, this.c);
        }
        if (this.e >= this.f) {
            int $$1 = this.f * 2;
            a.info("Resizing {}, capacity limit of {} reached during a single frame. New capacity will be {}.", new Object[]{this.h, this.f, $$1});
            this.a($$1);
        }
        int $$2 = this.e * this.c;
        try (GpuBuffer.MappedView $$3 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.d.b().slice($$2, this.c), false, true);){
            $$0.a($$3.data());
        }
        ++this.e;
        this.g = $$0;
        return this.d.b().slice($$2, this.c);
    }

    public GpuBufferSlice[] a(T[] $$0) {
        if ($$0.length == 0) {
            return new GpuBufferSlice[0];
        }
        if (this.e + $$0.length > this.f) {
            int $$1 = bgj.c(Math.max(this.f + 1, $$0.length));
            a.info("Resizing {}, capacity limit of {} reached during a single frame. New capacity will be {}.", new Object[]{this.h, this.f, $$1});
            this.a($$1);
        }
        int $$2 = this.e * this.c;
        GpuBufferSlice[] $$3 = new GpuBufferSlice[$$0.length];
        try (GpuBuffer.MappedView $$4 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.d.b().slice($$2, $$0.length * this.c), false, true);){
            ByteBuffer $$5 = $$4.data();
            for (int $$6 = 0; $$6 < $$0.length; ++$$6) {
                T $$7 = $$0[$$6];
                $$3[$$6] = this.d.b().slice($$2 + $$6 * this.c, this.c);
                $$5.position($$6 * this.c);
                $$7.a($$5);
            }
        }
        this.e += $$0.length;
        this.g = $$0[$$0.length - 1];
        return $$3;
    }

    @Override
    public void close() {
        for (hol $$0 : this.b) {
            $$0.close();
        }
        this.d.close();
    }

    public static interface a {
        public void a(ByteBuffer var1);
    }
}

