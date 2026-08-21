/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBTimerQuery
 *  org.lwjgl.opengl.GL32C
 */
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalLong;
import org.lwjgl.opengl.ARBTimerQuery;
import org.lwjgl.opengl.GL32C;

public class fxn
implements GpuQuery {
    private final int a;
    private boolean b;
    private OptionalLong c = OptionalLong.empty();

    fxn(int $$0) {
        this.a = $$0;
    }

    @Override
    public OptionalLong getValue() {
        RenderSystem.assertOnRenderThread();
        if (this.b) {
            throw new IllegalStateException("GlTimerQuery is closed");
        }
        if (this.c.isPresent()) {
            return this.c;
        }
        if (GL32C.glGetQueryObjecti((int)this.a, (int)34919) == 1) {
            this.c = OptionalLong.of(ARBTimerQuery.glGetQueryObjecti64((int)this.a, (int)34918));
            return this.c;
        }
        return OptionalLong.empty();
    }

    @Override
    public void close() {
        RenderSystem.assertOnRenderThread();
        if (this.b) {
            return;
        }
        this.b = true;
        GL32C.glDeleteQueries((int)this.a);
    }
}

