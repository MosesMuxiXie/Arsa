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

public class fqo
extends fpq {
    public static final MapCodec<fqo> a = RecordCodecBuilder.mapCodec($$02 -> fqo.a($$02).and((App)dnp.a.fieldOf("id").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fqo::new));
    private final jd<dnp> b;

    private fqo(List<frm> $$0, jd<dnp> $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fqo> a() {
        return fpt.F;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        $$0.a(ki.Y, dnr.a, this.b, dnr::b);
        return $$0;
    }

    public static fpq.a<?> a(jd<dnp> $$0) {
        return fqo.a((List<frm> $$1) -> new fqo((List<frm>)$$1, $$0));
    }
}

