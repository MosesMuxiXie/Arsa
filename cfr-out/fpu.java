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

public class fpu
extends fpq {
    public static final MapCodec<fpu> a = RecordCodecBuilder.mapCodec($$02 -> fpu.a($$02).and($$02.group((App)fnx.e.fieldOf("component").forGetter($$0 -> $$0.b), (App)fpt.c.fieldOf("modifier").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fpu::new));
    private final fnw<?> b;
    private final fpr c;

    private fpu(List<frm> $$0, fnw<?> $$1, fpr $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    public fps<fpu> a() {
        return fpt.u;
    }

    @Override
    public dlt a(dlt $$0, fnz $$12) {
        if ($$0.f()) {
            return $$0;
        }
        this.b.a($$0, $$1 -> (dlt)this.c.apply($$1, $$12));
        return $$0;
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        this.c.a($$0.a(new bgp.c("modifier")));
    }
}

