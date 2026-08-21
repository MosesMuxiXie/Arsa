/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.opengl.GlStateManager;

public class fxf
implements GpuFence {
    private long a = GlStateManager._glFenceSync(37143, 0);

    @Override
    public void close() {
        if (this.a != 0L) {
            GlStateManager._glDeleteSync(this.a);
            this.a = 0L;
        }
    }

    @Override
    public boolean awaitCompletion(long $$0) {
        if (this.a == 0L) {
            return true;
        }
        int $$1 = GlStateManager._glClientWaitSync(this.a, 0, $$0);
        if ($$1 == 37147) {
            return false;
        }
        if ($$1 == 37149) {
            throw new IllegalStateException("Failed to complete GPU fence: " + GlStateManager._getError());
        }
        return true;
    }
}

