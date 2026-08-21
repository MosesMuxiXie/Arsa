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
import java.util.Set;

public class fpo
extends fpq {
    public static final MapCodec<fpo> a = RecordCodecBuilder.mapCodec($$02 -> fpo.a($$02).and((App)fny.a.fieldOf("limit").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fpo::new));
    private final fny b;

    private fpo(List<frm> $$0, fny $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fpo> a() {
        return fpt.w;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.a();
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        int $$2 = this.b.a($$1, $$0.N());
        $$0.e($$2);
        return $$0;
    }

    public static fpq.a<?> a(fny $$0) {
        return fpo.a((List<frm> $$1) -> new fpo((List<frm>)$$1, $$0));
    }
}

