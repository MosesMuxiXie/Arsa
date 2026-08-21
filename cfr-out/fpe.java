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

public class fpe
extends fpq {
    public static final MapCodec<fpe> a = RecordCodecBuilder.mapCodec($$02 -> fpe.a($$02).and((App)foa.h.fieldOf("source").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fpe::new));
    private final foa<Object> b;

    private fpe(List<frm> $$0, foa<?> $$1) {
        super($$0);
        this.b = foa.a($$1);
    }

    public fps<fpe> a() {
        return fpt.s;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(this.b.a());
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        Object $$2 = this.b.a($$1);
        if ($$2 instanceof cdg) {
            cdg $$3 = (cdg)$$2;
            $$0.b(ki.h, $$3.as());
        }
        return $$0;
    }

    public static fpq.a<?> a(foa<?> $$0) {
        return fpe.a((List<frm> $$1) -> new fpe((List<frm>)$$1, $$0));
    }
}

