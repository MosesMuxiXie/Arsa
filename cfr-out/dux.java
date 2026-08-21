/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public abstract class dux
implements dvf {
    protected final List<dvf> a;
    private final Function<fnz, dve> b;

    protected dux(List<dvf> $$0) {
        this.a = $$0;
        this.b = dvg.a($$0);
    }

    protected static <T extends dux> MapCodec<T> a(Function<List<dvf>, T> $$0) {
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)dvg.b.listOf().fieldOf("terms").forGetter($$0 -> $$0.a)).apply((Applicative)$$1, $$0));
    }

    protected static <T extends dux> Codec<T> b(Function<List<dvf>, T> $$02) {
        return dvg.b.listOf().xmap($$02, $$0 -> $$0.a);
    }

    public abstract MapCodec<? extends dux> a();

    @Override
    public dve a(fnz $$0) {
        return this.b.apply($$0);
    }

    @Override
    public void a(fog $$0) {
        dvf.super.a($$0);
        for (int $$1 = 0; $$1 < this.a.size(); ++$$1) {
            this.a.get($$1).a($$0.a(new bgp.d("terms", $$1)));
        }
    }
}

