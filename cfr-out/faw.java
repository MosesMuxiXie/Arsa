/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class faw
implements fac {
    public static final Codec<faw> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.BOOL.fieldOf("crystal_invulnerable").orElse((Object)false).forGetter($$0 -> $$0.b), (App)ezh.a.a.listOf().fieldOf("spikes").forGetter($$0 -> $$0.c), (App)is.a.optionalFieldOf("crystal_beam_target").forGetter($$0 -> Optional.ofNullable($$0.d))).apply((Applicative)$$02, faw::new));
    private final boolean b;
    private final List<ezh.a> c;
    private final @Nullable is d;

    public faw(boolean $$0, List<ezh.a> $$1, @Nullable is $$2) {
        this($$0, $$1, Optional.ofNullable($$2));
    }

    private faw(boolean $$0, List<ezh.a> $$1, Optional<is> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2.orElse(null);
    }

    public boolean a() {
        return this.b;
    }

    public List<ezh.a> b() {
        return this.c;
    }

    public @Nullable is c() {
        return this.d;
    }
}

