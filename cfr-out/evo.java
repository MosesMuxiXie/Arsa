/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.StringUtils
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class evo {
    public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(evo::c), (App)Codec.BOOL.fieldOf("generate_features").orElse((Object)true).stable().forGetter(evo::d), (App)Codec.BOOL.fieldOf("bonus_chest").orElse((Object)false).stable().forGetter(evo::e), (App)Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter($$0 -> $$0.f)).apply((Applicative)$$02, $$02.stable(evo::new)));
    public static final evo b = new evo("North Carolina".hashCode(), true, true);
    private final long c;
    private final boolean d;
    private final boolean e;
    private final Optional<String> f;

    public evo(long $$0, boolean $$1, boolean $$2) {
        this($$0, $$1, $$2, Optional.empty());
    }

    public static evo a() {
        return new evo(evo.g(), true, false);
    }

    public static evo b() {
        return new evo(evo.g(), false, false);
    }

    private evo(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public long c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f.isPresent();
    }

    public evo a(boolean $$0) {
        return new evo(this.c, this.d, $$0, this.f);
    }

    public evo b(boolean $$0) {
        return new evo(this.c, $$0, this.e, this.f);
    }

    public evo a(OptionalLong $$0) {
        return new evo($$0.orElse(evo.g()), this.d, this.e, this.f);
    }

    public static OptionalLong a(String $$0) {
        if (StringUtils.isEmpty((CharSequence)($$0 = $$0.trim()))) {
            return OptionalLong.empty();
        }
        try {
            return OptionalLong.of(Long.parseLong($$0));
        }
        catch (NumberFormatException $$1) {
            return OptionalLong.of($$0.hashCode());
        }
    }

    public static long g() {
        return bgr.a().g();
    }
}

