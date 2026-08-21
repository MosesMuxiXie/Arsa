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

public class fqh
extends fpq {
    public static final MapCodec<fqh> a = RecordCodecBuilder.mapCodec($$02 -> fqh.a($$02).and((App)bef.b(mj.bi).fieldOf("options").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fqh::new));
    private final bef<dlm> b;

    private fqh(List<frm> $$0, bef<dlm> $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fqh> a() {
        return fpt.G;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        jq<dlm> $$2 = $$1.d().J_().f(mj.bi);
        Optional $$3 = $$2.a(this.b, $$1.b());
        if ($$3.isPresent()) {
            $$0.b(ki.ai, new dom((jd)$$3.get()));
        }
        return $$0;
    }

    public static fpq.a<?> a(bef<dlm> $$0) {
        return fqh.a((List<frm> $$1) -> new fqh((List<frm>)$$1, $$0));
    }
}

