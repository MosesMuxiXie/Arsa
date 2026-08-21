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

public class fqq
extends fpq {
    public static final MapCodec<fqq> a = RecordCodecBuilder.mapCodec($$02 -> fqq.a($$02).and($$02.group((App)dpk.d.fieldOf("pages").forGetter($$0 -> $$0.b), (App)fpp.a(100).forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fqq::new));
    private final List<axx<String>> b;
    private final fpp c;

    protected fqq(List<frm> $$0, List<axx<String>> $$1, fpp $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        $$0.a(ki.ab, dpk.a, this::a);
        return $$0;
    }

    public dpk a(dpk $$0) {
        List<axx<String>> $$1 = this.c.a($$0.a(), this.b, 100);
        return $$0.b($$1);
    }

    public fps<fqq> a() {
        return fpt.O;
    }
}

