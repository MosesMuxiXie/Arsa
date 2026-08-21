/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryStack
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;

public class hoc
implements AutoCloseable {
    public static final int a = new Std140SizeCalculator().putIVec3().putVec3().putVec2().putFloat().putFloat().putInt().putInt().get();
    private final GpuBuffer b = RenderSystem.getDevice().createBuffer(() -> "Global Settings UBO", 136, a);

    public void a(int $$0, int $$1, double $$2, long $$3, gez $$4, int $$5, ger $$6, boolean $$7) {
        ftm $$8 = $$6.b();
        try (MemoryStack $$9 = MemoryStack.stackPush();){
            int $$10 = bgj.c($$8.g);
            int $$11 = bgj.c($$8.h);
            int $$12 = bgj.c($$8.i);
            ByteBuffer $$13 = Std140Builder.onStack($$9, a).putIVec3($$10, $$11, $$12).putVec3((float)((double)$$10 - $$8.g), (float)((double)$$11 - $$8.h), (float)((double)$$12 - $$8.i)).putVec2($$0, $$1).putFloat((float)$$2).putFloat(((float)($$3 % 24000L) + $$4.a(false)) / 24000.0f).putInt($$5).putInt($$7 ? 1 : 0).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.b.slice(), $$13);
        }
        RenderSystem.setGlobalSettingsUniform(this.b);
    }

    @Override
    public void close() {
        this.b.close();
    }
}

