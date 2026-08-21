/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.server.MinecraftServer;

public record fsv(amo b) implements fsx<MinecraftServer>
{
    public static final MapCodec<fsv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("Name").forGetter(fsv::b)).apply((Applicative)$$0, fsv::new));

    @Override
    public void a(MinecraftServer $$0, fsz<MinecraftServer> $$12, long $$2) {
        ani $$3 = $$0.aC();
        $$3.a(this.b).ifPresent($$1 -> $$3.a((ht<ed>)$$1, $$3.c()));
    }

    @Override
    public MapCodec<fsv> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsv.class, "functionId", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsv.class, "functionId", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsv.class, "functionId", "b"}, this, $$0);
    }
}

