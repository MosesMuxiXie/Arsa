/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.ARBBufferStorage
 *  org.lwjgl.opengl.ARBDirectStateAccess
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.opengl.GLCapabilities
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBBufferStorage;
import org.lwjgl.opengl.ARBDirectStateAccess;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GLCapabilities;

public abstract class fwz {
    public static fwz a(GLCapabilities $$0, Set<String> $$1, fwc $$2) {
        if ($$0.GL_ARB_direct_state_access && fxe.e && !$$2.b()) {
            $$1.add("GL_ARB_direct_state_access");
            return new a();
        }
        return new b();
    }

    abstract int a();

    abstract void a(int var1, long var2, @GpuBuffer.a int var4);

    abstract void a(int var1, ByteBuffer var2, @GpuBuffer.a int var3);

    abstract void a(int var1, long var2, ByteBuffer var4, @GpuBuffer.a int var5);

    abstract void b(int var1, long var2, @GpuBuffer.a int var4);

    abstract void b(int var1, ByteBuffer var2, @GpuBuffer.a int var3);

    abstract @Nullable ByteBuffer a(int var1, long var2, long var4, int var6, @GpuBuffer.a int var7);

    abstract void a(int var1, @GpuBuffer.a int var2);

    abstract int b();

    abstract void a(int var1, int var2, int var3, int var4, int var5);

    abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

    abstract void a(int var1, long var2, long var4, @GpuBuffer.a int var6);

    abstract void a(int var1, int var2, long var3, long var5, long var7);

