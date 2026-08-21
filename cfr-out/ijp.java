/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.jspecify.annotations.Nullable;

public class ijp {
    private final String d;
    private final @Nullable Consumer<Matrix4fStack> e;
    public static final ijp a = new ijp("no_layering", null);
    public static final ijp b = new ijp("view_offset_z_layering", $$0 -> RenderSystem.getProjectionType().a((Matrix4f)$$0, 1.0f));
    public static final ijp c = new ijp("view_offset_z_layering_forward", $$0 -> RenderSystem.getProjectionType().a((Matrix4f)$$0, -1.0f));

    public ijp(String $$0, @Nullable Consumer<Matrix4fStack> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public String toString() {
        return "LayeringTransform[" + this.d + "]";
    }

    public @Nullable Consumer<Matrix4fStack> a() {
        return this.e;
    }
}

