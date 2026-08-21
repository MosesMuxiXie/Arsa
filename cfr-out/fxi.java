/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record fxi(RenderPipeline a, fxg b) implements CompiledRenderPipeline
{
    @Override
    public boolean isValid() {
        return this.b != fxg.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fxi.class, "info;program", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fxi.class, "info;program", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fxi.class, "info;program", "a", "b"}, this, $$0);
    }
}

