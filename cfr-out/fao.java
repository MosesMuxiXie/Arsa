/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class fao
implements fac {
    public static final Codec<fao> a = RecordCodecBuilder.create($$02 -> $$02.apply2(fao::new, (App)ezr.a.listOf().fieldOf("features").forGetter($$0 -> $$0.b), (App)fes.b.fieldOf("default").forGetter($$0 -> $$0.c)));
    public final List<ezr> b;
    public final jd<fes> c;

    public fao(List<ezr> $$0, jd<fes> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public Stream<exi<?, ?>> e() {
        return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
    }
}

