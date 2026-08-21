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
import java.util.stream.Stream;

public class fan
implements fac {
    public static final Codec<fan> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fes.b.fieldOf("feature_true").forGetter($$0 -> $$0.b), (App)fes.b.fieldOf("feature_false").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fan::new));
    public final jd<fes> b;
    public final jd<fes> c;

    public fan(jd<fes> $$0, jd<fes> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public Stream<exi<?, ?>> e() {
        return Stream.concat(this.b.a().a(), this.c.a().a());
    }
}

