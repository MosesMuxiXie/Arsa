/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;

public class fxk
implements AutoCloseable {
    private static final int b = -1;
    public static final fxk a = new fxk(-1, amo.b("invalid"), ShaderType.VERTEX);
    private final amo c;
    private int d;
    private final ShaderType e;

    public fxk(int $$0, amo $$1, ShaderType $$2) {
        this.c = $$1;
        this.d = $$0;
        this.e = $$2;
    }

    @Override
    public void close() {
        if (this.d == -1) {
            throw new IllegalStateException("Already closed");
        }
        RenderSystem.assertOnRenderThread();
        GlStateManager.glDeleteShader(this.d);
        this.d = -1;
    }

    public amo a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.e.idConverter().a(this.c).toString();
    }
}

