/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.JsonOps
 *  io.netty.buffer.ByteBuf
 */
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aks(yh b) implements aay<ako>
{
    private static final ams<JsonElement> c = jr.b.a(JsonOps.INSTANCE);
    public static final aao<ByteBuf, aks> a = aao.a(aam.f(262144).a(aam.a(c, yj.a)), aks::b, aks::new);

    @Override
    public aba<aks> a() {
        return aku.e;
    }

    @Override
    public void a(ako $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aks.class, "reason", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aks.class, "reason", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aks.class, "reason", "b"}, this, $$0);
    }
}

