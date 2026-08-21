/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import org.jspecify.annotations.Nullable;

public class fxu
extends fxt {
    public fxu(@Nullable String $$0, int $$1, int $$2, boolean $$3) {
        super($$0, $$3);
        RenderSystem.assertOnRenderThread();
        this.a($$1, $$2);
    }
}

