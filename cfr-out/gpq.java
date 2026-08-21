/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class gpq
extends Record {
    private final @Nullable GpuTextureView a;
    private final @Nullable GpuTextureView b;
    private final @Nullable GpuTextureView c;
    private final @Nullable fzf d;
    private final @Nullable fzf e;
    private final @Nullable fzf f;
    private static final gpq g = new gpq(null, null, null, null, null, null);
    private static int h;

    public gpq(@Nullable GpuTextureView $$0, @Nullable GpuTextureView $$1, @Nullable GpuTextureView $$2, @Nullable fzf $$3, @Nullable fzf $$4, @Nullable fzf $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
    }

    public static gpq a(GpuTextureView $$0, fzf $$1) {
        return new gpq($$0, null, null, $$1, null, null);
    }

    public static gpq b(GpuTextureView $$0, fzf $$1) {
        return new gpq($$0, null, gfj.V().i.q().a(), $$1, null, RenderSystem.getSamplerCache().a(FilterMode.LINEAR));
    }

    public static gpq a(GpuTextureView $$0, fzf $$1, GpuTextureView $$2, fzf $$3) {
        return new gpq($$0, $$2, null, $$1, $$3, null);
    }

    public static gpq a() {
        return g;
    }

    public int b() {
        return w.x ? this.hashCode() * (h + 1) : this.hashCode();
    }

    public static void c() {
        h = Math.round(100000.0f * (float)Math.random());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gpq.class, "texure0;texure1;texure2;sampler0;sampler1;sampler2", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gpq.class, "texure0;texure1;texure2;sampler0;sampler1;sampler2", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gpq.class, "texure0;texure1;texure2;sampler0;sampler1;sampler2", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public @Nullable GpuTextureView d() {
        return this.a;
    }

    public @Nullable GpuTextureView e() {
        return this.b;
    }

    public @Nullable GpuTextureView f() {
        return this.c;
    }

    public @Nullable fzf g() {
        return this.d;
    }

    public @Nullable fzf h() {
        return this.e;
    }

    public @Nullable fzf i() {
        return this.f;
    }
}

