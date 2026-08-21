/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fqg
extends fpq {
    public static final MapCodec<fqg> a = RecordCodecBuilder.mapCodec($$02 -> fqg.a($$02).and($$02.group((App)fpp.e.a(dok.c, 256).optionalFieldOf("explosions").forGetter($$0 -> $$0.c), (App)bfm.p.optionalFieldOf("flight_duration").forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fqg::new));
    public static final dol b = new dol(0, List.of());
    private final Optional<fpp.e<dok>> c;
    private final Optional<Integer> d;

    protected fqg(List<frm> $$0, Optional<fpp.e<dok>> $$1, Optional<Integer> $$2) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        $$0.a(ki.aq, b, this::a);
        return $$0;
    }

    private dol a(dol $$0) {
        return new dol(this.d.orElseGet($$0::a), this.c.map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
    }

    public fps<fqg> a() {
        return fpt.K;
    }
}

