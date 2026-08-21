/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fqr
extends fpq {
    public static final MapCodec<fqr> a = RecordCodecBuilder.mapCodec($$02 -> fqr.a($$02).and($$02.group((App)dpl.h.fieldOf("pages").forGetter($$0 -> $$0.b), (App)fpp.a.forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fqr::new));
    private final List<axx<yh>> b;
    private final fpp c;

    protected fqr(List<frm> $$0, List<axx<yh>> $$1, fpp $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        $$0.a(ki.ac, dpl.a, this::a);
        return $$0;
    }

    @VisibleForTesting
    public dpl a(dpl $$0) {
        List<axx<yh>> $$1 = this.c.a($$0.a(), this.b);
        return $$0.b($$1);
    }

    public fps<fqr> a() {
        return fpt.N;
    }
}

