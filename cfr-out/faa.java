/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class faa
implements fac {
    public static final Codec<faa> a = RecordCodecBuilder.create($$02 -> $$02.group((App)is.a.optionalFieldOf("exit").forGetter($$0 -> $$0.b), (App)Codec.BOOL.fieldOf("exact").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, faa::new));
    private final Optional<is> b;
    private final boolean c;

    private faa(Optional<is> $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static faa a(is $$0, boolean $$1) {
        return new faa(Optional.of($$0), $$1);
    }

    public static faa a() {
        return new faa(Optional.empty(), false);
    }

    public Optional<is> b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}

