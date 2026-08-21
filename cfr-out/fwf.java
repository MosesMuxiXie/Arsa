/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.OptionalInt;

public class fwf
implements AutoCloseable {
    private static final int a = 320;
    private static final int b = 180;
    private static final long c = 4L;
    private int d;
    private int e;
    private int f = 320;
    private int g = 180;
    private GpuTexture h;
    private GpuTextureView i;
    private GpuBuffer j;
    private int k;
    private boolean l;
    private a m = fwf$a.a;

    public fwf() {
        GpuDevice $$0 = RenderSystem.getDevice();
        this.h = $$0.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, this.f, this.g, 1, 1);
        this.i = $$0.createTextureView(this.h);
        this.j = $$0.createBuffer(() -> "Tracy Frame Capture buffer", 9, (long)(this.f * this.g) * 4L);
    }

    private void a(int $$0, int $$1) {
        float $$2 = (float)$$0 / (float)$$1;
        if ($$0 > 320) {
            $$0 = 320;
            $$1 = (int)(320.0f / $$2);
        }
        if ($$1 > 180) {
            $$0 = (int)(180.0f * $$2);
            $$1 = 180;
        }
        $$0 = $$0 / 4 * 4;
        $$1 = $$1 / 4 * 4;
        if (this.f != $$0 || this.g != $$1) {
            this.f = $$0;
            this.g = $$1;
            GpuDevice $$3 = RenderSystem.getDevice();
            this.h.close();
            this.h = $$3.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, $$0, $$1, 1, 1);
            this.i.close();
            this.i = $$3.createTextureView(this.h);
            this.j.close();
            this.j = $$3.createBuffer(() -> "Tracy Frame Capture buffer", 9, (long)($$0 * $$1) * 4L);
        }
    }

    public void a(fxt $$0) {
        if (this.m != fwf$a.a || this.l || $$0.c() == null) {
            return;
        }
        this.l = true;
        if ($$0.c != this.d || $$0.d != this.e) {
            this.d = $$0.c;
            this.e = $$0.d;
            this.a(this.d, this.e);
        }
        this.m = fwf$a.b;
        CommandEncoder $$1 = RenderSystem.getDevice().createCommandEncoder();
        try (RenderPass $$2 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Tracy blit", this.i, OptionalInt.empty());){
            $$2.setPipeline(hpa.aD);
            $$2.bindTexture("InSampler", $$0.d(), RenderSystem.getSamplerCache().a(FilterMode.LINEAR));
            $$2.draw(0, 3);
        }
        $$1.copyTextureToBuffer(this.h, this.j, 0L, () -> {
            this.m = fwf$a.c;
        }, 0);
        this.k = 0;
    }

    public void a() {
        if (this.m != fwf$a.c) {
            return;
        }
        this.m = fwf$a.a;
        try (GpuBuffer.MappedView $$0 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.j, true, false);){
            TracyClient.frameImage((ByteBuffer)$$0.data(), (int)this.f, (int)this.g, (int)this.k, (boolean)true);
        }
    }

    public void b() {
        ++this.k;
        this.l = false;
        TracyClient.markFrame();
    }

    @Override
    public void close() {
        this.h.close();
        this.i.close();
        this.j.close();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = fwf$a.a();
        }
    }
}

