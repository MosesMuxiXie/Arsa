/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class zj
implements yi {
    public static final MapCodec<zj> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.STRING.fieldOf("keybind").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, zj::new));
    private final String b;
    private @Nullable Supplier<yh> c;

    public zj(String $$0) {
        this.b = $$0;
    }

    private yh c() {
        if (this.c == null) {
            this.c = zk.a.apply(this.b);
        }
        return this.c.get();
    }

    @Override
    public <T> Optional<T> a(yn.a<T> $$0) {
        return this.c().a($$0);
    }

    @Override
    public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
        return this.c().a($$0, $$1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof zj)) return false;
        zj $$1 = (zj)$$0;
        if (!this.b.equals($$1.b)) return false;
        return true;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "keybind{" + this.b + "}";
    }

    public String b() {
        return this.b;
    }

    public MapCodec<zj> a() {
        return a;
    }
}

