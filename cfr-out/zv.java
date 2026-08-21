/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public record zv(String b, @Nullable gv c) implements zt
{
    public static final MapCodec<zv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("entity").forGetter(zv::b)).apply((Applicative)$$0, zv::new));

    public zv(String $$0) {
        this($$0, zv.a($$0));
    }

    private static @Nullable gv a(String $$0) {
        try {
            gw $$1 = new gw(new StringReader($$0), true);
            return $$1.t();
        }
        catch (CommandSyntaxException $$2) {
            return null;
        }
    }

    @Override
    public Stream<uz> a(ed $$0) throws CommandSyntaxException {
        if (this.c != null) {
            List<? extends cgk> $$1 = this.c.b($$0);
            return $$1.stream().map(ct::b);
        }
        return Stream.empty();
    }

    public MapCodec<zv> a() {
        return a;
    }

    @Override
    public String toString() {
        return "entity=" + this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof zv)) return false;
        zv $$1 = (zv)$$0;
        if (!this.b.equals($$1.b)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}

