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

public class fqc
extends fpq {
    public static final MapCodec<fqc> a = RecordCodecBuilder.mapCodec($$02 -> fqc.a($$02).and((App)wa.f.fieldOf("tag").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fqc::new));
    private final uz b;

    private fqc(List<frm> $$0, uz $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fqc> a() {
        return fpt.j;
    }

    @Override
    public dlt a(dlt $$02, fnz $$1) {
        doe.a(ki.b, $$02, (uz $$0) -> $$0.a(this.b));
        return $$02;
    }

    @Deprecated
    public static fpq.a<?> a(uz $$0) {
        return fqc.a((List<frm> $$1) -> new fqc((List<frm>)$$1, $$0));
    }
}

