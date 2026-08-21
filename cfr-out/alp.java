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

public record alp(alq b) implements aay<alo>
{
    private static final ams<JsonElement> c = jr.b.a(JsonOps.INSTANCE);
    public static final aao<ByteBuf, alp> a = aao.a(aam.f(Short.MAX_VALUE).a(aam.a(c, alq.a)), alp::b, alp::new);

    @Override
    public aba<alp> a() {
        return alt.a;
    }

    @Override
    public void a(alo $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{alp.class, "status", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{alp.class, "status", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{alp.class, "status", "b"}, this, $$0);
    }
}

