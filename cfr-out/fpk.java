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

public class fpk
extends fpq {
    public static final MapCodec<fpk> a = RecordCodecBuilder.mapCodec($$02 -> fpk.a($$02).and((App)fnz.c.g.fieldOf("entity").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fpk::new));
    private final fnz.c b;

    public fpk(List<frm> $$0, fnz.c $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fpk> a() {
        return fpt.B;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(this.b.a());
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        cgk cgk2;
        if ($$0.a(dlx.wz) && (cgk2 = $$1.c(this.b.a())) instanceof ddm) {
            ddm $$2 = (ddm)cgk2;
            $$0.b(ki.ar, doy.a($$2.gI()));
        }
        return $$0;
    }

    public static fpq.a<?> a(fnz.c $$0) {
        return fpk.a((List<frm> $$1) -> new fpk((List<frm>)$$1, $$0));
    }
}

