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

public class fqk
extends fpq {
    public static final MapCodec<fqk> a = RecordCodecBuilder.mapCodec($$02 -> fqk.a($$02).and((App)dlp.e.fieldOf("item").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fqk::new));
    private final jd<dlp> b;

    private fqk(List<frm> $$0, jd<dlp> $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fqk> a() {
        return fpt.f;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        return $$0.a((dwn)this.b.a());
    }
}

