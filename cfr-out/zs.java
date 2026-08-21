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
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public record zs(String b, @Nullable ge c) implements zt
{
    public static final MapCodec<zs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("block").forGetter(zs::b)).apply((Applicative)$$0, zs::new));

    public zs(String $$0) {
        this($$0, zs.a($$0));
    }

    private static @Nullable ge a(String $$0) {
        try {
            return gc.a().a(new StringReader($$0));
        }
        catch (CommandSyntaxException $$1) {
            return null;
        }
    }

    @Override
    public Stream<uz> a(ed $$0) {
        elb $$3;
        is $$2;
        axf $$1;
        if (this.c != null && ($$1 = $$0.f()).t($$2 = this.c.c($$0)) && ($$3 = $$1.c_($$2)) != null) {
            return Stream.of($$3.b($$0.v()));
        }
        return Stream.empty();
    }

    public MapCodec<zs> a() {
        return a;
    }

    @Override
    public String toString() {
        return "block=" + this.b;
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
        if (!($$0 instanceof zs)) return false;
        zs $$1 = (zs)$$0;
        if (!this.b.equals($$1.b)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}

