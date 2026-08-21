/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public final class zo
extends Record
implements yi {
    private final Either<gx, String> c;
    private final String d;
    public static final MapCodec<zo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.either(gx.a, (Codec)Codec.STRING).fieldOf("name").forGetter(zo::b), (App)Codec.STRING.fieldOf("objective").forGetter(zo::c)).apply((Applicative)$$0, zo::new));
    public static final MapCodec<zo> b = a.fieldOf("score");

    public zo(Either<gx, String> $$0, String $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public MapCodec<zo> a() {
        return b;
    }

    private fuq a(ed $$0) throws CommandSyntaxException {
        Optional $$1 = this.c.left();
        if ($$1.isPresent()) {
            List<? extends cgk> $$2 = ((gx)$$1.get()).b().b($$0);
            if (!$$2.isEmpty()) {
                if ($$2.size() != 1) {
                    throw eq.a.create();
                }
                return $$2.getFirst();
            }
            return fuq.c(((gx)$$1.get()).a());
        }
        return fuq.c((String)this.c.right().orElseThrow());
    }

    private yw a(fuq $$0, ed $$1) {
        fun $$5;
        anm $$3;
        fuj $$4;
        MinecraftServer $$2 = $$1.m();
        if ($$2 != null && ($$4 = ($$3 = $$2.aK()).a(this.d)) != null && ($$5 = $$3.d($$0, $$4)) != null) {
            return $$5.a($$4.a(aaj.b));
        }
        return yh.i();
    }

    @Override
    public yw a(@Nullable ed $$0, @Nullable cgk $$1, int $$2) throws CommandSyntaxException {
        if ($$0 == null) {
            return yh.i();
        }
        fuq $$3 = this.a($$0);
        fuq $$4 = $$1 != null && $$3.equals(fuq.cT) ? $$1 : $$3;
        return this.a($$4, $$0);
    }

    @Override
    public String toString() {
        return "score{name='" + String.valueOf(this.c) + "', objective='" + this.d + "'}";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zo.class, "name;objective", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zo.class, "name;objective", "c", "d"}, this, $$0);
    }

    public Either<gx, String> b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}

