/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.lwjgl.system.MemoryStack
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.lwjgl.system.MemoryStack;

public class fyd
implements AutoCloseable {
    private static final Vector3f b = new Vector3f(0.2f, 1.0f, -0.7f).normalize();
    private static final Vector3f c = new Vector3f(-0.2f, 1.0f, 0.7f).normalize();
    private static final Vector3f d = new Vector3f(0.2f, 1.0f, -0.7f).normalize();
    private static final Vector3f e = new Vector3f(-0.2f, -1.0f, 0.7f).normalize();
    private static final Vector3f f = new Vector3f(0.2f, -1.0f, 1.0f).normalize();
    private static final Vector3f g = new Vector3f(-0.2f, -1.0f, 0.0f).normalize();
    public static final int a = new Std140SizeCalculator().putVec3().putVec3().get();
    private final GpuBuffer h;
    private final long i;

    public fyd() {
        GpuDevice $$0 = RenderSystem.getDevice();
        this.i = bgj.e(a, $$0.getUniformOffsetAlignment());
        this.h = $$0.createBuffer(() -> "Lighting UBO", 136, this.i * (long)fyd$a.values().length);
        Matrix4f $$1 = new Matrix4f().rotationY(-0.3926991f).rotateX(2.3561945f);
        this.a(fyd$a.b, $$1.transformDirection((Vector3fc)b, new Vector3f()), $$1.transformDirection((Vector3fc)c, new Vector3f()));
        Matrix4f $$2 = new Matrix4f().scaling(1.0f, -1.0f, 1.0f).rotateYXZ(1.0821041f, 3.2375858f, 0.0f).rotateYXZ(-0.3926991f, 2.3561945f, 0.0f);
        this.a(fyd$a.c, $$2.transformDirection((Vector3fc)b, new Vector3f()), $$2.transformDirection((Vector3fc)c, new Vector3f()));
        this.a(fyd$a.d, f, g);
        Matrix4f $$3 = new Matrix4f();
        this.a(fyd$a.e, $$3.transformDirection((Vector3fc)f, new Vector3f()), $$3.transformDirection((Vector3fc)g, new Vector3f()));
    }

    public void a(esh.a $$0) {
        switch ($$0) {
            case a: {
                this.a(fyd$a.a, b, c);
                break;
            }
            case b: {
                this.a(fyd$a.a, d, e);
            }
        }
    }

    private void a(a $$0, Vector3f $$1, Vector3f $$2) {
        try (MemoryStack $$3 = MemoryStack.stackPush();){
            ByteBuffer $$4 = Std140Builder.onStack($$3, a).putVec3((Vector3fc)$$1).putVec3((Vector3fc)$$2).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.h.slice((long)$$0.ordinal() * this.i, this.i), $$4);
        }
    }

    public void a(a $$0) {
        RenderSystem.setShaderLights(this.h.slice((long)$$0.ordinal() * this.i, a));
    }

    @Override
    public void close() {
        this.h.close();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = fyd$a.a();
        }
    }
}

