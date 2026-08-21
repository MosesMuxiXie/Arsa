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
import java.util.List;
import net.minecraft.server.MinecraftServer;

public record fsw(amo b) implements fsx<MinecraftServer>
{
    public static final MapCodec<fsw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("Name").forGetter(fsw::b)).apply((Applicative)$$0, fsw::new));

    @Override
    public void a(MinecraftServer $$0, fsz<MinecraftServer> $$1, long $$2) {
        ani $$3 = $$0.aC();
        List<ht<ed>> $$4 = $$3.b(this.b);
        for (ht<ed> $$5 : $$4) {
            $$3.a($$5, $$3.c());
        }
    }

    @Override
    public MapCodec<fsw> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsw.class, "tagId", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsw.class, "tagId", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsw.class, "tagId", "b"}, this, $$0);
    }
}

