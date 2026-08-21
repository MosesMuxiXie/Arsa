/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record akt(GameProfile b) implements aay<ako>
{
    public static final aao<ByteBuf, akt> a = aao.a(aam.A, akt::b, akt::new);

    @Override
    public aba<akt> a() {
        return aku.b;
    }

    @Override
    public void a(ako $$0) {
        $$0.a(this);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{akt.class, "gameProfile", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{akt.class, "gameProfile", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{akt.class, "gameProfile", "b"}, this, $$0);
    }
}

