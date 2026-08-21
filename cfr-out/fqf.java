/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class fqf
extends fpq {
    public static final MapCodec<fqf> a = RecordCodecBuilder.mapCodec($$02 -> fqf.a($$02).and($$02.group((App)dok.a.g.optionalFieldOf("shape").forGetter($$0 -> $$0.c), (App)dok.b.optionalFieldOf("colors").forGetter($$0 -> $$0.d), (App)dok.b.optionalFieldOf("fade_colors").forGetter($$0 -> $$0.e), (App)Codec.BOOL.optionalFieldOf("trail").forGetter($$0 -> $$0.f), (App)Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0 -> $$0.h))).apply((Applicative)$$02, fqf::new));
    public static final dok b = new dok(dok.a.a, IntList.of(), IntList.of(), false, false);
    final Optional<dok.a> c;
    final Optional<IntList> d;
    final Optional<IntList> e;
    final Optional<Boolean> f;
    final Optional<Boolean> h;

    public fqf(List<frm> $$0, Optional<dok.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.h = $$5;
    }

    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        $$0.a(ki.ap, b, this::a);
        return $$0;
    }

    private dok a(dok $$0) {
        return new dok(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
    }

    public fps<fqf> a() {
        return fpt.L;
    }
}

