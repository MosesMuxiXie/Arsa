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

public class fqb
extends fpq {
    public static final MapCodec<fqb> a = RecordCodecBuilder.mapCodec($$02 -> fqb.a($$02).and($$02.group((App)fof.a.fieldOf("name").forGetter($$0 -> $$0.b), (App)Codec.LONG.optionalFieldOf("seed", (Object)0L).forGetter($$0 -> $$0.c), (App)mi.k.r().fieldOf("type").forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fqb::new));
    private final amt<fof> b;
    private final long c;
    private final jd<eld<?>> d;

    private fqb(List<frm> $$0, amt<fof> $$1, long $$2, jd<eld<?>> $$3) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public fps<fqb> a() {
        return fpt.y;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        if ($$0.f()) {
            return $$0;
        }
        $$0.b(ki.aA, new doz(this.b, this.c));
        return $$0;
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        if (!$$0.b()) {
            $$0.a(new fog.d(this.b));
            return;
        }
        if ($$0.a().c(this.b).isEmpty()) {
            $$0.a(new fog.a(this.b));
        }
    }

    public static fpq.a<?> a(eld<?> $$0, amt<fof> $$1) {
        return fqb.a((List<frm> $$2) -> new fqb((List<frm>)$$2, $$1, 0L, (jd<eld<?>>)$$0.a()));
    }

    public static fpq.a<?> a(eld<?> $$0, amt<fof> $$1, long $$2) {
        return fqb.a((List<frm> $$3) -> new fqb((List<frm>)$$3, $$1, $$2, (jd<eld<?>>)$$0.a()));
    }
}

