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
import java.util.Optional;

public class fpy
extends fpq {
    public static final MapCodec<fpy> a = RecordCodecBuilder.mapCodec($$02 -> fpy.a($$02).and($$02.group((App)axx.a(Codec.string((int)0, (int)32)).optionalFieldOf("title").forGetter($$0 -> $$0.c), (App)Codec.STRING.optionalFieldOf("author").forGetter($$0 -> $$0.b), (App)bfm.a(0, 3).optionalFieldOf("generation").forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fpy::new));
    private final Optional<String> b;
    private final Optional<axx<String>> c;
    private final Optional<Integer> d;

    public fpy(List<frm> $$0, Optional<axx<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
        super($$0);
        this.b = $$2;
        this.c = $$1;
        this.d = $$3;
    }

    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        $$0.a(ki.ac, dpl.a, this::a);
        return $$0;
    }

    private dpl a(dpl $$0) {
        return new dpl(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
    }

    public fps<fpy> a() {
        return fpt.M;
    }
}