    static class a
    extends fwz {
        a() {
        }

        @Override
        int a() {
            GlStateManager.incrementTrackedBuffers();
            return ARBDirectStateAccess.glCreateBuffers();
        }

        @Override
        void a(int $$0, long $$1, @GpuBuffer.a int $$2) {
            ARBDirectStateAccess.glNamedBufferData((int)$$0, (long)$$1, (int)GlConst.bufferUsageToGlEnum($$2));
        }

        @Override
        void a(int $$0, ByteBuffer $$1, @GpuBuffer.a int $$2) {
            ARBDirectStateAccess.glNamedBufferData((int)$$0, (ByteBuffer)$$1, (int)GlConst.bufferUsageToGlEnum($$2));
        }

        @Override
        void a(int $$0, long $$1, ByteBuffer $$2, @GpuBuffer.a int $$3) {
            ARBDirectStateAccess.glNamedBufferSubData((int)$$0, (long)$$1, (ByteBuffer)$$2);
        }

        @Override
        void b(int $$0, long $$1, @GpuBuffer.a int $$2) {
            ARBDirectStateAccess.glNamedBufferStorage((int)$$0, (long)$$1, (int)GlConst.bufferUsageToGlFlag($$2));
        }

        @Override
        void b(int $$0, ByteBuffer $$1, @GpuBuffer.a int $$2) {
            ARBDirectStateAccess.glNamedBufferStorage((int)$$0, (ByteBuffer)$$1, (int)GlConst.bufferUsageToGlFlag($$2));
        }

        @Override
        @Nullable ByteBuffer a(int $$0, long $$1, long $$2, int $$3, @GpuBuffer.a int $$4) {
            return ARBDirectStateAccess.glMapNamedBufferRange((int)$$0, (long)$$1, (long)$$2, (int)$$3);
        }

        @Override
        void a(int $$0, int $$1) {
            ARBDirectStateAccess.glUnmapNamedBuffer((int)$$0);
        }

        @Override
        public int b() {
            return ARBDirectStateAccess.glCreateFramebuffers();
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, @GpuBuffer.a int $$4) {
            ARBDirectStateAccess.glNamedFramebufferTexture((int)$$0, (int)36064, (int)$$1, (int)$$3);
            ARBDirectStateAccess.glNamedFramebufferTexture((int)$$0, (int)36096, (int)$$2, (int)$$3);
            if ($$4 != 0) {
                GlStateManager._glBindFramebuffer($$4, $$0);
            }
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
            ARBDirectStateAccess.glBlitNamedFramebuffer((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (int)$$8, (int)$$9, (int)$$10, (int)$$11);
        }

        @Override
        void a(int $$0, long $$1, long $$2, @GpuBuffer.a int $$3) {
            ARBDirectStateAccess.glFlushMappedNamedBufferRange((int)$$0, (long)$$1, (long)$$2);
        }

        @Override
        void a(int $$0, int $$1, long $$2, long $$3, long $$4) {
            ARBDirectStateAccess.glCopyNamedBufferSubData((int)$$0, (int)$$1, (long)$$2, (long)$$3, (long)$$4);
        }
    }

    static class b
    extends fwz {
        b() {
        }

        private int a(@GpuBuffer.a int $$0) {
            if (($$0 & 0x20) != 0) {
                return 34962;
            }
            if (($$0 & 0x40) != 0) {
                return 34963;
            }
            if (($$0 & 0x80) != 0) {
                return 35345;
            }
            return 36663;
        }

        @Override
        int a() {
            return GlStateManager._glGenBuffers();
        }

        @Override
        void a(int $$0, long $$1, @GpuBuffer.a int $$2) {
            int $$3 = this.a($$2);
            GlStateManager._glBindBuffer($$3, $$0);
            GlStateManager._glBufferData($$3, $$1, GlConst.bufferUsageToGlEnum($$2));
            GlStateManager._glBindBuffer($$3, 0);
        }

        @Override
        void a(int $$0, ByteBuffer $$1, @GpuBuffer.a int $$2) {
            int $$3 = this.a($$2);
            GlStateManager._glBindBuffer($$3, $$0);
            GlStateManager._glBufferData($$3, $$1, GlConst.bufferUsageToGlEnum($$2));
            GlStateManager._glBindBuffer($$3, 0);
        }

        @Override
        void a(int $$0, long $$1, ByteBuffer $$2, @GpuBuffer.a int $$3) {
            int $$4 = this.a($$3);
            GlStateManager._glBindBuffer($$4, $$0);
            GlStateManager._glBufferSubData($$4, $$1, $$2);
            GlStateManager._glBindBuffer($$4, 0);
        }

        @Override
        void b(int $$0, long $$1, @GpuBuffer.a int $$2) {
            int $$3 = this.a($$2);
            GlStateManager._glBindBuffer($$3, $$0);
            ARBBufferStorage.glBufferStorage((int)$$3, (long)$$1, (int)GlConst.bufferUsageToGlFlag($$2));
            GlStateManager._glBindBuffer($$3, 0);
        }

        @Override
        void b(int $$0, ByteBuffer $$1, @GpuBuffer.a int $$2) {
            int $$3 = this.a($$2);
            GlStateManager._glBindBuffer($$3, $$0);
            ARBBufferStorage.glBufferStorage((int)$$3, (ByteBuffer)$$1, (int)GlConst.bufferUsageToGlFlag($$2));
            GlStateManager._glBindBuffer($$3, 0);
        }

        @Override
        @Nullable ByteBuffer a(int $$0, long $$1, long $$2, int $$3, @GpuBuffer.a int $$4) {
            int $$5 = this.a($$4);
            GlStateManager._glBindBuffer($$5, $$0);
            ByteBuffer $$6 = GlStateManager._glMapBufferRange($$5, $$1, $$2, $$3);
            GlStateManager._glBindBuffer($$5, 0);
            return $$6;
        }

        @Override
        void a(int $$0, @GpuBuffer.a int $$1) {
            int $$2 = this.a($$1);
            GlStateManager._glBindBuffer($$2, $$0);
            GlStateManager._glUnmapBuffer($$2);
            GlStateManager._glBindBuffer($$2, 0);
        }

        @Override
        void a(int $$0, long $$1, long $$2, @GpuBuffer.a int $$3) {
            int $$4 = this.a($$3);
            GlStateManager._glBindBuffer($$4, $$0);
            GL30.glFlushMappedBufferRange((int)$$4, (long)$$1, (long)$$2);
            GlStateManager._glBindBuffer($$4, 0);
        }

        @Override
        void a(int $$0, int $$1, long $$2, long $$3, long $$4) {
            GlStateManager._glBindBuffer(36662, $$0);
            GlStateManager._glBindBuffer(36663, $$1);
            GL31.glCopyBufferSubData((int)36662, (int)36663, (long)$$2, (long)$$3, (long)$$4);
            GlStateManager._glBindBuffer(36662, 0);
            GlStateManager._glBindBuffer(36663, 0);
        }

        @Override
        public int b() {
            return GlStateManager.glGenFramebuffers();
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
            int $$5 = $$4 == 0 ? 36009 : $$4;
            int $$6 = GlStateManager.getFrameBuffer($$5);
            GlStateManager._glBindFramebuffer($$5, $$0);
            GlStateManager._glFramebufferTexture2D($$5, 36064, 3553, $$1, $$3);
            GlStateManager._glFramebufferTexture2D($$5, 36096, 3553, $$2, $$3);
            if ($$4 == 0) {
                GlStateManager._glBindFramebuffer($$5, $$6);
            }
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
            int $$12 = GlStateManager.getFrameBuffer(36008);
            int $$13 = GlStateManager.getFrameBuffer(36009);
            GlStateManager._glBindFramebuffer(36008, $$0);
            GlStateManager._glBindFramebuffer(36009, $$1);
            GlStateManager._glBlitFrameBuffer($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
            GlStateManager._glBindFramebuffer(36008, $$12);
            GlStateManager._glBindFramebuffer(36009, $$13);
        }
    }
}

